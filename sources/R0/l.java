package R0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Phaser;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class l implements AutoCloseable {

    /* renamed from: h, reason: collision with root package name */
    public static final int f1874h = Math.min(32, Runtime.getRuntime().availableProcessors());

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f1875e;

    /* renamed from: f, reason: collision with root package name */
    public final MessageDigest f1876f;

    /* renamed from: g, reason: collision with root package name */
    public final ExecutorService f1877g;

    public l(byte[] bArr) {
        int i3 = f1874h;
        this.f1877g = new ThreadPoolExecutor(i3, i3, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(4), new ThreadPoolExecutor.CallerRunsPolicy());
        this.f1875e = bArr;
        this.f1876f = i();
    }

    public static /* synthetic */ void a(l lVar, ByteBuffer byteBuffer, int i3, byte[][] bArr, Phaser phaser) {
        MessageDigest c3 = lVar.c();
        int capacity = byteBuffer.capacity();
        int i4 = 0;
        while (i4 < capacity) {
            int i5 = i4 + 4096;
            bArr[i3] = lVar.l(c3, m(byteBuffer, i4, i5));
            i3++;
            i4 = i5;
        }
        phaser.arriveAndDeregister();
    }

    public static int[] b(long j3, int i3) {
        ArrayList arrayList = new ArrayList();
        do {
            j3 = e(j3, 4096L) * i3;
            arrayList.add(Long.valueOf(e(j3, 4096L) * 4096));
        } while (j3 > 4096);
        int[] iArr = new int[arrayList.size() + 1];
        int i4 = 0;
        iArr[0] = 0;
        while (i4 < arrayList.size()) {
            int i5 = i4 + 1;
            iArr[i5] = iArr[i4] + Math.toIntExact(((Long) arrayList.get((arrayList.size() - i4) - 1)).longValue());
            i4 = i5;
        }
        return iArr;
    }

    public static long e(long j3, long j4) {
        return ((j3 + j4) - 1) / j4;
    }

    public static MessageDigest i() {
        return MessageDigest.getInstance("SHA-256");
    }

    public static ByteBuffer m(ByteBuffer byteBuffer, int i3, int i4) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(0);
        duplicate.limit(i4);
        duplicate.position(i3);
        return duplicate.slice();
    }

    public final MessageDigest c() {
        try {
            try {
                return (MessageDigest) this.f1876f.clone();
            } catch (NoSuchAlgorithmException e3) {
                throw new IllegalStateException("Failed to obtain an instance of a previously available message digest", e3);
            }
        } catch (CloneNotSupportedException unused) {
            return i();
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f1877g.shutdownNow();
    }

    public final void d(U0.c cVar, U0.a aVar) {
        long size = cVar.size();
        long j3 = 4096;
        int e3 = (int) e(size, 4096L);
        final byte[][] bArr = new byte[e3][];
        final Phaser phaser = new Phaser(1);
        long j4 = 0;
        final int i3 = 0;
        while (j4 < size) {
            int min = (int) (Math.min(4194304 + j4, size) - j4);
            long j5 = min;
            int e4 = (int) e(j5, j3);
            final ByteBuffer allocate = ByteBuffer.allocate(e4 * 4096);
            cVar.d(j4, min, allocate);
            allocate.rewind();
            Runnable runnable = new Runnable() { // from class: R0.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.a(l.this, allocate, i3, bArr, phaser);
                }
            };
            phaser.register();
            this.f1877g.execute(runnable);
            i3 += e4;
            j4 += j5;
            j3 = 4096;
        }
        phaser.arriveAndAwaitAdvance();
        for (int i4 = 0; i4 < e3; i4++) {
            byte[] bArr2 = bArr[i4];
            aVar.a(bArr2, 0, bArr2.length);
        }
    }

    public ByteBuffer f(U0.c cVar) {
        U0.c b3;
        int digestLength = this.f1876f.getDigestLength();
        int[] b4 = b(cVar.size(), digestLength);
        ByteBuffer allocate = ByteBuffer.allocate(b4[b4.length - 1]);
        for (int length = b4.length - 2; length >= 0; length--) {
            int i3 = length + 1;
            b bVar = new b(m(allocate, b4[length], b4[i3]));
            if (length == b4.length - 2) {
                d(cVar, bVar);
                b3 = cVar;
            } else {
                b3 = U0.d.b(m(allocate.asReadOnlyBuffer(), b4[i3], b4[length + 2]));
                d(b3, bVar);
            }
            int e3 = (int) ((e(b3.size(), 4096L) * digestLength) % 4096);
            if (e3 > 0) {
                int i4 = 4096 - e3;
                bVar.a(new byte[i4], 0, i4);
            }
        }
        return allocate;
    }

    public byte[] g(U0.c cVar) {
        return j(f(cVar));
    }

    public byte[] h(U0.c cVar, U0.c cVar2, U0.c cVar3) {
        if (cVar.size() % 4096 != 0) {
            throw new IllegalStateException("APK Signing Block size not a multiple of 4096: " + cVar.size());
        }
        long size = cVar.size();
        ByteBuffer allocate = ByteBuffer.allocate((int) cVar3.size());
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        cVar3.d(0L, (int) cVar3.size(), allocate);
        allocate.flip();
        T0.c.n(allocate, size);
        return g(new e(cVar, cVar2, U0.d.b(allocate)));
    }

    public byte[] j(ByteBuffer byteBuffer) {
        return k(m(byteBuffer.asReadOnlyBuffer(), 0, 4096));
    }

    public final byte[] k(ByteBuffer byteBuffer) {
        return l(this.f1876f, byteBuffer);
    }

    public final byte[] l(MessageDigest messageDigest, ByteBuffer byteBuffer) {
        messageDigest.reset();
        byte[] bArr = this.f1875e;
        if (bArr != null) {
            messageDigest.update(bArr);
        }
        messageDigest.update(byteBuffer);
        return messageDigest.digest();
    }
}

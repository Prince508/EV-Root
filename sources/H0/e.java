package H0;

import F0.d;
import G0.c;
import H0.e;
import j.AbstractC0515e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.DigestException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f682a = {65, 80, 75, 32, 83, 105, 103, 32, 66, 108, 111, 99, 107, 32, 52, 50};

    /* renamed from: b, reason: collision with root package name */
    public static final H0.i[] f683b = {H0.i.CHUNKED_SHA512, H0.i.VERITY_CHUNKED_SHA256, H0.i.CHUNKED_SHA256};

    public static class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final d f684e;

        /* renamed from: f, reason: collision with root package name */
        public final List f685f;

        /* renamed from: g, reason: collision with root package name */
        public final List f686g;

        /* renamed from: h, reason: collision with root package name */
        public final U0.a f687h;

        @Override // java.lang.Runnable
        public void run() {
            byte[] bArr = new byte[5];
            bArr[0] = -91;
            try {
                d.a aVar = this.f684e.get();
                while (aVar != null) {
                    int i3 = aVar.f697c;
                    if (i3 > 1048576) {
                        throw new RuntimeException("Chunk size greater than expected: " + i3);
                    }
                    e.r(i3, bArr, 1);
                    this.f687h.a(bArr, 0, 5);
                    this.f687h.b(aVar.f696b);
                    for (int i4 = 0; i4 < this.f685f.size(); i4++) {
                        c cVar = (c) this.f685f.get(i4);
                        int digest = ((MessageDigest) this.f686g.get(i4)).digest(cVar.f690c, cVar.g(aVar.f695a), cVar.f689b);
                        if (digest != cVar.f689b) {
                            throw new RuntimeException("Unexpected output size of " + cVar.f688a + " digest: " + digest);
                        }
                    }
                    aVar = this.f684e.get();
                }
            } catch (IOException e3) {
                e = e3;
                throw new RuntimeException(e);
            } catch (DigestException e4) {
                e = e4;
                throw new RuntimeException(e);
            }
        }

        public b(d dVar, List list) {
            this.f684e = dVar;
            this.f685f = list;
            this.f686g = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    this.f686g.add(((c) it.next()).f());
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(e3);
                }
            }
            this.f687h = U0.b.a((MessageDigest[]) this.f686g.toArray(new MessageDigest[0]));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final H0.i f688a;

        /* renamed from: b, reason: collision with root package name */
        public final int f689b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f690c;

        public final MessageDigest f() {
            return MessageDigest.getInstance(this.f688a.h());
        }

        public final int g(int i3) {
            return (i3 * this.f689b) + 5;
        }

        public c(H0.i iVar, int i3) {
            this.f688a = iVar;
            int f3 = iVar.f();
            this.f689b = f3;
            byte[] bArr = new byte[(f3 * i3) + 5];
            this.f690c = bArr;
            bArr[0] = 90;
            e.r(i3, bArr, 1);
        }
    }

    public static class d implements Supplier {

        /* renamed from: a, reason: collision with root package name */
        public final U0.c[] f691a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f692b;

        /* renamed from: c, reason: collision with root package name */
        public final int f693c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f694d;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final int f695a;

            /* renamed from: b, reason: collision with root package name */
            public final ByteBuffer f696b;

            /* renamed from: c, reason: collision with root package name */
            public final int f697c;

            public a(int i3, ByteBuffer byteBuffer, int i4) {
                this.f695a = i3;
                this.f696b = byteBuffer;
                this.f697c = i4;
            }
        }

        @Override // java.util.function.Supplier
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a get() {
            U0.c[] cVarArr;
            int andIncrement = this.f694d.getAndIncrement();
            if (andIncrement < 0 || andIncrement >= this.f693c) {
                return null;
            }
            long j3 = andIncrement;
            int i3 = 0;
            while (true) {
                cVarArr = this.f691a;
                if (i3 >= cVarArr.length) {
                    break;
                }
                int i4 = this.f692b[i3];
                if (j3 < i4) {
                    break;
                }
                j3 -= i4;
                i3++;
            }
            long j4 = j3 * 1048576;
            int min = (int) Math.min(cVarArr[i3].size() - j4, 1048576L);
            ByteBuffer allocate = ByteBuffer.allocate(min);
            try {
                this.f691a[i3].d(j4, min, allocate);
                allocate.rewind();
                return new a(andIncrement, allocate, min);
            } catch (IOException e3) {
                throw new IllegalStateException("Failed to read chunk", e3);
            }
        }

        public d(U0.c[] cVarArr) {
            this.f691a = cVarArr;
            this.f692b = new int[cVarArr.length];
            int i3 = 0;
            for (int i4 = 0; i4 < cVarArr.length; i4++) {
                long l3 = e.l(cVarArr[i4].size(), 1048576L);
                if (l3 > 2147483647L) {
                    throw new RuntimeException(String.format("Number of chunks in dataSource[%d] is greater than max int.", Integer.valueOf(i4)));
                }
                this.f692b[i4] = (int) l3;
                i3 = (int) (i3 + l3);
            }
            this.f693c = i3;
            this.f694d = new AtomicInteger(0);
        }
    }

    /* renamed from: H0.e$e, reason: collision with other inner class name */
    public static class C0017e extends j {
        public C0017e(String str) {
            super(str);
        }
    }

    public static class f extends H0.b {

        /* renamed from: f, reason: collision with root package name */
        public F0.g f698f;

        /* renamed from: g, reason: collision with root package name */
        public final List f699g;

        /* renamed from: h, reason: collision with root package name */
        public final List f700h;

        /* renamed from: i, reason: collision with root package name */
        public final List f701i;

        public static class a extends H0.c {

            /* renamed from: m, reason: collision with root package name */
            public byte[] f707m;

            /* renamed from: n, reason: collision with root package name */
            public int f708n;

            /* renamed from: o, reason: collision with root package name */
            public int f709o;

            /* renamed from: p, reason: collision with root package name */
            public F0.g f710p;

            /* renamed from: h, reason: collision with root package name */
            public List f702h = new ArrayList();

            /* renamed from: i, reason: collision with root package name */
            public Map f703i = new HashMap();

            /* renamed from: j, reason: collision with root package name */
            public List f704j = new ArrayList();

            /* renamed from: k, reason: collision with root package name */
            public Map f705k = new HashMap();

            /* renamed from: l, reason: collision with root package name */
            public List f706l = new ArrayList();

            /* renamed from: q, reason: collision with root package name */
            public final List f711q = new ArrayList();

            /* renamed from: r, reason: collision with root package name */
            public final List f712r = new ArrayList();

            /* renamed from: H0.e$f$a$a, reason: collision with other inner class name */
            public static class C0018a {

                /* renamed from: a, reason: collision with root package name */
                public final int f713a;

                /* renamed from: b, reason: collision with root package name */
                public final byte[] f714b;

                public C0018a(int i3, byte[] bArr) {
                    this.f713a = i3;
                    this.f714b = (byte[]) bArr.clone();
                }

                public int a() {
                    return this.f713a;
                }
            }

            public static class b {

                /* renamed from: a, reason: collision with root package name */
                public final int f715a;

                /* renamed from: b, reason: collision with root package name */
                public final byte[] f716b;

                public b(int i3, byte[] bArr) {
                    this.f715a = i3;
                    this.f716b = bArr;
                }

                public int a() {
                    return this.f715a;
                }

                public byte[] b() {
                    return this.f716b;
                }
            }

            public static class c {

                /* renamed from: a, reason: collision with root package name */
                public final int f717a;

                /* renamed from: b, reason: collision with root package name */
                public final byte[] f718b;

                public c(int i3, byte[] bArr) {
                    this.f717a = i3;
                    this.f718b = bArr;
                }

                public int a() {
                    return this.f717a;
                }
            }

            @Override // H0.c
            public boolean c() {
                return !this.f712r.isEmpty();
            }

            @Override // H0.c
            public boolean d() {
                return !this.f711q.isEmpty();
            }

            @Override // H0.c
            public List e() {
                return this.f712r;
            }

            @Override // H0.c
            public List g() {
                return this.f711q;
            }

            public void h(d.e eVar, Object... objArr) {
                this.f712r.add(new d.f(eVar, objArr));
            }

            public void i(d.e eVar, Object... objArr) {
                this.f711q.add(new d.f(eVar, objArr));
            }
        }

        public f(int i3) {
            super(i3);
            this.f698f = null;
            this.f699g = new ArrayList();
            this.f700h = new ArrayList();
            this.f701i = new ArrayList();
        }

        @Override // H0.b
        public boolean a() {
            if (!this.f701i.isEmpty()) {
                return true;
            }
            if (this.f699g.isEmpty()) {
                return false;
            }
            Iterator it = this.f699g.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).c()) {
                    return true;
                }
            }
            return false;
        }

        @Override // H0.b
        public boolean b() {
            if (!this.f700h.isEmpty()) {
                return true;
            }
            if (this.f699g.isEmpty()) {
                return false;
            }
            Iterator it = this.f699g.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).d()) {
                    return true;
                }
            }
            return false;
        }

        public void c(d.e eVar, Object... objArr) {
            this.f701i.add(new d.f(eVar, objArr));
        }

        public void d(d.e eVar, Object... objArr) {
            this.f700h.add(new d.f(eVar, objArr));
        }

        public List e() {
            return this.f701i;
        }

        public List f() {
            return this.f700h;
        }
    }

    public static class g extends Exception {
        public g(String str) {
            super(str);
        }
    }

    public static class h extends H0.h {
        public h(k kVar, byte[] bArr) {
            super(kVar, bArr);
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public final H0.i f719a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f720b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f721c;

        public i(H0.i iVar, byte[] bArr, byte[] bArr2) {
            this.f719a = iVar;
            this.f720b = bArr;
            this.f721c = bArr2;
        }
    }

    public static /* synthetic */ Runnable a(d dVar, List list) {
        return new b(dVar, list);
    }

    public static void d(ByteBuffer byteBuffer) {
        H0.g.b(byteBuffer);
    }

    public static void e(U0.c cVar, U0.c cVar2, U0.c cVar3, Map map) {
        ByteBuffer i3 = i(true);
        R0.l lVar = new R0.l(new byte[8]);
        try {
            i3.put(lVar.h(cVar, cVar2, cVar3));
            i3.putLong(cVar.size() + cVar2.size() + cVar3.size());
            map.put(H0.i.VERITY_CHUNKED_SHA256, i3.array());
            lVar.close();
        } catch (Throwable th) {
            try {
                lVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static i f(U0.c cVar) {
        ByteBuffer i3 = i(false);
        R0.l lVar = new R0.l(null);
        try {
            ByteBuffer f3 = lVar.f(cVar);
            i3.put(lVar.j(f3));
            i iVar = new i(H0.i.VERITY_CHUNKED_SHA256, i3.array(), f3.array());
            lVar.close();
            return iVar;
        } catch (Throwable th) {
            try {
                lVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static Map g(U0.g gVar, Set set, U0.c cVar, U0.c cVar2, U0.c cVar3) {
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            H0.i iVar = (H0.i) it.next();
            if (iVar == H0.i.CHUNKED_SHA256 || iVar == H0.i.CHUNKED_SHA512) {
                hashSet.add(iVar);
            }
        }
        h(gVar, hashSet, new U0.c[]{cVar, cVar2, cVar3}, hashMap);
        if (set.contains(H0.i.VERITY_CHUNKED_SHA256)) {
            e(cVar, cVar2, cVar3, hashMap);
        }
        return hashMap;
    }

    public static void h(U0.g gVar, Set set, U0.c[] cVarArr, Map map) {
        long j3 = 0;
        for (U0.c cVar : cVarArr) {
            j3 += l(cVar.size(), 1048576L);
        }
        if (j3 > 2147483647L) {
            throw new DigestException("Input too long: " + j3 + " chunks");
        }
        int i3 = (int) j3;
        final ArrayList<c> arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                arrayList.add(new c((H0.i) it.next(), i3));
            }
        }
        final d dVar = new d(cVarArr);
        gVar.b(new U0.h() { // from class: H0.d
            @Override // U0.h
            public final Runnable a() {
                return e.a(e.d.this, arrayList);
            }
        });
        for (c cVar2 : arrayList) {
            map.put(cVar2.f688a, cVar2.f().digest(cVar2.f690c));
        }
    }

    public static ByteBuffer i(boolean z3) {
        int f3 = H0.i.VERITY_CHUNKED_SHA256.f();
        if (z3) {
            f3 += 8;
        }
        ByteBuffer allocate = ByteBuffer.allocate(f3);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        return allocate;
    }

    public static byte[] j(PublicKey publicKey) {
        byte[] bArr = null;
        if ("X.509".equals(publicKey.getFormat())) {
            byte[] encoded = publicKey.getEncoded();
            String algorithm = publicKey.getAlgorithm();
            if ("RSA".equals(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
                try {
                    AbstractC0515e.a(N0.c.s(ByteBuffer.wrap(encoded), S0.b.class));
                    throw null;
                } catch (N0.e | N0.h e3) {
                    System.out.println("Caught a exception encoding the public key: " + e3);
                    e3.printStackTrace();
                }
            } else {
                bArr = encoded;
            }
        }
        if (bArr == null) {
            try {
                bArr = ((X509EncodedKeySpec) KeyFactory.getInstance(publicKey.getAlgorithm()).getKeySpec(publicKey, X509EncodedKeySpec.class)).getEncoded();
            } catch (InvalidKeySpecException e4) {
                throw new InvalidKeyException("Failed to obtain X.509 encoded form of public key " + publicKey + " of class " + publicKey.getClass().getName(), e4);
            }
        }
        if (bArr != null && bArr.length != 0) {
            return bArr;
        }
        throw new InvalidKeyException("Failed to obtain X.509 encoded form of public key " + publicKey + " of class " + publicKey.getClass().getName());
    }

    public static l k(U0.c cVar, c.C0010c c0010c, int i3, f fVar) {
        try {
            return H0.g.g(cVar, c0010c, i3);
        } catch (m e3) {
            throw new g(e3.getMessage());
        }
    }

    public static long l(long j3, long j4) {
        return ((j3 + j4) - 1) / j4;
    }

    public static ByteBuffer m(ByteBuffer byteBuffer) {
        return H0.g.i(byteBuffer);
    }

    public static List n(List list, int i3, int i4) {
        return o(list, i3, i4, false);
    }

    public static List o(List list, int i3, int i4, boolean z3) {
        try {
            return H0.g.j(list, i3, i4, z3);
        } catch (j e3) {
            throw new C0017e(e3.getMessage());
        }
    }

    public static byte[] p(Map map) {
        for (H0.i iVar : f683b) {
            if (map.containsKey(iVar)) {
                return (byte[]) map.get(iVar);
            }
        }
        return null;
    }

    public static byte[] q(ByteBuffer byteBuffer) {
        return H0.g.k(byteBuffer);
    }

    public static void r(int i3, byte[] bArr, int i4) {
        bArr[i4] = (byte) (i3 & 255);
        bArr[i4 + 1] = (byte) ((i3 >> 8) & 255);
        bArr[i4 + 2] = (byte) ((i3 >> 16) & 255);
        bArr[i4 + 3] = (byte) ((i3 >> 24) & 255);
    }

    public static String s(byte[] bArr) {
        return H0.g.m(bArr);
    }

    public static void t(U0.g gVar, U0.c cVar, U0.c cVar2, ByteBuffer byteBuffer, Set set, f fVar) {
        if (set.isEmpty()) {
            throw new RuntimeException("No content digests found");
        }
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        int position = byteBuffer.position();
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.put(byteBuffer);
        allocate.flip();
        byteBuffer.position(position);
        T0.c.n(allocate, cVar.size());
        try {
            Map g3 = g(gVar, set, cVar, cVar2, new R0.a(allocate));
            if (g3.containsKey(H0.i.VERITY_CHUNKED_SHA256)) {
                if (cVar.size() % 4096 != 0) {
                    throw new RuntimeException("APK Signing Block is not aligned on 4k boundary: " + cVar.size());
                }
                long i3 = T0.c.i(byteBuffer) - cVar.size();
                if (i3 % 4096 != 0) {
                    throw new RuntimeException("APK Signing Block size is not multiple of page size: " + i3);
                }
            }
            if (!set.equals(g3.keySet())) {
                throw new RuntimeException("Mismatch between sets of requested and computed content digests . Requested: " + set + ", computed: " + g3.keySet());
            }
            for (f.a aVar : fVar.f699g) {
                for (f.a.b bVar : aVar.f702h) {
                    k f3 = k.f(bVar.a());
                    if (f3 != null) {
                        H0.i g4 = f3.g();
                        if (set.contains(g4)) {
                            byte[] b3 = bVar.b();
                            byte[] bArr = (byte[]) g3.get(g4);
                            if (Arrays.equals(b3, bArr)) {
                                aVar.f703i.put(g4, bArr);
                            } else {
                                int i4 = fVar.f668a;
                                if (i4 == 2) {
                                    aVar.h(d.e.V2_SIG_APK_DIGEST_DID_NOT_VERIFY, g4, s(b3), s(bArr));
                                } else if (i4 == 3) {
                                    aVar.h(d.e.V3_SIG_APK_DIGEST_DID_NOT_VERIFY, g4, s(b3), s(bArr));
                                }
                            }
                        }
                    }
                }
            }
        } catch (DigestException e3) {
            throw new RuntimeException("Failed to compute content digests", e3);
        }
    }
}

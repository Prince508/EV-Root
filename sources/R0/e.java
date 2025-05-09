package R0;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.ToLongFunction;

/* loaded from: classes.dex */
public class e implements U0.c {

    /* renamed from: a, reason: collision with root package name */
    public final U0.c[] f1858a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1859b;

    public e(U0.c... cVarArr) {
        this.f1858a = cVarArr;
        this.f1859b = Arrays.stream(cVarArr).mapToLong(new ToLongFunction() { // from class: R0.d
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                long size;
                size = ((U0.c) obj).size();
                return size;
            }
        }).sum();
    }

    @Override // U0.c
    public void a(long j3, long j4, U0.a aVar) {
        U0.a aVar2;
        if (j3 + j4 > this.f1859b) {
            throw new IndexOutOfBoundsException("Requested more than available");
        }
        U0.c[] cVarArr = this.f1858a;
        int length = cVarArr.length;
        int i3 = 0;
        long j5 = j3;
        long j6 = j4;
        while (i3 < length) {
            U0.c cVar = cVarArr[i3];
            if (j5 >= cVar.size()) {
                j5 -= cVar.size();
                aVar2 = aVar;
            } else {
                long size = cVar.size() - j5;
                if (size >= j6) {
                    cVar.a(j5, j6, aVar);
                    return;
                }
                aVar2 = aVar;
                cVar.a(j5, size, aVar2);
                j6 -= size;
                j5 = 0;
            }
            i3++;
            aVar = aVar2;
        }
    }

    @Override // U0.c
    public U0.c b(long j3, long j4) {
        j f3 = f(j3);
        int intValue = ((Integer) f3.a()).intValue();
        long longValue = ((Long) f3.b()).longValue();
        U0.c cVar = this.f1858a[intValue];
        if (longValue + j4 <= cVar.size()) {
            return cVar.b(longValue, j4);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.b(longValue, cVar.size() - longValue));
        j f4 = f((j3 + j4) - 1);
        int intValue2 = ((Integer) f4.a()).intValue();
        long longValue2 = ((Long) f4.b()).longValue();
        while (true) {
            intValue++;
            if (intValue >= intValue2) {
                arrayList.add(this.f1858a[intValue2].b(0L, longValue2 + 1));
                return new e((U0.c[]) arrayList.toArray(new U0.c[0]));
            }
            arrayList.add(this.f1858a[intValue]);
        }
    }

    @Override // U0.c
    public ByteBuffer c(long j3, int i3) {
        long j4 = i3;
        if (j3 + j4 > this.f1859b) {
            throw new IndexOutOfBoundsException("Requested more than available");
        }
        j f3 = f(j3);
        int intValue = ((Integer) f3.a()).intValue();
        long longValue = ((Long) f3.b()).longValue();
        if (j4 + longValue <= this.f1858a[intValue].size()) {
            return this.f1858a[intValue].c(longValue, i3);
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        while (intValue < this.f1858a.length && allocate.hasRemaining()) {
            this.f1858a[intValue].d(longValue, Math.toIntExact(Math.min(this.f1858a[intValue].size() - longValue, allocate.remaining())), allocate);
            intValue++;
            longValue = 0;
        }
        allocate.rewind();
        return allocate;
    }

    @Override // U0.c
    public void d(long j3, int i3, ByteBuffer byteBuffer) {
        a(j3, i3, new b(byteBuffer));
    }

    public final j f(long j3) {
        int i3 = 0;
        long j4 = j3;
        while (true) {
            U0.c[] cVarArr = this.f1858a;
            if (i3 >= cVarArr.length) {
                throw new IndexOutOfBoundsException("Access is out of bound, offset: " + j3 + ", totalSize: " + this.f1859b);
            }
            if (j4 < cVarArr[i3].size()) {
                return j.c(Integer.valueOf(i3), Long.valueOf(j4));
            }
            j4 -= this.f1858a[i3].size();
            i3++;
        }
    }

    @Override // U0.c
    public long size() {
        return this.f1859b;
    }
}

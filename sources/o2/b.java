package O2;

import java.util.Arrays;
import q2.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: e, reason: collision with root package name */
    public d[] f1606e;

    /* renamed from: f, reason: collision with root package name */
    public int f1607f;

    /* renamed from: g, reason: collision with root package name */
    public int f1608g;

    public final d c() {
        d dVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f1606e;
                if (dVarArr == null) {
                    dVarArr = f(2);
                    this.f1606e = dVarArr;
                } else if (this.f1607f >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    C2.k.d(copyOf, "copyOf(this, newSize)");
                    this.f1606e = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i3 = this.f1608g;
                do {
                    dVar = dVarArr[i3];
                    if (dVar == null) {
                        dVar = e();
                        dVarArr[i3] = dVar;
                    }
                    i3++;
                    if (i3 >= dVarArr.length) {
                        i3 = 0;
                    }
                    C2.k.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVar.a(this));
                this.f1608g = i3;
                this.f1607f++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public abstract d e();

    public abstract d[] f(int i3);

    public final void g(d dVar) {
        int i3;
        s2.e[] b3;
        synchronized (this) {
            try {
                int i4 = this.f1607f - 1;
                this.f1607f = i4;
                if (i4 == 0) {
                    this.f1608g = 0;
                }
                C2.k.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b3 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (s2.e eVar : b3) {
            if (eVar != null) {
                h.a aVar = q2.h.f8868e;
                eVar.u(q2.h.a(q2.n.f8874a));
            }
        }
    }

    public final d[] h() {
        return this.f1606e;
    }
}

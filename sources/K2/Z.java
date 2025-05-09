package K2;

import r2.C0693f;

/* loaded from: classes.dex */
public abstract class Z extends F {

    /* renamed from: g, reason: collision with root package name */
    public long f1181g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1182h;

    /* renamed from: i, reason: collision with root package name */
    public C0693f f1183i;

    public static /* synthetic */ void q(Z z3, boolean z4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i3 & 1) != 0) {
            z4 = false;
        }
        z3.o(z4);
    }

    public static /* synthetic */ void w(Z z3, boolean z4, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i3 & 1) != 0) {
            z4 = false;
        }
        z3.v(z4);
    }

    public abstract long E();

    public final boolean G() {
        T t3;
        C0693f c0693f = this.f1183i;
        if (c0693f == null || (t3 = (T) c0693f.t()) == null) {
            return false;
        }
        t3.run();
        return true;
    }

    public boolean I() {
        return false;
    }

    public abstract void K();

    public final void o(boolean z3) {
        long s3 = this.f1181g - s(z3);
        this.f1181g = s3;
        if (s3 <= 0 && this.f1182h) {
            K();
        }
    }

    public final long s(boolean z3) {
        return z3 ? 4294967296L : 1L;
    }

    public final void t(T t3) {
        C0693f c0693f = this.f1183i;
        if (c0693f == null) {
            c0693f = new C0693f();
            this.f1183i = c0693f;
        }
        c0693f.addLast(t3);
    }

    public long u() {
        C0693f c0693f = this.f1183i;
        return (c0693f == null || c0693f.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void v(boolean z3) {
        this.f1181g += s(z3);
        if (z3) {
            return;
        }
        this.f1182h = true;
    }

    public final boolean x() {
        return this.f1181g >= s(true);
    }

    public final boolean z() {
        C0693f c0693f = this.f1183i;
        if (c0693f != null) {
            return c0693f.isEmpty();
        }
        return true;
    }
}

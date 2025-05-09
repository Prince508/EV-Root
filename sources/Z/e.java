package Z;

import Z.b;

/* loaded from: classes.dex */
public final class e extends b {

    /* renamed from: A, reason: collision with root package name */
    public f f2596A;

    /* renamed from: B, reason: collision with root package name */
    public float f2597B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2598C;

    public e(d dVar) {
        super(dVar);
        this.f2596A = null;
        this.f2597B = Float.MAX_VALUE;
        this.f2598C = false;
    }

    @Override // Z.b
    public void p() {
        u();
        this.f2596A.g(f());
        super.p();
    }

    @Override // Z.b
    public boolean r(long j3) {
        if (this.f2598C) {
            float f3 = this.f2597B;
            if (f3 != Float.MAX_VALUE) {
                this.f2596A.e(f3);
                this.f2597B = Float.MAX_VALUE;
            }
            this.f2579b = this.f2596A.a();
            this.f2578a = 0.0f;
            this.f2598C = false;
            return true;
        }
        if (this.f2597B != Float.MAX_VALUE) {
            this.f2596A.a();
            long j4 = j3 / 2;
            b.p h3 = this.f2596A.h(this.f2579b, this.f2578a, j4);
            this.f2596A.e(this.f2597B);
            this.f2597B = Float.MAX_VALUE;
            b.p h4 = this.f2596A.h(h3.f2592a, h3.f2593b, j4);
            this.f2579b = h4.f2592a;
            this.f2578a = h4.f2593b;
        } else {
            b.p h5 = this.f2596A.h(this.f2579b, this.f2578a, j3);
            this.f2579b = h5.f2592a;
            this.f2578a = h5.f2593b;
        }
        float max = Math.max(this.f2579b, this.f2585h);
        this.f2579b = max;
        float min = Math.min(max, this.f2584g);
        this.f2579b = min;
        if (!t(min, this.f2578a)) {
            return false;
        }
        this.f2579b = this.f2596A.a();
        this.f2578a = 0.0f;
        return true;
    }

    public void s(float f3) {
        if (g()) {
            this.f2597B = f3;
            return;
        }
        if (this.f2596A == null) {
            this.f2596A = new f(f3);
        }
        this.f2596A.e(f3);
        p();
    }

    public boolean t(float f3, float f4) {
        return this.f2596A.c(f3, f4);
    }

    public final void u() {
        f fVar = this.f2596A;
        if (fVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double a3 = fVar.a();
        if (a3 > this.f2584g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (a3 < this.f2585h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public e v(f fVar) {
        this.f2596A = fVar;
        return this;
    }

    @Override // Z.b
    public void o(float f3) {
    }
}

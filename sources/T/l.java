package t;

import t.e;
import u.b;

/* loaded from: classes.dex */
public abstract class l extends j {

    /* renamed from: y0, reason: collision with root package name */
    public int f9504y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    public int f9505z0 = 0;

    /* renamed from: A0, reason: collision with root package name */
    public int f9493A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    public int f9494B0 = 0;

    /* renamed from: C0, reason: collision with root package name */
    public int f9495C0 = 0;

    /* renamed from: D0, reason: collision with root package name */
    public int f9496D0 = 0;

    /* renamed from: E0, reason: collision with root package name */
    public int f9497E0 = 0;

    /* renamed from: F0, reason: collision with root package name */
    public int f9498F0 = 0;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f9499G0 = false;

    /* renamed from: H0, reason: collision with root package name */
    public int f9500H0 = 0;

    /* renamed from: I0, reason: collision with root package name */
    public int f9501I0 = 0;

    /* renamed from: J0, reason: collision with root package name */
    public b.a f9502J0 = new b.a();

    /* renamed from: K0, reason: collision with root package name */
    public b.InterfaceC0158b f9503K0 = null;

    public void K0(boolean z3) {
        int i3 = this.f9495C0;
        if (i3 > 0 || this.f9496D0 > 0) {
            if (z3) {
                this.f9497E0 = this.f9496D0;
                this.f9498F0 = i3;
            } else {
                this.f9497E0 = i3;
                this.f9498F0 = this.f9496D0;
            }
        }
    }

    public void L0() {
        for (int i3 = 0; i3 < this.f9491x0; i3++) {
            e eVar = this.f9490w0[i3];
            if (eVar != null) {
                eVar.q0(true);
            }
        }
    }

    public int M0() {
        return this.f9501I0;
    }

    public int N0() {
        return this.f9500H0;
    }

    public int O0() {
        return this.f9505z0;
    }

    public int P0() {
        return this.f9497E0;
    }

    public int Q0() {
        return this.f9498F0;
    }

    public int R0() {
        return this.f9504y0;
    }

    public abstract void S0(int i3, int i4, int i5, int i6);

    public void T0(e eVar, e.b bVar, int i3, e.b bVar2, int i4) {
        while (this.f9503K0 == null && G() != null) {
            this.f9503K0 = ((f) G()).U0();
        }
        b.a aVar = this.f9502J0;
        aVar.f9531a = bVar;
        aVar.f9532b = bVar2;
        aVar.f9533c = i3;
        aVar.f9534d = i4;
        this.f9503K0.a(eVar, aVar);
        eVar.E0(this.f9502J0.f9535e);
        eVar.h0(this.f9502J0.f9536f);
        eVar.g0(this.f9502J0.f9538h);
        eVar.b0(this.f9502J0.f9537g);
    }

    public boolean U0() {
        e eVar = this.f9350N;
        b.InterfaceC0158b U02 = eVar != null ? ((f) eVar).U0() : null;
        if (U02 == null) {
            return false;
        }
        for (int i3 = 0; i3 < this.f9491x0; i3++) {
            e eVar2 = this.f9490w0[i3];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b s3 = eVar2.s(0);
                e.b s4 = eVar2.s(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s3 != bVar || eVar2.f9385l == 1 || s4 != bVar || eVar2.f9387m == 1) {
                    if (s3 == bVar) {
                        s3 = e.b.WRAP_CONTENT;
                    }
                    if (s4 == bVar) {
                        s4 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.f9502J0;
                    aVar.f9531a = s3;
                    aVar.f9532b = s4;
                    aVar.f9533c = eVar2.P();
                    this.f9502J0.f9534d = eVar2.v();
                    U02.a(eVar2, this.f9502J0);
                    eVar2.E0(this.f9502J0.f9535e);
                    eVar2.h0(this.f9502J0.f9536f);
                    eVar2.b0(this.f9502J0.f9537g);
                }
            }
        }
        return true;
    }

    public boolean V0() {
        return this.f9499G0;
    }

    public void W0(boolean z3) {
        this.f9499G0 = z3;
    }

    public void X0(int i3, int i4) {
        this.f9500H0 = i3;
        this.f9501I0 = i4;
    }

    public void Y0(int i3) {
        this.f9493A0 = i3;
        this.f9504y0 = i3;
        this.f9494B0 = i3;
        this.f9505z0 = i3;
        this.f9495C0 = i3;
        this.f9496D0 = i3;
    }

    public void Z0(int i3) {
        this.f9505z0 = i3;
    }

    @Override // t.j, t.i
    public void a(f fVar) {
        L0();
    }

    public void a1(int i3) {
        this.f9496D0 = i3;
    }

    public void b1(int i3) {
        this.f9493A0 = i3;
        this.f9497E0 = i3;
    }

    public void c1(int i3) {
        this.f9494B0 = i3;
        this.f9498F0 = i3;
    }

    public void d1(int i3) {
        this.f9495C0 = i3;
        this.f9497E0 = i3;
        this.f9498F0 = i3;
    }

    public void e1(int i3) {
        this.f9504y0 = i3;
    }
}

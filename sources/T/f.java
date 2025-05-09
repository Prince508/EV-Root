package t;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import t.e;
import u.b;

/* loaded from: classes.dex */
public class f extends m {

    /* renamed from: C0, reason: collision with root package name */
    public int f9419C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f9420D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f9421E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f9422F0;

    /* renamed from: x0, reason: collision with root package name */
    public u.b f9437x0 = new u.b(this);

    /* renamed from: y0, reason: collision with root package name */
    public u.e f9438y0 = new u.e(this);

    /* renamed from: z0, reason: collision with root package name */
    public b.InterfaceC0158b f9439z0 = null;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f9417A0 = false;

    /* renamed from: B0, reason: collision with root package name */
    public s.d f9418B0 = new s.d();

    /* renamed from: G0, reason: collision with root package name */
    public int f9423G0 = 0;

    /* renamed from: H0, reason: collision with root package name */
    public int f9424H0 = 0;

    /* renamed from: I0, reason: collision with root package name */
    public C0725c[] f9425I0 = new C0725c[4];

    /* renamed from: J0, reason: collision with root package name */
    public C0725c[] f9426J0 = new C0725c[4];

    /* renamed from: K0, reason: collision with root package name */
    public boolean f9427K0 = false;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f9428L0 = false;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f9429M0 = false;

    /* renamed from: N0, reason: collision with root package name */
    public int f9430N0 = 0;

    /* renamed from: O0, reason: collision with root package name */
    public int f9431O0 = 0;

    /* renamed from: P0, reason: collision with root package name */
    public int f9432P0 = 263;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f9433Q0 = false;

    /* renamed from: R0, reason: collision with root package name */
    public boolean f9434R0 = false;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f9435S0 = false;

    /* renamed from: T0, reason: collision with root package name */
    public int f9436T0 = 0;

    @Override // t.e
    public void I0(boolean z3, boolean z4) {
        super.I0(z3, z4);
        int size = this.f9506w0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((e) this.f9506w0.get(i3)).I0(z3, z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    @Override // t.m
    public void K0() {
        ?? r16;
        boolean z3;
        int i3 = 0;
        this.f9355S = 0;
        this.f9356T = 0;
        int max = Math.max(0, P());
        int max2 = Math.max(0, v());
        this.f9434R0 = false;
        this.f9435S0 = false;
        boolean z4 = d1(64) || d1(128);
        s.d dVar = this.f9418B0;
        dVar.f9045g = false;
        dVar.f9046h = false;
        if (this.f9432P0 != 0 && z4) {
            dVar.f9046h = true;
        }
        e.b[] bVarArr = this.f9349M;
        e.b bVar = bVarArr[1];
        e.b bVar2 = bVarArr[0];
        ArrayList arrayList = this.f9506w0;
        e.b y3 = y();
        e.b bVar3 = e.b.WRAP_CONTENT;
        boolean z5 = y3 == bVar3 || M() == bVar3;
        e1();
        int size = this.f9506w0.size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = (e) this.f9506w0.get(i4);
            if (eVar instanceof m) {
                ((m) eVar).K0();
            }
        }
        int i5 = 0;
        boolean z6 = false;
        boolean z7 = true;
        while (z7) {
            int i6 = i5 + 1;
            try {
                this.f9418B0.D();
                e1();
                l(this.f9418B0);
                for (int i7 = i3; i7 < size; i7++) {
                    ((e) this.f9506w0.get(i7)).l(this.f9418B0);
                }
                z7 = O0(this.f9418B0);
                if (z7) {
                    this.f9418B0.z();
                }
                r16 = i3;
            } catch (Exception e3) {
                e3.printStackTrace();
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                r16 = i3;
                sb.append("EXCEPTION : ");
                sb.append(e3);
                printStream.println(sb.toString());
            }
            if (z7) {
                i1(this.f9418B0, k.f9492a);
            } else {
                J0(this.f9418B0);
                for (int i8 = r16; i8 < size; i8++) {
                    ((e) this.f9506w0.get(i8)).J0(this.f9418B0);
                }
            }
            if (z5 && i6 < 8 && k.f9492a[2]) {
                int i9 = r16;
                int i10 = i9;
                int i11 = i10;
                while (i9 < size) {
                    e eVar2 = (e) this.f9506w0.get(i9);
                    i10 = Math.max(i10, eVar2.f9355S + eVar2.P());
                    i11 = Math.max(i11, eVar2.f9356T + eVar2.v());
                    i9++;
                }
                int max3 = Math.max(this.f9362Z, i10);
                int max4 = Math.max(this.f9364a0, i11);
                e.b bVar4 = e.b.WRAP_CONTENT;
                if (bVar2 != bVar4 || P() >= max3) {
                    z3 = r16;
                } else {
                    E0(max3);
                    this.f9349M[r16] = bVar4;
                    z3 = true;
                    z6 = true;
                }
                if (bVar == bVar4 && v() < max4) {
                    h0(max4);
                    this.f9349M[1] = bVar4;
                    z3 = true;
                    z6 = true;
                }
            } else {
                z3 = r16;
            }
            int max5 = Math.max(this.f9362Z, P());
            if (max5 > P()) {
                E0(max5);
                this.f9349M[r16] = e.b.FIXED;
                z3 = true;
                z6 = true;
            }
            int max6 = Math.max(this.f9364a0, v());
            if (max6 > v()) {
                h0(max6);
                this.f9349M[1] = e.b.FIXED;
                z3 = true;
                z6 = true;
            }
            if (!z6) {
                e.b bVar5 = this.f9349M[r16];
                e.b bVar6 = e.b.WRAP_CONTENT;
                if (bVar5 == bVar6 && max > 0 && P() > max) {
                    this.f9434R0 = true;
                    this.f9349M[r16] = e.b.FIXED;
                    E0(max);
                    z3 = true;
                    z6 = true;
                }
                if (this.f9349M[1] == bVar6 && max2 > 0 && v() > max2) {
                    this.f9435S0 = true;
                    this.f9349M[1] = e.b.FIXED;
                    h0(max2);
                    z7 = true;
                    z6 = true;
                    i5 = i6;
                    i3 = r16;
                }
            }
            z7 = z3;
            i5 = i6;
            i3 = r16;
        }
        int i12 = i3;
        this.f9506w0 = arrayList;
        if (z6) {
            e.b[] bVarArr2 = this.f9349M;
            bVarArr2[i12] = bVar2;
            bVarArr2[1] = bVar;
        }
        a0(this.f9418B0.v());
    }

    public void N0(e eVar, int i3) {
        if (i3 == 0) {
            P0(eVar);
        } else if (i3 == 1) {
            Q0(eVar);
        }
    }

    public boolean O0(s.d dVar) {
        f(dVar);
        int size = this.f9506w0.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            e eVar = (e) this.f9506w0.get(i3);
            eVar.o0(0, false);
            eVar.o0(1, false);
            if (eVar instanceof C0723a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i4 = 0; i4 < size; i4++) {
                e eVar2 = (e) this.f9506w0.get(i4);
                if (eVar2 instanceof C0723a) {
                    ((C0723a) eVar2).N0();
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            e eVar3 = (e) this.f9506w0.get(i5);
            if (eVar3.e()) {
                eVar3.f(dVar);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            e eVar4 = (e) this.f9506w0.get(i6);
            if (eVar4 instanceof f) {
                e.b[] bVarArr = eVar4.f9349M;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                e.b bVar3 = e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar4.l0(e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar4.A0(e.b.FIXED);
                }
                eVar4.f(dVar);
                if (bVar == bVar3) {
                    eVar4.l0(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar4.A0(bVar2);
                }
            } else {
                k.a(this, dVar, eVar4);
                if (!eVar4.e()) {
                    eVar4.f(dVar);
                }
            }
        }
        if (this.f9423G0 > 0) {
            AbstractC0724b.a(this, dVar, 0);
        }
        if (this.f9424H0 > 0) {
            AbstractC0724b.a(this, dVar, 1);
        }
        return true;
    }

    public final void P0(e eVar) {
        int i3 = this.f9423G0 + 1;
        C0725c[] c0725cArr = this.f9426J0;
        if (i3 >= c0725cArr.length) {
            this.f9426J0 = (C0725c[]) Arrays.copyOf(c0725cArr, c0725cArr.length * 2);
        }
        this.f9426J0[this.f9423G0] = new C0725c(eVar, 0, a1());
        this.f9423G0++;
    }

    public final void Q0(e eVar) {
        int i3 = this.f9424H0 + 1;
        C0725c[] c0725cArr = this.f9425I0;
        if (i3 >= c0725cArr.length) {
            this.f9425I0 = (C0725c[]) Arrays.copyOf(c0725cArr, c0725cArr.length * 2);
        }
        this.f9425I0[this.f9424H0] = new C0725c(eVar, 1, a1());
        this.f9424H0++;
    }

    public boolean R0(boolean z3) {
        return this.f9438y0.f(z3);
    }

    public boolean S0(boolean z3) {
        return this.f9438y0.g(z3);
    }

    public boolean T0(boolean z3, int i3) {
        return this.f9438y0.h(z3, i3);
    }

    public b.InterfaceC0158b U0() {
        return this.f9439z0;
    }

    public int V0() {
        return this.f9432P0;
    }

    public boolean W0() {
        return false;
    }

    public void X0() {
        this.f9438y0.j();
    }

    @Override // t.m, t.e
    public void Y() {
        this.f9418B0.D();
        this.f9419C0 = 0;
        this.f9421E0 = 0;
        this.f9420D0 = 0;
        this.f9422F0 = 0;
        this.f9433Q0 = false;
        super.Y();
    }

    public void Y0() {
        this.f9438y0.k();
    }

    public boolean Z0() {
        return this.f9435S0;
    }

    public boolean a1() {
        return this.f9417A0;
    }

    public boolean b1() {
        return this.f9434R0;
    }

    public long c1(int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f9419C0 = i10;
        this.f9420D0 = i11;
        return this.f9437x0.d(this, i3, i10, i11, i4, i5, i6, i7, i8, i9);
    }

    public boolean d1(int i3) {
        return (this.f9432P0 & i3) == i3;
    }

    public final void e1() {
        this.f9423G0 = 0;
        this.f9424H0 = 0;
    }

    public void f1(b.InterfaceC0158b interfaceC0158b) {
        this.f9439z0 = interfaceC0158b;
        this.f9438y0.n(interfaceC0158b);
    }

    public void g1(int i3) {
        this.f9432P0 = i3;
        s.d.f9036r = k.b(i3, 256);
    }

    public void h1(boolean z3) {
        this.f9417A0 = z3;
    }

    public void i1(s.d dVar, boolean[] zArr) {
        zArr[2] = false;
        J0(dVar);
        int size = this.f9506w0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((e) this.f9506w0.get(i3)).J0(dVar);
        }
    }

    public void j1() {
        this.f9437x0.e(this);
    }
}

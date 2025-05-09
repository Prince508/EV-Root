package t;

import t.e;

/* renamed from: t.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0723a extends j {

    /* renamed from: y0, reason: collision with root package name */
    public int f9294y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f9295z0 = true;

    /* renamed from: A0, reason: collision with root package name */
    public int f9293A0 = 0;

    public boolean K0() {
        return this.f9295z0;
    }

    public int L0() {
        return this.f9294y0;
    }

    public int M0() {
        return this.f9293A0;
    }

    public void N0() {
        for (int i3 = 0; i3 < this.f9491x0; i3++) {
            e eVar = this.f9490w0[i3];
            int i4 = this.f9294y0;
            if (i4 == 0 || i4 == 1) {
                eVar.o0(0, true);
            } else if (i4 == 2 || i4 == 3) {
                eVar.o0(1, true);
            }
        }
    }

    public void O0(boolean z3) {
        this.f9295z0 = z3;
    }

    public void P0(int i3) {
        this.f9294y0 = i3;
    }

    public void Q0(int i3) {
        this.f9293A0 = i3;
    }

    @Override // t.e
    public void f(s.d dVar) {
        d[] dVarArr;
        boolean z3;
        int i3;
        int i4;
        int i5;
        d[] dVarArr2 = this.f9346J;
        dVarArr2[0] = this.f9338B;
        dVarArr2[2] = this.f9339C;
        dVarArr2[1] = this.f9340D;
        dVarArr2[3] = this.f9341E;
        int i6 = 0;
        while (true) {
            dVarArr = this.f9346J;
            if (i6 >= dVarArr.length) {
                break;
            }
            d dVar2 = dVarArr[i6];
            dVar2.f9324g = dVar.q(dVar2);
            i6++;
        }
        int i7 = this.f9294y0;
        if (i7 < 0 || i7 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i7];
        for (int i8 = 0; i8 < this.f9491x0; i8++) {
            e eVar = this.f9490w0[i8];
            if ((this.f9295z0 || eVar.g()) && ((((i4 = this.f9294y0) == 0 || i4 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.f9338B.f9321d != null && eVar.f9340D.f9321d != null) || (((i5 = this.f9294y0) == 2 || i5 == 3) && eVar.M() == e.b.MATCH_CONSTRAINT && eVar.f9339C.f9321d != null && eVar.f9341E.f9321d != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = this.f9338B.i() || this.f9340D.i();
        boolean z5 = this.f9339C.i() || this.f9341E.i();
        int i9 = !(!z3 && (((i3 = this.f9294y0) == 0 && z4) || ((i3 == 2 && z5) || ((i3 == 1 && z4) || (i3 == 3 && z5))))) ? 4 : 5;
        for (int i10 = 0; i10 < this.f9491x0; i10++) {
            e eVar2 = this.f9490w0[i10];
            if (this.f9295z0 || eVar2.g()) {
                s.i q3 = dVar.q(eVar2.f9346J[this.f9294y0]);
                d[] dVarArr3 = eVar2.f9346J;
                int i11 = this.f9294y0;
                d dVar4 = dVarArr3[i11];
                dVar4.f9324g = q3;
                d dVar5 = dVar4.f9321d;
                int i12 = (dVar5 == null || dVar5.f9319b != this) ? 0 : dVar4.f9322e;
                if (i11 == 0 || i11 == 2) {
                    dVar.i(dVar3.f9324g, q3, this.f9293A0 - i12, z3);
                } else {
                    dVar.g(dVar3.f9324g, q3, this.f9293A0 + i12, z3);
                }
                dVar.e(dVar3.f9324g, q3, this.f9293A0 + i12, i9);
            }
        }
        int i13 = this.f9294y0;
        if (i13 == 0) {
            dVar.e(this.f9340D.f9324g, this.f9338B.f9324g, 0, 8);
            dVar.e(this.f9338B.f9324g, this.f9350N.f9340D.f9324g, 0, 4);
            dVar.e(this.f9338B.f9324g, this.f9350N.f9338B.f9324g, 0, 0);
            return;
        }
        if (i13 == 1) {
            dVar.e(this.f9338B.f9324g, this.f9340D.f9324g, 0, 8);
            dVar.e(this.f9338B.f9324g, this.f9350N.f9338B.f9324g, 0, 4);
            dVar.e(this.f9338B.f9324g, this.f9350N.f9340D.f9324g, 0, 0);
        } else if (i13 == 2) {
            dVar.e(this.f9341E.f9324g, this.f9339C.f9324g, 0, 8);
            dVar.e(this.f9339C.f9324g, this.f9350N.f9341E.f9324g, 0, 4);
            dVar.e(this.f9339C.f9324g, this.f9350N.f9339C.f9324g, 0, 0);
        } else if (i13 == 3) {
            dVar.e(this.f9339C.f9324g, this.f9341E.f9324g, 0, 8);
            dVar.e(this.f9339C.f9324g, this.f9350N.f9339C.f9324g, 0, 4);
            dVar.e(this.f9339C.f9324g, this.f9350N.f9341E.f9324g, 0, 0);
        }
    }

    @Override // t.e
    public boolean g() {
        return true;
    }

    @Override // t.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i3 = 0; i3 < this.f9491x0; i3++) {
            e eVar = this.f9490w0[i3];
            if (i3 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }
}

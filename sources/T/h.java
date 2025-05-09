package t;

import t.d;
import t.e;

/* loaded from: classes.dex */
public class h extends e {

    /* renamed from: w0, reason: collision with root package name */
    public float f9485w0 = -1.0f;

    /* renamed from: x0, reason: collision with root package name */
    public int f9486x0 = -1;

    /* renamed from: y0, reason: collision with root package name */
    public int f9487y0 = -1;

    /* renamed from: z0, reason: collision with root package name */
    public d f9488z0 = this.f9339C;

    /* renamed from: A0, reason: collision with root package name */
    public int f9483A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    public int f9484B0 = 0;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9489a;

        static {
            int[] iArr = new int[d.b.values().length];
            f9489a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9489a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9489a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9489a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9489a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9489a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9489a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9489a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9489a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public h() {
        this.f9347K.clear();
        this.f9347K.add(this.f9488z0);
        int length = this.f9346J.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f9346J[i3] = this.f9488z0;
        }
    }

    @Override // t.e
    public void J0(s.d dVar) {
        if (G() == null) {
            return;
        }
        int x3 = dVar.x(this.f9488z0);
        if (this.f9483A0 == 1) {
            F0(x3);
            G0(0);
            h0(G().v());
            E0(0);
            return;
        }
        F0(0);
        G0(x3);
        E0(G().P());
        h0(0);
    }

    public int K0() {
        return this.f9483A0;
    }

    public int L0() {
        return this.f9486x0;
    }

    public int M0() {
        return this.f9487y0;
    }

    public float N0() {
        return this.f9485w0;
    }

    public void O0(int i3) {
        if (i3 > -1) {
            this.f9485w0 = -1.0f;
            this.f9486x0 = i3;
            this.f9487y0 = -1;
        }
    }

    public void P0(int i3) {
        if (i3 > -1) {
            this.f9485w0 = -1.0f;
            this.f9486x0 = -1;
            this.f9487y0 = i3;
        }
    }

    public void Q0(float f3) {
        if (f3 > -1.0f) {
            this.f9485w0 = f3;
            this.f9486x0 = -1;
            this.f9487y0 = -1;
        }
    }

    public void R0(int i3) {
        if (this.f9483A0 == i3) {
            return;
        }
        this.f9483A0 = i3;
        this.f9347K.clear();
        if (this.f9483A0 == 1) {
            this.f9488z0 = this.f9338B;
        } else {
            this.f9488z0 = this.f9339C;
        }
        this.f9347K.add(this.f9488z0);
        int length = this.f9346J.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f9346J[i4] = this.f9488z0;
        }
    }

    @Override // t.e
    public void f(s.d dVar) {
        f fVar = (f) G();
        if (fVar == null) {
            return;
        }
        d m3 = fVar.m(d.b.LEFT);
        d m4 = fVar.m(d.b.RIGHT);
        e eVar = this.f9350N;
        boolean z3 = eVar != null && eVar.f9349M[0] == e.b.WRAP_CONTENT;
        if (this.f9483A0 == 0) {
            m3 = fVar.m(d.b.TOP);
            m4 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.f9350N;
            z3 = eVar2 != null && eVar2.f9349M[1] == e.b.WRAP_CONTENT;
        }
        if (this.f9486x0 != -1) {
            s.i q3 = dVar.q(this.f9488z0);
            dVar.e(q3, dVar.q(m3), this.f9486x0, 8);
            if (z3) {
                dVar.h(dVar.q(m4), q3, 0, 5);
                return;
            }
            return;
        }
        if (this.f9487y0 == -1) {
            if (this.f9485w0 != -1.0f) {
                dVar.d(s.d.s(dVar, dVar.q(this.f9488z0), dVar.q(m4), this.f9485w0));
                return;
            }
            return;
        }
        s.i q4 = dVar.q(this.f9488z0);
        s.i q5 = dVar.q(m4);
        dVar.e(q4, q5, -this.f9487y0, 8);
        if (z3) {
            dVar.h(q4, dVar.q(m3), 0, 5);
            dVar.h(q5, q4, 0, 5);
        }
    }

    @Override // t.e
    public boolean g() {
        return true;
    }

    @Override // t.e
    public d m(d.b bVar) {
        switch (a.f9489a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f9483A0 == 1) {
                    return this.f9488z0;
                }
                break;
            case 3:
            case 4:
                if (this.f9483A0 == 0) {
                    return this.f9488z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}

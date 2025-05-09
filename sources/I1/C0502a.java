package i1;

import K.O;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import e1.AbstractC0464a;
import e1.j;
import m1.AbstractC0597a;
import u1.AbstractC0740c;
import v1.AbstractC0758b;
import v1.C0757a;
import x1.g;
import x1.k;
import x1.n;

/* renamed from: i1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0502a {

    /* renamed from: u, reason: collision with root package name */
    public static final boolean f7462u = true;

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f7463v = false;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f7464a;

    /* renamed from: b, reason: collision with root package name */
    public k f7465b;

    /* renamed from: c, reason: collision with root package name */
    public int f7466c;

    /* renamed from: d, reason: collision with root package name */
    public int f7467d;

    /* renamed from: e, reason: collision with root package name */
    public int f7468e;

    /* renamed from: f, reason: collision with root package name */
    public int f7469f;

    /* renamed from: g, reason: collision with root package name */
    public int f7470g;

    /* renamed from: h, reason: collision with root package name */
    public int f7471h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f7472i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f7473j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f7474k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f7475l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f7476m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7480q;

    /* renamed from: s, reason: collision with root package name */
    public LayerDrawable f7482s;

    /* renamed from: t, reason: collision with root package name */
    public int f7483t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7477n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7478o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7479p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7481r = true;

    public C0502a(MaterialButton materialButton, k kVar) {
        this.f7464a = materialButton;
        this.f7465b = kVar;
    }

    public void A(boolean z3) {
        this.f7477n = z3;
        J();
    }

    public void B(ColorStateList colorStateList) {
        if (this.f7474k != colorStateList) {
            this.f7474k = colorStateList;
            J();
        }
    }

    public void C(int i3) {
        if (this.f7471h != i3) {
            this.f7471h = i3;
            J();
        }
    }

    public void D(ColorStateList colorStateList) {
        if (this.f7473j != colorStateList) {
            this.f7473j = colorStateList;
            if (f() != null) {
                D.a.i(f(), this.f7473j);
            }
        }
    }

    public void E(PorterDuff.Mode mode) {
        if (this.f7472i != mode) {
            this.f7472i = mode;
            if (f() == null || this.f7472i == null) {
                return;
            }
            D.a.j(f(), this.f7472i);
        }
    }

    public void F(boolean z3) {
        this.f7481r = z3;
    }

    public final void G(int i3, int i4) {
        int B3 = O.B(this.f7464a);
        int paddingTop = this.f7464a.getPaddingTop();
        int A3 = O.A(this.f7464a);
        int paddingBottom = this.f7464a.getPaddingBottom();
        int i5 = this.f7468e;
        int i6 = this.f7469f;
        this.f7469f = i4;
        this.f7468e = i3;
        if (!this.f7478o) {
            H();
        }
        O.w0(this.f7464a, B3, (paddingTop + i3) - i5, A3, (paddingBottom + i4) - i6);
    }

    public final void H() {
        this.f7464a.setInternalBackground(a());
        g f3 = f();
        if (f3 != null) {
            f3.S(this.f7483t);
            f3.setState(this.f7464a.getDrawableState());
        }
    }

    public final void I(k kVar) {
        if (f7463v && !this.f7478o) {
            int B3 = O.B(this.f7464a);
            int paddingTop = this.f7464a.getPaddingTop();
            int A3 = O.A(this.f7464a);
            int paddingBottom = this.f7464a.getPaddingBottom();
            H();
            O.w0(this.f7464a, B3, paddingTop, A3, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    public final void J() {
        g f3 = f();
        g n3 = n();
        if (f3 != null) {
            f3.Y(this.f7471h, this.f7474k);
            if (n3 != null) {
                n3.X(this.f7471h, this.f7477n ? AbstractC0597a.d(this.f7464a, AbstractC0464a.f6790h) : 0);
            }
        }
    }

    public final InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f7466c, this.f7468e, this.f7467d, this.f7469f);
    }

    public final Drawable a() {
        g gVar = new g(this.f7465b);
        gVar.J(this.f7464a.getContext());
        D.a.i(gVar, this.f7473j);
        PorterDuff.Mode mode = this.f7472i;
        if (mode != null) {
            D.a.j(gVar, mode);
        }
        gVar.Y(this.f7471h, this.f7474k);
        g gVar2 = new g(this.f7465b);
        gVar2.setTint(0);
        gVar2.X(this.f7471h, this.f7477n ? AbstractC0597a.d(this.f7464a, AbstractC0464a.f6790h) : 0);
        if (f7462u) {
            g gVar3 = new g(this.f7465b);
            this.f7476m = gVar3;
            D.a.h(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(AbstractC0758b.a(this.f7475l), K(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f7476m);
            this.f7482s = rippleDrawable;
            return rippleDrawable;
        }
        C0757a c0757a = new C0757a(this.f7465b);
        this.f7476m = c0757a;
        D.a.i(c0757a, AbstractC0758b.a(this.f7475l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f7476m});
        this.f7482s = layerDrawable;
        return K(layerDrawable);
    }

    public int b() {
        return this.f7470g;
    }

    public int c() {
        return this.f7469f;
    }

    public int d() {
        return this.f7468e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f7482s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f7482s.getNumberOfLayers() > 2 ? (n) this.f7482s.getDrawable(2) : (n) this.f7482s.getDrawable(1);
    }

    public g f() {
        return g(false);
    }

    public final g g(boolean z3) {
        LayerDrawable layerDrawable = this.f7482s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f7462u ? (g) ((LayerDrawable) ((InsetDrawable) this.f7482s.getDrawable(0)).getDrawable()).getDrawable(!z3 ? 1 : 0) : (g) this.f7482s.getDrawable(!z3 ? 1 : 0);
    }

    public ColorStateList h() {
        return this.f7475l;
    }

    public k i() {
        return this.f7465b;
    }

    public ColorStateList j() {
        return this.f7474k;
    }

    public int k() {
        return this.f7471h;
    }

    public ColorStateList l() {
        return this.f7473j;
    }

    public PorterDuff.Mode m() {
        return this.f7472i;
    }

    public final g n() {
        return g(true);
    }

    public boolean o() {
        return this.f7478o;
    }

    public boolean p() {
        return this.f7480q;
    }

    public boolean q() {
        return this.f7481r;
    }

    public void r(TypedArray typedArray) {
        this.f7466c = typedArray.getDimensionPixelOffset(j.f7047V1, 0);
        this.f7467d = typedArray.getDimensionPixelOffset(j.f7050W1, 0);
        this.f7468e = typedArray.getDimensionPixelOffset(j.f7053X1, 0);
        this.f7469f = typedArray.getDimensionPixelOffset(j.f7056Y1, 0);
        int i3 = j.f7071c2;
        if (typedArray.hasValue(i3)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i3, -1);
            this.f7470g = dimensionPixelSize;
            z(this.f7465b.w(dimensionPixelSize));
            this.f7479p = true;
        }
        this.f7471h = typedArray.getDimensionPixelSize(j.f7111m2, 0);
        this.f7472i = r1.n.h(typedArray.getInt(j.f7067b2, -1), PorterDuff.Mode.SRC_IN);
        this.f7473j = AbstractC0740c.a(this.f7464a.getContext(), typedArray, j.f7063a2);
        this.f7474k = AbstractC0740c.a(this.f7464a.getContext(), typedArray, j.f7107l2);
        this.f7475l = AbstractC0740c.a(this.f7464a.getContext(), typedArray, j.f7103k2);
        this.f7480q = typedArray.getBoolean(j.f7059Z1, false);
        this.f7483t = typedArray.getDimensionPixelSize(j.f7075d2, 0);
        this.f7481r = typedArray.getBoolean(j.f7115n2, true);
        int B3 = O.B(this.f7464a);
        int paddingTop = this.f7464a.getPaddingTop();
        int A3 = O.A(this.f7464a);
        int paddingBottom = this.f7464a.getPaddingBottom();
        if (typedArray.hasValue(j.f7043U1)) {
            t();
        } else {
            H();
        }
        O.w0(this.f7464a, B3 + this.f7466c, paddingTop + this.f7468e, A3 + this.f7467d, paddingBottom + this.f7469f);
    }

    public void s(int i3) {
        if (f() != null) {
            f().setTint(i3);
        }
    }

    public void t() {
        this.f7478o = true;
        this.f7464a.setSupportBackgroundTintList(this.f7473j);
        this.f7464a.setSupportBackgroundTintMode(this.f7472i);
    }

    public void u(boolean z3) {
        this.f7480q = z3;
    }

    public void v(int i3) {
        if (this.f7479p && this.f7470g == i3) {
            return;
        }
        this.f7470g = i3;
        this.f7479p = true;
        z(this.f7465b.w(i3));
    }

    public void w(int i3) {
        G(this.f7468e, i3);
    }

    public void x(int i3) {
        G(i3, this.f7469f);
    }

    public void y(ColorStateList colorStateList) {
        if (this.f7475l != colorStateList) {
            this.f7475l = colorStateList;
            boolean z3 = f7462u;
            if (z3 && (this.f7464a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f7464a.getBackground()).setColor(AbstractC0758b.a(colorStateList));
            } else {
                if (z3 || !(this.f7464a.getBackground() instanceof C0757a)) {
                    return;
                }
                ((C0757a) this.f7464a.getBackground()).setTintList(AbstractC0758b.a(colorStateList));
            }
        }
    }

    public void z(k kVar) {
        this.f7465b = kVar;
        I(kVar);
    }
}

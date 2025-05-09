package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: l.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0563d {

    /* renamed from: a, reason: collision with root package name */
    public final View f8339a;

    /* renamed from: d, reason: collision with root package name */
    public C0550P f8342d;

    /* renamed from: e, reason: collision with root package name */
    public C0550P f8343e;

    /* renamed from: f, reason: collision with root package name */
    public C0550P f8344f;

    /* renamed from: c, reason: collision with root package name */
    public int f8341c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0567h f8340b = C0567h.b();

    public C0563d(View view) {
        this.f8339a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f8344f == null) {
            this.f8344f = new C0550P();
        }
        C0550P c0550p = this.f8344f;
        c0550p.a();
        ColorStateList o3 = K.O.o(this.f8339a);
        if (o3 != null) {
            c0550p.f8292d = true;
            c0550p.f8289a = o3;
        }
        PorterDuff.Mode p3 = K.O.p(this.f8339a);
        if (p3 != null) {
            c0550p.f8291c = true;
            c0550p.f8290b = p3;
        }
        if (!c0550p.f8292d && !c0550p.f8291c) {
            return false;
        }
        C0567h.g(drawable, c0550p, this.f8339a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f8339a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            C0550P c0550p = this.f8343e;
            if (c0550p != null) {
                C0567h.g(background, c0550p, this.f8339a.getDrawableState());
                return;
            }
            C0550P c0550p2 = this.f8342d;
            if (c0550p2 != null) {
                C0567h.g(background, c0550p2, this.f8339a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        C0550P c0550p = this.f8343e;
        if (c0550p != null) {
            return c0550p.f8289a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        C0550P c0550p = this.f8343e;
        if (c0550p != null) {
            return c0550p.f8290b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i3) {
        Context context = this.f8339a.getContext();
        int[] iArr = d.i.Y2;
        C0552S t3 = C0552S.t(context, attributeSet, iArr, i3, 0);
        View view = this.f8339a;
        K.O.h0(view, view.getContext(), iArr, attributeSet, t3.p(), i3, 0);
        try {
            int i4 = d.i.Z2;
            if (t3.q(i4)) {
                this.f8341c = t3.m(i4, -1);
                ColorStateList e3 = this.f8340b.e(this.f8339a.getContext(), this.f8341c);
                if (e3 != null) {
                    h(e3);
                }
            }
            int i5 = d.i.a3;
            if (t3.q(i5)) {
                K.O.o0(this.f8339a, t3.c(i5));
            }
            int i6 = d.i.b3;
            if (t3.q(i6)) {
                K.O.p0(this.f8339a, AbstractC0537C.e(t3.j(i6, -1), null));
            }
            t3.u();
        } catch (Throwable th) {
            t3.u();
            throw th;
        }
    }

    public void f(Drawable drawable) {
        this.f8341c = -1;
        h(null);
        b();
    }

    public void g(int i3) {
        this.f8341c = i3;
        C0567h c0567h = this.f8340b;
        h(c0567h != null ? c0567h.e(this.f8339a.getContext(), i3) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f8342d == null) {
                this.f8342d = new C0550P();
            }
            C0550P c0550p = this.f8342d;
            c0550p.f8289a = colorStateList;
            c0550p.f8292d = true;
        } else {
            this.f8342d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f8343e == null) {
            this.f8343e = new C0550P();
        }
        C0550P c0550p = this.f8343e;
        c0550p.f8289a = colorStateList;
        c0550p.f8292d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f8343e == null) {
            this.f8343e = new C0550P();
        }
        C0550P c0550p = this.f8343e;
        c0550p.f8290b = mode;
        c0550p.f8291c = true;
        b();
    }

    public final boolean k() {
        return this.f8342d != null;
    }
}

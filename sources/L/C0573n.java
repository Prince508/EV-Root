package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import f.AbstractC0467a;

/* renamed from: l.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0573n {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f8381a;

    /* renamed from: b, reason: collision with root package name */
    public C0550P f8382b;

    /* renamed from: c, reason: collision with root package name */
    public C0550P f8383c;

    /* renamed from: d, reason: collision with root package name */
    public C0550P f8384d;

    /* renamed from: e, reason: collision with root package name */
    public int f8385e = 0;

    public C0573n(ImageView imageView) {
        this.f8381a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.f8384d == null) {
            this.f8384d = new C0550P();
        }
        C0550P c0550p = this.f8384d;
        c0550p.a();
        ColorStateList a3 = Q.d.a(this.f8381a);
        if (a3 != null) {
            c0550p.f8292d = true;
            c0550p.f8289a = a3;
        }
        PorterDuff.Mode b3 = Q.d.b(this.f8381a);
        if (b3 != null) {
            c0550p.f8291c = true;
            c0550p.f8290b = b3;
        }
        if (!c0550p.f8292d && !c0550p.f8291c) {
            return false;
        }
        C0567h.g(drawable, c0550p, this.f8381a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.f8381a.getDrawable() != null) {
            this.f8381a.getDrawable().setLevel(this.f8385e);
        }
    }

    public void c() {
        Drawable drawable = this.f8381a.getDrawable();
        if (drawable != null) {
            AbstractC0537C.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            C0550P c0550p = this.f8383c;
            if (c0550p != null) {
                C0567h.g(drawable, c0550p, this.f8381a.getDrawableState());
                return;
            }
            C0550P c0550p2 = this.f8382b;
            if (c0550p2 != null) {
                C0567h.g(drawable, c0550p2, this.f8381a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        C0550P c0550p = this.f8383c;
        if (c0550p != null) {
            return c0550p.f8289a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        C0550P c0550p = this.f8383c;
        if (c0550p != null) {
            return c0550p.f8290b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f8381a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i3) {
        int m3;
        Context context = this.f8381a.getContext();
        int[] iArr = d.i.f6176F;
        C0552S t3 = C0552S.t(context, attributeSet, iArr, i3, 0);
        ImageView imageView = this.f8381a;
        K.O.h0(imageView, imageView.getContext(), iArr, attributeSet, t3.p(), i3, 0);
        try {
            Drawable drawable = this.f8381a.getDrawable();
            if (drawable == null && (m3 = t3.m(d.i.f6180G, -1)) != -1 && (drawable = AbstractC0467a.b(this.f8381a.getContext(), m3)) != null) {
                this.f8381a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0537C.b(drawable);
            }
            int i4 = d.i.f6184H;
            if (t3.q(i4)) {
                Q.d.c(this.f8381a, t3.c(i4));
            }
            int i5 = d.i.f6188I;
            if (t3.q(i5)) {
                Q.d.d(this.f8381a, AbstractC0537C.e(t3.j(i5, -1), null));
            }
            t3.u();
        } catch (Throwable th) {
            t3.u();
            throw th;
        }
    }

    public void h(Drawable drawable) {
        this.f8385e = drawable.getLevel();
    }

    public void i(int i3) {
        if (i3 != 0) {
            Drawable b3 = AbstractC0467a.b(this.f8381a.getContext(), i3);
            if (b3 != null) {
                AbstractC0537C.b(b3);
            }
            this.f8381a.setImageDrawable(b3);
        } else {
            this.f8381a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.f8383c == null) {
            this.f8383c = new C0550P();
        }
        C0550P c0550p = this.f8383c;
        c0550p.f8289a = colorStateList;
        c0550p.f8292d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.f8383c == null) {
            this.f8383c = new C0550P();
        }
        C0550P c0550p = this.f8383c;
        c0550p.f8290b = mode;
        c0550p.f8291c = true;
        c();
    }

    public final boolean l() {
        return this.f8382b != null;
    }
}

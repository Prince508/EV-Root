package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: l.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0572m extends ImageButton {

    /* renamed from: e, reason: collision with root package name */
    public final C0563d f8378e;

    /* renamed from: f, reason: collision with root package name */
    public final C0573n f8379f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8380g;

    public C0572m(Context context, AttributeSet attributeSet, int i3) {
        super(C0549O.b(context), attributeSet, i3);
        this.f8380g = false;
        AbstractC0548N.a(this, getContext());
        C0563d c0563d = new C0563d(this);
        this.f8378e = c0563d;
        c0563d.e(attributeSet, i3);
        C0573n c0573n = new C0573n(this);
        this.f8379f = c0573n;
        c0573n.g(attributeSet, i3);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0563d c0563d = this.f8378e;
        if (c0563d != null) {
            c0563d.b();
        }
        C0573n c0573n = this.f8379f;
        if (c0573n != null) {
            c0573n.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0563d c0563d = this.f8378e;
        if (c0563d != null) {
            return c0563d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0563d c0563d = this.f8378e;
        if (c0563d != null) {
            return c0563d.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0573n c0573n = this.f8379f;
        if (c0573n != null) {
            return c0573n.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0573n c0573n = this.f8379f;
        if (c0573n != null) {
            return c0573n.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f8379f.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0563d c0563d = this.f8378e;
        if (c0563d != null) {
            c0563d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0563d c0563d = this.f8378e;
        if (c0563d != null) {
            c0563d.g(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0573n c0573n = this.f8379f;
        if (c0573n != null) {
            c0573n.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0573n c0573n = this.f8379f;
        if (c0573n != null && drawable != null && !this.f8380g) {
            c0573n.h(drawable);
        }
        super.setImageDrawable(drawable);
        C0573n c0573n2 = this.f8379f;
        if (c0573n2 != null) {
            c0573n2.c();
            if (this.f8380g) {
                return;
            }
            this.f8379f.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.f8380g = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        this.f8379f.i(i3);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0573n c0573n = this.f8379f;
        if (c0573n != null) {
            c0573n.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0563d c0563d = this.f8378e;
        if (c0563d != null) {
            c0563d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0563d c0563d = this.f8378e;
        if (c0563d != null) {
            c0563d.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0573n c0573n = this.f8379f;
        if (c0573n != null) {
            c0573n.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0573n c0573n = this.f8379f;
        if (c0573n != null) {
            c0573n.k(mode);
        }
    }
}

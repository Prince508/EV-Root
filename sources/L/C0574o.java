package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: l.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0574o extends ImageView {

    /* renamed from: e, reason: collision with root package name */
    public final C0563d f8386e;

    /* renamed from: f, reason: collision with root package name */
    public final C0573n f8387f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8388g;

    public C0574o(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0563d c0563d = this.f8386e;
        if (c0563d != null) {
            c0563d.b();
        }
        C0573n c0573n = this.f8387f;
        if (c0573n != null) {
            c0573n.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0563d c0563d = this.f8386e;
        if (c0563d != null) {
            return c0563d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0563d c0563d = this.f8386e;
        if (c0563d != null) {
            return c0563d.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C0573n c0573n = this.f8387f;
        if (c0573n != null) {
            return c0573n.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C0573n c0573n = this.f8387f;
        if (c0573n != null) {
            return c0573n.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f8387f.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0563d c0563d = this.f8386e;
        if (c0563d != null) {
            c0563d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0563d c0563d = this.f8386e;
        if (c0563d != null) {
            c0563d.g(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0573n c0573n = this.f8387f;
        if (c0573n != null) {
            c0573n.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0573n c0573n = this.f8387f;
        if (c0573n != null && drawable != null && !this.f8388g) {
            c0573n.h(drawable);
        }
        super.setImageDrawable(drawable);
        C0573n c0573n2 = this.f8387f;
        if (c0573n2 != null) {
            c0573n2.c();
            if (this.f8388g) {
                return;
            }
            this.f8387f.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.f8388g = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        C0573n c0573n = this.f8387f;
        if (c0573n != null) {
            c0573n.i(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0573n c0573n = this.f8387f;
        if (c0573n != null) {
            c0573n.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0563d c0563d = this.f8386e;
        if (c0563d != null) {
            c0563d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0563d c0563d = this.f8386e;
        if (c0563d != null) {
            c0563d.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0573n c0573n = this.f8387f;
        if (c0573n != null) {
            c0573n.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0573n c0573n = this.f8387f;
        if (c0573n != null) {
            c0573n.k(mode);
        }
    }

    public C0574o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0574o(Context context, AttributeSet attributeSet, int i3) {
        super(C0549O.b(context), attributeSet, i3);
        this.f8388g = false;
        AbstractC0548N.a(this, getContext());
        C0563d c0563d = new C0563d(this);
        this.f8386e = c0563d;
        c0563d.e(attributeSet, i3);
        C0573n c0573n = new C0573n(this);
        this.f8387f = c0573n;
        c0573n.g(attributeSet, i3);
    }
}

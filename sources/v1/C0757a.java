package v1;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import x1.g;
import x1.k;
import x1.n;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0757a extends Drawable implements n {

    /* renamed from: e, reason: collision with root package name */
    public b f9875e;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0757a mutate() {
        this.f9875e = new b(this.f9875e);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f9875e;
        if (bVar.f9877b) {
            bVar.f9876a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f9875e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f9875e.f9876a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f9875e.f9876a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f9875e.f9876a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b3 = AbstractC0758b.b(iArr);
        b bVar = this.f9875e;
        if (bVar.f9877b == b3) {
            return onStateChange;
        }
        bVar.f9877b = b3;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        this.f9875e.f9876a.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9875e.f9876a.setColorFilter(colorFilter);
    }

    @Override // x1.n
    public void setShapeAppearanceModel(k kVar) {
        this.f9875e.f9876a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i3) {
        this.f9875e.f9876a.setTint(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f9875e.f9876a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f9875e.f9876a.setTintMode(mode);
    }

    public C0757a(k kVar) {
        this(new b(new g(kVar)));
    }

    /* renamed from: v1.a$b */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public g f9876a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f9877b;

        public b(g gVar) {
            this.f9876a = gVar;
            this.f9877b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0757a newDrawable() {
            return new C0757a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f9876a = (g) bVar.f9876a.getConstantState().newDrawable();
            this.f9877b = bVar.f9877b;
        }
    }

    public C0757a(b bVar) {
        this.f9875e = bVar;
    }
}

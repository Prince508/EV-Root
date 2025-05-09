package z1;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import x1.g;

/* renamed from: z1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0802h extends x1.g {

    /* renamed from: D, reason: collision with root package name */
    public b f10323D;

    /* renamed from: z1.h$c */
    public static class c extends AbstractC0802h {
        public c(b bVar) {
            super(bVar);
        }

        @Override // x1.g
        public void r(Canvas canvas) {
            if (this.f10323D.f10324w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f10323D.f10324w);
            } else {
                canvas.clipRect(this.f10323D.f10324w, Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    public static AbstractC0802h f0(x1.k kVar) {
        if (kVar == null) {
            kVar = new x1.k();
        }
        return g0(new b(kVar, new RectF()));
    }

    public static AbstractC0802h g0(b bVar) {
        return new c(bVar);
    }

    public boolean h0() {
        return !this.f10323D.f10324w.isEmpty();
    }

    public void i0() {
        j0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void j0(float f3, float f4, float f5, float f6) {
        if (f3 == this.f10323D.f10324w.left && f4 == this.f10323D.f10324w.top && f5 == this.f10323D.f10324w.right && f6 == this.f10323D.f10324w.bottom) {
            return;
        }
        this.f10323D.f10324w.set(f3, f4, f5, f6);
        invalidateSelf();
    }

    public void k0(RectF rectF) {
        j0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // x1.g, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f10323D = new b(this.f10323D);
        return this;
    }

    /* renamed from: z1.h$b */
    public static final class b extends g.c {

        /* renamed from: w, reason: collision with root package name */
        public final RectF f10324w;

        @Override // x1.g.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AbstractC0802h g02 = AbstractC0802h.g0(this);
            g02.invalidateSelf();
            return g02;
        }

        public b(x1.k kVar, RectF rectF) {
            super(kVar, null);
            this.f10324w = rectF;
        }

        public b(b bVar) {
            super(bVar);
            this.f10324w = bVar.f10324w;
        }
    }

    public AbstractC0802h(b bVar) {
        super(bVar);
        this.f10323D = bVar;
    }
}

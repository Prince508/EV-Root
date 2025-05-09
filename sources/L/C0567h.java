package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import d.AbstractC0435a;
import d.AbstractC0436b;
import f.AbstractC0467a;
import l.C0544J;

/* renamed from: l.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567h {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f8358b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0567h f8359c;

    /* renamed from: a, reason: collision with root package name */
    public C0544J f8360a;

    /* renamed from: l.h$a */
    public class a implements C0544J.c {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f8361a = {d.d.f6071R, d.d.f6069P, d.d.f6073a};

        /* renamed from: b, reason: collision with root package name */
        public final int[] f8362b = {d.d.f6087o, d.d.f6055B, d.d.f6092t, d.d.f6088p, d.d.f6089q, d.d.f6091s, d.d.f6090r};

        /* renamed from: c, reason: collision with root package name */
        public final int[] f8363c = {d.d.f6068O, d.d.f6070Q, d.d.f6083k, d.d.f6064K, d.d.f6065L, d.d.f6066M, d.d.f6067N};

        /* renamed from: d, reason: collision with root package name */
        public final int[] f8364d = {d.d.f6095w, d.d.f6081i, d.d.f6094v};

        /* renamed from: e, reason: collision with root package name */
        public final int[] f8365e = {d.d.f6063J, d.d.f6072S};

        /* renamed from: f, reason: collision with root package name */
        public final int[] f8366f = {d.d.f6075c, d.d.f6079g, d.d.f6076d, d.d.f6080h};

        /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0050  */
        @Override // l.C0544J.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = l.C0567h.a()
                int[] r1 = r6.f8361a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = d.AbstractC0435a.f6025l
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4e
            L15:
                int[] r1 = r6.f8363c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = d.AbstractC0435a.f6023j
                goto L11
            L20:
                int[] r1 = r6.f8364d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r8 = r5
            L30:
                r5 = r2
                goto L4e
            L32:
                int r1 = d.d.f6093u
                if (r8 != r1) goto L45
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r0
                r0 = r8
                r8 = r1
                r1 = r5
                goto L30
            L45:
                int r1 = d.d.f6084l
                if (r8 != r1) goto L4a
                goto L2d
            L4a:
                r1 = r0
                r8 = r3
                r5 = r8
                goto L13
            L4e:
                if (r5 == 0) goto L6b
                boolean r3 = l.AbstractC0537C.a(r9)
                if (r3 == 0) goto L5a
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L5a:
                int r7 = l.AbstractC0548N.c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = l.C0567h.d(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L6a
                r9.setAlpha(r0)
            L6a:
                return r2
            L6b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: l.C0567h.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // l.C0544J.c
        public ColorStateList b(Context context, int i3) {
            if (i3 == d.d.f6085m) {
                return AbstractC0467a.a(context, AbstractC0436b.f6037c);
            }
            if (i3 == d.d.f6062I) {
                return AbstractC0467a.a(context, AbstractC0436b.f6040f);
            }
            if (i3 == d.d.f6061H) {
                return k(context);
            }
            if (i3 == d.d.f6078f) {
                return j(context);
            }
            if (i3 == d.d.f6074b) {
                return g(context);
            }
            if (i3 == d.d.f6077e) {
                return i(context);
            }
            if (i3 == d.d.f6057D || i3 == d.d.f6058E) {
                return AbstractC0467a.a(context, AbstractC0436b.f6039e);
            }
            if (f(this.f8362b, i3)) {
                return AbstractC0548N.e(context, AbstractC0435a.f6025l);
            }
            if (f(this.f8365e, i3)) {
                return AbstractC0467a.a(context, AbstractC0436b.f6036b);
            }
            if (f(this.f8366f, i3)) {
                return AbstractC0467a.a(context, AbstractC0436b.f6035a);
            }
            if (i3 == d.d.f6054A) {
                return AbstractC0467a.a(context, AbstractC0436b.f6038d);
            }
            return null;
        }

        @Override // l.C0544J.c
        public Drawable c(C0544J c0544j, Context context, int i3) {
            if (i3 == d.d.f6082j) {
                return new LayerDrawable(new Drawable[]{c0544j.i(context, d.d.f6081i), c0544j.i(context, d.d.f6083k)});
            }
            if (i3 == d.d.f6097y) {
                return l(c0544j, context, d.c.f6047g);
            }
            if (i3 == d.d.f6096x) {
                return l(c0544j, context, d.c.f6048h);
            }
            if (i3 == d.d.f6098z) {
                return l(c0544j, context, d.c.f6049i);
            }
            return null;
        }

        @Override // l.C0544J.c
        public boolean d(Context context, int i3, Drawable drawable) {
            if (i3 == d.d.f6056C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i4 = AbstractC0435a.f6025l;
                m(findDrawableByLayerId, AbstractC0548N.c(context, i4), C0567h.f8358b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), AbstractC0548N.c(context, i4), C0567h.f8358b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), AbstractC0548N.c(context, AbstractC0435a.f6023j), C0567h.f8358b);
                return true;
            }
            if (i3 != d.d.f6097y && i3 != d.d.f6096x && i3 != d.d.f6098z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), AbstractC0548N.b(context, AbstractC0435a.f6025l), C0567h.f8358b);
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i5 = AbstractC0435a.f6023j;
            m(findDrawableByLayerId2, AbstractC0548N.c(context, i5), C0567h.f8358b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), AbstractC0548N.c(context, i5), C0567h.f8358b);
            return true;
        }

        @Override // l.C0544J.c
        public PorterDuff.Mode e(int i3) {
            if (i3 == d.d.f6061H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        public final boolean f(int[] iArr, int i3) {
            for (int i4 : iArr) {
                if (i4 == i3) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i3) {
            int c3 = AbstractC0548N.c(context, AbstractC0435a.f6024k);
            return new ColorStateList(new int[][]{AbstractC0548N.f8276b, AbstractC0548N.f8279e, AbstractC0548N.f8277c, AbstractC0548N.f8283i}, new int[]{AbstractC0548N.b(context, AbstractC0435a.f6022i), C.a.g(c3, i3), C.a.g(c3, i3), i3});
        }

        public final ColorStateList i(Context context) {
            return h(context, AbstractC0548N.c(context, AbstractC0435a.f6021h));
        }

        public final ColorStateList j(Context context) {
            return h(context, AbstractC0548N.c(context, AbstractC0435a.f6022i));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i3 = AbstractC0435a.f6026m;
            ColorStateList e3 = AbstractC0548N.e(context, i3);
            if (e3 == null || !e3.isStateful()) {
                iArr[0] = AbstractC0548N.f8276b;
                iArr2[0] = AbstractC0548N.b(context, i3);
                iArr[1] = AbstractC0548N.f8280f;
                iArr2[1] = AbstractC0548N.c(context, AbstractC0435a.f6023j);
                iArr[2] = AbstractC0548N.f8283i;
                iArr2[2] = AbstractC0548N.c(context, i3);
            } else {
                int[] iArr3 = AbstractC0548N.f8276b;
                iArr[0] = iArr3;
                iArr2[0] = e3.getColorForState(iArr3, 0);
                iArr[1] = AbstractC0548N.f8280f;
                iArr2[1] = AbstractC0548N.c(context, AbstractC0435a.f6023j);
                iArr[2] = AbstractC0548N.f8283i;
                iArr2[2] = e3.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(C0544J c0544j, Context context, int i3) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
            Drawable i4 = c0544j.i(context, d.d.f6059F);
            Drawable i5 = c0544j.i(context, d.d.f6060G);
            if ((i4 instanceof BitmapDrawable) && i4.getIntrinsicWidth() == dimensionPixelSize && i4.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) i4;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                i4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i4.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((i5 instanceof BitmapDrawable) && i5.getIntrinsicWidth() == dimensionPixelSize && i5.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) i5;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                i5.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                i5.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i3, PorterDuff.Mode mode) {
            if (AbstractC0537C.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0567h.f8358b;
            }
            drawable.setColorFilter(C0567h.d(i3, mode));
        }
    }

    public static synchronized C0567h b() {
        C0567h c0567h;
        synchronized (C0567h.class) {
            try {
                if (f8359c == null) {
                    f();
                }
                c0567h = f8359c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0567h;
    }

    public static synchronized PorterDuffColorFilter d(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter k3;
        synchronized (C0567h.class) {
            k3 = C0544J.k(i3, mode);
        }
        return k3;
    }

    public static synchronized void f() {
        synchronized (C0567h.class) {
            if (f8359c == null) {
                C0567h c0567h = new C0567h();
                f8359c = c0567h;
                c0567h.f8360a = C0544J.g();
                f8359c.f8360a.s(new a());
            }
        }
    }

    public static void g(Drawable drawable, C0550P c0550p, int[] iArr) {
        C0544J.u(drawable, c0550p, iArr);
    }

    public synchronized Drawable c(Context context, int i3) {
        return this.f8360a.i(context, i3);
    }

    public synchronized ColorStateList e(Context context, int i3) {
        return this.f8360a.l(context, i3);
    }
}

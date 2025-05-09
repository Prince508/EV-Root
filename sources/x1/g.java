package x1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import e1.AbstractC0464a;
import java.util.BitSet;
import m1.AbstractC0597a;
import o1.AbstractC0648d;
import p1.C0660a;
import w1.C0762a;
import x1.k;
import x1.l;
import x1.m;

/* loaded from: classes.dex */
public class g extends Drawable implements n {

    /* renamed from: B, reason: collision with root package name */
    public static final String f9983B = "g";

    /* renamed from: C, reason: collision with root package name */
    public static final Paint f9984C;

    /* renamed from: A, reason: collision with root package name */
    public boolean f9985A;

    /* renamed from: e, reason: collision with root package name */
    public c f9986e;

    /* renamed from: f, reason: collision with root package name */
    public final m.g[] f9987f;

    /* renamed from: g, reason: collision with root package name */
    public final m.g[] f9988g;

    /* renamed from: h, reason: collision with root package name */
    public final BitSet f9989h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9990i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f9991j;

    /* renamed from: k, reason: collision with root package name */
    public final Path f9992k;

    /* renamed from: l, reason: collision with root package name */
    public final Path f9993l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f9994m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f9995n;

    /* renamed from: o, reason: collision with root package name */
    public final Region f9996o;

    /* renamed from: p, reason: collision with root package name */
    public final Region f9997p;

    /* renamed from: q, reason: collision with root package name */
    public k f9998q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f9999r;

    /* renamed from: s, reason: collision with root package name */
    public final Paint f10000s;

    /* renamed from: t, reason: collision with root package name */
    public final C0762a f10001t;

    /* renamed from: u, reason: collision with root package name */
    public final l.b f10002u;

    /* renamed from: v, reason: collision with root package name */
    public final l f10003v;

    /* renamed from: w, reason: collision with root package name */
    public PorterDuffColorFilter f10004w;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuffColorFilter f10005x;

    /* renamed from: y, reason: collision with root package name */
    public int f10006y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f10007z;

    public class a implements l.b {
        public a() {
        }

        @Override // x1.l.b
        public void a(m mVar, Matrix matrix, int i3) {
            g.this.f9989h.set(i3, mVar.e());
            g.this.f9987f[i3] = mVar.f(matrix);
        }

        @Override // x1.l.b
        public void b(m mVar, Matrix matrix, int i3) {
            g.this.f9989h.set(i3 + 4, mVar.e());
            g.this.f9988g[i3] = mVar.f(matrix);
        }
    }

    public class b implements k.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f10009a;

        public b(float f3) {
            this.f10009a = f3;
        }

        @Override // x1.k.c
        public x1.c a(x1.c cVar) {
            return cVar instanceof i ? cVar : new x1.b(this.f10009a, cVar);
        }
    }

    static {
        Paint paint = new Paint(1);
        f9984C = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public static int O(int i3, int i4) {
        return (i3 * (i4 + (i4 >>> 7))) >>> 8;
    }

    public static g m(Context context, float f3, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(AbstractC0597a.c(context, AbstractC0464a.f6790h, g.class.getSimpleName()));
        }
        g gVar = new g();
        gVar.J(context);
        gVar.T(colorStateList);
        gVar.S(f3);
        return gVar;
    }

    public k A() {
        return this.f9986e.f10011a;
    }

    public final float B() {
        if (I()) {
            return this.f10000s.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float C() {
        return this.f9986e.f10011a.r().a(s());
    }

    public float D() {
        return this.f9986e.f10011a.t().a(s());
    }

    public float E() {
        return this.f9986e.f10026p;
    }

    public float F() {
        return u() + E();
    }

    public final boolean G() {
        c cVar = this.f9986e;
        int i3 = cVar.f10027q;
        if (i3 == 1 || cVar.f10028r <= 0) {
            return false;
        }
        return i3 == 2 || Q();
    }

    public final boolean H() {
        Paint.Style style = this.f9986e.f10032v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean I() {
        Paint.Style style = this.f9986e.f10032v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f10000s.getStrokeWidth() > 0.0f;
    }

    public void J(Context context) {
        this.f9986e.f10012b = new C0660a(context);
        d0();
    }

    public final void K() {
        super.invalidateSelf();
    }

    public boolean L() {
        C0660a c0660a = this.f9986e.f10012b;
        return c0660a != null && c0660a.d();
    }

    public boolean M() {
        return this.f9986e.f10011a.u(s());
    }

    public final void N(Canvas canvas) {
        if (G()) {
            canvas.save();
            P(canvas);
            if (!this.f9985A) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f10007z.width() - getBounds().width());
            int height = (int) (this.f10007z.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f10007z.width()) + (this.f9986e.f10028r * 2) + width, ((int) this.f10007z.height()) + (this.f9986e.f10028r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f3 = (getBounds().left - this.f9986e.f10028r) - width;
            float f4 = (getBounds().top - this.f9986e.f10028r) - height;
            canvas2.translate(-f3, -f4);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f3, f4, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    public final void P(Canvas canvas) {
        canvas.translate(y(), z());
    }

    public boolean Q() {
        return (M() || this.f9992k.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void R(x1.c cVar) {
        setShapeAppearanceModel(this.f9986e.f10011a.x(cVar));
    }

    public void S(float f3) {
        c cVar = this.f9986e;
        if (cVar.f10025o != f3) {
            cVar.f10025o = f3;
            d0();
        }
    }

    public void T(ColorStateList colorStateList) {
        c cVar = this.f9986e;
        if (cVar.f10014d != colorStateList) {
            cVar.f10014d = colorStateList;
            onStateChange(getState());
        }
    }

    public void U(float f3) {
        c cVar = this.f9986e;
        if (cVar.f10021k != f3) {
            cVar.f10021k = f3;
            this.f9990i = true;
            invalidateSelf();
        }
    }

    public void V(int i3, int i4, int i5, int i6) {
        c cVar = this.f9986e;
        if (cVar.f10019i == null) {
            cVar.f10019i = new Rect();
        }
        this.f9986e.f10019i.set(i3, i4, i5, i6);
        invalidateSelf();
    }

    public void W(float f3) {
        c cVar = this.f9986e;
        if (cVar.f10024n != f3) {
            cVar.f10024n = f3;
            d0();
        }
    }

    public void X(float f3, int i3) {
        a0(f3);
        Z(ColorStateList.valueOf(i3));
    }

    public void Y(float f3, ColorStateList colorStateList) {
        a0(f3);
        Z(colorStateList);
    }

    public void Z(ColorStateList colorStateList) {
        c cVar = this.f9986e;
        if (cVar.f10015e != colorStateList) {
            cVar.f10015e = colorStateList;
            onStateChange(getState());
        }
    }

    public void a0(float f3) {
        this.f9986e.f10022l = f3;
        invalidateSelf();
    }

    public final boolean b0(int[] iArr) {
        boolean z3;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f9986e.f10014d == null || color2 == (colorForState2 = this.f9986e.f10014d.getColorForState(iArr, (color2 = this.f9999r.getColor())))) {
            z3 = false;
        } else {
            this.f9999r.setColor(colorForState2);
            z3 = true;
        }
        if (this.f9986e.f10015e == null || color == (colorForState = this.f9986e.f10015e.getColorForState(iArr, (color = this.f10000s.getColor())))) {
            return z3;
        }
        this.f10000s.setColor(colorForState);
        return true;
    }

    public final boolean c0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f10004w;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f10005x;
        c cVar = this.f9986e;
        this.f10004w = k(cVar.f10017g, cVar.f10018h, this.f9999r, true);
        c cVar2 = this.f9986e;
        this.f10005x = k(cVar2.f10016f, cVar2.f10018h, this.f10000s, false);
        c cVar3 = this.f9986e;
        if (cVar3.f10031u) {
            this.f10001t.d(cVar3.f10017g.getColorForState(getState(), 0));
        }
        return (J.c.a(porterDuffColorFilter, this.f10004w) && J.c.a(porterDuffColorFilter2, this.f10005x)) ? false : true;
    }

    public final void d0() {
        float F3 = F();
        this.f9986e.f10028r = (int) Math.ceil(0.75f * F3);
        this.f9986e.f10029s = (int) Math.ceil(F3 * 0.25f);
        c0();
        K();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f9999r.setColorFilter(this.f10004w);
        int alpha = this.f9999r.getAlpha();
        this.f9999r.setAlpha(O(alpha, this.f9986e.f10023m));
        this.f10000s.setColorFilter(this.f10005x);
        this.f10000s.setStrokeWidth(this.f9986e.f10022l);
        int alpha2 = this.f10000s.getAlpha();
        this.f10000s.setAlpha(O(alpha2, this.f9986e.f10023m));
        if (this.f9990i) {
            i();
            g(s(), this.f9992k);
            this.f9990i = false;
        }
        N(canvas);
        if (H()) {
            o(canvas);
        }
        if (I()) {
            r(canvas);
        }
        this.f9999r.setAlpha(alpha);
        this.f10000s.setAlpha(alpha2);
    }

    public final PorterDuffColorFilter f(Paint paint, boolean z3) {
        if (!z3) {
            return null;
        }
        int color = paint.getColor();
        int l3 = l(color);
        this.f10006y = l3;
        if (l3 != color) {
            return new PorterDuffColorFilter(l3, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public final void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f9986e.f10020j != 1.0f) {
            this.f9991j.reset();
            Matrix matrix = this.f9991j;
            float f3 = this.f9986e.f10020j;
            matrix.setScale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f9991j);
        }
        path.computeBounds(this.f10007z, true);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9986e.f10023m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f9986e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f9986e.f10027q == 2) {
            return;
        }
        if (M()) {
            outline.setRoundRect(getBounds(), C() * this.f9986e.f10021k);
        } else {
            g(s(), this.f9992k);
            AbstractC0648d.b(outline, this.f9992k);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f9986e.f10019i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f9996o.set(getBounds());
        g(s(), this.f9992k);
        this.f9997p.setPath(this.f9992k, this.f9996o);
        this.f9996o.op(this.f9997p, Region.Op.DIFFERENCE);
        return this.f9996o;
    }

    public final void h(RectF rectF, Path path) {
        l lVar = this.f10003v;
        c cVar = this.f9986e;
        lVar.e(cVar.f10011a, cVar.f10021k, rectF, this.f10002u, path);
    }

    public final void i() {
        k y3 = A().y(new b(-B()));
        this.f9998q = y3;
        this.f10003v.d(y3, this.f9986e.f10021k, t(), this.f9993l);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f9990i = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f9986e.f10017g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f9986e.f10016f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f9986e.f10015e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f9986e.f10014d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    public final PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z3) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z3) {
            colorForState = l(colorForState);
        }
        this.f10006y = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z3) {
        return (colorStateList == null || mode == null) ? f(paint, z3) : j(colorStateList, mode, z3);
    }

    public int l(int i3) {
        float F3 = F() + x();
        C0660a c0660a = this.f9986e.f10012b;
        return c0660a != null ? c0660a.c(i3, F3) : i3;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f9986e = new c(this.f9986e);
        return this;
    }

    public final void n(Canvas canvas) {
        if (this.f9989h.cardinality() > 0) {
            Log.w(f9983B, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f9986e.f10029s != 0) {
            canvas.drawPath(this.f9992k, this.f10001t.c());
        }
        for (int i3 = 0; i3 < 4; i3++) {
            this.f9987f[i3].b(this.f10001t, this.f9986e.f10028r, canvas);
            this.f9988g[i3].b(this.f10001t, this.f9986e.f10028r, canvas);
        }
        if (this.f9985A) {
            int y3 = y();
            int z3 = z();
            canvas.translate(-y3, -z3);
            canvas.drawPath(this.f9992k, f9984C);
            canvas.translate(y3, z3);
        }
    }

    public final void o(Canvas canvas) {
        q(canvas, this.f9999r, this.f9992k, this.f9986e.f10011a, s());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f9990i = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, r1.i.b
    public boolean onStateChange(int[] iArr) {
        boolean z3 = b0(iArr) || c0();
        if (z3) {
            invalidateSelf();
        }
        return z3;
    }

    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f9986e.f10011a, rectF);
    }

    public final void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a3 = kVar.t().a(rectF) * this.f9986e.f10021k;
            canvas.drawRoundRect(rectF, a3, a3, paint);
        }
    }

    public void r(Canvas canvas) {
        q(canvas, this.f10000s, this.f9993l, this.f9998q, t());
    }

    public RectF s() {
        this.f9994m.set(getBounds());
        return this.f9994m;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        c cVar = this.f9986e;
        if (cVar.f10023m != i3) {
            cVar.f10023m = i3;
            K();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f9986e.f10013c = colorFilter;
        K();
    }

    @Override // x1.n
    public void setShapeAppearanceModel(k kVar) {
        this.f9986e.f10011a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i3) {
        setTintList(ColorStateList.valueOf(i3));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f9986e.f10017g = colorStateList;
        c0();
        K();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f9986e;
        if (cVar.f10018h != mode) {
            cVar.f10018h = mode;
            c0();
            K();
        }
    }

    public final RectF t() {
        this.f9995n.set(s());
        float B3 = B();
        this.f9995n.inset(B3, B3);
        return this.f9995n;
    }

    public float u() {
        return this.f9986e.f10025o;
    }

    public ColorStateList v() {
        return this.f9986e.f10014d;
    }

    public float w() {
        return this.f9986e.f10021k;
    }

    public float x() {
        return this.f9986e.f10024n;
    }

    public int y() {
        c cVar = this.f9986e;
        return (int) (cVar.f10029s * Math.sin(Math.toRadians(cVar.f10030t)));
    }

    public int z() {
        c cVar = this.f9986e;
        return (int) (cVar.f10029s * Math.cos(Math.toRadians(cVar.f10030t)));
    }

    public g(Context context, AttributeSet attributeSet, int i3, int i4) {
        this(k.e(context, attributeSet, i3, i4).m());
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    public g(c cVar) {
        l lVar;
        this.f9987f = new m.g[4];
        this.f9988g = new m.g[4];
        this.f9989h = new BitSet(8);
        this.f9991j = new Matrix();
        this.f9992k = new Path();
        this.f9993l = new Path();
        this.f9994m = new RectF();
        this.f9995n = new RectF();
        this.f9996o = new Region();
        this.f9997p = new Region();
        Paint paint = new Paint(1);
        this.f9999r = paint;
        Paint paint2 = new Paint(1);
        this.f10000s = paint2;
        this.f10001t = new C0762a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = l.k();
        } else {
            lVar = new l();
        }
        this.f10003v = lVar;
        this.f10007z = new RectF();
        this.f9985A = true;
        this.f9986e = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        c0();
        b0(getState());
        this.f10002u = new a();
    }

    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public k f10011a;

        /* renamed from: b, reason: collision with root package name */
        public C0660a f10012b;

        /* renamed from: c, reason: collision with root package name */
        public ColorFilter f10013c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f10014d;

        /* renamed from: e, reason: collision with root package name */
        public ColorStateList f10015e;

        /* renamed from: f, reason: collision with root package name */
        public ColorStateList f10016f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f10017g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f10018h;

        /* renamed from: i, reason: collision with root package name */
        public Rect f10019i;

        /* renamed from: j, reason: collision with root package name */
        public float f10020j;

        /* renamed from: k, reason: collision with root package name */
        public float f10021k;

        /* renamed from: l, reason: collision with root package name */
        public float f10022l;

        /* renamed from: m, reason: collision with root package name */
        public int f10023m;

        /* renamed from: n, reason: collision with root package name */
        public float f10024n;

        /* renamed from: o, reason: collision with root package name */
        public float f10025o;

        /* renamed from: p, reason: collision with root package name */
        public float f10026p;

        /* renamed from: q, reason: collision with root package name */
        public int f10027q;

        /* renamed from: r, reason: collision with root package name */
        public int f10028r;

        /* renamed from: s, reason: collision with root package name */
        public int f10029s;

        /* renamed from: t, reason: collision with root package name */
        public int f10030t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f10031u;

        /* renamed from: v, reason: collision with root package name */
        public Paint.Style f10032v;

        public c(k kVar, C0660a c0660a) {
            this.f10014d = null;
            this.f10015e = null;
            this.f10016f = null;
            this.f10017g = null;
            this.f10018h = PorterDuff.Mode.SRC_IN;
            this.f10019i = null;
            this.f10020j = 1.0f;
            this.f10021k = 1.0f;
            this.f10023m = 255;
            this.f10024n = 0.0f;
            this.f10025o = 0.0f;
            this.f10026p = 0.0f;
            this.f10027q = 0;
            this.f10028r = 0;
            this.f10029s = 0;
            this.f10030t = 0;
            this.f10031u = false;
            this.f10032v = Paint.Style.FILL_AND_STROKE;
            this.f10011a = kVar;
            this.f10012b = c0660a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f9990i = true;
            return gVar;
        }

        public c(c cVar) {
            this.f10014d = null;
            this.f10015e = null;
            this.f10016f = null;
            this.f10017g = null;
            this.f10018h = PorterDuff.Mode.SRC_IN;
            this.f10019i = null;
            this.f10020j = 1.0f;
            this.f10021k = 1.0f;
            this.f10023m = 255;
            this.f10024n = 0.0f;
            this.f10025o = 0.0f;
            this.f10026p = 0.0f;
            this.f10027q = 0;
            this.f10028r = 0;
            this.f10029s = 0;
            this.f10030t = 0;
            this.f10031u = false;
            this.f10032v = Paint.Style.FILL_AND_STROKE;
            this.f10011a = cVar.f10011a;
            this.f10012b = cVar.f10012b;
            this.f10022l = cVar.f10022l;
            this.f10013c = cVar.f10013c;
            this.f10014d = cVar.f10014d;
            this.f10015e = cVar.f10015e;
            this.f10018h = cVar.f10018h;
            this.f10017g = cVar.f10017g;
            this.f10023m = cVar.f10023m;
            this.f10020j = cVar.f10020j;
            this.f10029s = cVar.f10029s;
            this.f10027q = cVar.f10027q;
            this.f10031u = cVar.f10031u;
            this.f10021k = cVar.f10021k;
            this.f10024n = cVar.f10024n;
            this.f10025o = cVar.f10025o;
            this.f10026p = cVar.f10026p;
            this.f10028r = cVar.f10028r;
            this.f10030t = cVar.f10030t;
            this.f10016f = cVar.f10016f;
            this.f10032v = cVar.f10032v;
            if (cVar.f10019i != null) {
                this.f10019i = new Rect(cVar.f10019i);
            }
        }
    }
}

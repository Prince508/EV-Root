package u1;

import B.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;

/* renamed from: u1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0741d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f9617a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f9618b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f9619c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9620d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9621e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9622f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9623g;

    /* renamed from: h, reason: collision with root package name */
    public final float f9624h;

    /* renamed from: i, reason: collision with root package name */
    public final float f9625i;

    /* renamed from: j, reason: collision with root package name */
    public final float f9626j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f9627k;

    /* renamed from: l, reason: collision with root package name */
    public final float f9628l;

    /* renamed from: m, reason: collision with root package name */
    public ColorStateList f9629m;

    /* renamed from: n, reason: collision with root package name */
    public float f9630n;

    /* renamed from: o, reason: collision with root package name */
    public final int f9631o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9632p = false;

    /* renamed from: q, reason: collision with root package name */
    public Typeface f9633q;

    /* renamed from: u1.d$a */
    public class a extends f.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0743f f9634a;

        public a(AbstractC0743f abstractC0743f) {
            this.f9634a = abstractC0743f;
        }

        @Override // B.f.e
        public void f(int i3) {
            C0741d.this.f9632p = true;
            this.f9634a.a(i3);
        }

        @Override // B.f.e
        public void g(Typeface typeface) {
            C0741d c0741d = C0741d.this;
            c0741d.f9633q = Typeface.create(typeface, c0741d.f9621e);
            C0741d.this.f9632p = true;
            this.f9634a.b(C0741d.this.f9633q, false);
        }
    }

    /* renamed from: u1.d$b */
    public class b extends AbstractC0743f {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f9636a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextPaint f9637b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC0743f f9638c;

        public b(Context context, TextPaint textPaint, AbstractC0743f abstractC0743f) {
            this.f9636a = context;
            this.f9637b = textPaint;
            this.f9638c = abstractC0743f;
        }

        @Override // u1.AbstractC0743f
        public void a(int i3) {
            this.f9638c.a(i3);
        }

        @Override // u1.AbstractC0743f
        public void b(Typeface typeface, boolean z3) {
            C0741d.this.p(this.f9636a, this.f9637b, typeface);
            this.f9638c.b(typeface, z3);
        }
    }

    public C0741d(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, e1.j.y4);
        l(obtainStyledAttributes.getDimension(e1.j.z4, 0.0f));
        k(AbstractC0740c.a(context, obtainStyledAttributes, e1.j.C4));
        this.f9617a = AbstractC0740c.a(context, obtainStyledAttributes, e1.j.D4);
        this.f9618b = AbstractC0740c.a(context, obtainStyledAttributes, e1.j.E4);
        this.f9621e = obtainStyledAttributes.getInt(e1.j.B4, 0);
        this.f9622f = obtainStyledAttributes.getInt(e1.j.A4, 1);
        int d3 = AbstractC0740c.d(obtainStyledAttributes, e1.j.K4, e1.j.J4);
        this.f9631o = obtainStyledAttributes.getResourceId(d3, 0);
        this.f9620d = obtainStyledAttributes.getString(d3);
        this.f9623g = obtainStyledAttributes.getBoolean(e1.j.L4, false);
        this.f9619c = AbstractC0740c.a(context, obtainStyledAttributes, e1.j.F4);
        this.f9624h = obtainStyledAttributes.getFloat(e1.j.G4, 0.0f);
        this.f9625i = obtainStyledAttributes.getFloat(e1.j.H4, 0.0f);
        this.f9626j = obtainStyledAttributes.getFloat(e1.j.I4, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i3, e1.j.X2);
        int i4 = e1.j.Y2;
        this.f9627k = obtainStyledAttributes2.hasValue(i4);
        this.f9628l = obtainStyledAttributes2.getFloat(i4, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.f9633q == null && (str = this.f9620d) != null) {
            this.f9633q = Typeface.create(str, this.f9621e);
        }
        if (this.f9633q == null) {
            int i3 = this.f9622f;
            if (i3 == 1) {
                this.f9633q = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.f9633q = Typeface.SERIF;
            } else if (i3 != 3) {
                this.f9633q = Typeface.DEFAULT;
            } else {
                this.f9633q = Typeface.MONOSPACE;
            }
            this.f9633q = Typeface.create(this.f9633q, this.f9621e);
        }
    }

    public Typeface e() {
        d();
        return this.f9633q;
    }

    public Typeface f(Context context) {
        if (this.f9632p) {
            return this.f9633q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g3 = B.f.g(context, this.f9631o);
                this.f9633q = g3;
                if (g3 != null) {
                    this.f9633q = Typeface.create(g3, this.f9621e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e3) {
                Log.d("TextAppearance", "Error loading font " + this.f9620d, e3);
            }
        }
        d();
        this.f9632p = true;
        return this.f9633q;
    }

    public void g(Context context, TextPaint textPaint, AbstractC0743f abstractC0743f) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, abstractC0743f));
    }

    public void h(Context context, AbstractC0743f abstractC0743f) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i3 = this.f9631o;
        if (i3 == 0) {
            this.f9632p = true;
        }
        if (this.f9632p) {
            abstractC0743f.b(this.f9633q, true);
            return;
        }
        try {
            B.f.i(context, i3, new a(abstractC0743f), null);
        } catch (Resources.NotFoundException unused) {
            this.f9632p = true;
            abstractC0743f.a(1);
        } catch (Exception e3) {
            Log.d("TextAppearance", "Error loading font " + this.f9620d, e3);
            this.f9632p = true;
            abstractC0743f.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f9629m;
    }

    public float j() {
        return this.f9630n;
    }

    public void k(ColorStateList colorStateList) {
        this.f9629m = colorStateList;
    }

    public void l(float f3) {
        this.f9630n = f3;
    }

    public final boolean m(Context context) {
        if (AbstractC0742e.a()) {
            return true;
        }
        int i3 = this.f9631o;
        return (i3 != 0 ? B.f.c(context, i3) : null) != null;
    }

    public void n(Context context, TextPaint textPaint, AbstractC0743f abstractC0743f) {
        o(context, textPaint, abstractC0743f);
        ColorStateList colorStateList = this.f9629m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f3 = this.f9626j;
        float f4 = this.f9624h;
        float f5 = this.f9625i;
        ColorStateList colorStateList2 = this.f9619c;
        textPaint.setShadowLayer(f3, f4, f5, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, AbstractC0743f abstractC0743f) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, abstractC0743f);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a3 = AbstractC0747j.a(context, typeface);
        if (a3 != null) {
            typeface = a3;
        }
        textPaint.setTypeface(typeface);
        int i3 = this.f9621e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i3 & 1) != 0);
        textPaint.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f9630n);
        if (this.f9627k) {
            textPaint.setLetterSpacing(this.f9628l);
        }
    }
}

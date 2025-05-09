package x1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes.dex */
public class k {

    /* renamed from: m, reason: collision with root package name */
    public static final x1.c f10035m = new i(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public d f10036a;

    /* renamed from: b, reason: collision with root package name */
    public d f10037b;

    /* renamed from: c, reason: collision with root package name */
    public d f10038c;

    /* renamed from: d, reason: collision with root package name */
    public d f10039d;

    /* renamed from: e, reason: collision with root package name */
    public x1.c f10040e;

    /* renamed from: f, reason: collision with root package name */
    public x1.c f10041f;

    /* renamed from: g, reason: collision with root package name */
    public x1.c f10042g;

    /* renamed from: h, reason: collision with root package name */
    public x1.c f10043h;

    /* renamed from: i, reason: collision with root package name */
    public f f10044i;

    /* renamed from: j, reason: collision with root package name */
    public f f10045j;

    /* renamed from: k, reason: collision with root package name */
    public f f10046k;

    /* renamed from: l, reason: collision with root package name */
    public f f10047l;

    public interface c {
        x1.c a(x1.c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i3, int i4) {
        return c(context, i3, i4, 0);
    }

    public static b c(Context context, int i3, int i4, int i5) {
        return d(context, i3, i4, new C0767a(i5));
    }

    public static b d(Context context, int i3, int i4, x1.c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i3);
        if (i4 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i4);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(e1.j.K3);
        try {
            int i5 = obtainStyledAttributes.getInt(e1.j.L3, 0);
            int i6 = obtainStyledAttributes.getInt(e1.j.O3, i5);
            int i7 = obtainStyledAttributes.getInt(e1.j.P3, i5);
            int i8 = obtainStyledAttributes.getInt(e1.j.N3, i5);
            int i9 = obtainStyledAttributes.getInt(e1.j.M3, i5);
            x1.c m3 = m(obtainStyledAttributes, e1.j.Q3, cVar);
            x1.c m4 = m(obtainStyledAttributes, e1.j.T3, m3);
            x1.c m5 = m(obtainStyledAttributes, e1.j.U3, m3);
            x1.c m6 = m(obtainStyledAttributes, e1.j.S3, m3);
            return new b().y(i6, m4).C(i7, m5).u(i8, m6).q(i9, m(obtainStyledAttributes, e1.j.R3, m3));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i3, int i4) {
        return f(context, attributeSet, i3, i4, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i3, int i4, int i5) {
        return g(context, attributeSet, i3, i4, new C0767a(i5));
    }

    public static b g(Context context, AttributeSet attributeSet, int i3, int i4, x1.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e1.j.f7040T2, i3, i4);
        int resourceId = obtainStyledAttributes.getResourceId(e1.j.f7044U2, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(e1.j.V2, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    public static x1.c m(TypedArray typedArray, int i3, x1.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i3);
        if (peekValue != null) {
            int i4 = peekValue.type;
            if (i4 == 5) {
                return new C0767a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i4 == 6) {
                return new i(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public f h() {
        return this.f10046k;
    }

    public d i() {
        return this.f10039d;
    }

    public x1.c j() {
        return this.f10043h;
    }

    public d k() {
        return this.f10038c;
    }

    public x1.c l() {
        return this.f10042g;
    }

    public f n() {
        return this.f10047l;
    }

    public f o() {
        return this.f10045j;
    }

    public f p() {
        return this.f10044i;
    }

    public d q() {
        return this.f10036a;
    }

    public x1.c r() {
        return this.f10040e;
    }

    public d s() {
        return this.f10037b;
    }

    public x1.c t() {
        return this.f10041f;
    }

    public boolean u(RectF rectF) {
        boolean z3 = this.f10047l.getClass().equals(f.class) && this.f10045j.getClass().equals(f.class) && this.f10044i.getClass().equals(f.class) && this.f10046k.getClass().equals(f.class);
        float a3 = this.f10040e.a(rectF);
        return z3 && ((this.f10041f.a(rectF) > a3 ? 1 : (this.f10041f.a(rectF) == a3 ? 0 : -1)) == 0 && (this.f10043h.a(rectF) > a3 ? 1 : (this.f10043h.a(rectF) == a3 ? 0 : -1)) == 0 && (this.f10042g.a(rectF) > a3 ? 1 : (this.f10042g.a(rectF) == a3 ? 0 : -1)) == 0) && ((this.f10037b instanceof j) && (this.f10036a instanceof j) && (this.f10038c instanceof j) && (this.f10039d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f3) {
        return v().o(f3).m();
    }

    public k x(x1.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    public k(b bVar) {
        this.f10036a = bVar.f10048a;
        this.f10037b = bVar.f10049b;
        this.f10038c = bVar.f10050c;
        this.f10039d = bVar.f10051d;
        this.f10040e = bVar.f10052e;
        this.f10041f = bVar.f10053f;
        this.f10042g = bVar.f10054g;
        this.f10043h = bVar.f10055h;
        this.f10044i = bVar.f10056i;
        this.f10045j = bVar.f10057j;
        this.f10046k = bVar.f10058k;
        this.f10047l = bVar.f10059l;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public d f10048a;

        /* renamed from: b, reason: collision with root package name */
        public d f10049b;

        /* renamed from: c, reason: collision with root package name */
        public d f10050c;

        /* renamed from: d, reason: collision with root package name */
        public d f10051d;

        /* renamed from: e, reason: collision with root package name */
        public x1.c f10052e;

        /* renamed from: f, reason: collision with root package name */
        public x1.c f10053f;

        /* renamed from: g, reason: collision with root package name */
        public x1.c f10054g;

        /* renamed from: h, reason: collision with root package name */
        public x1.c f10055h;

        /* renamed from: i, reason: collision with root package name */
        public f f10056i;

        /* renamed from: j, reason: collision with root package name */
        public f f10057j;

        /* renamed from: k, reason: collision with root package name */
        public f f10058k;

        /* renamed from: l, reason: collision with root package name */
        public f f10059l;

        public b() {
            this.f10048a = h.b();
            this.f10049b = h.b();
            this.f10050c = h.b();
            this.f10051d = h.b();
            this.f10052e = new C0767a(0.0f);
            this.f10053f = new C0767a(0.0f);
            this.f10054g = new C0767a(0.0f);
            this.f10055h = new C0767a(0.0f);
            this.f10056i = h.c();
            this.f10057j = h.c();
            this.f10058k = h.c();
            this.f10059l = h.c();
        }

        public static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f10034a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f9982a;
            }
            return -1.0f;
        }

        public b A(float f3) {
            this.f10052e = new C0767a(f3);
            return this;
        }

        public b B(x1.c cVar) {
            this.f10052e = cVar;
            return this;
        }

        public b C(int i3, x1.c cVar) {
            return D(h.a(i3)).F(cVar);
        }

        public b D(d dVar) {
            this.f10049b = dVar;
            float n3 = n(dVar);
            if (n3 != -1.0f) {
                E(n3);
            }
            return this;
        }

        public b E(float f3) {
            this.f10053f = new C0767a(f3);
            return this;
        }

        public b F(x1.c cVar) {
            this.f10053f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f3) {
            return A(f3).E(f3).w(f3).s(f3);
        }

        public b p(x1.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i3, x1.c cVar) {
            return r(h.a(i3)).t(cVar);
        }

        public b r(d dVar) {
            this.f10051d = dVar;
            float n3 = n(dVar);
            if (n3 != -1.0f) {
                s(n3);
            }
            return this;
        }

        public b s(float f3) {
            this.f10055h = new C0767a(f3);
            return this;
        }

        public b t(x1.c cVar) {
            this.f10055h = cVar;
            return this;
        }

        public b u(int i3, x1.c cVar) {
            return v(h.a(i3)).x(cVar);
        }

        public b v(d dVar) {
            this.f10050c = dVar;
            float n3 = n(dVar);
            if (n3 != -1.0f) {
                w(n3);
            }
            return this;
        }

        public b w(float f3) {
            this.f10054g = new C0767a(f3);
            return this;
        }

        public b x(x1.c cVar) {
            this.f10054g = cVar;
            return this;
        }

        public b y(int i3, x1.c cVar) {
            return z(h.a(i3)).B(cVar);
        }

        public b z(d dVar) {
            this.f10048a = dVar;
            float n3 = n(dVar);
            if (n3 != -1.0f) {
                A(n3);
            }
            return this;
        }

        public b(k kVar) {
            this.f10048a = h.b();
            this.f10049b = h.b();
            this.f10050c = h.b();
            this.f10051d = h.b();
            this.f10052e = new C0767a(0.0f);
            this.f10053f = new C0767a(0.0f);
            this.f10054g = new C0767a(0.0f);
            this.f10055h = new C0767a(0.0f);
            this.f10056i = h.c();
            this.f10057j = h.c();
            this.f10058k = h.c();
            this.f10059l = h.c();
            this.f10048a = kVar.f10036a;
            this.f10049b = kVar.f10037b;
            this.f10050c = kVar.f10038c;
            this.f10051d = kVar.f10039d;
            this.f10052e = kVar.f10040e;
            this.f10053f = kVar.f10041f;
            this.f10054g = kVar.f10042g;
            this.f10055h = kVar.f10043h;
            this.f10056i = kVar.f10044i;
            this.f10057j = kVar.f10045j;
            this.f10058k = kVar.f10046k;
            this.f10059l = kVar.f10047l;
        }
    }

    public k() {
        this.f10036a = h.b();
        this.f10037b = h.b();
        this.f10038c = h.b();
        this.f10039d = h.b();
        this.f10040e = new C0767a(0.0f);
        this.f10041f = new C0767a(0.0f);
        this.f10042g = new C0767a(0.0f);
        this.f10043h = new C0767a(0.0f);
        this.f10044i = h.c();
        this.f10045j = h.c();
        this.f10046k = h.c();
        this.f10047l = h.c();
    }
}

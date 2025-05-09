package x1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w1.C0762a;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public float f10078a;

    /* renamed from: b, reason: collision with root package name */
    public float f10079b;

    /* renamed from: c, reason: collision with root package name */
    public float f10080c;

    /* renamed from: d, reason: collision with root package name */
    public float f10081d;

    /* renamed from: e, reason: collision with root package name */
    public float f10082e;

    /* renamed from: f, reason: collision with root package name */
    public float f10083f;

    /* renamed from: g, reason: collision with root package name */
    public final List f10084g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final List f10085h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f10086i;

    public class a extends g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f10087c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Matrix f10088d;

        public a(List list, Matrix matrix) {
            this.f10087c = list;
            this.f10088d = matrix;
        }

        @Override // x1.m.g
        public void a(Matrix matrix, C0762a c0762a, int i3, Canvas canvas) {
            Iterator it = this.f10087c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f10088d, c0762a, i3, canvas);
            }
        }
    }

    public static class b extends g {

        /* renamed from: c, reason: collision with root package name */
        public final d f10090c;

        public b(d dVar) {
            this.f10090c = dVar;
        }

        @Override // x1.m.g
        public void a(Matrix matrix, C0762a c0762a, int i3, Canvas canvas) {
            c0762a.a(canvas, matrix, new RectF(this.f10090c.k(), this.f10090c.o(), this.f10090c.l(), this.f10090c.j()), i3, this.f10090c.m(), this.f10090c.n());
        }
    }

    public static class c extends g {

        /* renamed from: c, reason: collision with root package name */
        public final e f10091c;

        /* renamed from: d, reason: collision with root package name */
        public final float f10092d;

        /* renamed from: e, reason: collision with root package name */
        public final float f10093e;

        public c(e eVar, float f3, float f4) {
            this.f10091c = eVar;
            this.f10092d = f3;
            this.f10093e = f4;
        }

        @Override // x1.m.g
        public void a(Matrix matrix, C0762a c0762a, int i3, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f10091c.f10102c - this.f10093e, this.f10091c.f10101b - this.f10092d), 0.0f);
            this.f10105a.set(matrix);
            this.f10105a.preTranslate(this.f10092d, this.f10093e);
            this.f10105a.preRotate(c());
            c0762a.b(canvas, this.f10105a, rectF, i3);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f10091c.f10102c - this.f10093e) / (this.f10091c.f10101b - this.f10092d)));
        }
    }

    public static class d extends f {

        /* renamed from: h, reason: collision with root package name */
        public static final RectF f10094h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        public float f10095b;

        /* renamed from: c, reason: collision with root package name */
        public float f10096c;

        /* renamed from: d, reason: collision with root package name */
        public float f10097d;

        /* renamed from: e, reason: collision with root package name */
        public float f10098e;

        /* renamed from: f, reason: collision with root package name */
        public float f10099f;

        /* renamed from: g, reason: collision with root package name */
        public float f10100g;

        public d(float f3, float f4, float f5, float f6) {
            q(f3);
            u(f4);
            r(f5);
            p(f6);
        }

        @Override // x1.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f10103a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f10094h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f10098e;
        }

        public final float k() {
            return this.f10095b;
        }

        public final float l() {
            return this.f10097d;
        }

        public final float m() {
            return this.f10099f;
        }

        public final float n() {
            return this.f10100g;
        }

        public final float o() {
            return this.f10096c;
        }

        public final void p(float f3) {
            this.f10098e = f3;
        }

        public final void q(float f3) {
            this.f10095b = f3;
        }

        public final void r(float f3) {
            this.f10097d = f3;
        }

        public final void s(float f3) {
            this.f10099f = f3;
        }

        public final void t(float f3) {
            this.f10100g = f3;
        }

        public final void u(float f3) {
            this.f10096c = f3;
        }
    }

    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        public float f10101b;

        /* renamed from: c, reason: collision with root package name */
        public float f10102c;

        @Override // x1.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f10103a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f10101b, this.f10102c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f10103a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class g {

        /* renamed from: b, reason: collision with root package name */
        public static final Matrix f10104b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f10105a = new Matrix();

        public abstract void a(Matrix matrix, C0762a c0762a, int i3, Canvas canvas);

        public final void b(C0762a c0762a, int i3, Canvas canvas) {
            a(f10104b, c0762a, i3, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    public void a(float f3, float f4, float f5, float f6, float f7, float f8) {
        d dVar = new d(f3, f4, f5, f6);
        dVar.s(f7);
        dVar.t(f8);
        this.f10084g.add(dVar);
        b bVar = new b(dVar);
        float f9 = f7 + f8;
        boolean z3 = f8 < 0.0f;
        if (z3) {
            f7 = (f7 + 180.0f) % 360.0f;
        }
        c(bVar, f7, z3 ? (180.0f + f9) % 360.0f : f9);
        double d3 = f9;
        r(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.cos(Math.toRadians(d3)))));
        s(((f4 + f6) * 0.5f) + (((f6 - f4) / 2.0f) * ((float) Math.sin(Math.toRadians(d3)))));
    }

    public final void b(float f3) {
        if (g() == f3) {
            return;
        }
        float g3 = ((f3 - g()) + 360.0f) % 360.0f;
        if (g3 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g3);
        this.f10085h.add(new b(dVar));
        p(f3);
    }

    public final void c(g gVar, float f3, float f4) {
        b(f3);
        this.f10085h.add(gVar);
        p(f4);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f10084g.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((f) this.f10084g.get(i3)).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f10086i;
    }

    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f10085h), new Matrix(matrix));
    }

    public final float g() {
        return this.f10082e;
    }

    public final float h() {
        return this.f10083f;
    }

    public float i() {
        return this.f10080c;
    }

    public float j() {
        return this.f10081d;
    }

    public float k() {
        return this.f10078a;
    }

    public float l() {
        return this.f10079b;
    }

    public void m(float f3, float f4) {
        e eVar = new e();
        eVar.f10101b = f3;
        eVar.f10102c = f4;
        this.f10084g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f3);
        s(f4);
    }

    public void n(float f3, float f4) {
        o(f3, f4, 270.0f, 0.0f);
    }

    public void o(float f3, float f4, float f5, float f6) {
        t(f3);
        u(f4);
        r(f3);
        s(f4);
        p(f5);
        q((f5 + f6) % 360.0f);
        this.f10084g.clear();
        this.f10085h.clear();
        this.f10086i = false;
    }

    public final void p(float f3) {
        this.f10082e = f3;
    }

    public final void q(float f3) {
        this.f10083f = f3;
    }

    public final void r(float f3) {
        this.f10080c = f3;
    }

    public final void s(float f3) {
        this.f10081d = f3;
    }

    public final void t(float f3) {
        this.f10078a = f3;
    }

    public final void u(float f3) {
        this.f10079b = f3;
    }
}

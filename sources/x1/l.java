package x1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final m[] f10060a = new m[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f10061b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f10062c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f10063d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f10064e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f10065f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final m f10066g = new m();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f10067h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f10068i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f10069j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f10070k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public boolean f10071l = true;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final l f10072a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i3);

        void b(m mVar, Matrix matrix, int i3);
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final k f10073a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f10074b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f10075c;

        /* renamed from: d, reason: collision with root package name */
        public final b f10076d;

        /* renamed from: e, reason: collision with root package name */
        public final float f10077e;

        public c(k kVar, float f3, RectF rectF, b bVar, Path path) {
            this.f10076d = bVar;
            this.f10073a = kVar;
            this.f10077e = f3;
            this.f10075c = rectF;
            this.f10074b = path;
        }
    }

    public l() {
        for (int i3 = 0; i3 < 4; i3++) {
            this.f10060a[i3] = new m();
            this.f10061b[i3] = new Matrix();
            this.f10062c[i3] = new Matrix();
        }
    }

    public static l k() {
        return a.f10072a;
    }

    public final float a(int i3) {
        return ((i3 + 1) % 4) * 90;
    }

    public final void b(c cVar, int i3) {
        this.f10067h[0] = this.f10060a[i3].k();
        this.f10067h[1] = this.f10060a[i3].l();
        this.f10061b[i3].mapPoints(this.f10067h);
        if (i3 == 0) {
            Path path = cVar.f10074b;
            float[] fArr = this.f10067h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f10074b;
            float[] fArr2 = this.f10067h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f10060a[i3].d(this.f10061b[i3], cVar.f10074b);
        b bVar = cVar.f10076d;
        if (bVar != null) {
            bVar.a(this.f10060a[i3], this.f10061b[i3], i3);
        }
    }

    public final void c(c cVar, int i3) {
        int i4 = (i3 + 1) % 4;
        this.f10067h[0] = this.f10060a[i3].i();
        this.f10067h[1] = this.f10060a[i3].j();
        this.f10061b[i3].mapPoints(this.f10067h);
        this.f10068i[0] = this.f10060a[i4].k();
        this.f10068i[1] = this.f10060a[i4].l();
        this.f10061b[i4].mapPoints(this.f10068i);
        float f3 = this.f10067h[0];
        float[] fArr = this.f10068i;
        float max = Math.max(((float) Math.hypot(f3 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float i5 = i(cVar.f10075c, i3);
        this.f10066g.n(0.0f, 0.0f);
        f j3 = j(i3, cVar.f10073a);
        j3.b(max, i5, cVar.f10077e, this.f10066g);
        this.f10069j.reset();
        this.f10066g.d(this.f10062c[i3], this.f10069j);
        if (this.f10071l && (j3.a() || l(this.f10069j, i3) || l(this.f10069j, i4))) {
            Path path = this.f10069j;
            path.op(path, this.f10065f, Path.Op.DIFFERENCE);
            this.f10067h[0] = this.f10066g.k();
            this.f10067h[1] = this.f10066g.l();
            this.f10062c[i3].mapPoints(this.f10067h);
            Path path2 = this.f10064e;
            float[] fArr2 = this.f10067h;
            path2.moveTo(fArr2[0], fArr2[1]);
            this.f10066g.d(this.f10062c[i3], this.f10064e);
        } else {
            this.f10066g.d(this.f10062c[i3], cVar.f10074b);
        }
        b bVar = cVar.f10076d;
        if (bVar != null) {
            bVar.b(this.f10066g, this.f10062c[i3], i3);
        }
    }

    public void d(k kVar, float f3, RectF rectF, Path path) {
        e(kVar, f3, rectF, null, path);
    }

    public void e(k kVar, float f3, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f10064e.rewind();
        this.f10065f.rewind();
        this.f10065f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f3, rectF, bVar, path);
        for (int i3 = 0; i3 < 4; i3++) {
            m(cVar, i3);
            n(i3);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            b(cVar, i4);
            c(cVar, i4);
        }
        path.close();
        this.f10064e.close();
        if (this.f10064e.isEmpty()) {
            return;
        }
        path.op(this.f10064e, Path.Op.UNION);
    }

    public final void f(int i3, RectF rectF, PointF pointF) {
        if (i3 == 1) {
            pointF.set(rectF.right, rectF.bottom);
            return;
        }
        if (i3 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i3 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public final x1.c g(int i3, k kVar) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    public final d h(int i3, k kVar) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    public final float i(RectF rectF, int i3) {
        float[] fArr = this.f10067h;
        m mVar = this.f10060a[i3];
        fArr[0] = mVar.f10080c;
        fArr[1] = mVar.f10081d;
        this.f10061b[i3].mapPoints(fArr);
        return (i3 == 1 || i3 == 3) ? Math.abs(rectF.centerX() - this.f10067h[0]) : Math.abs(rectF.centerY() - this.f10067h[1]);
    }

    public final f j(int i3, k kVar) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public final boolean l(Path path, int i3) {
        this.f10070k.reset();
        this.f10060a[i3].d(this.f10061b[i3], this.f10070k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f10070k.computeBounds(rectF, true);
        path.op(this.f10070k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    public final void m(c cVar, int i3) {
        h(i3, cVar.f10073a).b(this.f10060a[i3], 90.0f, cVar.f10077e, cVar.f10075c, g(i3, cVar.f10073a));
        float a3 = a(i3);
        this.f10061b[i3].reset();
        f(i3, cVar.f10075c, this.f10063d);
        Matrix matrix = this.f10061b[i3];
        PointF pointF = this.f10063d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f10061b[i3].preRotate(a3);
    }

    public final void n(int i3) {
        this.f10067h[0] = this.f10060a[i3].i();
        this.f10067h[1] = this.f10060a[i3].j();
        this.f10061b[i3].mapPoints(this.f10067h);
        float a3 = a(i3);
        this.f10062c[i3].reset();
        Matrix matrix = this.f10062c[i3];
        float[] fArr = this.f10067h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f10062c[i3].preRotate(a3);
    }
}

package w1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0762a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f9951i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f9952j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f9953k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f9954l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f9955a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f9956b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f9957c;

    /* renamed from: d, reason: collision with root package name */
    public int f9958d;

    /* renamed from: e, reason: collision with root package name */
    public int f9959e;

    /* renamed from: f, reason: collision with root package name */
    public int f9960f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f9961g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f9962h;

    public C0762a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i3, float f3, float f4) {
        float f5;
        boolean z3 = f4 < 0.0f;
        Path path = this.f9961g;
        if (z3) {
            int[] iArr = f9953k;
            iArr[0] = 0;
            iArr[1] = this.f9960f;
            iArr[2] = this.f9959e;
            iArr[3] = this.f9958d;
            f5 = f3;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f5 = f3;
            path.arcTo(rectF, f5, f4);
            path.close();
            float f6 = -i3;
            rectF.inset(f6, f6);
            int[] iArr2 = f9953k;
            iArr2[0] = 0;
            iArr2[1] = this.f9958d;
            iArr2[2] = this.f9959e;
            iArr2[3] = this.f9960f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f7 = 1.0f - (i3 / width);
        float[] fArr = f9954l;
        fArr[1] = f7;
        fArr[2] = ((1.0f - f7) / 2.0f) + f7;
        this.f9956b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f9953k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z3) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f9962h);
        }
        canvas.drawArc(rectF, f5, f4, true, this.f9956b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i3) {
        rectF.bottom += i3;
        rectF.offset(0.0f, -i3);
        int[] iArr = f9951i;
        iArr[0] = this.f9960f;
        iArr[1] = this.f9959e;
        iArr[2] = this.f9958d;
        Paint paint = this.f9957c;
        float f3 = rectF.left;
        paint.setShader(new LinearGradient(f3, rectF.top, f3, rectF.bottom, iArr, f9952j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f9957c);
        canvas.restore();
    }

    public Paint c() {
        return this.f9955a;
    }

    public void d(int i3) {
        this.f9958d = C.a.k(i3, 68);
        this.f9959e = C.a.k(i3, 20);
        this.f9960f = C.a.k(i3, 0);
        this.f9955a.setColor(this.f9958d);
    }

    public C0762a(int i3) {
        this.f9961g = new Path();
        Paint paint = new Paint();
        this.f9962h = paint;
        this.f9955a = new Paint();
        d(i3);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f9956b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f9957c = new Paint(paint2);
    }
}

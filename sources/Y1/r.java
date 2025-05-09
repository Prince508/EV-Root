package Y1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import android.view.View;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public class r extends View implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: e, reason: collision with root package name */
    public ImageReader f2528e;

    /* renamed from: f, reason: collision with root package name */
    public Image f2529f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f2530g;

    /* renamed from: h, reason: collision with root package name */
    public FlutterRenderer f2531h;

    /* renamed from: i, reason: collision with root package name */
    public b f2532i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2533j;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2534a;

        static {
            int[] iArr = new int[b.values().length];
            f2534a = iArr;
            try {
                iArr[b.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2534a[b.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        background,
        overlay
    }

    public r(Context context, int i3, int i4, b bVar) {
        this(context, h(i3, i4), bVar);
    }

    public static ImageReader h(int i3, int i4) {
        int i5;
        int i6;
        ImageReader newInstance;
        if (i3 <= 0) {
            j("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i3));
            i5 = 1;
        } else {
            i5 = i3;
        }
        if (i4 <= 0) {
            j("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i4));
            i6 = 1;
        } else {
            i6 = i4;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return ImageReader.newInstance(i5, i6, 1, 3);
        }
        newInstance = ImageReader.newInstance(i5, i6, 1, 3, 768L);
        return newInstance;
    }

    public static void j(String str, Object... objArr) {
        W1.b.g("FlutterImageView", String.format(Locale.US, str, objArr));
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void a(FlutterRenderer flutterRenderer) {
        if (a.f2534a[this.f2532i.ordinal()] == 1) {
            flutterRenderer.s(this.f2528e.getSurface());
        }
        setAlpha(1.0f);
        this.f2531h = flutterRenderer;
        this.f2533j = true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void c() {
        if (this.f2533j) {
            setAlpha(0.0f);
            e();
            this.f2530g = null;
            f();
            invalidate();
            this.f2533j = false;
        }
    }

    public boolean e() {
        if (!this.f2533j) {
            return false;
        }
        Image acquireLatestImage = this.f2528e.acquireLatestImage();
        if (acquireLatestImage != null) {
            f();
            this.f2529f = acquireLatestImage;
            invalidate();
        }
        return acquireLatestImage != null;
    }

    public final void f() {
        Image image = this.f2529f;
        if (image != null) {
            image.close();
            this.f2529f = null;
        }
    }

    public void g() {
        this.f2528e.close();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public FlutterRenderer getAttachedRenderer() {
        return this.f2531h;
    }

    public ImageReader getImageReader() {
        return this.f2528e;
    }

    public Surface getSurface() {
        return this.f2528e.getSurface();
    }

    public final void i() {
        setAlpha(0.0f);
    }

    public void k(int i3, int i4) {
        if (this.f2531h == null) {
            return;
        }
        if (i3 == this.f2528e.getWidth() && i4 == this.f2528e.getHeight()) {
            return;
        }
        f();
        g();
        this.f2528e = h(i3, i4);
    }

    public final void l() {
        HardwareBuffer hardwareBuffer;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap wrapHardwareBuffer;
        if (Build.VERSION.SDK_INT >= 29) {
            hardwareBuffer = this.f2529f.getHardwareBuffer();
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, colorSpace);
            this.f2530g = wrapHardwareBuffer;
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.f2529f.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.f2529f.getHeight();
        Bitmap bitmap = this.f2530g;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.f2530g.getHeight() != height) {
            this.f2530g = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.f2530g.copyPixelsFromBuffer(buffer);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2529f != null) {
            l();
        }
        Bitmap bitmap = this.f2530g;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i4, int i5, int i6) {
        if (!(i3 == this.f2528e.getWidth() && i4 == this.f2528e.getHeight()) && this.f2532i == b.background && this.f2533j) {
            k(i3, i4);
            this.f2531h.s(this.f2528e.getSurface());
        }
    }

    public r(Context context, ImageReader imageReader, b bVar) {
        super(context, null);
        this.f2533j = false;
        this.f2528e = imageReader;
        this.f2532i = bVar;
        i();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void b() {
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void d() {
    }
}

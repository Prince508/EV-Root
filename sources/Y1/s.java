package Y1;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* loaded from: classes.dex */
public class s extends SurfaceView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2538e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2539f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2540g;

    /* renamed from: h, reason: collision with root package name */
    public FlutterRenderer f2541h;

    /* renamed from: i, reason: collision with root package name */
    public final SurfaceHolder.Callback f2542i;

    /* renamed from: j, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.j f2543j;

    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
            W1.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (s.this.p()) {
                s.this.k(i4, i5);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            W1.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            s.this.f2539f = true;
            if (s.this.p()) {
                s.this.l();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            W1.b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            s.this.f2539f = false;
            if (s.this.p()) {
                s.this.m();
            }
        }
    }

    public s(Context context, boolean z3) {
        this(context, null, z3);
    }

    private void n() {
        if (this.f2538e) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f2542i);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void a(FlutterRenderer flutterRenderer) {
        W1.b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f2541h != null) {
            W1.b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f2541h.q();
            this.f2541h.l(this.f2543j);
        }
        this.f2541h = flutterRenderer;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void b() {
        if (this.f2541h == null) {
            W1.b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f2540g = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void c() {
        if (this.f2541h == null) {
            W1.b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            W1.b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            m();
        }
        setAlpha(0.0f);
        this.f2541h.l(this.f2543j);
        this.f2541h = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void d() {
        FlutterRenderer flutterRenderer = this.f2541h;
        if (flutterRenderer == null) {
            W1.b.g("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        flutterRenderer.g(this.f2543j);
        if (o()) {
            W1.b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            l();
        }
        this.f2540g = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i3 = iArr[0];
        region.op(i3, iArr[1], (getRight() + i3) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public FlutterRenderer getAttachedRenderer() {
        return this.f2541h;
    }

    public final void k(int i3, int i4) {
        if (this.f2541h == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        W1.b.f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i3 + " x " + i4);
        this.f2541h.r(i3, i4);
    }

    public final void l() {
        if (this.f2541h == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f2541h.p(getHolder().getSurface(), this.f2540g);
    }

    public final void m() {
        FlutterRenderer flutterRenderer = this.f2541h;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.q();
    }

    public boolean o() {
        return this.f2539f;
    }

    public final boolean p() {
        return (this.f2541h == null || this.f2540g) ? false : true;
    }

    public s(Context context, AttributeSet attributeSet, boolean z3) {
        super(context, attributeSet);
        this.f2539f = false;
        this.f2540g = false;
        this.f2542i = new a();
        this.f2543j = new b();
        this.f2538e = z3;
        n();
    }

    public class b implements io.flutter.embedding.engine.renderer.j {
        public b() {
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void f() {
            W1.b.f("FlutterSurfaceView", "onFlutterUiDisplayed()");
            s.this.setAlpha(1.0f);
            if (s.this.f2541h != null) {
                s.this.f2541h.l(this);
            }
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void b() {
        }
    }
}

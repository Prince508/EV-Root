package Y1;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;

/* loaded from: classes.dex */
public class t extends TextureView implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: e, reason: collision with root package name */
    public boolean f2546e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2547f;

    /* renamed from: g, reason: collision with root package name */
    public FlutterRenderer f2548g;

    /* renamed from: h, reason: collision with root package name */
    public Surface f2549h;

    /* renamed from: i, reason: collision with root package name */
    public final TextureView.SurfaceTextureListener f2550i;

    public t(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i3, int i4) {
        if (this.f2548g == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        W1.b.f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i3 + " x " + i4);
        this.f2548g.r(i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f2548g == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f2549h;
        if (surface != null) {
            surface.release();
            this.f2549h = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f2549h = surface2;
        this.f2548g.p(surface2, this.f2547f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        FlutterRenderer flutterRenderer = this.f2548g;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.q();
        Surface surface = this.f2549h;
        if (surface != null) {
            surface.release();
            this.f2549h = null;
        }
    }

    private void o() {
        setSurfaceTextureListener(this.f2550i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        return (this.f2548g == null || this.f2547f) ? false : true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void a(FlutterRenderer flutterRenderer) {
        W1.b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f2548g != null) {
            W1.b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f2548g.q();
        }
        this.f2548g = flutterRenderer;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void b() {
        if (this.f2548g == null) {
            W1.b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f2547f = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void c() {
        if (this.f2548g == null) {
            W1.b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            W1.b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            n();
        }
        this.f2548g = null;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public void d() {
        if (this.f2548g == null) {
            W1.b.g("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (p()) {
            W1.b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m();
        }
        this.f2547f = false;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public FlutterRenderer getAttachedRenderer() {
        return this.f2548g;
    }

    public boolean p() {
        return this.f2546e;
    }

    public void setRenderSurface(Surface surface) {
        this.f2549h = surface;
    }

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2546e = false;
        this.f2547f = false;
        this.f2550i = new a();
        o();
    }

    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i4) {
            W1.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            t.this.f2546e = true;
            if (t.this.q()) {
                t.this.m();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            W1.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            t.this.f2546e = false;
            if (t.this.q()) {
                t.this.n();
            }
            if (t.this.f2549h == null) {
                return true;
            }
            t.this.f2549h.release();
            t.this.f2549h = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i4) {
            W1.b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (t.this.q()) {
                t.this.l(i3, i4);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}

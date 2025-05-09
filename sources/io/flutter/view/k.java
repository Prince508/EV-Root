package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public class k {

    /* renamed from: e, reason: collision with root package name */
    public static k f7918e;

    /* renamed from: f, reason: collision with root package name */
    public static b f7919f;

    /* renamed from: b, reason: collision with root package name */
    public FlutterJNI f7921b;

    /* renamed from: a, reason: collision with root package name */
    public long f7920a = -1;

    /* renamed from: c, reason: collision with root package name */
    public c f7922c = new c(0);

    /* renamed from: d, reason: collision with root package name */
    public final FlutterJNI.b f7923d = new a();

    public class a implements FlutterJNI.b {
        public a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.b
        public void a(long j3) {
            Choreographer.getInstance().postFrameCallback(b(j3));
        }

        public final Choreographer.FrameCallback b(long j3) {
            if (k.this.f7922c == null) {
                return k.this.new c(j3);
            }
            k.this.f7922c.f7927a = j3;
            c cVar = k.this.f7922c;
            k.this.f7922c = null;
            return cVar;
        }
    }

    public class b implements DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        public DisplayManager f7925a;

        public b(DisplayManager displayManager) {
            this.f7925a = displayManager;
        }

        public void a() {
            this.f7925a.registerDisplayListener(this, null);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i3) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i3) {
            if (i3 == 0) {
                float refreshRate = this.f7925a.getDisplay(0).getRefreshRate();
                k.this.f7920a = (long) (1.0E9d / refreshRate);
                k.this.f7921b.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i3) {
        }
    }

    public class c implements Choreographer.FrameCallback {

        /* renamed from: a, reason: collision with root package name */
        public long f7927a;

        public c(long j3) {
            this.f7927a = j3;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j3) {
            long nanoTime = System.nanoTime() - j3;
            k.this.f7921b.onVsync(nanoTime < 0 ? 0L : nanoTime, k.this.f7920a, this.f7927a);
            k.this.f7922c = this;
        }
    }

    public k(FlutterJNI flutterJNI) {
        this.f7921b = flutterJNI;
    }

    public static k f(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f7918e == null) {
            f7918e = new k(flutterJNI);
        }
        if (f7919f == null) {
            k kVar = f7918e;
            Objects.requireNonNull(kVar);
            b bVar = kVar.new b(displayManager);
            f7919f = bVar;
            bVar.a();
        }
        if (f7918e.f7920a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f7918e.f7920a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f7918e;
    }

    public void g() {
        this.f7921b.setAsyncWaitForVsyncDelegate(this.f7923d);
    }
}

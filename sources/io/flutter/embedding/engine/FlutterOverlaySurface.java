package io.flutter.embedding.engine;

import android.view.Surface;
import c.InterfaceC0370a;

@InterfaceC0370a
/* loaded from: classes.dex */
public class FlutterOverlaySurface {
    private final int id;
    private final Surface surface;

    public FlutterOverlaySurface(int i3, Surface surface) {
        this.id = i3;
        this.surface = surface;
    }

    public int getId() {
        return this.id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}

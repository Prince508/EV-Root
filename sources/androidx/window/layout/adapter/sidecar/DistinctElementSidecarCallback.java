package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b, reason: collision with root package name */
    public SidecarDeviceState f4638b;

    /* renamed from: d, reason: collision with root package name */
    public final C0.a f4640d;

    /* renamed from: e, reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f4641e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4637a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Map f4639c = new WeakHashMap();

    public DistinctElementSidecarCallback(C0.a aVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f4640d = aVar;
        this.f4641e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f4637a) {
            try {
                if (this.f4640d.a(this.f4638b, sidecarDeviceState)) {
                    return;
                }
                this.f4638b = sidecarDeviceState;
                this.f4641e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f4637a) {
            try {
                if (this.f4640d.d((SidecarWindowLayoutInfo) this.f4639c.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f4639c.put(iBinder, sidecarWindowLayoutInfo);
                this.f4641e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

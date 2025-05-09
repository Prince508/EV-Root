package androidx.window.layout.adapter.sidecar;

import C2.g;
import C2.k;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import q2.n;
import r2.AbstractC0700m;
import z0.j;

/* loaded from: classes.dex */
public final class SidecarCompat implements androidx.window.layout.adapter.sidecar.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f4642f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final SidecarInterface f4643a;

    /* renamed from: b, reason: collision with root package name */
    public final C0.a f4644b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f4645c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f4646d;

    /* renamed from: e, reason: collision with root package name */
    public b f4647e;

    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface g3;
            k.e(sidecarDeviceState, "newDeviceState");
            Collection<Activity> values = SidecarCompat.this.f4645c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : values) {
                IBinder a3 = SidecarCompat.f4642f.a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (a3 != null && (g3 = sidecarCompat.g()) != null) {
                    sidecarWindowLayoutInfo = g3.getWindowLayoutInfo(a3);
                }
                b bVar = sidecarCompat.f4647e;
                if (bVar != null) {
                    bVar.a(activity, sidecarCompat.f4644b.f(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState sidecarDeviceState;
            k.e(iBinder, "windowToken");
            k.e(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.f4645c.get(iBinder);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            C0.a aVar = SidecarCompat.this.f4644b;
            SidecarInterface g3 = SidecarCompat.this.g();
            if (g3 == null || (sidecarDeviceState = g3.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            j f3 = aVar.f(sidecarWindowLayoutInfo, sidecarDeviceState);
            b bVar = SidecarCompat.this.f4647e;
            if (bVar != null) {
                bVar.a(activity, f3);
            }
        }
    }

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public final SidecarInterface b(Context context) {
            k.e(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final w0.k c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return w0.k.f9940j.b(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    public static final class b implements a.InterfaceC0100a {

        /* renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0100a f4649a;

        /* renamed from: b, reason: collision with root package name */
        public final ReentrantLock f4650b;

        /* renamed from: c, reason: collision with root package name */
        public final WeakHashMap f4651c;

        public b(a.InterfaceC0100a interfaceC0100a) {
            k.e(interfaceC0100a, "callbackInterface");
            this.f4649a = interfaceC0100a;
            this.f4650b = new ReentrantLock();
            this.f4651c = new WeakHashMap();
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0100a
        public void a(Activity activity, j jVar) {
            k.e(activity, "activity");
            k.e(jVar, "newLayout");
            ReentrantLock reentrantLock = this.f4650b;
            reentrantLock.lock();
            try {
                if (k.a(jVar, (j) this.f4651c.get(activity))) {
                    return;
                }
                reentrantLock.unlock();
                this.f4649a.a(activity, jVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(Activity activity) {
            k.e(activity, "activity");
            ReentrantLock reentrantLock = this.f4650b;
            reentrantLock.lock();
            try {
                this.f4651c.put(activity, null);
                n nVar = n.f8874a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: e, reason: collision with root package name */
        public final SidecarCompat f4652e;

        /* renamed from: f, reason: collision with root package name */
        public final WeakReference f4653f;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            k.e(sidecarCompat, "sidecarCompat");
            k.e(activity, "activity");
            this.f4652e = sidecarCompat;
            this.f4653f = new WeakReference(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            k.e(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.f4653f.get();
            IBinder a3 = SidecarCompat.f4642f.a(activity);
            if (activity == null || a3 == null) {
                return;
            }
            this.f4652e.i(a3, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            k.e(view, "view");
        }
    }

    public SidecarCompat(SidecarInterface sidecarInterface, C0.a aVar) {
        k.e(aVar, "sidecarAdapter");
        this.f4643a = sidecarInterface;
        this.f4644b = aVar;
        this.f4645c = new LinkedHashMap();
        this.f4646d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void a(a.InterfaceC0100a interfaceC0100a) {
        k.e(interfaceC0100a, "extensionCallback");
        this.f4647e = new b(interfaceC0100a);
        SidecarInterface sidecarInterface = this.f4643a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f4644b, new TranslatingCallback()));
        }
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void b(Activity activity) {
        SidecarInterface sidecarInterface;
        k.e(activity, "activity");
        IBinder a3 = f4642f.a(activity);
        if (a3 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f4643a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a3);
        }
        k(activity);
        b bVar = this.f4647e;
        if (bVar != null) {
            bVar.b(activity);
        }
        boolean z3 = this.f4645c.size() == 1;
        this.f4645c.remove(a3);
        if (!z3 || (sidecarInterface = this.f4643a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public void c(Activity activity) {
        k.e(activity, "activity");
        IBinder a3 = f4642f.a(activity);
        if (a3 != null) {
            i(a3, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    public final SidecarInterface g() {
        return this.f4643a;
    }

    public final j h(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        k.e(activity, "activity");
        IBinder a3 = f4642f.a(activity);
        if (a3 == null) {
            return new j(AbstractC0700m.f());
        }
        SidecarInterface sidecarInterface = this.f4643a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a3) : null;
        C0.a aVar = this.f4644b;
        SidecarInterface sidecarInterface2 = this.f4643a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return aVar.f(windowLayoutInfo, sidecarDeviceState);
    }

    public final void i(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        k.e(iBinder, "windowToken");
        k.e(activity, "activity");
        this.f4645c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f4643a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (this.f4645c.size() == 1 && (sidecarInterface = this.f4643a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.f4647e;
        if (bVar != null) {
            bVar.a(activity, h(activity));
        }
        j(activity);
    }

    public final void j(Activity activity) {
        this.f4646d.get(activity);
    }

    public final void k(Activity activity) {
        if (((J.a) this.f4646d.get(activity)) == null) {
            return;
        }
        this.f4646d.remove(activity);
    }

    public boolean l() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f4643a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!k.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f4643a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f4643a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f4643a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!k.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f4643a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!k.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f4643a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!k.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                k.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            k.d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                k.c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (!k.a(arrayList, (List) invoke2)) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(f4642f.b(context), new C0.a(null, 1, null));
        k.e(context, "context");
    }
}

package K;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: K.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0210o {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1052a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0211p f1053b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1054c;

    /* renamed from: d, reason: collision with root package name */
    public final a f1055d;

    /* renamed from: e, reason: collision with root package name */
    public VelocityTracker f1056e;

    /* renamed from: f, reason: collision with root package name */
    public float f1057f;

    /* renamed from: g, reason: collision with root package name */
    public int f1058g;

    /* renamed from: h, reason: collision with root package name */
    public int f1059h;

    /* renamed from: i, reason: collision with root package name */
    public int f1060i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f1061j;

    /* renamed from: K.o$a */
    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i3);
    }

    /* renamed from: K.o$b */
    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i3);
    }

    public C0210o(Context context, InterfaceC0211p interfaceC0211p) {
        this(context, interfaceC0211p, new b() { // from class: K.m
            @Override // K.C0210o.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i3) {
                C0210o.c(context2, iArr, motionEvent, i3);
            }
        }, new a() { // from class: K.n
            @Override // K.C0210o.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i3) {
                float f3;
                f3 = C0210o.f(velocityTracker, motionEvent, i3);
                return f3;
            }
        });
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = T.i(context, viewConfiguration, motionEvent.getDeviceId(), i3, motionEvent.getSource());
        iArr[1] = T.h(context, viewConfiguration, motionEvent.getDeviceId(), i3, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i3) {
        L.a(velocityTracker, motionEvent);
        L.b(velocityTracker, 1000);
        return L.d(velocityTracker, i3);
    }

    public final boolean d(MotionEvent motionEvent, int i3) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f1059h == source && this.f1060i == deviceId && this.f1058g == i3) {
            return false;
        }
        this.f1054c.a(this.f1052a, this.f1061j, motionEvent, i3);
        this.f1059h = source;
        this.f1060i = deviceId;
        this.f1058g = i3;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i3) {
        if (this.f1056e == null) {
            this.f1056e = VelocityTracker.obtain();
        }
        return this.f1055d.a(this.f1056e, motionEvent, i3);
    }

    public void g(MotionEvent motionEvent, int i3) {
        boolean d3 = d(motionEvent, i3);
        if (this.f1061j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f1056e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1056e = null;
                return;
            }
            return;
        }
        float e3 = e(motionEvent, i3) * this.f1053b.b();
        float signum = Math.signum(e3);
        if (d3 || (signum != Math.signum(this.f1057f) && signum != 0.0f)) {
            this.f1053b.c();
        }
        float abs = Math.abs(e3);
        int[] iArr = this.f1061j;
        if (abs < iArr[0]) {
            return;
        }
        float max = Math.max(-r6, Math.min(e3, iArr[1]));
        this.f1057f = this.f1053b.a(max) ? max : 0.0f;
    }

    public C0210o(Context context, InterfaceC0211p interfaceC0211p, b bVar, a aVar) {
        this.f1058g = -1;
        this.f1059h = -1;
        this.f1060i = -1;
        this.f1061j = new int[]{Integer.MAX_VALUE, 0};
        this.f1052a = context;
        this.f1053b = interfaceC0211p;
        this.f1054c = bVar;
        this.f1055d = aVar;
    }
}

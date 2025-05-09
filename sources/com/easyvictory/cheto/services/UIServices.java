package com.easyvictory.cheto.services;

import a1.C0312a;
import android.accessibilityservice.AccessibilityService;
import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Build;
import android.os.RemoteException;
import android.util.Pair;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import b1.C0368a;
import c1.AbstractC0382j;
import c1.AbstractC0388p;
import c1.AbstractC0391s;
import c1.AbstractC0393u;
import c1.C0376d;
import c1.C0379g;
import com.easyvictory.cheto.overlays.AutoPlayController;
import com.easyvictory.cheto.overlays.ESPImpl;
import com.easyvictory.cheto.overlays.FloatLogo;
import java.util.List;

/* loaded from: classes.dex */
public class UIServices extends AccessibilityService {

    /* renamed from: j, reason: collision with root package name */
    public static String f4963j;

    /* renamed from: k, reason: collision with root package name */
    public static String f4964k;

    /* renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver f4965e = new a();

    /* renamed from: f, reason: collision with root package name */
    public ESPImpl f4966f = null;

    /* renamed from: g, reason: collision with root package name */
    public C0312a f4967g = null;

    /* renamed from: h, reason: collision with root package name */
    public C0376d f4968h = null;

    /* renamed from: i, reason: collision with root package name */
    public WindowManager f4969i = null;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC0382j.a(U2.a.a(-21693555110126L) + intent.getAction());
            if (U2.a.a(-21788044390638L).equals(intent.getAction())) {
                UIServices.this.onConfigurationChanged(context.getResources().getConfiguration());
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UIServices.this.updateVisualsThreadJNI();
        }
    }

    static {
        System.loadLibrary(U2.a.a(-23888283398382L));
        f4963j = U2.a.a(-23931233071342L);
        f4964k = U2.a.a(-23982772678894L);
    }

    public UIServices() {
        AbstractC0382j.a(U2.a.a(-21977022951662L));
    }

    public static /* synthetic */ void a() {
        try {
            int i3 = FloatLogo.getInstance().E() ? 0 : 8;
            AbstractC0382j.a(U2.a.a(-23725074641134L) + 0 + U2.a.a(-23780909215982L) + i3);
            FloatLogo.getInstance().R(0);
            AutoPlayController.getInstance().q(i3);
        } catch (Throwable th) {
            AbstractC0382j.f(th);
        }
    }

    public static /* synthetic */ void b(int i3) {
        if (C0368a.d().f()) {
            try {
                C0368a.d().e().j(i3);
            } catch (RemoteException e3) {
                AbstractC0382j.b(e3);
            }
        }
    }

    private static byte[] getEBP_Data() {
        if (!C0368a.d().f()) {
            return null;
        }
        try {
            return C0368a.d().e().h();
        } catch (Throwable th) {
            AbstractC0382j.f(th);
            return null;
        }
    }

    private native void initializeScreenSizeJNI(Point point, Point point2);

    /* JADX INFO: Access modifiers changed from: private */
    public native void updateVisualsThreadJNI();

    public final void d() {
        final int rotation = this.f4969i.getDefaultDisplay().getRotation();
        AbstractC0382j.a(U2.a.a(-23312757780718L) + rotation);
        this.f4968h.b(new Runnable() { // from class: com.easyvictory.cheto.services.f
            @Override // java.lang.Runnable
            public final void run() {
                UIServices.b(rotation);
            }
        });
    }

    public final void e() {
        initializeScreenSizeJNI(AbstractC0393u.b(this), AbstractC0393u.e(this));
    }

    public void f() {
        new Thread(new b()).start();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AbstractC0382j.a(U2.a.a(-23132369154286L) + accessibilityEvent.getEventType());
        if (accessibilityEvent.getEventType() == 32) {
            this.f4968h.b(new Runnable() { // from class: com.easyvictory.cheto.services.e
                @Override // java.lang.Runnable
                public final void run() {
                    UIServices.a();
                }
            });
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
        try {
            Point b3 = AbstractC0393u.b(this);
            int i3 = configuration.orientation;
            Point point = new Point();
            if (i3 == 2) {
                point.x = Math.max(b3.x, b3.y);
                point.y = Math.min(b3.x, b3.y);
            } else {
                point.x = b3.x;
                point.y = b3.y;
            }
            int i4 = (int) (point.x / 2.0f);
            FloatLogo.getInstance().W(i4);
            AutoPlayController.getInstance().s(i4);
        } catch (Throwable th) {
            AbstractC0382j.f(th);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        AbstractC0382j.a(U2.a.a(-22110166937838L));
        this.f4969i = (WindowManager) getSystemService(U2.a.a(-22213246152942L));
        e();
        C0376d c0376d = new C0376d();
        this.f4968h = c0376d;
        c0376d.d();
        Thread.setDefaultUncaughtExceptionHandler(new C0379g());
        f();
        registerReceiver(this.f4965e, new IntentFilter(U2.a.a(-22243310924014L)));
    }

    @Override // android.app.Service
    public void onDestroy() {
        AbstractC0382j.a(U2.a.a(-23548980981998L));
        this.f4968h.e();
        FloatLogo.getInstance().Q();
        AutoPlayController.getInstance().p();
        ESPImpl eSPImpl = this.f4966f;
        if (eSPImpl != null) {
            eSPImpl.c();
            this.f4966f = null;
        }
        unregisterReceiver(this.f4965e);
        super.onDestroy();
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onInterrupt() {
        AbstractC0382j.a(U2.a.a(-23415836995822L));
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onServiceConnected() {
        super.onServiceConnected();
        AbstractC0382j.a(U2.a.a(-22432289485038L));
        FloatLogo.getInstance().G(this);
        AutoPlayController.getInstance().l(this);
        this.f4966f = new ESPImpl(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i3, int i4) {
        String action;
        char c3;
        List a3;
        if (intent != null && (action = intent.getAction()) != null) {
            switch (action.hashCode()) {
                case 3540994:
                    if (action.equals(U2.a.a(-22595498242286L))) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 134762710:
                    if (action.equals(U2.a.a(-22616973078766L))) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 341900350:
                    if (action.equals(U2.a.a(-22664217719022L))) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 524757580:
                    if (action.equals(U2.a.a(-22741527130350L))) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            if (c3 == 0) {
                disableSelf();
                AbstractC0382j.a(U2.a.a(-22814541574382L));
            } else if (c3 == 1) {
                disableSelf();
                AbstractC0391s.d();
                AbstractC0382j.a(U2.a.a(-22921915756782L));
                a3 = Z0.b.a(new Object[]{AbstractC0391s.f4766h, AbstractC0391s.f4767i});
                AbstractC0391s.c(a3);
            } else if (c3 == 2) {
                AbstractC0382j.a(U2.a.a(-23029289939182L));
            } else if (c3 == 3) {
                Pair c4 = AbstractC0388p.c(this);
                if (Build.VERSION.SDK_INT >= 29) {
                    startForeground(((Integer) c4.first).intValue(), (Notification) c4.second, 32);
                } else {
                    startForeground(((Integer) c4.first).intValue(), (Notification) c4.second);
                }
            }
        }
        return 2;
    }
}

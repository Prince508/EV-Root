package com.easyvictory.cheto.services;

import a1.C0312a;
import android.app.ActivityManager;
import android.content.Intent;
import android.graphics.Point;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import c1.AbstractC0378f;
import c1.AbstractC0380h;
import c1.AbstractC0382j;
import c1.AbstractC0393u;
import c1.AbstractC0396x;
import c1.C0376d;
import c1.C0383k;
import com.easyvictory.cheto.api_client.ApiResponse;
import com.easyvictory.cheto.services.a;
import com.easyvictory.cheto.utils.package_settings.IPackageSettings;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class RootServiceImpl extends V1.b {
    private final a.AbstractBinderC0104a stub = new a();
    private final Runnable autoQueueRunnableLogic = new b();
    private boolean isScreenSizeInitialized = false;
    private Point aqScreenSize = new Point();
    private int aqRotation = 0;
    private C0376d asyncTaskManager = null;
    private C0312a autoQueueManager = null;
    private final Handler handler = new Handler();
    C0383k logcatManager = new C0383k(U2.a.a(-19086509961454L));

    public class a extends a.AbstractBinderC0104a {
        public a() {
        }

        @Override // com.easyvictory.cheto.services.a
        public boolean b() {
            return RootServiceImpl.bringGameWindowToFrontJNI();
        }

        @Override // com.easyvictory.cheto.services.a
        public byte[] d() {
            return RootServiceImpl.getEBP_AQ_DataJNI();
        }

        @Override // com.easyvictory.cheto.services.a
        public void e(String str, int i3, int i4) {
            RootServiceImpl.this.applyConfigIntJNI(str, i3, i4);
        }

        @Override // com.easyvictory.cheto.services.a
        public ApiResponse g(String str, String str2, int i3, IPackageSettings iPackageSettings) {
            RootServiceImpl.this.updatePackageSettingsJNI(str2, iPackageSettings);
            return RootServiceImpl.this.retrievePackageDataJNI(str, str2, i3, U2.a.a(-19060740157678L), AbstractC0378f.a());
        }

        @Override // com.easyvictory.cheto.services.a
        public byte[] h() {
            return RootServiceImpl.this.getEBP_DataJNI();
        }

        @Override // com.easyvictory.cheto.services.a
        public void i(String str, boolean z3) {
            RootServiceImpl.this.forceAutoPlayStateJNI(str, z3);
        }

        @Override // com.easyvictory.cheto.services.a
        public void j(int i3) {
            RootServiceImpl.this.aqRotation = i3;
            RootServiceImpl.this.setDeviceRotationJNI(i3);
        }

        @Override // com.easyvictory.cheto.services.a
        public void k() {
            RootServiceImpl.this.stopSelf();
        }

        @Override // com.easyvictory.cheto.services.a
        public boolean l(int i3, int i4, int i5, int i6, int i7) {
            return RootServiceImpl.simulateScreenSwipeJNI(i3, i4, i5, i6, i7);
        }

        @Override // com.easyvictory.cheto.services.a
        public boolean m(int i3, int i4) {
            return RootServiceImpl.simulateScreenTapJNI(i3, i4);
        }

        @Override // com.easyvictory.cheto.services.a
        public boolean o(String str) {
            return RootServiceImpl.this.randomizeDeviceInfoJNI(str);
        }

        @Override // com.easyvictory.cheto.services.a
        public void p(String str, int i3, boolean z3) {
            RootServiceImpl.this.applyConfigBoolJNI(str, i3, z3);
        }

        @Override // com.easyvictory.cheto.services.a
        public void q(String str, int i3, float f3) {
            RootServiceImpl.this.applyConfigFloatJNI(str, i3, f3);
        }

        @Override // com.easyvictory.cheto.services.a
        public boolean r(boolean z3) {
            return RootServiceImpl.simulateBackButtonJNI(z3);
        }

        @Override // com.easyvictory.cheto.services.a
        public void s(String str, IPackageSettings iPackageSettings) {
            RootServiceImpl.this.updatePackageSettingsJNI(str, iPackageSettings);
        }

        @Override // com.easyvictory.cheto.services.a
        public void u(String str, int i3, String str2) {
            RootServiceImpl.this.applyConfigStringJNI(str, i3, str2);
        }

        @Override // com.easyvictory.cheto.services.a
        public void v(String str, int i3, long j3) {
            RootServiceImpl.this.applyConfigLongJNI(str, i3, j3);
        }

        @Override // com.easyvictory.cheto.services.a
        public String w() {
            return RootServiceImpl.this.getForegroundWindowPackageNameImpl();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Point point;
            try {
                point = new Point();
            } catch (Throwable th) {
                AbstractC0382j.f(th);
            }
            if (RootServiceImpl.this.aqScreenSize.x >= RootServiceImpl.this.aqScreenSize.y || (RootServiceImpl.this.aqRotation != 1 && RootServiceImpl.this.aqRotation != 3)) {
                point.x = RootServiceImpl.this.aqScreenSize.x;
                point.y = RootServiceImpl.this.aqScreenSize.y;
                RootServiceImpl.this.autoQueueManager.a(point);
                RootServiceImpl.this.handler.postDelayed(this, 500L);
            }
            point.x = RootServiceImpl.this.aqScreenSize.y;
            point.y = RootServiceImpl.this.aqScreenSize.x;
            RootServiceImpl.this.autoQueueManager.a(point);
            RootServiceImpl.this.handler.postDelayed(this, 500L);
        }
    }

    static {
        if (Process.myUid() == 0) {
            System.loadLibrary(U2.a.a(-21654900404462L));
        }
    }

    public static native boolean bringGameWindowToFrontJNI();

    public static native byte[] getEBP_AQ_DataJNI();

    /* JADX INFO: Access modifiers changed from: private */
    public String getForegroundWindowPackageNameImpl() {
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) getSystemService(U2.a.a(-20654173024494L))).getRunningAppProcesses()) {
            if (runningAppProcessInfo.importance == 100) {
                return runningAppProcessInfo.processName;
            }
        }
        return U2.a.a(-20692827730158L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeAutoQueueThread$0() {
        if (this.autoQueueManager == null) {
            File file = new File(getFilesDir(), U2.a.a(-20697122697454L));
            file.mkdirs();
            File file2 = new File(file, U2.a.a(-20740072370414L));
            if (file2.exists()) {
                file2.setWritable(true, true);
            }
            try {
                AbstractC0380h.b(this, U2.a.a(-20778727076078L), file2.getAbsolutePath());
            } catch (IOException e3) {
                AbstractC0382j.c(e3);
            }
            if (!file2.exists()) {
                return;
            }
            file2.setWritable(false, false);
            U2.a.a(-20800201912558L);
            if (!AbstractC0396x.c(file2).equals(U2.a.a(-21079374786798L))) {
                AbstractC0382j.d(U2.a.a(-21358547661038L));
                return;
            }
            try {
                this.autoQueueManager = new C0312a(this, file);
                AbstractC0382j.a(U2.a.a(-21453036941550L) + this.autoQueueManager);
            } catch (Throwable th) {
                AbstractC0382j.f(th);
                StringBuilder sb = new StringBuilder();
                sb.append(th);
                sb.append(U2.a.a(-21560411123950L));
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    sb.append(U2.a.a(-21569001058542L));
                    sb.append(stackTraceElement.toString());
                    sb.append(U2.a.a(-21594770862318L));
                }
                AbstractC0382j.d(U2.a.a(-21603360796910L) + ((Object) sb));
            }
        }
        if (this.autoQueueManager != null) {
            this.handler.post(this.autoQueueRunnableLogic);
        }
    }

    public static native boolean simulateBackButtonJNI(boolean z3);

    public static native boolean simulateScreenSwipeJNI(int i3, int i4, int i5, int i6, int i7);

    public static native boolean simulateScreenTapJNI(int i3, int i4);

    public native void applyConfigBoolJNI(String str, int i3, boolean z3);

    public native void applyConfigFloatJNI(String str, int i3, float f3);

    public native void applyConfigIntJNI(String str, int i3, int i4);

    public native void applyConfigLongJNI(String str, int i3, long j3);

    public native void applyConfigStringJNI(String str, int i3, String str2);

    public native void forceAutoPlayStateJNI(String str, boolean z3);

    public native byte[] getEBP_DataJNI();

    public void initializeAutoQueueThread() {
        this.asyncTaskManager.b(new Runnable() { // from class: com.easyvictory.cheto.services.b
            @Override // java.lang.Runnable
            public final void run() {
                RootServiceImpl.this.lambda$initializeAutoQueueThread$0();
            }
        });
    }

    public void initializeScreenSize() {
        Point b3 = AbstractC0393u.b(this);
        if (b3.x <= 0 || b3.y <= 0) {
            return;
        }
        AbstractC0382j.a(U2.a.a(-20460899496174L) + b3);
        Point f3 = AbstractC0393u.f(this);
        if (f3.x <= 0 || f3.y <= 0) {
            return;
        }
        AbstractC0382j.a(U2.a.a(-20533913940206L) + f3);
        initializeScreenSizeJNI(b3, f3);
        this.aqScreenSize = b3;
        this.isScreenSizeInitialized = true;
    }

    public native void initializeScreenSizeJNI(Point point, Point point2);

    @Override // V1.b
    public IBinder onBind(Intent intent) {
        AbstractC0382j.a(U2.a.a(-19322733162734L));
        if (!this.isScreenSizeInitialized && intent.hasExtra(U2.a.a(-19438697279726L))) {
            Point point = new Point();
            Point point2 = new Point();
            point.x = intent.getIntExtra(U2.a.a(-19516006691054L), 0);
            point.y = intent.getIntExtra(U2.a.a(-19593316102382L), 0);
            point2.x = intent.getIntExtra(U2.a.a(-19674920481006L), 0);
            point2.y = intent.getIntExtra(U2.a.a(-19803769499886L), 0);
            AbstractC0382j.a(U2.a.a(-19936913486062L) + point);
            AbstractC0382j.a(U2.a.a(-20044287668462L) + point2);
            AbstractC0382j.a(U2.a.a(-20198906491118L) + AbstractC0393u.c());
            initializeScreenSizeJNI(point, point2);
            this.aqScreenSize = point;
            this.isScreenSizeInitialized = true;
        }
        return this.stub;
    }

    @Override // V1.b
    public void onCreate() {
        super.onCreate();
        AbstractC0382j.a(U2.a.a(-19211064013038L));
        new Thread(this.logcatManager.f4752a).start();
        initializeScreenSize();
        C0376d c0376d = new C0376d();
        this.asyncTaskManager = c0376d;
        c0376d.d();
        initializeAutoQueueThread();
    }

    @Override // V1.b
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // V1.b
    public void onRebind(Intent intent) {
        AbstractC0382j.a(U2.a.a(-20336345444590L));
        super.onRebind(intent);
    }

    @Override // V1.b
    public boolean onUnbind(Intent intent) {
        return true;
    }

    public native boolean randomizeDeviceInfoJNI(String str);

    public native ApiResponse retrievePackageDataJNI(String str, String str2, int i3, String str3, String str4);

    public native void setDeviceRotationJNI(int i3);

    public native void updatePackageSettingsJNI(String str, IPackageSettings iPackageSettings);
}

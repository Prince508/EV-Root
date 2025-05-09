package com.easyvictory.cheto.plugins.auto_queue;

import c1.AbstractC0382j;
import com.easyvictory.cheto.services.RootServiceImpl;

/* loaded from: classes.dex */
public class InternalAPI {
    public static boolean bringGameWindowToFront() {
        try {
            return RootServiceImpl.bringGameWindowToFrontJNI();
        } catch (Throwable th) {
            AbstractC0382j.f(th);
            return false;
        }
    }

    public static byte[] getEBP_AQ_Data() {
        try {
            return RootServiceImpl.getEBP_AQ_DataJNI();
        } catch (Throwable th) {
            AbstractC0382j.f(th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r1.contains("x64") != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean simulateBackButton() {
        /*
            r0 = 0
            java.lang.String r1 = android.os.Build.CPU_ABI     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L17
            java.lang.String r2 = "x86"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L15
            java.lang.String r2 = "x64"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L17
        L15:
            r1 = 1
            goto L18
        L17:
            r1 = r0
        L18:
            boolean r0 = com.easyvictory.cheto.services.RootServiceImpl.simulateBackButtonJNI(r1)     // Catch: java.lang.Throwable -> L1d
            return r0
        L1d:
            r1 = move-exception
            c1.AbstractC0382j.f(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.easyvictory.cheto.plugins.auto_queue.InternalAPI.simulateBackButton():boolean");
    }

    public static boolean simulateScreenSwipe(int i3, int i4, int i5, int i6, int i7) {
        try {
            return RootServiceImpl.simulateScreenSwipeJNI(i3, i4, i5, i6, i7);
        } catch (Throwable th) {
            AbstractC0382j.f(th);
            return false;
        }
    }

    public static boolean simulateScreenTap(int i3, int i4) {
        try {
            return RootServiceImpl.simulateScreenTapJNI(i3, i4);
        } catch (Throwable th) {
            AbstractC0382j.f(th);
            return false;
        }
    }
}

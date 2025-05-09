package r0;

import android.os.Trace;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0677c {
    public static void a(String str, int i3) {
        Trace.beginAsyncSection(str, i3);
    }

    public static void b(String str, int i3) {
        Trace.endAsyncSection(str, i3);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}

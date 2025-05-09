package c1;

import java.lang.Thread;

/* renamed from: c1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0379g implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        AbstractC0382j.f(th);
        System.exit(1);
    }
}

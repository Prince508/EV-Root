package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import j.AbstractC0515e;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static a f5514c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f5515a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Handler f5516b = new Handler(Looper.getMainLooper(), new C0110a());

    /* renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    public class C0110a implements Handler.Callback {
        public C0110a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            AbstractC0515e.a(message.obj);
            aVar.c(null);
            return true;
        }
    }

    public interface b {
    }

    public static class c {
    }

    public static a b() {
        if (f5514c == null) {
            f5514c = new a();
        }
        return f5514c;
    }

    public final boolean a(c cVar, int i3) {
        throw null;
    }

    public void c(c cVar) {
        synchronized (this.f5515a) {
            a(cVar, 2);
        }
    }

    public final boolean d(b bVar) {
        return false;
    }

    public void e(b bVar) {
        synchronized (this.f5515a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f5515a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

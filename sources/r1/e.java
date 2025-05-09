package R1;

import R1.e;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import e2.InterfaceC0465a;
import i2.InterfaceC0504b;
import i2.h;
import i2.i;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class e implements i.c, InterfaceC0465a {

    /* renamed from: b, reason: collision with root package name */
    public i f1898b;

    /* renamed from: c, reason: collision with root package name */
    public R1.a f1899c;

    /* renamed from: d, reason: collision with root package name */
    public HandlerThread f1900d;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1901e;

    public static class a implements i.d {

        /* renamed from: a, reason: collision with root package name */
        public final i.d f1902a;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f1903b = new Handler(Looper.getMainLooper());

        public a(i.d dVar) {
            this.f1902a = dVar;
        }

        @Override // i2.i.d
        public void a(final String str, final String str2, final Object obj) {
            this.f1903b.post(new Runnable() { // from class: R1.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.a.this.f1902a.a(str, str2, obj);
                }
            });
        }

        @Override // i2.i.d
        public void b(final Object obj) {
            this.f1903b.post(new Runnable() { // from class: R1.c
                @Override // java.lang.Runnable
                public final void run() {
                    e.a.this.f1902a.b(obj);
                }
            });
        }

        @Override // i2.i.d
        public void c() {
            Handler handler = this.f1903b;
            final i.d dVar = this.f1902a;
            Objects.requireNonNull(dVar);
            handler.post(new Runnable() { // from class: R1.b
                @Override // java.lang.Runnable
                public final void run() {
                    i.d.this.c();
                }
            });
        }
    }

    public class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final h f1904e;

        /* renamed from: f, reason: collision with root package name */
        public final i.d f1905f;

        public b(h hVar, i.d dVar) {
            this.f1904e = hVar;
            this.f1905f = dVar;
        }

        public final void a(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            this.f1905f.a("Exception encountered", this.f1904e.f7499a, stringWriter.toString());
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z3;
            Exception e3;
            char c3 = 0;
            try {
                try {
                    e.this.f1899c.f1885e = (Map) ((Map) this.f1904e.f7500b).get("options");
                    e.this.f1899c.h();
                    z3 = e.this.f1899c.i();
                } catch (Exception e4) {
                    z3 = false;
                    e3 = e4;
                }
                try {
                    String str = this.f1904e.f7499a;
                    switch (str.hashCode()) {
                        case -1335458389:
                            if (str.equals("delete")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case -358737930:
                            if (str.equals("deleteAll")) {
                                c3 = 5;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 3496342:
                            if (str.equals("read")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 113399775:
                            if (str.equals("write")) {
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 208013248:
                            if (str.equals("containsKey")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1080375339:
                            if (str.equals("readAll")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    if (c3 == 0) {
                        String f3 = e.this.f(this.f1904e);
                        String g3 = e.this.g(this.f1904e);
                        if (g3 == null) {
                            this.f1905f.a("null", null, null);
                            return;
                        } else {
                            e.this.f1899c.p(f3, g3);
                            this.f1905f.b(null);
                            return;
                        }
                    }
                    if (c3 == 1) {
                        String f4 = e.this.f(this.f1904e);
                        if (!e.this.f1899c.c(f4)) {
                            this.f1905f.b(null);
                            return;
                        } else {
                            this.f1905f.b(e.this.f1899c.n(f4));
                            return;
                        }
                    }
                    if (c3 == 2) {
                        this.f1905f.b(e.this.f1899c.o());
                        return;
                    }
                    if (c3 == 3) {
                        this.f1905f.b(Boolean.valueOf(e.this.f1899c.c(e.this.f(this.f1904e))));
                    } else if (c3 == 4) {
                        e.this.f1899c.e(e.this.f(this.f1904e));
                        this.f1905f.b(null);
                    } else if (c3 != 5) {
                        this.f1905f.c();
                    } else {
                        e.this.f1899c.f();
                        this.f1905f.b(null);
                    }
                } catch (Exception e5) {
                    e3 = e5;
                    if (!z3) {
                        a(e3);
                        return;
                    }
                    try {
                        e.this.f1899c.f();
                        this.f1905f.b("Data has been reset");
                    } catch (Exception e6) {
                        a(e6);
                    }
                }
            } catch (FileNotFoundException e7) {
                Log.i("Creating sharedPrefs", e7.getLocalizedMessage());
            }
        }
    }

    @Override // i2.i.c
    public void a(h hVar, i.d dVar) {
        this.f1901e.post(new b(hVar, new a(dVar)));
    }

    @Override // e2.InterfaceC0465a
    public void b(InterfaceC0465a.b bVar) {
        h(bVar.b(), bVar.a());
    }

    public final String f(h hVar) {
        return this.f1899c.a((String) ((Map) hVar.f7500b).get("key"));
    }

    public final String g(h hVar) {
        return (String) ((Map) hVar.f7500b).get("value");
    }

    public void h(InterfaceC0504b interfaceC0504b, Context context) {
        try {
            this.f1899c = new R1.a(context, new HashMap());
            HandlerThread handlerThread = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.f1900d = handlerThread;
            handlerThread.start();
            this.f1901e = new Handler(this.f1900d.getLooper());
            i iVar = new i(interfaceC0504b, "plugins.it_nomads.com/flutter_secure_storage");
            this.f1898b = iVar;
            iVar.e(this);
        } catch (Exception e3) {
            Log.e("FlutterSecureStoragePl", "Registration failed", e3);
        }
    }

    @Override // e2.InterfaceC0465a
    public void p(InterfaceC0465a.b bVar) {
        if (this.f1898b != null) {
            this.f1900d.quitSafely();
            this.f1900d = null;
            this.f1898b.e(null);
            this.f1898b = null;
        }
        this.f1899c = null;
    }
}

package m2;

import android.util.Log;
import i2.C0503a;
import i2.InterfaceC0504b;
import i2.InterfaceC0509g;
import i2.l;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import m2.AbstractC0605h;

/* renamed from: m2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0605h {

    /* renamed from: m2.h$a */
    public interface a {
        static InterfaceC0509g a() {
            return b.f8522d;
        }

        static /* synthetic */ void f(a aVar, Object obj, C0503a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.j());
            } catch (Throwable th) {
                arrayList = AbstractC0605h.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void g(a aVar, Object obj, C0503a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.e());
            } catch (Throwable th) {
                arrayList = AbstractC0605h.a(th);
            }
            eVar.a(arrayList);
        }

        static void i(InterfaceC0504b interfaceC0504b, a aVar) {
            l(interfaceC0504b, "", aVar);
        }

        static /* synthetic */ void k(a aVar, Object obj, C0503a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.m());
            } catch (Throwable th) {
                arrayList = AbstractC0605h.a(th);
            }
            eVar.a(arrayList);
        }

        static void l(InterfaceC0504b interfaceC0504b, String str, final a aVar) {
            String str2;
            if (str.isEmpty()) {
                str2 = "";
            } else {
                str2 = "." + str;
            }
            C0503a c0503a = new C0503a(interfaceC0504b, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getTemporaryPath" + str2, a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a.e(new C0503a.d() { // from class: m2.a
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0605h.a.r(AbstractC0605h.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a.e(null);
            }
            C0503a c0503a2 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationSupportPath" + str2, a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a2.e(new C0503a.d() { // from class: m2.b
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0605h.a.n(AbstractC0605h.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a2.e(null);
            }
            C0503a c0503a3 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationDocumentsPath" + str2, a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a3.e(new C0503a.d() { // from class: m2.c
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0605h.a.g(AbstractC0605h.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a3.e(null);
            }
            C0503a c0503a4 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getApplicationCachePath" + str2, a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a4.e(new C0503a.d() { // from class: m2.d
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0605h.a.o(AbstractC0605h.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a4.e(null);
            }
            C0503a c0503a5 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePath" + str2, a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a5.e(new C0503a.d() { // from class: m2.e
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0605h.a.k(AbstractC0605h.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a5.e(null);
            }
            C0503a c0503a6 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalCachePaths" + str2, a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a6.e(new C0503a.d() { // from class: m2.f
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0605h.a.f(AbstractC0605h.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a6.e(null);
            }
            C0503a c0503a7 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.path_provider_android.PathProviderApi.getExternalStoragePaths" + str2, a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a7.e(new C0503a.d() { // from class: m2.g
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0605h.a.s(AbstractC0605h.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a7.e(null);
            }
        }

        static /* synthetic */ void n(a aVar, Object obj, C0503a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.q());
            } catch (Throwable th) {
                arrayList = AbstractC0605h.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void o(a aVar, Object obj, C0503a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.d());
            } catch (Throwable th) {
                arrayList = AbstractC0605h.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void r(a aVar, Object obj, C0503a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.c());
            } catch (Throwable th) {
                arrayList = AbstractC0605h.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void s(a aVar, Object obj, C0503a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.h((c) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = AbstractC0605h.a(th);
            }
            eVar.a(arrayList);
        }

        String c();

        String d();

        String e();

        List h(c cVar);

        List j();

        String m();

        String q();
    }

    /* renamed from: m2.h$b */
    public static class b extends l {

        /* renamed from: d, reason: collision with root package name */
        public static final b f8522d = new b();

        @Override // i2.l
        public Object g(byte b3, ByteBuffer byteBuffer) {
            if (b3 != -127) {
                return super.g(b3, byteBuffer);
            }
            Object f3 = f(byteBuffer);
            if (f3 == null) {
                return null;
            }
            return c.values()[((Long) f3).intValue()];
        }

        @Override // i2.l
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (!(obj instanceof c)) {
                super.p(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((c) obj).f8535e));
            }
        }
    }

    /* renamed from: m2.h$c */
    public enum c {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);


        /* renamed from: e, reason: collision with root package name */
        public final int f8535e;

        c(int i3) {
            this.f8535e = i3;
        }
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}

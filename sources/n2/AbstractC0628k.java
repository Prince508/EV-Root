package n2;

import android.util.Log;
import i2.C0503a;
import i2.InterfaceC0504b;
import i2.InterfaceC0509g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n2.AbstractC0628k;

/* renamed from: n2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0628k {

    /* renamed from: n2.k$a */
    public interface a {
        static InterfaceC0509g a() {
            return new i2.l();
        }

        static /* synthetic */ void d(a aVar, Object obj, C0503a.e eVar) {
            Long valueOf;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            String str = (String) arrayList2.get(0);
            Number number = (Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = Long.valueOf(number.longValue());
                } catch (Throwable th) {
                    arrayList = AbstractC0628k.a(th);
                }
            }
            arrayList.add(0, aVar.h(str, valueOf));
            eVar.a(arrayList);
        }

        static /* synthetic */ void f(a aVar, Object obj, C0503a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, aVar.c((String) arrayList2.get(0), (Boolean) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = AbstractC0628k.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void g(a aVar, Object obj, C0503a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, aVar.i((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = AbstractC0628k.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void j(a aVar, Object obj, C0503a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, aVar.r((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = AbstractC0628k.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void k(a aVar, Object obj, C0503a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, aVar.e((String) arrayList2.get(0), (Double) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = AbstractC0628k.a(th);
            }
            eVar.a(arrayList);
        }

        static void m(InterfaceC0504b interfaceC0504b, final a aVar) {
            C0503a c0503a = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove", a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a.e(new C0503a.d() { // from class: n2.c
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0628k.a.o(AbstractC0628k.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a.e(null);
            }
            C0503a c0503a2 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool", a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a2.e(new C0503a.d() { // from class: n2.d
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0628k.a.f(AbstractC0628k.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a2.e(null);
            }
            C0503a c0503a3 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString", a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a3.e(new C0503a.d() { // from class: n2.e
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0628k.a.q(AbstractC0628k.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a3.e(null);
            }
            C0503a c0503a4 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt", a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a4.e(new C0503a.d() { // from class: n2.f
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0628k.a.d(AbstractC0628k.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a4.e(null);
            }
            C0503a c0503a5 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble", a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a5.e(new C0503a.d() { // from class: n2.g
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0628k.a.k(AbstractC0628k.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a5.e(null);
            }
            C0503a c0503a6 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setStringList", a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a6.e(new C0503a.d() { // from class: n2.h
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0628k.a.n(AbstractC0628k.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a6.e(null);
            }
            C0503a c0503a7 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear", a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a7.e(new C0503a.d() { // from class: n2.i
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0628k.a.j(AbstractC0628k.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a7.e(null);
            }
            C0503a c0503a8 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll", a(), interfaceC0504b.f());
            if (aVar != null) {
                c0503a8.e(new C0503a.d() { // from class: n2.j
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        AbstractC0628k.a.g(AbstractC0628k.a.this, obj, eVar);
                    }
                });
            } else {
                c0503a8.e(null);
            }
        }

        static /* synthetic */ void n(a aVar, Object obj, C0503a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, aVar.s((String) arrayList2.get(0), (List) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = AbstractC0628k.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void o(a aVar, Object obj, C0503a.e eVar) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(0, aVar.remove((String) ((ArrayList) obj).get(0)));
            } catch (Throwable th) {
                arrayList = AbstractC0628k.a(th);
            }
            eVar.a(arrayList);
        }

        static /* synthetic */ void q(a aVar, Object obj, C0503a.e eVar) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = (ArrayList) obj;
            try {
                arrayList.add(0, aVar.l((String) arrayList2.get(0), (String) arrayList2.get(1)));
            } catch (Throwable th) {
                arrayList = AbstractC0628k.a(th);
            }
            eVar.a(arrayList);
        }

        Boolean c(String str, Boolean bool);

        Boolean e(String str, Double d3);

        Boolean h(String str, Long l3);

        Map i(String str, List list);

        Boolean l(String str, String str2);

        Boolean r(String str, List list);

        Boolean remove(String str);

        Boolean s(String str, List list);
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}

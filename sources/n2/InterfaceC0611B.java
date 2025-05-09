package n2;

import i2.C0503a;
import i2.InterfaceC0504b;
import i2.InterfaceC0509g;
import java.util.List;
import java.util.Map;
import n2.InterfaceC0611B;
import r2.AbstractC0699l;

/* renamed from: n2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0611B {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8557a = a.f8558a;

    /* renamed from: n2.B$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f8558a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final q2.d f8559b = q2.e.a(new B2.a() { // from class: n2.n
            @Override // B2.a
            public final Object b() {
                C0629l o3;
                o3 = InterfaceC0611B.a.o();
                return o3;
            }
        });

        public static final void A(InterfaceC0611B interfaceC0611B, Object obj, C0503a.e eVar) {
            List b3;
            C2.k.e(eVar, "reply");
            C2.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            C2.k.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                b3 = AbstractC0699l.b(interfaceC0611B.m(list2, (C0614E) obj2));
            } catch (Throwable th) {
                b3 = AbstractC0630m.b(th);
            }
            eVar.a(b3);
        }

        public static final void B(InterfaceC0611B interfaceC0611B, Object obj, C0503a.e eVar) {
            List b3;
            C2.k.e(eVar, "reply");
            C2.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C2.k.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            C2.k.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            Object obj4 = list.get(2);
            C2.k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                interfaceC0611B.n(str, str2, (C0614E) obj4);
                b3 = AbstractC0699l.b(null);
            } catch (Throwable th) {
                b3 = AbstractC0630m.b(th);
            }
            eVar.a(b3);
        }

        public static final void C(InterfaceC0611B interfaceC0611B, Object obj, C0503a.e eVar) {
            List b3;
            C2.k.e(eVar, "reply");
            C2.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C2.k.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            C2.k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj3).longValue();
            Object obj4 = list.get(2);
            C2.k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                interfaceC0611B.h(str, longValue, (C0614E) obj4);
                b3 = AbstractC0699l.b(null);
            } catch (Throwable th) {
                b3 = AbstractC0630m.b(th);
            }
            eVar.a(b3);
        }

        public static final void D(InterfaceC0611B interfaceC0611B, Object obj, C0503a.e eVar) {
            List b3;
            C2.k.e(eVar, "reply");
            C2.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C2.k.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            C2.k.c(obj3, "null cannot be cast to non-null type kotlin.Double");
            double doubleValue = ((Double) obj3).doubleValue();
            Object obj4 = list.get(2);
            C2.k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                interfaceC0611B.d(str, doubleValue, (C0614E) obj4);
                b3 = AbstractC0699l.b(null);
            } catch (Throwable th) {
                b3 = AbstractC0630m.b(th);
            }
            eVar.a(b3);
        }

        public static final C0629l o() {
            return new C0629l();
        }

        public static final void r(InterfaceC0611B interfaceC0611B, Object obj, C0503a.e eVar) {
            List b3;
            C2.k.e(eVar, "reply");
            C2.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C2.k.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            C2.k.c(obj3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            List list2 = (List) obj3;
            Object obj4 = list.get(2);
            C2.k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                interfaceC0611B.e(str, list2, (C0614E) obj4);
                b3 = AbstractC0699l.b(null);
            } catch (Throwable th) {
                b3 = AbstractC0630m.b(th);
            }
            eVar.a(b3);
        }

        public static final void s(InterfaceC0611B interfaceC0611B, Object obj, C0503a.e eVar) {
            List b3;
            C2.k.e(eVar, "reply");
            C2.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C2.k.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            C2.k.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                b3 = AbstractC0699l.b(interfaceC0611B.c(str, (C0614E) obj3));
            } catch (Throwable th) {
                b3 = AbstractC0630m.b(th);
            }
            eVar.a(b3);
        }

        public static final void t(InterfaceC0611B interfaceC0611B, Object obj, C0503a.e eVar) {
            List b3;
            C2.k.e(eVar, "reply");
            C2.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C2.k.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            C2.k.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                b3 = AbstractC0699l.b(interfaceC0611B.a(str, (C0614E) obj3));
            } catch (Throwable th) {
                b3 = AbstractC0630m.b(th);
            }
            eVar.a(b3);
        }

        public static final void u(InterfaceC0611B interfaceC0611B, Object obj, C0503a.e eVar) {
            List b3;
            C2.k.e(eVar, "reply");
            C2.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C2.k.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            C2.k.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                b3 = AbstractC0699l.b(interfaceC0611B.i(str, (C0614E) obj3));
            } catch (Throwable th) {
                b3 = AbstractC0630m.b(th);
            }
            eVar.a(b3);
        }

        public static final void v(InterfaceC0611B interfaceC0611B, Object obj, C0503a.e eVar) {
            List b3;
            C2.k.e(eVar, "reply");
            C2.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C2.k.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            C2.k.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                b3 = AbstractC0699l.b(interfaceC0611B.k(str, (C0614E) obj3));
            } catch (Throwable th) {
                b3 = AbstractC0630m.b(th);
            }
            eVar.a(b3);
        }

        public static final void w(InterfaceC0611B interfaceC0611B, Object obj, C0503a.e eVar) {
            List b3;
            C2.k.e(eVar, "reply");
            C2.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C2.k.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            C2.k.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = list.get(2);
            C2.k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                interfaceC0611B.l(str, booleanValue, (C0614E) obj4);
                b3 = AbstractC0699l.b(null);
            } catch (Throwable th) {
                b3 = AbstractC0630m.b(th);
            }
            eVar.a(b3);
        }

        public static final void x(InterfaceC0611B interfaceC0611B, Object obj, C0503a.e eVar) {
            List b3;
            C2.k.e(eVar, "reply");
            C2.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            C2.k.c(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            Object obj3 = list.get(1);
            C2.k.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                b3 = AbstractC0699l.b(interfaceC0611B.j(str, (C0614E) obj3));
            } catch (Throwable th) {
                b3 = AbstractC0630m.b(th);
            }
            eVar.a(b3);
        }

        public static final void y(InterfaceC0611B interfaceC0611B, Object obj, C0503a.e eVar) {
            List b3;
            C2.k.e(eVar, "reply");
            C2.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            C2.k.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                interfaceC0611B.f(list2, (C0614E) obj2);
                b3 = AbstractC0699l.b(null);
            } catch (Throwable th) {
                b3 = AbstractC0630m.b(th);
            }
            eVar.a(b3);
        }

        public static final void z(InterfaceC0611B interfaceC0611B, Object obj, C0503a.e eVar) {
            List b3;
            C2.k.e(eVar, "reply");
            C2.k.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            List list2 = (List) list.get(0);
            Object obj2 = list.get(1);
            C2.k.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
            try {
                b3 = AbstractC0699l.b(interfaceC0611B.g(list2, (C0614E) obj2));
            } catch (Throwable th) {
                b3 = AbstractC0630m.b(th);
            }
            eVar.a(b3);
        }

        public final InterfaceC0509g p() {
            return (InterfaceC0509g) f8559b.getValue();
        }

        public final void q(InterfaceC0504b interfaceC0504b, final InterfaceC0611B interfaceC0611B, String str) {
            String str2;
            C2.k.e(interfaceC0504b, "binaryMessenger");
            C2.k.e(str, "messageChannelSuffix");
            if (str.length() > 0) {
                str2 = "." + str;
            } else {
                str2 = "";
            }
            C0503a c0503a = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool" + str2, p(), interfaceC0504b.f());
            if (interfaceC0611B != null) {
                c0503a.e(new C0503a.d() { // from class: n2.s
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        InterfaceC0611B.a.w(InterfaceC0611B.this, obj, eVar);
                    }
                });
            } else {
                c0503a.e(null);
            }
            C0503a c0503a2 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString" + str2, p(), interfaceC0504b.f());
            if (interfaceC0611B != null) {
                c0503a2.e(new C0503a.d() { // from class: n2.w
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        InterfaceC0611B.a.B(InterfaceC0611B.this, obj, eVar);
                    }
                });
            } else {
                c0503a2.e(null);
            }
            C0503a c0503a3 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt" + str2, p(), interfaceC0504b.f());
            if (interfaceC0611B != null) {
                c0503a3.e(new C0503a.d() { // from class: n2.x
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        InterfaceC0611B.a.C(InterfaceC0611B.this, obj, eVar);
                    }
                });
            } else {
                c0503a3.e(null);
            }
            C0503a c0503a4 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble" + str2, p(), interfaceC0504b.f());
            if (interfaceC0611B != null) {
                c0503a4.e(new C0503a.d() { // from class: n2.y
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        InterfaceC0611B.a.D(InterfaceC0611B.this, obj, eVar);
                    }
                });
            } else {
                c0503a4.e(null);
            }
            C0503a c0503a5 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setStringList" + str2, p(), interfaceC0504b.f());
            if (interfaceC0611B != null) {
                c0503a5.e(new C0503a.d() { // from class: n2.z
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        InterfaceC0611B.a.r(InterfaceC0611B.this, obj, eVar);
                    }
                });
            } else {
                c0503a5.e(null);
            }
            C0503a c0503a6 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString" + str2, p(), interfaceC0504b.f());
            if (interfaceC0611B != null) {
                c0503a6.e(new C0503a.d() { // from class: n2.A
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        InterfaceC0611B.a.s(InterfaceC0611B.this, obj, eVar);
                    }
                });
            } else {
                c0503a6.e(null);
            }
            C0503a c0503a7 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool" + str2, p(), interfaceC0504b.f());
            if (interfaceC0611B != null) {
                c0503a7.e(new C0503a.d() { // from class: n2.o
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        InterfaceC0611B.a.t(InterfaceC0611B.this, obj, eVar);
                    }
                });
            } else {
                c0503a7.e(null);
            }
            C0503a c0503a8 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble" + str2, p(), interfaceC0504b.f());
            if (interfaceC0611B != null) {
                c0503a8.e(new C0503a.d() { // from class: n2.p
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        InterfaceC0611B.a.u(InterfaceC0611B.this, obj, eVar);
                    }
                });
            } else {
                c0503a8.e(null);
            }
            C0503a c0503a9 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt" + str2, p(), interfaceC0504b.f());
            if (interfaceC0611B != null) {
                c0503a9.e(new C0503a.d() { // from class: n2.q
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        InterfaceC0611B.a.v(InterfaceC0611B.this, obj, eVar);
                    }
                });
            } else {
                c0503a9.e(null);
            }
            C0503a c0503a10 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList" + str2, p(), interfaceC0504b.f());
            if (interfaceC0611B != null) {
                c0503a10.e(new C0503a.d() { // from class: n2.r
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        InterfaceC0611B.a.x(InterfaceC0611B.this, obj, eVar);
                    }
                });
            } else {
                c0503a10.e(null);
            }
            C0503a c0503a11 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear" + str2, p(), interfaceC0504b.f());
            if (interfaceC0611B != null) {
                c0503a11.e(new C0503a.d() { // from class: n2.t
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        InterfaceC0611B.a.y(InterfaceC0611B.this, obj, eVar);
                    }
                });
            } else {
                c0503a11.e(null);
            }
            C0503a c0503a12 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll" + str2, p(), interfaceC0504b.f());
            if (interfaceC0611B != null) {
                c0503a12.e(new C0503a.d() { // from class: n2.u
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        InterfaceC0611B.a.z(InterfaceC0611B.this, obj, eVar);
                    }
                });
            } else {
                c0503a12.e(null);
            }
            C0503a c0503a13 = new C0503a(interfaceC0504b, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys" + str2, p(), interfaceC0504b.f());
            if (interfaceC0611B != null) {
                c0503a13.e(new C0503a.d() { // from class: n2.v
                    @Override // i2.C0503a.d
                    public final void a(Object obj, C0503a.e eVar) {
                        InterfaceC0611B.a.A(InterfaceC0611B.this, obj, eVar);
                    }
                });
            } else {
                c0503a13.e(null);
            }
        }
    }

    Boolean a(String str, C0614E c0614e);

    String c(String str, C0614E c0614e);

    void d(String str, double d3, C0614E c0614e);

    void e(String str, List list, C0614E c0614e);

    void f(List list, C0614E c0614e);

    Map g(List list, C0614E c0614e);

    void h(String str, long j3, C0614E c0614e);

    Double i(String str, C0614E c0614e);

    List j(String str, C0614E c0614e);

    Long k(String str, C0614E c0614e);

    void l(String str, boolean z3, C0614E c0614e);

    List m(List list, C0614E c0614e);

    void n(String str, String str2, C0614E c0614e);
}

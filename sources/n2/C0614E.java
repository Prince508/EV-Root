package n2;

import java.util.List;
import r2.AbstractC0700m;

/* renamed from: n2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614E {

    /* renamed from: c, reason: collision with root package name */
    public static final a f8563c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f8564a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8565b;

    /* renamed from: n2.E$a */
    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public final C0614E a(List list) {
            C2.k.e(list, "pigeonVar_list");
            String str = (String) list.get(0);
            Object obj = list.get(1);
            C2.k.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
            return new C0614E(str, ((Boolean) obj).booleanValue());
        }

        public a() {
        }
    }

    public C0614E(String str, boolean z3) {
        this.f8564a = str;
        this.f8565b = z3;
    }

    public final String a() {
        return this.f8564a;
    }

    public final List b() {
        return AbstractC0700m.h(this.f8564a, Boolean.valueOf(this.f8565b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0614E)) {
            return false;
        }
        C0614E c0614e = (C0614E) obj;
        return C2.k.a(this.f8564a, c0614e.f8564a) && this.f8565b == c0614e.f8565b;
    }

    public int hashCode() {
        String str = this.f8564a;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.f8565b);
    }

    public String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f8564a + ", useDataStore=" + this.f8565b + ")";
    }
}

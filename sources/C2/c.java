package C2;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class c implements H2.a, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f298k = a.f305e;

    /* renamed from: e, reason: collision with root package name */
    public transient H2.a f299e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f300f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f301g;

    /* renamed from: h, reason: collision with root package name */
    public final String f302h;

    /* renamed from: i, reason: collision with root package name */
    public final String f303i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f304j;

    public static class a implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        public static final a f305e = new a();
    }

    public c(Object obj, Class cls, String str, String str2, boolean z3) {
        this.f300f = obj;
        this.f301g = cls;
        this.f302h = str;
        this.f303i = str2;
        this.f304j = z3;
    }

    public H2.a a() {
        H2.a aVar = this.f299e;
        if (aVar != null) {
            return aVar;
        }
        H2.a c3 = c();
        this.f299e = c3;
        return c3;
    }

    public abstract H2.a c();

    public Object d() {
        return this.f300f;
    }

    public String f() {
        return this.f302h;
    }

    public H2.d k() {
        Class cls = this.f301g;
        if (cls == null) {
            return null;
        }
        return this.f304j ? u.c(cls) : u.b(cls);
    }

    public H2.a l() {
        H2.a a3 = a();
        if (a3 != this) {
            return a3;
        }
        throw new A2.b();
    }

    public String m() {
        return this.f303i;
    }
}

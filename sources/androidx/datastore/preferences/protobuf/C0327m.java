package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0333t;
import j.AbstractC0515e;
import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0327m {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3749b = true;

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0327m f3751d;

    /* renamed from: a, reason: collision with root package name */
    public final Map f3753a = Collections.EMPTY_MAP;

    /* renamed from: c, reason: collision with root package name */
    public static final Class f3750c = c();

    /* renamed from: e, reason: collision with root package name */
    public static final C0327m f3752e = new C0327m(true);

    /* renamed from: androidx.datastore.preferences.protobuf.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f3754a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3755b;

        public a(Object obj, int i3) {
            this.f3754a = obj;
            this.f3755b = i3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3754a == aVar.f3754a && this.f3755b == aVar.f3755b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f3754a) * 65535) + this.f3755b;
        }
    }

    public C0327m(boolean z3) {
    }

    public static C0327m b() {
        C0327m c0327m;
        C0327m c0327m2 = f3751d;
        if (c0327m2 != null) {
            return c0327m2;
        }
        synchronized (C0327m.class) {
            try {
                c0327m = f3751d;
                if (c0327m == null) {
                    c0327m = f3749b ? AbstractC0326l.a() : f3752e;
                    f3751d = c0327m;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0327m;
    }

    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public AbstractC0333t.c a(J j3, int i3) {
        AbstractC0515e.a(this.f3753a.get(new a(j3, i3)));
        return null;
    }
}

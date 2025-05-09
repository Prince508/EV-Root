package f0;

import C2.g;
import C2.k;
import android.util.Log;
import android.view.ViewGroup;
import e0.AbstractComponentCallbacksC0459p;
import e0.B;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import r2.AbstractC0685C;
import r2.AbstractC0687E;
import r2.u;

/* renamed from: f0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0470c f7174a = new C0470c();

    /* renamed from: b, reason: collision with root package name */
    public static C0119c f7175b = C0119c.f7187d;

    /* renamed from: f0.c$a */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: f0.c$b */
    public interface b {
    }

    /* renamed from: f0.c$c, reason: collision with other inner class name */
    public static final class C0119c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f7186c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final C0119c f7187d = new C0119c(AbstractC0687E.b(), null, AbstractC0685C.d());

        /* renamed from: a, reason: collision with root package name */
        public final Set f7188a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f7189b;

        /* renamed from: f0.c$c$a */
        public static final class a {
            public /* synthetic */ a(g gVar) {
                this();
            }

            public a() {
            }
        }

        public C0119c(Set set, b bVar, Map map) {
            k.e(set, "flags");
            k.e(map, "allowedViolations");
            this.f7188a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f7189b = linkedHashMap;
        }

        public final Set a() {
            return this.f7188a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f7189b;
        }
    }

    public static final void d(String str, AbstractC0471d abstractC0471d) {
        k.e(abstractC0471d, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, abstractC0471d);
        throw abstractC0471d;
    }

    public static final void f(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, String str) {
        k.e(abstractComponentCallbacksC0459p, "fragment");
        k.e(str, "previousFragmentId");
        C0468a c0468a = new C0468a(abstractComponentCallbacksC0459p, str);
        C0470c c0470c = f7174a;
        c0470c.e(c0468a);
        C0119c b3 = c0470c.b(abstractComponentCallbacksC0459p);
        if (b3.a().contains(a.DETECT_FRAGMENT_REUSE) && c0470c.j(b3, abstractComponentCallbacksC0459p.getClass(), c0468a.getClass())) {
            c0470c.c(b3, c0468a);
        }
    }

    public static final void g(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, ViewGroup viewGroup) {
        k.e(abstractComponentCallbacksC0459p, "fragment");
        k.e(viewGroup, "container");
        C0472e c0472e = new C0472e(abstractComponentCallbacksC0459p, viewGroup);
        C0470c c0470c = f7174a;
        c0470c.e(c0472e);
        C0119c b3 = c0470c.b(abstractComponentCallbacksC0459p);
        if (b3.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && c0470c.j(b3, abstractComponentCallbacksC0459p.getClass(), c0472e.getClass())) {
            c0470c.c(b3, c0472e);
        }
    }

    public static final void h(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2, int i3) {
        k.e(abstractComponentCallbacksC0459p, "fragment");
        k.e(abstractComponentCallbacksC0459p2, "expectedParentFragment");
        C0473f c0473f = new C0473f(abstractComponentCallbacksC0459p, abstractComponentCallbacksC0459p2, i3);
        C0470c c0470c = f7174a;
        c0470c.e(c0473f);
        C0119c b3 = c0470c.b(abstractComponentCallbacksC0459p);
        if (b3.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && c0470c.j(b3, abstractComponentCallbacksC0459p.getClass(), c0473f.getClass())) {
            c0470c.c(b3, c0473f);
        }
    }

    public final C0119c b(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        while (abstractComponentCallbacksC0459p != null) {
            if (abstractComponentCallbacksC0459p.Q()) {
                B z3 = abstractComponentCallbacksC0459p.z();
                k.d(z3, "declaringFragment.parentFragmentManager");
                if (z3.o0() != null) {
                    C0119c o02 = z3.o0();
                    k.b(o02);
                    return o02;
                }
            }
            abstractComponentCallbacksC0459p = abstractComponentCallbacksC0459p.y();
        }
        return f7175b;
    }

    public final void c(C0119c c0119c, final AbstractC0471d abstractC0471d) {
        AbstractComponentCallbacksC0459p a3 = abstractC0471d.a();
        final String name = a3.getClass().getName();
        if (c0119c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, abstractC0471d);
        }
        c0119c.b();
        if (c0119c.a().contains(a.PENALTY_DEATH)) {
            i(a3, new Runnable() { // from class: f0.b
                @Override // java.lang.Runnable
                public final void run() {
                    C0470c.d(name, abstractC0471d);
                }
            });
        }
    }

    public final void e(AbstractC0471d abstractC0471d) {
        if (B.v0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + abstractC0471d.a().getClass().getName(), abstractC0471d);
        }
    }

    public final void i(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, Runnable runnable) {
        if (abstractComponentCallbacksC0459p.Q()) {
            abstractComponentCallbacksC0459p.z().j0();
            throw null;
        }
        runnable.run();
    }

    public final boolean j(C0119c c0119c, Class cls, Class cls2) {
        Set set = (Set) c0119c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (k.a(cls2.getSuperclass(), AbstractC0471d.class) || !u.o(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}

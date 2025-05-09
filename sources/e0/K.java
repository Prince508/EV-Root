package e0;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import o.C0639a;
import s0.C0709e;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final K f6508a;

    /* renamed from: b, reason: collision with root package name */
    public static final M f6509b;

    /* renamed from: c, reason: collision with root package name */
    public static final M f6510c;

    static {
        K k3 = new K();
        f6508a = k3;
        f6509b = new L();
        f6510c = k3.b();
    }

    public static final void a(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2, boolean z3, C0639a c0639a, boolean z4) {
        C2.k.e(abstractComponentCallbacksC0459p, "inFragment");
        C2.k.e(abstractComponentCallbacksC0459p2, "outFragment");
        C2.k.e(c0639a, "sharedElements");
        if (z3) {
            abstractComponentCallbacksC0459p2.q();
        } else {
            abstractComponentCallbacksC0459p.q();
        }
    }

    public static final void c(C0639a c0639a, C0639a c0639a2) {
        C2.k.e(c0639a, "<this>");
        C2.k.e(c0639a2, "namedViews");
        int size = c0639a.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (!c0639a2.containsKey((String) c0639a.m(size))) {
                c0639a.k(size);
            }
        }
    }

    public static final void d(List list, int i3) {
        C2.k.e(list, "views");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i3);
        }
    }

    public final M b() {
        try {
            C2.k.c(C0709e.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            return (M) C0709e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

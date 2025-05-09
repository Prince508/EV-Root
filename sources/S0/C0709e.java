package s0;

import G.b;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import e0.AbstractComponentCallbacksC0459p;
import java.util.ArrayList;
import java.util.List;
import s0.AbstractC0715k;

/* renamed from: s0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0709e extends e0.M {

    /* renamed from: s0.e$a */
    public class a extends AbstractC0715k.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f9174a;

        public a(Rect rect) {
            this.f9174a = rect;
        }
    }

    /* renamed from: s0.e$c */
    public class c extends s {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f9179a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9180b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f9181c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9182d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f9183e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9184f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f9179a = obj;
            this.f9180b = arrayList;
            this.f9181c = obj2;
            this.f9182d = arrayList2;
            this.f9183e = obj3;
            this.f9184f = arrayList3;
        }

        @Override // s0.s, s0.AbstractC0715k.h
        public void a(AbstractC0715k abstractC0715k) {
            abstractC0715k.b0(this);
        }

        @Override // s0.s, s0.AbstractC0715k.h
        public void f(AbstractC0715k abstractC0715k) {
            Object obj = this.f9179a;
            if (obj != null) {
                C0709e.this.E(obj, this.f9180b, null);
            }
            Object obj2 = this.f9181c;
            if (obj2 != null) {
                C0709e.this.E(obj2, this.f9182d, null);
            }
            Object obj3 = this.f9183e;
            if (obj3 != null) {
                C0709e.this.E(obj3, this.f9184f, null);
            }
        }
    }

    /* renamed from: s0.e$e, reason: collision with other inner class name */
    public class C0155e extends AbstractC0715k.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f9188a;

        public C0155e(Rect rect) {
            this.f9188a = rect;
        }
    }

    public static /* synthetic */ void C(Runnable runnable, AbstractC0715k abstractC0715k, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC0715k.j();
            runnable2.run();
        }
    }

    public static boolean D(AbstractC0715k abstractC0715k) {
        return (e0.M.l(abstractC0715k.F()) && e0.M.l(abstractC0715k.G()) && e0.M.l(abstractC0715k.H())) ? false : true;
    }

    @Override // e0.M
    public void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        w wVar = (w) obj;
        if (wVar != null) {
            wVar.I().clear();
            wVar.I().addAll(arrayList2);
            E(wVar, arrayList, arrayList2);
        }
    }

    @Override // e0.M
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        w wVar = new w();
        wVar.r0((AbstractC0715k) obj);
        return wVar;
    }

    public void E(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0715k abstractC0715k = (AbstractC0715k) obj;
        int i3 = 0;
        if (abstractC0715k instanceof w) {
            w wVar = (w) abstractC0715k;
            int u02 = wVar.u0();
            while (i3 < u02) {
                E(wVar.t0(i3), arrayList, arrayList2);
                i3++;
            }
            return;
        }
        if (D(abstractC0715k)) {
            return;
        }
        List I3 = abstractC0715k.I();
        if (I3.size() == arrayList.size() && I3.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i3 < size) {
                abstractC0715k.e((View) arrayList2.get(i3));
                i3++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC0715k.c0((View) arrayList.get(size2));
            }
        }
    }

    @Override // e0.M
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0715k) obj).e(view);
        }
    }

    @Override // e0.M
    public void b(Object obj, ArrayList arrayList) {
        AbstractC0715k abstractC0715k = (AbstractC0715k) obj;
        if (abstractC0715k == null) {
            return;
        }
        int i3 = 0;
        if (abstractC0715k instanceof w) {
            w wVar = (w) abstractC0715k;
            int u02 = wVar.u0();
            while (i3 < u02) {
                b(wVar.t0(i3), arrayList);
                i3++;
            }
            return;
        }
        if (D(abstractC0715k) || !e0.M.l(abstractC0715k.I())) {
            return;
        }
        int size = arrayList.size();
        while (i3 < size) {
            abstractC0715k.e((View) arrayList.get(i3));
            i3++;
        }
    }

    @Override // e0.M
    public void c(Object obj) {
        ((v) obj).k();
    }

    @Override // e0.M
    public void d(Object obj, Runnable runnable) {
        ((v) obj).d(runnable);
    }

    @Override // e0.M
    public void e(ViewGroup viewGroup, Object obj) {
        t.a(viewGroup, (AbstractC0715k) obj);
    }

    @Override // e0.M
    public boolean g(Object obj) {
        return obj instanceof AbstractC0715k;
    }

    @Override // e0.M
    public Object h(Object obj) {
        if (obj != null) {
            return ((AbstractC0715k) obj).clone();
        }
        return null;
    }

    @Override // e0.M
    public Object j(ViewGroup viewGroup, Object obj) {
        return t.b(viewGroup, (AbstractC0715k) obj);
    }

    @Override // e0.M
    public boolean m() {
        return true;
    }

    @Override // e0.M
    public boolean n(Object obj) {
        boolean N3 = ((AbstractC0715k) obj).N();
        if (!N3) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return N3;
    }

    @Override // e0.M
    public Object o(Object obj, Object obj2, Object obj3) {
        AbstractC0715k abstractC0715k = (AbstractC0715k) obj;
        AbstractC0715k abstractC0715k2 = (AbstractC0715k) obj2;
        AbstractC0715k abstractC0715k3 = (AbstractC0715k) obj3;
        if (abstractC0715k != null && abstractC0715k2 != null) {
            abstractC0715k = new w().r0(abstractC0715k).r0(abstractC0715k2).A0(1);
        } else if (abstractC0715k == null) {
            abstractC0715k = abstractC0715k2 != null ? abstractC0715k2 : null;
        }
        if (abstractC0715k3 == null) {
            return abstractC0715k;
        }
        w wVar = new w();
        if (abstractC0715k != null) {
            wVar.r0(abstractC0715k);
        }
        wVar.r0(abstractC0715k3);
        return wVar;
    }

    @Override // e0.M
    public Object p(Object obj, Object obj2, Object obj3) {
        w wVar = new w();
        if (obj != null) {
            wVar.r0((AbstractC0715k) obj);
        }
        if (obj2 != null) {
            wVar.r0((AbstractC0715k) obj2);
        }
        if (obj3 != null) {
            wVar.r0((AbstractC0715k) obj3);
        }
        return wVar;
    }

    @Override // e0.M
    public void r(Object obj, View view, ArrayList arrayList) {
        ((AbstractC0715k) obj).c(new b(view, arrayList));
    }

    @Override // e0.M
    public void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC0715k) obj).c(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // e0.M
    public void t(Object obj, float f3) {
        v vVar = (v) obj;
        if (vVar.b()) {
            long g3 = (long) (f3 * vVar.g());
            if (g3 == 0) {
                g3 = 1;
            }
            if (g3 == vVar.g()) {
                g3 = vVar.g() - 1;
            }
            vVar.h(g3);
        }
    }

    @Override // e0.M
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC0715k) obj).i0(new C0155e(rect));
        }
    }

    @Override // e0.M
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((AbstractC0715k) obj).i0(new a(rect));
        }
    }

    @Override // e0.M
    public void w(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, Object obj, G.b bVar, Runnable runnable) {
        x(abstractComponentCallbacksC0459p, obj, bVar, null, runnable);
    }

    @Override // e0.M
    public void x(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, Object obj, G.b bVar, final Runnable runnable, final Runnable runnable2) {
        final AbstractC0715k abstractC0715k = (AbstractC0715k) obj;
        bVar.b(new b.a() { // from class: s0.d
            @Override // G.b.a
            public final void a() {
                C0709e.C(runnable, abstractC0715k, runnable2);
            }
        });
        abstractC0715k.c(new d(runnable2));
    }

    @Override // e0.M
    public void z(Object obj, View view, ArrayList arrayList) {
        w wVar = (w) obj;
        List I3 = wVar.I();
        I3.clear();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            e0.M.f(I3, (View) arrayList.get(i3));
        }
        I3.add(view);
        arrayList.add(view);
        b(wVar, arrayList);
    }

    /* renamed from: s0.e$b */
    public class b implements AbstractC0715k.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f9176a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9177b;

        public b(View view, ArrayList arrayList) {
            this.f9176a = view;
            this.f9177b = arrayList;
        }

        @Override // s0.AbstractC0715k.h
        public void a(AbstractC0715k abstractC0715k) {
            abstractC0715k.b0(this);
            this.f9176a.setVisibility(8);
            int size = this.f9177b.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((View) this.f9177b.get(i3)).setVisibility(0);
            }
        }

        @Override // s0.AbstractC0715k.h
        public void f(AbstractC0715k abstractC0715k) {
            abstractC0715k.b0(this);
            abstractC0715k.c(this);
        }

        @Override // s0.AbstractC0715k.h
        public void c(AbstractC0715k abstractC0715k) {
        }

        @Override // s0.AbstractC0715k.h
        public void j(AbstractC0715k abstractC0715k) {
        }

        @Override // s0.AbstractC0715k.h
        public void l(AbstractC0715k abstractC0715k) {
        }
    }

    /* renamed from: s0.e$d */
    public class d implements AbstractC0715k.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f9186a;

        public d(Runnable runnable) {
            this.f9186a = runnable;
        }

        @Override // s0.AbstractC0715k.h
        public void a(AbstractC0715k abstractC0715k) {
            this.f9186a.run();
        }

        @Override // s0.AbstractC0715k.h
        public void c(AbstractC0715k abstractC0715k) {
        }

        @Override // s0.AbstractC0715k.h
        public void f(AbstractC0715k abstractC0715k) {
        }

        @Override // s0.AbstractC0715k.h
        public void j(AbstractC0715k abstractC0715k) {
        }

        @Override // s0.AbstractC0715k.h
        public void l(AbstractC0715k abstractC0715k) {
        }
    }
}

package s0;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import o.C0639a;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static AbstractC0715k f9261a = new C0705a();

    /* renamed from: b, reason: collision with root package name */
    public static ThreadLocal f9262b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static ArrayList f9263c = new ArrayList();

    public static void a(ViewGroup viewGroup, AbstractC0715k abstractC0715k) {
        if (f9263c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f9263c.add(viewGroup);
        if (abstractC0715k == null) {
            abstractC0715k = f9261a;
        }
        AbstractC0715k clone = abstractC0715k.clone();
        e(viewGroup, clone);
        AbstractC0714j.b(viewGroup, null);
        d(viewGroup, clone);
    }

    public static v b(ViewGroup viewGroup, AbstractC0715k abstractC0715k) {
        if (f9263c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!abstractC0715k.N()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f9263c.add(viewGroup);
        AbstractC0715k clone = abstractC0715k.clone();
        w wVar = new w();
        wVar.r0(clone);
        e(viewGroup, wVar);
        AbstractC0714j.b(viewGroup, null);
        d(viewGroup, wVar);
        viewGroup.invalidate();
        return wVar.t();
    }

    public static C0639a c() {
        C0639a c0639a;
        WeakReference weakReference = (WeakReference) f9262b.get();
        if (weakReference != null && (c0639a = (C0639a) weakReference.get()) != null) {
            return c0639a;
        }
        C0639a c0639a2 = new C0639a();
        f9262b.set(new WeakReference(c0639a2));
        return c0639a2;
    }

    public static void d(ViewGroup viewGroup, AbstractC0715k abstractC0715k) {
        if (abstractC0715k == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC0715k, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static void e(ViewGroup viewGroup, AbstractC0715k abstractC0715k) {
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC0715k) it.next()).Y(viewGroup);
            }
        }
        if (abstractC0715k != null) {
            abstractC0715k.o(viewGroup, true);
        }
        AbstractC0714j.a(viewGroup);
    }

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: e, reason: collision with root package name */
        public AbstractC0715k f9264e;

        /* renamed from: f, reason: collision with root package name */
        public ViewGroup f9265f;

        /* renamed from: s0.t$a$a, reason: collision with other inner class name */
        public class C0156a extends s {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C0639a f9266a;

            public C0156a(C0639a c0639a) {
                this.f9266a = c0639a;
            }

            @Override // s0.s, s0.AbstractC0715k.h
            public void a(AbstractC0715k abstractC0715k) {
                ((ArrayList) this.f9266a.get(a.this.f9265f)).remove(abstractC0715k);
                abstractC0715k.b0(this);
            }
        }

        public a(AbstractC0715k abstractC0715k, ViewGroup viewGroup) {
            this.f9264e = abstractC0715k;
            this.f9265f = viewGroup;
        }

        public final void a() {
            this.f9265f.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f9265f.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!t.f9263c.remove(this.f9265f)) {
                return true;
            }
            C0639a c3 = t.c();
            ArrayList arrayList = (ArrayList) c3.get(this.f9265f);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c3.put(this.f9265f, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f9264e);
            this.f9264e.c(new C0156a(c3));
            this.f9264e.o(this.f9265f, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC0715k) it.next()).d0(this.f9265f);
                }
            }
            this.f9264e.Z(this.f9265f);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            t.f9263c.remove(this.f9265f);
            ArrayList arrayList = (ArrayList) t.c().get(this.f9265f);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0715k) it.next()).d0(this.f9265f);
                }
            }
            this.f9264e.p(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}

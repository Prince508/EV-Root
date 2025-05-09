package androidx.recyclerview.widget;

import K.O;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c extends m {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f4487s;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f4488h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f4489i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f4490j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f4491k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f4492l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f4493m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f4494n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f4495o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f4496p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f4497q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f4498r = new ArrayList();

    public class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4499e;

        public a(ArrayList arrayList) {
            this.f4499e = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4499e.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.f4533a, jVar.f4534b, jVar.f4535c, jVar.f4536d, jVar.f4537e);
            }
            this.f4499e.clear();
            c.this.f4493m.remove(this.f4499e);
        }
    }

    public class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4501e;

        public b(ArrayList arrayList) {
            this.f4501e = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4501e.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f4501e.clear();
            c.this.f4494n.remove(this.f4501e);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    public class RunnableC0098c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ArrayList f4503e;

        public RunnableC0098c(ArrayList arrayList) {
            this.f4503e = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4503e.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.C) it.next());
            }
            this.f4503e.clear();
            c.this.f4492l.remove(this.f4503e);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.C f4505a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f4506b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f4507c;

        public d(RecyclerView.C c3, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4505a = c3;
            this.f4506b = viewPropertyAnimator;
            this.f4507c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4506b.setListener(null);
            this.f4507c.setAlpha(1.0f);
            c.this.G(this.f4505a);
            c.this.f4497q.remove(this.f4505a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f4505a);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.C f4509a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f4510b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f4511c;

        public e(RecyclerView.C c3, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4509a = c3;
            this.f4510b = view;
            this.f4511c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4510b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4511c.setListener(null);
            c.this.A(this.f4509a);
            c.this.f4495o.remove(this.f4509a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f4509a);
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.C f4513a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f4514b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f4515c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f4516d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f4517e;

        public f(RecyclerView.C c3, int i3, View view, int i4, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4513a = c3;
            this.f4514b = i3;
            this.f4515c = view;
            this.f4516d = i4;
            this.f4517e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f4514b != 0) {
                this.f4515c.setTranslationX(0.0f);
            }
            if (this.f4516d != 0) {
                this.f4515c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4517e.setListener(null);
            c.this.E(this.f4513a);
            c.this.f4496p.remove(this.f4513a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f4513a);
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f4519a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f4520b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f4521c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4519a = iVar;
            this.f4520b = viewPropertyAnimator;
            this.f4521c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4520b.setListener(null);
            this.f4521c.setAlpha(1.0f);
            this.f4521c.setTranslationX(0.0f);
            this.f4521c.setTranslationY(0.0f);
            c.this.C(this.f4519a.f4527a, true);
            c.this.f4498r.remove(this.f4519a.f4527a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f4519a.f4527a, true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f4523a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f4524b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f4525c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4523a = iVar;
            this.f4524b = viewPropertyAnimator;
            this.f4525c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4524b.setListener(null);
            this.f4525c.setAlpha(1.0f);
            this.f4525c.setTranslationX(0.0f);
            this.f4525c.setTranslationY(0.0f);
            c.this.C(this.f4523a.f4528b, false);
            c.this.f4498r.remove(this.f4523a.f4528b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f4523a.f4528b, false);
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.C f4533a;

        /* renamed from: b, reason: collision with root package name */
        public int f4534b;

        /* renamed from: c, reason: collision with root package name */
        public int f4535c;

        /* renamed from: d, reason: collision with root package name */
        public int f4536d;

        /* renamed from: e, reason: collision with root package name */
        public int f4537e;

        public j(RecyclerView.C c3, int i3, int i4, int i5, int i6) {
            this.f4533a = c3;
            this.f4534b = i3;
            this.f4535c = i4;
            this.f4536d = i5;
            this.f4537e = i6;
        }
    }

    public void Q(RecyclerView.C c3) {
        View view = c3.f4302a;
        ViewPropertyAnimator animate = view.animate();
        this.f4495o.add(c3);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(c3, view, animate)).start();
    }

    public void R(i iVar) {
        RecyclerView.C c3 = iVar.f4527a;
        View view = c3 == null ? null : c3.f4302a;
        RecyclerView.C c4 = iVar.f4528b;
        View view2 = c4 != null ? c4.f4302a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f4498r.add(iVar.f4527a);
            duration.translationX(iVar.f4531e - iVar.f4529c);
            duration.translationY(iVar.f4532f - iVar.f4530d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f4498r.add(iVar.f4528b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    public void S(RecyclerView.C c3, int i3, int i4, int i5, int i6) {
        View view = c3.f4302a;
        int i7 = i5 - i3;
        int i8 = i6 - i4;
        if (i7 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i8 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f4496p.add(c3);
        animate.setDuration(n()).setListener(new f(c3, i7, view, i8, animate)).start();
    }

    public final void T(RecyclerView.C c3) {
        View view = c3.f4302a;
        ViewPropertyAnimator animate = view.animate();
        this.f4497q.add(c3);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(c3, animate, view)).start();
    }

    public void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.C) list.get(size)).f4302a.animate().cancel();
        }
    }

    public void V() {
        if (p()) {
            return;
        }
        i();
    }

    public final void W(List list, RecyclerView.C c3) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, c3) && iVar.f4527a == null && iVar.f4528b == null) {
                list.remove(iVar);
            }
        }
    }

    public final void X(i iVar) {
        RecyclerView.C c3 = iVar.f4527a;
        if (c3 != null) {
            Y(iVar, c3);
        }
        RecyclerView.C c4 = iVar.f4528b;
        if (c4 != null) {
            Y(iVar, c4);
        }
    }

    public final boolean Y(i iVar, RecyclerView.C c3) {
        boolean z3 = false;
        if (iVar.f4528b == c3) {
            iVar.f4528b = null;
        } else {
            if (iVar.f4527a != c3) {
                return false;
            }
            iVar.f4527a = null;
            z3 = true;
        }
        c3.f4302a.setAlpha(1.0f);
        c3.f4302a.setTranslationX(0.0f);
        c3.f4302a.setTranslationY(0.0f);
        C(c3, z3);
        return true;
    }

    public final void Z(RecyclerView.C c3) {
        if (f4487s == null) {
            f4487s = new ValueAnimator().getInterpolator();
        }
        c3.f4302a.animate().setInterpolator(f4487s);
        j(c3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.C c3, List list) {
        return !list.isEmpty() || super.g(c3, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.C c3) {
        View view = c3.f4302a;
        view.animate().cancel();
        int size = this.f4490j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f4490j.get(size)).f4533a == c3) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(c3);
                this.f4490j.remove(size);
            }
        }
        W(this.f4491k, c3);
        if (this.f4488h.remove(c3)) {
            view.setAlpha(1.0f);
            G(c3);
        }
        if (this.f4489i.remove(c3)) {
            view.setAlpha(1.0f);
            A(c3);
        }
        for (int size2 = this.f4494n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f4494n.get(size2);
            W(arrayList, c3);
            if (arrayList.isEmpty()) {
                this.f4494n.remove(size2);
            }
        }
        for (int size3 = this.f4493m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f4493m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f4533a == c3) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(c3);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4493m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4492l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f4492l.get(size5);
            if (arrayList3.remove(c3)) {
                view.setAlpha(1.0f);
                A(c3);
                if (arrayList3.isEmpty()) {
                    this.f4492l.remove(size5);
                }
            }
        }
        this.f4497q.remove(c3);
        this.f4495o.remove(c3);
        this.f4498r.remove(c3);
        this.f4496p.remove(c3);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        int size = this.f4490j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f4490j.get(size);
            View view = jVar.f4533a.f4302a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f4533a);
            this.f4490j.remove(size);
        }
        for (int size2 = this.f4488h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.C) this.f4488h.get(size2));
            this.f4488h.remove(size2);
        }
        int size3 = this.f4489i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C c3 = (RecyclerView.C) this.f4489i.get(size3);
            c3.f4302a.setAlpha(1.0f);
            A(c3);
            this.f4489i.remove(size3);
        }
        for (int size4 = this.f4491k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f4491k.get(size4));
        }
        this.f4491k.clear();
        if (p()) {
            for (int size5 = this.f4493m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f4493m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f4533a.f4302a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f4533a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4493m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4492l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f4492l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C c4 = (RecyclerView.C) arrayList2.get(size8);
                    c4.f4302a.setAlpha(1.0f);
                    A(c4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4492l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4494n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f4494n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4494n.remove(arrayList3);
                    }
                }
            }
            U(this.f4497q);
            U(this.f4496p);
            U(this.f4495o);
            U(this.f4498r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return (this.f4489i.isEmpty() && this.f4491k.isEmpty() && this.f4490j.isEmpty() && this.f4488h.isEmpty() && this.f4496p.isEmpty() && this.f4497q.isEmpty() && this.f4495o.isEmpty() && this.f4498r.isEmpty() && this.f4493m.isEmpty() && this.f4492l.isEmpty() && this.f4494n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void u() {
        boolean isEmpty = this.f4488h.isEmpty();
        boolean isEmpty2 = this.f4490j.isEmpty();
        boolean isEmpty3 = this.f4491k.isEmpty();
        boolean isEmpty4 = this.f4489i.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        Iterator it = this.f4488h.iterator();
        while (it.hasNext()) {
            T((RecyclerView.C) it.next());
        }
        this.f4488h.clear();
        if (!isEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f4490j);
            this.f4493m.add(arrayList);
            this.f4490j.clear();
            a aVar = new a(arrayList);
            if (isEmpty) {
                aVar.run();
            } else {
                O.c0(((j) arrayList.get(0)).f4533a.f4302a, aVar, o());
            }
        }
        if (!isEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f4491k);
            this.f4494n.add(arrayList2);
            this.f4491k.clear();
            b bVar = new b(arrayList2);
            if (isEmpty) {
                bVar.run();
            } else {
                O.c0(((i) arrayList2.get(0)).f4527a.f4302a, bVar, o());
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f4489i);
        this.f4492l.add(arrayList3);
        this.f4489i.clear();
        RunnableC0098c runnableC0098c = new RunnableC0098c(arrayList3);
        if (isEmpty && isEmpty2 && isEmpty3) {
            runnableC0098c.run();
        } else {
            O.c0(((RecyclerView.C) arrayList3.get(0)).f4302a, runnableC0098c, (!isEmpty ? o() : 0L) + Math.max(!isEmpty2 ? n() : 0L, isEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.m
    public boolean w(RecyclerView.C c3) {
        Z(c3);
        c3.f4302a.setAlpha(0.0f);
        this.f4489i.add(c3);
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean x(RecyclerView.C c3, RecyclerView.C c4, int i3, int i4, int i5, int i6) {
        if (c3 == c4) {
            return y(c3, i3, i4, i5, i6);
        }
        float translationX = c3.f4302a.getTranslationX();
        float translationY = c3.f4302a.getTranslationY();
        float alpha = c3.f4302a.getAlpha();
        Z(c3);
        int i7 = (int) ((i5 - i3) - translationX);
        int i8 = (int) ((i6 - i4) - translationY);
        c3.f4302a.setTranslationX(translationX);
        c3.f4302a.setTranslationY(translationY);
        c3.f4302a.setAlpha(alpha);
        if (c4 != null) {
            Z(c4);
            c4.f4302a.setTranslationX(-i7);
            c4.f4302a.setTranslationY(-i8);
            c4.f4302a.setAlpha(0.0f);
        }
        this.f4491k.add(new i(c3, c4, i3, i4, i5, i6));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean y(RecyclerView.C c3, int i3, int i4, int i5, int i6) {
        View view = c3.f4302a;
        int translationX = i3 + ((int) view.getTranslationX());
        int translationY = i4 + ((int) c3.f4302a.getTranslationY());
        Z(c3);
        int i7 = i5 - translationX;
        int i8 = i6 - translationY;
        if (i7 == 0 && i8 == 0) {
            E(c3);
            return false;
        }
        if (i7 != 0) {
            view.setTranslationX(-i7);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.f4490j.add(new j(c3, translationX, translationY, i5, i6));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean z(RecyclerView.C c3) {
        Z(c3);
        this.f4488h.add(c3);
        return true;
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.C f4527a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.C f4528b;

        /* renamed from: c, reason: collision with root package name */
        public int f4529c;

        /* renamed from: d, reason: collision with root package name */
        public int f4530d;

        /* renamed from: e, reason: collision with root package name */
        public int f4531e;

        /* renamed from: f, reason: collision with root package name */
        public int f4532f;

        public i(RecyclerView.C c3, RecyclerView.C c4) {
            this.f4527a = c3;
            this.f4528b = c4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4527a + ", newHolder=" + this.f4528b + ", fromX=" + this.f4529c + ", fromY=" + this.f4530d + ", toX=" + this.f4531e + ", toY=" + this.f4532f + '}';
        }

        public i(RecyclerView.C c3, RecyclerView.C c4, int i3, int i4, int i5, int i6) {
            this(c3, c4);
            this.f4529c = i3;
            this.f4530d = i4;
            this.f4531e = i5;
            this.f4532f = i6;
        }
    }
}

package s0;

import Z.b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C0639a;
import s0.AbstractC0715k;

/* renamed from: s0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0715k implements Cloneable {

    /* renamed from: P, reason: collision with root package name */
    public static final Animator[] f9195P = new Animator[0];

    /* renamed from: Q, reason: collision with root package name */
    public static final int[] f9196Q = {2, 1, 3, 4};

    /* renamed from: R, reason: collision with root package name */
    public static final AbstractC0711g f9197R = new a();

    /* renamed from: S, reason: collision with root package name */
    public static ThreadLocal f9198S = new ThreadLocal();

    /* renamed from: J, reason: collision with root package name */
    public e f9208J;

    /* renamed from: K, reason: collision with root package name */
    public C0639a f9209K;

    /* renamed from: M, reason: collision with root package name */
    public long f9211M;

    /* renamed from: N, reason: collision with root package name */
    public g f9212N;

    /* renamed from: O, reason: collision with root package name */
    public long f9213O;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f9233x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f9234y;

    /* renamed from: z, reason: collision with root package name */
    public h[] f9235z;

    /* renamed from: e, reason: collision with root package name */
    public String f9214e = getClass().getName();

    /* renamed from: f, reason: collision with root package name */
    public long f9215f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f9216g = -1;

    /* renamed from: h, reason: collision with root package name */
    public TimeInterpolator f9217h = null;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f9218i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f9219j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f9220k = null;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f9221l = null;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f9222m = null;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f9223n = null;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f9224o = null;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f9225p = null;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f9226q = null;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f9227r = null;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f9228s = null;

    /* renamed from: t, reason: collision with root package name */
    public z f9229t = new z();

    /* renamed from: u, reason: collision with root package name */
    public z f9230u = new z();

    /* renamed from: v, reason: collision with root package name */
    public w f9231v = null;

    /* renamed from: w, reason: collision with root package name */
    public int[] f9232w = f9196Q;

    /* renamed from: A, reason: collision with root package name */
    public boolean f9199A = false;

    /* renamed from: B, reason: collision with root package name */
    public ArrayList f9200B = new ArrayList();

    /* renamed from: C, reason: collision with root package name */
    public Animator[] f9201C = f9195P;

    /* renamed from: D, reason: collision with root package name */
    public int f9202D = 0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9203E = false;

    /* renamed from: F, reason: collision with root package name */
    public boolean f9204F = false;

    /* renamed from: G, reason: collision with root package name */
    public AbstractC0715k f9205G = null;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f9206H = null;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f9207I = new ArrayList();

    /* renamed from: L, reason: collision with root package name */
    public AbstractC0711g f9210L = f9197R;

    /* renamed from: s0.k$a */
    public class a extends AbstractC0711g {
        @Override // s0.AbstractC0711g
        public Path a(float f3, float f4, float f5, float f6) {
            Path path = new Path();
            path.moveTo(f3, f4);
            path.lineTo(f5, f6);
            return path;
        }
    }

    /* renamed from: s0.k$b */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0639a f9236a;

        public b(C0639a c0639a) {
            this.f9236a = c0639a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9236a.remove(animator);
            AbstractC0715k.this.f9200B.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC0715k.this.f9200B.add(animator);
        }
    }

    /* renamed from: s0.k$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0715k.this.u();
            animator.removeListener(this);
        }
    }

    /* renamed from: s0.k$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public View f9239a;

        /* renamed from: b, reason: collision with root package name */
        public String f9240b;

        /* renamed from: c, reason: collision with root package name */
        public y f9241c;

        /* renamed from: d, reason: collision with root package name */
        public WindowId f9242d;

        /* renamed from: e, reason: collision with root package name */
        public AbstractC0715k f9243e;

        /* renamed from: f, reason: collision with root package name */
        public Animator f9244f;

        public d(View view, String str, AbstractC0715k abstractC0715k, WindowId windowId, y yVar, Animator animator) {
            this.f9239a = view;
            this.f9240b = str;
            this.f9241c = yVar;
            this.f9242d = windowId;
            this.f9243e = abstractC0715k;
            this.f9244f = animator;
        }
    }

    /* renamed from: s0.k$e */
    public static abstract class e {
    }

    /* renamed from: s0.k$f */
    public static class f {
        public static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        public static void b(Animator animator, long j3) {
            ((AnimatorSet) animator).setCurrentPlayTime(j3);
        }
    }

    /* renamed from: s0.k$g */
    public class g extends s implements v, b.r {

        /* renamed from: d, reason: collision with root package name */
        public boolean f9248d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f9249e;

        /* renamed from: f, reason: collision with root package name */
        public Z.e f9250f;

        /* renamed from: i, reason: collision with root package name */
        public Runnable f9253i;

        /* renamed from: a, reason: collision with root package name */
        public long f9245a = -1;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f9246b = null;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f9247c = null;

        /* renamed from: g, reason: collision with root package name */
        public J.a[] f9251g = null;

        /* renamed from: h, reason: collision with root package name */
        public final C0703A f9252h = new C0703A();

        public g() {
        }

        public static /* synthetic */ void n(g gVar, Z.b bVar, boolean z3, float f3, float f4) {
            if (z3) {
                gVar.getClass();
                return;
            }
            if (f3 >= 1.0f) {
                AbstractC0715k.this.X(i.f9256b, false);
                return;
            }
            long g3 = gVar.g();
            AbstractC0715k t02 = ((w) AbstractC0715k.this).t0(0);
            AbstractC0715k abstractC0715k = t02.f9205G;
            t02.f9205G = null;
            AbstractC0715k.this.g0(-1L, gVar.f9245a);
            AbstractC0715k.this.g0(g3, -1L);
            gVar.f9245a = g3;
            Runnable runnable = gVar.f9253i;
            if (runnable != null) {
                runnable.run();
            }
            AbstractC0715k.this.f9207I.clear();
            if (abstractC0715k != null) {
                abstractC0715k.X(i.f9256b, true);
            }
        }

        @Override // s0.v
        public boolean b() {
            return this.f9248d;
        }

        @Override // s0.v
        public void d(Runnable runnable) {
            this.f9253i = runnable;
            p();
            this.f9250f.s(0.0f);
        }

        @Override // s0.v
        public long g() {
            return AbstractC0715k.this.J();
        }

        @Override // s0.v
        public void h(long j3) {
            if (this.f9250f != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j3 == this.f9245a || !b()) {
                return;
            }
            if (!this.f9249e) {
                if (j3 != 0 || this.f9245a <= 0) {
                    long g3 = g();
                    if (j3 == g3 && this.f9245a < g3) {
                        j3 = 1 + g3;
                    }
                } else {
                    j3 = -1;
                }
                long j4 = this.f9245a;
                if (j3 != j4) {
                    AbstractC0715k.this.g0(j3, j4);
                    this.f9245a = j3;
                }
            }
            o();
            this.f9252h.a(AnimationUtils.currentAnimationTimeMillis(), j3);
        }

        @Override // s0.s, s0.AbstractC0715k.h
        public void j(AbstractC0715k abstractC0715k) {
            this.f9249e = true;
        }

        @Override // s0.v
        public void k() {
            p();
            this.f9250f.s(g() + 1);
        }

        @Override // Z.b.r
        public void m(Z.b bVar, float f3, float f4) {
            long max = Math.max(-1L, Math.min(g() + 1, Math.round(f3)));
            AbstractC0715k.this.g0(max, this.f9245a);
            this.f9245a = max;
            o();
        }

        public final void o() {
            ArrayList arrayList = this.f9247c;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f9247c.size();
            if (this.f9251g == null) {
                this.f9251g = new J.a[size];
            }
            J.a[] aVarArr = (J.a[]) this.f9247c.toArray(this.f9251g);
            this.f9251g = null;
            for (int i3 = 0; i3 < size; i3++) {
                aVarArr[i3].accept(this);
                aVarArr[i3] = null;
            }
            this.f9251g = aVarArr;
        }

        public final void p() {
            if (this.f9250f != null) {
                return;
            }
            this.f9252h.a(AnimationUtils.currentAnimationTimeMillis(), this.f9245a);
            this.f9250f = new Z.e(new Z.d());
            Z.f fVar = new Z.f();
            fVar.d(1.0f);
            fVar.f(200.0f);
            this.f9250f.v(fVar);
            this.f9250f.m(this.f9245a);
            this.f9250f.c(this);
            this.f9250f.n(this.f9252h.b());
            this.f9250f.i(g() + 1);
            this.f9250f.j(-1.0f);
            this.f9250f.k(4.0f);
            this.f9250f.b(new b.q() { // from class: s0.m
                @Override // Z.b.q
                public final void a(Z.b bVar, boolean z3, float f3, float f4) {
                    AbstractC0715k.g.n(AbstractC0715k.g.this, bVar, z3, f3, f4);
                }
            });
        }

        public void q() {
            long j3 = g() == 0 ? 1L : 0L;
            AbstractC0715k.this.g0(j3, this.f9245a);
            this.f9245a = j3;
        }

        public void r() {
            this.f9248d = true;
            ArrayList arrayList = this.f9246b;
            if (arrayList != null) {
                this.f9246b = null;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((J.a) arrayList.get(i3)).accept(this);
                }
            }
            o();
        }
    }

    /* renamed from: s0.k$h */
    public interface h {
        void a(AbstractC0715k abstractC0715k);

        void c(AbstractC0715k abstractC0715k);

        default void e(AbstractC0715k abstractC0715k, boolean z3) {
            a(abstractC0715k);
        }

        void f(AbstractC0715k abstractC0715k);

        default void i(AbstractC0715k abstractC0715k, boolean z3) {
            f(abstractC0715k);
        }

        void j(AbstractC0715k abstractC0715k);

        void l(AbstractC0715k abstractC0715k);
    }

    /* renamed from: s0.k$i */
    public interface i {

        /* renamed from: a, reason: collision with root package name */
        public static final i f9255a = new i() { // from class: s0.n
            @Override // s0.AbstractC0715k.i
            public final void b(AbstractC0715k.h hVar, AbstractC0715k abstractC0715k, boolean z3) {
                hVar.i(abstractC0715k, z3);
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public static final i f9256b = new i() { // from class: s0.o
            @Override // s0.AbstractC0715k.i
            public final void b(AbstractC0715k.h hVar, AbstractC0715k abstractC0715k, boolean z3) {
                hVar.e(abstractC0715k, z3);
            }
        };

        /* renamed from: c, reason: collision with root package name */
        public static final i f9257c = new i() { // from class: s0.p
            @Override // s0.AbstractC0715k.i
            public final void b(AbstractC0715k.h hVar, AbstractC0715k abstractC0715k, boolean z3) {
                hVar.j(abstractC0715k);
            }
        };

        /* renamed from: d, reason: collision with root package name */
        public static final i f9258d = new i() { // from class: s0.q
            @Override // s0.AbstractC0715k.i
            public final void b(AbstractC0715k.h hVar, AbstractC0715k abstractC0715k, boolean z3) {
                hVar.c(abstractC0715k);
            }
        };

        /* renamed from: e, reason: collision with root package name */
        public static final i f9259e = new i() { // from class: s0.r
            @Override // s0.AbstractC0715k.i
            public final void b(AbstractC0715k.h hVar, AbstractC0715k abstractC0715k, boolean z3) {
                hVar.l(abstractC0715k);
            }
        };

        void b(h hVar, AbstractC0715k abstractC0715k, boolean z3);
    }

    public static C0639a D() {
        C0639a c0639a = (C0639a) f9198S.get();
        if (c0639a != null) {
            return c0639a;
        }
        C0639a c0639a2 = new C0639a();
        f9198S.set(c0639a2);
        return c0639a2;
    }

    public static boolean Q(y yVar, y yVar2, String str) {
        Object obj = yVar.f9278a.get(str);
        Object obj2 = yVar2.f9278a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void h(z zVar, View view, y yVar) {
        zVar.f9281a.put(view, yVar);
        int id = view.getId();
        if (id >= 0) {
            if (zVar.f9282b.indexOfKey(id) >= 0) {
                zVar.f9282b.put(id, null);
            } else {
                zVar.f9282b.put(id, view);
            }
        }
        String E3 = K.O.E(view);
        if (E3 != null) {
            if (zVar.f9284d.containsKey(E3)) {
                zVar.f9284d.put(E3, null);
            } else {
                zVar.f9284d.put(E3, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (zVar.f9283c.h(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    zVar.f9283c.j(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) zVar.f9283c.e(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    zVar.f9283c.j(itemIdAtPosition, null);
                }
            }
        }
    }

    public AbstractC0711g A() {
        return this.f9210L;
    }

    public u B() {
        return null;
    }

    public final AbstractC0715k C() {
        w wVar = this.f9231v;
        return wVar != null ? wVar.C() : this;
    }

    public long E() {
        return this.f9215f;
    }

    public List F() {
        return this.f9218i;
    }

    public List G() {
        return this.f9220k;
    }

    public List H() {
        return this.f9221l;
    }

    public List I() {
        return this.f9219j;
    }

    public final long J() {
        return this.f9211M;
    }

    public String[] K() {
        return null;
    }

    public y L(View view, boolean z3) {
        w wVar = this.f9231v;
        if (wVar != null) {
            return wVar.L(view, z3);
        }
        return (y) (z3 ? this.f9229t : this.f9230u).f9281a.get(view);
    }

    public boolean M() {
        return !this.f9200B.isEmpty();
    }

    public abstract boolean N();

    public boolean O(y yVar, y yVar2) {
        if (yVar != null && yVar2 != null) {
            String[] K3 = K();
            if (K3 != null) {
                for (String str : K3) {
                    if (Q(yVar, yVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = yVar.f9278a.keySet().iterator();
                while (it.hasNext()) {
                    if (Q(yVar, yVar2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean P(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f9222m;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f9223n;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f9224o;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((Class) this.f9224o.get(i3)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f9225p != null && K.O.E(view) != null && this.f9225p.contains(K.O.E(view))) {
            return false;
        }
        if ((this.f9218i.size() == 0 && this.f9219j.size() == 0 && (((arrayList = this.f9221l) == null || arrayList.isEmpty()) && ((arrayList2 = this.f9220k) == null || arrayList2.isEmpty()))) || this.f9218i.contains(Integer.valueOf(id)) || this.f9219j.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f9220k;
        if (arrayList6 != null && arrayList6.contains(K.O.E(view))) {
            return true;
        }
        if (this.f9221l != null) {
            for (int i4 = 0; i4 < this.f9221l.size(); i4++) {
                if (((Class) this.f9221l.get(i4)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void R(C0639a c0639a, C0639a c0639a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) sparseArray.valueAt(i3);
            if (view2 != null && P(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i3))) != null && P(view)) {
                y yVar = (y) c0639a.get(view2);
                y yVar2 = (y) c0639a2.get(view);
                if (yVar != null && yVar2 != null) {
                    this.f9233x.add(yVar);
                    this.f9234y.add(yVar2);
                    c0639a.remove(view2);
                    c0639a2.remove(view);
                }
            }
        }
    }

    public final void S(C0639a c0639a, C0639a c0639a2) {
        y yVar;
        for (int size = c0639a.size() - 1; size >= 0; size--) {
            View view = (View) c0639a.i(size);
            if (view != null && P(view) && (yVar = (y) c0639a2.remove(view)) != null && P(yVar.f9279b)) {
                this.f9233x.add((y) c0639a.k(size));
                this.f9234y.add(yVar);
            }
        }
    }

    public final void T(C0639a c0639a, C0639a c0639a2, o.d dVar, o.d dVar2) {
        View view;
        int m3 = dVar.m();
        for (int i3 = 0; i3 < m3; i3++) {
            View view2 = (View) dVar.n(i3);
            if (view2 != null && P(view2) && (view = (View) dVar2.e(dVar.i(i3))) != null && P(view)) {
                y yVar = (y) c0639a.get(view2);
                y yVar2 = (y) c0639a2.get(view);
                if (yVar != null && yVar2 != null) {
                    this.f9233x.add(yVar);
                    this.f9234y.add(yVar2);
                    c0639a.remove(view2);
                    c0639a2.remove(view);
                }
            }
        }
    }

    public final void U(C0639a c0639a, C0639a c0639a2, C0639a c0639a3, C0639a c0639a4) {
        View view;
        int size = c0639a3.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) c0639a3.m(i3);
            if (view2 != null && P(view2) && (view = (View) c0639a4.get(c0639a3.i(i3))) != null && P(view)) {
                y yVar = (y) c0639a.get(view2);
                y yVar2 = (y) c0639a2.get(view);
                if (yVar != null && yVar2 != null) {
                    this.f9233x.add(yVar);
                    this.f9234y.add(yVar2);
                    c0639a.remove(view2);
                    c0639a2.remove(view);
                }
            }
        }
    }

    public final void V(z zVar, z zVar2) {
        C0639a c0639a = new C0639a(zVar.f9281a);
        C0639a c0639a2 = new C0639a(zVar2.f9281a);
        int i3 = 0;
        while (true) {
            int[] iArr = this.f9232w;
            if (i3 >= iArr.length) {
                f(c0639a, c0639a2);
                return;
            }
            int i4 = iArr[i3];
            if (i4 == 1) {
                S(c0639a, c0639a2);
            } else if (i4 == 2) {
                U(c0639a, c0639a2, zVar.f9284d, zVar2.f9284d);
            } else if (i4 == 3) {
                R(c0639a, c0639a2, zVar.f9282b, zVar2.f9282b);
            } else if (i4 == 4) {
                T(c0639a, c0639a2, zVar.f9283c, zVar2.f9283c);
            }
            i3++;
        }
    }

    public final void W(AbstractC0715k abstractC0715k, i iVar, boolean z3) {
        AbstractC0715k abstractC0715k2 = this.f9205G;
        if (abstractC0715k2 != null) {
            abstractC0715k2.W(abstractC0715k, iVar, z3);
        }
        ArrayList arrayList = this.f9206H;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f9206H.size();
        h[] hVarArr = this.f9235z;
        if (hVarArr == null) {
            hVarArr = new h[size];
        }
        this.f9235z = null;
        h[] hVarArr2 = (h[]) this.f9206H.toArray(hVarArr);
        for (int i3 = 0; i3 < size; i3++) {
            iVar.b(hVarArr2[i3], abstractC0715k, z3);
            hVarArr2[i3] = null;
        }
        this.f9235z = hVarArr2;
    }

    public void X(i iVar, boolean z3) {
        W(this, iVar, z3);
    }

    public void Y(View view) {
        if (this.f9204F) {
            return;
        }
        int size = this.f9200B.size();
        Animator[] animatorArr = (Animator[]) this.f9200B.toArray(this.f9201C);
        this.f9201C = f9195P;
        for (int i3 = size - 1; i3 >= 0; i3--) {
            Animator animator = animatorArr[i3];
            animatorArr[i3] = null;
            animator.pause();
        }
        this.f9201C = animatorArr;
        X(i.f9258d, false);
        this.f9203E = true;
    }

    public void Z(ViewGroup viewGroup) {
        d dVar;
        this.f9233x = new ArrayList();
        this.f9234y = new ArrayList();
        V(this.f9229t, this.f9230u);
        C0639a D3 = D();
        int size = D3.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i3 = size - 1; i3 >= 0; i3--) {
            Animator animator = (Animator) D3.i(i3);
            if (animator != null && (dVar = (d) D3.get(animator)) != null && dVar.f9239a != null && windowId.equals(dVar.f9242d)) {
                y yVar = dVar.f9241c;
                View view = dVar.f9239a;
                y L3 = L(view, true);
                y y3 = y(view, true);
                if (L3 == null && y3 == null) {
                    y3 = (y) this.f9230u.f9281a.get(view);
                }
                if ((L3 != null || y3 != null) && dVar.f9243e.O(yVar, y3)) {
                    AbstractC0715k abstractC0715k = dVar.f9243e;
                    if (abstractC0715k.C().f9212N != null) {
                        animator.cancel();
                        abstractC0715k.f9200B.remove(animator);
                        D3.remove(animator);
                        if (abstractC0715k.f9200B.size() == 0) {
                            abstractC0715k.X(i.f9257c, false);
                            if (!abstractC0715k.f9204F) {
                                abstractC0715k.f9204F = true;
                                abstractC0715k.X(i.f9256b, false);
                            }
                        }
                    } else if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        D3.remove(animator);
                    }
                }
            }
        }
        s(viewGroup, this.f9229t, this.f9230u, this.f9233x, this.f9234y);
        if (this.f9212N == null) {
            f0();
        } else if (Build.VERSION.SDK_INT >= 34) {
            a0();
            this.f9212N.q();
            this.f9212N.r();
        }
    }

    public void a0() {
        C0639a D3 = D();
        this.f9211M = 0L;
        for (int i3 = 0; i3 < this.f9207I.size(); i3++) {
            Animator animator = (Animator) this.f9207I.get(i3);
            d dVar = (d) D3.get(animator);
            if (animator != null && dVar != null) {
                if (v() >= 0) {
                    dVar.f9244f.setDuration(v());
                }
                if (E() >= 0) {
                    dVar.f9244f.setStartDelay(E() + dVar.f9244f.getStartDelay());
                }
                if (x() != null) {
                    dVar.f9244f.setInterpolator(x());
                }
                this.f9200B.add(animator);
                this.f9211M = Math.max(this.f9211M, f.a(animator));
            }
        }
        this.f9207I.clear();
    }

    public AbstractC0715k b0(h hVar) {
        AbstractC0715k abstractC0715k;
        ArrayList arrayList = this.f9206H;
        if (arrayList != null) {
            if (!arrayList.remove(hVar) && (abstractC0715k = this.f9205G) != null) {
                abstractC0715k.b0(hVar);
            }
            if (this.f9206H.size() == 0) {
                this.f9206H = null;
            }
        }
        return this;
    }

    public AbstractC0715k c(h hVar) {
        if (this.f9206H == null) {
            this.f9206H = new ArrayList();
        }
        this.f9206H.add(hVar);
        return this;
    }

    public AbstractC0715k c0(View view) {
        this.f9219j.remove(view);
        return this;
    }

    public void d0(View view) {
        if (this.f9203E) {
            if (!this.f9204F) {
                int size = this.f9200B.size();
                Animator[] animatorArr = (Animator[]) this.f9200B.toArray(this.f9201C);
                this.f9201C = f9195P;
                for (int i3 = size - 1; i3 >= 0; i3--) {
                    Animator animator = animatorArr[i3];
                    animatorArr[i3] = null;
                    animator.resume();
                }
                this.f9201C = animatorArr;
                X(i.f9259e, false);
            }
            this.f9203E = false;
        }
    }

    public AbstractC0715k e(View view) {
        this.f9219j.add(view);
        return this;
    }

    public final void e0(Animator animator, C0639a c0639a) {
        if (animator != null) {
            animator.addListener(new b(c0639a));
            i(animator);
        }
    }

    public final void f(C0639a c0639a, C0639a c0639a2) {
        for (int i3 = 0; i3 < c0639a.size(); i3++) {
            y yVar = (y) c0639a.m(i3);
            if (P(yVar.f9279b)) {
                this.f9233x.add(yVar);
                this.f9234y.add(null);
            }
        }
        for (int i4 = 0; i4 < c0639a2.size(); i4++) {
            y yVar2 = (y) c0639a2.m(i4);
            if (P(yVar2.f9279b)) {
                this.f9234y.add(yVar2);
                this.f9233x.add(null);
            }
        }
    }

    public void f0() {
        n0();
        C0639a D3 = D();
        Iterator it = this.f9207I.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (D3.containsKey(animator)) {
                n0();
                e0(animator, D3);
            }
        }
        this.f9207I.clear();
        u();
    }

    public void g0(long j3, long j4) {
        long J3 = J();
        int i3 = 0;
        boolean z3 = j3 < j4;
        if ((j4 < 0 && j3 >= 0) || (j4 > J3 && j3 <= J3)) {
            this.f9204F = false;
            X(i.f9255a, z3);
        }
        int size = this.f9200B.size();
        Animator[] animatorArr = (Animator[]) this.f9200B.toArray(this.f9201C);
        this.f9201C = f9195P;
        while (i3 < size) {
            Animator animator = animatorArr[i3];
            animatorArr[i3] = null;
            f.b(animator, Math.min(Math.max(0L, j3), f.a(animator)));
            i3++;
            J3 = J3;
        }
        long j5 = J3;
        this.f9201C = animatorArr;
        if ((j3 <= j5 || j4 > j5) && (j3 >= 0 || j4 < 0)) {
            return;
        }
        if (j3 > j5) {
            this.f9204F = true;
        }
        X(i.f9256b, z3);
    }

    public AbstractC0715k h0(long j3) {
        this.f9216g = j3;
        return this;
    }

    public void i(Animator animator) {
        if (animator == null) {
            u();
            return;
        }
        if (v() >= 0) {
            animator.setDuration(v());
        }
        if (E() >= 0) {
            animator.setStartDelay(E() + animator.getStartDelay());
        }
        if (x() != null) {
            animator.setInterpolator(x());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void i0(e eVar) {
        this.f9208J = eVar;
    }

    public void j() {
        int size = this.f9200B.size();
        Animator[] animatorArr = (Animator[]) this.f9200B.toArray(this.f9201C);
        this.f9201C = f9195P;
        for (int i3 = size - 1; i3 >= 0; i3--) {
            Animator animator = animatorArr[i3];
            animatorArr[i3] = null;
            animator.cancel();
        }
        this.f9201C = animatorArr;
        X(i.f9257c, false);
    }

    public AbstractC0715k j0(TimeInterpolator timeInterpolator) {
        this.f9217h = timeInterpolator;
        return this;
    }

    public abstract void k(y yVar);

    public void k0(AbstractC0711g abstractC0711g) {
        if (abstractC0711g == null) {
            this.f9210L = f9197R;
        } else {
            this.f9210L = abstractC0711g;
        }
    }

    public final void l(View view, boolean z3) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f9222m;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f9223n;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f9224o;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (((Class) this.f9224o.get(i3)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    y yVar = new y(view);
                    if (z3) {
                        n(yVar);
                    } else {
                        k(yVar);
                    }
                    yVar.f9280c.add(this);
                    m(yVar);
                    if (z3) {
                        h(this.f9229t, view, yVar);
                    } else {
                        h(this.f9230u, view, yVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f9226q;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f9227r;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f9228s;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i4 = 0; i4 < size2; i4++) {
                                    if (((Class) this.f9228s.get(i4)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                                l(viewGroup.getChildAt(i5), z3);
                            }
                        }
                    }
                }
            }
        }
    }

    public AbstractC0715k m0(long j3) {
        this.f9215f = j3;
        return this;
    }

    public abstract void n(y yVar);

    public void n0() {
        if (this.f9202D == 0) {
            X(i.f9255a, false);
            this.f9204F = false;
        }
        this.f9202D++;
    }

    public void o(ViewGroup viewGroup, boolean z3) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C0639a c0639a;
        p(z3);
        if ((this.f9218i.size() > 0 || this.f9219j.size() > 0) && (((arrayList = this.f9220k) == null || arrayList.isEmpty()) && ((arrayList2 = this.f9221l) == null || arrayList2.isEmpty()))) {
            for (int i3 = 0; i3 < this.f9218i.size(); i3++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f9218i.get(i3)).intValue());
                if (findViewById != null) {
                    y yVar = new y(findViewById);
                    if (z3) {
                        n(yVar);
                    } else {
                        k(yVar);
                    }
                    yVar.f9280c.add(this);
                    m(yVar);
                    if (z3) {
                        h(this.f9229t, findViewById, yVar);
                    } else {
                        h(this.f9230u, findViewById, yVar);
                    }
                }
            }
            for (int i4 = 0; i4 < this.f9219j.size(); i4++) {
                View view = (View) this.f9219j.get(i4);
                y yVar2 = new y(view);
                if (z3) {
                    n(yVar2);
                } else {
                    k(yVar2);
                }
                yVar2.f9280c.add(this);
                m(yVar2);
                if (z3) {
                    h(this.f9229t, view, yVar2);
                } else {
                    h(this.f9230u, view, yVar2);
                }
            }
        } else {
            l(viewGroup, z3);
        }
        if (z3 || (c0639a = this.f9209K) == null) {
            return;
        }
        int size = c0639a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            arrayList3.add((View) this.f9229t.f9284d.remove((String) this.f9209K.i(i5)));
        }
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) arrayList3.get(i6);
            if (view2 != null) {
                this.f9229t.f9284d.put((String) this.f9209K.m(i6), view2);
            }
        }
    }

    public String o0(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f9216g != -1) {
            sb.append("dur(");
            sb.append(this.f9216g);
            sb.append(") ");
        }
        if (this.f9215f != -1) {
            sb.append("dly(");
            sb.append(this.f9215f);
            sb.append(") ");
        }
        if (this.f9217h != null) {
            sb.append("interp(");
            sb.append(this.f9217h);
            sb.append(") ");
        }
        if (this.f9218i.size() > 0 || this.f9219j.size() > 0) {
            sb.append("tgts(");
            if (this.f9218i.size() > 0) {
                for (int i3 = 0; i3 < this.f9218i.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f9218i.get(i3));
                }
            }
            if (this.f9219j.size() > 0) {
                for (int i4 = 0; i4 < this.f9219j.size(); i4++) {
                    if (i4 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f9219j.get(i4));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void p(boolean z3) {
        if (z3) {
            this.f9229t.f9281a.clear();
            this.f9229t.f9282b.clear();
            this.f9229t.f9283c.a();
        } else {
            this.f9230u.f9281a.clear();
            this.f9230u.f9282b.clear();
            this.f9230u.f9283c.a();
        }
    }

    @Override // 
    /* renamed from: q */
    public AbstractC0715k clone() {
        try {
            AbstractC0715k abstractC0715k = (AbstractC0715k) super.clone();
            abstractC0715k.f9207I = new ArrayList();
            abstractC0715k.f9229t = new z();
            abstractC0715k.f9230u = new z();
            abstractC0715k.f9233x = null;
            abstractC0715k.f9234y = null;
            abstractC0715k.f9212N = null;
            abstractC0715k.f9205G = this;
            abstractC0715k.f9206H = null;
            return abstractC0715k;
        } catch (CloneNotSupportedException e3) {
            throw new RuntimeException(e3);
        }
    }

    public Animator r(ViewGroup viewGroup, y yVar, y yVar2) {
        return null;
    }

    public void s(ViewGroup viewGroup, z zVar, z zVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        y yVar;
        Animator animator;
        Animator animator2;
        AbstractC0715k abstractC0715k = this;
        C0639a D3 = D();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z3 = abstractC0715k.C().f9212N != null;
        for (int i3 = 0; i3 < size; i3++) {
            y yVar2 = (y) arrayList.get(i3);
            y yVar3 = (y) arrayList2.get(i3);
            if (yVar2 != null && !yVar2.f9280c.contains(abstractC0715k)) {
                yVar2 = null;
            }
            if (yVar3 != null && !yVar3.f9280c.contains(abstractC0715k)) {
                yVar3 = null;
            }
            if ((yVar2 != null || yVar3 != null) && (yVar2 == null || yVar3 == null || abstractC0715k.O(yVar2, yVar3))) {
                Animator r3 = abstractC0715k.r(viewGroup, yVar2, yVar3);
                if (r3 != null) {
                    if (yVar3 != null) {
                        view = yVar3.f9279b;
                        String[] K3 = abstractC0715k.K();
                        if (K3 != null && K3.length > 0) {
                            yVar = new y(view);
                            y yVar4 = (y) zVar2.f9281a.get(view);
                            if (yVar4 != null) {
                                int i4 = 0;
                                while (i4 < K3.length) {
                                    Map map = yVar.f9278a;
                                    String[] strArr = K3;
                                    String str = strArr[i4];
                                    map.put(str, yVar4.f9278a.get(str));
                                    i4++;
                                    K3 = strArr;
                                    r3 = r3;
                                }
                            }
                            Animator animator3 = r3;
                            int size2 = D3.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                d dVar = (d) D3.get((Animator) D3.i(i5));
                                if (dVar.f9241c != null && dVar.f9239a == view && dVar.f9240b.equals(z()) && dVar.f9241c.equals(yVar)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            animator2 = r3;
                            yVar = null;
                        }
                        r3 = animator2;
                    } else {
                        view = yVar2.f9279b;
                        yVar = null;
                    }
                    View view2 = view;
                    if (r3 != null) {
                        Animator animator4 = r3;
                        abstractC0715k = this;
                        d dVar2 = new d(view2, z(), abstractC0715k, viewGroup.getWindowId(), yVar, animator4);
                        if (z3) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator4);
                            animator = animatorSet;
                        } else {
                            animator = animator4;
                        }
                        D3.put(animator, dVar2);
                        abstractC0715k.f9207I.add(animator);
                    } else {
                        abstractC0715k = this;
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                d dVar3 = (d) D3.get((Animator) abstractC0715k.f9207I.get(sparseIntArray.keyAt(i6)));
                dVar3.f9244f.setStartDelay((sparseIntArray.valueAt(i6) - Long.MAX_VALUE) + dVar3.f9244f.getStartDelay());
            }
        }
    }

    public v t() {
        g gVar = new g();
        this.f9212N = gVar;
        c(gVar);
        return this.f9212N;
    }

    public String toString() {
        return o0("");
    }

    public void u() {
        int i3 = this.f9202D - 1;
        this.f9202D = i3;
        if (i3 == 0) {
            X(i.f9256b, false);
            for (int i4 = 0; i4 < this.f9229t.f9283c.m(); i4++) {
                View view = (View) this.f9229t.f9283c.n(i4);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i5 = 0; i5 < this.f9230u.f9283c.m(); i5++) {
                View view2 = (View) this.f9230u.f9283c.n(i5);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f9204F = true;
        }
    }

    public long v() {
        return this.f9216g;
    }

    public e w() {
        return this.f9208J;
    }

    public TimeInterpolator x() {
        return this.f9217h;
    }

    public y y(View view, boolean z3) {
        w wVar = this.f9231v;
        if (wVar != null) {
            return wVar.y(view, z3);
        }
        ArrayList arrayList = z3 ? this.f9233x : this.f9234y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            }
            y yVar = (y) arrayList.get(i3);
            if (yVar == null) {
                return null;
            }
            if (yVar.f9279b == view) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            return (y) (z3 ? this.f9234y : this.f9233x).get(i3);
        }
        return null;
    }

    public String z() {
        return this.f9214e;
    }

    public void l0(u uVar) {
    }

    public void m(y yVar) {
    }
}

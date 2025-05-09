package e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import b.C0354b;
import e0.C0449f;
import e0.S;
import e0.r;
import j.AbstractC0515e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import o.C0639a;
import r2.AbstractC0701n;

/* renamed from: e0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0449f extends S {

    /* renamed from: e0.f$a */
    public static final class a extends S.b {

        /* renamed from: d, reason: collision with root package name */
        public final b f6603d;

        /* renamed from: e0.f$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0116a implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ S.d f6604a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f6605b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f6606c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f6607d;

            public AnimationAnimationListenerC0116a(S.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f6604a = dVar;
                this.f6605b = viewGroup;
                this.f6606c = view;
                this.f6607d = aVar;
            }

            public static final void b(ViewGroup viewGroup, View view, a aVar) {
                C2.k.e(viewGroup, "$container");
                C2.k.e(aVar, "this$0");
                viewGroup.endViewTransition(view);
                aVar.h().a().f(aVar);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                C2.k.e(animation, "animation");
                final ViewGroup viewGroup = this.f6605b;
                final View view = this.f6606c;
                final a aVar = this.f6607d;
                viewGroup.post(new Runnable() { // from class: e0.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0449f.a.AnimationAnimationListenerC0116a.b(viewGroup, view, aVar);
                    }
                });
                if (B.v0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f6604a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                C2.k.e(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                C2.k.e(animation, "animation");
                if (B.v0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f6604a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b bVar) {
            C2.k.e(bVar, "animationInfo");
            this.f6603d = bVar;
        }

        @Override // e0.S.b
        public void c(ViewGroup viewGroup) {
            C2.k.e(viewGroup, "container");
            S.d a3 = this.f6603d.a();
            View view = a3.i().f6698L;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            this.f6603d.a().f(this);
            if (B.v0(2)) {
                Log.v("FragmentManager", "Animation from operation " + a3 + " has been cancelled.");
            }
        }

        @Override // e0.S.b
        public void d(ViewGroup viewGroup) {
            C2.k.e(viewGroup, "container");
            if (this.f6603d.b()) {
                this.f6603d.a().f(this);
                return;
            }
            Context context = viewGroup.getContext();
            S.d a3 = this.f6603d.a();
            View view = a3.i().f6698L;
            b bVar = this.f6603d;
            C2.k.d(context, "context");
            r.a c3 = bVar.c(context);
            if (c3 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = c3.f6762a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (a3.h() != S.d.b.REMOVED) {
                view.startAnimation(animation);
                this.f6603d.a().f(this);
                return;
            }
            viewGroup.startViewTransition(view);
            r.b bVar2 = new r.b(animation, viewGroup, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0116a(a3, viewGroup, view, this));
            view.startAnimation(bVar2);
            if (B.v0(2)) {
                Log.v("FragmentManager", "Animation from operation " + a3 + " has started.");
            }
        }

        public final b h() {
            return this.f6603d;
        }
    }

    /* renamed from: e0.f$b */
    public static final class b extends C0117f {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f6608b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6609c;

        /* renamed from: d, reason: collision with root package name */
        public r.a f6610d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(S.d dVar, boolean z3) {
            super(dVar);
            C2.k.e(dVar, "operation");
            this.f6608b = z3;
        }

        public final r.a c(Context context) {
            C2.k.e(context, "context");
            if (this.f6609c) {
                return this.f6610d;
            }
            r.a b3 = r.b(context, a().i(), a().h() == S.d.b.VISIBLE, this.f6608b);
            this.f6610d = b3;
            this.f6609c = true;
            return b3;
        }
    }

    /* renamed from: e0.f$c */
    public static final class c extends S.b {

        /* renamed from: d, reason: collision with root package name */
        public final b f6611d;

        /* renamed from: e, reason: collision with root package name */
        public AnimatorSet f6612e;

        /* renamed from: e0.f$c$a */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f6613a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f6614b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f6615c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ S.d f6616d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c f6617e;

            public a(ViewGroup viewGroup, View view, boolean z3, S.d dVar, c cVar) {
                this.f6613a = viewGroup;
                this.f6614b = view;
                this.f6615c = z3;
                this.f6616d = dVar;
                this.f6617e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C2.k.e(animator, "anim");
                this.f6613a.endViewTransition(this.f6614b);
                if (this.f6615c) {
                    S.d.b h3 = this.f6616d.h();
                    View view = this.f6614b;
                    C2.k.d(view, "viewToAnimate");
                    h3.f(view, this.f6613a);
                }
                this.f6617e.h().a().f(this.f6617e);
                if (B.v0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f6616d + " has ended.");
                }
            }
        }

        public c(b bVar) {
            C2.k.e(bVar, "animatorInfo");
            this.f6611d = bVar;
        }

        @Override // e0.S.b
        public boolean b() {
            return true;
        }

        @Override // e0.S.b
        public void c(ViewGroup viewGroup) {
            C2.k.e(viewGroup, "container");
            AnimatorSet animatorSet = this.f6612e;
            if (animatorSet == null) {
                this.f6611d.a().f(this);
                return;
            }
            S.d a3 = this.f6611d.a();
            if (!a3.n()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                e.f6619a.a(animatorSet);
            }
            if (B.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(a3);
                sb.append(" has been canceled");
                sb.append(a3.n() ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }

        @Override // e0.S.b
        public void d(ViewGroup viewGroup) {
            C2.k.e(viewGroup, "container");
            S.d a3 = this.f6611d.a();
            AnimatorSet animatorSet = this.f6612e;
            if (animatorSet == null) {
                this.f6611d.a().f(this);
                return;
            }
            animatorSet.start();
            if (B.v0(2)) {
                Log.v("FragmentManager", "Animator from operation " + a3 + " has started.");
            }
        }

        @Override // e0.S.b
        public void e(C0354b c0354b, ViewGroup viewGroup) {
            C2.k.e(c0354b, "backEvent");
            C2.k.e(viewGroup, "container");
            S.d a3 = this.f6611d.a();
            AnimatorSet animatorSet = this.f6612e;
            if (animatorSet == null) {
                this.f6611d.a().f(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !a3.i().f6729q) {
                return;
            }
            if (B.v0(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + a3);
            }
            long a4 = d.f6618a.a(animatorSet);
            long a5 = (long) (c0354b.a() * a4);
            if (a5 == 0) {
                a5 = 1;
            }
            if (a5 == a4) {
                a5 = a4 - 1;
            }
            if (B.v0(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + a5 + " for Animator " + animatorSet + " on operation " + a3);
            }
            e.f6619a.b(animatorSet, a5);
        }

        @Override // e0.S.b
        public void f(ViewGroup viewGroup) {
            c cVar;
            C2.k.e(viewGroup, "container");
            if (this.f6611d.b()) {
                return;
            }
            Context context = viewGroup.getContext();
            b bVar = this.f6611d;
            C2.k.d(context, "context");
            r.a c3 = bVar.c(context);
            this.f6612e = c3 != null ? c3.f6763b : null;
            S.d a3 = this.f6611d.a();
            AbstractComponentCallbacksC0459p i3 = a3.i();
            boolean z3 = a3.h() == S.d.b.GONE;
            View view = i3.f6698L;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.f6612e;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(viewGroup, view, z3, a3, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.f6612e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final b h() {
            return this.f6611d;
        }
    }

    /* renamed from: e0.f$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f6618a = new d();

        public final long a(AnimatorSet animatorSet) {
            C2.k.e(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* renamed from: e0.f$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f6619a = new e();

        public final void a(AnimatorSet animatorSet) {
            C2.k.e(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j3) {
            C2.k.e(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j3);
        }
    }

    /* renamed from: e0.f$f, reason: collision with other inner class name */
    public static class C0117f {

        /* renamed from: a, reason: collision with root package name */
        public final S.d f6620a;

        public C0117f(S.d dVar) {
            C2.k.e(dVar, "operation");
            this.f6620a = dVar;
        }

        public final S.d a() {
            return this.f6620a;
        }

        public final boolean b() {
            View view = this.f6620a.i().f6698L;
            S.d.b a3 = view != null ? S.d.b.f6569e.a(view) : null;
            S.d.b h3 = this.f6620a.h();
            if (a3 == h3) {
                return true;
            }
            S.d.b bVar = S.d.b.VISIBLE;
            return (a3 == bVar || h3 == bVar) ? false : true;
        }
    }

    /* renamed from: e0.f$g */
    public static final class g extends S.b {

        /* renamed from: d, reason: collision with root package name */
        public final List f6621d;

        /* renamed from: e, reason: collision with root package name */
        public final S.d f6622e;

        /* renamed from: f, reason: collision with root package name */
        public final S.d f6623f;

        /* renamed from: g, reason: collision with root package name */
        public final M f6624g;

        /* renamed from: h, reason: collision with root package name */
        public final Object f6625h;

        /* renamed from: i, reason: collision with root package name */
        public final ArrayList f6626i;

        /* renamed from: j, reason: collision with root package name */
        public final ArrayList f6627j;

        /* renamed from: k, reason: collision with root package name */
        public final C0639a f6628k;

        /* renamed from: l, reason: collision with root package name */
        public final ArrayList f6629l;

        /* renamed from: m, reason: collision with root package name */
        public final ArrayList f6630m;

        /* renamed from: n, reason: collision with root package name */
        public final C0639a f6631n;

        /* renamed from: o, reason: collision with root package name */
        public final C0639a f6632o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f6633p;

        /* renamed from: q, reason: collision with root package name */
        public final G.b f6634q;

        /* renamed from: r, reason: collision with root package name */
        public Object f6635r;

        /* renamed from: e0.f$g$a */
        public static final class a extends C2.l implements B2.a {

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f6637g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ Object f6638h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f6637g = viewGroup;
                this.f6638h = obj;
            }

            public final void a() {
                g.this.v().e(this.f6637g, this.f6638h);
            }

            @Override // B2.a
            public /* bridge */ /* synthetic */ Object b() {
                a();
                return q2.n.f8874a;
            }
        }

        /* renamed from: e0.f$g$b */
        public static final class b extends C2.l implements B2.a {

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f6640g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ Object f6641h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ C2.t f6642i;

            /* renamed from: e0.f$g$b$a */
            public static final class a extends C2.l implements B2.a {

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ g f6643f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ ViewGroup f6644g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(g gVar, ViewGroup viewGroup) {
                    super(0);
                    this.f6643f = gVar;
                    this.f6644g = viewGroup;
                }

                public static final void d(g gVar, ViewGroup viewGroup) {
                    C2.k.e(gVar, "this$0");
                    C2.k.e(viewGroup, "$container");
                    Iterator it = gVar.w().iterator();
                    while (it.hasNext()) {
                        S.d a3 = ((h) it.next()).a();
                        View M3 = a3.i().M();
                        if (M3 != null) {
                            a3.h().f(M3, viewGroup);
                        }
                    }
                }

                @Override // B2.a
                public /* bridge */ /* synthetic */ Object b() {
                    c();
                    return q2.n.f8874a;
                }

                public final void c() {
                    if (B.v0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    M v3 = this.f6643f.v();
                    Object s3 = this.f6643f.s();
                    C2.k.b(s3);
                    final g gVar = this.f6643f;
                    final ViewGroup viewGroup = this.f6644g;
                    v3.d(s3, new Runnable() { // from class: e0.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0449f.g.b.a.d(C0449f.g.this, viewGroup);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ViewGroup viewGroup, Object obj, C2.t tVar) {
                super(0);
                this.f6640g = viewGroup;
                this.f6641h = obj;
                this.f6642i = tVar;
            }

            public final void a() {
                g gVar = g.this;
                gVar.C(gVar.v().j(this.f6640g, this.f6641h));
                boolean z3 = g.this.s() != null;
                Object obj = this.f6641h;
                ViewGroup viewGroup = this.f6640g;
                if (!z3) {
                    throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
                }
                this.f6642i.f321e = new a(g.this, viewGroup);
                if (B.v0(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + g.this.t() + " to " + g.this.u());
                }
            }

            @Override // B2.a
            public /* bridge */ /* synthetic */ Object b() {
                a();
                return q2.n.f8874a;
            }
        }

        public g(List list, S.d dVar, S.d dVar2, M m3, Object obj, ArrayList arrayList, ArrayList arrayList2, C0639a c0639a, ArrayList arrayList3, ArrayList arrayList4, C0639a c0639a2, C0639a c0639a3, boolean z3) {
            C2.k.e(list, "transitionInfos");
            C2.k.e(m3, "transitionImpl");
            C2.k.e(arrayList, "sharedElementFirstOutViews");
            C2.k.e(arrayList2, "sharedElementLastInViews");
            C2.k.e(c0639a, "sharedElementNameMapping");
            C2.k.e(arrayList3, "enteringNames");
            C2.k.e(arrayList4, "exitingNames");
            C2.k.e(c0639a2, "firstOutViews");
            C2.k.e(c0639a3, "lastInViews");
            this.f6621d = list;
            this.f6622e = dVar;
            this.f6623f = dVar2;
            this.f6624g = m3;
            this.f6625h = obj;
            this.f6626i = arrayList;
            this.f6627j = arrayList2;
            this.f6628k = c0639a;
            this.f6629l = arrayList3;
            this.f6630m = arrayList4;
            this.f6631n = c0639a2;
            this.f6632o = c0639a3;
            this.f6633p = z3;
            this.f6634q = new G.b();
        }

        public static final void A(S.d dVar, g gVar) {
            C2.k.e(dVar, "$operation");
            C2.k.e(gVar, "this$0");
            if (B.v0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.f(gVar);
        }

        public static final void p(S.d dVar, S.d dVar2, g gVar) {
            C2.k.e(gVar, "this$0");
            K.a(dVar.i(), dVar2.i(), gVar.f6633p, gVar.f6632o, false);
        }

        public static final void q(M m3, View view, Rect rect) {
            C2.k.e(m3, "$impl");
            C2.k.e(rect, "$lastInEpicenterRect");
            m3.k(view, rect);
        }

        public static final void r(ArrayList arrayList) {
            C2.k.e(arrayList, "$transitioningViews");
            K.d(arrayList, 4);
        }

        public static final void y(S.d dVar, g gVar) {
            C2.k.e(dVar, "$operation");
            C2.k.e(gVar, "this$0");
            if (B.v0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.f(gVar);
        }

        public static final void z(C2.t tVar) {
            C2.k.e(tVar, "$seekCancelLambda");
            B2.a aVar = (B2.a) tVar.f321e;
            if (aVar != null) {
                aVar.b();
            }
        }

        public final void B(ArrayList arrayList, ViewGroup viewGroup, B2.a aVar) {
            K.d(arrayList, 4);
            ArrayList q3 = this.f6624g.q(this.f6627j);
            if (B.v0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator it = this.f6626i.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    C2.k.d(next, "sharedElementFirstOutViews");
                    View view = (View) next;
                    Log.v("FragmentManager", "View: " + view + " Name: " + K.O.E(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                Iterator it2 = this.f6627j.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    C2.k.d(next2, "sharedElementLastInViews");
                    View view2 = (View) next2;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + K.O.E(view2));
                }
            }
            aVar.b();
            this.f6624g.y(viewGroup, this.f6626i, this.f6627j, q3, this.f6628k);
            K.d(arrayList, 0);
            this.f6624g.A(this.f6625h, this.f6626i, this.f6627j);
        }

        public final void C(Object obj) {
            this.f6635r = obj;
        }

        @Override // e0.S.b
        public boolean b() {
            if (!this.f6624g.m()) {
                return false;
            }
            List<h> list = this.f6621d;
            if (list == null || !list.isEmpty()) {
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.f() == null || !this.f6624g.n(hVar.f())) {
                        return false;
                    }
                }
            }
            Object obj = this.f6625h;
            return obj == null || this.f6624g.n(obj);
        }

        @Override // e0.S.b
        public void c(ViewGroup viewGroup) {
            C2.k.e(viewGroup, "container");
            this.f6634q.a();
        }

        @Override // e0.S.b
        public void d(ViewGroup viewGroup) {
            C2.k.e(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (h hVar : this.f6621d) {
                    S.d a3 = hVar.a();
                    if (B.v0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + a3);
                    }
                    hVar.a().f(this);
                }
                return;
            }
            Object obj = this.f6635r;
            if (obj != null) {
                M m3 = this.f6624g;
                C2.k.b(obj);
                m3.c(obj);
                if (B.v0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.f6622e + " to " + this.f6623f);
                    return;
                }
                return;
            }
            q2.g o3 = o(viewGroup, this.f6623f, this.f6622e);
            ArrayList arrayList = (ArrayList) o3.a();
            Object b3 = o3.b();
            List list = this.f6621d;
            ArrayList<S.d> arrayList2 = new ArrayList(AbstractC0701n.k(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).a());
            }
            for (final S.d dVar : arrayList2) {
                this.f6624g.w(dVar.i(), b3, this.f6634q, new Runnable() { // from class: e0.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0449f.g.y(S.d.this, this);
                    }
                });
            }
            B(arrayList, viewGroup, new a(viewGroup, b3));
            if (B.v0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.f6622e + " to " + this.f6623f);
            }
        }

        @Override // e0.S.b
        public void e(C0354b c0354b, ViewGroup viewGroup) {
            C2.k.e(c0354b, "backEvent");
            C2.k.e(viewGroup, "container");
            Object obj = this.f6635r;
            if (obj != null) {
                this.f6624g.t(obj, c0354b.a());
            }
        }

        @Override // e0.S.b
        public void f(ViewGroup viewGroup) {
            C2.k.e(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                Iterator it = this.f6621d.iterator();
                while (it.hasNext()) {
                    S.d a3 = ((h) it.next()).a();
                    if (B.v0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + a3);
                    }
                }
                return;
            }
            if (x() && this.f6625h != null && !b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f6625h + " between " + this.f6622e + " and " + this.f6623f + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (b() && x()) {
                final C2.t tVar = new C2.t();
                q2.g o3 = o(viewGroup, this.f6623f, this.f6622e);
                ArrayList arrayList = (ArrayList) o3.a();
                Object b3 = o3.b();
                List list = this.f6621d;
                ArrayList<S.d> arrayList2 = new ArrayList(AbstractC0701n.k(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h) it2.next()).a());
                }
                for (final S.d dVar : arrayList2) {
                    this.f6624g.x(dVar.i(), b3, this.f6634q, new Runnable() { // from class: e0.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0449f.g.z(C2.t.this);
                        }
                    }, new Runnable() { // from class: e0.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0449f.g.A(S.d.this, this);
                        }
                    });
                }
                B(arrayList, viewGroup, new b(viewGroup, b3, tVar));
            }
        }

        public final void n(ArrayList arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (K.U.a(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C2.k.d(childAt, "child");
                    n(arrayList, childAt);
                }
            }
        }

        public final q2.g o(ViewGroup viewGroup, S.d dVar, final S.d dVar2) {
            final S.d dVar3 = dVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator it = this.f6621d.iterator();
            boolean z3 = false;
            View view2 = null;
            while (it.hasNext()) {
                if (((h) it.next()).g() && dVar2 != null && dVar3 != null && !this.f6628k.isEmpty() && this.f6625h != null) {
                    K.a(dVar3.i(), dVar2.i(), this.f6633p, this.f6631n, true);
                    K.F.a(viewGroup, new Runnable() { // from class: e0.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0449f.g.p(S.d.this, dVar2, this);
                        }
                    });
                    this.f6626i.addAll(this.f6631n.values());
                    if (!this.f6630m.isEmpty()) {
                        Object obj = this.f6630m.get(0);
                        C2.k.d(obj, "exitingNames[0]");
                        view2 = (View) this.f6631n.get((String) obj);
                        this.f6624g.v(this.f6625h, view2);
                    }
                    this.f6627j.addAll(this.f6632o.values());
                    if (!this.f6629l.isEmpty()) {
                        Object obj2 = this.f6629l.get(0);
                        C2.k.d(obj2, "enteringNames[0]");
                        final View view3 = (View) this.f6632o.get((String) obj2);
                        if (view3 != null) {
                            final M m3 = this.f6624g;
                            K.F.a(viewGroup, new Runnable() { // from class: e0.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0449f.g.q(M.this, view3, rect);
                                }
                            });
                            z3 = true;
                        }
                    }
                    this.f6624g.z(this.f6625h, view, this.f6626i);
                    M m4 = this.f6624g;
                    Object obj3 = this.f6625h;
                    m4.s(obj3, null, null, null, null, obj3, this.f6627j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.f6621d.iterator();
            Object obj4 = null;
            Object obj5 = null;
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                S.d a3 = hVar.a();
                boolean z4 = z3;
                Object h3 = this.f6624g.h(hVar.f());
                if (h3 != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = it2;
                    View view4 = a3.i().f6698L;
                    C2.k.d(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.f6625h != null && (a3 == dVar2 || a3 == dVar3)) {
                        if (a3 == dVar2) {
                            arrayList2.removeAll(r2.u.A(this.f6626i));
                        } else {
                            arrayList2.removeAll(r2.u.A(this.f6627j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f6624g.a(h3, view);
                    } else {
                        this.f6624g.b(h3, arrayList2);
                        this.f6624g.s(h3, h3, arrayList2, null, null, null, null);
                        if (a3.h() == S.d.b.GONE) {
                            a3.r(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(a3.i().f6698L);
                            this.f6624g.r(h3, a3.i().f6698L, arrayList3);
                            K.F.a(viewGroup, new Runnable() { // from class: e0.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0449f.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (a3.h() == S.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z4) {
                            this.f6624g.u(h3, rect);
                        }
                        if (B.v0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + h3);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Object next = it4.next();
                                C2.k.d(next, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) next));
                            }
                        }
                    } else {
                        this.f6624g.v(h3, view2);
                        if (B.v0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + h3);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            Iterator it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                Object next2 = it5.next();
                                C2.k.d(next2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) next2));
                            }
                        }
                    }
                    if (hVar.h()) {
                        obj4 = this.f6624g.p(obj4, h3, null);
                    } else {
                        obj5 = this.f6624g.p(obj5, h3, null);
                    }
                    dVar3 = dVar;
                    z3 = z4;
                    it2 = it3;
                } else {
                    dVar3 = dVar;
                    z3 = z4;
                }
            }
            Object o3 = this.f6624g.o(obj4, obj5, this.f6625h);
            if (B.v0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + o3);
            }
            return new q2.g(arrayList, o3);
        }

        public final Object s() {
            return this.f6635r;
        }

        public final S.d t() {
            return this.f6622e;
        }

        public final S.d u() {
            return this.f6623f;
        }

        public final M v() {
            return this.f6624g;
        }

        public final List w() {
            return this.f6621d;
        }

        public final boolean x() {
            List list = this.f6621d;
            if (list != null && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).a().i().f6729q) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: e0.f$h */
    public static final class h extends C0117f {

        /* renamed from: b, reason: collision with root package name */
        public final Object f6645b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f6646c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f6647d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(S.d dVar, boolean z3, boolean z4) {
            super(dVar);
            Object G3;
            C2.k.e(dVar, "operation");
            S.d.b h3 = dVar.h();
            S.d.b bVar = S.d.b.VISIBLE;
            if (h3 == bVar) {
                AbstractComponentCallbacksC0459p i3 = dVar.i();
                G3 = z3 ? i3.E() : i3.p();
            } else {
                AbstractComponentCallbacksC0459p i4 = dVar.i();
                G3 = z3 ? i4.G() : i4.s();
            }
            this.f6645b = G3;
            this.f6646c = dVar.h() == bVar ? z3 ? dVar.i().i() : dVar.i().g() : true;
            this.f6647d = z4 ? z3 ? dVar.i().I() : dVar.i().H() : null;
        }

        public final M c() {
            M d3 = d(this.f6645b);
            M d4 = d(this.f6647d);
            if (d3 == null || d4 == null || d3 == d4) {
                return d3 == null ? d4 : d3;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().i() + " returned Transition " + this.f6645b + " which uses a different Transition  type than its shared element transition " + this.f6647d).toString());
        }

        public final M d(Object obj) {
            if (obj == null) {
                return null;
            }
            M m3 = K.f6509b;
            if (m3 != null && m3.g(obj)) {
                return m3;
            }
            M m4 = K.f6510c;
            if (m4 != null && m4.g(obj)) {
                return m4;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().i() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final Object e() {
            return this.f6647d;
        }

        public final Object f() {
            return this.f6645b;
        }

        public final boolean g() {
            return this.f6647d != null;
        }

        public final boolean h() {
            return this.f6646c;
        }
    }

    /* renamed from: e0.f$i */
    public static final class i extends C2.l implements B2.l {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Collection f6648f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Collection collection) {
            super(1);
            this.f6648f = collection;
        }

        @Override // B2.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean j(Map.Entry entry) {
            C2.k.e(entry, "entry");
            return Boolean.valueOf(r2.u.o(this.f6648f, K.O.E((View) entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0449f(ViewGroup viewGroup) {
        super(viewGroup);
        C2.k.e(viewGroup, "container");
    }

    public static final void D(C0449f c0449f, S.d dVar) {
        C2.k.e(c0449f, "this$0");
        C2.k.e(dVar, "$operation");
        c0449f.c(dVar);
    }

    public final void C(List list) {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r2.r.l(arrayList2, ((b) it.next()).a().g());
        }
        boolean isEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z3 = false;
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            Context context = t().getContext();
            S.d a3 = bVar.a();
            C2.k.d(context, "context");
            r.a c3 = bVar.c(context);
            if (c3 != null) {
                if (c3.f6763b == null) {
                    arrayList.add(bVar);
                } else {
                    AbstractComponentCallbacksC0459p i3 = a3.i();
                    if (a3.g().isEmpty()) {
                        if (a3.h() == S.d.b.GONE) {
                            a3.r(false);
                        }
                        a3.b(new c(bVar));
                        z3 = true;
                    } else if (B.v0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + i3 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            S.d a4 = bVar2.a();
            AbstractComponentCallbacksC0459p i4 = a4.i();
            if (isEmpty) {
                if (!z3) {
                    a4.b(new a(bVar2));
                } else if (B.v0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + i4 + " as Animations cannot run alongside Animators.");
                }
            } else if (B.v0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + i4 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void E(List list, boolean z3, S.d dVar, S.d dVar2) {
        Object obj;
        Iterator it;
        ArrayList arrayList;
        q2.g a3;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!((h) obj2).b()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList<h> arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((h) obj3).c() != null) {
                arrayList3.add(obj3);
            }
        }
        M m3 = null;
        for (h hVar : arrayList3) {
            M c3 = hVar.c();
            if (m3 != null && c3 != m3) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.a().i() + " returned Transition " + hVar.f() + " which uses a different Transition type than other Fragments.").toString());
            }
            m3 = c3;
        }
        if (m3 == null) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        C0639a c0639a = new C0639a();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        C0639a c0639a2 = new C0639a();
        C0639a c0639a3 = new C0639a();
        ArrayList arrayList8 = arrayList6;
        Iterator it2 = arrayList3.iterator();
        ArrayList arrayList9 = arrayList7;
        loop3: while (true) {
            obj = null;
            while (it2.hasNext()) {
                h hVar2 = (h) it2.next();
                if (hVar2.g() && dVar != null && dVar2 != null) {
                    obj = m3.B(m3.h(hVar2.e()));
                    arrayList9 = dVar2.i().J();
                    C2.k.d(arrayList9, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList J3 = dVar.i().J();
                    C2.k.d(J3, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList K3 = dVar.i().K();
                    C2.k.d(K3, "firstOut.fragment.sharedElementTargetNames");
                    int size = K3.size();
                    it = it2;
                    int i3 = 0;
                    while (i3 < size) {
                        ArrayList arrayList10 = arrayList3;
                        int indexOf = arrayList9.indexOf(K3.get(i3));
                        int i4 = size;
                        if (indexOf != -1) {
                            arrayList9.set(indexOf, J3.get(i3));
                        }
                        i3++;
                        arrayList3 = arrayList10;
                        size = i4;
                    }
                    arrayList = arrayList3;
                    arrayList8 = dVar2.i().K();
                    C2.k.d(arrayList8, "lastIn.fragment.sharedElementTargetNames");
                    if (z3) {
                        dVar.i().q();
                        dVar2.i().t();
                        a3 = q2.k.a(null, null);
                    } else {
                        dVar.i().t();
                        dVar2.i().q();
                        a3 = q2.k.a(null, null);
                    }
                    AbstractC0515e.a(a3.a());
                    AbstractC0515e.a(a3.b());
                    int i5 = 0;
                    for (int size2 = arrayList9.size(); i5 < size2; size2 = size2) {
                        Object obj4 = arrayList9.get(i5);
                        C2.k.d(obj4, "exitingNames[i]");
                        Object obj5 = arrayList8.get(i5);
                        C2.k.d(obj5, "enteringNames[i]");
                        c0639a.put((String) obj4, (String) obj5);
                        i5++;
                    }
                    if (B.v0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        for (Iterator it3 = arrayList8.iterator(); it3.hasNext(); it3 = it3) {
                            Log.v("FragmentManager", "Name: " + ((String) it3.next()));
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for (Iterator it4 = arrayList9.iterator(); it4.hasNext(); it4 = it4) {
                            Log.v("FragmentManager", "Name: " + ((String) it4.next()));
                        }
                    }
                    View view = dVar.i().f6698L;
                    C2.k.d(view, "firstOut.fragment.mView");
                    F(c0639a2, view);
                    c0639a2.o(arrayList9);
                    c0639a.o(c0639a2.keySet());
                    View view2 = dVar2.i().f6698L;
                    C2.k.d(view2, "lastIn.fragment.mView");
                    F(c0639a3, view2);
                    c0639a3.o(arrayList8);
                    c0639a3.o(c0639a.values());
                    K.c(c0639a, c0639a3);
                    Collection keySet = c0639a.keySet();
                    C2.k.d(keySet, "sharedElementNameMapping.keys");
                    G(c0639a2, keySet);
                    Collection values = c0639a.values();
                    C2.k.d(values, "sharedElementNameMapping.values");
                    G(c0639a3, values);
                    if (c0639a.isEmpty()) {
                        break;
                    }
                } else {
                    it = it2;
                    arrayList = arrayList3;
                }
                it2 = it;
                arrayList3 = arrayList;
            }
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + dVar + " and " + dVar2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
            arrayList4.clear();
            arrayList5.clear();
            it2 = it;
            arrayList3 = arrayList;
        }
        ArrayList arrayList11 = arrayList3;
        if (obj == null) {
            if (arrayList11.isEmpty()) {
                return;
            }
            Iterator it5 = arrayList11.iterator();
            while (it5.hasNext()) {
                if (((h) it5.next()).f() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList11, dVar, dVar2, m3, obj, arrayList4, arrayList5, c0639a, arrayList8, arrayList9, c0639a2, c0639a3, z3);
        Iterator it6 = arrayList11.iterator();
        while (it6.hasNext()) {
            ((h) it6.next()).a().b(gVar);
        }
    }

    public final void F(Map map, View view) {
        String E3 = K.O.E(view);
        if (E3 != null) {
            map.put(E3, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = viewGroup.getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C2.k.d(childAt, "child");
                    F(map, childAt);
                }
            }
        }
    }

    public final void G(C0639a c0639a, Collection collection) {
        Set entrySet = c0639a.entrySet();
        C2.k.d(entrySet, "entries");
        r2.r.n(entrySet, new i(collection));
    }

    public final void H(List list) {
        AbstractComponentCallbacksC0459p i3 = ((S.d) r2.u.u(list)).i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S.d dVar = (S.d) it.next();
            dVar.i().f6701O.f6744b = i3.f6701O.f6744b;
            dVar.i().f6701O.f6745c = i3.f6701O.f6745c;
            dVar.i().f6701O.f6746d = i3.f6701O.f6746d;
            dVar.i().f6701O.f6747e = i3.f6701O.f6747e;
        }
    }

    @Override // e0.S
    public void d(List list, boolean z3) {
        Object obj;
        Object obj2;
        C2.k.e(list, "operations");
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            S.d dVar = (S.d) obj2;
            S.d.b.a aVar = S.d.b.f6569e;
            View view = dVar.i().f6698L;
            C2.k.d(view, "operation.fragment.mView");
            S.d.b a3 = aVar.a(view);
            S.d.b bVar = S.d.b.VISIBLE;
            if (a3 == bVar && dVar.h() != bVar) {
                break;
            }
        }
        S.d dVar2 = (S.d) obj2;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            S.d dVar3 = (S.d) previous;
            S.d.b.a aVar2 = S.d.b.f6569e;
            View view2 = dVar3.i().f6698L;
            C2.k.d(view2, "operation.fragment.mView");
            S.d.b a4 = aVar2.a(view2);
            S.d.b bVar2 = S.d.b.VISIBLE;
            if (a4 != bVar2 && dVar3.h() == bVar2) {
                obj = previous;
                break;
            }
        }
        S.d dVar4 = (S.d) obj;
        if (B.v0(2)) {
            Log.v("FragmentManager", "Executing operations from " + dVar2 + " to " + dVar4);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        H(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final S.d dVar5 = (S.d) it2.next();
            arrayList.add(new b(dVar5, z3));
            boolean z4 = false;
            if (z3) {
                if (dVar5 != dVar2) {
                    arrayList2.add(new h(dVar5, z3, z4));
                    dVar5.a(new Runnable() { // from class: e0.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0449f.D(C0449f.this, dVar5);
                        }
                    });
                }
                z4 = true;
                arrayList2.add(new h(dVar5, z3, z4));
                dVar5.a(new Runnable() { // from class: e0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0449f.D(C0449f.this, dVar5);
                    }
                });
            } else {
                if (dVar5 != dVar4) {
                    arrayList2.add(new h(dVar5, z3, z4));
                    dVar5.a(new Runnable() { // from class: e0.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0449f.D(C0449f.this, dVar5);
                        }
                    });
                }
                z4 = true;
                arrayList2.add(new h(dVar5, z3, z4));
                dVar5.a(new Runnable() { // from class: e0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0449f.D(C0449f.this, dVar5);
                    }
                });
            }
        }
        E(arrayList2, z3, dVar2, dVar4);
        C(arrayList);
    }
}

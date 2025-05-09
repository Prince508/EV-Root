package e0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b.C0354b;
import d0.AbstractC0438b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: f, reason: collision with root package name */
    public static final a f6544f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f6545a;

    /* renamed from: b, reason: collision with root package name */
    public final List f6546b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6547c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6548d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6549e;

    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public final S a(ViewGroup viewGroup, B b3) {
            C2.k.e(viewGroup, "container");
            C2.k.e(b3, "fragmentManager");
            T n02 = b3.n0();
            C2.k.d(n02, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, n02);
        }

        public final S b(ViewGroup viewGroup, T t3) {
            C2.k.e(viewGroup, "container");
            C2.k.e(t3, "factory");
            int i3 = AbstractC0438b.f6366b;
            Object tag = viewGroup.getTag(i3);
            if (tag instanceof S) {
                return (S) tag;
            }
            S a3 = t3.a(viewGroup);
            C2.k.d(a3, "factory.createController(container)");
            viewGroup.setTag(i3, a3);
            return a3;
        }

        public a() {
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6550a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6551b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6552c;

        public final void a(ViewGroup viewGroup) {
            C2.k.e(viewGroup, "container");
            if (!this.f6552c) {
                c(viewGroup);
            }
            this.f6552c = true;
        }

        public boolean b() {
            return this.f6550a;
        }

        public abstract void c(ViewGroup viewGroup);

        public abstract void d(ViewGroup viewGroup);

        public void e(C0354b c0354b, ViewGroup viewGroup) {
            C2.k.e(c0354b, "backEvent");
            C2.k.e(viewGroup, "container");
        }

        public void f(ViewGroup viewGroup) {
            C2.k.e(viewGroup, "container");
        }

        public final void g(ViewGroup viewGroup) {
            C2.k.e(viewGroup, "container");
            if (!this.f6551b) {
                f(viewGroup);
            }
            this.f6551b = true;
        }
    }

    public static final class c extends d {

        /* renamed from: l, reason: collision with root package name */
        public final H f6553l;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public c(e0.S.d.b r3, e0.S.d.a r4, e0.H r5) {
            /*
                r2 = this;
                java.lang.String r0 = "finalState"
                C2.k.e(r3, r0)
                java.lang.String r0 = "lifecycleImpact"
                C2.k.e(r4, r0)
                java.lang.String r0 = "fragmentStateManager"
                C2.k.e(r5, r0)
                e0.p r0 = r5.k()
                java.lang.String r1 = "fragmentStateManager.fragment"
                C2.k.d(r0, r1)
                r2.<init>(r3, r4, r0)
                r2.f6553l = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e0.S.c.<init>(e0.S$d$b, e0.S$d$a, e0.H):void");
        }

        @Override // e0.S.d
        public void e() {
            super.e();
            i().f6729q = false;
            this.f6553l.m();
        }

        @Override // e0.S.d
        public void q() {
            if (o()) {
                return;
            }
            super.q();
            if (j() != d.a.ADDING) {
                if (j() == d.a.REMOVING) {
                    AbstractComponentCallbacksC0459p k3 = this.f6553l.k();
                    C2.k.d(k3, "fragmentStateManager.fragment");
                    View O02 = k3.O0();
                    C2.k.d(O02, "fragment.requireView()");
                    if (B.v0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + O02.findFocus() + " on view " + O02 + " for Fragment " + k3);
                    }
                    O02.clearFocus();
                    return;
                }
                return;
            }
            AbstractComponentCallbacksC0459p k4 = this.f6553l.k();
            C2.k.d(k4, "fragmentStateManager.fragment");
            View findFocus = k4.f6698L.findFocus();
            if (findFocus != null) {
                k4.U0(findFocus);
                if (B.v0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k4);
                }
            }
            View O03 = i().O0();
            C2.k.d(O03, "this.fragment.requireView()");
            if (O03.getParent() == null) {
                this.f6553l.b();
                O03.setAlpha(0.0f);
            }
            if (O03.getAlpha() == 0.0f && O03.getVisibility() == 0) {
                O03.setVisibility(4);
            }
            O03.setAlpha(k4.D());
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public b f6554a;

        /* renamed from: b, reason: collision with root package name */
        public a f6555b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractComponentCallbacksC0459p f6556c;

        /* renamed from: d, reason: collision with root package name */
        public final List f6557d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f6558e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f6559f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f6560g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f6561h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f6562i;

        /* renamed from: j, reason: collision with root package name */
        public final List f6563j;

        /* renamed from: k, reason: collision with root package name */
        public final List f6564k;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* renamed from: e, reason: collision with root package name */
            public static final a f6569e = new a(null);

            public static final class a {
                public /* synthetic */ a(C2.g gVar) {
                    this();
                }

                public final b a(View view) {
                    C2.k.e(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i3) {
                    if (i3 == 0) {
                        return b.VISIBLE;
                    }
                    if (i3 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i3 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i3);
                }

                public a() {
                }
            }

            /* renamed from: e0.S$d$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0115b {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f6575a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f6575a = iArr;
                }
            }

            public static final b g(int i3) {
                return f6569e.b(i3);
            }

            public final void f(View view, ViewGroup viewGroup) {
                C2.k.e(view, "view");
                C2.k.e(viewGroup, "container");
                int i3 = C0115b.f6575a[ordinal()];
                if (i3 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        if (B.v0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                        }
                        viewGroup2.removeView(view);
                        return;
                    }
                    return;
                }
                if (i3 == 2) {
                    if (B.v0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (B.v0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                        }
                        viewGroup.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i3 == 3) {
                    if (B.v0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i3 != 4) {
                    return;
                }
                if (B.v0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public /* synthetic */ class c {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f6576a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f6576a = iArr;
            }
        }

        public d(b bVar, a aVar, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
            C2.k.e(bVar, "finalState");
            C2.k.e(aVar, "lifecycleImpact");
            C2.k.e(abstractComponentCallbacksC0459p, "fragment");
            this.f6554a = bVar;
            this.f6555b = aVar;
            this.f6556c = abstractComponentCallbacksC0459p;
            this.f6557d = new ArrayList();
            this.f6562i = true;
            ArrayList arrayList = new ArrayList();
            this.f6563j = arrayList;
            this.f6564k = arrayList;
        }

        public final void a(Runnable runnable) {
            C2.k.e(runnable, "listener");
            this.f6557d.add(runnable);
        }

        public final void b(b bVar) {
            C2.k.e(bVar, "effect");
            this.f6563j.add(bVar);
        }

        public final void c(ViewGroup viewGroup) {
            C2.k.e(viewGroup, "container");
            this.f6561h = false;
            if (this.f6558e) {
                return;
            }
            this.f6558e = true;
            if (this.f6563j.isEmpty()) {
                e();
                return;
            }
            Iterator it = r2.u.x(this.f6564k).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(viewGroup);
            }
        }

        public final void d(ViewGroup viewGroup, boolean z3) {
            C2.k.e(viewGroup, "container");
            if (this.f6558e) {
                return;
            }
            if (z3) {
                this.f6560g = true;
            }
            c(viewGroup);
        }

        public void e() {
            this.f6561h = false;
            if (this.f6559f) {
                return;
            }
            if (B.v0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f6559f = true;
            Iterator it = this.f6557d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void f(b bVar) {
            C2.k.e(bVar, "effect");
            if (this.f6563j.remove(bVar) && this.f6563j.isEmpty()) {
                e();
            }
        }

        public final List g() {
            return this.f6564k;
        }

        public final b h() {
            return this.f6554a;
        }

        public final AbstractComponentCallbacksC0459p i() {
            return this.f6556c;
        }

        public final a j() {
            return this.f6555b;
        }

        public final boolean k() {
            return this.f6562i;
        }

        public final boolean l() {
            return this.f6558e;
        }

        public final boolean m() {
            return this.f6559f;
        }

        public final boolean n() {
            return this.f6560g;
        }

        public final boolean o() {
            return this.f6561h;
        }

        public final void p(b bVar, a aVar) {
            C2.k.e(bVar, "finalState");
            C2.k.e(aVar, "lifecycleImpact");
            int i3 = c.f6576a[aVar.ordinal()];
            if (i3 == 1) {
                if (this.f6554a == b.REMOVED) {
                    if (B.v0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f6556c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f6555b + " to ADDING.");
                    }
                    this.f6554a = b.VISIBLE;
                    this.f6555b = a.ADDING;
                    this.f6562i = true;
                    return;
                }
                return;
            }
            if (i3 == 2) {
                if (B.v0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f6556c + " mFinalState = " + this.f6554a + " -> REMOVED. mLifecycleImpact  = " + this.f6555b + " to REMOVING.");
                }
                this.f6554a = b.REMOVED;
                this.f6555b = a.REMOVING;
                this.f6562i = true;
                return;
            }
            if (i3 == 3 && this.f6554a != b.REMOVED) {
                if (B.v0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f6556c + " mFinalState = " + this.f6554a + " -> " + bVar + '.');
                }
                this.f6554a = bVar;
            }
        }

        public void q() {
            this.f6561h = true;
        }

        public final void r(boolean z3) {
            this.f6562i = z3;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f6554a + " lifecycleImpact = " + this.f6555b + " fragment = " + this.f6556c + '}';
        }
    }

    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6577a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6577a = iArr;
        }
    }

    public S(ViewGroup viewGroup) {
        C2.k.e(viewGroup, "container");
        this.f6545a = viewGroup;
        this.f6546b = new ArrayList();
        this.f6547c = new ArrayList();
    }

    public static final void h(S s3, c cVar) {
        C2.k.e(s3, "this$0");
        C2.k.e(cVar, "$operation");
        if (s3.f6546b.contains(cVar)) {
            d.b h3 = cVar.h();
            View view = cVar.i().f6698L;
            C2.k.d(view, "operation.fragment.mView");
            h3.f(view, s3.f6545a);
        }
    }

    public static final void i(S s3, c cVar) {
        C2.k.e(s3, "this$0");
        C2.k.e(cVar, "$operation");
        s3.f6546b.remove(cVar);
        s3.f6547c.remove(cVar);
    }

    public static final S u(ViewGroup viewGroup, B b3) {
        return f6544f.a(viewGroup, b3);
    }

    public static final S v(ViewGroup viewGroup, T t3) {
        return f6544f.b(viewGroup, t3);
    }

    public final void A(boolean z3) {
        this.f6548d = z3;
    }

    public final void c(d dVar) {
        C2.k.e(dVar, "operation");
        if (dVar.k()) {
            d.b h3 = dVar.h();
            View O02 = dVar.i().O0();
            C2.k.d(O02, "operation.fragment.requireView()");
            h3.f(O02, this.f6545a);
            dVar.r(false);
        }
    }

    public abstract void d(List list, boolean z3);

    public void e(List list) {
        C2.k.e(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r2.r.l(arrayList, ((d) it.next()).g());
        }
        List x3 = r2.u.x(r2.u.A(arrayList));
        int size = x3.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((b) x3.get(i3)).d(this.f6545a);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            c((d) list.get(i4));
        }
        List x4 = r2.u.x(list);
        int size3 = x4.size();
        for (int i5 = 0; i5 < size3; i5++) {
            d dVar = (d) x4.get(i5);
            if (dVar.g().isEmpty()) {
                dVar.e();
            }
        }
    }

    public final void f() {
        if (B.v0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        y(this.f6547c);
        e(this.f6547c);
    }

    public final void g(d.b bVar, d.a aVar, H h3) {
        synchronized (this.f6546b) {
            try {
                AbstractComponentCallbacksC0459p k3 = h3.k();
                C2.k.d(k3, "fragmentStateManager.fragment");
                d o3 = o(k3);
                if (o3 == null) {
                    if (h3.k().f6729q) {
                        AbstractComponentCallbacksC0459p k4 = h3.k();
                        C2.k.d(k4, "fragmentStateManager.fragment");
                        o3 = p(k4);
                    } else {
                        o3 = null;
                    }
                }
                if (o3 != null) {
                    o3.p(bVar, aVar);
                    return;
                }
                final c cVar = new c(bVar, aVar, h3);
                this.f6546b.add(cVar);
                cVar.a(new Runnable() { // from class: e0.P
                    @Override // java.lang.Runnable
                    public final void run() {
                        S.h(S.this, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: e0.Q
                    @Override // java.lang.Runnable
                    public final void run() {
                        S.i(S.this, cVar);
                    }
                });
                q2.n nVar = q2.n.f8874a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(d.b bVar, H h3) {
        C2.k.e(bVar, "finalState");
        C2.k.e(h3, "fragmentStateManager");
        if (B.v0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + h3.k());
        }
        g(bVar, d.a.ADDING, h3);
    }

    public final void k(H h3) {
        C2.k.e(h3, "fragmentStateManager");
        if (B.v0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + h3.k());
        }
        g(d.b.GONE, d.a.NONE, h3);
    }

    public final void l(H h3) {
        C2.k.e(h3, "fragmentStateManager");
        if (B.v0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + h3.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, h3);
    }

    public final void m(H h3) {
        C2.k.e(h3, "fragmentStateManager");
        if (B.v0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + h3.k());
        }
        g(d.b.VISIBLE, d.a.NONE, h3);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0170 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x0018, B:14:0x0021, B:15:0x0030, B:17:0x0036, B:19:0x0042, B:20:0x0061, B:23:0x006c, B:28:0x019d, B:32:0x0072, B:33:0x0081, B:35:0x0087, B:37:0x0093, B:38:0x00a9, B:41:0x00ba, B:46:0x00c0, B:50:0x00d1, B:52:0x00e1, B:53:0x00e8, B:54:0x00f9, B:56:0x00ff, B:58:0x010f, B:60:0x0115, B:64:0x0136, B:71:0x011c, B:72:0x0120, B:74:0x0126, B:82:0x0142, B:84:0x0146, B:85:0x014f, B:87:0x0155, B:89:0x0163, B:92:0x016c, B:94:0x0170, B:95:0x018e, B:97:0x0196, B:99:0x0179, B:101:0x0183), top: B:11:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0196 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x0018, B:14:0x0021, B:15:0x0030, B:17:0x0036, B:19:0x0042, B:20:0x0061, B:23:0x006c, B:28:0x019d, B:32:0x0072, B:33:0x0081, B:35:0x0087, B:37:0x0093, B:38:0x00a9, B:41:0x00ba, B:46:0x00c0, B:50:0x00d1, B:52:0x00e1, B:53:0x00e8, B:54:0x00f9, B:56:0x00ff, B:58:0x010f, B:60:0x0115, B:64:0x0136, B:71:0x011c, B:72:0x0120, B:74:0x0126, B:82:0x0142, B:84:0x0146, B:85:0x014f, B:87:0x0155, B:89:0x0163, B:92:0x016c, B:94:0x0170, B:95:0x018e, B:97:0x0196, B:99:0x0179, B:101:0x0183), top: B:11:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.S.n():void");
    }

    public final d o(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        Object obj;
        Iterator it = this.f6546b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (C2.k.a(dVar.i(), abstractComponentCallbacksC0459p) && !dVar.l()) {
                break;
            }
        }
        return (d) obj;
    }

    public final d p(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        Object obj;
        Iterator it = this.f6547c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            d dVar = (d) obj;
            if (C2.k.a(dVar.i(), abstractComponentCallbacksC0459p) && !dVar.l()) {
                break;
            }
        }
        return (d) obj;
    }

    public final void q() {
        if (B.v0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f6545a.isAttachedToWindow();
        synchronized (this.f6546b) {
            try {
                z();
                y(this.f6546b);
                for (d dVar : r2.u.z(this.f6547c)) {
                    if (B.v0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + this.f6545a + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.f6545a);
                }
                for (d dVar2 : r2.u.z(this.f6546b)) {
                    if (B.v0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (isAttachedToWindow ? "" : "Container " + this.f6545a + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.f6545a);
                }
                q2.n nVar = q2.n.f8874a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        if (this.f6549e) {
            if (B.v0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f6549e = false;
            n();
        }
    }

    public final d.a s(H h3) {
        C2.k.e(h3, "fragmentStateManager");
        AbstractComponentCallbacksC0459p k3 = h3.k();
        C2.k.d(k3, "fragmentStateManager.fragment");
        d o3 = o(k3);
        d.a j3 = o3 != null ? o3.j() : null;
        d p3 = p(k3);
        d.a j4 = p3 != null ? p3.j() : null;
        int i3 = j3 == null ? -1 : e.f6577a[j3.ordinal()];
        return (i3 == -1 || i3 == 1) ? j4 : j3;
    }

    public final ViewGroup t() {
        return this.f6545a;
    }

    public final void w() {
        Object obj;
        synchronized (this.f6546b) {
            try {
                z();
                List list = this.f6546b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    d dVar = (d) obj;
                    d.b.a aVar = d.b.f6569e;
                    View view = dVar.i().f6698L;
                    C2.k.d(view, "operation.fragment.mView");
                    d.b a3 = aVar.a(view);
                    d.b h3 = dVar.h();
                    d.b bVar = d.b.VISIBLE;
                    if (h3 == bVar && a3 != bVar) {
                        break;
                    }
                }
                d dVar2 = (d) obj;
                AbstractComponentCallbacksC0459p i3 = dVar2 != null ? dVar2.i() : null;
                this.f6549e = i3 != null ? i3.U() : false;
                q2.n nVar = q2.n.f8874a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void x(C0354b c0354b) {
        C2.k.e(c0354b, "backEvent");
        if (B.v0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + c0354b.a());
        }
        List list = this.f6547c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r2.r.l(arrayList, ((d) it.next()).g());
        }
        List x3 = r2.u.x(r2.u.A(arrayList));
        int size = x3.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((b) x3.get(i3)).e(c0354b, this.f6545a);
        }
    }

    public final void y(List list) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((d) list.get(i3)).q();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r2.r.l(arrayList, ((d) it.next()).g());
        }
        List x3 = r2.u.x(r2.u.A(arrayList));
        int size2 = x3.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ((b) x3.get(i4)).g(this.f6545a);
        }
    }

    public final void z() {
        for (d dVar : this.f6546b) {
            if (dVar.j() == d.a.ADDING) {
                View O02 = dVar.i().O0();
                C2.k.d(O02, "fragment.requireView()");
                dVar.p(d.b.f6569e.b(O02.getVisibility()), d.a.NONE);
            }
        }
    }
}

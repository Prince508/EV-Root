package e0;

import K.InterfaceC0217w;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.AbstractC0347h;
import b.AbstractC0360h;
import b.C0354b;
import b.C0361i;
import d0.AbstractC0438b;
import e0.J;
import f0.C0470c;
import j.AbstractC0515e;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import z.AbstractC0780b;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: Q, reason: collision with root package name */
    public static boolean f6380Q = false;

    /* renamed from: R, reason: collision with root package name */
    public static boolean f6381R = true;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6387F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f6388G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6389H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f6390I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f6391J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f6392K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f6393L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f6394M;

    /* renamed from: N, reason: collision with root package name */
    public E f6395N;

    /* renamed from: O, reason: collision with root package name */
    public C0470c.C0119c f6396O;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6399b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f6402e;

    /* renamed from: g, reason: collision with root package name */
    public C0361i f6404g;

    /* renamed from: x, reason: collision with root package name */
    public AbstractC0461s f6421x;

    /* renamed from: y, reason: collision with root package name */
    public AbstractComponentCallbacksC0459p f6422y;

    /* renamed from: z, reason: collision with root package name */
    public AbstractComponentCallbacksC0459p f6423z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6398a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final I f6400c = new I();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f6401d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final v f6403f = new v(this);

    /* renamed from: h, reason: collision with root package name */
    public C0444a f6405h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6406i = false;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0360h f6407j = new a(false);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f6408k = new AtomicInteger();

    /* renamed from: l, reason: collision with root package name */
    public final Map f6409l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    public final Map f6410m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    public final Map f6411n = Collections.synchronizedMap(new HashMap());

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f6412o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final w f6413p = new w(this);

    /* renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f6414q = new CopyOnWriteArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final J.a f6415r = new J.a() { // from class: e0.x
        @Override // J.a, androidx.window.extensions.core.util.function.Consumer
        public final void accept(Object obj) {
            B.d(B.this, (Configuration) obj);
        }
    };

    /* renamed from: s, reason: collision with root package name */
    public final J.a f6416s = new J.a() { // from class: e0.y
        @Override // J.a, androidx.window.extensions.core.util.function.Consumer
        public final void accept(Object obj) {
            B.a(B.this, (Integer) obj);
        }
    };

    /* renamed from: t, reason: collision with root package name */
    public final J.a f6417t = new J.a() { // from class: e0.z
        @Override // J.a, androidx.window.extensions.core.util.function.Consumer
        public final void accept(Object obj) {
            B b3 = B.this;
            AbstractC0515e.a(obj);
            B.c(b3, null);
        }
    };

    /* renamed from: u, reason: collision with root package name */
    public final J.a f6418u = new J.a() { // from class: e0.A
        @Override // J.a, androidx.window.extensions.core.util.function.Consumer
        public final void accept(Object obj) {
            B b3 = B.this;
            AbstractC0515e.a(obj);
            B.b(b3, null);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC0217w f6419v = new b();

    /* renamed from: w, reason: collision with root package name */
    public int f6420w = -1;

    /* renamed from: A, reason: collision with root package name */
    public AbstractC0462t f6382A = null;

    /* renamed from: B, reason: collision with root package name */
    public AbstractC0462t f6383B = new c();

    /* renamed from: C, reason: collision with root package name */
    public T f6384C = null;

    /* renamed from: D, reason: collision with root package name */
    public T f6385D = new d();

    /* renamed from: E, reason: collision with root package name */
    public ArrayDeque f6386E = new ArrayDeque();

    /* renamed from: P, reason: collision with root package name */
    public Runnable f6397P = new e();

    public class a extends AbstractC0360h {
        public a(boolean z3) {
            super(z3);
        }

        @Override // b.AbstractC0360h
        public void a() {
            if (B.v0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + B.f6381R + " fragment manager " + B.this);
            }
            if (B.f6381R) {
                B.this.m();
                B.this.f6405h = null;
            }
        }

        @Override // b.AbstractC0360h
        public void b() {
            if (B.v0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + B.f6381R + " fragment manager " + B.this);
            }
            B.this.r0();
        }

        @Override // b.AbstractC0360h
        public void c(C0354b c0354b) {
            if (B.v0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + B.f6381R + " fragment manager " + B.this);
            }
            B b3 = B.this;
            if (b3.f6405h != null) {
                Iterator it = b3.r(new ArrayList(Collections.singletonList(B.this.f6405h)), 0, 1).iterator();
                while (it.hasNext()) {
                    ((S) it.next()).x(c0354b);
                }
                Iterator it2 = B.this.f6412o.iterator();
                if (it2.hasNext()) {
                    AbstractC0515e.a(it2.next());
                    throw null;
                }
            }
        }

        @Override // b.AbstractC0360h
        public void d(C0354b c0354b) {
            if (B.v0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + B.f6381R + " fragment manager " + B.this);
            }
            if (B.f6381R) {
                B.this.N();
                B.this.N0();
            }
        }
    }

    public class b implements InterfaceC0217w {
        public b() {
        }

        @Override // K.InterfaceC0217w
        public void a(Menu menu, MenuInflater menuInflater) {
            B.this.x(menu, menuInflater);
        }

        @Override // K.InterfaceC0217w
        public void b(Menu menu) {
            B.this.F(menu);
        }

        @Override // K.InterfaceC0217w
        public boolean c(MenuItem menuItem) {
            return B.this.C(menuItem);
        }
    }

    public class c extends AbstractC0462t {
        public c() {
        }

        @Override // e0.AbstractC0462t
        public AbstractComponentCallbacksC0459p a(ClassLoader classLoader, String str) {
            B.this.j0();
            B.this.j0();
            throw null;
        }
    }

    public class d implements T {
        public d() {
        }

        @Override // e0.T
        public S a(ViewGroup viewGroup) {
            return new C0449f(viewGroup);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            B.this.Q(true);
        }
    }

    public class f implements F {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractComponentCallbacksC0459p f6429a;

        public f(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
            this.f6429a = abstractComponentCallbacksC0459p;
        }
    }

    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public String f6431e;

        /* renamed from: f, reason: collision with root package name */
        public int f6432f;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i3) {
                return new g[i3];
            }
        }

        public g(Parcel parcel) {
            this.f6431e = parcel.readString();
            this.f6432f = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            parcel.writeString(this.f6431e);
            parcel.writeInt(this.f6432f);
        }
    }

    public interface h {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    public class i implements h {

        /* renamed from: a, reason: collision with root package name */
        public final String f6433a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6434b;

        /* renamed from: c, reason: collision with root package name */
        public final int f6435c;

        public i(String str, int i3, int i4) {
            this.f6433a = str;
            this.f6434b = i3;
            this.f6435c = i4;
        }

        @Override // e0.B.h
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = B.this.f6423z;
            if (abstractComponentCallbacksC0459p == null || this.f6434b >= 0 || this.f6433a != null || !abstractComponentCallbacksC0459p.k().I0()) {
                return B.this.L0(arrayList, arrayList2, this.f6433a, this.f6434b, this.f6435c);
            }
            return false;
        }
    }

    public class j implements h {
        public j() {
        }

        @Override // e0.B.h
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            boolean M02 = B.this.M0(arrayList, arrayList2);
            B b3 = B.this;
            b3.f6406i = true;
            if (!b3.f6412o.isEmpty() && arrayList.size() > 0) {
                ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(B.this.c0((C0444a) it.next()));
                }
                Iterator it2 = B.this.f6412o.iterator();
                while (it2.hasNext()) {
                    AbstractC0515e.a(it2.next());
                    Iterator it3 = linkedHashSet.iterator();
                    if (it3.hasNext()) {
                        throw null;
                    }
                }
            }
            return M02;
        }
    }

    public static void S(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        while (i3 < i4) {
            C0444a c0444a = (C0444a) arrayList.get(i3);
            if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                c0444a.o(-1);
                c0444a.t();
            } else {
                c0444a.o(1);
                c0444a.s();
            }
            i3++;
        }
    }

    public static int S0(int i3) {
        if (i3 == 4097) {
            return 8194;
        }
        if (i3 == 8194) {
            return 4097;
        }
        if (i3 == 8197) {
            return 4100;
        }
        if (i3 != 4099) {
            return i3 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    public static B Z(View view) {
        AbstractComponentCallbacksC0459p a02 = a0(view);
        if (a02 == null) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        }
        if (a02.Q()) {
            return a02.k();
        }
        throw new IllegalStateException("The Fragment " + a02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
    }

    public static /* synthetic */ void a(B b3, Integer num) {
        if (b3.x0() && num.intValue() == 80) {
            b3.A(false);
        }
    }

    public static AbstractComponentCallbacksC0459p a0(View view) {
        while (view != null) {
            AbstractComponentCallbacksC0459p p02 = p0(view);
            if (p02 != null) {
                return p02;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    public static /* synthetic */ void b(B b3, z.i iVar) {
        if (b3.x0()) {
            throw null;
        }
    }

    public static /* synthetic */ void c(B b3, AbstractC0780b abstractC0780b) {
        if (b3.x0()) {
            throw null;
        }
    }

    public static /* synthetic */ void d(B b3, Configuration configuration) {
        if (b3.x0()) {
            b3.v(configuration, false);
        }
    }

    public static AbstractComponentCallbacksC0459p p0(View view) {
        Object tag = view.getTag(AbstractC0438b.f6365a);
        if (tag instanceof AbstractComponentCallbacksC0459p) {
            return (AbstractComponentCallbacksC0459p) tag;
        }
        return null;
    }

    public static boolean v0(int i3) {
        return f6380Q || Log.isLoggable("FragmentManager", i3);
    }

    public void A(boolean z3) {
        for (AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p : this.f6400c.m()) {
            if (abstractComponentCallbacksC0459p != null) {
                abstractComponentCallbacksC0459p.B0();
                if (z3) {
                    abstractComponentCallbacksC0459p.f6737y.A(true);
                }
            }
        }
    }

    public boolean A0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (abstractComponentCallbacksC0459p == null) {
            return true;
        }
        B b3 = abstractComponentCallbacksC0459p.f6736x;
        return abstractComponentCallbacksC0459p.equals(b3.m0()) && A0(b3.f6422y);
    }

    public void B() {
        for (AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p : this.f6400c.j()) {
            if (abstractComponentCallbacksC0459p != null) {
                abstractComponentCallbacksC0459p.g0(abstractComponentCallbacksC0459p.R());
                abstractComponentCallbacksC0459p.f6737y.B();
            }
        }
    }

    public boolean B0(int i3) {
        return this.f6420w >= i3;
    }

    public boolean C(MenuItem menuItem) {
        if (this.f6420w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p : this.f6400c.m()) {
            if (abstractComponentCallbacksC0459p != null && abstractComponentCallbacksC0459p.C0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean C0() {
        return this.f6388G || this.f6389H;
    }

    public final void D(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (abstractComponentCallbacksC0459p == null || !abstractComponentCallbacksC0459p.equals(V(abstractComponentCallbacksC0459p.f6721i))) {
            return;
        }
        abstractComponentCallbacksC0459p.F0();
    }

    public void D0(int i3, boolean z3) {
        if (i3 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z3 || i3 != this.f6420w) {
            this.f6420w = i3;
            this.f6400c.r();
            Z0();
        }
    }

    public void E() {
        J(5);
    }

    public boolean F(Menu menu) {
        boolean z3 = false;
        if (this.f6420w < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p : this.f6400c.m()) {
            if (abstractComponentCallbacksC0459p != null && z0(abstractComponentCallbacksC0459p) && abstractComponentCallbacksC0459p.E0(menu)) {
                z3 = true;
            }
        }
        return z3;
    }

    public void F0(FragmentContainerView fragmentContainerView) {
        View view;
        for (H h3 : this.f6400c.i()) {
            AbstractComponentCallbacksC0459p k3 = h3.k();
            if (k3.f6688B == fragmentContainerView.getId() && (view = k3.f6698L) != null && view.getParent() == null) {
                k3.f6697K = fragmentContainerView;
                h3.b();
            }
        }
    }

    public void G() {
        a1();
        D(this.f6423z);
    }

    public void G0(H h3) {
        AbstractComponentCallbacksC0459p k3 = h3.k();
        if (k3.f6699M) {
            if (this.f6399b) {
                this.f6391J = true;
            } else {
                k3.f6699M = false;
                h3.m();
            }
        }
    }

    public void H() {
        this.f6388G = false;
        this.f6389H = false;
        this.f6395N.m(false);
        J(7);
    }

    public void H0(int i3, int i4, boolean z3) {
        if (i3 >= 0) {
            O(new i(null, i3, i4), z3);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i3);
    }

    public void I() {
        this.f6388G = false;
        this.f6389H = false;
        this.f6395N.m(false);
        J(5);
    }

    public boolean I0() {
        return K0(null, -1, 0);
    }

    public final void J(int i3) {
        try {
            this.f6399b = true;
            this.f6400c.d(i3);
            D0(i3, false);
            Iterator it = q().iterator();
            while (it.hasNext()) {
                ((S) it.next()).q();
            }
            this.f6399b = false;
            Q(true);
        } catch (Throwable th) {
            this.f6399b = false;
            throw th;
        }
    }

    public boolean J0(int i3, int i4) {
        if (i3 >= 0) {
            return K0(null, i3, i4);
        }
        throw new IllegalArgumentException("Bad id: " + i3);
    }

    public void K() {
        this.f6389H = true;
        this.f6395N.m(true);
        J(4);
    }

    public final boolean K0(String str, int i3, int i4) {
        Q(false);
        P(true);
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6423z;
        if (abstractComponentCallbacksC0459p != null && i3 < 0 && str == null && abstractComponentCallbacksC0459p.k().I0()) {
            return true;
        }
        boolean L02 = L0(this.f6392K, this.f6393L, str, i3, i4);
        if (L02) {
            this.f6399b = true;
            try {
                P0(this.f6392K, this.f6393L);
            } finally {
                o();
            }
        }
        a1();
        M();
        this.f6400c.b();
        return L02;
    }

    public void L() {
        J(2);
    }

    public boolean L0(ArrayList arrayList, ArrayList arrayList2, String str, int i3, int i4) {
        int W2 = W(str, i3, (i4 & 1) != 0);
        if (W2 < 0) {
            return false;
        }
        for (int size = this.f6401d.size() - 1; size >= W2; size--) {
            arrayList.add((C0444a) this.f6401d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void M() {
        if (this.f6391J) {
            this.f6391J = false;
            Z0();
        }
    }

    public boolean M0(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = this.f6401d;
        C0444a c0444a = (C0444a) arrayList3.get(arrayList3.size() - 1);
        this.f6405h = c0444a;
        Iterator it = c0444a.f6482c.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = ((J.a) it.next()).f6500b;
            if (abstractComponentCallbacksC0459p != null) {
                abstractComponentCallbacksC0459p.f6729q = true;
            }
        }
        return L0(arrayList, arrayList2, null, -1, 0);
    }

    public final void N() {
        Iterator it = q().iterator();
        while (it.hasNext()) {
            ((S) it.next()).q();
        }
    }

    public void N0() {
        O(new j(), false);
    }

    public void O(h hVar, boolean z3) {
        if (!z3) {
            if (!this.f6390I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        synchronized (this.f6398a) {
            try {
                if (!z3) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void O0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (v0(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0459p + " nesting=" + abstractComponentCallbacksC0459p.f6735w);
        }
        boolean S3 = abstractComponentCallbacksC0459p.S();
        if (abstractComponentCallbacksC0459p.f6691E && S3) {
            return;
        }
        this.f6400c.s(abstractComponentCallbacksC0459p);
        if (w0(abstractComponentCallbacksC0459p)) {
            this.f6387F = true;
        }
        abstractComponentCallbacksC0459p.f6728p = true;
        X0(abstractComponentCallbacksC0459p);
    }

    public final void P(boolean z3) {
        if (this.f6399b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (!this.f6390I) {
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        throw new IllegalStateException("FragmentManager has been destroyed");
    }

    public final void P0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            if (!((C0444a) arrayList.get(i3)).f6497r) {
                if (i4 != i3) {
                    T(arrayList, arrayList2, i4, i3);
                }
                i4 = i3 + 1;
                if (((Boolean) arrayList2.get(i3)).booleanValue()) {
                    while (i4 < size && ((Boolean) arrayList2.get(i4)).booleanValue() && !((C0444a) arrayList.get(i4)).f6497r) {
                        i4++;
                    }
                }
                T(arrayList, arrayList2, i3, i4);
                i3 = i4 - 1;
            }
            i3++;
        }
        if (i4 != size) {
            T(arrayList, arrayList2, i4, size);
        }
    }

    public boolean Q(boolean z3) {
        P(z3);
        boolean z4 = false;
        while (d0(this.f6392K, this.f6393L)) {
            z4 = true;
            this.f6399b = true;
            try {
                P0(this.f6392K, this.f6393L);
            } finally {
                o();
            }
        }
        a1();
        M();
        this.f6400c.b();
        return z4;
    }

    public final void Q0() {
        if (this.f6412o.size() <= 0) {
            return;
        }
        AbstractC0515e.a(this.f6412o.get(0));
        throw null;
    }

    public void R(h hVar, boolean z3) {
        if (z3) {
            return;
        }
        P(z3);
        if (hVar.a(this.f6392K, this.f6393L)) {
            this.f6399b = true;
            try {
                P0(this.f6392K, this.f6393L);
            } finally {
                o();
            }
        }
        a1();
        M();
        this.f6400c.b();
    }

    public void R0(Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && bundle.getBundle(str) != null) {
                throw null;
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && bundle.getBundle(str2) != null) {
                throw null;
            }
        }
        this.f6400c.v(hashMap);
        D d3 = (D) bundle.getParcelable("state");
        if (d3 == null) {
            return;
        }
        this.f6400c.t();
        Iterator it = d3.f6438e.iterator();
        while (it.hasNext()) {
            Bundle z3 = this.f6400c.z((String) it.next(), null);
            if (z3 != null) {
                AbstractComponentCallbacksC0459p h3 = this.f6395N.h(((G) z3.getParcelable("state")).f6455f);
                h3.getClass();
                if (v0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + h3);
                }
                AbstractComponentCallbacksC0459p k3 = new H(this.f6413p, this.f6400c, h3, z3).k();
                k3.f6718f = z3;
                k3.f6736x = this;
                if (!v0(2)) {
                    throw null;
                }
                Log.v("FragmentManager", "restoreSaveState: active (" + k3.f6721i + "): " + k3);
                throw null;
            }
        }
        for (AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p : this.f6395N.j()) {
            if (!this.f6400c.c(abstractComponentCallbacksC0459p.f6721i)) {
                if (v0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0459p + " that was not found in the set of active Fragments " + d3.f6438e);
                }
                this.f6395N.l(abstractComponentCallbacksC0459p);
                abstractComponentCallbacksC0459p.f6736x = this;
                H h4 = new H(this.f6413p, this.f6400c, abstractComponentCallbacksC0459p);
                h4.r(1);
                h4.m();
                abstractComponentCallbacksC0459p.f6728p = true;
                h4.m();
            }
        }
        this.f6400c.u(d3.f6439f);
        if (d3.f6440g != null) {
            this.f6401d = new ArrayList(d3.f6440g.length);
            int i3 = 0;
            while (true) {
                C0445b[] c0445bArr = d3.f6440g;
                if (i3 >= c0445bArr.length) {
                    break;
                }
                C0444a b3 = c0445bArr[i3].b(this);
                if (v0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + b3.f6580v + "): " + b3);
                    PrintWriter printWriter = new PrintWriter(new O("FragmentManager"));
                    b3.r("  ", printWriter, false);
                    printWriter.close();
                }
                this.f6401d.add(b3);
                i3++;
            }
        } else {
            this.f6401d = new ArrayList();
        }
        this.f6408k.set(d3.f6441h);
        String str3 = d3.f6442i;
        if (str3 != null) {
            AbstractComponentCallbacksC0459p V2 = V(str3);
            this.f6423z = V2;
            D(V2);
        }
        ArrayList arrayList = d3.f6443j;
        if (arrayList != null) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                this.f6409l.put((String) arrayList.get(i4), (C0446c) d3.f6444k.get(i4));
            }
        }
        this.f6386E = new ArrayDeque(d3.f6445l);
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2, int i3, int i4) {
        boolean z3 = ((C0444a) arrayList.get(i3)).f6497r;
        ArrayList arrayList3 = this.f6394M;
        if (arrayList3 == null) {
            this.f6394M = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.f6394M.addAll(this.f6400c.m());
        AbstractComponentCallbacksC0459p m02 = m0();
        boolean z4 = false;
        for (int i5 = i3; i5 < i4; i5++) {
            C0444a c0444a = (C0444a) arrayList.get(i5);
            m02 = !((Boolean) arrayList2.get(i5)).booleanValue() ? c0444a.u(this.f6394M, m02) : c0444a.x(this.f6394M, m02);
            z4 = z4 || c0444a.f6488i;
        }
        this.f6394M.clear();
        if (!z3 && this.f6420w >= 1) {
            for (int i6 = i3; i6 < i4; i6++) {
                Iterator it = ((C0444a) arrayList.get(i6)).f6482c.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = ((J.a) it.next()).f6500b;
                    if (abstractComponentCallbacksC0459p != null && abstractComponentCallbacksC0459p.f6736x != null) {
                        this.f6400c.p(s(abstractComponentCallbacksC0459p));
                    }
                }
            }
        }
        S(arrayList, arrayList2, i3, i4);
        boolean booleanValue = ((Boolean) arrayList2.get(i4 - 1)).booleanValue();
        if (z4 && !this.f6412o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(c0((C0444a) it2.next()));
            }
            if (this.f6405h == null) {
                Iterator it3 = this.f6412o.iterator();
                while (it3.hasNext()) {
                    AbstractC0515e.a(it3.next());
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = this.f6412o.iterator();
                while (it5.hasNext()) {
                    AbstractC0515e.a(it5.next());
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i7 = i3; i7 < i4; i7++) {
            C0444a c0444a2 = (C0444a) arrayList.get(i7);
            if (booleanValue) {
                for (int size = c0444a2.f6482c.size() - 1; size >= 0; size--) {
                    AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = ((J.a) c0444a2.f6482c.get(size)).f6500b;
                    if (abstractComponentCallbacksC0459p2 != null) {
                        s(abstractComponentCallbacksC0459p2).m();
                    }
                }
            } else {
                Iterator it7 = c0444a2.f6482c.iterator();
                while (it7.hasNext()) {
                    AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p3 = ((J.a) it7.next()).f6500b;
                    if (abstractComponentCallbacksC0459p3 != null) {
                        s(abstractComponentCallbacksC0459p3).m();
                    }
                }
            }
        }
        D0(this.f6420w, true);
        for (S s3 : r(arrayList, i3, i4)) {
            s3.A(booleanValue);
            s3.w();
            s3.n();
        }
        while (i3 < i4) {
            C0444a c0444a3 = (C0444a) arrayList.get(i3);
            if (((Boolean) arrayList2.get(i3)).booleanValue() && c0444a3.f6580v >= 0) {
                c0444a3.f6580v = -1;
            }
            c0444a3.w();
            i3++;
        }
        if (z4) {
            Q0();
        }
    }

    public Bundle T0() {
        C0445b[] c0445bArr;
        Bundle bundle = new Bundle();
        b0();
        N();
        Q(true);
        this.f6388G = true;
        this.f6395N.m(true);
        ArrayList w3 = this.f6400c.w();
        HashMap k3 = this.f6400c.k();
        if (!k3.isEmpty()) {
            ArrayList x3 = this.f6400c.x();
            int size = this.f6401d.size();
            if (size > 0) {
                c0445bArr = new C0445b[size];
                for (int i3 = 0; i3 < size; i3++) {
                    c0445bArr[i3] = new C0445b((C0444a) this.f6401d.get(i3));
                    if (v0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.f6401d.get(i3));
                    }
                }
            } else {
                c0445bArr = null;
            }
            D d3 = new D();
            d3.f6438e = w3;
            d3.f6439f = x3;
            d3.f6440g = c0445bArr;
            d3.f6441h = this.f6408k.get();
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6423z;
            if (abstractComponentCallbacksC0459p != null) {
                d3.f6442i = abstractComponentCallbacksC0459p.f6721i;
            }
            d3.f6443j.addAll(this.f6409l.keySet());
            d3.f6444k.addAll(this.f6409l.values());
            d3.f6445l = new ArrayList(this.f6386E);
            bundle.putParcelable("state", d3);
            for (String str : this.f6410m.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f6410m.get(str));
            }
            for (String str2 : k3.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) k3.get(str2));
            }
        } else if (v0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public boolean U() {
        boolean Q3 = Q(true);
        b0();
        return Q3;
    }

    public void U0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, boolean z3) {
        ViewGroup h02 = h0(abstractComponentCallbacksC0459p);
        if (h02 == null || !(h02 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) h02).setDrawDisappearingViewsLast(!z3);
    }

    public AbstractComponentCallbacksC0459p V(String str) {
        return this.f6400c.e(str);
    }

    public void V0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, AbstractC0347h.b bVar) {
        if (abstractComponentCallbacksC0459p.equals(V(abstractComponentCallbacksC0459p.f6721i))) {
            abstractComponentCallbacksC0459p.f6707U = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0459p + " is not an active fragment of FragmentManager " + this);
    }

    public final int W(String str, int i3, boolean z3) {
        if (this.f6401d.isEmpty()) {
            return -1;
        }
        if (str == null && i3 < 0) {
            if (z3) {
                return 0;
            }
            return this.f6401d.size() - 1;
        }
        int size = this.f6401d.size() - 1;
        while (size >= 0) {
            C0444a c0444a = (C0444a) this.f6401d.get(size);
            if ((str != null && str.equals(c0444a.v())) || (i3 >= 0 && i3 == c0444a.f6580v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z3) {
            if (size == this.f6401d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C0444a c0444a2 = (C0444a) this.f6401d.get(size - 1);
            if ((str == null || !str.equals(c0444a2.v())) && (i3 < 0 || i3 != c0444a2.f6580v)) {
                break;
            }
            size--;
        }
        return size;
    }

    public void W0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (abstractComponentCallbacksC0459p == null || abstractComponentCallbacksC0459p.equals(V(abstractComponentCallbacksC0459p.f6721i))) {
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = this.f6423z;
            this.f6423z = abstractComponentCallbacksC0459p;
            D(abstractComponentCallbacksC0459p2);
            D(this.f6423z);
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0459p + " is not an active fragment of FragmentManager " + this);
    }

    public AbstractComponentCallbacksC0459p X(int i3) {
        return this.f6400c.f(i3);
    }

    public final void X0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        ViewGroup h02 = h0(abstractComponentCallbacksC0459p);
        if (h02 == null || abstractComponentCallbacksC0459p.o() + abstractComponentCallbacksC0459p.r() + abstractComponentCallbacksC0459p.B() + abstractComponentCallbacksC0459p.C() <= 0) {
            return;
        }
        int i3 = AbstractC0438b.f6367c;
        if (h02.getTag(i3) == null) {
            h02.setTag(i3, abstractComponentCallbacksC0459p);
        }
        ((AbstractComponentCallbacksC0459p) h02.getTag(i3)).W0(abstractComponentCallbacksC0459p.A());
    }

    public AbstractComponentCallbacksC0459p Y(String str) {
        return this.f6400c.g(str);
    }

    public void Y0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (v0(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0459p);
        }
        if (abstractComponentCallbacksC0459p.f6690D) {
            abstractComponentCallbacksC0459p.f6690D = false;
            abstractComponentCallbacksC0459p.f6703Q = !abstractComponentCallbacksC0459p.f6703Q;
        }
    }

    public final void Z0() {
        Iterator it = this.f6400c.i().iterator();
        while (it.hasNext()) {
            G0((H) it.next());
        }
    }

    public final void a1() {
        synchronized (this.f6398a) {
            try {
                if (!this.f6398a.isEmpty()) {
                    this.f6407j.g(true);
                    if (v0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z3 = e0() > 0 && A0(this.f6422y);
                if (v0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z3);
                }
                this.f6407j.g(z3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b0() {
        Iterator it = q().iterator();
        while (it.hasNext()) {
            ((S) it.next()).r();
        }
    }

    public Set c0(C0444a c0444a) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < c0444a.f6482c.size(); i3++) {
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = ((J.a) c0444a.f6482c.get(i3)).f6500b;
            if (abstractComponentCallbacksC0459p != null && c0444a.f6488i) {
                hashSet.add(abstractComponentCallbacksC0459p);
            }
        }
        return hashSet;
    }

    public final boolean d0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f6398a) {
            if (!this.f6398a.isEmpty()) {
                int size = this.f6398a.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((h) this.f6398a.get(i3)).a(arrayList, arrayList2);
                }
                this.f6398a.clear();
                throw null;
            }
        }
        return false;
    }

    public int e0() {
        return this.f6401d.size() + (this.f6405h != null ? 1 : 0);
    }

    public void f(C0444a c0444a) {
        this.f6401d.add(c0444a);
    }

    public final E f0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        return this.f6395N.i(abstractComponentCallbacksC0459p);
    }

    public H g(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        String str = abstractComponentCallbacksC0459p.f6706T;
        if (str != null) {
            C0470c.f(abstractComponentCallbacksC0459p, str);
        }
        if (v0(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0459p);
        }
        H s3 = s(abstractComponentCallbacksC0459p);
        abstractComponentCallbacksC0459p.f6736x = this;
        this.f6400c.p(s3);
        if (!abstractComponentCallbacksC0459p.f6691E) {
            this.f6400c.a(abstractComponentCallbacksC0459p);
            abstractComponentCallbacksC0459p.f6728p = false;
            if (abstractComponentCallbacksC0459p.f6698L == null) {
                abstractComponentCallbacksC0459p.f6703Q = false;
            }
            if (w0(abstractComponentCallbacksC0459p)) {
                this.f6387F = true;
            }
        }
        return s3;
    }

    public AbstractC0461s g0() {
        return this.f6421x;
    }

    public void h(F f3) {
        this.f6414q.add(f3);
    }

    public final ViewGroup h0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        ViewGroup viewGroup = abstractComponentCallbacksC0459p.f6697K;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0459p.f6688B > 0 && this.f6421x.b()) {
            View a3 = this.f6421x.a(abstractComponentCallbacksC0459p.f6688B);
            if (a3 instanceof ViewGroup) {
                return (ViewGroup) a3;
            }
        }
        return null;
    }

    public int i() {
        return this.f6408k.getAndIncrement();
    }

    public AbstractC0462t i0() {
        AbstractC0462t abstractC0462t = this.f6382A;
        if (abstractC0462t != null) {
            return abstractC0462t;
        }
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6422y;
        return abstractComponentCallbacksC0459p != null ? abstractComponentCallbacksC0459p.f6736x.i0() : this.f6383B;
    }

    public void j(AbstractC0463u abstractC0463u, AbstractC0461s abstractC0461s, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        this.f6421x = abstractC0461s;
        this.f6422y = abstractComponentCallbacksC0459p;
        if (abstractComponentCallbacksC0459p != null) {
            h(new f(abstractComponentCallbacksC0459p));
        }
        if (this.f6422y != null) {
            a1();
        }
        if (abstractComponentCallbacksC0459p != null) {
            this.f6395N = abstractComponentCallbacksC0459p.f6736x.f0(abstractComponentCallbacksC0459p);
        } else {
            this.f6395N = new E(false);
        }
        this.f6395N.m(C0());
        this.f6400c.y(this.f6395N);
    }

    public AbstractC0463u j0() {
        return null;
    }

    public void k(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (v0(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0459p);
        }
        if (abstractComponentCallbacksC0459p.f6691E) {
            abstractComponentCallbacksC0459p.f6691E = false;
            if (abstractComponentCallbacksC0459p.f6727o) {
                return;
            }
            this.f6400c.a(abstractComponentCallbacksC0459p);
            if (v0(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0459p);
            }
            if (w0(abstractComponentCallbacksC0459p)) {
                this.f6387F = true;
            }
        }
    }

    public w k0() {
        return this.f6413p;
    }

    public J l() {
        return new C0444a(this);
    }

    public AbstractComponentCallbacksC0459p l0() {
        return this.f6422y;
    }

    public void m() {
        C0444a c0444a = this.f6405h;
        if (c0444a != null) {
            c0444a.f6579u = false;
            c0444a.e();
            U();
            Iterator it = this.f6412o.iterator();
            if (it.hasNext()) {
                AbstractC0515e.a(it.next());
                throw null;
            }
        }
    }

    public AbstractComponentCallbacksC0459p m0() {
        return this.f6423z;
    }

    public boolean n() {
        boolean z3 = false;
        for (AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p : this.f6400c.j()) {
            if (abstractComponentCallbacksC0459p != null) {
                z3 = w0(abstractComponentCallbacksC0459p);
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    public T n0() {
        T t3 = this.f6384C;
        if (t3 != null) {
            return t3;
        }
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6422y;
        return abstractComponentCallbacksC0459p != null ? abstractComponentCallbacksC0459p.f6736x.n0() : this.f6385D;
    }

    public final void o() {
        this.f6399b = false;
        this.f6393L.clear();
        this.f6392K.clear();
    }

    public C0470c.C0119c o0() {
        return this.f6396O;
    }

    public final void p() {
        throw null;
    }

    public final Set q() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f6400c.i().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((H) it.next()).k().f6697K;
            if (viewGroup != null) {
                hashSet.add(S.v(viewGroup, n0()));
            }
        }
        return hashSet;
    }

    public androidx.lifecycle.G q0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        return this.f6395N.k(abstractComponentCallbacksC0459p);
    }

    public Set r(ArrayList arrayList, int i3, int i4) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i3 < i4) {
            Iterator it = ((C0444a) arrayList.get(i3)).f6482c.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = ((J.a) it.next()).f6500b;
                if (abstractComponentCallbacksC0459p != null && (viewGroup = abstractComponentCallbacksC0459p.f6697K) != null) {
                    hashSet.add(S.u(viewGroup, this));
                }
            }
            i3++;
        }
        return hashSet;
    }

    public void r0() {
        Q(true);
        if (!f6381R || this.f6405h == null) {
            if (this.f6407j.e()) {
                if (v0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                I0();
                return;
            } else {
                if (v0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f6404g.e();
                return;
            }
        }
        if (!this.f6412o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(c0(this.f6405h));
            Iterator it = this.f6412o.iterator();
            while (it.hasNext()) {
                AbstractC0515e.a(it.next());
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        Iterator it3 = this.f6405h.f6482c.iterator();
        while (it3.hasNext()) {
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = ((J.a) it3.next()).f6500b;
            if (abstractComponentCallbacksC0459p != null) {
                abstractComponentCallbacksC0459p.f6729q = false;
            }
        }
        Iterator it4 = r(new ArrayList(Collections.singletonList(this.f6405h)), 0, 1).iterator();
        while (it4.hasNext()) {
            ((S) it4.next()).f();
        }
        this.f6405h = null;
        a1();
        if (v0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f6407j.e() + " for  FragmentManager " + this);
        }
    }

    public H s(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        H l3 = this.f6400c.l(abstractComponentCallbacksC0459p.f6721i);
        if (l3 != null) {
            return l3;
        }
        new H(this.f6413p, this.f6400c, abstractComponentCallbacksC0459p);
        throw null;
    }

    public void s0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (v0(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0459p);
        }
        if (abstractComponentCallbacksC0459p.f6690D) {
            return;
        }
        abstractComponentCallbacksC0459p.f6690D = true;
        abstractComponentCallbacksC0459p.f6703Q = true ^ abstractComponentCallbacksC0459p.f6703Q;
        X0(abstractComponentCallbacksC0459p);
    }

    public void t(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (v0(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0459p);
        }
        if (abstractComponentCallbacksC0459p.f6691E) {
            return;
        }
        abstractComponentCallbacksC0459p.f6691E = true;
        if (abstractComponentCallbacksC0459p.f6727o) {
            if (v0(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0459p);
            }
            this.f6400c.s(abstractComponentCallbacksC0459p);
            if (w0(abstractComponentCallbacksC0459p)) {
                this.f6387F = true;
            }
            X0(abstractComponentCallbacksC0459p);
        }
    }

    public void t0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (abstractComponentCallbacksC0459p.f6727o && w0(abstractComponentCallbacksC0459p)) {
            this.f6387F = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6422y;
        if (abstractComponentCallbacksC0459p != null) {
            sb.append(abstractComponentCallbacksC0459p.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f6422y)));
            sb.append("}");
        } else {
            sb.append("null");
        }
        sb.append("}}");
        return sb.toString();
    }

    public void u() {
        this.f6388G = false;
        this.f6389H = false;
        this.f6395N.m(false);
        J(4);
    }

    public boolean u0() {
        return this.f6390I;
    }

    public void v(Configuration configuration, boolean z3) {
        for (AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p : this.f6400c.m()) {
            if (abstractComponentCallbacksC0459p != null) {
                abstractComponentCallbacksC0459p.u0(configuration);
                if (z3) {
                    abstractComponentCallbacksC0459p.f6737y.v(configuration, true);
                }
            }
        }
    }

    public void w() {
        this.f6388G = false;
        this.f6389H = false;
        this.f6395N.m(false);
        J(1);
    }

    public final boolean w0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        return (abstractComponentCallbacksC0459p.f6694H && abstractComponentCallbacksC0459p.f6695I) || abstractComponentCallbacksC0459p.f6737y.n();
    }

    public boolean x(Menu menu, MenuInflater menuInflater) {
        if (this.f6420w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p : this.f6400c.m()) {
            if (abstractComponentCallbacksC0459p != null && z0(abstractComponentCallbacksC0459p) && abstractComponentCallbacksC0459p.w0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(abstractComponentCallbacksC0459p);
                z3 = true;
            }
        }
        if (this.f6402e != null) {
            for (int i3 = 0; i3 < this.f6402e.size(); i3++) {
                AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = (AbstractComponentCallbacksC0459p) this.f6402e.get(i3);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0459p2)) {
                    abstractComponentCallbacksC0459p2.c0();
                }
            }
        }
        this.f6402e = arrayList;
        return z3;
    }

    public final boolean x0() {
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6422y;
        if (abstractComponentCallbacksC0459p == null) {
            return true;
        }
        return abstractComponentCallbacksC0459p.Q() && this.f6422y.z().x0();
    }

    public void y() {
        this.f6390I = true;
        Q(true);
        N();
        p();
        J(-1);
        this.f6421x = null;
        this.f6422y = null;
        if (this.f6404g != null) {
            this.f6407j.f();
            this.f6404g = null;
        }
    }

    public boolean y0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (abstractComponentCallbacksC0459p == null) {
            return false;
        }
        return abstractComponentCallbacksC0459p.R();
    }

    public void z() {
        J(1);
    }

    public boolean z0(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (abstractComponentCallbacksC0459p == null) {
            return true;
        }
        return abstractComponentCallbacksC0459p.T();
    }

    public void E0() {
    }
}

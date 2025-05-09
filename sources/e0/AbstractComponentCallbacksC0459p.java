package e0;

import android.animation.Animator;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.AbstractC0347h;
import androidx.lifecycle.E;
import androidx.lifecycle.InterfaceC0346g;
import androidx.lifecycle.InterfaceC0349j;
import i0.AbstractC0499a;
import i0.C0500b;
import j0.AbstractC0516a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import o0.C0643d;
import o0.C0644e;

/* renamed from: e0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0459p implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.l, androidx.lifecycle.H, InterfaceC0346g, o0.f {

    /* renamed from: e0, reason: collision with root package name */
    public static final Object f6686e0 = new Object();

    /* renamed from: A, reason: collision with root package name */
    public int f6687A;

    /* renamed from: B, reason: collision with root package name */
    public int f6688B;

    /* renamed from: C, reason: collision with root package name */
    public String f6689C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f6690D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f6691E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6692F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f6693G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f6694H;

    /* renamed from: J, reason: collision with root package name */
    public boolean f6696J;

    /* renamed from: K, reason: collision with root package name */
    public ViewGroup f6697K;

    /* renamed from: L, reason: collision with root package name */
    public View f6698L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f6699M;

    /* renamed from: O, reason: collision with root package name */
    public e f6701O;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f6703Q;

    /* renamed from: R, reason: collision with root package name */
    public LayoutInflater f6704R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f6705S;

    /* renamed from: T, reason: collision with root package name */
    public String f6706T;

    /* renamed from: V, reason: collision with root package name */
    public androidx.lifecycle.m f6708V;

    /* renamed from: W, reason: collision with root package name */
    public N f6709W;

    /* renamed from: Y, reason: collision with root package name */
    public E.b f6711Y;

    /* renamed from: Z, reason: collision with root package name */
    public C0644e f6712Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f6713a0;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f6718f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f6719g;

    /* renamed from: h, reason: collision with root package name */
    public Bundle f6720h;

    /* renamed from: j, reason: collision with root package name */
    public Bundle f6722j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractComponentCallbacksC0459p f6723k;

    /* renamed from: m, reason: collision with root package name */
    public int f6725m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6727o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6728p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f6729q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6730r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6731s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6732t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6733u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f6734v;

    /* renamed from: w, reason: collision with root package name */
    public int f6735w;

    /* renamed from: x, reason: collision with root package name */
    public B f6736x;

    /* renamed from: z, reason: collision with root package name */
    public AbstractComponentCallbacksC0459p f6738z;

    /* renamed from: e, reason: collision with root package name */
    public int f6717e = -1;

    /* renamed from: i, reason: collision with root package name */
    public String f6721i = UUID.randomUUID().toString();

    /* renamed from: l, reason: collision with root package name */
    public String f6724l = null;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f6726n = null;

    /* renamed from: y, reason: collision with root package name */
    public B f6737y = new C();

    /* renamed from: I, reason: collision with root package name */
    public boolean f6695I = true;

    /* renamed from: N, reason: collision with root package name */
    public boolean f6700N = true;

    /* renamed from: P, reason: collision with root package name */
    public Runnable f6702P = new a();

    /* renamed from: U, reason: collision with root package name */
    public AbstractC0347h.b f6707U = AbstractC0347h.b.RESUMED;

    /* renamed from: X, reason: collision with root package name */
    public androidx.lifecycle.q f6710X = new androidx.lifecycle.q();

    /* renamed from: b0, reason: collision with root package name */
    public final AtomicInteger f6714b0 = new AtomicInteger();

    /* renamed from: c0, reason: collision with root package name */
    public final ArrayList f6715c0 = new ArrayList();

    /* renamed from: d0, reason: collision with root package name */
    public final f f6716d0 = new b();

    /* renamed from: e0.p$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractComponentCallbacksC0459p.this.Z0();
        }
    }

    /* renamed from: e0.p$b */
    public class b extends f {
        public b() {
            super(null);
        }

        @Override // e0.AbstractComponentCallbacksC0459p.f
        public void a() {
            AbstractComponentCallbacksC0459p.this.f6712Z.c();
            androidx.lifecycle.z.a(AbstractComponentCallbacksC0459p.this);
            Bundle bundle = AbstractComponentCallbacksC0459p.this.f6718f;
            AbstractComponentCallbacksC0459p.this.f6712Z.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* renamed from: e0.p$c */
    public class c extends AbstractC0461s {
        public c() {
        }

        @Override // e0.AbstractC0461s
        public View a(int i3) {
            View view = AbstractComponentCallbacksC0459p.this.f6698L;
            if (view != null) {
                return view.findViewById(i3);
            }
            throw new IllegalStateException("Fragment " + AbstractComponentCallbacksC0459p.this + " does not have a view");
        }

        @Override // e0.AbstractC0461s
        public boolean b() {
            return AbstractComponentCallbacksC0459p.this.f6698L != null;
        }
    }

    /* renamed from: e0.p$d */
    public class d implements InterfaceC0349j {
        public d() {
        }

        @Override // androidx.lifecycle.InterfaceC0349j
        public void d(androidx.lifecycle.l lVar, AbstractC0347h.a aVar) {
            View view;
            if (aVar != AbstractC0347h.a.ON_STOP || (view = AbstractComponentCallbacksC0459p.this.f6698L) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: e0.p$e */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public boolean f6743a;

        /* renamed from: b, reason: collision with root package name */
        public int f6744b;

        /* renamed from: c, reason: collision with root package name */
        public int f6745c;

        /* renamed from: d, reason: collision with root package name */
        public int f6746d;

        /* renamed from: e, reason: collision with root package name */
        public int f6747e;

        /* renamed from: f, reason: collision with root package name */
        public int f6748f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList f6749g;

        /* renamed from: h, reason: collision with root package name */
        public ArrayList f6750h;

        /* renamed from: i, reason: collision with root package name */
        public Object f6751i = null;

        /* renamed from: j, reason: collision with root package name */
        public Object f6752j;

        /* renamed from: k, reason: collision with root package name */
        public Object f6753k;

        /* renamed from: l, reason: collision with root package name */
        public Object f6754l;

        /* renamed from: m, reason: collision with root package name */
        public Object f6755m;

        /* renamed from: n, reason: collision with root package name */
        public Object f6756n;

        /* renamed from: o, reason: collision with root package name */
        public Boolean f6757o;

        /* renamed from: p, reason: collision with root package name */
        public Boolean f6758p;

        /* renamed from: q, reason: collision with root package name */
        public float f6759q;

        /* renamed from: r, reason: collision with root package name */
        public View f6760r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f6761s;

        public e() {
            Object obj = AbstractComponentCallbacksC0459p.f6686e0;
            this.f6752j = obj;
            this.f6753k = null;
            this.f6754l = obj;
            this.f6755m = null;
            this.f6756n = obj;
            this.f6759q = 1.0f;
            this.f6760r = null;
        }
    }

    /* renamed from: e0.p$f */
    public static abstract class f {
        public f() {
        }

        public abstract void a();

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    public AbstractComponentCallbacksC0459p() {
        O();
    }

    public static /* synthetic */ void c(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        abstractComponentCallbacksC0459p.f6709W.f(abstractComponentCallbacksC0459p.f6720h);
        abstractComponentCallbacksC0459p.f6720h = null;
    }

    public boolean A() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return false;
        }
        return eVar.f6743a;
    }

    public LayoutInflater A0(Bundle bundle) {
        LayoutInflater f02 = f0(bundle);
        this.f6704R = f02;
        return f02;
    }

    public int B() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return 0;
        }
        return eVar.f6746d;
    }

    public void B0() {
        onLowMemory();
    }

    public int C() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return 0;
        }
        return eVar.f6747e;
    }

    public boolean C0(MenuItem menuItem) {
        if (this.f6690D) {
            return false;
        }
        if (this.f6694H && this.f6695I && i0(menuItem)) {
            return true;
        }
        return this.f6737y.C(menuItem);
    }

    public float D() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return 1.0f;
        }
        return eVar.f6759q;
    }

    public void D0() {
        this.f6737y.E();
        if (this.f6698L != null) {
            this.f6709W.c(AbstractC0347h.a.ON_PAUSE);
        }
        this.f6708V.h(AbstractC0347h.a.ON_PAUSE);
        this.f6717e = 6;
        this.f6696J = false;
        j0();
        if (this.f6696J) {
            return;
        }
        throw new U("Fragment " + this + " did not call through to super.onPause()");
    }

    public Object E() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f6754l;
        return obj == f6686e0 ? s() : obj;
    }

    public boolean E0(Menu menu) {
        boolean z3 = false;
        if (this.f6690D) {
            return false;
        }
        if (this.f6694H && this.f6695I) {
            k0(menu);
            z3 = true;
        }
        return this.f6737y.F(menu) | z3;
    }

    public final Resources F() {
        return N0().getResources();
    }

    public void F0() {
        boolean A02 = this.f6736x.A0(this);
        Boolean bool = this.f6726n;
        if (bool == null || bool.booleanValue() != A02) {
            this.f6726n = Boolean.valueOf(A02);
            l0(A02);
            this.f6737y.G();
        }
    }

    public Object G() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f6752j;
        return obj == f6686e0 ? p() : obj;
    }

    public void G0() {
        this.f6737y.E0();
        this.f6737y.Q(true);
        this.f6717e = 7;
        this.f6696J = false;
        m0();
        if (!this.f6696J) {
            throw new U("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.m mVar = this.f6708V;
        AbstractC0347h.a aVar = AbstractC0347h.a.ON_RESUME;
        mVar.h(aVar);
        if (this.f6698L != null) {
            this.f6709W.c(aVar);
        }
        this.f6737y.H();
    }

    public Object H() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return null;
        }
        return eVar.f6755m;
    }

    public void H0(Bundle bundle) {
        n0(bundle);
    }

    public Object I() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f6756n;
        return obj == f6686e0 ? H() : obj;
    }

    public void I0() {
        this.f6737y.E0();
        this.f6737y.Q(true);
        this.f6717e = 5;
        this.f6696J = false;
        o0();
        if (!this.f6696J) {
            throw new U("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.m mVar = this.f6708V;
        AbstractC0347h.a aVar = AbstractC0347h.a.ON_START;
        mVar.h(aVar);
        if (this.f6698L != null) {
            this.f6709W.c(aVar);
        }
        this.f6737y.I();
    }

    public ArrayList J() {
        ArrayList arrayList;
        e eVar = this.f6701O;
        return (eVar == null || (arrayList = eVar.f6749g) == null) ? new ArrayList() : arrayList;
    }

    public void J0() {
        this.f6737y.K();
        if (this.f6698L != null) {
            this.f6709W.c(AbstractC0347h.a.ON_STOP);
        }
        this.f6708V.h(AbstractC0347h.a.ON_STOP);
        this.f6717e = 4;
        this.f6696J = false;
        p0();
        if (this.f6696J) {
            return;
        }
        throw new U("Fragment " + this + " did not call through to super.onStop()");
    }

    public ArrayList K() {
        ArrayList arrayList;
        e eVar = this.f6701O;
        return (eVar == null || (arrayList = eVar.f6750h) == null) ? new ArrayList() : arrayList;
    }

    public void K0() {
        Bundle bundle = this.f6718f;
        q0(this.f6698L, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f6737y.L();
    }

    public final String L(int i3) {
        return F().getString(i3);
    }

    public final void L0(f fVar) {
        if (this.f6717e >= 0) {
            fVar.a();
        } else {
            this.f6715c0.add(fVar);
        }
    }

    public View M() {
        return this.f6698L;
    }

    public final AbstractActivityC0460q M0() {
        f();
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public androidx.lifecycle.o N() {
        return this.f6710X;
    }

    public final Context N0() {
        Context n3 = n();
        if (n3 != null) {
            return n3;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final void O() {
        this.f6708V = new androidx.lifecycle.m(this);
        this.f6712Z = C0644e.a(this);
        this.f6711Y = null;
        if (this.f6715c0.contains(this.f6716d0)) {
            return;
        }
        L0(this.f6716d0);
    }

    public final View O0() {
        View M3 = M();
        if (M3 != null) {
            return M3;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void P() {
        O();
        this.f6706T = this.f6721i;
        this.f6721i = UUID.randomUUID().toString();
        this.f6727o = false;
        this.f6728p = false;
        this.f6731s = false;
        this.f6732t = false;
        this.f6733u = false;
        this.f6735w = 0;
        this.f6736x = null;
        this.f6737y = new C();
        this.f6687A = 0;
        this.f6688B = 0;
        this.f6689C = null;
        this.f6690D = false;
        this.f6691E = false;
    }

    public void P0() {
        Bundle bundle;
        Bundle bundle2 = this.f6718f;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f6737y.R0(bundle);
        this.f6737y.w();
    }

    public final boolean Q() {
        return false;
    }

    public final void Q0() {
        if (B.v0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.f6698L != null) {
            Bundle bundle = this.f6718f;
            R0(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.f6718f = null;
    }

    public final boolean R() {
        if (this.f6690D) {
            return true;
        }
        B b3 = this.f6736x;
        return b3 != null && b3.y0(this.f6738z);
    }

    public final void R0(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f6719g;
        if (sparseArray != null) {
            this.f6698L.restoreHierarchyState(sparseArray);
            this.f6719g = null;
        }
        this.f6696J = false;
        r0(bundle);
        if (this.f6696J) {
            if (this.f6698L != null) {
                this.f6709W.c(AbstractC0347h.a.ON_CREATE);
            }
        } else {
            throw new U("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public final boolean S() {
        return this.f6735w > 0;
    }

    public void S0(int i3, int i4, int i5, int i6) {
        if (this.f6701O == null && i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            return;
        }
        e().f6744b = i3;
        e().f6745c = i4;
        e().f6746d = i5;
        e().f6747e = i6;
    }

    public final boolean T() {
        if (!this.f6695I) {
            return false;
        }
        B b3 = this.f6736x;
        return b3 == null || b3.z0(this.f6738z);
    }

    public void T0(Bundle bundle) {
        if (this.f6736x != null && V()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f6722j = bundle;
    }

    public boolean U() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return false;
        }
        return eVar.f6761s;
    }

    public void U0(View view) {
        e().f6760r = view;
    }

    public final boolean V() {
        B b3 = this.f6736x;
        if (b3 == null) {
            return false;
        }
        return b3.C0();
    }

    public void V0(int i3) {
        if (this.f6701O == null && i3 == 0) {
            return;
        }
        e();
        this.f6701O.f6748f = i3;
    }

    public void W(Bundle bundle) {
        this.f6696J = true;
    }

    public void W0(boolean z3) {
        if (this.f6701O == null) {
            return;
        }
        e().f6743a = z3;
    }

    public void X(Bundle bundle) {
        this.f6696J = true;
        P0();
        if (this.f6737y.B0(1)) {
            return;
        }
        this.f6737y.w();
    }

    public void X0(float f3) {
        e().f6759q = f3;
    }

    public Animation Y(int i3, boolean z3, int i4) {
        return null;
    }

    public void Y0(ArrayList arrayList, ArrayList arrayList2) {
        e();
        e eVar = this.f6701O;
        eVar.f6749g = arrayList;
        eVar.f6750h = arrayList2;
    }

    public Animator Z(int i3, boolean z3, int i4) {
        return null;
    }

    public void Z0() {
        if (this.f6701O == null || !e().f6761s) {
            return;
        }
        e().f6761s = false;
    }

    @Override // androidx.lifecycle.InterfaceC0346g
    public AbstractC0499a a() {
        Application application;
        Context applicationContext = N0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && B.v0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + N0().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C0500b c0500b = new C0500b();
        if (application != null) {
            c0500b.b(E.a.f3960e, application);
        }
        c0500b.b(androidx.lifecycle.z.f4038a, this);
        c0500b.b(androidx.lifecycle.z.f4039b, this);
        if (j() != null) {
            c0500b.b(androidx.lifecycle.z.f4040c, j());
        }
        return c0500b;
    }

    @Override // androidx.lifecycle.H
    public androidx.lifecycle.G b() {
        if (this.f6736x == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (w() != AbstractC0347h.b.INITIALIZED.ordinal()) {
            return this.f6736x.q0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public View b0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i3 = this.f6713a0;
        if (i3 != 0) {
            return layoutInflater.inflate(i3, viewGroup, false);
        }
        return null;
    }

    public AbstractC0461s d() {
        return new c();
    }

    public void d0() {
        this.f6696J = true;
    }

    public final e e() {
        if (this.f6701O == null) {
            this.f6701O = new e();
        }
        return this.f6701O;
    }

    public void e0() {
        this.f6696J = true;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final AbstractActivityC0460q f() {
        return null;
    }

    public LayoutInflater f0(Bundle bundle) {
        return v(bundle);
    }

    public boolean g() {
        Boolean bool;
        e eVar = this.f6701O;
        if (eVar == null || (bool = eVar.f6758p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Override // androidx.lifecycle.l
    public AbstractC0347h h() {
        return this.f6708V;
    }

    public void h0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f6696J = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public boolean i() {
        Boolean bool;
        e eVar = this.f6701O;
        if (eVar == null || (bool = eVar.f6757o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean i0(MenuItem menuItem) {
        return false;
    }

    public final Bundle j() {
        return this.f6722j;
    }

    public void j0() {
        this.f6696J = true;
    }

    public final B k() {
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Override // o0.f
    public final C0643d m() {
        return this.f6712Z.b();
    }

    public void m0() {
        this.f6696J = true;
    }

    public Context n() {
        return null;
    }

    public int o() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return 0;
        }
        return eVar.f6744b;
    }

    public void o0() {
        this.f6696J = true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f6696J = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        M0();
        throw null;
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f6696J = true;
    }

    public Object p() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return null;
        }
        return eVar.f6751i;
    }

    public void p0() {
        this.f6696J = true;
    }

    public z.j q() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return null;
        }
        eVar.getClass();
        return null;
    }

    public int r() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return 0;
        }
        return eVar.f6745c;
    }

    public void r0(Bundle bundle) {
        this.f6696J = true;
    }

    public Object s() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return null;
        }
        return eVar.f6753k;
    }

    public void s0(Bundle bundle) {
        this.f6737y.E0();
        this.f6717e = 3;
        this.f6696J = false;
        W(bundle);
        if (this.f6696J) {
            Q0();
            this.f6737y.u();
        } else {
            throw new U("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public z.j t() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return null;
        }
        eVar.getClass();
        return null;
    }

    public void t0() {
        Iterator it = this.f6715c0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a();
        }
        this.f6715c0.clear();
        this.f6737y.j(null, d(), this);
        this.f6717e = 0;
        this.f6696J = false;
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f6721i);
        if (this.f6687A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f6687A));
        }
        if (this.f6689C != null) {
            sb.append(" tag=");
            sb.append(this.f6689C);
        }
        sb.append(")");
        return sb.toString();
    }

    public View u() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return null;
        }
        return eVar.f6760r;
    }

    public void u0(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public LayoutInflater v(Bundle bundle) {
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void v0(Bundle bundle) {
        this.f6737y.E0();
        this.f6717e = 1;
        this.f6696J = false;
        this.f6708V.a(new d());
        X(bundle);
        this.f6705S = true;
        if (this.f6696J) {
            this.f6708V.h(AbstractC0347h.a.ON_CREATE);
            return;
        }
        throw new U("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final int w() {
        AbstractC0347h.b bVar = this.f6707U;
        return (bVar == AbstractC0347h.b.INITIALIZED || this.f6738z == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f6738z.w());
    }

    public boolean w0(Menu menu, MenuInflater menuInflater) {
        boolean z3 = false;
        if (this.f6690D) {
            return false;
        }
        if (this.f6694H && this.f6695I) {
            a0(menu, menuInflater);
            z3 = true;
        }
        return this.f6737y.x(menu, menuInflater) | z3;
    }

    public int x() {
        e eVar = this.f6701O;
        if (eVar == null) {
            return 0;
        }
        return eVar.f6748f;
    }

    public void x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f6737y.E0();
        this.f6734v = true;
        this.f6709W = new N(this, b(), new Runnable() { // from class: e0.o
            @Override // java.lang.Runnable
            public final void run() {
                AbstractComponentCallbacksC0459p.c(AbstractComponentCallbacksC0459p.this);
            }
        });
        View b02 = b0(layoutInflater, viewGroup, bundle);
        this.f6698L = b02;
        if (b02 == null) {
            if (this.f6709W.e()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f6709W = null;
            return;
        }
        this.f6709W.d();
        if (B.v0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f6698L + " for Fragment " + this);
        }
        androidx.lifecycle.I.a(this.f6698L, this.f6709W);
        androidx.lifecycle.J.a(this.f6698L, this.f6709W);
        o0.g.a(this.f6698L, this.f6709W);
        this.f6710X.e(this.f6709W);
    }

    public final AbstractComponentCallbacksC0459p y() {
        return this.f6738z;
    }

    public void y0() {
        this.f6737y.z();
        if (this.f6698L != null && this.f6709W.h().b().f(AbstractC0347h.b.CREATED)) {
            this.f6709W.c(AbstractC0347h.a.ON_DESTROY);
        }
        this.f6717e = 1;
        this.f6696J = false;
        d0();
        if (this.f6696J) {
            AbstractC0516a.a(this).b();
            this.f6734v = false;
        } else {
            throw new U("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public final B z() {
        B b3 = this.f6736x;
        if (b3 != null) {
            return b3;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void z0() {
        this.f6717e = -1;
        this.f6696J = false;
        e0();
        this.f6704R = null;
        if (this.f6696J) {
            if (this.f6737y.u0()) {
                return;
            }
            this.f6737y.y();
            this.f6737y = new C();
            return;
        }
        throw new U("Fragment " + this + " did not call through to super.onDetach()");
    }

    public void c0() {
    }

    public void g0(boolean z3) {
    }

    public void k0(Menu menu) {
    }

    public void l0(boolean z3) {
    }

    public void n0(Bundle bundle) {
    }

    public void a0(Menu menu, MenuInflater menuInflater) {
    }

    public void q0(View view, Bundle bundle) {
    }
}

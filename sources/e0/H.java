package e0;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.AbstractC0347h;
import d0.AbstractC0438b;
import e0.S;
import f0.C0470c;

/* loaded from: classes.dex */
public class H {

    /* renamed from: a, reason: collision with root package name */
    public final w f6468a;

    /* renamed from: b, reason: collision with root package name */
    public final I f6469b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0459p f6470c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6471d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f6472e = -1;

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6475a;

        static {
            int[] iArr = new int[AbstractC0347h.b.values().length];
            f6475a = iArr;
            try {
                iArr[AbstractC0347h.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6475a[AbstractC0347h.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6475a[AbstractC0347h.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6475a[AbstractC0347h.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public H(w wVar, I i3, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        this.f6468a = wVar;
        this.f6469b = i3;
        this.f6470c = abstractComponentCallbacksC0459p;
    }

    public void a() {
        if (B.v0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f6470c);
        }
        Bundle bundle = this.f6470c.f6718f;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f6470c.s0(bundle2);
        this.f6468a.a(this.f6470c, bundle2, false);
    }

    public void b() {
        AbstractComponentCallbacksC0459p a02 = B.a0(this.f6470c.f6697K);
        AbstractComponentCallbacksC0459p y3 = this.f6470c.y();
        if (a02 != null && !a02.equals(y3)) {
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6470c;
            C0470c.h(abstractComponentCallbacksC0459p, a02, abstractComponentCallbacksC0459p.f6688B);
        }
        int h3 = this.f6469b.h(this.f6470c);
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = this.f6470c;
        abstractComponentCallbacksC0459p2.f6697K.addView(abstractComponentCallbacksC0459p2.f6698L, h3);
    }

    public void c() {
        if (B.v0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f6470c);
        }
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6470c;
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = abstractComponentCallbacksC0459p.f6723k;
        H h3 = null;
        if (abstractComponentCallbacksC0459p2 != null) {
            H l3 = this.f6469b.l(abstractComponentCallbacksC0459p2.f6721i);
            if (l3 == null) {
                throw new IllegalStateException("Fragment " + this.f6470c + " declared target fragment " + this.f6470c.f6723k + " that does not belong to this FragmentManager!");
            }
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p3 = this.f6470c;
            abstractComponentCallbacksC0459p3.f6724l = abstractComponentCallbacksC0459p3.f6723k.f6721i;
            abstractComponentCallbacksC0459p3.f6723k = null;
            h3 = l3;
        } else {
            String str = abstractComponentCallbacksC0459p.f6724l;
            if (str != null && (h3 = this.f6469b.l(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f6470c + " declared target fragment " + this.f6470c.f6724l + " that does not belong to this FragmentManager!");
            }
        }
        if (h3 != null) {
            h3.m();
        }
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p4 = this.f6470c;
        abstractComponentCallbacksC0459p4.f6736x.j0();
        abstractComponentCallbacksC0459p4.getClass();
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p5 = this.f6470c;
        abstractComponentCallbacksC0459p5.f6738z = abstractComponentCallbacksC0459p5.f6736x.l0();
        this.f6468a.f(this.f6470c, false);
        this.f6470c.t0();
        this.f6468a.b(this.f6470c, false);
    }

    public int d() {
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6470c;
        if (abstractComponentCallbacksC0459p.f6736x == null) {
            return abstractComponentCallbacksC0459p.f6717e;
        }
        int i3 = this.f6472e;
        int i4 = b.f6475a[abstractComponentCallbacksC0459p.f6707U.ordinal()];
        if (i4 != 1) {
            i3 = i4 != 2 ? i4 != 3 ? i4 != 4 ? Math.min(i3, -1) : Math.min(i3, 0) : Math.min(i3, 1) : Math.min(i3, 5);
        }
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = this.f6470c;
        if (abstractComponentCallbacksC0459p2.f6731s) {
            if (abstractComponentCallbacksC0459p2.f6732t) {
                i3 = Math.max(this.f6472e, 2);
                View view = this.f6470c.f6698L;
                if (view != null && view.getParent() == null) {
                    i3 = Math.min(i3, 2);
                }
            } else {
                i3 = this.f6472e < 4 ? Math.min(i3, abstractComponentCallbacksC0459p2.f6717e) : Math.min(i3, 1);
            }
        }
        if (!this.f6470c.f6727o) {
            i3 = Math.min(i3, 1);
        }
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p3 = this.f6470c;
        ViewGroup viewGroup = abstractComponentCallbacksC0459p3.f6697K;
        S.d.a s3 = viewGroup != null ? S.u(viewGroup, abstractComponentCallbacksC0459p3.z()).s(this) : null;
        if (s3 == S.d.a.ADDING) {
            i3 = Math.min(i3, 6);
        } else if (s3 == S.d.a.REMOVING) {
            i3 = Math.max(i3, 3);
        } else {
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p4 = this.f6470c;
            if (abstractComponentCallbacksC0459p4.f6728p) {
                i3 = abstractComponentCallbacksC0459p4.S() ? Math.min(i3, 1) : Math.min(i3, -1);
            }
        }
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p5 = this.f6470c;
        if (abstractComponentCallbacksC0459p5.f6699M && abstractComponentCallbacksC0459p5.f6717e < 5) {
            i3 = Math.min(i3, 4);
        }
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p6 = this.f6470c;
        if (abstractComponentCallbacksC0459p6.f6729q && abstractComponentCallbacksC0459p6.f6697K != null) {
            i3 = Math.max(i3, 3);
        }
        if (B.v0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i3 + " for " + this.f6470c);
        }
        return i3;
    }

    public void e() {
        if (B.v0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f6470c);
        }
        Bundle bundle = this.f6470c.f6718f;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6470c;
        if (abstractComponentCallbacksC0459p.f6705S) {
            abstractComponentCallbacksC0459p.f6717e = 1;
            abstractComponentCallbacksC0459p.P0();
        } else {
            this.f6468a.g(abstractComponentCallbacksC0459p, bundle2, false);
            this.f6470c.v0(bundle2);
            this.f6468a.c(this.f6470c, bundle2, false);
        }
    }

    public void f() {
        String str;
        if (this.f6470c.f6731s) {
            return;
        }
        if (B.v0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f6470c);
        }
        Bundle bundle = this.f6470c.f6718f;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater A02 = this.f6470c.A0(bundle2);
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6470c;
        ViewGroup viewGroup2 = abstractComponentCallbacksC0459p.f6697K;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i3 = abstractComponentCallbacksC0459p.f6688B;
            if (i3 != 0) {
                if (i3 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f6470c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0459p.f6736x.g0().a(this.f6470c.f6688B);
                if (viewGroup == null) {
                    AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = this.f6470c;
                    if (!abstractComponentCallbacksC0459p2.f6733u) {
                        try {
                            str = abstractComponentCallbacksC0459p2.F().getResourceName(this.f6470c.f6688B);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f6470c.f6688B) + " (" + str + ") for fragment " + this.f6470c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0470c.g(this.f6470c, viewGroup);
                }
            }
        }
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p3 = this.f6470c;
        abstractComponentCallbacksC0459p3.f6697K = viewGroup;
        abstractComponentCallbacksC0459p3.x0(A02, viewGroup, bundle2);
        if (this.f6470c.f6698L != null) {
            if (B.v0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f6470c);
            }
            this.f6470c.f6698L.setSaveFromParentEnabled(false);
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p4 = this.f6470c;
            abstractComponentCallbacksC0459p4.f6698L.setTag(AbstractC0438b.f6365a, abstractComponentCallbacksC0459p4);
            if (viewGroup != null) {
                b();
            }
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p5 = this.f6470c;
            if (abstractComponentCallbacksC0459p5.f6690D) {
                abstractComponentCallbacksC0459p5.f6698L.setVisibility(8);
            }
            if (this.f6470c.f6698L.isAttachedToWindow()) {
                K.O.g0(this.f6470c.f6698L);
            } else {
                View view = this.f6470c.f6698L;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f6470c.K0();
            w wVar = this.f6468a;
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p6 = this.f6470c;
            wVar.l(abstractComponentCallbacksC0459p6, abstractComponentCallbacksC0459p6.f6698L, bundle2, false);
            int visibility = this.f6470c.f6698L.getVisibility();
            this.f6470c.X0(this.f6470c.f6698L.getAlpha());
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p7 = this.f6470c;
            if (abstractComponentCallbacksC0459p7.f6697K != null && visibility == 0) {
                View findFocus = abstractComponentCallbacksC0459p7.f6698L.findFocus();
                if (findFocus != null) {
                    this.f6470c.U0(findFocus);
                    if (B.v0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f6470c);
                    }
                }
                this.f6470c.f6698L.setAlpha(0.0f);
            }
        }
        this.f6470c.f6717e = 2;
    }

    public void g() {
        AbstractComponentCallbacksC0459p e3;
        if (B.v0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f6470c);
        }
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6470c;
        boolean z3 = abstractComponentCallbacksC0459p.f6728p && !abstractComponentCallbacksC0459p.S();
        if (z3) {
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = this.f6470c;
            if (!abstractComponentCallbacksC0459p2.f6730r) {
                this.f6469b.z(abstractComponentCallbacksC0459p2.f6721i, null);
            }
        }
        if (z3 || this.f6469b.n().n(this.f6470c)) {
            this.f6470c.getClass();
            throw null;
        }
        String str = this.f6470c.f6724l;
        if (str != null && (e3 = this.f6469b.e(str)) != null && e3.f6692F) {
            this.f6470c.f6723k = e3;
        }
        this.f6470c.f6717e = 0;
    }

    public void h() {
        View view;
        if (B.v0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f6470c);
        }
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6470c;
        ViewGroup viewGroup = abstractComponentCallbacksC0459p.f6697K;
        if (viewGroup != null && (view = abstractComponentCallbacksC0459p.f6698L) != null) {
            viewGroup.removeView(view);
        }
        this.f6470c.y0();
        this.f6468a.m(this.f6470c, false);
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = this.f6470c;
        abstractComponentCallbacksC0459p2.f6697K = null;
        abstractComponentCallbacksC0459p2.f6698L = null;
        abstractComponentCallbacksC0459p2.f6709W = null;
        abstractComponentCallbacksC0459p2.f6710X.e(null);
        this.f6470c.f6732t = false;
    }

    public void i() {
        if (B.v0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f6470c);
        }
        this.f6470c.z0();
        this.f6468a.d(this.f6470c, false);
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6470c;
        abstractComponentCallbacksC0459p.f6717e = -1;
        abstractComponentCallbacksC0459p.getClass();
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = this.f6470c;
        abstractComponentCallbacksC0459p2.f6738z = null;
        abstractComponentCallbacksC0459p2.f6736x = null;
        if ((!abstractComponentCallbacksC0459p2.f6728p || abstractComponentCallbacksC0459p2.S()) && !this.f6469b.n().n(this.f6470c)) {
            return;
        }
        if (B.v0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f6470c);
        }
        this.f6470c.P();
    }

    public void j() {
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6470c;
        if (abstractComponentCallbacksC0459p.f6731s && abstractComponentCallbacksC0459p.f6732t && !abstractComponentCallbacksC0459p.f6734v) {
            if (B.v0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f6470c);
            }
            Bundle bundle = this.f6470c.f6718f;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = this.f6470c;
            abstractComponentCallbacksC0459p2.x0(abstractComponentCallbacksC0459p2.A0(bundle2), null, bundle2);
            View view = this.f6470c.f6698L;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p3 = this.f6470c;
                abstractComponentCallbacksC0459p3.f6698L.setTag(AbstractC0438b.f6365a, abstractComponentCallbacksC0459p3);
                AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p4 = this.f6470c;
                if (abstractComponentCallbacksC0459p4.f6690D) {
                    abstractComponentCallbacksC0459p4.f6698L.setVisibility(8);
                }
                this.f6470c.K0();
                w wVar = this.f6468a;
                AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p5 = this.f6470c;
                wVar.l(abstractComponentCallbacksC0459p5, abstractComponentCallbacksC0459p5.f6698L, bundle2, false);
                this.f6470c.f6717e = 2;
            }
        }
    }

    public AbstractComponentCallbacksC0459p k() {
        return this.f6470c;
    }

    public final boolean l(View view) {
        if (view == this.f6470c.f6698L) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f6470c.f6698L) {
                return true;
            }
        }
        return false;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f6471d) {
            if (B.v0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f6471d = true;
            boolean z3 = false;
            while (true) {
                int d3 = d();
                AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6470c;
                int i3 = abstractComponentCallbacksC0459p.f6717e;
                if (d3 == i3) {
                    if (!z3 && i3 == -1 && abstractComponentCallbacksC0459p.f6728p && !abstractComponentCallbacksC0459p.S() && !this.f6470c.f6730r) {
                        if (B.v0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f6470c);
                        }
                        this.f6469b.n().e(this.f6470c, true);
                        this.f6469b.q(this);
                        if (B.v0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f6470c);
                        }
                        this.f6470c.P();
                    }
                    AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = this.f6470c;
                    if (abstractComponentCallbacksC0459p2.f6703Q) {
                        if (abstractComponentCallbacksC0459p2.f6698L != null && (viewGroup = abstractComponentCallbacksC0459p2.f6697K) != null) {
                            S u3 = S.u(viewGroup, abstractComponentCallbacksC0459p2.z());
                            if (this.f6470c.f6690D) {
                                u3.k(this);
                            } else {
                                u3.m(this);
                            }
                        }
                        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p3 = this.f6470c;
                        B b3 = abstractComponentCallbacksC0459p3.f6736x;
                        if (b3 != null) {
                            b3.t0(abstractComponentCallbacksC0459p3);
                        }
                        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p4 = this.f6470c;
                        abstractComponentCallbacksC0459p4.f6703Q = false;
                        abstractComponentCallbacksC0459p4.g0(abstractComponentCallbacksC0459p4.f6690D);
                        this.f6470c.f6737y.B();
                    }
                    this.f6471d = false;
                    return;
                }
                if (d3 <= i3) {
                    switch (i3 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (abstractComponentCallbacksC0459p.f6730r && this.f6469b.o(abstractComponentCallbacksC0459p.f6721i) == null) {
                                this.f6469b.z(this.f6470c.f6721i, p());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f6470c.f6717e = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0459p.f6732t = false;
                            abstractComponentCallbacksC0459p.f6717e = 2;
                            break;
                        case 3:
                            if (B.v0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f6470c);
                            }
                            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p5 = this.f6470c;
                            if (abstractComponentCallbacksC0459p5.f6730r) {
                                this.f6469b.z(abstractComponentCallbacksC0459p5.f6721i, p());
                            } else if (abstractComponentCallbacksC0459p5.f6698L != null && abstractComponentCallbacksC0459p5.f6719g == null) {
                                q();
                            }
                            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p6 = this.f6470c;
                            if (abstractComponentCallbacksC0459p6.f6698L != null && (viewGroup2 = abstractComponentCallbacksC0459p6.f6697K) != null) {
                                S.u(viewGroup2, abstractComponentCallbacksC0459p6.z()).l(this);
                            }
                            this.f6470c.f6717e = 3;
                            break;
                        case 4:
                            t();
                            break;
                        case 5:
                            abstractComponentCallbacksC0459p.f6717e = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i3 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0459p.f6698L != null && (viewGroup3 = abstractComponentCallbacksC0459p.f6697K) != null) {
                                S.u(viewGroup3, abstractComponentCallbacksC0459p.z()).j(S.d.b.g(this.f6470c.f6698L.getVisibility()), this);
                            }
                            this.f6470c.f6717e = 4;
                            break;
                        case 5:
                            s();
                            break;
                        case 6:
                            abstractComponentCallbacksC0459p.f6717e = 6;
                            break;
                        case 7:
                            o();
                            break;
                    }
                }
                z3 = true;
            }
        } catch (Throwable th) {
            this.f6471d = false;
            throw th;
        }
    }

    public void n() {
        if (B.v0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f6470c);
        }
        this.f6470c.D0();
        this.f6468a.e(this.f6470c, false);
    }

    public void o() {
        if (B.v0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f6470c);
        }
        View u3 = this.f6470c.u();
        if (u3 != null && l(u3)) {
            boolean requestFocus = u3.requestFocus();
            if (B.v0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(u3);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f6470c);
                sb.append(" resulting in focused view ");
                sb.append(this.f6470c.f6698L.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f6470c.U0(null);
        this.f6470c.G0();
        this.f6468a.h(this.f6470c, false);
        this.f6469b.z(this.f6470c.f6721i, null);
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6470c;
        abstractComponentCallbacksC0459p.f6718f = null;
        abstractComponentCallbacksC0459p.f6719g = null;
        abstractComponentCallbacksC0459p.f6720h = null;
    }

    public Bundle p() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = this.f6470c;
        if (abstractComponentCallbacksC0459p.f6717e == -1 && (bundle = abstractComponentCallbacksC0459p.f6718f) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new G(this.f6470c));
        if (this.f6470c.f6717e > -1) {
            Bundle bundle3 = new Bundle();
            this.f6470c.H0(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f6468a.i(this.f6470c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f6470c.f6712Z.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle T02 = this.f6470c.f6737y.T0();
            if (!T02.isEmpty()) {
                bundle2.putBundle("childFragmentManager", T02);
            }
            if (this.f6470c.f6698L != null) {
                q();
            }
            SparseArray<? extends Parcelable> sparseArray = this.f6470c.f6719g;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f6470c.f6720h;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f6470c.f6722j;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public void q() {
        if (this.f6470c.f6698L == null) {
            return;
        }
        if (B.v0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f6470c + " with view " + this.f6470c.f6698L);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f6470c.f6698L.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f6470c.f6719g = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f6470c.f6709W.g(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f6470c.f6720h = bundle;
    }

    public void r(int i3) {
        this.f6472e = i3;
    }

    public void s() {
        if (B.v0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f6470c);
        }
        this.f6470c.I0();
        this.f6468a.j(this.f6470c, false);
    }

    public void t() {
        if (B.v0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f6470c);
        }
        this.f6470c.J0();
        this.f6468a.k(this.f6470c, false);
    }

    public H(w wVar, I i3, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, Bundle bundle) {
        this.f6468a = wVar;
        this.f6469b = i3;
        this.f6470c = abstractComponentCallbacksC0459p;
        abstractComponentCallbacksC0459p.f6719g = null;
        abstractComponentCallbacksC0459p.f6720h = null;
        abstractComponentCallbacksC0459p.f6735w = 0;
        abstractComponentCallbacksC0459p.f6732t = false;
        abstractComponentCallbacksC0459p.f6727o = false;
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = abstractComponentCallbacksC0459p.f6723k;
        abstractComponentCallbacksC0459p.f6724l = abstractComponentCallbacksC0459p2 != null ? abstractComponentCallbacksC0459p2.f6721i : null;
        abstractComponentCallbacksC0459p.f6723k = null;
        abstractComponentCallbacksC0459p.f6718f = bundle;
        abstractComponentCallbacksC0459p.f6722j = bundle.getBundle("arguments");
    }

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ View f6473e;

        public a(View view) {
            this.f6473e = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f6473e.removeOnAttachStateChangeListener(this);
            K.O.g0(this.f6473e);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}

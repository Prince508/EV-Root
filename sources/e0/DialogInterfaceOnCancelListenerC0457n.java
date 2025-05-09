package e0;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import b.DialogC0359g;

/* renamed from: e0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0457n extends AbstractComponentCallbacksC0459p implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: f0, reason: collision with root package name */
    public Handler f6663f0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f6672o0;

    /* renamed from: q0, reason: collision with root package name */
    public Dialog f6674q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f6675r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f6676s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f6677t0;

    /* renamed from: g0, reason: collision with root package name */
    public Runnable f6664g0 = new a();

    /* renamed from: h0, reason: collision with root package name */
    public DialogInterface.OnCancelListener f6665h0 = new b();

    /* renamed from: i0, reason: collision with root package name */
    public DialogInterface.OnDismissListener f6666i0 = new c();

    /* renamed from: j0, reason: collision with root package name */
    public int f6667j0 = 0;

    /* renamed from: k0, reason: collision with root package name */
    public int f6668k0 = 0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f6669l0 = true;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f6670m0 = true;

    /* renamed from: n0, reason: collision with root package name */
    public int f6671n0 = -1;

    /* renamed from: p0, reason: collision with root package name */
    public androidx.lifecycle.r f6673p0 = new d();

    /* renamed from: u0, reason: collision with root package name */
    public boolean f6678u0 = false;

    /* renamed from: e0.n$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC0457n.this.f6666i0.onDismiss(DialogInterfaceOnCancelListenerC0457n.this.f6674q0);
        }
    }

    /* renamed from: e0.n$b */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0457n.this.f6674q0 != null) {
                DialogInterfaceOnCancelListenerC0457n dialogInterfaceOnCancelListenerC0457n = DialogInterfaceOnCancelListenerC0457n.this;
                dialogInterfaceOnCancelListenerC0457n.onCancel(dialogInterfaceOnCancelListenerC0457n.f6674q0);
            }
        }
    }

    /* renamed from: e0.n$c */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC0457n.this.f6674q0 != null) {
                DialogInterfaceOnCancelListenerC0457n dialogInterfaceOnCancelListenerC0457n = DialogInterfaceOnCancelListenerC0457n.this;
                dialogInterfaceOnCancelListenerC0457n.onDismiss(dialogInterfaceOnCancelListenerC0457n.f6674q0);
            }
        }
    }

    /* renamed from: e0.n$d */
    public class d implements androidx.lifecycle.r {
        public d() {
        }

        @Override // androidx.lifecycle.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.lifecycle.l lVar) {
            if (lVar == null || !DialogInterfaceOnCancelListenerC0457n.this.f6670m0) {
                return;
            }
            View O02 = DialogInterfaceOnCancelListenerC0457n.this.O0();
            if (O02.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC0457n.this.f6674q0 != null) {
                if (B.v0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC0457n.this.f6674q0);
                }
                DialogInterfaceOnCancelListenerC0457n.this.f6674q0.setContentView(O02);
            }
        }
    }

    /* renamed from: e0.n$e */
    public class e extends AbstractC0461s {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0461s f6683a;

        public e(AbstractC0461s abstractC0461s) {
            this.f6683a = abstractC0461s;
        }

        @Override // e0.AbstractC0461s
        public View a(int i3) {
            return this.f6683a.b() ? this.f6683a.a(i3) : DialogInterfaceOnCancelListenerC0457n.this.h1(i3);
        }

        @Override // e0.AbstractC0461s
        public boolean b() {
            return this.f6683a.b() || DialogInterfaceOnCancelListenerC0457n.this.i1();
        }
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public void W(Bundle bundle) {
        super.W(bundle);
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public void X(Bundle bundle) {
        super.X(bundle);
        this.f6663f0 = new Handler();
        this.f6670m0 = this.f6688B == 0;
        if (bundle != null) {
            this.f6667j0 = bundle.getInt("android:style", 0);
            this.f6668k0 = bundle.getInt("android:theme", 0);
            this.f6669l0 = bundle.getBoolean("android:cancelable", true);
            this.f6670m0 = bundle.getBoolean("android:showsDialog", this.f6670m0);
            this.f6671n0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public AbstractC0461s d() {
        return new e(super.d());
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public void d0() {
        super.d0();
        Dialog dialog = this.f6674q0;
        if (dialog != null) {
            this.f6675r0 = true;
            dialog.setOnDismissListener(null);
            this.f6674q0.dismiss();
            if (!this.f6676s0) {
                onDismiss(this.f6674q0);
            }
            this.f6674q0 = null;
            this.f6678u0 = false;
        }
    }

    public final void d1(boolean z3, boolean z4, boolean z5) {
        if (this.f6676s0) {
            return;
        }
        this.f6676s0 = true;
        this.f6677t0 = false;
        Dialog dialog = this.f6674q0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f6674q0.dismiss();
            if (!z4) {
                if (Looper.myLooper() == this.f6663f0.getLooper()) {
                    onDismiss(this.f6674q0);
                } else {
                    this.f6663f0.post(this.f6664g0);
                }
            }
        }
        this.f6675r0 = true;
        if (this.f6671n0 >= 0) {
            if (z5) {
                z().J0(this.f6671n0, 1);
            } else {
                z().H0(this.f6671n0, 1, z3);
            }
            this.f6671n0 = -1;
            return;
        }
        J l3 = z().l();
        l3.n(true);
        l3.k(this);
        if (z5) {
            l3.g();
        } else if (z3) {
            l3.f();
        } else {
            l3.e();
        }
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public void e0() {
        super.e0();
        if (!this.f6677t0 && !this.f6676s0) {
            this.f6676s0 = true;
        }
        N().d(this.f6673p0);
    }

    public Dialog e1() {
        return this.f6674q0;
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public LayoutInflater f0(Bundle bundle) {
        LayoutInflater f02 = super.f0(bundle);
        if (this.f6670m0 && !this.f6672o0) {
            j1(bundle);
            if (B.v0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f6674q0;
            if (dialog != null) {
                return f02.cloneInContext(dialog.getContext());
            }
        } else if (B.v0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f6670m0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return f02;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return f02;
    }

    public int f1() {
        return this.f6668k0;
    }

    public Dialog g1(Bundle bundle) {
        if (B.v0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0359g(N0(), f1());
    }

    public View h1(int i3) {
        Dialog dialog = this.f6674q0;
        if (dialog != null) {
            return dialog.findViewById(i3);
        }
        return null;
    }

    public boolean i1() {
        return this.f6678u0;
    }

    public final void j1(Bundle bundle) {
        if (this.f6670m0 && !this.f6678u0) {
            try {
                this.f6672o0 = true;
                Dialog g12 = g1(bundle);
                this.f6674q0 = g12;
                if (this.f6670m0) {
                    l1(g12, this.f6667j0);
                    Context n3 = n();
                    if (n3 instanceof Activity) {
                        this.f6674q0.setOwnerActivity((Activity) n3);
                    }
                    this.f6674q0.setCancelable(this.f6669l0);
                    this.f6674q0.setOnCancelListener(this.f6665h0);
                    this.f6674q0.setOnDismissListener(this.f6666i0);
                    this.f6678u0 = true;
                } else {
                    this.f6674q0 = null;
                }
                this.f6672o0 = false;
            } catch (Throwable th) {
                this.f6672o0 = false;
                throw th;
            }
        }
    }

    public final Dialog k1() {
        Dialog e12 = e1();
        if (e12 != null) {
            return e12;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void l1(Dialog dialog, int i3) {
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public void n0(Bundle bundle) {
        super.n0(bundle);
        Dialog dialog = this.f6674q0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i3 = this.f6667j0;
        if (i3 != 0) {
            bundle.putInt("android:style", i3);
        }
        int i4 = this.f6668k0;
        if (i4 != 0) {
            bundle.putInt("android:theme", i4);
        }
        boolean z3 = this.f6669l0;
        if (!z3) {
            bundle.putBoolean("android:cancelable", z3);
        }
        boolean z4 = this.f6670m0;
        if (!z4) {
            bundle.putBoolean("android:showsDialog", z4);
        }
        int i5 = this.f6671n0;
        if (i5 != -1) {
            bundle.putInt("android:backStackId", i5);
        }
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public void o0() {
        super.o0();
        Dialog dialog = this.f6674q0;
        if (dialog != null) {
            this.f6675r0 = false;
            dialog.show();
            View decorView = this.f6674q0.getWindow().getDecorView();
            androidx.lifecycle.I.a(decorView, this);
            androidx.lifecycle.J.a(decorView, this);
            o0.g.a(decorView, this);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f6675r0) {
            return;
        }
        if (B.v0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        d1(true, true, false);
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public void p0() {
        super.p0();
        Dialog dialog = this.f6674q0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public void r0(Bundle bundle) {
        Bundle bundle2;
        super.r0(bundle);
        if (this.f6674q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f6674q0.onRestoreInstanceState(bundle2);
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public void x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.x0(layoutInflater, viewGroup, bundle);
        if (this.f6698L != null || this.f6674q0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f6674q0.onRestoreInstanceState(bundle2);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}

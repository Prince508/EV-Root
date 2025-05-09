package b;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0347h;
import androidx.lifecycle.I;
import o0.C0643d;
import o0.C0644e;

/* renamed from: b.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogC0359g extends Dialog implements androidx.lifecycle.l, k, o0.f {

    /* renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.m f4671e;

    /* renamed from: f, reason: collision with root package name */
    public final C0644e f4672f;

    /* renamed from: g, reason: collision with root package name */
    public final C0361i f4673g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0359g(Context context, int i3) {
        super(context, i3);
        C2.k.e(context, "context");
        this.f4672f = C0644e.f8777d.a(this);
        this.f4673g = new C0361i(new Runnable() { // from class: b.f
            @Override // java.lang.Runnable
            public final void run() {
                DialogC0359g.d(DialogC0359g.this);
            }
        });
    }

    public static final void d(DialogC0359g dialogC0359g) {
        C2.k.e(dialogC0359g, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C2.k.e(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.m b() {
        androidx.lifecycle.m mVar = this.f4671e;
        if (mVar != null) {
            return mVar;
        }
        androidx.lifecycle.m mVar2 = new androidx.lifecycle.m(this);
        this.f4671e = mVar2;
        return mVar2;
    }

    public void c() {
        Window window = getWindow();
        C2.k.b(window);
        View decorView = window.getDecorView();
        C2.k.d(decorView, "window!!.decorView");
        I.a(decorView, this);
        Window window2 = getWindow();
        C2.k.b(window2);
        View decorView2 = window2.getDecorView();
        C2.k.d(decorView2, "window!!.decorView");
        m.a(decorView2, this);
        Window window3 = getWindow();
        C2.k.b(window3);
        View decorView3 = window3.getDecorView();
        C2.k.d(decorView3, "window!!.decorView");
        o0.g.a(decorView3, this);
    }

    @Override // androidx.lifecycle.l
    public AbstractC0347h h() {
        return b();
    }

    @Override // b.k
    public final C0361i l() {
        return this.f4673g;
    }

    @Override // o0.f
    public C0643d m() {
        return this.f4672f.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f4673g.e();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C0361i c0361i = this.f4673g;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            C2.k.d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            c0361i.h(onBackInvokedDispatcher);
        }
        this.f4672f.d(bundle);
        b().h(AbstractC0347h.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        C2.k.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f4672f.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().h(AbstractC0347h.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().h(AbstractC0347h.a.ON_DESTROY);
        this.f4671e = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i3) {
        c();
        super.setContentView(i3);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        C2.k.e(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C2.k.e(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}

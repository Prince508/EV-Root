package com.google.android.material.datepicker;

import K.C;
import K.C0205k0;
import K.O;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import e0.DialogInterfaceOnCancelListenerC0457n;
import e0.J;
import e1.AbstractC0464a;
import f.AbstractC0467a;
import j.AbstractC0515e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import n1.ViewOnTouchListenerC0609a;
import r1.AbstractC0680c;
import u1.AbstractC0739b;

/* loaded from: classes.dex */
public final class k<S> extends DialogInterfaceOnCancelListenerC0457n {

    /* renamed from: X0, reason: collision with root package name */
    public static final Object f5364X0 = "CONFIRM_BUTTON_TAG";

    /* renamed from: Y0, reason: collision with root package name */
    public static final Object f5365Y0 = "CANCEL_BUTTON_TAG";

    /* renamed from: Z0, reason: collision with root package name */
    public static final Object f5366Z0 = "TOGGLE_BUTTON_TAG";

    /* renamed from: A0, reason: collision with root package name */
    public q f5367A0;

    /* renamed from: B0, reason: collision with root package name */
    public com.google.android.material.datepicker.a f5368B0;

    /* renamed from: C0, reason: collision with root package name */
    public i f5369C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f5370D0;

    /* renamed from: E0, reason: collision with root package name */
    public CharSequence f5371E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f5372F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f5373G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f5374H0;

    /* renamed from: I0, reason: collision with root package name */
    public CharSequence f5375I0;

    /* renamed from: J0, reason: collision with root package name */
    public int f5376J0;

    /* renamed from: K0, reason: collision with root package name */
    public CharSequence f5377K0;

    /* renamed from: L0, reason: collision with root package name */
    public int f5378L0;

    /* renamed from: M0, reason: collision with root package name */
    public CharSequence f5379M0;

    /* renamed from: N0, reason: collision with root package name */
    public int f5380N0;

    /* renamed from: O0, reason: collision with root package name */
    public CharSequence f5381O0;

    /* renamed from: P0, reason: collision with root package name */
    public TextView f5382P0;

    /* renamed from: Q0, reason: collision with root package name */
    public TextView f5383Q0;

    /* renamed from: R0, reason: collision with root package name */
    public CheckableImageButton f5384R0;

    /* renamed from: S0, reason: collision with root package name */
    public x1.g f5385S0;

    /* renamed from: T0, reason: collision with root package name */
    public Button f5386T0;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f5387U0;

    /* renamed from: V0, reason: collision with root package name */
    public CharSequence f5388V0;

    /* renamed from: W0, reason: collision with root package name */
    public CharSequence f5389W0;

    /* renamed from: v0, reason: collision with root package name */
    public final LinkedHashSet f5390v0 = new LinkedHashSet();

    /* renamed from: w0, reason: collision with root package name */
    public final LinkedHashSet f5391w0 = new LinkedHashSet();

    /* renamed from: x0, reason: collision with root package name */
    public final LinkedHashSet f5392x0 = new LinkedHashSet();

    /* renamed from: y0, reason: collision with root package name */
    public final LinkedHashSet f5393y0 = new LinkedHashSet();

    /* renamed from: z0, reason: collision with root package name */
    public int f5394z0;

    public class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f5395a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f5396b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f5397c;

        public a(int i3, View view, int i4) {
            this.f5395a = i3;
            this.f5396b = view;
            this.f5397c = i4;
        }

        @Override // K.C
        public C0205k0 a(View view, C0205k0 c0205k0) {
            int i3 = c0205k0.f(C0205k0.m.h()).f129b;
            if (this.f5395a >= 0) {
                this.f5396b.getLayoutParams().height = this.f5395a + i3;
                View view2 = this.f5396b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f5396b;
            view3.setPadding(view3.getPaddingLeft(), this.f5397c + i3, this.f5396b.getPaddingRight(), this.f5396b.getPaddingBottom());
            return c0205k0;
        }
    }

    public class b extends p {
        public b() {
        }
    }

    public static /* synthetic */ void m1(k kVar, View view) {
        kVar.p1();
        throw null;
    }

    public static Drawable n1(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AbstractC0467a.b(context, e1.d.f6866b));
        stateListDrawable.addState(new int[0], AbstractC0467a.b(context, e1.d.f6867c));
        return stateListDrawable;
    }

    private d p1() {
        AbstractC0515e.a(j().getParcelable("DATE_SELECTOR_KEY"));
        return null;
    }

    public static CharSequence q1(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] split = TextUtils.split(String.valueOf(charSequence), "\n");
        return split.length > 1 ? split[0] : charSequence;
    }

    public static int t1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(e1.c.f6821G);
        int i3 = m.j().f5406h;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(e1.c.f6823I) * i3) + ((i3 - 1) * resources.getDimensionPixelOffset(e1.c.f6826L));
    }

    public static boolean w1(Context context) {
        return z1(context, R.attr.windowFullscreen);
    }

    public static boolean y1(Context context) {
        return z1(context, AbstractC0464a.f6778C);
    }

    public static boolean z1(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0739b.d(context, AbstractC0464a.f6798p, i.class.getCanonicalName()), new int[]{i3});
        boolean z3 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z3;
    }

    public final void A1() {
        int u12 = u1(N0());
        p1();
        i q12 = i.q1(null, u12, this.f5368B0, null);
        this.f5369C0 = q12;
        q qVar = q12;
        if (this.f5373G0 == 1) {
            p1();
            qVar = l.c1(null, u12, this.f5368B0);
        }
        this.f5367A0 = qVar;
        C1();
        B1(s1());
        J l3 = k().l();
        l3.l(e1.e.f6906v, this.f5367A0);
        l3.g();
        this.f5367A0.a1(new b());
    }

    public void B1(String str) {
        this.f5383Q0.setContentDescription(r1());
        this.f5383Q0.setText(str);
    }

    public final void C1() {
        this.f5382P0.setText((this.f5373G0 == 1 && x1()) ? this.f5389W0 : this.f5388V0);
    }

    public final void D1(CheckableImageButton checkableImageButton) {
        this.f5384R0.setContentDescription(this.f5373G0 == 1 ? checkableImageButton.getContext().getString(e1.h.f6943o) : checkableImageButton.getContext().getString(e1.h.f6945q));
    }

    @Override // e0.DialogInterfaceOnCancelListenerC0457n, e0.AbstractComponentCallbacksC0459p
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null) {
            bundle = j();
        }
        this.f5394z0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        AbstractC0515e.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f5368B0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC0515e.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f5370D0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f5371E0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f5373G0 = bundle.getInt("INPUT_MODE_KEY");
        this.f5374H0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f5375I0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f5376J0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f5377K0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f5378L0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f5379M0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f5380N0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f5381O0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f5371E0;
        if (charSequence == null) {
            charSequence = N0().getResources().getText(this.f5370D0);
        }
        this.f5388V0 = charSequence;
        this.f5389W0 = q1(charSequence);
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public final View b0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f5372F0 ? e1.g.f6928q : e1.g.f6927p, viewGroup);
        Context context = inflate.getContext();
        if (this.f5372F0) {
            inflate.findViewById(e1.e.f6906v).setLayoutParams(new LinearLayout.LayoutParams(t1(context), -2));
        } else {
            inflate.findViewById(e1.e.f6907w).setLayoutParams(new LinearLayout.LayoutParams(t1(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(e1.e.f6910z);
        this.f5383Q0 = textView;
        O.l0(textView, 1);
        this.f5384R0 = (CheckableImageButton) inflate.findViewById(e1.e.f6872A);
        this.f5382P0 = (TextView) inflate.findViewById(e1.e.f6873B);
        v1(context);
        this.f5386T0 = (Button) inflate.findViewById(e1.e.f6887c);
        p1();
        throw null;
    }

    @Override // e0.DialogInterfaceOnCancelListenerC0457n
    public final Dialog g1(Bundle bundle) {
        Dialog dialog = new Dialog(N0(), u1(N0()));
        Context context = dialog.getContext();
        this.f5372F0 = w1(context);
        int i3 = AbstractC0464a.f6798p;
        int i4 = e1.i.f6958j;
        this.f5385S0 = new x1.g(context, null, i3, i4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, e1.j.f7139t2, i3, i4);
        int color = obtainStyledAttributes.getColor(e1.j.f7143u2, 0);
        obtainStyledAttributes.recycle();
        this.f5385S0.J(context);
        this.f5385S0.T(ColorStateList.valueOf(color));
        this.f5385S0.S(O.r(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // e0.DialogInterfaceOnCancelListenerC0457n, e0.AbstractComponentCallbacksC0459p
    public final void n0(Bundle bundle) {
        super.n0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f5394z0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a.b bVar = new a.b(this.f5368B0);
        i iVar = this.f5369C0;
        m l12 = iVar == null ? null : iVar.l1();
        if (l12 != null) {
            bVar.b(l12.f5408j);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f5370D0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f5371E0);
        bundle.putInt("INPUT_MODE_KEY", this.f5373G0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f5374H0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f5375I0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f5376J0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f5377K0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f5378L0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f5379M0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f5380N0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f5381O0);
    }

    @Override // e0.DialogInterfaceOnCancelListenerC0457n, e0.AbstractComponentCallbacksC0459p
    public void o0() {
        super.o0();
        Window window = k1().getWindow();
        if (this.f5372F0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f5385S0);
            o1(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = F().getDimensionPixelOffset(e1.c.f6825K);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f5385S0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC0609a(k1(), rect));
        }
        A1();
    }

    public final void o1(Window window) {
        if (this.f5387U0) {
            return;
        }
        View findViewById = O0().findViewById(e1.e.f6890f);
        AbstractC0680c.a(window, true, r1.n.d(findViewById), null);
        O.v0(findViewById, new a(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.f5387U0 = true;
    }

    @Override // e0.DialogInterfaceOnCancelListenerC0457n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f5392x0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // e0.DialogInterfaceOnCancelListenerC0457n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f5393y0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) M();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // e0.DialogInterfaceOnCancelListenerC0457n, e0.AbstractComponentCallbacksC0459p
    public void p0() {
        this.f5367A0.b1();
        super.p0();
    }

    public final String r1() {
        p1();
        N0();
        throw null;
    }

    public String s1() {
        p1();
        n();
        throw null;
    }

    public final int u1(Context context) {
        int i3 = this.f5394z0;
        if (i3 != 0) {
            return i3;
        }
        p1();
        throw null;
    }

    public final void v1(Context context) {
        this.f5384R0.setTag(f5366Z0);
        this.f5384R0.setImageDrawable(n1(context));
        this.f5384R0.setChecked(this.f5373G0 != 0);
        O.j0(this.f5384R0, null);
        D1(this.f5384R0);
        this.f5384R0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k.m1(k.this, view);
            }
        });
    }

    public final boolean x1() {
        return F().getConfiguration().orientation == 2;
    }
}

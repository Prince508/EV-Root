package com.google.android.material.datepicker;

import K.C0184a;
import K.O;
import L.x;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import j.AbstractC0515e;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class i<S> extends q {

    /* renamed from: r0, reason: collision with root package name */
    public static final Object f5326r0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: s0, reason: collision with root package name */
    public static final Object f5327s0 = "NAVIGATION_PREV_TAG";

    /* renamed from: t0, reason: collision with root package name */
    public static final Object f5328t0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: u0, reason: collision with root package name */
    public static final Object f5329u0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: g0, reason: collision with root package name */
    public int f5330g0;

    /* renamed from: h0, reason: collision with root package name */
    public com.google.android.material.datepicker.a f5331h0;

    /* renamed from: i0, reason: collision with root package name */
    public com.google.android.material.datepicker.m f5332i0;

    /* renamed from: j0, reason: collision with root package name */
    public l f5333j0;

    /* renamed from: k0, reason: collision with root package name */
    public com.google.android.material.datepicker.c f5334k0;

    /* renamed from: l0, reason: collision with root package name */
    public RecyclerView f5335l0;

    /* renamed from: m0, reason: collision with root package name */
    public RecyclerView f5336m0;

    /* renamed from: n0, reason: collision with root package name */
    public View f5337n0;

    /* renamed from: o0, reason: collision with root package name */
    public View f5338o0;

    /* renamed from: p0, reason: collision with root package name */
    public View f5339p0;

    /* renamed from: q0, reason: collision with root package name */
    public View f5340q0;

    public class a implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o f5341e;

        public a(o oVar) {
            this.f5341e = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int g22 = i.this.p1().g2() - 1;
            if (g22 >= 0) {
                i.this.s1(this.f5341e.u(g22));
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f5343e;

        public b(int i3) {
            this.f5343e = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f5336m0.n1(this.f5343e);
        }
    }

    public class c extends C0184a {
        public c() {
        }

        @Override // K.C0184a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.l0(null);
        }
    }

    public class d extends r {

        /* renamed from: I, reason: collision with root package name */
        public final /* synthetic */ int f5346I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, int i3, boolean z3, int i4) {
            super(context, i3, z3);
            this.f5346I = i4;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void Q1(RecyclerView.z zVar, int[] iArr) {
            if (this.f5346I == 0) {
                iArr[0] = i.this.f5336m0.getWidth();
                iArr[1] = i.this.f5336m0.getWidth();
            } else {
                iArr[0] = i.this.f5336m0.getHeight();
                iArr[1] = i.this.f5336m0.getHeight();
            }
        }
    }

    public class e implements m {
        public e() {
        }

        @Override // com.google.android.material.datepicker.i.m
        public void a(long j3) {
            if (i.this.f5331h0.h().c(j3)) {
                i.e1(i.this);
                throw null;
            }
        }
    }

    public class f extends C0184a {
        public f() {
        }

        @Override // K.C0184a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.B0(false);
        }
    }

    public class g extends RecyclerView.n {

        /* renamed from: a, reason: collision with root package name */
        public final Calendar f5350a = t.i();

        /* renamed from: b, reason: collision with root package name */
        public final Calendar f5351b = t.i();

        public g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if ((recyclerView.getAdapter() instanceof u) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                i.e1(i.this);
                throw null;
            }
        }
    }

    public class h extends C0184a {
        public h() {
        }

        @Override // K.C0184a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.t0(i.this.f5340q0.getVisibility() == 0 ? i.this.L(e1.h.f6946r) : i.this.L(e1.h.f6944p));
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$i, reason: collision with other inner class name */
    public class C0109i extends RecyclerView.s {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f5354a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MaterialButton f5355b;

        public C0109i(o oVar, MaterialButton materialButton) {
            this.f5354a = oVar;
            this.f5355b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(RecyclerView recyclerView, int i3) {
            if (i3 == 0) {
                recyclerView.announceForAccessibility(this.f5355b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i3, int i4) {
            int d22 = i3 < 0 ? i.this.p1().d2() : i.this.p1().g2();
            i.this.f5332i0 = this.f5354a.u(d22);
            this.f5355b.setText(this.f5354a.v(d22));
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.v1();
        }
    }

    public class k implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o f5358e;

        public k(o oVar) {
            this.f5358e = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int d22 = i.this.p1().d2() + 1;
            if (d22 < i.this.f5336m0.getAdapter().c()) {
                i.this.s1(this.f5358e.u(d22));
            }
        }
    }

    public enum l {
        DAY,
        YEAR
    }

    public interface m {
        void a(long j3);
    }

    public static /* synthetic */ com.google.android.material.datepicker.d e1(i iVar) {
        iVar.getClass();
        return null;
    }

    public static int n1(Context context) {
        return context.getResources().getDimensionPixelSize(e1.c.f6822H);
    }

    public static int o1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(e1.c.f6829O) + resources.getDimensionPixelOffset(e1.c.f6830P) + resources.getDimensionPixelOffset(e1.c.f6828N);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(e1.c.f6824J);
        int i3 = n.f5410i;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(e1.c.f6822H) * i3) + ((i3 - 1) * resources.getDimensionPixelOffset(e1.c.f6827M)) + resources.getDimensionPixelOffset(e1.c.f6820F);
    }

    public static i q1(com.google.android.material.datepicker.d dVar, int i3, com.google.android.material.datepicker.a aVar, com.google.android.material.datepicker.g gVar) {
        i iVar = new i();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i3);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", gVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.l());
        iVar.T0(bundle);
        return iVar;
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null) {
            bundle = j();
        }
        this.f5330g0 = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC0515e.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f5331h0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC0515e.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f5332i0 = (com.google.android.material.datepicker.m) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // com.google.android.material.datepicker.q
    public boolean a1(p pVar) {
        return super.a1(pVar);
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public View b0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i3;
        int i4;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(n(), this.f5330g0);
        this.f5334k0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.m m3 = this.f5331h0.m();
        if (com.google.android.material.datepicker.k.w1(contextThemeWrapper)) {
            i3 = e1.g.f6925n;
            i4 = 1;
        } else {
            i3 = e1.g.f6923l;
            i4 = 0;
        }
        View inflate = cloneInContext.inflate(i3, viewGroup, false);
        inflate.setMinimumHeight(o1(N0()));
        GridView gridView = (GridView) inflate.findViewById(e1.e.f6905u);
        O.j0(gridView, new c());
        int j3 = this.f5331h0.j();
        gridView.setAdapter((ListAdapter) (j3 > 0 ? new com.google.android.material.datepicker.h(j3) : new com.google.android.material.datepicker.h()));
        gridView.setNumColumns(m3.f5406h);
        gridView.setEnabled(false);
        this.f5336m0 = (RecyclerView) inflate.findViewById(e1.e.f6908x);
        this.f5336m0.setLayoutManager(new d(n(), i4, false, i4));
        this.f5336m0.setTag(f5326r0);
        o oVar = new o(contextThemeWrapper, null, this.f5331h0, null, new e());
        this.f5336m0.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(e1.f.f6911a);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(e1.e.f6909y);
        this.f5335l0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f5335l0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f5335l0.setAdapter(new u(this));
            this.f5335l0.g(i1());
        }
        if (inflate.findViewById(e1.e.f6900p) != null) {
            h1(inflate, oVar);
        }
        if (!com.google.android.material.datepicker.k.w1(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.f5336m0);
        }
        this.f5336m0.f1(oVar.w(this.f5332i0));
        u1();
        return inflate;
    }

    public final void h1(View view, o oVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(e1.e.f6900p);
        materialButton.setTag(f5329u0);
        O.j0(materialButton, new h());
        View findViewById = view.findViewById(e1.e.f6902r);
        this.f5337n0 = findViewById;
        findViewById.setTag(f5327s0);
        View findViewById2 = view.findViewById(e1.e.f6901q);
        this.f5338o0 = findViewById2;
        findViewById2.setTag(f5328t0);
        this.f5339p0 = view.findViewById(e1.e.f6909y);
        this.f5340q0 = view.findViewById(e1.e.f6904t);
        t1(l.DAY);
        materialButton.setText(this.f5332i0.n());
        this.f5336m0.j(new C0109i(oVar, materialButton));
        materialButton.setOnClickListener(new j());
        this.f5338o0.setOnClickListener(new k(oVar));
        this.f5337n0.setOnClickListener(new a(oVar));
    }

    public final RecyclerView.n i1() {
        return new g();
    }

    public com.google.android.material.datepicker.a j1() {
        return this.f5331h0;
    }

    public com.google.android.material.datepicker.c k1() {
        return this.f5334k0;
    }

    public com.google.android.material.datepicker.m l1() {
        return this.f5332i0;
    }

    public com.google.android.material.datepicker.d m1() {
        return null;
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public void n0(Bundle bundle) {
        super.n0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f5330g0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5331h0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f5332i0);
    }

    public LinearLayoutManager p1() {
        return (LinearLayoutManager) this.f5336m0.getLayoutManager();
    }

    public final void r1(int i3) {
        this.f5336m0.post(new b(i3));
    }

    public void s1(com.google.android.material.datepicker.m mVar) {
        o oVar = (o) this.f5336m0.getAdapter();
        int w3 = oVar.w(mVar);
        int w4 = w3 - oVar.w(this.f5332i0);
        boolean z3 = Math.abs(w4) > 3;
        boolean z4 = w4 > 0;
        this.f5332i0 = mVar;
        if (z3 && z4) {
            this.f5336m0.f1(w3 - 3);
            r1(w3);
        } else if (!z3) {
            r1(w3);
        } else {
            this.f5336m0.f1(w3 + 3);
            r1(w3);
        }
    }

    public void t1(l lVar) {
        this.f5333j0 = lVar;
        if (lVar == l.YEAR) {
            this.f5335l0.getLayoutManager().B1(((u) this.f5335l0.getAdapter()).t(this.f5332i0.f5405g));
            this.f5339p0.setVisibility(0);
            this.f5340q0.setVisibility(8);
            this.f5337n0.setVisibility(8);
            this.f5338o0.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f5339p0.setVisibility(8);
            this.f5340q0.setVisibility(0);
            this.f5337n0.setVisibility(0);
            this.f5338o0.setVisibility(0);
            s1(this.f5332i0);
        }
    }

    public final void u1() {
        O.j0(this.f5336m0, new f());
    }

    public void v1() {
        l lVar = this.f5333j0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            t1(l.DAY);
        } else if (lVar == l.DAY) {
            t1(lVar2);
        }
    }
}

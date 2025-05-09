package com.google.android.material.datepicker;

import K.O;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.i;

/* loaded from: classes.dex */
public class o extends RecyclerView.g {

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.material.datepicker.a f5416c;

    /* renamed from: d, reason: collision with root package name */
    public final i.m f5417d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5418e;

    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MaterialCalendarGridView f5419e;

        public a(MaterialCalendarGridView materialCalendarGridView) {
            this.f5419e = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
            if (this.f5419e.getAdapter().p(i3)) {
                o.this.f5417d.a(this.f5419e.getAdapter().getItem(i3).longValue());
            }
        }
    }

    public static class b extends RecyclerView.C {

        /* renamed from: t, reason: collision with root package name */
        public final TextView f5421t;

        /* renamed from: u, reason: collision with root package name */
        public final MaterialCalendarGridView f5422u;

        public b(LinearLayout linearLayout, boolean z3) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(e1.e.f6903s);
            this.f5421t = textView;
            O.k0(textView, true);
            this.f5422u = (MaterialCalendarGridView) linearLayout.findViewById(e1.e.f6899o);
            if (z3) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public o(Context context, d dVar, com.google.android.material.datepicker.a aVar, g gVar, i.m mVar) {
        m m3 = aVar.m();
        m i3 = aVar.i();
        m l3 = aVar.l();
        if (m3.compareTo(l3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (l3.compareTo(i3) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f5418e = (n.f5410i * i.n1(context)) + (k.w1(context) ? i.n1(context) : 0);
        this.f5416c = aVar;
        this.f5417d = mVar;
        r(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f5416c.k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long d(int i3) {
        return this.f5416c.m().p(i3).o();
    }

    public m u(int i3) {
        return this.f5416c.m().p(i3);
    }

    public CharSequence v(int i3) {
        return u(i3).n();
    }

    public int w(m mVar) {
        return this.f5416c.m().q(mVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void i(b bVar, int i3) {
        m p3 = this.f5416c.m().p(i3);
        bVar.f5421t.setText(p3.n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f5422u.findViewById(e1.e.f6899o);
        if (materialCalendarGridView.getAdapter() == null || !p3.equals(materialCalendarGridView.getAdapter().f5412e)) {
            n nVar = new n(p3, null, this.f5416c, null);
            materialCalendarGridView.setNumColumns(p3.f5406h);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public b k(ViewGroup viewGroup, int i3) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(e1.g.f6924m, viewGroup, false);
        if (!k.w1(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f5418e));
        return new b(linearLayout, true);
    }
}

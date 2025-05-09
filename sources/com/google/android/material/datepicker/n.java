package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class n extends BaseAdapter {

    /* renamed from: i, reason: collision with root package name */
    public static final int f5410i = t.i().getMaximum(4);

    /* renamed from: j, reason: collision with root package name */
    public static final int f5411j = (t.i().getMaximum(5) + t.i().getMaximum(7)) - 1;

    /* renamed from: e, reason: collision with root package name */
    public final m f5412e;

    /* renamed from: f, reason: collision with root package name */
    public Collection f5413f;

    /* renamed from: g, reason: collision with root package name */
    public c f5414g;

    /* renamed from: h, reason: collision with root package name */
    public final a f5415h;

    public n(m mVar, d dVar, a aVar, g gVar) {
        this.f5412e = mVar;
        this.f5415h = aVar;
        this.f5413f = dVar.f();
    }

    public int a(int i3) {
        return b() + (i3 - 1);
    }

    public int b() {
        return this.f5412e.k(this.f5415h.j());
    }

    public final String c(Context context, long j3) {
        return e.a(context, j3, j(j3), i(j3), g(j3));
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i3) {
        if (i3 < b() || i3 > k()) {
            return null;
        }
        return Long.valueOf(this.f5412e.l(l(i3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    @Override // android.widget.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.f(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = e1.g.f6921j
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.m r8 = r5.f5412e
            int r2 = r8.f5407i
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.m(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.n.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void f(Context context) {
        if (this.f5414g == null) {
            this.f5414g = new c(context);
        }
    }

    public boolean g(long j3) {
        throw null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f5411j;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i3) {
        return i3 / this.f5412e.f5406h;
    }

    public final boolean h(long j3) {
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public boolean i(long j3) {
        throw null;
    }

    public final boolean j(long j3) {
        return t.g().getTimeInMillis() == j3;
    }

    public int k() {
        return (b() + this.f5412e.f5407i) - 1;
    }

    public int l(int i3) {
        return (i3 - b()) + 1;
    }

    public final void m(TextView textView, long j3, int i3) {
        b bVar;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(c(textView.getContext(), j3));
        if (this.f5415h.h().c(j3)) {
            textView.setEnabled(true);
            boolean h3 = h(j3);
            textView.setSelected(h3);
            bVar = h3 ? this.f5414g.f5314b : j(j3) ? this.f5414g.f5315c : this.f5414g.f5313a;
        } else {
            textView.setEnabled(false);
            bVar = this.f5414g.f5319g;
        }
        bVar.b(textView);
    }

    public final void n(MaterialCalendarGridView materialCalendarGridView, long j3) {
        if (m.i(j3).equals(this.f5412e)) {
            int m3 = this.f5412e.m(j3);
            m((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(m3) - materialCalendarGridView.getFirstVisiblePosition()), j3, m3);
        }
    }

    public void o(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f5413f.iterator();
        while (it.hasNext()) {
            n(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    public boolean p(int i3) {
        return i3 >= b() && i3 <= k();
    }
}

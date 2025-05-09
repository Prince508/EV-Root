package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.d;
import l.C0552S;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements d.b, h, AdapterView.OnItemClickListener {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f2722g = {R.attr.background, R.attr.divider};

    /* renamed from: e, reason: collision with root package name */
    public d f2723e;

    /* renamed from: f, reason: collision with root package name */
    public int f2724f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.d.b
    public boolean a(e eVar) {
        return this.f2723e.H(eVar, 0);
    }

    public int getWindowAnimations() {
        return this.f2724f;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        a((e) getAdapter().getItem(i3));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0552S t3 = C0552S.t(context, attributeSet, f2722g, i3, 0);
        if (t3.q(0)) {
            setBackgroundDrawable(t3.g(0));
        }
        if (t3.q(1)) {
            setDivider(t3.g(1));
        }
        t3.u();
    }
}

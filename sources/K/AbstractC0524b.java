package k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0524b implements InterfaceC0525c, g, AdapterView.OnItemClickListener {

    /* renamed from: e, reason: collision with root package name */
    public Rect f8005e;

    public static int o(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i4 = 0;
        int i5 = 0;
        View view = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = listAdapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i6, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i3) {
                return i3;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
        }
        return i4;
    }

    public static boolean x(d dVar) {
        int size = dVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = dVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static androidx.appcompat.view.menu.c y(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.c) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (androidx.appcompat.view.menu.c) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean e(d dVar, e eVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean h(d dVar, e eVar) {
        return false;
    }

    public abstract void l(d dVar);

    public boolean m() {
        return true;
    }

    public Rect n() {
        return this.f8005e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        y(listAdapter).f2788e.I((MenuItem) listAdapter.getItem(i3), this, m() ? 0 : 4);
    }

    public abstract void p(View view);

    public void q(Rect rect) {
        this.f8005e = rect;
    }

    public abstract void r(boolean z3);

    public abstract void s(int i3);

    public abstract void t(int i3);

    public abstract void u(PopupWindow.OnDismissListener onDismissListener);

    public abstract void v(boolean z3);

    public abstract void w(int i3);

    @Override // androidx.appcompat.view.menu.g
    public void d(Context context, d dVar) {
    }
}

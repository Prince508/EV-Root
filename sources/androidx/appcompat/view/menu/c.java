package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public d f2788e;

    /* renamed from: f, reason: collision with root package name */
    public int f2789f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2790g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2791h;

    /* renamed from: i, reason: collision with root package name */
    public final LayoutInflater f2792i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2793j;

    public c(d dVar, LayoutInflater layoutInflater, boolean z3, int i3) {
        this.f2791h = z3;
        this.f2792i = layoutInflater;
        this.f2788e = dVar;
        this.f2793j = i3;
        a();
    }

    public void a() {
        e t3 = this.f2788e.t();
        if (t3 != null) {
            ArrayList v3 = this.f2788e.v();
            int size = v3.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((e) v3.get(i3)) == t3) {
                    this.f2789f = i3;
                    return;
                }
            }
        }
        this.f2789f = -1;
    }

    public d b() {
        return this.f2788e;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e getItem(int i3) {
        ArrayList v3 = this.f2791h ? this.f2788e.v() : this.f2788e.A();
        int i4 = this.f2789f;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (e) v3.get(i3);
    }

    public void d(boolean z3) {
        this.f2790g = z3;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f2789f < 0 ? (this.f2791h ? this.f2788e.v() : this.f2788e.A()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2792i.inflate(this.f2793j, viewGroup, false);
        }
        int groupId = getItem(i3).getGroupId();
        int i4 = i3 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f2788e.B() && groupId != (i4 >= 0 ? getItem(i4).getGroupId() : groupId));
        h.a aVar = (h.a) view;
        if (this.f2790g) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i3), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

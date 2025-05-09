package R;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: m, reason: collision with root package name */
    public int f1852m;

    /* renamed from: n, reason: collision with root package name */
    public int f1853n;

    /* renamed from: o, reason: collision with root package name */
    public LayoutInflater f1854o;

    public c(Context context, int i3, Cursor cursor, boolean z3) {
        super(context, cursor, z3);
        this.f1853n = i3;
        this.f1852m = i3;
        this.f1854o = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // R.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1854o.inflate(this.f1853n, viewGroup, false);
    }

    @Override // R.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1854o.inflate(this.f1852m, viewGroup, false);
    }
}

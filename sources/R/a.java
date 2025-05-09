package R;

import R.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: e, reason: collision with root package name */
    public boolean f1841e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1842f;

    /* renamed from: g, reason: collision with root package name */
    public Cursor f1843g;

    /* renamed from: h, reason: collision with root package name */
    public Context f1844h;

    /* renamed from: i, reason: collision with root package name */
    public int f1845i;

    /* renamed from: j, reason: collision with root package name */
    public C0048a f1846j;

    /* renamed from: k, reason: collision with root package name */
    public DataSetObserver f1847k;

    /* renamed from: l, reason: collision with root package name */
    public R.b f1848l;

    /* renamed from: R.a$a, reason: collision with other inner class name */
    public class C0048a extends ContentObserver {
        public C0048a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3) {
            a.this.i();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f1841e = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f1841e = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z3) {
        f(context, cursor, z3 ? 1 : 2);
    }

    @Override // R.b.a
    public abstract CharSequence a(Cursor cursor);

    @Override // R.b.a
    public void b(Cursor cursor) {
        Cursor j3 = j(cursor);
        if (j3 != null) {
            j3.close();
        }
    }

    @Override // R.b.a
    public Cursor c() {
        return this.f1843g;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i3) {
        if ((i3 & 1) == 1) {
            i3 |= 2;
            this.f1842f = true;
        } else {
            this.f1842f = false;
        }
        boolean z3 = cursor != null;
        this.f1843g = cursor;
        this.f1841e = z3;
        this.f1844h = context;
        this.f1845i = z3 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i3 & 2) == 2) {
            this.f1846j = new C0048a();
            this.f1847k = new b();
        } else {
            this.f1846j = null;
            this.f1847k = null;
        }
        if (z3) {
            C0048a c0048a = this.f1846j;
            if (c0048a != null) {
                cursor.registerContentObserver(c0048a);
            }
            DataSetObserver dataSetObserver = this.f1847k;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f1841e || (cursor = this.f1843g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f1841e) {
            return null;
        }
        this.f1843g.moveToPosition(i3);
        if (view == null) {
            view = g(this.f1844h, this.f1843g, viewGroup);
        }
        e(view, this.f1844h, this.f1843g);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f1848l == null) {
            this.f1848l = new R.b(this);
        }
        return this.f1848l;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i3) {
        Cursor cursor;
        if (!this.f1841e || (cursor = this.f1843g) == null) {
            return null;
        }
        cursor.moveToPosition(i3);
        return this.f1843g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i3) {
        Cursor cursor;
        if (this.f1841e && (cursor = this.f1843g) != null && cursor.moveToPosition(i3)) {
            return this.f1843g.getLong(this.f1845i);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        if (!this.f1841e) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f1843g.moveToPosition(i3)) {
            if (view == null) {
                view = h(this.f1844h, this.f1843g, viewGroup);
            }
            e(view, this.f1844h, this.f1843g);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i3);
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void i() {
        Cursor cursor;
        if (!this.f1842f || (cursor = this.f1843g) == null || cursor.isClosed()) {
            return;
        }
        this.f1841e = this.f1843g.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f1843g;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0048a c0048a = this.f1846j;
            if (c0048a != null) {
                cursor2.unregisterContentObserver(c0048a);
            }
            DataSetObserver dataSetObserver = this.f1847k;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1843g = cursor;
        if (cursor == null) {
            this.f1845i = -1;
            this.f1841e = false;
            notifyDataSetInvalidated();
            return cursor2;
        }
        C0048a c0048a2 = this.f1846j;
        if (c0048a2 != null) {
            cursor.registerContentObserver(c0048a2);
        }
        DataSetObserver dataSetObserver2 = this.f1847k;
        if (dataSetObserver2 != null) {
            cursor.registerDataSetObserver(dataSetObserver2);
        }
        this.f1845i = cursor.getColumnIndexOrThrow("_id");
        this.f1841e = true;
        notifyDataSetChanged();
        return cursor2;
    }
}

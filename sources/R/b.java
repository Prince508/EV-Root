package R;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
public class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public a f1851a;

    public interface a {
        CharSequence a(Cursor cursor);

        void b(Cursor cursor);

        Cursor c();

        Cursor d(CharSequence charSequence);
    }

    public b(a aVar) {
        this.f1851a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f1851a.a((Cursor) obj);
    }

    @Override // android.widget.Filter
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d3 = this.f1851a.d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d3 != null) {
            filterResults.count = d3.getCount();
            filterResults.values = d3;
            return filterResults;
        }
        filterResults.count = 0;
        filterResults.values = null;
        return filterResults;
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c3 = this.f1851a.c();
        Object obj = filterResults.values;
        if (obj == null || obj == c3) {
            return;
        }
        this.f1851a.b((Cursor) obj);
    }
}

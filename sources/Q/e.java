package Q;

import android.widget.ListView;

/* loaded from: classes.dex */
public class e extends a {

    /* renamed from: w, reason: collision with root package name */
    public final ListView f1832w;

    public e(ListView listView) {
        super(listView);
        this.f1832w = listView;
    }

    @Override // Q.a
    public boolean a(int i3) {
        return false;
    }

    @Override // Q.a
    public boolean b(int i3) {
        ListView listView = this.f1832w;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i4 = firstVisiblePosition + childCount;
        if (i3 > 0) {
            if (i4 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i3 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // Q.a
    public void j(int i3, int i4) {
        this.f1832w.scrollListBy(i4);
    }
}

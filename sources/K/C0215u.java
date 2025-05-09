package K;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: K.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0215u {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f1063a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f1064b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Map f1065c = new HashMap();

    public C0215u(Runnable runnable) {
        this.f1063a = runnable;
    }

    public void a(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f1064b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0217w) it.next()).a(menu, menuInflater);
        }
    }

    public boolean b(MenuItem menuItem) {
        Iterator it = this.f1064b.iterator();
        while (it.hasNext()) {
            if (((InterfaceC0217w) it.next()).c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void c(Menu menu) {
        Iterator it = this.f1064b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0217w) it.next()).b(menu);
        }
    }
}

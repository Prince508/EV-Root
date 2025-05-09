package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    public final Map f3967a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f3967a.values().iterator();
        while (it.hasNext()) {
            ((D) it.next()).a();
        }
        this.f3967a.clear();
    }

    public final D b(String str) {
        C2.k.e(str, "key");
        return (D) this.f3967a.get(str);
    }

    public final void c(String str, D d3) {
        C2.k.e(str, "key");
        C2.k.e(d3, "viewModel");
        D d4 = (D) this.f3967a.put(str, d3);
        if (d4 != null) {
            d4.c();
        }
    }
}

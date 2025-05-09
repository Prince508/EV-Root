package e0;

import android.util.Log;
import androidx.lifecycle.E;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class E extends androidx.lifecycle.D {

    /* renamed from: k, reason: collision with root package name */
    public static final E.b f6446k = new a();

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6450g;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f6447d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f6448e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f6449f = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f6451h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6452i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6453j = false;

    public class a implements E.b {
        @Override // androidx.lifecycle.E.b
        public androidx.lifecycle.D a(Class cls) {
            return new E(true);
        }
    }

    public E(boolean z3) {
        this.f6450g = z3;
    }

    @Override // androidx.lifecycle.D
    public void c() {
        if (B.v0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f6451h = true;
    }

    public void d(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (this.f6453j) {
            if (B.v0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f6447d.containsKey(abstractComponentCallbacksC0459p.f6721i)) {
                return;
            }
            this.f6447d.put(abstractComponentCallbacksC0459p.f6721i, abstractComponentCallbacksC0459p);
            if (B.v0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + abstractComponentCallbacksC0459p);
            }
        }
    }

    public void e(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, boolean z3) {
        if (B.v0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0459p);
        }
        g(abstractComponentCallbacksC0459p.f6721i, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E.class == obj.getClass()) {
            E e3 = (E) obj;
            if (this.f6447d.equals(e3.f6447d) && this.f6448e.equals(e3.f6448e) && this.f6449f.equals(e3.f6449f)) {
                return true;
            }
        }
        return false;
    }

    public void f(String str, boolean z3) {
        if (B.v0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        g(str, z3);
    }

    public final void g(String str, boolean z3) {
        E e3 = (E) this.f6448e.get(str);
        if (e3 != null) {
            if (z3) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(e3.f6448e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e3.f((String) it.next(), true);
                }
            }
            e3.c();
            this.f6448e.remove(str);
        }
        androidx.lifecycle.G g3 = (androidx.lifecycle.G) this.f6449f.get(str);
        if (g3 != null) {
            g3.a();
            this.f6449f.remove(str);
        }
    }

    public AbstractComponentCallbacksC0459p h(String str) {
        return (AbstractComponentCallbacksC0459p) this.f6447d.get(str);
    }

    public int hashCode() {
        return (((this.f6447d.hashCode() * 31) + this.f6448e.hashCode()) * 31) + this.f6449f.hashCode();
    }

    public E i(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        E e3 = (E) this.f6448e.get(abstractComponentCallbacksC0459p.f6721i);
        if (e3 != null) {
            return e3;
        }
        E e4 = new E(this.f6450g);
        this.f6448e.put(abstractComponentCallbacksC0459p.f6721i, e4);
        return e4;
    }

    public Collection j() {
        return new ArrayList(this.f6447d.values());
    }

    public androidx.lifecycle.G k(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        androidx.lifecycle.G g3 = (androidx.lifecycle.G) this.f6449f.get(abstractComponentCallbacksC0459p.f6721i);
        if (g3 != null) {
            return g3;
        }
        androidx.lifecycle.G g4 = new androidx.lifecycle.G();
        this.f6449f.put(abstractComponentCallbacksC0459p.f6721i, g4);
        return g4;
    }

    public void l(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (this.f6453j) {
            if (B.v0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f6447d.remove(abstractComponentCallbacksC0459p.f6721i) == null || !B.v0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0459p);
        }
    }

    public void m(boolean z3) {
        this.f6453j = z3;
    }

    public boolean n(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (this.f6447d.containsKey(abstractComponentCallbacksC0459p.f6721i)) {
            return this.f6450g ? this.f6451h : !this.f6452i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f6447d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f6448e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f6449f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}

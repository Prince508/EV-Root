package e0;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class I {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6476a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6477b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6478c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public E f6479d;

    public void a(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        if (this.f6476a.contains(abstractComponentCallbacksC0459p)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0459p);
        }
        synchronized (this.f6476a) {
            this.f6476a.add(abstractComponentCallbacksC0459p);
        }
        abstractComponentCallbacksC0459p.f6727o = true;
    }

    public void b() {
        this.f6477b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f6477b.get(str) != null;
    }

    public void d(int i3) {
        for (H h3 : this.f6477b.values()) {
            if (h3 != null) {
                h3.r(i3);
            }
        }
    }

    public AbstractComponentCallbacksC0459p e(String str) {
        H h3 = (H) this.f6477b.get(str);
        if (h3 != null) {
            return h3.k();
        }
        return null;
    }

    public AbstractComponentCallbacksC0459p f(int i3) {
        for (int size = this.f6476a.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = (AbstractComponentCallbacksC0459p) this.f6476a.get(size);
            if (abstractComponentCallbacksC0459p != null && abstractComponentCallbacksC0459p.f6687A == i3) {
                return abstractComponentCallbacksC0459p;
            }
        }
        for (H h3 : this.f6477b.values()) {
            if (h3 != null) {
                AbstractComponentCallbacksC0459p k3 = h3.k();
                if (k3.f6687A == i3) {
                    return k3;
                }
            }
        }
        return null;
    }

    public AbstractComponentCallbacksC0459p g(String str) {
        if (str != null) {
            for (int size = this.f6476a.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = (AbstractComponentCallbacksC0459p) this.f6476a.get(size);
                if (abstractComponentCallbacksC0459p != null && str.equals(abstractComponentCallbacksC0459p.f6689C)) {
                    return abstractComponentCallbacksC0459p;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (H h3 : this.f6477b.values()) {
            if (h3 != null) {
                AbstractComponentCallbacksC0459p k3 = h3.k();
                if (str.equals(k3.f6689C)) {
                    return k3;
                }
            }
        }
        return null;
    }

    public int h(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        View view;
        View view2;
        ViewGroup viewGroup = abstractComponentCallbacksC0459p.f6697K;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f6476a.indexOf(abstractComponentCallbacksC0459p);
        for (int i3 = indexOf - 1; i3 >= 0; i3--) {
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = (AbstractComponentCallbacksC0459p) this.f6476a.get(i3);
            if (abstractComponentCallbacksC0459p2.f6697K == viewGroup && (view2 = abstractComponentCallbacksC0459p2.f6698L) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f6476a.size()) {
                return -1;
            }
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p3 = (AbstractComponentCallbacksC0459p) this.f6476a.get(indexOf);
            if (abstractComponentCallbacksC0459p3.f6697K == viewGroup && (view = abstractComponentCallbacksC0459p3.f6698L) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    public List i() {
        ArrayList arrayList = new ArrayList();
        for (H h3 : this.f6477b.values()) {
            if (h3 != null) {
                arrayList.add(h3);
            }
        }
        return arrayList;
    }

    public List j() {
        ArrayList arrayList = new ArrayList();
        for (H h3 : this.f6477b.values()) {
            if (h3 != null) {
                arrayList.add(h3.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public HashMap k() {
        return this.f6478c;
    }

    public H l(String str) {
        return (H) this.f6477b.get(str);
    }

    public List m() {
        ArrayList arrayList;
        if (this.f6476a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f6476a) {
            arrayList = new ArrayList(this.f6476a);
        }
        return arrayList;
    }

    public E n() {
        return this.f6479d;
    }

    public Bundle o(String str) {
        return (Bundle) this.f6478c.get(str);
    }

    public void p(H h3) {
        AbstractComponentCallbacksC0459p k3 = h3.k();
        if (c(k3.f6721i)) {
            return;
        }
        this.f6477b.put(k3.f6721i, h3);
        if (k3.f6693G) {
            if (k3.f6692F) {
                this.f6479d.d(k3);
            } else {
                this.f6479d.l(k3);
            }
            k3.f6693G = false;
        }
        if (B.v0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k3);
        }
    }

    public void q(H h3) {
        AbstractComponentCallbacksC0459p k3 = h3.k();
        if (k3.f6692F) {
            this.f6479d.l(k3);
        }
        if (this.f6477b.get(k3.f6721i) == h3 && ((H) this.f6477b.put(k3.f6721i, null)) != null && B.v0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k3);
        }
    }

    public void r() {
        Iterator it = this.f6476a.iterator();
        while (it.hasNext()) {
            H h3 = (H) this.f6477b.get(((AbstractComponentCallbacksC0459p) it.next()).f6721i);
            if (h3 != null) {
                h3.m();
            }
        }
        for (H h4 : this.f6477b.values()) {
            if (h4 != null) {
                h4.m();
                AbstractComponentCallbacksC0459p k3 = h4.k();
                if (k3.f6728p && !k3.S()) {
                    if (k3.f6730r && !this.f6478c.containsKey(k3.f6721i)) {
                        z(k3.f6721i, h4.p());
                    }
                    q(h4);
                }
            }
        }
    }

    public void s(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        synchronized (this.f6476a) {
            this.f6476a.remove(abstractComponentCallbacksC0459p);
        }
        abstractComponentCallbacksC0459p.f6727o = false;
    }

    public void t() {
        this.f6477b.clear();
    }

    public void u(List list) {
        this.f6476a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                AbstractComponentCallbacksC0459p e3 = e(str);
                if (e3 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (B.v0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + e3);
                }
                a(e3);
            }
        }
    }

    public void v(HashMap hashMap) {
        this.f6478c.clear();
        this.f6478c.putAll(hashMap);
    }

    public ArrayList w() {
        ArrayList arrayList = new ArrayList(this.f6477b.size());
        for (H h3 : this.f6477b.values()) {
            if (h3 != null) {
                AbstractComponentCallbacksC0459p k3 = h3.k();
                z(k3.f6721i, h3.p());
                arrayList.add(k3.f6721i);
                if (B.v0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k3 + ": " + k3.f6718f);
                }
            }
        }
        return arrayList;
    }

    public ArrayList x() {
        synchronized (this.f6476a) {
            try {
                if (this.f6476a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f6476a.size());
                Iterator it = this.f6476a.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = (AbstractComponentCallbacksC0459p) it.next();
                    arrayList.add(abstractComponentCallbacksC0459p.f6721i);
                    if (B.v0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0459p.f6721i + "): " + abstractComponentCallbacksC0459p);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y(E e3) {
        this.f6479d = e3;
    }

    public Bundle z(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f6478c.put(str, bundle) : (Bundle) this.f6478c.remove(str);
    }
}

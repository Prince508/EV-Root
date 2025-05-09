package x;

import J.d;
import J.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o.g;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764b {

    /* renamed from: a, reason: collision with root package name */
    public final d f9967a = new e(10);

    /* renamed from: b, reason: collision with root package name */
    public final g f9968b = new g();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9969c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f9970d = new HashSet();

    public void a(Object obj, Object obj2) {
        if (!this.f9968b.containsKey(obj) || !this.f9968b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f9968b.get(obj);
        if (arrayList == null) {
            arrayList = f();
            this.f9968b.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    public void b(Object obj) {
        if (this.f9968b.containsKey(obj)) {
            return;
        }
        this.f9968b.put(obj, null);
    }

    public void c() {
        int size = this.f9968b.size();
        for (int i3 = 0; i3 < size; i3++) {
            ArrayList arrayList = (ArrayList) this.f9968b.m(i3);
            if (arrayList != null) {
                j(arrayList);
            }
        }
        this.f9968b.clear();
    }

    public boolean d(Object obj) {
        return this.f9968b.containsKey(obj);
    }

    public final void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f9968b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                e(arrayList2.get(i3), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public final ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f9967a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public List g(Object obj) {
        int size = this.f9968b.size();
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < size; i3++) {
            ArrayList arrayList2 = (ArrayList) this.f9968b.m(i3);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f9968b.i(i3));
            }
        }
        return arrayList;
    }

    public ArrayList h() {
        this.f9969c.clear();
        this.f9970d.clear();
        int size = this.f9968b.size();
        for (int i3 = 0; i3 < size; i3++) {
            e(this.f9968b.i(i3), this.f9969c, this.f9970d);
        }
        return this.f9969c;
    }

    public boolean i(Object obj) {
        int size = this.f9968b.size();
        for (int i3 = 0; i3 < size; i3++) {
            ArrayList arrayList = (ArrayList) this.f9968b.m(i3);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j(ArrayList arrayList) {
        arrayList.clear();
        this.f9967a.a(arrayList);
    }
}

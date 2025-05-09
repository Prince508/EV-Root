package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b implements Iterable {

    /* renamed from: e, reason: collision with root package name */
    public c f8539e;

    /* renamed from: f, reason: collision with root package name */
    public c f8540f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakHashMap f8541g = new WeakHashMap();

    /* renamed from: h, reason: collision with root package name */
    public int f8542h = 0;

    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        public c c(c cVar) {
            return cVar.f8546h;
        }

        @Override // n.b.e
        public c d(c cVar) {
            return cVar.f8545g;
        }
    }

    /* renamed from: n.b$b, reason: collision with other inner class name */
    public static class C0134b extends e {
        public C0134b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // n.b.e
        public c c(c cVar) {
            return cVar.f8545g;
        }

        @Override // n.b.e
        public c d(c cVar) {
            return cVar.f8546h;
        }
    }

    public static class c implements Map.Entry {

        /* renamed from: e, reason: collision with root package name */
        public final Object f8543e;

        /* renamed from: f, reason: collision with root package name */
        public final Object f8544f;

        /* renamed from: g, reason: collision with root package name */
        public c f8545g;

        /* renamed from: h, reason: collision with root package name */
        public c f8546h;

        public c(Object obj, Object obj2) {
            this.f8543e = obj;
            this.f8544f = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f8543e.equals(cVar.f8543e) && this.f8544f.equals(cVar.f8544f);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f8543e;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f8544f;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f8543e.hashCode() ^ this.f8544f.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f8543e + "=" + this.f8544f;
        }
    }

    public class d extends f implements Iterator {

        /* renamed from: e, reason: collision with root package name */
        public c f8547e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f8548f = true;

        public d() {
        }

        @Override // n.b.f
        public void b(c cVar) {
            c cVar2 = this.f8547e;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f8546h;
                this.f8547e = cVar3;
                this.f8548f = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f8548f) {
                this.f8548f = false;
                this.f8547e = b.this.f8539e;
            } else {
                c cVar = this.f8547e;
                this.f8547e = cVar != null ? cVar.f8545g : null;
            }
            return this.f8547e;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f8548f) {
                return b.this.f8539e != null;
            }
            c cVar = this.f8547e;
            return (cVar == null || cVar.f8545g == null) ? false : true;
        }
    }

    public static abstract class e extends f implements Iterator {

        /* renamed from: e, reason: collision with root package name */
        public c f8550e;

        /* renamed from: f, reason: collision with root package name */
        public c f8551f;

        public e(c cVar, c cVar2) {
            this.f8550e = cVar2;
            this.f8551f = cVar;
        }

        @Override // n.b.f
        public void b(c cVar) {
            if (this.f8550e == cVar && cVar == this.f8551f) {
                this.f8551f = null;
                this.f8550e = null;
            }
            c cVar2 = this.f8550e;
            if (cVar2 == cVar) {
                this.f8550e = c(cVar2);
            }
            if (this.f8551f == cVar) {
                this.f8551f = f();
            }
        }

        public abstract c c(c cVar);

        public abstract c d(c cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f8551f;
            this.f8551f = f();
            return cVar;
        }

        public final c f() {
            c cVar = this.f8551f;
            c cVar2 = this.f8550e;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8551f != null;
        }
    }

    public static abstract class f {
        public abstract void b(c cVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((Map.Entry) it.next()).hashCode();
        }
        return i3;
    }

    public Iterator i() {
        C0134b c0134b = new C0134b(this.f8540f, this.f8539e);
        this.f8541g.put(c0134b, Boolean.FALSE);
        return c0134b;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f8539e, this.f8540f);
        this.f8541g.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public Map.Entry j() {
        return this.f8539e;
    }

    public c k(Object obj) {
        c cVar = this.f8539e;
        while (cVar != null && !cVar.f8543e.equals(obj)) {
            cVar = cVar.f8545g;
        }
        return cVar;
    }

    public d l() {
        d dVar = new d();
        this.f8541g.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry m() {
        return this.f8540f;
    }

    public c n(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f8542h++;
        c cVar2 = this.f8540f;
        if (cVar2 == null) {
            this.f8539e = cVar;
            this.f8540f = cVar;
            return cVar;
        }
        cVar2.f8545g = cVar;
        cVar.f8546h = cVar2;
        this.f8540f = cVar;
        return cVar;
    }

    public Object o(Object obj, Object obj2) {
        c k3 = k(obj);
        if (k3 != null) {
            return k3.f8544f;
        }
        n(obj, obj2);
        return null;
    }

    public Object p(Object obj) {
        c k3 = k(obj);
        if (k3 == null) {
            return null;
        }
        this.f8542h--;
        if (!this.f8541g.isEmpty()) {
            Iterator it = this.f8541g.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).b(k3);
            }
        }
        c cVar = k3.f8546h;
        if (cVar != null) {
            cVar.f8545g = k3.f8545g;
        } else {
            this.f8539e = k3.f8545g;
        }
        c cVar2 = k3.f8545g;
        if (cVar2 != null) {
            cVar2.f8546h = cVar;
        } else {
            this.f8540f = cVar;
        }
        k3.f8545g = null;
        k3.f8546h = null;
        return k3.f8544f;
    }

    public int size() {
        return this.f8542h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

package androidx.datastore.preferences.protobuf;

import j.AbstractC0515e;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class b0 extends AbstractMap {

    /* renamed from: e, reason: collision with root package name */
    public final int f3600e;

    /* renamed from: f, reason: collision with root package name */
    public List f3601f;

    /* renamed from: g, reason: collision with root package name */
    public Map f3602g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3603h;

    /* renamed from: i, reason: collision with root package name */
    public volatile g f3604i;

    /* renamed from: j, reason: collision with root package name */
    public Map f3605j;

    /* renamed from: k, reason: collision with root package name */
    public volatile c f3606k;

    public static class a extends b0 {
        public a(int i3) {
            super(i3, null);
        }

        @Override // androidx.datastore.preferences.protobuf.b0
        public void p() {
            if (!o()) {
                if (k() > 0) {
                    AbstractC0515e.a(j(0).getKey());
                    throw null;
                }
                Iterator it = m().iterator();
                if (it.hasNext()) {
                    AbstractC0515e.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            AbstractC0515e.a(obj);
            return super.r(null, obj2);
        }
    }

    public class c extends g {
        public c() {
            super(b0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.b0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(b0.this, null);
        }

        public /* synthetic */ c(b0 b0Var, a aVar) {
            this();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public static final Iterator f3611a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final Iterable f3612b = new b();

        public static class a implements Iterator {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public static class b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f3611a;
            }
        }

        public static Iterable b() {
            return f3612b;
        }
    }

    public class e implements Map.Entry, Comparable {

        /* renamed from: e, reason: collision with root package name */
        public final Comparable f3613e;

        /* renamed from: f, reason: collision with root package name */
        public Object f3614f;

        public e(b0 b0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return f(this.f3613e, entry.getKey()) && f(this.f3614f, entry.getValue());
        }

        public final boolean f(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f3613e;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f3614f;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f3613e;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f3614f;
            return hashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            b0.this.g();
            Object obj2 = this.f3614f;
            this.f3614f = obj;
            return obj2;
        }

        public String toString() {
            return this.f3613e + "=" + this.f3614f;
        }

        public e(Comparable comparable, Object obj) {
            this.f3613e = comparable;
            this.f3614f = obj;
        }
    }

    public class g extends AbstractSet {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = b0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            b0.this.r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(b0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            b0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.size();
        }

        public /* synthetic */ g(b0 b0Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ b0(int i3, a aVar) {
        this(i3);
    }

    public static b0 q(int i3) {
        return new a(i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f3601f.isEmpty()) {
            this.f3601f.clear();
        }
        if (this.f3602g.isEmpty()) {
            return;
        }
        this.f3602g.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f3602g.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f3604i == null) {
            this.f3604i = new g(this, null);
        }
        return this.f3604i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return super.equals(obj);
        }
        b0 b0Var = (b0) obj;
        int size = size();
        if (size != b0Var.size()) {
            return false;
        }
        int k3 = k();
        if (k3 != b0Var.k()) {
            return entrySet().equals(b0Var.entrySet());
        }
        for (int i3 = 0; i3 < k3; i3++) {
            if (!j(i3).equals(b0Var.j(i3))) {
                return false;
            }
        }
        if (k3 != size) {
            return this.f3602g.equals(b0Var.f3602g);
        }
        return true;
    }

    public final int f(Comparable comparable) {
        int i3;
        int size = this.f3601f.size();
        int i4 = size - 1;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo(((e) this.f3601f.get(i4)).getKey());
            if (compareTo > 0) {
                i3 = size + 1;
                return -i3;
            }
            if (compareTo == 0) {
                return i4;
            }
        }
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) / 2;
            int compareTo2 = comparable.compareTo(((e) this.f3601f.get(i6)).getKey());
            if (compareTo2 < 0) {
                i4 = i6 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i6;
                }
                i5 = i6 + 1;
            }
        }
        i3 = i5 + 1;
        return -i3;
    }

    public final void g() {
        if (this.f3603h) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f3 = f(comparable);
        return f3 >= 0 ? ((e) this.f3601f.get(f3)).getValue() : this.f3602g.get(comparable);
    }

    public Set h() {
        if (this.f3606k == null) {
            this.f3606k = new c(this, null);
        }
        return this.f3606k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int k3 = k();
        int i3 = 0;
        for (int i4 = 0; i4 < k3; i4++) {
            i3 += ((e) this.f3601f.get(i4)).hashCode();
        }
        return l() > 0 ? i3 + this.f3602g.hashCode() : i3;
    }

    public final void i() {
        g();
        if (!this.f3601f.isEmpty() || (this.f3601f instanceof ArrayList)) {
            return;
        }
        this.f3601f = new ArrayList(this.f3600e);
    }

    public Map.Entry j(int i3) {
        return (Map.Entry) this.f3601f.get(i3);
    }

    public int k() {
        return this.f3601f.size();
    }

    public int l() {
        return this.f3602g.size();
    }

    public Iterable m() {
        return this.f3602g.isEmpty() ? d.b() : this.f3602g.entrySet();
    }

    public final SortedMap n() {
        g();
        if (this.f3602g.isEmpty() && !(this.f3602g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f3602g = treeMap;
            this.f3605j = treeMap.descendingMap();
        }
        return (SortedMap) this.f3602g;
    }

    public boolean o() {
        return this.f3603h;
    }

    public void p() {
        if (this.f3603h) {
            return;
        }
        this.f3602g = this.f3602g.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f3602g);
        this.f3605j = this.f3605j.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f3605j);
        this.f3603h = true;
    }

    public Object r(Comparable comparable, Object obj) {
        g();
        int f3 = f(comparable);
        if (f3 >= 0) {
            return ((e) this.f3601f.get(f3)).setValue(obj);
        }
        i();
        int i3 = -(f3 + 1);
        if (i3 >= this.f3600e) {
            return n().put(comparable, obj);
        }
        int size = this.f3601f.size();
        int i4 = this.f3600e;
        if (size == i4) {
            e eVar = (e) this.f3601f.remove(i4 - 1);
            n().put(eVar.getKey(), eVar.getValue());
        }
        this.f3601f.add(i3, new e(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f3 = f(comparable);
        if (f3 >= 0) {
            return s(f3);
        }
        if (this.f3602g.isEmpty()) {
            return null;
        }
        return this.f3602g.remove(comparable);
    }

    public final Object s(int i3) {
        g();
        Object value = ((e) this.f3601f.remove(i3)).getValue();
        if (!this.f3602g.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f3601f.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f3601f.size() + this.f3602g.size();
    }

    public class b implements Iterator {

        /* renamed from: e, reason: collision with root package name */
        public int f3607e;

        /* renamed from: f, reason: collision with root package name */
        public Iterator f3608f;

        public b() {
            this.f3607e = b0.this.f3601f.size();
        }

        public final Iterator b() {
            if (this.f3608f == null) {
                this.f3608f = b0.this.f3605j.entrySet().iterator();
            }
            return this.f3608f;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (b().hasNext()) {
                return (Map.Entry) b().next();
            }
            List list = b0.this.f3601f;
            int i3 = this.f3607e - 1;
            this.f3607e = i3;
            return (Map.Entry) list.get(i3);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i3 = this.f3607e;
            return (i3 > 0 && i3 <= b0.this.f3601f.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(b0 b0Var, a aVar) {
            this();
        }
    }

    public class f implements Iterator {

        /* renamed from: e, reason: collision with root package name */
        public int f3616e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f3617f;

        /* renamed from: g, reason: collision with root package name */
        public Iterator f3618g;

        public f() {
            this.f3616e = -1;
        }

        public final Iterator b() {
            if (this.f3618g == null) {
                this.f3618g = b0.this.f3602g.entrySet().iterator();
            }
            return this.f3618g;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f3617f = true;
            int i3 = this.f3616e + 1;
            this.f3616e = i3;
            return i3 < b0.this.f3601f.size() ? (Map.Entry) b0.this.f3601f.get(this.f3616e) : (Map.Entry) b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3616e + 1 < b0.this.f3601f.size() || (!b0.this.f3602g.isEmpty() && b().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3617f) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f3617f = false;
            b0.this.g();
            if (this.f3616e >= b0.this.f3601f.size()) {
                b().remove();
                return;
            }
            b0 b0Var = b0.this;
            int i3 = this.f3616e;
            this.f3616e = i3 - 1;
            b0Var.s(i3);
        }

        public /* synthetic */ f(b0 b0Var, a aVar) {
            this();
        }
    }

    public b0(int i3) {
        this.f3600e = i3;
        this.f3601f = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f3602g = map;
        this.f3605j = map;
    }
}

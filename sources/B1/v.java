package B1;

import O1.C;
import O1.I;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentMap f99a;

    /* renamed from: b, reason: collision with root package name */
    public c f100b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f101c;

    /* renamed from: d, reason: collision with root package name */
    public final M1.a f102d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f103e;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Class f104a;

        /* renamed from: b, reason: collision with root package name */
        public ConcurrentMap f105b;

        /* renamed from: c, reason: collision with root package name */
        public c f106c;

        /* renamed from: d, reason: collision with root package name */
        public M1.a f107d;

        public b a(Object obj, Object obj2, C.c cVar) {
            return c(obj, obj2, cVar, false);
        }

        public b b(Object obj, Object obj2, C.c cVar) {
            return c(obj, obj2, cVar, true);
        }

        public final b c(Object obj, Object obj2, C.c cVar, boolean z3) {
            if (this.f105b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (cVar.c0() != O1.z.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c b3 = v.b(obj, obj2, cVar, this.f105b);
            if (!z3) {
                return this;
            }
            if (this.f106c != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f106c = b3;
            return this;
        }

        public v d() {
            ConcurrentMap concurrentMap = this.f105b;
            if (concurrentMap == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            v vVar = new v(concurrentMap, this.f106c, this.f107d, this.f104a);
            this.f105b = null;
            return vVar;
        }

        public b e(M1.a aVar) {
            if (this.f105b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f107d = aVar;
            return this;
        }

        public b(Class cls) {
            this.f105b = new ConcurrentHashMap();
            this.f104a = cls;
            this.f107d = M1.a.f1359b;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f108a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f109b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f110c;

        /* renamed from: d, reason: collision with root package name */
        public final O1.z f111d;

        /* renamed from: e, reason: collision with root package name */
        public final I f112e;

        /* renamed from: f, reason: collision with root package name */
        public final int f113f;

        /* renamed from: g, reason: collision with root package name */
        public final String f114g;

        /* renamed from: h, reason: collision with root package name */
        public final g f115h;

        public c(Object obj, Object obj2, byte[] bArr, O1.z zVar, I i3, int i4, String str, g gVar) {
            this.f108a = obj;
            this.f109b = obj2;
            this.f110c = Arrays.copyOf(bArr, bArr.length);
            this.f111d = zVar;
            this.f112e = i3;
            this.f113f = i4;
            this.f114g = str;
            this.f115h = gVar;
        }

        public Object a() {
            return this.f108a;
        }

        public final byte[] b() {
            byte[] bArr = this.f110c;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public g c() {
            return this.f115h;
        }

        public int d() {
            return this.f113f;
        }

        public String e() {
            return this.f114g;
        }

        public I f() {
            return this.f112e;
        }

        public Object g() {
            return this.f109b;
        }

        public O1.z h() {
            return this.f111d;
        }
    }

    public static class d implements Comparable {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f116e;

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            byte[] bArr = this.f116e;
            int length = bArr.length;
            byte[] bArr2 = dVar.f116e;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i3 = 0;
            while (true) {
                byte[] bArr3 = this.f116e;
                if (i3 >= bArr3.length) {
                    return 0;
                }
                byte b3 = bArr3[i3];
                byte b4 = dVar.f116e[i3];
                if (b3 != b4) {
                    return b3 - b4;
                }
                i3++;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return Arrays.equals(this.f116e, ((d) obj).f116e);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f116e);
        }

        public String toString() {
            return P1.k.b(this.f116e);
        }

        public d(byte[] bArr) {
            this.f116e = Arrays.copyOf(bArr, bArr.length);
        }
    }

    public static c b(Object obj, Object obj2, C.c cVar, ConcurrentMap concurrentMap) {
        Integer valueOf = Integer.valueOf(cVar.a0());
        if (cVar.b0() == I.RAW) {
            valueOf = null;
        }
        c cVar2 = new c(obj, obj2, B1.d.a(cVar), cVar.c0(), cVar.b0(), cVar.a0(), cVar.Z().a0(), J1.i.a().d(J1.o.b(cVar.Z().a0(), cVar.Z().b0(), cVar.Z().Z(), cVar.b0(), valueOf), f.a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2);
        d dVar = new d(cVar2.b());
        List list = (List) concurrentMap.put(dVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(cVar2);
            concurrentMap.put(dVar, Collections.unmodifiableList(arrayList2));
        }
        return cVar2;
    }

    public static b j(Class cls) {
        return new b(cls);
    }

    public Collection c() {
        return this.f99a.values();
    }

    public M1.a d() {
        return this.f102d;
    }

    public c e() {
        return this.f100b;
    }

    public List f(byte[] bArr) {
        List list = (List) this.f99a.get(new d(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public Class g() {
        return this.f101c;
    }

    public List h() {
        return f(B1.d.f69a);
    }

    public boolean i() {
        return !this.f102d.b().isEmpty();
    }

    public v(ConcurrentMap concurrentMap, c cVar, M1.a aVar, Class cls) {
        this.f99a = concurrentMap;
        this.f100b = cVar;
        this.f101c = cls;
        this.f102d = aVar;
        this.f103e = false;
    }
}

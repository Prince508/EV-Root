package J1;

import B1.y;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Map f906a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f907b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f908c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f909d;

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final Class f914a;

        /* renamed from: b, reason: collision with root package name */
        public final Q1.a f915b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f914a.equals(this.f914a) && cVar.f915b.equals(this.f915b);
        }

        public int hashCode() {
            return Objects.hash(this.f914a, this.f915b);
        }

        public String toString() {
            return this.f914a.getSimpleName() + ", object identifier: " + this.f915b;
        }

        public c(Class cls, Q1.a aVar) {
            this.f914a = cls;
            this.f915b = aVar;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final Class f916a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f917b;

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f916a.equals(this.f916a) && dVar.f917b.equals(this.f917b);
        }

        public int hashCode() {
            return Objects.hash(this.f916a, this.f917b);
        }

        public String toString() {
            return this.f916a.getSimpleName() + " with serialization type: " + this.f917b.getSimpleName();
        }

        public d(Class cls, Class cls2) {
            this.f916a = cls;
            this.f917b = cls2;
        }
    }

    public boolean e(q qVar) {
        return this.f907b.containsKey(new c(qVar.getClass(), qVar.a()));
    }

    public B1.g f(q qVar, y yVar) {
        c cVar = new c(qVar.getClass(), qVar.a());
        if (this.f907b.containsKey(cVar)) {
            return ((J1.b) this.f907b.get(cVar)).d(qVar, yVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }

    public r(b bVar) {
        this.f906a = new HashMap(bVar.f910a);
        this.f907b = new HashMap(bVar.f911b);
        this.f908c = new HashMap(bVar.f912c);
        this.f909d = new HashMap(bVar.f913d);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map f910a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f911b;

        /* renamed from: c, reason: collision with root package name */
        public final Map f912c;

        /* renamed from: d, reason: collision with root package name */
        public final Map f913d;

        public b() {
            this.f910a = new HashMap();
            this.f911b = new HashMap();
            this.f912c = new HashMap();
            this.f913d = new HashMap();
        }

        public r e() {
            return new r(this);
        }

        public b f(J1.b bVar) {
            c cVar = new c(bVar.c(), bVar.b());
            if (!this.f911b.containsKey(cVar)) {
                this.f911b.put(cVar, bVar);
                return this;
            }
            J1.b bVar2 = (J1.b) this.f911b.get(cVar);
            if (bVar2.equals(bVar) && bVar.equals(bVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public b g(J1.c cVar) {
            d dVar = new d(cVar.b(), cVar.c());
            if (!this.f910a.containsKey(dVar)) {
                this.f910a.put(dVar, cVar);
                return this;
            }
            J1.c cVar2 = (J1.c) this.f910a.get(dVar);
            if (cVar2.equals(cVar) && cVar.equals(cVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public b h(j jVar) {
            c cVar = new c(jVar.c(), jVar.b());
            if (!this.f913d.containsKey(cVar)) {
                this.f913d.put(cVar, jVar);
                return this;
            }
            j jVar2 = (j) this.f913d.get(cVar);
            if (jVar2.equals(jVar) && jVar.equals(jVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
        }

        public b i(k kVar) {
            d dVar = new d(kVar.b(), kVar.c());
            if (!this.f912c.containsKey(dVar)) {
                this.f912c.put(dVar, kVar);
                return this;
            }
            k kVar2 = (k) this.f912c.get(dVar);
            if (kVar2.equals(kVar) && kVar.equals(kVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
        }

        public b(r rVar) {
            this.f910a = new HashMap(rVar.f906a);
            this.f911b = new HashMap(rVar.f907b);
            this.f912c = new HashMap(rVar.f908c);
            this.f913d = new HashMap(rVar.f909d);
        }
    }
}

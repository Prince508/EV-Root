package J1;

import B1.v;
import B1.w;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Map f894a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f895b;

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Class f898a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f899b;

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f898a.equals(this.f898a) && cVar.f899b.equals(this.f899b);
        }

        public int hashCode() {
            return Objects.hash(this.f898a, this.f899b);
        }

        public String toString() {
            return this.f898a.getSimpleName() + " with primitive type: " + this.f899b.getSimpleName();
        }

        public c(Class cls, Class cls2) {
            this.f898a = cls;
            this.f899b = cls2;
        }
    }

    public Class c(Class cls) {
        if (this.f895b.containsKey(cls)) {
            return ((w) this.f895b.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public Object d(B1.g gVar, Class cls) {
        c cVar = new c(gVar.getClass(), cls);
        if (this.f894a.containsKey(cVar)) {
            return ((l) this.f894a.get(cVar)).a(gVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available");
    }

    public Object e(v vVar, Class cls) {
        if (!this.f895b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        w wVar = (w) this.f895b.get(cls);
        if (vVar.g().equals(wVar.a()) && wVar.a().equals(vVar.g())) {
            return wVar.c(vVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }

    public n(b bVar) {
        this.f894a = new HashMap(bVar.f896a);
        this.f895b = new HashMap(bVar.f897b);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map f896a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f897b;

        public b() {
            this.f896a = new HashMap();
            this.f897b = new HashMap();
        }

        public n c() {
            return new n(this);
        }

        public b d(l lVar) {
            if (lVar == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(lVar.c(), lVar.d());
            if (!this.f896a.containsKey(cVar)) {
                this.f896a.put(cVar, lVar);
                return this;
            }
            l lVar2 = (l) this.f896a.get(cVar);
            if (lVar2.equals(lVar) && lVar.equals(lVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
        }

        public b e(w wVar) {
            if (wVar == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class b3 = wVar.b();
            if (!this.f897b.containsKey(b3)) {
                this.f897b.put(b3, wVar);
                return this;
            }
            w wVar2 = (w) this.f897b.get(b3);
            if (wVar2.equals(wVar) && wVar.equals(wVar2)) {
                return this;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + b3);
        }

        public b(n nVar) {
            this.f896a = new HashMap(nVar.f894a);
            this.f897b = new HashMap(nVar.f895b);
        }
    }
}

package s2;

import B2.p;
import C2.k;
import java.io.Serializable;
import s2.i;

/* loaded from: classes.dex */
public final class d implements i, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final i f9288e;

    /* renamed from: f, reason: collision with root package name */
    public final i.b f9289f;

    public d(i iVar, i.b bVar) {
        k.e(iVar, "left");
        k.e(bVar, "element");
        this.f9288e = iVar;
        this.f9289f = bVar;
    }

    public static final String q(String str, i.b bVar) {
        k.e(str, "acc");
        k.e(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }

    @Override // s2.i
    public i H(i.c cVar) {
        k.e(cVar, "key");
        if (this.f9289f.a(cVar) != null) {
            return this.f9288e;
        }
        i H3 = this.f9288e.H(cVar);
        return H3 == this.f9288e ? this : H3 == j.f9292e ? this.f9289f : new d(H3, this.f9289f);
    }

    @Override // s2.i
    public i.b a(i.c cVar) {
        k.e(cVar, "key");
        d dVar = this;
        while (true) {
            i.b a3 = dVar.f9289f.a(cVar);
            if (a3 != null) {
                return a3;
            }
            i iVar = dVar.f9288e;
            if (!(iVar instanceof d)) {
                return iVar.a(cVar);
            }
            dVar = (d) iVar;
        }
    }

    @Override // s2.i
    public Object e(Object obj, p pVar) {
        k.e(pVar, "operation");
        return pVar.h(this.f9288e.e(obj, pVar), this.f9289f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.o() == o() && dVar.m(this);
    }

    public int hashCode() {
        return this.f9288e.hashCode() + this.f9289f.hashCode();
    }

    public final boolean j(i.b bVar) {
        return k.a(a(bVar.getKey()), bVar);
    }

    public final boolean m(d dVar) {
        while (j(dVar.f9289f)) {
            i iVar = dVar.f9288e;
            if (!(iVar instanceof d)) {
                k.c(iVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return j((i.b) iVar);
            }
            dVar = (d) iVar;
        }
        return false;
    }

    public final int o() {
        int i3 = 2;
        d dVar = this;
        while (true) {
            i iVar = dVar.f9288e;
            dVar = iVar instanceof d ? (d) iVar : null;
            if (dVar == null) {
                return i3;
            }
            i3++;
        }
    }

    @Override // s2.i
    public i r(i iVar) {
        return i.a.b(this, iVar);
    }

    public String toString() {
        return '[' + ((String) e("", new p() { // from class: s2.c
            @Override // B2.p
            public final Object h(Object obj, Object obj2) {
                String q3;
                q3 = d.q((String) obj, (i.b) obj2);
                return q3;
            }
        })) + ']';
    }
}

package q2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class g implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Object f8866e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8867f;

    public g(Object obj, Object obj2) {
        this.f8866e = obj;
        this.f8867f = obj2;
    }

    public final Object a() {
        return this.f8866e;
    }

    public final Object b() {
        return this.f8867f;
    }

    public final Object c() {
        return this.f8866e;
    }

    public final Object d() {
        return this.f8867f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return C2.k.a(this.f8866e, gVar.f8866e) && C2.k.a(this.f8867f, gVar.f8867f);
    }

    public int hashCode() {
        Object obj = this.f8866e;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f8867f;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f8866e + ", " + this.f8867f + ')';
    }
}

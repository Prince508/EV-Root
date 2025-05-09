package K2;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1145a;

    /* renamed from: b, reason: collision with root package name */
    public final B2.l f1146b;

    public A(Object obj, B2.l lVar) {
        this.f1145a = obj;
        this.f1146b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a3 = (A) obj;
        return C2.k.a(this.f1145a, a3.f1145a) && C2.k.a(this.f1146b, a3.f1146b);
    }

    public int hashCode() {
        Object obj = this.f1145a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f1146b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f1145a + ", onCancellation=" + this.f1146b + ')';
    }
}

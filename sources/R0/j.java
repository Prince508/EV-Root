package R0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1867a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1868b;

    public j(Object obj, Object obj2) {
        this.f1867a = obj;
        this.f1868b = obj2;
    }

    public static j c(Object obj, Object obj2) {
        return new j(obj, obj2);
    }

    public Object a() {
        return this.f1867a;
    }

    public Object b() {
        return this.f1868b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        Object obj2 = this.f1867a;
        if (obj2 == null) {
            if (jVar.f1867a != null) {
                return false;
            }
        } else if (!obj2.equals(jVar.f1867a)) {
            return false;
        }
        Object obj3 = this.f1868b;
        if (obj3 == null) {
            if (jVar.f1868b != null) {
                return false;
            }
        } else if (!obj3.equals(jVar.f1868b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object obj = this.f1867a;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) + 31) * 31;
        Object obj2 = this.f1868b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}

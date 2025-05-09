package z0;

import java.util.List;
import r2.u;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final List f10296a;

    public j(List list) {
        C2.k.e(list, "displayFeatures");
        this.f10296a = list;
    }

    public final List a() {
        return this.f10296a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C2.k.a(j.class, obj.getClass())) {
            return false;
        }
        return C2.k.a(this.f10296a, ((j) obj).f10296a);
    }

    public int hashCode() {
        return this.f10296a.hashCode();
    }

    public String toString() {
        return u.t(this.f10296a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}

package C2;

/* loaded from: classes.dex */
public abstract class r extends c implements H2.h {

    /* renamed from: l, reason: collision with root package name */
    public final boolean f319l;

    public r(Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f319l = (i3 & 2) == 2;
    }

    @Override // C2.c
    public H2.a a() {
        return this.f319l ? this : super.a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return k().equals(rVar.k()) && f().equals(rVar.f()) && m().equals(rVar.m()) && k.a(d(), rVar.d());
        }
        if (obj instanceof H2.h) {
            return obj.equals(a());
        }
        return false;
    }

    public int hashCode() {
        return (((k().hashCode() * 31) + f().hashCode()) * 31) + m().hashCode();
    }

    public H2.h n() {
        if (this.f319l) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (H2.h) super.l();
    }

    public String toString() {
        H2.a a3 = a();
        if (a3 != this) {
            return a3.toString();
        }
        return "property " + f() + " (Kotlin reflection is not available)";
    }
}

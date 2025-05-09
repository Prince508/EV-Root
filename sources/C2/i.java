package C2;

/* loaded from: classes.dex */
public abstract class i extends c implements h, H2.e {

    /* renamed from: l, reason: collision with root package name */
    public final int f314l;

    /* renamed from: m, reason: collision with root package name */
    public final int f315m;

    public i(int i3, Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f314l = i3;
        this.f315m = i4 >> 1;
    }

    @Override // C2.c
    public H2.a c() {
        return u.a(this);
    }

    @Override // C2.h
    public int e() {
        return this.f314l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return f().equals(iVar.f()) && m().equals(iVar.m()) && this.f315m == iVar.f315m && this.f314l == iVar.f314l && k.a(d(), iVar.d()) && k.a(k(), iVar.k());
        }
        if (obj instanceof H2.e) {
            return obj.equals(a());
        }
        return false;
    }

    public int hashCode() {
        return (((k() == null ? 0 : k().hashCode() * 31) + f().hashCode()) * 31) + m().hashCode();
    }

    public String toString() {
        H2.a a3 = a();
        if (a3 != this) {
            return a3.toString();
        }
        if ("<init>".equals(f())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + f() + " (Kotlin reflection is not available)";
    }
}

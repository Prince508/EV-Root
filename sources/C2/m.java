package C2;

/* loaded from: classes.dex */
public final class m implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f317a;

    /* renamed from: b, reason: collision with root package name */
    public final String f318b;

    public m(Class cls, String str) {
        k.e(cls, "jClass");
        k.e(str, "moduleName");
        this.f317a = cls;
        this.f318b = str;
    }

    @Override // C2.d
    public Class c() {
        return this.f317a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && k.a(c(), ((m) obj).c());
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return c() + " (Kotlin reflection is not available)";
    }
}

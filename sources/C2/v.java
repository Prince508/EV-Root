package C2;

/* loaded from: classes.dex */
public class v {
    public H2.b b(Class cls) {
        return new e(cls);
    }

    public H2.d c(Class cls, String str) {
        return new m(cls, str);
    }

    public String f(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String g(l lVar) {
        return f(lVar);
    }

    public H2.e a(i iVar) {
        return iVar;
    }

    public H2.f d(n nVar) {
        return nVar;
    }

    public H2.g e(p pVar) {
        return pVar;
    }
}

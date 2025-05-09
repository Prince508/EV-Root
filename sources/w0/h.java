package w0;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f9931a = new a(null);

    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public static /* synthetic */ h b(a aVar, Object obj, String str, j jVar, g gVar, int i3, Object obj2) {
            if ((i3 & 2) != 0) {
                jVar = c.f9914a.a();
            }
            if ((i3 & 4) != 0) {
                gVar = C0761a.f9909a;
            }
            return aVar.a(obj, str, jVar, gVar);
        }

        public final h a(Object obj, String str, j jVar, g gVar) {
            C2.k.e(obj, "<this>");
            C2.k.e(str, "tag");
            C2.k.e(jVar, "verificationMode");
            C2.k.e(gVar, "logger");
            return new i(obj, str, jVar, gVar);
        }

        public a() {
        }
    }

    public abstract Object a();

    public final String b(Object obj, String str) {
        C2.k.e(obj, "value");
        C2.k.e(str, "message");
        return str + " value: " + obj;
    }

    public abstract h c(String str, B2.l lVar);
}

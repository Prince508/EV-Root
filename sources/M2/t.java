package M2;

/* loaded from: classes.dex */
public interface t {

    public static final class a {
        public static /* synthetic */ boolean a(t tVar, Throwable th, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i3 & 1) != 0) {
                th = null;
            }
            return tVar.q(th);
        }
    }

    void E(B2.l lVar);

    Object j(Object obj, s2.e eVar);

    boolean q(Throwable th);

    Object s(Object obj);

    boolean x();
}

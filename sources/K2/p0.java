package K2;

import java.util.concurrent.CancellationException;
import s2.i;

/* loaded from: classes.dex */
public interface p0 extends i.b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f1211b = b.f1212e;

    public static final class a {
        public static /* synthetic */ void a(p0 p0Var, CancellationException cancellationException, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i3 & 1) != 0) {
                cancellationException = null;
            }
            p0Var.b(cancellationException);
        }

        public static Object b(p0 p0Var, Object obj, B2.p pVar) {
            return i.b.a.a(p0Var, obj, pVar);
        }

        public static i.b c(p0 p0Var, i.c cVar) {
            return i.b.a.b(p0Var, cVar);
        }

        public static /* synthetic */ W d(p0 p0Var, boolean z3, boolean z4, B2.l lVar, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i3 & 1) != 0) {
                z3 = false;
            }
            if ((i3 & 2) != 0) {
                z4 = true;
            }
            return p0Var.p(z3, z4, lVar);
        }

        public static s2.i e(p0 p0Var, i.c cVar) {
            return i.b.a.c(p0Var, cVar);
        }

        public static s2.i f(p0 p0Var, s2.i iVar) {
            return i.b.a.d(p0Var, iVar);
        }
    }

    public static final class b implements i.c {

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ b f1212e = new b();
    }

    void b(CancellationException cancellationException);

    boolean d();

    W g(B2.l lVar);

    p0 getParent();

    CancellationException i();

    boolean k();

    r n(InterfaceC0254t interfaceC0254t);

    W p(boolean z3, boolean z4, B2.l lVar);
}

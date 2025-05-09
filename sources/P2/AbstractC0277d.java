package P2;

/* renamed from: P2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0277d {

    /* renamed from: a, reason: collision with root package name */
    public static final F f1759a = new F("CLOSED");

    public static final AbstractC0278e b(AbstractC0278e abstractC0278e) {
        while (true) {
            Object f3 = abstractC0278e.f();
            if (f3 == f1759a) {
                return abstractC0278e;
            }
            AbstractC0278e abstractC0278e2 = (AbstractC0278e) f3;
            if (abstractC0278e2 != null) {
                abstractC0278e = abstractC0278e2;
            } else if (abstractC0278e.j()) {
                return abstractC0278e;
            }
        }
    }

    public static final Object c(C c3, long j3, B2.p pVar) {
        while (true) {
            if (c3.f1739g >= j3 && !c3.h()) {
                return D.a(c3);
            }
            Object f3 = c3.f();
            if (f3 == f1759a) {
                return D.a(f1759a);
            }
            C c4 = (C) ((AbstractC0278e) f3);
            if (c4 == null) {
                c4 = (C) pVar.h(Long.valueOf(c3.f1739g + 1), c3);
                if (c3.l(c4)) {
                    if (c3.h()) {
                        c3.k();
                    }
                }
            }
            c3 = c4;
        }
    }
}

package K2;

import P2.C0283j;

/* renamed from: K2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0249o {
    public static final void a(InterfaceC0243l interfaceC0243l, W w3) {
        interfaceC0243l.G(new X(w3));
    }

    public static final C0245m b(s2.e eVar) {
        if (!(eVar instanceof C0283j)) {
            return new C0245m(eVar, 1);
        }
        C0245m j3 = ((C0283j) eVar).j();
        if (j3 != null) {
            if (!j3.M()) {
                j3 = null;
            }
            if (j3 != null) {
                return j3;
            }
        }
        return new C0245m(eVar, 2);
    }
}

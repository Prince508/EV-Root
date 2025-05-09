package P2;

import K2.J0;
import K2.L0;
import K2.Z;
import K2.p0;
import java.util.concurrent.CancellationException;
import q2.h;

/* renamed from: P2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0284k {

    /* renamed from: a, reason: collision with root package name */
    public static final F f1770a = new F("UNDEFINED");

    /* renamed from: b, reason: collision with root package name */
    public static final F f1771b = new F("REUSABLE_CLAIMED");

    public static final void b(s2.e eVar, Object obj, B2.l lVar) {
        if (!(eVar instanceof C0283j)) {
            eVar.u(obj);
            return;
        }
        C0283j c0283j = (C0283j) eVar;
        Object b3 = K2.D.b(obj, lVar);
        if (c0283j.f1766h.j(c0283j.c())) {
            c0283j.f1768j = b3;
            c0283j.f1174g = 1;
            c0283j.f1766h.c(c0283j.c(), c0283j);
            return;
        }
        Z b4 = J0.f1157a.b();
        if (b4.x()) {
            c0283j.f1768j = b3;
            c0283j.f1174g = 1;
            b4.t(c0283j);
            return;
        }
        b4.v(true);
        try {
            p0 p0Var = (p0) c0283j.c().a(p0.f1211b);
            if (p0Var == null || p0Var.d()) {
                s2.e eVar2 = c0283j.f1767i;
                Object obj2 = c0283j.f1769k;
                s2.i c3 = eVar2.c();
                Object c4 = J.c(c3, obj2);
                L0 g3 = c4 != J.f1745a ? K2.E.g(eVar2, c3, c4) : null;
                try {
                    c0283j.f1767i.u(obj);
                    q2.n nVar = q2.n.f8874a;
                } finally {
                    if (g3 == null || g3.T0()) {
                        J.a(c3, c4);
                    }
                }
            } else {
                CancellationException i3 = p0Var.i();
                c0283j.b(b3, i3);
                h.a aVar = q2.h.f8868e;
                c0283j.u(q2.h.a(q2.i.a(i3)));
            }
            while (b4.G()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(s2.e eVar, Object obj, B2.l lVar, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        b(eVar, obj, lVar);
    }
}

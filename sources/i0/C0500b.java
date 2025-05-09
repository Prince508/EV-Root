package i0;

import C2.g;
import C2.k;
import i0.AbstractC0499a;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500b extends AbstractC0499a {
    public C0500b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void b(AbstractC0499a.b bVar, Object obj) {
        k.e(bVar, "key");
        a().put(bVar, obj);
    }

    public C0500b(AbstractC0499a abstractC0499a) {
        k.e(abstractC0499a, "initialExtras");
        a().putAll(abstractC0499a.a());
    }

    public /* synthetic */ C0500b(AbstractC0499a abstractC0499a, int i3, g gVar) {
        this((i3 & 1) != 0 ? AbstractC0499a.C0123a.f7460b : abstractC0499a);
    }
}

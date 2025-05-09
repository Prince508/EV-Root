package P2;

import q2.AbstractC0672a;

/* loaded from: classes.dex */
public abstract class x {

    public static final class a extends C2.l implements B2.l {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ B2.l f1798f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Object f1799g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ s2.i f1800h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(B2.l lVar, Object obj, s2.i iVar) {
            super(1);
            this.f1798f = lVar;
            this.f1799g = obj;
            this.f1800h = iVar;
        }

        public final void a(Throwable th) {
            x.b(this.f1798f, this.f1799g, this.f1800h);
        }

        @Override // B2.l
        public /* bridge */ /* synthetic */ Object j(Object obj) {
            a((Throwable) obj);
            return q2.n.f8874a;
        }
    }

    public static final B2.l a(B2.l lVar, Object obj, s2.i iVar) {
        return new a(lVar, obj, iVar);
    }

    public static final void b(B2.l lVar, Object obj, s2.i iVar) {
        O c3 = c(lVar, obj, null);
        if (c3 != null) {
            K2.H.a(iVar, c3);
        }
    }

    public static final O c(B2.l lVar, Object obj, O o3) {
        try {
            lVar.j(obj);
            return o3;
        } catch (Throwable th) {
            if (o3 != null && o3.getCause() != th) {
                AbstractC0672a.a(o3, th);
                return o3;
            }
            return new O("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static /* synthetic */ O d(B2.l lVar, Object obj, O o3, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            o3 = null;
        }
        return c(lVar, obj, o3);
    }
}

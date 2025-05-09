package K2;

/* renamed from: K2.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259y {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1238a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0239j f1239b;

    /* renamed from: c, reason: collision with root package name */
    public final B2.l f1240c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1241d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f1242e;

    public C0259y(Object obj, AbstractC0239j abstractC0239j, B2.l lVar, Object obj2, Throwable th) {
        this.f1238a = obj;
        this.f1239b = abstractC0239j;
        this.f1240c = lVar;
        this.f1241d = obj2;
        this.f1242e = th;
    }

    public static /* synthetic */ C0259y b(C0259y c0259y, Object obj, AbstractC0239j abstractC0239j, B2.l lVar, Object obj2, Throwable th, int i3, Object obj3) {
        if ((i3 & 1) != 0) {
            obj = c0259y.f1238a;
        }
        if ((i3 & 2) != 0) {
            abstractC0239j = c0259y.f1239b;
        }
        if ((i3 & 4) != 0) {
            lVar = c0259y.f1240c;
        }
        if ((i3 & 8) != 0) {
            obj2 = c0259y.f1241d;
        }
        if ((i3 & 16) != 0) {
            th = c0259y.f1242e;
        }
        Throwable th2 = th;
        B2.l lVar2 = lVar;
        return c0259y.a(obj, abstractC0239j, lVar2, obj2, th2);
    }

    public final C0259y a(Object obj, AbstractC0239j abstractC0239j, B2.l lVar, Object obj2, Throwable th) {
        return new C0259y(obj, abstractC0239j, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f1242e != null;
    }

    public final void d(C0245m c0245m, Throwable th) {
        AbstractC0239j abstractC0239j = this.f1239b;
        if (abstractC0239j != null) {
            c0245m.j(abstractC0239j, th);
        }
        B2.l lVar = this.f1240c;
        if (lVar != null) {
            c0245m.k(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0259y)) {
            return false;
        }
        C0259y c0259y = (C0259y) obj;
        return C2.k.a(this.f1238a, c0259y.f1238a) && C2.k.a(this.f1239b, c0259y.f1239b) && C2.k.a(this.f1240c, c0259y.f1240c) && C2.k.a(this.f1241d, c0259y.f1241d) && C2.k.a(this.f1242e, c0259y.f1242e);
    }

    public int hashCode() {
        Object obj = this.f1238a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC0239j abstractC0239j = this.f1239b;
        int hashCode2 = (hashCode + (abstractC0239j == null ? 0 : abstractC0239j.hashCode())) * 31;
        B2.l lVar = this.f1240c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f1241d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f1242e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f1238a + ", cancelHandler=" + this.f1239b + ", onCancellation=" + this.f1240c + ", idempotentResume=" + this.f1241d + ", cancelCause=" + this.f1242e + ')';
    }

    public /* synthetic */ C0259y(Object obj, AbstractC0239j abstractC0239j, B2.l lVar, Object obj2, Throwable th, int i3, C2.g gVar) {
        this(obj, (i3 & 2) != 0 ? null : abstractC0239j, (i3 & 4) != 0 ? null : lVar, (i3 & 8) != 0 ? null : obj2, (i3 & 16) != 0 ? null : th);
    }
}

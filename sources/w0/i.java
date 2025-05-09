package w0;

/* loaded from: classes.dex */
public final class i extends h {

    /* renamed from: b, reason: collision with root package name */
    public final Object f9932b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9933c;

    /* renamed from: d, reason: collision with root package name */
    public final j f9934d;

    /* renamed from: e, reason: collision with root package name */
    public final g f9935e;

    public i(Object obj, String str, j jVar, g gVar) {
        C2.k.e(obj, "value");
        C2.k.e(str, "tag");
        C2.k.e(jVar, "verificationMode");
        C2.k.e(gVar, "logger");
        this.f9932b = obj;
        this.f9933c = str;
        this.f9934d = jVar;
        this.f9935e = gVar;
    }

    @Override // w0.h
    public Object a() {
        return this.f9932b;
    }

    @Override // w0.h
    public h c(String str, B2.l lVar) {
        C2.k.e(str, "message");
        C2.k.e(lVar, "condition");
        return ((Boolean) lVar.j(this.f9932b)).booleanValue() ? this : new f(this.f9932b, this.f9933c, str, this.f9935e, this.f9934d);
    }
}

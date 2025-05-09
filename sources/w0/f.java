package w0;

import r2.AbstractC0697j;

/* loaded from: classes.dex */
public final class f extends h {

    /* renamed from: b, reason: collision with root package name */
    public final Object f9924b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9925c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9926d;

    /* renamed from: e, reason: collision with root package name */
    public final g f9927e;

    /* renamed from: f, reason: collision with root package name */
    public final j f9928f;

    /* renamed from: g, reason: collision with root package name */
    public final l f9929g;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9930a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.STRICT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.LOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[j.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9930a = iArr;
        }
    }

    public f(Object obj, String str, String str2, g gVar, j jVar) {
        C2.k.e(obj, "value");
        C2.k.e(str, "tag");
        C2.k.e(str2, "message");
        C2.k.e(gVar, "logger");
        C2.k.e(jVar, "verificationMode");
        this.f9924b = obj;
        this.f9925c = str;
        this.f9926d = str2;
        this.f9927e = gVar;
        this.f9928f = jVar;
        l lVar = new l(b(obj, str2));
        StackTraceElement[] stackTrace = lVar.getStackTrace();
        C2.k.d(stackTrace, "stackTrace");
        lVar.setStackTrace((StackTraceElement[]) AbstractC0697j.g(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.f9929g = lVar;
    }

    @Override // w0.h
    public Object a() {
        int i3 = a.f9930a[this.f9928f.ordinal()];
        if (i3 == 1) {
            throw this.f9929g;
        }
        if (i3 == 2) {
            this.f9927e.a(this.f9925c, b(this.f9924b, this.f9926d));
            return null;
        }
        if (i3 == 3) {
            return null;
        }
        throw new q2.f();
    }

    @Override // w0.h
    public h c(String str, B2.l lVar) {
        C2.k.e(str, "message");
        C2.k.e(lVar, "condition");
        return this;
    }
}

package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0336w {

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC0336w f3853h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC0336w f3854i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC0336w f3855j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC0336w f3856k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC0336w f3857l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC0336w f3858m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC0336w f3859n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC0336w f3860o;

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC0336w f3861p;

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC0336w f3862q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC0336w[] f3863r;

    /* renamed from: e, reason: collision with root package name */
    public final Class f3864e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f3865f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3866g;

    static {
        EnumC0336w enumC0336w = new EnumC0336w("VOID", 0, Void.class, Void.class, null);
        f3853h = enumC0336w;
        Class cls = Integer.TYPE;
        EnumC0336w enumC0336w2 = new EnumC0336w("INT", 1, cls, Integer.class, 0);
        f3854i = enumC0336w2;
        EnumC0336w enumC0336w3 = new EnumC0336w("LONG", 2, Long.TYPE, Long.class, 0L);
        f3855j = enumC0336w3;
        EnumC0336w enumC0336w4 = new EnumC0336w("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f3856k = enumC0336w4;
        EnumC0336w enumC0336w5 = new EnumC0336w("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f3857l = enumC0336w5;
        EnumC0336w enumC0336w6 = new EnumC0336w("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f3858m = enumC0336w6;
        EnumC0336w enumC0336w7 = new EnumC0336w("STRING", 6, String.class, String.class, "");
        f3859n = enumC0336w7;
        EnumC0336w enumC0336w8 = new EnumC0336w("BYTE_STRING", 7, AbstractC0320f.class, AbstractC0320f.class, AbstractC0320f.f3626f);
        f3860o = enumC0336w8;
        EnumC0336w enumC0336w9 = new EnumC0336w("ENUM", 8, cls, Integer.class, null);
        f3861p = enumC0336w9;
        EnumC0336w enumC0336w10 = new EnumC0336w("MESSAGE", 9, Object.class, Object.class, null);
        f3862q = enumC0336w10;
        f3863r = new EnumC0336w[]{enumC0336w, enumC0336w2, enumC0336w3, enumC0336w4, enumC0336w5, enumC0336w6, enumC0336w7, enumC0336w8, enumC0336w9, enumC0336w10};
    }

    public EnumC0336w(String str, int i3, Class cls, Class cls2, Object obj) {
        this.f3864e = cls;
        this.f3865f = cls2;
        this.f3866g = obj;
    }

    public static EnumC0336w valueOf(String str) {
        return (EnumC0336w) Enum.valueOf(EnumC0336w.class, str);
    }

    public static EnumC0336w[] values() {
        return (EnumC0336w[]) f3863r.clone();
    }

    public Class c() {
        return this.f3865f;
    }
}

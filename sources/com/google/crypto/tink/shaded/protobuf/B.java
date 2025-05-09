package com.google.crypto.tink.shaded.protobuf;

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
/* loaded from: classes.dex */
public final class B {

    /* renamed from: h, reason: collision with root package name */
    public static final B f5714h;

    /* renamed from: i, reason: collision with root package name */
    public static final B f5715i;

    /* renamed from: j, reason: collision with root package name */
    public static final B f5716j;

    /* renamed from: k, reason: collision with root package name */
    public static final B f5717k;

    /* renamed from: l, reason: collision with root package name */
    public static final B f5718l;

    /* renamed from: m, reason: collision with root package name */
    public static final B f5719m;

    /* renamed from: n, reason: collision with root package name */
    public static final B f5720n;

    /* renamed from: o, reason: collision with root package name */
    public static final B f5721o;

    /* renamed from: p, reason: collision with root package name */
    public static final B f5722p;

    /* renamed from: q, reason: collision with root package name */
    public static final B f5723q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ B[] f5724r;

    /* renamed from: e, reason: collision with root package name */
    public final Class f5725e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f5726f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5727g;

    static {
        B b3 = new B("VOID", 0, Void.class, Void.class, null);
        f5714h = b3;
        Class cls = Integer.TYPE;
        B b4 = new B("INT", 1, cls, Integer.class, 0);
        f5715i = b4;
        B b5 = new B("LONG", 2, Long.TYPE, Long.class, 0L);
        f5716j = b5;
        B b6 = new B("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f5717k = b6;
        B b7 = new B("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f5718l = b7;
        B b8 = new B("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f5719m = b8;
        B b9 = new B("STRING", 6, String.class, String.class, "");
        f5720n = b9;
        B b10 = new B("BYTE_STRING", 7, AbstractC0417h.class, AbstractC0417h.class, AbstractC0417h.f5793f);
        f5721o = b10;
        B b11 = new B("ENUM", 8, cls, Integer.class, null);
        f5722p = b11;
        B b12 = new B("MESSAGE", 9, Object.class, Object.class, null);
        f5723q = b12;
        f5724r = new B[]{b3, b4, b5, b6, b7, b8, b9, b10, b11, b12};
    }

    public B(String str, int i3, Class cls, Class cls2, Object obj) {
        this.f5725e = cls;
        this.f5726f = cls2;
        this.f5727g = obj;
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f5724r.clone();
    }

    public Class c() {
        return this.f5726f;
    }
}

package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3713a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    public static final int f3714b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    public static final int f3715c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f3716d = c(3, 2);

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
    public static class b {

        /* renamed from: g, reason: collision with root package name */
        public static final b f3717g;

        /* renamed from: h, reason: collision with root package name */
        public static final b f3718h;

        /* renamed from: i, reason: collision with root package name */
        public static final b f3719i;

        /* renamed from: j, reason: collision with root package name */
        public static final b f3720j;

        /* renamed from: k, reason: collision with root package name */
        public static final b f3721k;

        /* renamed from: l, reason: collision with root package name */
        public static final b f3722l;

        /* renamed from: m, reason: collision with root package name */
        public static final b f3723m;

        /* renamed from: n, reason: collision with root package name */
        public static final b f3724n;

        /* renamed from: o, reason: collision with root package name */
        public static final b f3725o;

        /* renamed from: p, reason: collision with root package name */
        public static final b f3726p;

        /* renamed from: q, reason: collision with root package name */
        public static final b f3727q;

        /* renamed from: r, reason: collision with root package name */
        public static final b f3728r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f3729s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f3730t;

        /* renamed from: u, reason: collision with root package name */
        public static final b f3731u;

        /* renamed from: v, reason: collision with root package name */
        public static final b f3732v;

        /* renamed from: w, reason: collision with root package name */
        public static final b f3733w;

        /* renamed from: x, reason: collision with root package name */
        public static final b f3734x;

        /* renamed from: y, reason: collision with root package name */
        public static final /* synthetic */ b[] f3735y;

        /* renamed from: e, reason: collision with root package name */
        public final c f3736e;

        /* renamed from: f, reason: collision with root package name */
        public final int f3737f;

        public enum a extends b {
            public a(String str, int i3, c cVar, int i4) {
                super(str, i3, cVar, i4);
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.l0$b$b, reason: collision with other inner class name */
        public enum C0083b extends b {
            public C0083b(String str, int i3, c cVar, int i4) {
                super(str, i3, cVar, i4);
            }
        }

        public enum c extends b {
            public c(String str, int i3, c cVar, int i4) {
                super(str, i3, cVar, i4);
            }
        }

        public enum d extends b {
            public d(String str, int i3, c cVar, int i4) {
                super(str, i3, cVar, i4);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f3717g = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f3718h = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f3719i = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f3720j = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f3721k = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f3722l = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f3723m = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f3724n = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f3725o = aVar;
            c cVar3 = c.MESSAGE;
            C0083b c0083b = new C0083b("GROUP", 9, cVar3, 3);
            f3726p = c0083b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f3727q = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f3728r = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f3729s = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f3730t = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f3731u = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f3732v = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f3733w = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f3734x = bVar14;
            f3735y = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0083b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f3735y.clone();
        }

        public c c() {
            return this.f3736e;
        }

        public int f() {
            return this.f3737f;
        }

        public b(String str, int i3, c cVar, int i4) {
            this.f3736e = cVar;
            this.f3737f = i4;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC0320f.f3626f),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: e, reason: collision with root package name */
        public final Object f3748e;

        c(Object obj) {
            this.f3748e = obj;
        }
    }

    public static int a(int i3) {
        return i3 >>> 3;
    }

    public static int b(int i3) {
        return i3 & 7;
    }

    public static int c(int i3, int i4) {
        return (i3 << 3) | i4;
    }
}

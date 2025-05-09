package X;

import X.g;
import androidx.datastore.preferences.protobuf.AbstractC0333t;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;

/* loaded from: classes.dex */
public final class h extends AbstractC0333t implements K {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile S PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends AbstractC0333t.a implements K {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a A(g.a aVar) {
            p();
            ((h) this.f3836f).f0(aVar);
            return this;
        }

        public a u(boolean z3) {
            p();
            ((h) this.f3836f).Z(z3);
            return this;
        }

        public a v(double d3) {
            p();
            ((h) this.f3836f).a0(d3);
            return this;
        }

        public a w(float f3) {
            p();
            ((h) this.f3836f).b0(f3);
            return this;
        }

        public a x(int i3) {
            p();
            ((h) this.f3836f).c0(i3);
            return this;
        }

        public a y(long j3) {
            p();
            ((h) this.f3836f).d0(j3);
            return this;
        }

        public a z(String str) {
            p();
            ((h) this.f3836f).e0(str);
            return this;
        }

        public a() {
            super(h.DEFAULT_INSTANCE);
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);


        /* renamed from: e, reason: collision with root package name */
        public final int f2367e;

        b(int i3) {
            this.f2367e = i3;
        }

        public static b c(int i3) {
            switch (i3) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0333t.F(h.class, hVar);
    }

    public static h Q() {
        return DEFAULT_INSTANCE;
    }

    public static a Y() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public boolean P() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public double R() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float S() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int T() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long U() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String V() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g W() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.L();
    }

    public b X() {
        return b.c(this.valueCase_);
    }

    public final void Z(boolean z3) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z3);
    }

    public final void a0(double d3) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d3);
    }

    public final void b0(float f3) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f3);
    }

    public final void c0(int i3) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i3);
    }

    public final void d0(long j3) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j3);
    }

    public final void e0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    public final void f0(g.a aVar) {
        this.value_ = aVar.m();
        this.valueCase_ = 6;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0333t
    public final Object s(AbstractC0333t.d dVar, Object obj, Object obj2) {
        S s3;
        e eVar = null;
        switch (e.f2356a[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0333t.C(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                S s4 = PARSER;
                if (s4 != null) {
                    return s4;
                }
                synchronized (h.class) {
                    try {
                        s3 = PARSER;
                        if (s3 == null) {
                            s3 = new AbstractC0333t.b(DEFAULT_INSTANCE);
                            PARSER = s3;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return s3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

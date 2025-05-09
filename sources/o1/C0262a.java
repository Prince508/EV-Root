package O1;

import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0432x;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* renamed from: O1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262a extends AbstractC0432x implements P {
    private static final C0262a DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0417h keyValue_ = AbstractC0417h.f5793f;
    private C0264c params_;
    private int version_;

    /* renamed from: O1.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0041a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1554a;

        static {
            int[] iArr = new int[AbstractC0432x.d.values().length];
            f1554a = iArr;
            try {
                iArr[AbstractC0432x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1554a[AbstractC0432x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1554a[AbstractC0432x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1554a[AbstractC0432x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1554a[AbstractC0432x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1554a[AbstractC0432x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1554a[AbstractC0432x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: O1.a$b */
    public static final class b extends AbstractC0432x.a implements P {
        public /* synthetic */ b(C0041a c0041a) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P
        public /* bridge */ /* synthetic */ O c() {
            return super.o();
        }

        public /* bridge */ /* synthetic */ Object clone() {
            return super.l();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.O.a
        public /* bridge */ /* synthetic */ O d() {
            return super.k();
        }

        public b s(AbstractC0417h abstractC0417h) {
            m();
            ((C0262a) this.f5998f).d0(abstractC0417h);
            return this;
        }

        public b t(C0264c c0264c) {
            m();
            ((C0262a) this.f5998f).e0(c0264c);
            return this;
        }

        public b u(int i3) {
            m();
            ((C0262a) this.f5998f).f0(i3);
            return this;
        }

        public b() {
            super(C0262a.DEFAULT_INSTANCE);
        }
    }

    static {
        C0262a c0262a = new C0262a();
        DEFAULT_INSTANCE = c0262a;
        AbstractC0432x.Q(C0262a.class, c0262a);
    }

    public static b b0() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public static C0262a c0(AbstractC0417h abstractC0417h, C0425p c0425p) {
        return (C0262a) AbstractC0432x.K(DEFAULT_INSTANCE, abstractC0417h, c0425p);
    }

    public AbstractC0417h Y() {
        return this.keyValue_;
    }

    public C0264c Z() {
        C0264c c0264c = this.params_;
        return c0264c == null ? C0264c.W() : c0264c;
    }

    public int a0() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public /* bridge */ /* synthetic */ O.a b() {
        return super.H();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ O c() {
        return super.w();
    }

    public final void d0(AbstractC0417h abstractC0417h) {
        abstractC0417h.getClass();
        this.keyValue_ = abstractC0417h;
    }

    public final void e0(C0264c c0264c) {
        c0264c.getClass();
        this.params_ = c0264c;
    }

    public final void f0(int i3) {
        this.version_ = i3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0432x
    public final Object t(AbstractC0432x.d dVar, Object obj, Object obj2) {
        X x3;
        C0041a c0041a = null;
        switch (C0041a.f1554a[dVar.ordinal()]) {
            case 1:
                return new C0262a();
            case 2:
                return new b(c0041a);
            case 3:
                return AbstractC0432x.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x4 = PARSER;
                if (x4 != null) {
                    return x4;
                }
                synchronized (C0262a.class) {
                    try {
                        x3 = PARSER;
                        if (x3 == null) {
                            x3 = new AbstractC0432x.b(DEFAULT_INSTANCE);
                            PARSER = x3;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return x3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

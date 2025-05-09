package O1;

import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0432x;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* renamed from: O1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270i extends AbstractC0432x implements P {
    private static final C0270i DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC0417h keyValue_ = AbstractC0417h.f5793f;
    private C0272k params_;
    private int version_;

    /* renamed from: O1.i$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1562a;

        static {
            int[] iArr = new int[AbstractC0432x.d.values().length];
            f1562a = iArr;
            try {
                iArr[AbstractC0432x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1562a[AbstractC0432x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1562a[AbstractC0432x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1562a[AbstractC0432x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1562a[AbstractC0432x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1562a[AbstractC0432x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1562a[AbstractC0432x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: O1.i$b */
    public static final class b extends AbstractC0432x.a implements P {
        public /* synthetic */ b(a aVar) {
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
            ((C0270i) this.f5998f).d0(abstractC0417h);
            return this;
        }

        public b t(C0272k c0272k) {
            m();
            ((C0270i) this.f5998f).e0(c0272k);
            return this;
        }

        public b u(int i3) {
            m();
            ((C0270i) this.f5998f).f0(i3);
            return this;
        }

        public b() {
            super(C0270i.DEFAULT_INSTANCE);
        }
    }

    static {
        C0270i c0270i = new C0270i();
        DEFAULT_INSTANCE = c0270i;
        AbstractC0432x.Q(C0270i.class, c0270i);
    }

    public static b b0() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public static C0270i c0(AbstractC0417h abstractC0417h, C0425p c0425p) {
        return (C0270i) AbstractC0432x.K(DEFAULT_INSTANCE, abstractC0417h, c0425p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(AbstractC0417h abstractC0417h) {
        abstractC0417h.getClass();
        this.keyValue_ = abstractC0417h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i3) {
        this.version_ = i3;
    }

    public AbstractC0417h Y() {
        return this.keyValue_;
    }

    public C0272k Z() {
        C0272k c0272k = this.params_;
        return c0272k == null ? C0272k.W() : c0272k;
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

    public final void e0(C0272k c0272k) {
        c0272k.getClass();
        this.params_ = c0272k;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0432x
    public final Object t(AbstractC0432x.d dVar, Object obj, Object obj2) {
        X x3;
        a aVar = null;
        switch (a.f1562a[dVar.ordinal()]) {
            case 1:
                return new C0270i();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0432x.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x4 = PARSER;
                if (x4 != null) {
                    return x4;
                }
                synchronized (C0270i.class) {
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

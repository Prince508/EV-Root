package O1;

import com.google.crypto.tink.shaded.protobuf.AbstractC0432x;
import com.google.crypto.tink.shaded.protobuf.AbstractC0434z;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* loaded from: classes.dex */
public final class J extends AbstractC0432x implements P {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final J DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile X PARSER;
    private String configName_ = "";
    private AbstractC0434z.d entry_ = AbstractC0432x.u();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1551a;

        static {
            int[] iArr = new int[AbstractC0432x.d.values().length];
            f1551a = iArr;
            try {
                iArr[AbstractC0432x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1551a[AbstractC0432x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1551a[AbstractC0432x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1551a[AbstractC0432x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1551a[AbstractC0432x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1551a[AbstractC0432x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1551a[AbstractC0432x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

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

        public b() {
            super(J.DEFAULT_INSTANCE);
        }
    }

    static {
        J j3 = new J();
        DEFAULT_INSTANCE = j3;
        AbstractC0432x.Q(J.class, j3);
    }

    public static J V() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public /* bridge */ /* synthetic */ O.a b() {
        return super.H();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ O c() {
        return super.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0432x
    public final Object t(AbstractC0432x.d dVar, Object obj, Object obj2) {
        X x3;
        a aVar = null;
        switch (a.f1551a[dVar.ordinal()]) {
            case 1:
                return new J();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0432x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", B.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x4 = PARSER;
                if (x4 != null) {
                    return x4;
                }
                synchronized (J.class) {
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

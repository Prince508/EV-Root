package O1;

import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0432x;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* loaded from: classes.dex */
public final class s extends AbstractC0432x implements P {
    private static final s DEFAULT_INSTANCE;
    private static volatile X PARSER;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1572a;

        static {
            int[] iArr = new int[AbstractC0432x.d.values().length];
            f1572a = iArr;
            try {
                iArr[AbstractC0432x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1572a[AbstractC0432x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1572a[AbstractC0432x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1572a[AbstractC0432x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1572a[AbstractC0432x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1572a[AbstractC0432x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1572a[AbstractC0432x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
            super(s.DEFAULT_INSTANCE);
        }
    }

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        AbstractC0432x.Q(s.class, sVar);
    }

    public static s V() {
        return DEFAULT_INSTANCE;
    }

    public static s W(AbstractC0417h abstractC0417h, C0425p c0425p) {
        return (s) AbstractC0432x.K(DEFAULT_INSTANCE, abstractC0417h, c0425p);
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
        switch (a.f1572a[dVar.ordinal()]) {
            case 1:
                return new s();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0432x.I(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x4 = PARSER;
                if (x4 != null) {
                    return x4;
                }
                synchronized (s.class) {
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

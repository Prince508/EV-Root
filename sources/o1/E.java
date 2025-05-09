package O1;

import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0432x;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* loaded from: classes.dex */
public final class E extends AbstractC0432x implements P {
    private static final E DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private F params_;
    private int version_;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1538a;

        static {
            int[] iArr = new int[AbstractC0432x.d.values().length];
            f1538a = iArr;
            try {
                iArr[AbstractC0432x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1538a[AbstractC0432x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1538a[AbstractC0432x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1538a[AbstractC0432x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1538a[AbstractC0432x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1538a[AbstractC0432x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1538a[AbstractC0432x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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

        public b s(F f3) {
            m();
            ((E) this.f5998f).b0(f3);
            return this;
        }

        public b t(int i3) {
            m();
            ((E) this.f5998f).c0(i3);
            return this;
        }

        public b() {
            super(E.DEFAULT_INSTANCE);
        }
    }

    static {
        E e3 = new E();
        DEFAULT_INSTANCE = e3;
        AbstractC0432x.Q(E.class, e3);
    }

    public static b Z() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public static E a0(AbstractC0417h abstractC0417h, C0425p c0425p) {
        return (E) AbstractC0432x.K(DEFAULT_INSTANCE, abstractC0417h, c0425p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int i3) {
        this.version_ = i3;
    }

    public F X() {
        F f3 = this.params_;
        return f3 == null ? F.V() : f3;
    }

    public int Y() {
        return this.version_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public /* bridge */ /* synthetic */ O.a b() {
        return super.H();
    }

    public final void b0(F f3) {
        f3.getClass();
        this.params_ = f3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ O c() {
        return super.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0432x
    public final Object t(AbstractC0432x.d dVar, Object obj, Object obj2) {
        X x3;
        a aVar = null;
        switch (a.f1538a[dVar.ordinal()]) {
            case 1:
                return new E();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0432x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x4 = PARSER;
                if (x4 != null) {
                    return x4;
                }
                synchronized (E.class) {
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

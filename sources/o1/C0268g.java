package O1;

import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0432x;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* renamed from: O1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268g extends AbstractC0432x implements P {
    private static final C0268g DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile X PARSER;
    private int keySize_;
    private C0269h params_;

    /* renamed from: O1.g$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1560a;

        static {
            int[] iArr = new int[AbstractC0432x.d.values().length];
            f1560a = iArr;
            try {
                iArr[AbstractC0432x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1560a[AbstractC0432x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1560a[AbstractC0432x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1560a[AbstractC0432x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1560a[AbstractC0432x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1560a[AbstractC0432x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1560a[AbstractC0432x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: O1.g$b */
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

        public b s(int i3) {
            m();
            ((C0268g) this.f5998f).c0(i3);
            return this;
        }

        public b t(C0269h c0269h) {
            m();
            ((C0268g) this.f5998f).d0(c0269h);
            return this;
        }

        public b() {
            super(C0268g.DEFAULT_INSTANCE);
        }
    }

    static {
        C0268g c0268g = new C0268g();
        DEFAULT_INSTANCE = c0268g;
        AbstractC0432x.Q(C0268g.class, c0268g);
    }

    public static C0268g X() {
        return DEFAULT_INSTANCE;
    }

    public static b a0() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public static C0268g b0(AbstractC0417h abstractC0417h, C0425p c0425p) {
        return (C0268g) AbstractC0432x.K(DEFAULT_INSTANCE, abstractC0417h, c0425p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int i3) {
        this.keySize_ = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(C0269h c0269h) {
        c0269h.getClass();
        this.params_ = c0269h;
    }

    public int Y() {
        return this.keySize_;
    }

    public C0269h Z() {
        C0269h c0269h = this.params_;
        return c0269h == null ? C0269h.W() : c0269h;
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
        switch (a.f1560a[dVar.ordinal()]) {
            case 1:
                return new C0268g();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0432x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x4 = PARSER;
                if (x4 != null) {
                    return x4;
                }
                synchronized (C0268g.class) {
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

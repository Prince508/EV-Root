package O1;

import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.AbstractC0432x;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* renamed from: O1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265d extends AbstractC0432x implements P {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C0265d DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile X PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C0267f aesCtrKey_;
    private v hmacKey_;
    private int version_;

    /* renamed from: O1.d$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1557a;

        static {
            int[] iArr = new int[AbstractC0432x.d.values().length];
            f1557a = iArr;
            try {
                iArr[AbstractC0432x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1557a[AbstractC0432x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1557a[AbstractC0432x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1557a[AbstractC0432x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1557a[AbstractC0432x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1557a[AbstractC0432x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1557a[AbstractC0432x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: O1.d$b */
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

        public b s(C0267f c0267f) {
            m();
            ((C0265d) this.f5998f).d0(c0267f);
            return this;
        }

        public b t(v vVar) {
            m();
            ((C0265d) this.f5998f).e0(vVar);
            return this;
        }

        public b u(int i3) {
            m();
            ((C0265d) this.f5998f).f0(i3);
            return this;
        }

        public b() {
            super(C0265d.DEFAULT_INSTANCE);
        }
    }

    static {
        C0265d c0265d = new C0265d();
        DEFAULT_INSTANCE = c0265d;
        AbstractC0432x.Q(C0265d.class, c0265d);
    }

    public static b b0() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public static C0265d c0(AbstractC0417h abstractC0417h, C0425p c0425p) {
        return (C0265d) AbstractC0432x.K(DEFAULT_INSTANCE, abstractC0417h, c0425p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(int i3) {
        this.version_ = i3;
    }

    public C0267f Y() {
        C0267f c0267f = this.aesCtrKey_;
        return c0267f == null ? C0267f.Y() : c0267f;
    }

    public v Z() {
        v vVar = this.hmacKey_;
        return vVar == null ? v.Y() : vVar;
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

    public final void d0(C0267f c0267f) {
        c0267f.getClass();
        this.aesCtrKey_ = c0267f;
    }

    public final void e0(v vVar) {
        vVar.getClass();
        this.hmacKey_ = vVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0432x
    public final Object t(AbstractC0432x.d dVar, Object obj, Object obj2) {
        X x3;
        a aVar = null;
        switch (a.f1557a[dVar.ordinal()]) {
            case 1:
                return new C0265d();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0432x.I(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x4 = PARSER;
                if (x4 != null) {
                    return x4;
                }
                synchronized (C0265d.class) {
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

package O1;

import com.google.crypto.tink.shaded.protobuf.AbstractC0432x;
import com.google.crypto.tink.shaded.protobuf.AbstractC0434z;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class C extends AbstractC0432x implements P {
    private static final C DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile X PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private AbstractC0434z.d key_ = AbstractC0432x.u();
    private int primaryKeyId_;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1536a;

        static {
            int[] iArr = new int[AbstractC0432x.d.values().length];
            f1536a = iArr;
            try {
                iArr[AbstractC0432x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1536a[AbstractC0432x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1536a[AbstractC0432x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1536a[AbstractC0432x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1536a[AbstractC0432x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1536a[AbstractC0432x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1536a[AbstractC0432x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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

        public b s(c cVar) {
            m();
            ((C) this.f5998f).X(cVar);
            return this;
        }

        public c t(int i3) {
            return ((C) this.f5998f).Z(i3);
        }

        public int u() {
            return ((C) this.f5998f).a0();
        }

        public List v() {
            return Collections.unmodifiableList(((C) this.f5998f).b0());
        }

        public b w(int i3) {
            m();
            ((C) this.f5998f).g0(i3);
            return this;
        }

        public b() {
            super(C.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends AbstractC0432x implements P {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile X PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        public static final class a extends AbstractC0432x.a implements P {
            public /* synthetic */ a(a aVar) {
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

            public a s(y yVar) {
                m();
                ((c) this.f5998f).f0(yVar);
                return this;
            }

            public a t(int i3) {
                m();
                ((c) this.f5998f).g0(i3);
                return this;
            }

            public a u(I i3) {
                m();
                ((c) this.f5998f).h0(i3);
                return this;
            }

            public a v(z zVar) {
                m();
                ((c) this.f5998f).i0(zVar);
                return this;
            }

            public a() {
                super(c.DEFAULT_INSTANCE);
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            AbstractC0432x.Q(c.class, cVar);
        }

        public static a e0() {
            return (a) DEFAULT_INSTANCE.q();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h0(I i3) {
            this.outputPrefixType_ = i3.d();
        }

        public y Z() {
            y yVar = this.keyData_;
            return yVar == null ? y.Y() : yVar;
        }

        public int a0() {
            return this.keyId_;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.O
        public /* bridge */ /* synthetic */ O.a b() {
            return super.H();
        }

        public I b0() {
            I c3 = I.c(this.outputPrefixType_);
            return c3 == null ? I.UNRECOGNIZED : c3;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P
        public /* bridge */ /* synthetic */ O c() {
            return super.w();
        }

        public z c0() {
            z c3 = z.c(this.status_);
            return c3 == null ? z.UNRECOGNIZED : c3;
        }

        public boolean d0() {
            return this.keyData_ != null;
        }

        public final void f0(y yVar) {
            yVar.getClass();
            this.keyData_ = yVar;
        }

        public final void g0(int i3) {
            this.keyId_ = i3;
        }

        public final void i0(z zVar) {
            this.status_ = zVar.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0432x
        public final Object t(AbstractC0432x.d dVar, Object obj, Object obj2) {
            X x3;
            a aVar = null;
            switch (a.f1536a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0432x.I(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    X x4 = PARSER;
                    if (x4 != null) {
                        return x4;
                    }
                    synchronized (c.class) {
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

    static {
        C c3 = new C();
        DEFAULT_INSTANCE = c3;
        AbstractC0432x.Q(C.class, c3);
    }

    public static b d0() {
        return (b) DEFAULT_INSTANCE.q();
    }

    public static C e0(InputStream inputStream, C0425p c0425p) {
        return (C) AbstractC0432x.L(DEFAULT_INSTANCE, inputStream, c0425p);
    }

    public static C f0(byte[] bArr, C0425p c0425p) {
        return (C) AbstractC0432x.M(DEFAULT_INSTANCE, bArr, c0425p);
    }

    public final void X(c cVar) {
        cVar.getClass();
        Y();
        this.key_.add(cVar);
    }

    public final void Y() {
        AbstractC0434z.d dVar = this.key_;
        if (dVar.f()) {
            return;
        }
        this.key_ = AbstractC0432x.G(dVar);
    }

    public c Z(int i3) {
        return (c) this.key_.get(i3);
    }

    public int a0() {
        return this.key_.size();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public /* bridge */ /* synthetic */ O.a b() {
        return super.H();
    }

    public List b0() {
        return this.key_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public /* bridge */ /* synthetic */ O c() {
        return super.w();
    }

    public int c0() {
        return this.primaryKeyId_;
    }

    public final void g0(int i3) {
        this.primaryKeyId_ = i3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0432x
    public final Object t(AbstractC0432x.d dVar, Object obj, Object obj2) {
        X x3;
        a aVar = null;
        switch (a.f1536a[dVar.ordinal()]) {
            case 1:
                return new C();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0432x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x4 = PARSER;
                if (x4 != null) {
                    return x4;
                }
                synchronized (C.class) {
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

package O1;

import com.google.crypto.tink.shaded.protobuf.AbstractC0432x;
import com.google.crypto.tink.shaded.protobuf.AbstractC0434z;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;

/* loaded from: classes.dex */
public final class D extends AbstractC0432x implements P {
    private static final D DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile X PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private AbstractC0434z.d keyInfo_ = AbstractC0432x.u();
    private int primaryKeyId_;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1537a;

        static {
            int[] iArr = new int[AbstractC0432x.d.values().length];
            f1537a = iArr;
            try {
                iArr[AbstractC0432x.d.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1537a[AbstractC0432x.d.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1537a[AbstractC0432x.d.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1537a[AbstractC0432x.d.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1537a[AbstractC0432x.d.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1537a[AbstractC0432x.d.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1537a[AbstractC0432x.d.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
            ((D) this.f5998f).X(cVar);
            return this;
        }

        public b t(int i3) {
            m();
            ((D) this.f5998f).b0(i3);
            return this;
        }

        public b() {
            super(D.DEFAULT_INSTANCE);
        }
    }

    public static final class c extends AbstractC0432x implements P {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile X PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

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

            public a s(int i3) {
                m();
                ((c) this.f5998f).b0(i3);
                return this;
            }

            public a t(I i3) {
                m();
                ((c) this.f5998f).c0(i3);
                return this;
            }

            public a u(z zVar) {
                m();
                ((c) this.f5998f).d0(zVar);
                return this;
            }

            public a v(String str) {
                m();
                ((c) this.f5998f).e0(str);
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

        public static a a0() {
            return (a) DEFAULT_INSTANCE.q();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b0(int i3) {
            this.keyId_ = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c0(I i3) {
            this.outputPrefixType_ = i3.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d0(z zVar) {
            this.status_ = zVar.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        public int Z() {
            return this.keyId_;
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
            switch (a.f1537a[dVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return AbstractC0432x.I(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
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
        D d3 = new D();
        DEFAULT_INSTANCE = d3;
        AbstractC0432x.Q(D.class, d3);
    }

    public static b a0() {
        return (b) DEFAULT_INSTANCE.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(int i3) {
        this.primaryKeyId_ = i3;
    }

    public final void X(c cVar) {
        cVar.getClass();
        Y();
        this.keyInfo_.add(cVar);
    }

    public final void Y() {
        AbstractC0434z.d dVar = this.keyInfo_;
        if (dVar.f()) {
            return;
        }
        this.keyInfo_ = AbstractC0432x.G(dVar);
    }

    public c Z(int i3) {
        return (c) this.keyInfo_.get(i3);
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
        switch (a.f1537a[dVar.ordinal()]) {
            case 1:
                return new D();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC0432x.I(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                X x4 = PARSER;
                if (x4 != null) {
                    return x4;
                }
                synchronized (D.class) {
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

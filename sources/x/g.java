package X;

import androidx.datastore.preferences.protobuf.AbstractC0315a;
import androidx.datastore.preferences.protobuf.AbstractC0333t;
import androidx.datastore.preferences.protobuf.AbstractC0334u;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends AbstractC0333t implements K {
    private static final g DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC0334u.b strings_ = AbstractC0333t.t();

    public static final class a extends AbstractC0333t.a implements K {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a u(Iterable iterable) {
            p();
            ((g) this.f3836f).J(iterable);
            return this;
        }

        public a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0333t.F(g.class, gVar);
    }

    public static g L() {
        return DEFAULT_INSTANCE;
    }

    public static a N() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public final void J(Iterable iterable) {
        K();
        AbstractC0315a.h(iterable, this.strings_);
    }

    public final void K() {
        if (this.strings_.f()) {
            return;
        }
        this.strings_ = AbstractC0333t.A(this.strings_);
    }

    public List M() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0333t
    public final Object s(AbstractC0333t.d dVar, Object obj, Object obj2) {
        S s3;
        e eVar = null;
        switch (e.f2356a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0333t.C(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                S s4 = PARSER;
                if (s4 != null) {
                    return s4;
                }
                synchronized (g.class) {
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

package X;

import androidx.datastore.preferences.protobuf.AbstractC0333t;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.l0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends AbstractC0333t implements K {
    private static final f DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private D preferences_ = D.e();

    public static final class a extends AbstractC0333t.a implements K {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public a u(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            p();
            ((f) this.f3836f).J().put(str, hVar);
            return this;
        }

        public a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final C f2357a = C.d(l0.b.f3725o, "", l0.b.f3727q, h.Q());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0333t.F(f.class, fVar);
    }

    public static a N() {
        return (a) DEFAULT_INSTANCE.p();
    }

    public static f O(InputStream inputStream) {
        return (f) AbstractC0333t.D(DEFAULT_INSTANCE, inputStream);
    }

    public final Map J() {
        return L();
    }

    public Map K() {
        return Collections.unmodifiableMap(M());
    }

    public final D L() {
        if (!this.preferences_.j()) {
            this.preferences_ = this.preferences_.m();
        }
        return this.preferences_;
    }

    public final D M() {
        return this.preferences_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0333t
    public final Object s(AbstractC0333t.d dVar, Object obj, Object obj2) {
        S s3;
        e eVar = null;
        switch (e.f2356a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC0333t.C(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f2357a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                S s4 = PARSER;
                if (s4 != null) {
                    return s4;
                }
                synchronized (f.class) {
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

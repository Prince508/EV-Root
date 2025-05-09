package G1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f578a = Logger.getLogger(b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f579b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: G1.b$b, reason: collision with other inner class name */
    public static abstract class EnumC0011b {

        /* renamed from: e, reason: collision with root package name */
        public static final EnumC0011b f580e;

        /* renamed from: f, reason: collision with root package name */
        public static final EnumC0011b f581f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ EnumC0011b[] f582g;

        /* renamed from: G1.b$b$a */
        public enum a extends EnumC0011b {
            public a(String str, int i3) {
                super(str, i3);
            }

            @Override // G1.b.EnumC0011b
            public boolean c() {
                return !b.c();
            }
        }

        /* renamed from: G1.b$b$b, reason: collision with other inner class name */
        public enum C0012b extends EnumC0011b {
            public C0012b(String str, int i3) {
                super(str, i3);
            }

            @Override // G1.b.EnumC0011b
            public boolean c() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f580e = aVar;
            C0012b c0012b = new C0012b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f581f = c0012b;
            f582g = new EnumC0011b[]{aVar, c0012b};
        }

        public EnumC0011b(String str, int i3) {
        }

        public static EnumC0011b valueOf(String str) {
            return (EnumC0011b) Enum.valueOf(EnumC0011b.class, str);
        }

        public static EnumC0011b[] values() {
            return (EnumC0011b[]) f582g.clone();
        }

        public abstract boolean c();
    }

    public static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f578a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return G1.a.a() || f579b.get();
    }
}

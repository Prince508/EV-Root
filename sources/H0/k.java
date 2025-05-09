package H0;

import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'k' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: k, reason: collision with root package name */
    public static final k f734k;

    /* renamed from: l, reason: collision with root package name */
    public static final k f735l;

    /* renamed from: m, reason: collision with root package name */
    public static final k f736m;

    /* renamed from: n, reason: collision with root package name */
    public static final k f737n;

    /* renamed from: o, reason: collision with root package name */
    public static final k f738o;

    /* renamed from: p, reason: collision with root package name */
    public static final k f739p;

    /* renamed from: q, reason: collision with root package name */
    public static final k f740q;

    /* renamed from: r, reason: collision with root package name */
    public static final k f741r;

    /* renamed from: s, reason: collision with root package name */
    public static final k f742s;

    /* renamed from: t, reason: collision with root package name */
    public static final k f743t;

    /* renamed from: u, reason: collision with root package name */
    public static final k f744u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ k[] f745v;

    /* renamed from: e, reason: collision with root package name */
    public final int f746e;

    /* renamed from: f, reason: collision with root package name */
    public final String f747f;

    /* renamed from: g, reason: collision with root package name */
    public final i f748g;

    /* renamed from: h, reason: collision with root package name */
    public final R0.j f749h;

    /* renamed from: i, reason: collision with root package name */
    public final int f750i;

    /* renamed from: j, reason: collision with root package name */
    public final int f751j;

    static {
        i iVar = i.CHUNKED_SHA256;
        f734k = new k("RSA_PSS_WITH_SHA256", 0, 257, iVar, "RSA", R0.j.c("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1)), 24, 23);
        i iVar2 = i.CHUNKED_SHA512;
        f735l = new k("RSA_PSS_WITH_SHA512", 1, 258, iVar2, "RSA", R0.j.c("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1)), 24, 23);
        f736m = new k("RSA_PKCS1_V1_5_WITH_SHA256", 2, 259, iVar, "RSA", R0.j.c("SHA256withRSA", null), 24, 1);
        f737n = new k("RSA_PKCS1_V1_5_WITH_SHA512", 3, 260, iVar2, "RSA", R0.j.c("SHA512withRSA", null), 24, 1);
        f738o = new k("ECDSA_WITH_SHA256", 4, 513, iVar, "EC", R0.j.c("SHA256withECDSA", null), 24, 11);
        f739p = new k("ECDSA_WITH_SHA512", 5, 514, iVar2, "EC", R0.j.c("SHA512withECDSA", null), 24, 11);
        f740q = new k("DSA_WITH_SHA256", 6, 769, iVar, "DSA", R0.j.c("SHA256withDSA", null), 24, 1);
        f741r = new k("DETDSA_WITH_SHA256", 7, 769, iVar, "DSA", R0.j.c("SHA256withDetDSA", null), 24, 1);
        i iVar3 = i.VERITY_CHUNKED_SHA256;
        f742s = new k("VERITY_RSA_PKCS1_V1_5_WITH_SHA256", 8, 1057, iVar3, "RSA", R0.j.c("SHA256withRSA", null), 28, 1);
        f743t = new k("VERITY_ECDSA_WITH_SHA256", 9, 1059, iVar3, "EC", R0.j.c("SHA256withECDSA", null), 28, 11);
        f744u = new k("VERITY_DSA_WITH_SHA256", 10, 1061, iVar3, "DSA", R0.j.c("SHA256withDSA", null), 28, 1);
        f745v = c();
    }

    public k(String str, int i3, int i4, i iVar, String str2, R0.j jVar, int i5, int i6) {
        this.f746e = i4;
        this.f748g = iVar;
        this.f747f = str2;
        this.f749h = jVar;
        this.f750i = i5;
        this.f751j = i6;
    }

    public static /* synthetic */ k[] c() {
        return new k[]{f734k, f735l, f736m, f737n, f738o, f739p, f740q, f741r, f742s, f743t, f744u};
    }

    public static k f(int i3) {
        for (k kVar : values()) {
            if (kVar.h() == i3) {
                return kVar;
            }
        }
        return null;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f745v.clone();
    }

    public i g() {
        return this.f748g;
    }

    public int h() {
        return this.f746e;
    }

    public String i() {
        return this.f747f;
    }

    public int j() {
        return this.f751j;
    }

    public R0.j k() {
        return this.f749h;
    }

    public int l() {
        return this.f750i;
    }
}

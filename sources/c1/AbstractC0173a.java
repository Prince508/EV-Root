package C1;

import java.security.GeneralSecurityException;

/* renamed from: C1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0173a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f199a = new C0177e().d();

    /* renamed from: b, reason: collision with root package name */
    public static final String f200b = new p().d();

    /* renamed from: c, reason: collision with root package name */
    public static final String f201c = new u().d();

    /* renamed from: d, reason: collision with root package name */
    public static final String f202d = new C0180h().d();

    /* renamed from: e, reason: collision with root package name */
    public static final String f203e = new D().d();

    /* renamed from: f, reason: collision with root package name */
    public static final String f204f = new F().d();

    /* renamed from: g, reason: collision with root package name */
    public static final String f205g = new z().d();

    /* renamed from: h, reason: collision with root package name */
    public static final String f206h = new H().d();

    /* renamed from: i, reason: collision with root package name */
    public static final O1.J f207i;

    /* renamed from: j, reason: collision with root package name */
    public static final O1.J f208j;

    /* renamed from: k, reason: collision with root package name */
    public static final O1.J f209k;

    static {
        O1.J V2 = O1.J.V();
        f207i = V2;
        f208j = V2;
        f209k = V2;
        try {
            a();
        } catch (GeneralSecurityException e3) {
            throw new ExceptionInInitializerError(e3);
        }
    }

    public static void a() {
        b();
    }

    public static void b() {
        C0176d.e();
        K1.o.b();
        C0177e.p(true);
        p.o(true);
        if (F1.a.a()) {
            return;
        }
        C0180h.o(true);
        u.p(true);
        z.m(true);
        D.m(true);
        F.m(true);
        H.m(true);
    }
}

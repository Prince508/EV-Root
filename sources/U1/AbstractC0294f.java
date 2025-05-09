package U1;

/* renamed from: U1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0294f {

    /* renamed from: a, reason: collision with root package name */
    public static final C[] f2125a = new C[1];

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2126b;

    /* renamed from: c, reason: collision with root package name */
    public static C0291c f2127c;

    public static synchronized C a() {
        C b3;
        synchronized (AbstractC0294f.class) {
            try {
                b3 = b();
                if (b3 == null) {
                    if (f2126b) {
                        throw new T1.a("The main shell died during initialization");
                    }
                    f2126b = true;
                    if (f2127c == null) {
                        f2127c = new C0291c();
                    }
                    b3 = f2127c.a();
                    f2126b = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b3;
    }

    public static C b() {
        C c3;
        C[] cArr = f2125a;
        synchronized (cArr) {
            try {
                c3 = cArr[0];
                if (c3 != null && c3.c() < 0) {
                    c3 = null;
                    cArr[0] = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3;
    }

    public static synchronized void c(C c3) {
        synchronized (AbstractC0294f.class) {
            if (f2126b) {
                C[] cArr = f2125a;
                synchronized (cArr) {
                    cArr[0] = c3;
                }
            }
        }
    }
}

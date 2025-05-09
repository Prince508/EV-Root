package P2;

/* loaded from: classes.dex */
public abstract /* synthetic */ class H {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1744a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f1744a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}

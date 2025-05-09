package x2;

import C2.k;

/* loaded from: classes.dex */
public abstract class a extends w2.a {

    /* renamed from: x2.a$a, reason: collision with other inner class name */
    public static final class C0166a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0166a f10106a = new C0166a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f10107b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f10107b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f10107b = num2;
        }
    }

    private final boolean c(int i3) {
        Integer num = C0166a.f10107b;
        return num == null || num.intValue() >= i3;
    }

    @Override // w2.a
    public void a(Throwable th, Throwable th2) {
        k.e(th, "cause");
        k.e(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}

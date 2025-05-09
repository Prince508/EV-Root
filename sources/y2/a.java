package y2;

import E2.c;

/* loaded from: classes.dex */
public class a extends x2.a {

    /* renamed from: y2.a$a, reason: collision with other inner class name */
    public static final class C0167a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0167a f10192a = new C0167a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f10193b;

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
                f10193b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f10193b = num2;
        }
    }

    @Override // w2.a
    public c b() {
        return c(34) ? new F2.a() : super.b();
    }

    public final boolean c(int i3) {
        Integer num = C0167a.f10193b;
        return num == null || num.intValue() >= i3;
    }
}

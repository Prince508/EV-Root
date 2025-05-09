package P1;

import J1.t;

/* loaded from: classes.dex */
public abstract class q {
    public static int a() {
        Integer a3 = t.a();
        if (a3 != null) {
            return a3.intValue();
        }
        return -1;
    }

    public static boolean b() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }
}

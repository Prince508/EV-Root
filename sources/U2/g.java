package u2;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class g {
    public static final void a(int i3, int i4) {
        if (i4 <= i3) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i3 + ", got " + i4 + ". Please update the Kotlin standard library.").toString());
    }

    public static final f b(AbstractC0748a abstractC0748a) {
        return (f) abstractC0748a.getClass().getAnnotation(f.class);
    }

    public static final int c(AbstractC0748a abstractC0748a) {
        try {
            Field declaredField = abstractC0748a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC0748a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(AbstractC0748a abstractC0748a) {
        String str;
        C2.k.e(abstractC0748a, "<this>");
        f b3 = b(abstractC0748a);
        if (b3 == null) {
            return null;
        }
        a(1, b3.v());
        int c3 = c(abstractC0748a);
        int i3 = c3 < 0 ? -1 : b3.l()[c3];
        String b4 = i.f9645a.b(abstractC0748a);
        if (b4 == null) {
            str = b3.c();
        } else {
            str = b4 + '/' + b3.c();
        }
        return new StackTraceElement(str, b3.m(), b3.f(), i3);
    }
}

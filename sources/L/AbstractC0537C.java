package l;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: l.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0537C {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f8151a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f8152b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f8153c = new Rect();

    /* renamed from: l.C$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final boolean f8154a;

        /* renamed from: b, reason: collision with root package name */
        public static final Method f8155b;

        /* renamed from: c, reason: collision with root package name */
        public static final Field f8156c;

        /* renamed from: d, reason: collision with root package name */
        public static final Field f8157d;

        /* renamed from: e, reason: collision with root package name */
        public static final Field f8158e;

        /* renamed from: f, reason: collision with root package name */
        public static final Field f8159f;

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L42 java.lang.NoSuchMethodException -> L45
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L42 java.lang.NoSuchMethodException -> L45
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3f java.lang.ClassNotFoundException -> L42 java.lang.NoSuchMethodException -> L45
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L36 java.lang.ClassNotFoundException -> L39 java.lang.NoSuchMethodException -> L3c
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L32 java.lang.NoSuchMethodException -> L34
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L48
                r8 = r0
                goto L4a
            L2d:
                r7 = r1
                goto L48
            L2f:
                r6 = r1
            L30:
                r7 = r6
                goto L48
            L32:
                r6 = r1
                goto L30
            L34:
                r6 = r1
                goto L30
            L36:
                r5 = r1
            L37:
                r6 = r5
                goto L30
            L39:
                r5 = r1
            L3a:
                r6 = r5
                goto L30
            L3c:
                r5 = r1
            L3d:
                r6 = r5
                goto L30
            L3f:
                r4 = r1
                r5 = r4
                goto L37
            L42:
                r4 = r1
                r5 = r4
                goto L3a
            L45:
                r4 = r1
                r5 = r4
                goto L3d
            L48:
                r3 = r1
                r8 = r2
            L4a:
                if (r8 == 0) goto L59
                l.AbstractC0537C.a.f8155b = r4
                l.AbstractC0537C.a.f8156c = r5
                l.AbstractC0537C.a.f8157d = r6
                l.AbstractC0537C.a.f8158e = r7
                l.AbstractC0537C.a.f8159f = r3
                l.AbstractC0537C.a.f8154a = r0
                goto L65
            L59:
                l.AbstractC0537C.a.f8155b = r1
                l.AbstractC0537C.a.f8156c = r1
                l.AbstractC0537C.a.f8157d = r1
                l.AbstractC0537C.a.f8158e = r1
                l.AbstractC0537C.a.f8159f = r1
                l.AbstractC0537C.a.f8154a = r2
            L65:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: l.AbstractC0537C.a.<clinit>():void");
        }

        public static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f8154a) {
                try {
                    Object invoke = f8155b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f8156c.getInt(invoke), f8157d.getInt(invoke), f8158e.getInt(invoke), f8159f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return AbstractC0537C.f8153c;
        }
    }

    /* renamed from: l.C$b */
    public static class b {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        return true;
    }

    public static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 29 || i3 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f8151a);
        } else {
            drawable.setState(f8152b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(D.a.k(drawable));
        }
        Insets a3 = b.a(drawable);
        i3 = a3.left;
        i4 = a3.top;
        i5 = a3.right;
        i6 = a3.bottom;
        return new Rect(i3, i4, i5, i6);
    }

    public static PorterDuff.Mode e(int i3, PorterDuff.Mode mode) {
        if (i3 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i3) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}

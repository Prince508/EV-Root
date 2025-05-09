package s0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final F f9107a;

    /* renamed from: b, reason: collision with root package name */
    public static final Property f9108b;

    /* renamed from: c, reason: collision with root package name */
    public static final Property f9109c;

    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C.b(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f3) {
            C.e(view, f3.floatValue());
        }
    }

    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f9107a = new O();
        } else {
            f9107a = new N();
        }
        f9108b = new a(Float.class, "translationAlpha");
        f9109c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        f9107a.a(view);
    }

    public static float b(View view) {
        return f9107a.b(view);
    }

    public static void c(View view) {
        f9107a.c(view);
    }

    public static void d(View view, int i3, int i4, int i5, int i6) {
        f9107a.d(view, i3, i4, i5, i6);
    }

    public static void e(View view, float f3) {
        f9107a.e(view, f3);
    }

    public static void f(View view, int i3) {
        f9107a.f(view, i3);
    }

    public static void g(View view, Matrix matrix) {
        f9107a.g(view, matrix);
    }

    public static void h(View view, Matrix matrix) {
        f9107a.h(view, matrix);
    }
}

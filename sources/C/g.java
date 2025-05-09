package C;

import B.d;
import H.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public class g extends k {

    /* renamed from: b, reason: collision with root package name */
    public static final Class f145b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f146c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f147d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f148e;

    static {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi24Impl", e3.getClass().getName(), e3);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        f146c = constructor;
        f145b = cls;
        f147d = method;
        f148e = method2;
    }

    public static boolean h(Object obj, ByteBuffer byteBuffer, int i3, int i4, boolean z3) {
        try {
            return ((Boolean) f147d.invoke(obj, byteBuffer, Integer.valueOf(i3), null, Integer.valueOf(i4), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f145b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f148e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean j() {
        Method method = f147d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object k() {
        try {
            return f146c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // C.k
    public Typeface a(Context context, d.c cVar, Resources resources, int i3) {
        Object k3 = k();
        if (k3 == null) {
            return null;
        }
        for (d.C0001d c0001d : cVar.a()) {
            ByteBuffer b3 = l.b(context, resources, c0001d.b());
            if (b3 == null || !h(k3, b3, c0001d.c(), c0001d.e(), c0001d.f())) {
                return null;
            }
        }
        return i(k3);
    }

    @Override // C.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i3) {
        Object k3 = k();
        if (k3 == null) {
            return null;
        }
        o.g gVar = new o.g();
        for (g.b bVar : bVarArr) {
            Uri d3 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d3);
            if (byteBuffer == null) {
                byteBuffer = l.f(context, cancellationSignal, d3);
                gVar.put(d3, byteBuffer);
            }
            if (byteBuffer == null || !h(k3, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface i4 = i(k3);
        if (i4 == null) {
            return null;
        }
        return Typeface.create(i4, i3);
    }
}

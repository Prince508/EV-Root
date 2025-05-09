package C;

import B.d;
import H.g;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: g, reason: collision with root package name */
    public final Class f149g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f150h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f151i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f152j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f153k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f154l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f155m;

    public h() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = v();
            constructor = w(cls);
            method = s(cls);
            method2 = t(cls);
            method3 = x(cls);
            method4 = r(cls);
            method5 = u(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e3.getClass().getName(), e3);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f149g = cls;
        this.f150h = constructor;
        this.f151i = method;
        this.f152j = method2;
        this.f153k = method3;
        this.f154l = method4;
        this.f155m = method5;
    }

    @Override // C.f, C.k
    public Typeface a(Context context, d.c cVar, Resources resources, int i3) {
        if (!q()) {
            return super.a(context, cVar, resources, i3);
        }
        Object l3 = l();
        if (l3 == null) {
            return null;
        }
        d.C0001d[] a3 = cVar.a();
        int length = a3.length;
        int i4 = 0;
        while (i4 < length) {
            d.C0001d c0001d = a3[i4];
            Context context2 = context;
            if (!n(context2, l3, c0001d.a(), c0001d.c(), c0001d.e(), c0001d.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0001d.d()))) {
                m(l3);
                return null;
            }
            i4++;
            context = context2;
        }
        if (p(l3)) {
            return i(l3);
        }
        return null;
    }

    @Override // C.f, C.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i3) {
        Typeface i4;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (q()) {
            Map h3 = l.h(context, bVarArr, cancellationSignal);
            Object l3 = l();
            if (l3 == null) {
                return null;
            }
            int length = bVarArr.length;
            int i5 = 0;
            boolean z3 = false;
            while (i5 < length) {
                g.b bVar = bVarArr[i5];
                ByteBuffer byteBuffer = (ByteBuffer) h3.get(bVar.d());
                if (byteBuffer == null) {
                    obj = l3;
                } else {
                    boolean o3 = o(l3, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0);
                    obj = l3;
                    if (!o3) {
                        m(obj);
                        return null;
                    }
                    z3 = true;
                }
                i5++;
                l3 = obj;
                z3 = z3;
            }
            Object obj2 = l3;
            if (!z3) {
                m(obj2);
                return null;
            }
            if (p(obj2) && (i4 = i(obj2)) != null) {
                return Typeface.create(i4, i3);
            }
            return null;
        }
        g.b g3 = g(bVarArr, i3);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g3.d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g3.e()).setItalic(g3.f()).build();
                openFileDescriptor.close();
                return build;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // C.k
    public Typeface d(Context context, Resources resources, int i3, String str, int i4) {
        if (!q()) {
            return super.d(context, resources, i3, str, i4);
        }
        Object l3 = l();
        if (l3 == null) {
            return null;
        }
        if (!n(context, l3, str, 0, -1, -1, null)) {
            m(l3);
            return null;
        }
        if (p(l3)) {
            return i(l3);
        }
        return null;
    }

    public Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f149g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f155m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object l() {
        try {
            return this.f150h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void m(Object obj) {
        try {
            this.f154l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean n(Context context, Object obj, String str, int i3, int i4, int i5, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f151i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean o(Object obj, ByteBuffer byteBuffer, int i3, int i4, int i5) {
        try {
            return ((Boolean) this.f152j.invoke(obj, byteBuffer, Integer.valueOf(i3), null, Integer.valueOf(i4), Integer.valueOf(i5))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean p(Object obj) {
        try {
            return ((Boolean) this.f153k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean q() {
        if (this.f151i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f151i != null;
    }

    public Method r(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    public Method s(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public Method t(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method u(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class v() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor w(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    public Method x(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}

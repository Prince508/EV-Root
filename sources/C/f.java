package C;

import B.d;
import H.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class f extends k {

    /* renamed from: b, reason: collision with root package name */
    public static Class f140b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f141c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f142d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f143e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f144f = false;

    public static boolean h(Object obj, String str, int i3, boolean z3) {
        k();
        try {
            return ((Boolean) f142d.invoke(obj, str, Integer.valueOf(i3), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static Typeface i(Object obj) {
        k();
        try {
            Object newInstance = Array.newInstance((Class<?>) f140b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f143e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void k() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f144f) {
            return;
        }
        f144f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e3) {
            Log.e("TypefaceCompatApi21Impl", e3.getClass().getName(), e3);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f141c = constructor;
        f140b = cls;
        f142d = method2;
        f143e = method;
    }

    private static Object l() {
        k();
        try {
            return f141c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // C.k
    public Typeface a(Context context, d.c cVar, Resources resources, int i3) {
        Object l3 = l();
        for (d.C0001d c0001d : cVar.a()) {
            File e3 = l.e(context);
            if (e3 == null) {
                return null;
            }
            try {
                if (!l.c(e3, resources, c0001d.b())) {
                    return null;
                }
                if (!h(l3, e3.getPath(), c0001d.e(), c0001d.f())) {
                    return null;
                }
                e3.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e3.delete();
            }
        }
        return i(l3);
    }

    @Override // C.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i3) {
        FileInputStream fileInputStream;
        Typeface c3;
        if (bVarArr.length < 1) {
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
                File j3 = j(openFileDescriptor);
                try {
                    if (j3 != null && j3.canRead()) {
                        c3 = Typeface.createFromFile(j3);
                        openFileDescriptor.close();
                        return c3;
                    }
                    c3 = super.c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c3;
                } finally {
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}

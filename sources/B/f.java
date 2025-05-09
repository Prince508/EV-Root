package B;

import B.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a */
    public static final ThreadLocal f28a = new ThreadLocal();

    /* renamed from: b */
    public static final WeakHashMap f29b = new WeakHashMap(0);

    /* renamed from: c */
    public static final Object f30c = new Object();

    public static class a {
        public static Drawable a(Resources resources, int i3, Resources.Theme theme) {
            return resources.getDrawable(i3, theme);
        }

        public static Drawable b(Resources resources, int i3, int i4, Resources.Theme theme) {
            return resources.getDrawableForDensity(i3, i4, theme);
        }
    }

    public static class b {
        public static int a(Resources resources, int i3, Resources.Theme theme) {
            return resources.getColor(i3, theme);
        }

        public static ColorStateList b(Resources resources, int i3, Resources.Theme theme) {
            return resources.getColorStateList(i3, theme);
        }
    }

    public static class c {

        /* renamed from: a */
        public final ColorStateList f31a;

        /* renamed from: b */
        public final Configuration f32b;

        /* renamed from: c */
        public final int f33c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f31a = colorStateList;
            this.f32b = configuration;
            this.f33c = theme == null ? 0 : theme.hashCode();
        }
    }

    public static final class d {

        /* renamed from: a */
        public final Resources f34a;

        /* renamed from: b */
        public final Resources.Theme f35b;

        public d(Resources resources, Resources.Theme theme) {
            this.f34a = resources;
            this.f35b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f34a.equals(dVar.f34a) && J.c.a(this.f35b, dVar.f35b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return J.c.b(this.f34a, this.f35b);
        }
    }

    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i3, Handler handler) {
            e(handler).post(new Runnable() { // from class: B.h
                @Override // java.lang.Runnable
                public final void run() {
                    f.e.this.f(i3);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: B.g
                @Override // java.lang.Runnable
                public final void run() {
                    f.e.this.g(typeface);
                }
            });
        }

        public abstract void f(int i3);

        public abstract void g(Typeface typeface);
    }

    public static void a(d dVar, int i3, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f30c) {
            try {
                WeakHashMap weakHashMap = f29b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i3, new c(colorStateList, dVar.f34a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        if (r2.f33c == r5.hashCode()) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList b(B.f.d r5, int r6) {
        /*
            java.lang.Object r0 = B.f.f30c
            monitor-enter(r0)
            java.util.WeakHashMap r1 = B.f.f29b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            B.f$c r2 = (B.f.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f32b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f34a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f35b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f33c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f33c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f31a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: B.f.b(B.f$d, int):android.content.res.ColorStateList");
    }

    public static Typeface c(Context context, int i3) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i3, new TypedValue(), 0, null, null, false, true);
    }

    public static ColorStateList d(Resources resources, int i3, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList b3 = b(dVar, i3);
        if (b3 != null) {
            return b3;
        }
        ColorStateList k3 = k(resources, i3, theme);
        if (k3 == null) {
            return b.b(resources, i3, theme);
        }
        a(dVar, i3, k3, theme);
        return k3;
    }

    public static Drawable e(Resources resources, int i3, Resources.Theme theme) {
        return a.a(resources, i3, theme);
    }

    public static Drawable f(Resources resources, int i3, int i4, Resources.Theme theme) {
        return a.b(resources, i3, i4, theme);
    }

    public static Typeface g(Context context, int i3) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i3, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface h(Context context, int i3, TypedValue typedValue, int i4, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i3, typedValue, i4, eVar, null, true, false);
    }

    public static void i(Context context, int i3, e eVar, Handler handler) {
        J.g.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            m(context, i3, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    public static TypedValue j() {
        ThreadLocal threadLocal = f28a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList k(Resources resources, int i3, Resources.Theme theme) {
        if (l(resources, i3)) {
            return null;
        }
        try {
            return B.c.a(resources, resources.getXml(i3), theme);
        } catch (Exception e3) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e3);
            return null;
        }
    }

    public static boolean l(Resources resources, int i3) {
        TypedValue j3 = j();
        resources.getValue(i3, j3, true);
        int i4 = j3.type;
        return i4 >= 28 && i4 <= 31;
    }

    public static Typeface m(Context context, int i3, TypedValue typedValue, int i4, e eVar, Handler handler, boolean z3, boolean z4) {
        Resources resources = context.getResources();
        resources.getValue(i3, typedValue, true);
        Typeface n3 = n(context, resources, typedValue, i3, i4, eVar, handler, z3, z4);
        if (n3 != null || eVar != null || z4) {
            return n3;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i3) + " could not be retrieved.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface n(android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, B.f.e r18, android.os.Handler r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B.f.n(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, B.f$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}

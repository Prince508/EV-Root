package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import h.AbstractC0485b;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t0.AbstractC0727b;

/* renamed from: l.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544J {

    /* renamed from: i, reason: collision with root package name */
    public static C0544J f8238i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f8240a;

    /* renamed from: b, reason: collision with root package name */
    public o.g f8241b;

    /* renamed from: c, reason: collision with root package name */
    public o.h f8242c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f8243d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f8244e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8245f;

    /* renamed from: g, reason: collision with root package name */
    public c f8246g;

    /* renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f8237h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    public static final a f8239j = new a(6);

    /* renamed from: l.J$a */
    public static class a extends o.e {
        public a(int i3) {
            super(i3);
        }

        public static int h(int i3, PorterDuff.Mode mode) {
            return ((i3 + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter i(int i3, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(h(i3, mode)));
        }

        public PorterDuffColorFilter j(int i3, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(h(i3, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: l.J$b */
    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: l.J$c */
    public interface c {
        boolean a(Context context, int i3, Drawable drawable);

        ColorStateList b(Context context, int i3);

        Drawable c(C0544J c0544j, Context context, int i3);

        boolean d(Context context, int i3, Drawable drawable);

        PorterDuff.Mode e(int i3);
    }

    public static long d(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    public static PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return k(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized C0544J g() {
        C0544J c0544j;
        synchronized (C0544J.class) {
            try {
                if (f8238i == null) {
                    C0544J c0544j2 = new C0544J();
                    f8238i = c0544j2;
                    o(c0544j2);
                }
                c0544j = f8238i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0544j;
    }

    public static synchronized PorterDuffColorFilter k(int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter i4;
        synchronized (C0544J.class) {
            a aVar = f8239j;
            i4 = aVar.i(i3, mode);
            if (i4 == null) {
                i4 = new PorterDuffColorFilter(i3, mode);
                aVar.j(i3, mode, i4);
            }
        }
        return i4;
    }

    public static boolean p(Drawable drawable) {
        return (drawable instanceof AbstractC0727b) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    public static void u(Drawable drawable, C0550P c0550p, int[] iArr) {
        int[] state = drawable.getState();
        if (AbstractC0537C.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z3 = c0550p.f8292d;
        if (z3 || c0550p.f8291c) {
            drawable.setColorFilter(f(z3 ? c0550p.f8289a : null, c0550p.f8291c ? c0550p.f8290b : f8237h, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    public final synchronized boolean a(Context context, long j3, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            o.d dVar = (o.d) this.f8243d.get(context);
            if (dVar == null) {
                dVar = new o.d();
                this.f8243d.put(context, dVar);
            }
            dVar.j(j3, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(Context context, int i3, ColorStateList colorStateList) {
        if (this.f8240a == null) {
            this.f8240a = new WeakHashMap();
        }
        o.h hVar = (o.h) this.f8240a.get(context);
        if (hVar == null) {
            hVar = new o.h();
            this.f8240a.put(context, hVar);
        }
        hVar.a(i3, colorStateList);
    }

    public final void c(Context context) {
        if (this.f8245f) {
            return;
        }
        this.f8245f = true;
        Drawable i3 = i(context, AbstractC0485b.f7236a);
        if (i3 == null || !p(i3)) {
            this.f8245f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    public final Drawable e(Context context, int i3) {
        if (this.f8244e == null) {
            this.f8244e = new TypedValue();
        }
        TypedValue typedValue = this.f8244e;
        context.getResources().getValue(i3, typedValue, true);
        long d3 = d(typedValue);
        Drawable h3 = h(context, d3);
        if (h3 != null) {
            return h3;
        }
        c cVar = this.f8246g;
        Drawable c3 = cVar == null ? null : cVar.c(this, context, i3);
        if (c3 != null) {
            c3.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, d3, c3);
        }
        return c3;
    }

    public final synchronized Drawable h(Context context, long j3) {
        o.d dVar = (o.d) this.f8243d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) dVar.e(j3);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.k(j3);
        }
        return null;
    }

    public synchronized Drawable i(Context context, int i3) {
        return j(context, i3, false);
    }

    public synchronized Drawable j(Context context, int i3, boolean z3) {
        Drawable q3;
        try {
            c(context);
            q3 = q(context, i3);
            if (q3 == null) {
                q3 = e(context, i3);
            }
            if (q3 == null) {
                q3 = A.a.d(context, i3);
            }
            if (q3 != null) {
                q3 = t(context, i3, z3, q3);
            }
            if (q3 != null) {
                AbstractC0537C.b(q3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return q3;
    }

    public synchronized ColorStateList l(Context context, int i3) {
        ColorStateList m3;
        m3 = m(context, i3);
        if (m3 == null) {
            c cVar = this.f8246g;
            m3 = cVar == null ? null : cVar.b(context, i3);
            if (m3 != null) {
                b(context, i3, m3);
            }
        }
        return m3;
    }

    public final ColorStateList m(Context context, int i3) {
        o.h hVar;
        WeakHashMap weakHashMap = this.f8240a;
        if (weakHashMap == null || (hVar = (o.h) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.f(i3);
    }

    public PorterDuff.Mode n(int i3) {
        c cVar = this.f8246g;
        if (cVar == null) {
            return null;
        }
        return cVar.e(i3);
    }

    public final Drawable q(Context context, int i3) {
        int next;
        o.g gVar = this.f8241b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        o.h hVar = this.f8242c;
        if (hVar != null) {
            String str = (String) hVar.f(i3);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f8241b.get(str) == null)) {
                return null;
            }
        } else {
            this.f8242c = new o.h();
        }
        if (this.f8244e == null) {
            this.f8244e = new TypedValue();
        }
        TypedValue typedValue = this.f8244e;
        Resources resources = context.getResources();
        resources.getValue(i3, typedValue, true);
        long d3 = d(typedValue);
        Drawable h3 = h(context, d3);
        if (h3 != null) {
            return h3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i3);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f8242c.a(i3, name);
                b bVar = (b) this.f8241b.get(name);
                if (bVar != null) {
                    h3 = bVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (h3 != null) {
                    h3.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, d3, h3);
                }
            } catch (Exception e3) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e3);
            }
        }
        if (h3 == null) {
            this.f8242c.a(i3, "appcompat_skip_skip");
        }
        return h3;
    }

    public synchronized Drawable r(Context context, b0 b0Var, int i3) {
        try {
            Drawable q3 = q(context, i3);
            if (q3 == null) {
                q3 = b0Var.a(i3);
            }
            if (q3 == null) {
                return null;
            }
            return t(context, i3, false, q3);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(c cVar) {
        this.f8246g = cVar;
    }

    public final Drawable t(Context context, int i3, boolean z3, Drawable drawable) {
        ColorStateList l3 = l(context, i3);
        if (l3 == null) {
            c cVar = this.f8246g;
            if ((cVar == null || !cVar.d(context, i3, drawable)) && !v(context, i3, drawable) && z3) {
                return null;
            }
            return drawable;
        }
        if (AbstractC0537C.a(drawable)) {
            drawable = drawable.mutate();
        }
        Drawable l4 = D.a.l(drawable);
        D.a.i(l4, l3);
        PorterDuff.Mode n3 = n(i3);
        if (n3 != null) {
            D.a.j(l4, n3);
        }
        return l4;
    }

    public boolean v(Context context, int i3, Drawable drawable) {
        c cVar = this.f8246g;
        return cVar != null && cVar.a(context, i3, drawable);
    }

    public static void o(C0544J c0544j) {
    }
}

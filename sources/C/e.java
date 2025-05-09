package C;

import B.d;
import B.f;
import H.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final k f137a;

    /* renamed from: b, reason: collision with root package name */
    public static final o.e f138b;

    public static class a extends g.c {

        /* renamed from: a, reason: collision with root package name */
        public f.e f139a;

        public a(f.e eVar) {
            this.f139a = eVar;
        }

        @Override // H.g.c
        public void a(int i3) {
            f.e eVar = this.f139a;
            if (eVar != null) {
                eVar.f(i3);
            }
        }

        @Override // H.g.c
        public void b(Typeface typeface) {
            f.e eVar = this.f139a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            f137a = new j();
        } else if (i3 >= 28) {
            f137a = new i();
        } else if (i3 >= 26) {
            f137a = new h();
        } else if (g.j()) {
            f137a = new g();
        } else {
            f137a = new f();
        }
        f138b = new o.e(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i3) {
        if (context != null) {
            return Typeface.create(typeface, i3);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i3) {
        return f137a.b(context, cancellationSignal, bVarArr, i3);
    }

    public static Typeface c(Context context, d.b bVar, Resources resources, int i3, String str, int i4, int i5, f.e eVar, Handler handler, boolean z3) {
        Typeface a3;
        if (bVar instanceof d.e) {
            d.e eVar2 = (d.e) bVar;
            Typeface g3 = g(eVar2.c());
            if (g3 != null) {
                if (eVar != null) {
                    eVar.d(g3, handler);
                }
                return g3;
            }
            a3 = H.g.c(context, eVar2.b(), i5, !z3 ? eVar != null : eVar2.a() != 0, z3 ? eVar2.d() : -1, f.e.e(handler), new a(eVar));
        } else {
            a3 = f137a.a(context, (d.c) bVar, resources, i5);
            if (eVar != null) {
                if (a3 != null) {
                    eVar.d(a3, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (a3 != null) {
            f138b.d(e(resources, i3, str, i4, i5), a3);
        }
        return a3;
    }

    public static Typeface d(Context context, Resources resources, int i3, String str, int i4, int i5) {
        Typeface d3 = f137a.d(context, resources, i3, str, i5);
        if (d3 != null) {
            f138b.d(e(resources, i3, str, i4, i5), d3);
        }
        return d3;
    }

    public static String e(Resources resources, int i3, String str, int i4, int i5) {
        return resources.getResourcePackageName(i3) + '-' + str + '-' + i4 + '-' + i3 + '-' + i5;
    }

    public static Typeface f(Resources resources, int i3, String str, int i4, int i5) {
        return (Typeface) f138b.c(e(resources, i3, str, i4, i5));
    }

    public static Typeface g(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }
}

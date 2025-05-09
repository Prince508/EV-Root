package C;

import B.d;
import H.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f156a = new ConcurrentHashMap();

    public class a implements b {
        public a() {
        }

        @Override // C.k.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(g.b bVar) {
            return bVar.e();
        }

        @Override // C.k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    public interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    public static Object e(Object[] objArr, int i3, b bVar) {
        return f(objArr, (i3 & 1) == 0 ? 400 : 700, (i3 & 2) != 0, bVar);
    }

    public static Object f(Object[] objArr, int i3, boolean z3, b bVar) {
        Object obj = null;
        int i4 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(bVar.a(obj2) - i3) * 2) + (bVar.b(obj2) == z3 ? 0 : 1);
            if (obj == null || i4 > abs) {
                obj = obj2;
                i4 = abs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, d.c cVar, Resources resources, int i3);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i3);

    public Typeface c(Context context, InputStream inputStream) {
        File e3 = l.e(context);
        if (e3 == null) {
            return null;
        }
        try {
            if (l.d(e3, inputStream)) {
                return Typeface.createFromFile(e3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e3.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i3, String str, int i4) {
        File e3 = l.e(context);
        if (e3 == null) {
            return null;
        }
        try {
            if (l.c(e3, resources, i3)) {
                return Typeface.createFromFile(e3.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e3.delete();
        }
    }

    public g.b g(g.b[] bVarArr, int i3) {
        return (g.b) e(bVarArr, i3, new a());
    }
}

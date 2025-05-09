package o2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import z0.k;
import z0.l;

/* renamed from: o2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0655f {

    /* renamed from: o2.f$a */
    public interface a {
        void a(float f3, float f4, float f5);
    }

    public static void a(Context context, a aVar) {
        Activity b3 = b(context);
        if (b3 != null) {
            k b4 = l.a().b(b3);
            aVar.a(b4.a().width(), b4.a().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static Activity b(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}

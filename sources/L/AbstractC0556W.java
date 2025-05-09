package l;

import android.os.Build;
import android.view.View;

/* renamed from: l.W, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0556W {

    /* renamed from: l.W$a */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
        } else {
            ViewOnLongClickListenerC0559Z.g(view, charSequence);
        }
    }
}

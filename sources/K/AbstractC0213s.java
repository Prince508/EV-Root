package K;

import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: K.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0213s {
    public static void a(int i3, int i4, int i5, Rect rect, Rect rect2, int i6) {
        Gravity.apply(i3, i4, i5, rect, rect2, i6);
    }

    public static int b(int i3, int i4) {
        return Gravity.getAbsoluteGravity(i3, i4);
    }
}

package u1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import f.AbstractC0467a;
import l.C0552S;

/* renamed from: u1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0740c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        ColorStateList a3;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (a3 = AbstractC0467a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i3) : a3;
    }

    public static ColorStateList b(Context context, C0552S c0552s, int i3) {
        int m3;
        ColorStateList a3;
        return (!c0552s.q(i3) || (m3 = c0552s.m(i3, 0)) == 0 || (a3 = AbstractC0467a.a(context, m3)) == null) ? c0552s.c(i3) : a3;
    }

    public static Drawable c(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        Drawable b3;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (b3 = AbstractC0467a.b(context, resourceId)) == null) ? typedArray.getDrawable(i3) : b3;
    }

    public static int d(TypedArray typedArray, int i3, int i4) {
        return typedArray.hasValue(i3) ? i3 : i4;
    }

    public static C0741d e(Context context, TypedArray typedArray, int i3) {
        int resourceId;
        if (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) {
            return null;
        }
        return new C0741d(context, resourceId);
    }

    public static boolean f(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}

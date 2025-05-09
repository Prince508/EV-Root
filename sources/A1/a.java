package A1;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import e1.AbstractC0464a;
import j.C0513c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1a = {R.attr.theme, AbstractC0464a.f6781F};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2b = {AbstractC0464a.f6800r};

    public static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    public static int b(Context context, AttributeSet attributeSet, int i3, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2b, i3, i4);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i3, int i4) {
        int b3 = b(context, attributeSet, i3, i4);
        boolean z3 = (context instanceof C0513c) && ((C0513c) context).b() == b3;
        if (b3 == 0 || z3) {
            return context;
        }
        C0513c c0513c = new C0513c(context, b3);
        int a3 = a(context, attributeSet);
        if (a3 != 0) {
            c0513c.getTheme().applyStyle(a3, true);
        }
        return c0513c;
    }
}

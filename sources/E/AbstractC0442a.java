package e;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import d.i;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0442a extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f6378a;

    public AbstractC0442a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6378a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f6323r);
        this.f6378a = obtainStyledAttributes.getInt(i.f6327s, 0);
        obtainStyledAttributes.recycle();
    }

    public AbstractC0442a(int i3, int i4) {
        super(i3, i4);
        this.f6378a = 8388627;
    }

    public AbstractC0442a(AbstractC0442a abstractC0442a) {
        super((ViewGroup.MarginLayoutParams) abstractC0442a);
        this.f6378a = 0;
        this.f6378a = abstractC0442a.f6378a;
    }

    public AbstractC0442a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f6378a = 0;
    }
}

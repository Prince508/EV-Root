package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import d.i;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: e, reason: collision with root package name */
    public final int f2708e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2709f;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f6349x1);
        this.f2709f = obtainStyledAttributes.getDimensionPixelOffset(i.f6353y1, -1);
        this.f2708e = obtainStyledAttributes.getDimensionPixelOffset(i.f6357z1, -1);
    }
}

package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import l.C0552S;

/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2963e = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0552S s3 = C0552S.s(context, attributeSet, f2963e);
        setBackgroundDrawable(s3.g(0));
        s3.u();
    }
}

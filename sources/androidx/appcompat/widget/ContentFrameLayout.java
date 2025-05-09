package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f2967e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f2968f;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f2969g;

    /* renamed from: h, reason: collision with root package name */
    public TypedValue f2970h;

    /* renamed from: i, reason: collision with root package name */
    public TypedValue f2971i;

    /* renamed from: j, reason: collision with root package name */
    public TypedValue f2972j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f2973k;

    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2971i == null) {
            this.f2971i = new TypedValue();
        }
        return this.f2971i;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2972j == null) {
            this.f2972j = new TypedValue();
        }
        return this.f2972j;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2969g == null) {
            this.f2969g = new TypedValue();
        }
        return this.f2969g;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2970h == null) {
            this.f2970h = new TypedValue();
        }
        return this.f2970h;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2967e == null) {
            this.f2967e = new TypedValue();
        }
        return this.f2967e;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2968f == null) {
            this.f2968f = new TypedValue();
        }
        return this.f2968f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f2973k = new Rect();
    }
}

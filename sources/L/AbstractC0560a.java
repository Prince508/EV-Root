package l;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import d.AbstractC0435a;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0560a extends ViewGroup {

    /* renamed from: e, reason: collision with root package name */
    public final C0133a f8314e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f8315f;

    /* renamed from: g, reason: collision with root package name */
    public ActionMenuView f8316g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.appcompat.widget.a f8317h;

    /* renamed from: i, reason: collision with root package name */
    public int f8318i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8319j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8320k;

    /* renamed from: l.a$a, reason: collision with other inner class name */
    public class C0133a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f8321a = false;

        public C0133a() {
        }
    }

    public AbstractC0560a(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f8314e = new C0133a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(AbstractC0435a.f6014a, typedValue, true) || typedValue.resourceId == 0) {
            this.f8315f = context;
        } else {
            this.f8315f = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int b(int i3, int i4, boolean z3) {
        return z3 ? i3 - i4 : i3 + i4;
    }

    public int a(View view, int i3, int i4, int i5) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), i4);
        return Math.max(0, (i3 - view.getMeasuredWidth()) - i5);
    }

    public int c(View view, int i3, int i4, int i5, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i6 = i4 + ((i5 - measuredHeight) / 2);
        if (z3) {
            view.layout(i3 - measuredWidth, i6, i3, measuredHeight + i6);
        } else {
            view.layout(i3, i6, i3 + measuredWidth, measuredHeight + i6);
        }
        return z3 ? -measuredWidth : measuredWidth;
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f8318i;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, d.i.f6255a, AbstractC0435a.f6016c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(d.i.f6287i, 0));
        obtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.f8317h;
        if (aVar != null) {
            aVar.C(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f8320k = false;
        }
        if (!this.f8320k) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f8320k = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f8320k = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f8319j = false;
        }
        if (!this.f8319j) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f8319j = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f8319j = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i3);

    @Override // android.view.View
    public void setVisibility(int i3) {
        if (i3 != getVisibility()) {
            super.setVisibility(i3);
        }
    }
}

package androidx.fragment.app;

import C2.g;
import C2.k;
import K.C0205k0;
import K.O;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import d0.AbstractC0439c;
import e0.AbstractComponentCallbacksC0459p;
import e0.B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public final List f3942e;

    /* renamed from: f, reason: collision with root package name */
    public final List f3943f;

    /* renamed from: g, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f3944g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3945h;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3946a = new a();

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            k.e(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            k.e(view, "v");
            k.e(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            k.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        k.e(context, "context");
    }

    public final void a(View view) {
        if (this.f3943f.contains(view)) {
            this.f3942e.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        k.e(view, "child");
        if (B.p0(view) != null) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0205k0 V2;
        k.e(windowInsets, "insets");
        C0205k0 t3 = C0205k0.t(windowInsets);
        k.d(t3, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3944g;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f3946a;
            k.b(onApplyWindowInsetsListener);
            V2 = C0205k0.t(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            V2 = O.V(this, t3);
        }
        k.d(V2, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!V2.n()) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                O.f(getChildAt(i3), V2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        k.e(canvas, "canvas");
        if (this.f3945h) {
            Iterator it = this.f3942e.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        k.e(canvas, "canvas");
        k.e(view, "child");
        if (this.f3945h && !this.f3942e.isEmpty() && this.f3942e.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        k.e(view, "view");
        this.f3943f.remove(view);
        if (this.f3942e.remove(view)) {
            this.f3945h = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0459p> F getFragment() {
        return (F) B.Z(this).X(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                k.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        k.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i3) {
        View childAt = getChildAt(i3);
        k.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i3);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        k.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i3, int i4) {
        int i5 = i3 + i4;
        for (int i6 = i3; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            k.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i3, i4);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i3, int i4) {
        int i5 = i3 + i4;
        for (int i6 = i3; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            k.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i3, i4);
    }

    public final void setDrawDisappearingViewsLast(boolean z3) {
        this.f3945h = z3;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        k.e(onApplyWindowInsetsListener, "listener");
        this.f3944g = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        k.e(view, "view");
        if (view.getParent() == this) {
            this.f3943f.add(view);
        }
        super.startViewTransition(view);
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i3, int i4, g gVar) {
        this(context, attributeSet, (i4 & 4) != 0 ? 0 : i3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        String str;
        k.e(context, "context");
        this.f3942e = new ArrayList();
        this.f3943f = new ArrayList();
        this.f3945h = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = AbstractC0439c.f6372e;
            k.d(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(AbstractC0439c.f6373f);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, B b3) {
        super(context, attributeSet);
        String str;
        k.e(context, "context");
        k.e(attributeSet, "attrs");
        k.e(b3, "fm");
        this.f3942e = new ArrayList();
        this.f3943f = new ArrayList();
        this.f3945h = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = AbstractC0439c.f6372e;
        k.d(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(AbstractC0439c.f6373f) : classAttribute;
        String string = obtainStyledAttributes.getString(AbstractC0439c.f6374g);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0459p X2 = b3.X(id);
        if (classAttribute != null && X2 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            AbstractComponentCallbacksC0459p a3 = b3.i0().a(context.getClassLoader(), classAttribute);
            k.d(a3, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a3.f6687A = id;
            a3.f6688B = id;
            a3.f6689C = string;
            a3.f6736x = b3;
            b3.j0();
            a3.h0(context, attributeSet, null);
            b3.l().n(true).c(this, a3, string).h();
        }
        b3.F0(this);
    }
}

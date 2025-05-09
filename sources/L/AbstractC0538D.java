package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import d.AbstractC0435a;
import g.AbstractC0476a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: l.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0538D extends ListView {

    /* renamed from: e, reason: collision with root package name */
    public final Rect f8160e;

    /* renamed from: f, reason: collision with root package name */
    public int f8161f;

    /* renamed from: g, reason: collision with root package name */
    public int f8162g;

    /* renamed from: h, reason: collision with root package name */
    public int f8163h;

    /* renamed from: i, reason: collision with root package name */
    public int f8164i;

    /* renamed from: j, reason: collision with root package name */
    public int f8165j;

    /* renamed from: k, reason: collision with root package name */
    public d f8166k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8167l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8168m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8169n;

    /* renamed from: o, reason: collision with root package name */
    public Q.e f8170o;

    /* renamed from: p, reason: collision with root package name */
    public f f8171p;

    /* renamed from: l.D$a */
    public static class a {
        public static void a(View view, float f3, float f4) {
            view.drawableHotspotChanged(f3, f4);
        }
    }

    /* renamed from: l.D$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static Method f8172a;

        /* renamed from: b, reason: collision with root package name */
        public static Method f8173b;

        /* renamed from: c, reason: collision with root package name */
        public static Method f8174c;

        /* renamed from: d, reason: collision with root package name */
        public static boolean f8175d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f8172a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f8173b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f8174c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f8175d = true;
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            }
        }

        public static boolean a() {
            return f8175d;
        }

        public static void b(AbstractC0538D abstractC0538D, int i3, View view) {
            try {
                f8172a.invoke(abstractC0538D, Integer.valueOf(i3), view, Boolean.FALSE, -1, -1);
                f8173b.invoke(abstractC0538D, Integer.valueOf(i3));
                f8174c.invoke(abstractC0538D, Integer.valueOf(i3));
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
    }

    /* renamed from: l.D$c */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z3) {
            absListView.setSelectedChildViewEnabled(z3);
        }
    }

    /* renamed from: l.D$d */
    public static class d extends AbstractC0476a {

        /* renamed from: f, reason: collision with root package name */
        public boolean f8176f;

        public d(Drawable drawable) {
            super(drawable);
            this.f8176f = true;
        }

        public void b(boolean z3) {
            this.f8176f = z3;
        }

        @Override // g.AbstractC0476a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f8176f) {
                super.draw(canvas);
            }
        }

        @Override // g.AbstractC0476a, android.graphics.drawable.Drawable
        public void setHotspot(float f3, float f4) {
            if (this.f8176f) {
                super.setHotspot(f3, f4);
            }
        }

        @Override // g.AbstractC0476a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i3, int i4, int i5, int i6) {
            if (this.f8176f) {
                super.setHotspotBounds(i3, i4, i5, i6);
            }
        }

        @Override // g.AbstractC0476a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f8176f) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // g.AbstractC0476a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z3, boolean z4) {
            if (this.f8176f) {
                return super.setVisible(z3, z4);
            }
            return false;
        }
    }

    /* renamed from: l.D$e */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public static final Field f8177a;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                e3.printStackTrace();
            }
            f8177a = field;
        }

        public static boolean a(AbsListView absListView) {
            Field field = f8177a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
                return false;
            }
        }

        public static void b(AbsListView absListView, boolean z3) {
            Field field = f8177a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z3));
                } catch (IllegalAccessException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    /* renamed from: l.D$f */
    public class f implements Runnable {
        public f() {
        }

        public void a() {
            AbstractC0538D abstractC0538D = AbstractC0538D.this;
            abstractC0538D.f8171p = null;
            abstractC0538D.removeCallbacks(this);
        }

        public void b() {
            AbstractC0538D.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0538D abstractC0538D = AbstractC0538D.this;
            abstractC0538D.f8171p = null;
            abstractC0538D.drawableStateChanged();
        }
    }

    public AbstractC0538D(Context context, boolean z3) {
        super(context, null, AbstractC0435a.f6027n);
        this.f8160e = new Rect();
        this.f8161f = 0;
        this.f8162g = 0;
        this.f8163h = 0;
        this.f8164i = 0;
        this.f8168m = z3;
        setCacheColorHint(0);
    }

    public final void a() {
        this.f8169n = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f8165j - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
    }

    public final void b(View view, int i3) {
        performItemClick(view, i3, getItemIdAtPosition(i3));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (this.f8160e.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f8160e);
        selector.draw(canvas);
    }

    public int d(int i3, int i4, int i5, int i6, int i7) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i8 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        View view = null;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            view.measure(i3, i12 > 0 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i9 > 0) {
                i8 += dividerHeight;
            }
            i8 += view.getMeasuredHeight();
            if (i8 >= i6) {
                return (i7 < 0 || i9 <= i7 || i11 <= 0 || i8 == i6) ? i6 : i11;
            }
            if (i7 >= 0 && i9 >= i7) {
                i11 = i8;
            }
            i9++;
        }
        return i8;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f8171p != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r3 = r1
            r9 = r2
            goto L46
        L11:
            r9 = r2
            r3 = r9
            goto L46
        L14:
            r3 = r1
            goto L17
        L16:
            r3 = r2
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.i(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.a()
        L4d:
            if (r3 == 0) goto L65
            Q.e r9 = r7.f8170o
            if (r9 != 0) goto L5a
            Q.e r9 = new Q.e
            r9.<init>(r7)
            r7.f8170o = r9
        L5a:
            Q.e r9 = r7.f8170o
            r9.m(r1)
            Q.e r9 = r7.f8170o
            r9.onTouch(r7, r8)
            return r3
        L65:
            Q.e r8 = r7.f8170o
            if (r8 == 0) goto L6c
            r8.m(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC0538D.e(android.view.MotionEvent, int):boolean");
    }

    public final void f(int i3, View view) {
        Rect rect = this.f8160e;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f8161f;
        rect.top -= this.f8162g;
        rect.right += this.f8163h;
        rect.bottom += this.f8164i;
        boolean k3 = k();
        if (view.isEnabled() != k3) {
            l(!k3);
            if (i3 != -1) {
                refreshDrawableState();
            }
        }
    }

    public final void g(int i3, View view) {
        Drawable selector = getSelector();
        boolean z3 = (selector == null || i3 == -1) ? false : true;
        if (z3) {
            selector.setVisible(false, false);
        }
        f(i3, view);
        if (z3) {
            Rect rect = this.f8160e;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            D.a.e(selector, exactCenterX, exactCenterY);
        }
    }

    public final void h(int i3, View view, float f3, float f4) {
        g(i3, view);
        Drawable selector = getSelector();
        if (selector == null || i3 == -1) {
            return;
        }
        D.a.e(selector, f3, f4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f8168m || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f8168m || super.hasWindowFocus();
    }

    public final void i(View view, int i3, float f3, float f4) {
        View childAt;
        this.f8169n = true;
        a.a(this, f3, f4);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i4 = this.f8165j;
        if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f8165j = i3;
        a.a(view, f3 - view.getLeft(), f4 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i3, view, f3, f4);
        j(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f8168m || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f8168m && this.f8167l) || super.isInTouchMode();
    }

    public final void j(boolean z3) {
        d dVar = this.f8166k;
        if (dVar != null) {
            dVar.b(z3);
        }
    }

    public final boolean k() {
        return G.a.b() ? c.a(this) : e.a(this);
    }

    public final void l(boolean z3) {
        if (G.a.b()) {
            c.b(this, z3);
        } else {
            e.b(this, z3);
        }
    }

    public final boolean m() {
        return this.f8169n;
    }

    public final void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f8171p = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f8171p == null) {
            f fVar = new f();
            this.f8171p = fVar;
            fVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i3 < 30 || !b.a()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, pointToPosition, childAt);
                }
            }
            n();
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f8165j = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f8171p;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f8167l = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f8166k = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f8161f = rect.left;
        this.f8162g = rect.top;
        this.f8163h = rect.right;
        this.f8164i = rect.bottom;
    }
}

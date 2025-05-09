package g1;

import K.O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0481a extends c {

    /* renamed from: d, reason: collision with root package name */
    public Runnable f7212d;

    /* renamed from: e, reason: collision with root package name */
    public OverScroller f7213e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7214f;

    /* renamed from: g, reason: collision with root package name */
    public int f7215g;

    /* renamed from: h, reason: collision with root package name */
    public int f7216h;

    /* renamed from: i, reason: collision with root package name */
    public int f7217i;

    /* renamed from: j, reason: collision with root package name */
    public VelocityTracker f7218j;

    /* renamed from: g1.a$a, reason: collision with other inner class name */
    public class RunnableC0120a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final CoordinatorLayout f7219e;

        /* renamed from: f, reason: collision with root package name */
        public final View f7220f;

        public RunnableC0120a(CoordinatorLayout coordinatorLayout, View view) {
            this.f7219e = coordinatorLayout;
            this.f7220f = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f7220f == null || (overScroller = AbstractC0481a.this.f7213e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                AbstractC0481a.this.M(this.f7219e, this.f7220f);
                return;
            }
            AbstractC0481a abstractC0481a = AbstractC0481a.this;
            abstractC0481a.O(this.f7219e, this.f7220f, abstractC0481a.f7213e.getCurrY());
            O.b0(this.f7220f, this);
        }
    }

    public AbstractC0481a() {
        this.f7215g = -1;
        this.f7217i = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            int r1 = r12.getActionMasked()
            r6 = -1
            r7 = 1
            r8 = 0
            if (r1 == r7) goto L4d
            r3 = 2
            if (r1 == r3) goto L2d
            r2 = 3
            if (r1 == r2) goto L71
            r2 = 6
            if (r1 == r2) goto L13
            goto L4b
        L13:
            int r1 = r12.getActionIndex()
            if (r1 != 0) goto L1b
            r1 = r7
            goto L1c
        L1b:
            r1 = r8
        L1c:
            int r2 = r12.getPointerId(r1)
            r9.f7215g = r2
            float r1 = r12.getY(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.f7216h = r1
            goto L4b
        L2d:
            int r1 = r9.f7215g
            int r1 = r12.findPointerIndex(r1)
            if (r1 != r6) goto L36
            return r8
        L36:
            float r1 = r12.getY(r1)
            int r1 = (int) r1
            int r3 = r9.f7216h
            int r3 = r3 - r1
            r9.f7216h = r1
            int r4 = r9.J(r11)
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.N(r1, r2, r3, r4, r5)
        L4b:
            r1 = r8
            goto L80
        L4d:
            android.view.VelocityTracker r1 = r9.f7218j
            if (r1 == 0) goto L71
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r9.f7218j
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            android.view.VelocityTracker r1 = r9.f7218j
            int r3 = r9.f7215g
            float r5 = r1.getYVelocity(r3)
            int r1 = r9.K(r11)
            int r3 = -r1
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.I(r1, r2, r3, r4, r5)
            r1 = r7
            goto L72
        L71:
            r1 = r8
        L72:
            r9.f7214f = r8
            r9.f7215g = r6
            android.view.VelocityTracker r2 = r9.f7218j
            if (r2 == 0) goto L80
            r2.recycle()
            r2 = 0
            r9.f7218j = r2
        L80:
            android.view.VelocityTracker r2 = r9.f7218j
            if (r2 == 0) goto L87
            r2.addMovement(r12)
        L87:
            boolean r2 = r9.f7214f
            if (r2 != 0) goto L8f
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            return r8
        L8f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.AbstractC0481a.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract boolean G(View view);

    public final void H() {
        if (this.f7218j == null) {
            this.f7218j = VelocityTracker.obtain();
        }
    }

    public final boolean I(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, float f3) {
        Runnable runnable = this.f7212d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f7212d = null;
        }
        if (this.f7213e == null) {
            this.f7213e = new OverScroller(view.getContext());
        }
        this.f7213e.fling(0, E(), 0, Math.round(f3), 0, 0, i3, i4);
        if (!this.f7213e.computeScrollOffset()) {
            M(coordinatorLayout, view);
            return false;
        }
        RunnableC0120a runnableC0120a = new RunnableC0120a(coordinatorLayout, view);
        this.f7212d = runnableC0120a;
        O.b0(view, runnableC0120a);
        return true;
    }

    public abstract int J(View view);

    public abstract int K(View view);

    public abstract int L();

    public abstract void M(CoordinatorLayout coordinatorLayout, View view);

    public final int N(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5) {
        return P(coordinatorLayout, view, L() - i3, i4, i5);
    }

    public int O(CoordinatorLayout coordinatorLayout, View view, int i3) {
        return P(coordinatorLayout, view, i3, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public abstract int P(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f7217i < 0) {
            this.f7217i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f7214f) {
            int i3 = this.f7215g;
            if (i3 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i3)) == -1) {
                return false;
            }
            int y3 = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y3 - this.f7216h) > this.f7217i) {
                this.f7216h = y3;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f7215g = -1;
            int x3 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            boolean z3 = G(view) && coordinatorLayout.z(view, x3, y4);
            this.f7214f = z3;
            if (z3) {
                this.f7216h = y4;
                this.f7215g = motionEvent.getPointerId(0);
                H();
                OverScroller overScroller = this.f7213e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f7213e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f7218j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public AbstractC0481a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7215g = -1;
        this.f7217i = -1;
    }
}

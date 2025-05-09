package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import k.InterfaceC0525c;

/* renamed from: l.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0540F implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: e, reason: collision with root package name */
    public final float f8179e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8180f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8181g;

    /* renamed from: h, reason: collision with root package name */
    public final View f8182h;

    /* renamed from: i, reason: collision with root package name */
    public Runnable f8183i;

    /* renamed from: j, reason: collision with root package name */
    public Runnable f8184j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8185k;

    /* renamed from: l, reason: collision with root package name */
    public int f8186l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f8187m = new int[2];

    /* renamed from: l.F$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerC0540F.this.f8182h.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: l.F$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC0540F.this.e();
        }
    }

    public AbstractViewOnTouchListenerC0540F(View view) {
        this.f8182h = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f8179e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f8180f = tapTimeout;
        this.f8181g = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f3, float f4, float f5) {
        float f6 = -f5;
        return f3 >= f6 && f4 >= f6 && f3 < ((float) (view.getRight() - view.getLeft())) + f5 && f4 < ((float) (view.getBottom() - view.getTop())) + f5;
    }

    public final void a() {
        Runnable runnable = this.f8184j;
        if (runnable != null) {
            this.f8182h.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f8183i;
        if (runnable2 != null) {
            this.f8182h.removeCallbacks(runnable2);
        }
    }

    public abstract InterfaceC0525c b();

    public abstract boolean c();

    public boolean d() {
        InterfaceC0525c b3 = b();
        if (b3 == null || !b3.f()) {
            return true;
        }
        b3.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f8182h;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f8185k = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        AbstractC0538D abstractC0538D;
        View view = this.f8182h;
        InterfaceC0525c b3 = b();
        if (b3 != null && b3.f() && (abstractC0538D = (AbstractC0538D) b3.g()) != null && abstractC0538D.isShown()) {
            MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, obtainNoHistory);
            j(abstractC0538D, obtainNoHistory);
            boolean e3 = abstractC0538D.e(obtainNoHistory, this.f8186l);
            obtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z3 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (e3 && z3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f8182h
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f8186l
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f8179e
            boolean r6 = h(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.a()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f8186l = r6
            java.lang.Runnable r6 = r5.f8183i
            if (r6 != 0) goto L52
            l.F$a r6 = new l.F$a
            r6.<init>()
            r5.f8183i = r6
        L52:
            java.lang.Runnable r6 = r5.f8183i
            int r1 = r5.f8180f
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f8184j
            if (r6 != 0) goto L65
            l.F$b r6 = new l.F$b
            r6.<init>()
            r5.f8184j = r6
        L65:
            java.lang.Runnable r6 = r5.f8184j
            int r1 = r5.f8181g
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractViewOnTouchListenerC0540F.g(android.view.MotionEvent):boolean");
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f8187m);
        motionEvent.offsetLocation(r0[0], r0[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        view.getLocationOnScreen(this.f8187m);
        motionEvent.offsetLocation(-r0[0], -r0[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        boolean z4 = this.f8185k;
        if (z4) {
            z3 = f(motionEvent) || !d();
        } else {
            z3 = g(motionEvent) && c();
            if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f8182h.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f8185k = z3;
        return z3 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f8185k = false;
        this.f8186l = -1;
        Runnable runnable = this.f8183i;
        if (runnable != null) {
            this.f8182h.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}

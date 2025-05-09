package s0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import s0.AbstractC0715k;

/* loaded from: classes.dex */
public abstract class P extends AbstractC0715k {

    /* renamed from: U, reason: collision with root package name */
    public static final String[] f9117U = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: T, reason: collision with root package name */
    public int f9118T = 3;

    public static class a extends AnimatorListenerAdapter implements AbstractC0715k.h {

        /* renamed from: a, reason: collision with root package name */
        public final View f9119a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9120b;

        /* renamed from: c, reason: collision with root package name */
        public final ViewGroup f9121c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f9122d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f9123e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f9124f = false;

        public a(View view, int i3, boolean z3) {
            this.f9119a = view;
            this.f9120b = i3;
            this.f9121c = (ViewGroup) view.getParent();
            this.f9122d = z3;
            d(true);
        }

        @Override // s0.AbstractC0715k.h
        public void a(AbstractC0715k abstractC0715k) {
            abstractC0715k.b0(this);
        }

        public final void b() {
            if (!this.f9124f) {
                C.f(this.f9119a, this.f9120b);
                ViewGroup viewGroup = this.f9121c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            d(false);
        }

        @Override // s0.AbstractC0715k.h
        public void c(AbstractC0715k abstractC0715k) {
            d(false);
            if (this.f9124f) {
                return;
            }
            C.f(this.f9119a, this.f9120b);
        }

        public final void d(boolean z3) {
            ViewGroup viewGroup;
            if (!this.f9122d || this.f9123e == z3 || (viewGroup = this.f9121c) == null) {
                return;
            }
            this.f9123e = z3;
            AbstractC0704B.b(viewGroup, z3);
        }

        @Override // s0.AbstractC0715k.h
        public void l(AbstractC0715k abstractC0715k) {
            d(true);
            if (this.f9124f) {
                return;
            }
            C.f(this.f9119a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f9124f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z3) {
            if (z3) {
                return;
            }
            b();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z3) {
            if (z3) {
                C.f(this.f9119a, 0);
                ViewGroup viewGroup = this.f9121c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // s0.AbstractC0715k.h
        public void f(AbstractC0715k abstractC0715k) {
        }

        @Override // s0.AbstractC0715k.h
        public void j(AbstractC0715k abstractC0715k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }

    public class b extends AnimatorListenerAdapter implements AbstractC0715k.h {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f9125a;

        /* renamed from: b, reason: collision with root package name */
        public final View f9126b;

        /* renamed from: c, reason: collision with root package name */
        public final View f9127c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f9128d = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.f9125a = viewGroup;
            this.f9126b = view;
            this.f9127c = view2;
        }

        @Override // s0.AbstractC0715k.h
        public void a(AbstractC0715k abstractC0715k) {
            abstractC0715k.b0(this);
        }

        public final void b() {
            this.f9127c.setTag(AbstractC0712h.f9190a, null);
            this.f9125a.getOverlay().remove(this.f9126b);
            this.f9128d = false;
        }

        @Override // s0.AbstractC0715k.h
        public void j(AbstractC0715k abstractC0715k) {
            if (this.f9128d) {
                b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f9125a.getOverlay().remove(this.f9126b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f9126b.getParent() == null) {
                this.f9125a.getOverlay().add(this.f9126b);
            } else {
                P.this.j();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z3) {
            if (z3) {
                this.f9127c.setTag(AbstractC0712h.f9190a, this.f9126b);
                this.f9125a.getOverlay().add(this.f9126b);
                this.f9128d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z3) {
            if (z3) {
                return;
            }
            b();
        }

        @Override // s0.AbstractC0715k.h
        public void c(AbstractC0715k abstractC0715k) {
        }

        @Override // s0.AbstractC0715k.h
        public void f(AbstractC0715k abstractC0715k) {
        }

        @Override // s0.AbstractC0715k.h
        public void l(AbstractC0715k abstractC0715k) {
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f9130a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f9131b;

        /* renamed from: c, reason: collision with root package name */
        public int f9132c;

        /* renamed from: d, reason: collision with root package name */
        public int f9133d;

        /* renamed from: e, reason: collision with root package name */
        public ViewGroup f9134e;

        /* renamed from: f, reason: collision with root package name */
        public ViewGroup f9135f;
    }

    private void p0(y yVar) {
        yVar.f9278a.put("android:visibility:visibility", Integer.valueOf(yVar.f9279b.getVisibility()));
        yVar.f9278a.put("android:visibility:parent", yVar.f9279b.getParent());
        int[] iArr = new int[2];
        yVar.f9279b.getLocationOnScreen(iArr);
        yVar.f9278a.put("android:visibility:screenLocation", iArr);
    }

    @Override // s0.AbstractC0715k
    public String[] K() {
        return f9117U;
    }

    @Override // s0.AbstractC0715k
    public boolean O(y yVar, y yVar2) {
        if (yVar == null && yVar2 == null) {
            return false;
        }
        if (yVar != null && yVar2 != null && yVar2.f9278a.containsKey("android:visibility:visibility") != yVar.f9278a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c q02 = q0(yVar, yVar2);
        return q02.f9130a && (q02.f9132c == 0 || q02.f9133d == 0);
    }

    @Override // s0.AbstractC0715k
    public void k(y yVar) {
        p0(yVar);
    }

    @Override // s0.AbstractC0715k
    public void n(y yVar) {
        p0(yVar);
    }

    public final c q0(y yVar, y yVar2) {
        c cVar = new c();
        cVar.f9130a = false;
        cVar.f9131b = false;
        if (yVar == null || !yVar.f9278a.containsKey("android:visibility:visibility")) {
            cVar.f9132c = -1;
            cVar.f9134e = null;
        } else {
            cVar.f9132c = ((Integer) yVar.f9278a.get("android:visibility:visibility")).intValue();
            cVar.f9134e = (ViewGroup) yVar.f9278a.get("android:visibility:parent");
        }
        if (yVar2 == null || !yVar2.f9278a.containsKey("android:visibility:visibility")) {
            cVar.f9133d = -1;
            cVar.f9135f = null;
        } else {
            cVar.f9133d = ((Integer) yVar2.f9278a.get("android:visibility:visibility")).intValue();
            cVar.f9135f = (ViewGroup) yVar2.f9278a.get("android:visibility:parent");
        }
        if (yVar != null && yVar2 != null) {
            int i3 = cVar.f9132c;
            int i4 = cVar.f9133d;
            if (i3 != i4 || cVar.f9134e != cVar.f9135f) {
                if (i3 != i4) {
                    if (i3 == 0) {
                        cVar.f9131b = false;
                        cVar.f9130a = true;
                        return cVar;
                    }
                    if (i4 == 0) {
                        cVar.f9131b = true;
                        cVar.f9130a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f9135f == null) {
                        cVar.f9131b = false;
                        cVar.f9130a = true;
                        return cVar;
                    }
                    if (cVar.f9134e == null) {
                        cVar.f9131b = true;
                        cVar.f9130a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (yVar == null && cVar.f9133d == 0) {
                cVar.f9131b = true;
                cVar.f9130a = true;
                return cVar;
            }
            if (yVar2 == null && cVar.f9132c == 0) {
                cVar.f9131b = false;
                cVar.f9130a = true;
            }
        }
        return cVar;
    }

    @Override // s0.AbstractC0715k
    public Animator r(ViewGroup viewGroup, y yVar, y yVar2) {
        c q02 = q0(yVar, yVar2);
        if (!q02.f9130a) {
            return null;
        }
        if (q02.f9134e == null && q02.f9135f == null) {
            return null;
        }
        return q02.f9131b ? s0(viewGroup, yVar, q02.f9132c, yVar2, q02.f9133d) : u0(viewGroup, yVar, q02.f9132c, yVar2, q02.f9133d);
    }

    public abstract Animator r0(ViewGroup viewGroup, View view, y yVar, y yVar2);

    public Animator s0(ViewGroup viewGroup, y yVar, int i3, y yVar2, int i4) {
        if ((this.f9118T & 1) != 1 || yVar2 == null) {
            return null;
        }
        if (yVar == null) {
            View view = (View) yVar2.f9279b.getParent();
            if (q0(y(view, false), L(view, false)).f9130a) {
                return null;
            }
        }
        return r0(viewGroup, yVar2.f9279b, yVar, yVar2);
    }

    public abstract Animator t0(ViewGroup viewGroup, View view, y yVar, y yVar2);

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0083, code lost:
    
        if (r10.f9199A != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator u0(android.view.ViewGroup r11, s0.y r12, int r13, s0.y r14, int r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.P.u0(android.view.ViewGroup, s0.y, int, s0.y, int):android.animation.Animator");
    }

    public void v0(int i3) {
        if ((i3 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f9118T = i3;
    }
}

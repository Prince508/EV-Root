package s0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import s0.AbstractC0715k;

/* renamed from: s0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0706b extends AbstractC0715k {

    /* renamed from: U, reason: collision with root package name */
    public static final String[] f9136U = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: V, reason: collision with root package name */
    public static final Property f9137V = new a(PointF.class, "topLeft");

    /* renamed from: W, reason: collision with root package name */
    public static final Property f9138W = new C0154b(PointF.class, "bottomRight");

    /* renamed from: X, reason: collision with root package name */
    public static final Property f9139X = new c(PointF.class, "bottomRight");

    /* renamed from: Y, reason: collision with root package name */
    public static final Property f9140Y = new d(PointF.class, "topLeft");

    /* renamed from: Z, reason: collision with root package name */
    public static final Property f9141Z = new e(PointF.class, "position");

    /* renamed from: a0, reason: collision with root package name */
    public static final C0713i f9142a0 = new C0713i();

    /* renamed from: T, reason: collision with root package name */
    public boolean f9143T = false;

    /* renamed from: s0.b$a */
    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    /* renamed from: s0.b$b, reason: collision with other inner class name */
    public class C0154b extends Property {
        public C0154b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    /* renamed from: s0.b$c */
    public class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: s0.b$d */
    public class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            C.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: s0.b$e */
    public class e extends Property {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C.d(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: s0.b$f */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f9144a;
        private final i mViewBounds;

        public f(i iVar) {
            this.f9144a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: s0.b$g */
    public static class g extends AnimatorListenerAdapter implements AbstractC0715k.h {

        /* renamed from: a, reason: collision with root package name */
        public final View f9146a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f9147b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f9148c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f9149d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f9150e;

        /* renamed from: f, reason: collision with root package name */
        public final int f9151f;

        /* renamed from: g, reason: collision with root package name */
        public final int f9152g;

        /* renamed from: h, reason: collision with root package name */
        public final int f9153h;

        /* renamed from: i, reason: collision with root package name */
        public final int f9154i;

        /* renamed from: j, reason: collision with root package name */
        public final int f9155j;

        /* renamed from: k, reason: collision with root package name */
        public final int f9156k;

        /* renamed from: l, reason: collision with root package name */
        public final int f9157l;

        /* renamed from: m, reason: collision with root package name */
        public final int f9158m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f9159n;

        public g(View view, Rect rect, boolean z3, Rect rect2, boolean z4, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.f9146a = view;
            this.f9147b = rect;
            this.f9148c = z3;
            this.f9149d = rect2;
            this.f9150e = z4;
            this.f9151f = i3;
            this.f9152g = i4;
            this.f9153h = i5;
            this.f9154i = i6;
            this.f9155j = i7;
            this.f9156k = i8;
            this.f9157l = i9;
            this.f9158m = i10;
        }

        @Override // s0.AbstractC0715k.h
        public void c(AbstractC0715k abstractC0715k) {
            this.f9146a.setTag(AbstractC0712h.f9191b, this.f9146a.getClipBounds());
            this.f9146a.setClipBounds(this.f9150e ? null : this.f9149d);
        }

        @Override // s0.AbstractC0715k.h
        public void j(AbstractC0715k abstractC0715k) {
            this.f9159n = true;
        }

        @Override // s0.AbstractC0715k.h
        public void l(AbstractC0715k abstractC0715k) {
            View view = this.f9146a;
            int i3 = AbstractC0712h.f9191b;
            Rect rect = (Rect) view.getTag(i3);
            this.f9146a.setTag(i3, null);
            this.f9146a.setClipBounds(rect);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z3) {
            if (this.f9159n) {
                return;
            }
            Rect rect = null;
            if (z3) {
                if (!this.f9148c) {
                    rect = this.f9147b;
                }
            } else if (!this.f9150e) {
                rect = this.f9149d;
            }
            this.f9146a.setClipBounds(rect);
            if (z3) {
                C.d(this.f9146a, this.f9151f, this.f9152g, this.f9153h, this.f9154i);
            } else {
                C.d(this.f9146a, this.f9155j, this.f9156k, this.f9157l, this.f9158m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z3) {
            int max = Math.max(this.f9153h - this.f9151f, this.f9157l - this.f9155j);
            int max2 = Math.max(this.f9154i - this.f9152g, this.f9158m - this.f9156k);
            int i3 = z3 ? this.f9155j : this.f9151f;
            int i4 = z3 ? this.f9156k : this.f9152g;
            C.d(this.f9146a, i3, i4, max + i3, max2 + i4);
            this.f9146a.setClipBounds(z3 ? this.f9149d : this.f9147b);
        }

        @Override // s0.AbstractC0715k.h
        public void a(AbstractC0715k abstractC0715k) {
        }

        @Override // s0.AbstractC0715k.h
        public void f(AbstractC0715k abstractC0715k) {
        }
    }

    /* renamed from: s0.b$h */
    public static class h extends s {

        /* renamed from: a, reason: collision with root package name */
        public boolean f9160a = false;

        /* renamed from: b, reason: collision with root package name */
        public final ViewGroup f9161b;

        public h(ViewGroup viewGroup) {
            this.f9161b = viewGroup;
        }

        @Override // s0.s, s0.AbstractC0715k.h
        public void a(AbstractC0715k abstractC0715k) {
            if (!this.f9160a) {
                AbstractC0704B.b(this.f9161b, false);
            }
            abstractC0715k.b0(this);
        }

        @Override // s0.s, s0.AbstractC0715k.h
        public void c(AbstractC0715k abstractC0715k) {
            AbstractC0704B.b(this.f9161b, false);
        }

        @Override // s0.s, s0.AbstractC0715k.h
        public void j(AbstractC0715k abstractC0715k) {
            AbstractC0704B.b(this.f9161b, false);
            this.f9160a = true;
        }

        @Override // s0.s, s0.AbstractC0715k.h
        public void l(AbstractC0715k abstractC0715k) {
            AbstractC0704B.b(this.f9161b, true);
        }
    }

    /* renamed from: s0.b$i */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f9162a;

        /* renamed from: b, reason: collision with root package name */
        public int f9163b;

        /* renamed from: c, reason: collision with root package name */
        public int f9164c;

        /* renamed from: d, reason: collision with root package name */
        public int f9165d;

        /* renamed from: e, reason: collision with root package name */
        public final View f9166e;

        /* renamed from: f, reason: collision with root package name */
        public int f9167f;

        /* renamed from: g, reason: collision with root package name */
        public int f9168g;

        public i(View view) {
            this.f9166e = view;
        }

        public void a(PointF pointF) {
            this.f9164c = Math.round(pointF.x);
            this.f9165d = Math.round(pointF.y);
            int i3 = this.f9168g + 1;
            this.f9168g = i3;
            if (this.f9167f == i3) {
                b();
            }
        }

        public final void b() {
            C.d(this.f9166e, this.f9162a, this.f9163b, this.f9164c, this.f9165d);
            this.f9167f = 0;
            this.f9168g = 0;
        }

        public void c(PointF pointF) {
            this.f9162a = Math.round(pointF.x);
            this.f9163b = Math.round(pointF.y);
            int i3 = this.f9167f + 1;
            this.f9167f = i3;
            if (i3 == this.f9168g) {
                b();
            }
        }
    }

    @Override // s0.AbstractC0715k
    public String[] K() {
        return f9136U;
    }

    @Override // s0.AbstractC0715k
    public boolean N() {
        return true;
    }

    @Override // s0.AbstractC0715k
    public void k(y yVar) {
        p0(yVar);
    }

    @Override // s0.AbstractC0715k
    public void n(y yVar) {
        Rect rect;
        p0(yVar);
        if (!this.f9143T || (rect = (Rect) yVar.f9279b.getTag(AbstractC0712h.f9191b)) == null) {
            return;
        }
        yVar.f9278a.put("android:changeBounds:clip", rect);
    }

    public final void p0(y yVar) {
        View view = yVar.f9279b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        yVar.f9278a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        yVar.f9278a.put("android:changeBounds:parent", yVar.f9279b.getParent());
        if (this.f9143T) {
            yVar.f9278a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s0.AbstractC0715k
    public Animator r(ViewGroup viewGroup, y yVar, y yVar2) {
        int i3;
        int i4;
        int i5;
        int i6;
        ObjectAnimator a3;
        int i7;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator c3;
        if (yVar == null || yVar2 == null) {
            return null;
        }
        Map map = yVar.f9278a;
        Map map2 = yVar2.f9278a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = yVar2.f9279b;
        Rect rect2 = (Rect) yVar.f9278a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) yVar2.f9278a.get("android:changeBounds:bounds");
        int i8 = rect2.left;
        int i9 = rect3.left;
        int i10 = rect2.top;
        int i11 = rect3.top;
        int i12 = rect2.right;
        int i13 = rect3.right;
        int i14 = rect2.bottom;
        int i15 = rect3.bottom;
        int i16 = i12 - i8;
        int i17 = i14 - i10;
        int i18 = i13 - i9;
        int i19 = i15 - i11;
        Rect rect4 = (Rect) yVar.f9278a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) yVar2.f9278a.get("android:changeBounds:clip");
        if ((i16 == 0 || i17 == 0) && (i18 == 0 || i19 == 0)) {
            i3 = 0;
        } else {
            i3 = (i8 == i9 && i10 == i11) ? 0 : 1;
            if (i12 != i13 || i14 != i15) {
                i3++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i3++;
        }
        if (i3 <= 0) {
            return null;
        }
        if (this.f9143T) {
            C.d(view, i8, i10, Math.max(i16, i18) + i8, i10 + Math.max(i17, i19));
            if (i8 == i9 && i10 == i11) {
                a3 = null;
                i4 = i14;
                i5 = i15;
                i6 = i9;
            } else {
                i4 = i14;
                i5 = i15;
                i6 = i9;
                a3 = AbstractC0710f.a(view, f9141Z, A().a(i8, i10, i9, i11));
            }
            boolean z3 = rect4 == null;
            if (z3) {
                i7 = 0;
                rect = new Rect(0, 0, i16, i17);
            } else {
                i7 = 0;
                rect = rect4;
            }
            boolean z4 = rect5 == null ? 1 : i7;
            Rect rect6 = z4 != 0 ? new Rect(i7, i7, i18, i19) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                view.setClipBounds(rect);
                objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", f9142a0, rect, rect6);
                g gVar = new g(view, rect, z3, rect6, z4, i8, i10, i12, i4, i6, i11, i13, i5);
                objectAnimator.addListener(gVar);
                c(gVar);
            }
            c3 = x.c(a3, objectAnimator);
        } else {
            C.d(view, i8, i10, i12, i14);
            if (i3 != 2) {
                c3 = (i8 == i9 && i10 == i11) ? AbstractC0710f.a(view, f9139X, A().a(i12, i14, i13, i15)) : AbstractC0710f.a(view, f9140Y, A().a(i8, i10, i9, i11));
            } else if (i16 == i18 && i17 == i19) {
                c3 = AbstractC0710f.a(view, f9141Z, A().a(i8, i10, i9, i11));
            } else {
                i iVar = new i(view);
                ObjectAnimator a4 = AbstractC0710f.a(iVar, f9137V, A().a(i8, i10, i9, i11));
                ObjectAnimator a5 = AbstractC0710f.a(iVar, f9138W, A().a(i12, i14, i13, i15));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a4, a5);
                animatorSet.addListener(new f(iVar));
                c3 = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            AbstractC0704B.b(viewGroup4, true);
            C().c(new h(viewGroup4));
        }
        return c3;
    }
}

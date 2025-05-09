package s0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import s0.AbstractC0715k;

/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0707c extends P {

    /* renamed from: s0.c$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC0715k.h {

        /* renamed from: a, reason: collision with root package name */
        public final View f9169a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f9170b = false;

        public a(View view) {
            this.f9169a = view;
        }

        @Override // s0.AbstractC0715k.h
        public void c(AbstractC0715k abstractC0715k) {
            this.f9169a.setTag(AbstractC0712h.f9193d, Float.valueOf(this.f9169a.getVisibility() == 0 ? C.b(this.f9169a) : 0.0f));
        }

        @Override // s0.AbstractC0715k.h
        public void l(AbstractC0715k abstractC0715k) {
            this.f9169a.setTag(AbstractC0712h.f9193d, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            C.e(this.f9169a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f9169a.hasOverlappingRendering() && this.f9169a.getLayerType() == 0) {
                this.f9170b = true;
                this.f9169a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z3) {
            if (this.f9170b) {
                this.f9169a.setLayerType(0, null);
            }
            if (z3) {
                return;
            }
            C.e(this.f9169a, 1.0f);
            C.a(this.f9169a);
        }

        @Override // s0.AbstractC0715k.h
        public void a(AbstractC0715k abstractC0715k) {
        }

        @Override // s0.AbstractC0715k.h
        public void f(AbstractC0715k abstractC0715k) {
        }

        @Override // s0.AbstractC0715k.h
        public void j(AbstractC0715k abstractC0715k) {
        }

        @Override // s0.AbstractC0715k.h
        public void i(AbstractC0715k abstractC0715k, boolean z3) {
        }
    }

    public C0707c(int i3) {
        v0(i3);
    }

    public static float x0(y yVar, float f3) {
        Float f4;
        return (yVar == null || (f4 = (Float) yVar.f9278a.get("android:fade:transitionAlpha")) == null) ? f3 : f4.floatValue();
    }

    @Override // s0.AbstractC0715k
    public boolean N() {
        return true;
    }

    @Override // s0.P, s0.AbstractC0715k
    public void n(y yVar) {
        super.n(yVar);
        Float f3 = (Float) yVar.f9279b.getTag(AbstractC0712h.f9193d);
        if (f3 == null) {
            f3 = yVar.f9279b.getVisibility() == 0 ? Float.valueOf(C.b(yVar.f9279b)) : Float.valueOf(0.0f);
        }
        yVar.f9278a.put("android:fade:transitionAlpha", f3);
    }

    @Override // s0.P
    public Animator r0(ViewGroup viewGroup, View view, y yVar, y yVar2) {
        C.c(view);
        return w0(view, x0(yVar, 0.0f), 1.0f);
    }

    @Override // s0.P
    public Animator t0(ViewGroup viewGroup, View view, y yVar, y yVar2) {
        C.c(view);
        Animator w02 = w0(view, x0(yVar, 1.0f), 0.0f);
        if (w02 == null) {
            C.e(view, x0(yVar2, 1.0f));
        }
        return w02;
    }

    public final Animator w0(View view, float f3, float f4) {
        if (f3 == f4) {
            return null;
        }
        C.e(view, f3);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) C.f9108b, f4);
        a aVar = new a(view);
        ofFloat.addListener(aVar);
        C().c(aVar);
        return ofFloat;
    }

    public C0707c() {
    }
}

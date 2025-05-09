package e0;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import d0.AbstractC0437a;
import d0.AbstractC0438b;

/* loaded from: classes.dex */
public abstract class r {
    public static int a(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, boolean z3, boolean z4) {
        return z4 ? z3 ? abstractComponentCallbacksC0459p.B() : abstractComponentCallbacksC0459p.C() : z3 ? abstractComponentCallbacksC0459p.o() : abstractComponentCallbacksC0459p.r();
    }

    public static a b(Context context, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, boolean z3, boolean z4) {
        int x3 = abstractComponentCallbacksC0459p.x();
        int a3 = a(abstractComponentCallbacksC0459p, z3, z4);
        abstractComponentCallbacksC0459p.S0(0, 0, 0, 0);
        ViewGroup viewGroup = abstractComponentCallbacksC0459p.f6697K;
        if (viewGroup != null) {
            int i3 = AbstractC0438b.f6367c;
            if (viewGroup.getTag(i3) != null) {
                abstractComponentCallbacksC0459p.f6697K.setTag(i3, null);
            }
        }
        ViewGroup viewGroup2 = abstractComponentCallbacksC0459p.f6697K;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation Y2 = abstractComponentCallbacksC0459p.Y(x3, z3, a3);
        if (Y2 != null) {
            return new a(Y2);
        }
        Animator Z2 = abstractComponentCallbacksC0459p.Z(x3, z3, a3);
        if (Z2 != null) {
            return new a(Z2);
        }
        if (a3 == 0 && x3 != 0) {
            a3 = d(context, x3, z3);
        }
        if (a3 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(a3));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, a3);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e3) {
                    throw e3;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, a3);
                if (loadAnimator != null) {
                    return new a(loadAnimator);
                }
            } catch (RuntimeException e4) {
                if (equals) {
                    throw e4;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, a3);
                if (loadAnimation2 != null) {
                    return new a(loadAnimation2);
                }
            }
        }
        return null;
    }

    public static int c(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i3});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(Context context, int i3, boolean z3) {
        if (i3 == 4097) {
            return z3 ? AbstractC0437a.f6363e : AbstractC0437a.f6364f;
        }
        if (i3 == 8194) {
            return z3 ? AbstractC0437a.f6359a : AbstractC0437a.f6360b;
        }
        if (i3 == 8197) {
            return z3 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i3 == 4099) {
            return z3 ? AbstractC0437a.f6361c : AbstractC0437a.f6362d;
        }
        if (i3 != 4100) {
            return -1;
        }
        return z3 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f6762a;

        /* renamed from: b, reason: collision with root package name */
        public final AnimatorSet f6763b;

        public a(Animation animation) {
            this.f6762a = animation;
            this.f6763b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f6762a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f6763b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    public static class b extends AnimationSet implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final ViewGroup f6764e;

        /* renamed from: f, reason: collision with root package name */
        public final View f6765f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f6766g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f6767h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f6768i;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f6768i = true;
            this.f6764e = viewGroup;
            this.f6765f = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j3, Transformation transformation) {
            this.f6768i = true;
            if (this.f6766g) {
                return !this.f6767h;
            }
            if (!super.getTransformation(j3, transformation)) {
                this.f6766g = true;
                K.F.a(this.f6764e, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6766g || !this.f6768i) {
                this.f6764e.endViewTransition(this.f6765f);
                this.f6767h = true;
            } else {
                this.f6768i = false;
                this.f6764e.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j3, Transformation transformation, float f3) {
            this.f6768i = true;
            if (this.f6766g) {
                return !this.f6767h;
            }
            if (!super.getTransformation(j3, transformation, f3)) {
                this.f6766g = true;
                K.F.a(this.f6764e, this);
            }
            return true;
        }
    }
}

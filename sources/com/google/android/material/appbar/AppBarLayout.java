package com.google.android.material.appbar;

import K.C0184a;
import K.O;
import L.x;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e1.j;
import g1.AbstractC0481a;
import g1.AbstractC0482b;
import j.AbstractC0515e;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public abstract class AppBarLayout extends LinearLayout {

    public static class BaseBehavior<T extends AppBarLayout> extends AbstractC0481a {

        /* renamed from: k, reason: collision with root package name */
        public int f4975k;

        /* renamed from: l, reason: collision with root package name */
        public int f4976l;

        /* renamed from: m, reason: collision with root package name */
        public b f4977m;

        /* renamed from: n, reason: collision with root package name */
        public WeakReference f4978n;

        public class a extends C0184a {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ CoordinatorLayout f4979d;

            public a(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f4979d = coordinatorLayout;
            }

            @Override // K.C0184a
            public void g(View view, x xVar) {
                super.g(view, xVar);
                xVar.j0(ScrollView.class.getName());
                throw null;
            }

            @Override // K.C0184a
            public boolean j(View view, int i3, Bundle bundle) {
                if (i3 == 4096) {
                    throw null;
                }
                if (i3 != 8192) {
                    return super.j(view, i3, bundle);
                }
                if (BaseBehavior.this.L() == 0) {
                    return false;
                }
                if (BaseBehavior.this.U(this.f4979d).canScrollVertically(-1)) {
                    throw null;
                }
                throw null;
            }
        }

        public static class b extends S.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: g, reason: collision with root package name */
            public boolean f4981g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f4982h;

            /* renamed from: i, reason: collision with root package name */
            public int f4983i;

            /* renamed from: j, reason: collision with root package name */
            public float f4984j;

            /* renamed from: k, reason: collision with root package name */
            public boolean f4985k;

            public class a implements Parcelable.ClassLoaderCreator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public b createFromParcel(Parcel parcel) {
                    return new b(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public b[] newArray(int i3) {
                    return new b[i3];
                }
            }

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f4981g = parcel.readByte() != 0;
                this.f4982h = parcel.readByte() != 0;
                this.f4983i = parcel.readInt();
                this.f4984j = parcel.readFloat();
                this.f4985k = parcel.readByte() != 0;
            }

            @Override // S.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i3) {
                super.writeToParcel(parcel, i3);
                parcel.writeByte(this.f4981g ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f4982h ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f4983i);
                parcel.writeFloat(this.f4984j);
                parcel.writeByte(this.f4985k ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i4) {
            AbstractC0515e.a(view);
            return e0(coordinatorLayout, null, view2, view3, i3, i4);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i3) {
            AbstractC0515e.a(view);
            f0(coordinatorLayout, null, view2, i3);
        }

        @Override // g1.AbstractC0481a
        public /* bridge */ /* synthetic */ boolean G(View view) {
            AbstractC0515e.a(view);
            return T(null);
        }

        @Override // g1.AbstractC0481a
        public /* bridge */ /* synthetic */ int J(View view) {
            AbstractC0515e.a(view);
            return V(null);
        }

        @Override // g1.AbstractC0481a
        public /* bridge */ /* synthetic */ int K(View view) {
            AbstractC0515e.a(view);
            return W(null);
        }

        @Override // g1.AbstractC0481a
        public int L() {
            return E() + this.f4975k;
        }

        @Override // g1.AbstractC0481a
        public /* bridge */ /* synthetic */ void M(CoordinatorLayout coordinatorLayout, View view) {
            AbstractC0515e.a(view);
            X(coordinatorLayout, null);
        }

        @Override // g1.AbstractC0481a
        public /* bridge */ /* synthetic */ int P(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5) {
            AbstractC0515e.a(view);
            return i0(coordinatorLayout, null, i3, i4, i5);
        }

        public final void S(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (O.J(coordinatorLayout)) {
                return;
            }
            O.j0(coordinatorLayout, new a(appBarLayout, coordinatorLayout));
        }

        public boolean T(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f4978n;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public final View U(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = coordinatorLayout.getChildAt(i3);
                if (((CoordinatorLayout.e) childAt.getLayoutParams()).e() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        public int V(AppBarLayout appBarLayout) {
            throw null;
        }

        public int W(AppBarLayout appBarLayout) {
            throw null;
        }

        public void X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            j0(coordinatorLayout, appBarLayout);
            throw null;
        }

        public boolean Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i3) {
            super.l(coordinatorLayout, appBarLayout, i3);
            throw null;
        }

        public boolean Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i3, int i4, int i5, int i6) {
            throw null;
        }

        public void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i3, int i4, int[] iArr, int i5) {
            if (i4 == 0) {
                throw null;
            }
            if (i4 >= 0) {
                throw null;
            }
            throw null;
        }

        public void b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
            if (i6 < 0) {
                throw null;
            }
            if (i6 == 0) {
                S(coordinatorLayout, appBarLayout);
            }
        }

        public void c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof b) {
                g0((b) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f4977m.a());
            } else {
                super.x(coordinatorLayout, appBarLayout, parcelable);
                this.f4977m = null;
            }
        }

        public Parcelable d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable y3 = super.y(coordinatorLayout, appBarLayout);
            b h02 = h0(y3, appBarLayout);
            return h02 == null ? y3 : h02;
        }

        public boolean e0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i3, int i4) {
            if ((i3 & 2) != 0) {
                throw null;
            }
            this.f4978n = null;
            this.f4976l = i4;
            return false;
        }

        public void f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i3) {
            if (this.f4976l == 0 || i3 == 1) {
                j0(coordinatorLayout, appBarLayout);
                throw null;
            }
            this.f4978n = new WeakReference(view);
        }

        public void g0(b bVar, boolean z3) {
            if (this.f4977m == null || z3) {
                this.f4977m = bVar;
            }
        }

        public b h0(Parcelable parcelable, AppBarLayout appBarLayout) {
            E();
            throw null;
        }

        public int i0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i3, int i4, int i5) {
            int L3 = L();
            if (i4 == 0 || L3 < i4 || L3 > i5) {
                this.f4975k = 0;
            } else if (L3 != F.a.b(i3, i4, i5)) {
                throw null;
            }
            S(coordinatorLayout, appBarLayout);
            return 0;
        }

        public final void j0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            throw null;
        }

        @Override // g1.c, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i3) {
            AbstractC0515e.a(view);
            return Y(coordinatorLayout, null, i3);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int i6) {
            AbstractC0515e.a(view);
            return Z(coordinatorLayout, null, i3, i4, i5, i6);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int[] iArr, int i5) {
            AbstractC0515e.a(view);
            a0(coordinatorLayout, null, view2, i3, i4, iArr, i5);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
            AbstractC0515e.a(view);
            b0(coordinatorLayout, null, view2, i3, i4, i5, i6, i7, iArr);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AbstractC0515e.a(view);
            c0(coordinatorLayout, null, parcelable);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            AbstractC0515e.a(view);
            return d0(coordinatorLayout, null);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // g1.AbstractC0481a, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // g1.c
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i3) {
            return super.Y(coordinatorLayout, appBarLayout, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i3, int i4, int i5, int i6) {
            return super.Z(coordinatorLayout, appBarLayout, i3, i4, i5, i6);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i3, int i4, int[] iArr, int i5) {
            super.a0(coordinatorLayout, appBarLayout, view, i3, i4, iArr, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
            super.b0(coordinatorLayout, appBarLayout, view, i3, i4, i5, i6, i7, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.c0(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ Parcelable d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.d0(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean e0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i3, int i4) {
            return super.e0(coordinatorLayout, appBarLayout, view, view2, i3, i4);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i3) {
            super.f0(coordinatorLayout, appBarLayout, view, i3);
        }

        @Override // g1.AbstractC0481a, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends AbstractC0482b {
        public ScrollingViewBehavior() {
        }

        @Override // g1.AbstractC0482b
        public /* bridge */ /* synthetic */ View G(List list) {
            O(list);
            return null;
        }

        @Override // g1.AbstractC0482b
        public float I(View view) {
            return 0.0f;
        }

        @Override // g1.AbstractC0482b
        public int J(View view) {
            return super.J(view);
        }

        public AppBarLayout O(List list) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
            }
            return null;
        }

        public final void P(View view, View view2) {
            CoordinatorLayout.b e3 = ((CoordinatorLayout.e) view2.getLayoutParams()).e();
            if (e3 instanceof BaseBehavior) {
                O.U(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) e3).f4975k) + K()) - H(view2));
            }
        }

        public final void Q(View view, View view2) {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            P(view, view2);
            Q(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        @Override // g1.c, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i3) {
            return super.l(coordinatorLayout, view, i3);
        }

        @Override // g1.AbstractC0482b, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int i6) {
            return super.m(coordinatorLayout, view, i3, i4, i5, i6);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z3) {
            O(coordinatorLayout.q(view));
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.G3);
            M(obtainStyledAttributes.getDimensionPixelSize(j.H3, 0));
            obtainStyledAttributes.recycle();
        }
    }
}

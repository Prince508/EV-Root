package com.google.android.material.internal;

import B.f;
import K.C0184a;
import K.O;
import L.x;
import Q.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.b;
import d.AbstractC0435a;
import e1.c;
import e1.d;
import l.AbstractC0556W;
import r1.AbstractC0681d;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC0681d implements h.a {

    /* renamed from: K, reason: collision with root package name */
    public static final int[] f5443K = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public boolean f5444A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f5445B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f5446C;

    /* renamed from: D, reason: collision with root package name */
    public final CheckedTextView f5447D;

    /* renamed from: E, reason: collision with root package name */
    public FrameLayout f5448E;

    /* renamed from: F, reason: collision with root package name */
    public e f5449F;

    /* renamed from: G, reason: collision with root package name */
    public ColorStateList f5450G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f5451H;

    /* renamed from: I, reason: collision with root package name */
    public Drawable f5452I;

    /* renamed from: J, reason: collision with root package name */
    public final C0184a f5453J;

    /* renamed from: z, reason: collision with root package name */
    public int f5454z;

    public class a extends C0184a {
        public a() {
        }

        @Override // K.C0184a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.h0(NavigationMenuItemView.this.f5445B);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f5448E == null) {
                this.f5448E = (FrameLayout) ((ViewStub) findViewById(e1.e.f6888d)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f5448E.removeAllViews();
            this.f5448E.addView(view);
        }
    }

    public final void A() {
        if (C()) {
            this.f5447D.setVisibility(8);
            FrameLayout frameLayout = this.f5448E;
            if (frameLayout != null) {
                b.a aVar = (b.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f5448E.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f5447D.setVisibility(0);
        FrameLayout frameLayout2 = this.f5448E;
        if (frameLayout2 != null) {
            b.a aVar2 = (b.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f5448E.setLayoutParams(aVar2);
        }
    }

    public final StateListDrawable B() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(AbstractC0435a.f6024k, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f5443K, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    public final boolean C() {
        return this.f5449F.getTitle() == null && this.f5449F.getIcon() == null && this.f5449F.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void d(e eVar, int i3) {
        this.f5449F = eVar;
        if (eVar.getItemId() > 0) {
            setId(eVar.getItemId());
        }
        setVisibility(eVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            O.n0(this, B());
        }
        setCheckable(eVar.isCheckable());
        setChecked(eVar.isChecked());
        setEnabled(eVar.isEnabled());
        setTitle(eVar.getTitle());
        setIcon(eVar.getIcon());
        setActionView(eVar.getActionView());
        setContentDescription(eVar.getContentDescription());
        AbstractC0556W.a(this, eVar.getTooltipText());
        A();
    }

    @Override // androidx.appcompat.view.menu.h.a
    public e getItemData() {
        return this.f5449F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        e eVar = this.f5449F;
        if (eVar != null && eVar.isCheckable() && this.f5449F.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f5443K);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z3) {
        refreshDrawableState();
        if (this.f5445B != z3) {
            this.f5445B = z3;
            this.f5453J.l(this.f5447D, 2048);
        }
    }

    public void setChecked(boolean z3) {
        refreshDrawableState();
        this.f5447D.setChecked(z3);
        CheckedTextView checkedTextView = this.f5447D;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z3 && this.f5446C) ? 1 : 0);
    }

    public void setHorizontalPadding(int i3) {
        setPadding(i3, getPaddingTop(), i3, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f5451H) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = D.a.l(drawable).mutate();
                D.a.i(drawable, this.f5450G);
            }
            int i3 = this.f5454z;
            drawable.setBounds(0, 0, i3, i3);
        } else if (this.f5444A) {
            if (this.f5452I == null) {
                Drawable e3 = f.e(getResources(), d.f6871g, getContext().getTheme());
                this.f5452I = e3;
                if (e3 != null) {
                    int i4 = this.f5454z;
                    e3.setBounds(0, 0, i4, i4);
                }
            }
            drawable = this.f5452I;
        }
        g.i(this.f5447D, drawable, null, null, null);
    }

    public void setIconPadding(int i3) {
        this.f5447D.setCompoundDrawablePadding(i3);
    }

    public void setIconSize(int i3) {
        this.f5454z = i3;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f5450G = colorStateList;
        this.f5451H = colorStateList != null;
        e eVar = this.f5449F;
        if (eVar != null) {
            setIcon(eVar.getIcon());
        }
    }

    public void setMaxLines(int i3) {
        this.f5447D.setMaxLines(i3);
    }

    public void setNeedsEmptyIcon(boolean z3) {
        this.f5444A = z3;
    }

    public void setTextAppearance(int i3) {
        g.n(this.f5447D, i3);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f5447D.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f5447D.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f5446C = true;
        a aVar = new a();
        this.f5453J = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(e1.g.f6912a, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(c.f6840b));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(e1.e.f6889e);
        this.f5447D = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        O.j0(checkedTextView, aVar);
    }
}

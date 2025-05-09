package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionMenuView;
import k.InterfaceC0525c;
import l.AbstractC0556W;
import l.AbstractViewOnTouchListenerC0540F;
import l.C0579t;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0579t implements h.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: l, reason: collision with root package name */
    public e f2710l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f2711m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2712n;

    /* renamed from: o, reason: collision with root package name */
    public d.b f2713o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractViewOnTouchListenerC0540F f2714p;

    /* renamed from: q, reason: collision with root package name */
    public b f2715q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2716r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2717s;

    /* renamed from: t, reason: collision with root package name */
    public int f2718t;

    /* renamed from: u, reason: collision with root package name */
    public int f2719u;

    /* renamed from: v, reason: collision with root package name */
    public int f2720v;

    public class a extends AbstractViewOnTouchListenerC0540F {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // l.AbstractViewOnTouchListenerC0540F
        public InterfaceC0525c b() {
            b bVar = ActionMenuItemView.this.f2715q;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // l.AbstractViewOnTouchListenerC0540F
        public boolean c() {
            InterfaceC0525c b3;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            d.b bVar = actionMenuItemView.f2713o;
            return bVar != null && bVar.a(actionMenuItemView.f2710l) && (b3 = b()) != null && b3.f();
        }
    }

    public static abstract class b {
        public abstract InterfaceC0525c a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return r();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return r() && this.f2710l.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void d(e eVar, int i3) {
        this.f2710l = eVar;
        setIcon(eVar.getIcon());
        setTitle(eVar.h(this));
        setId(eVar.getItemId());
        setVisibility(eVar.isVisible() ? 0 : 8);
        setEnabled(eVar.isEnabled());
        if (eVar.hasSubMenu() && this.f2714p == null) {
            this.f2714p = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.h.a
    public e getItemData() {
        return this.f2710l;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d.b bVar = this.f2713o;
        if (bVar != null) {
            bVar.a(this.f2710l);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2716r = s();
        t();
    }

    @Override // l.C0579t, android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i4) {
        int i5;
        boolean r3 = r();
        if (r3 && (i5 = this.f2719u) >= 0) {
            super.setPadding(i5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i4);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f2718t) : this.f2718t;
        if (mode != 1073741824 && this.f2718t > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i4);
        }
        if (r3 || this.f2712n == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f2712n.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0540F abstractViewOnTouchListenerC0540F;
        if (this.f2710l.hasSubMenu() && (abstractViewOnTouchListenerC0540F = this.f2714p) != null && abstractViewOnTouchListenerC0540F.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean s() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i3 < 480) {
            return (i3 >= 640 && i4 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f2717s != z3) {
            this.f2717s = z3;
            e eVar = this.f2710l;
            if (eVar != null) {
                eVar.a();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2712n = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.f2720v;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (intrinsicHeight * (i3 / intrinsicWidth));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (intrinsicWidth * (i3 / intrinsicHeight));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, null, null, null);
        t();
    }

    public void setItemInvoker(d.b bVar) {
        this.f2713o = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i3, int i4, int i5, int i6) {
        this.f2719u = i3;
        super.setPadding(i3, i4, i5, i6);
    }

    public void setPopupCallback(b bVar) {
        this.f2715q = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2711m = charSequence;
        t();
    }

    public final void t() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f2711m);
        if (this.f2712n != null && (!this.f2710l.A() || (!this.f2716r && !this.f2717s))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        setText(z5 ? this.f2711m : null);
        CharSequence contentDescription = this.f2710l.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z5 ? null : this.f2710l.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f2710l.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            AbstractC0556W.a(this, z5 ? null : this.f2710l.getTitle());
        } else {
            AbstractC0556W.a(this, tooltipText);
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        Resources resources = context.getResources();
        this.f2716r = s();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.i.f6331t, i3, 0);
        this.f2718t = obtainStyledAttributes.getDimensionPixelSize(d.i.f6335u, 0);
        obtainStyledAttributes.recycle();
        this.f2720v = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2719u = -1;
        setSaveEnabled(false);
    }
}

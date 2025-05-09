package androidx.appcompat.view.menu;

import K.O;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import d.AbstractC0435a;
import l.C0552S;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements h.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: e, reason: collision with root package name */
    public e f2725e;

    /* renamed from: f, reason: collision with root package name */
    public ImageView f2726f;

    /* renamed from: g, reason: collision with root package name */
    public RadioButton f2727g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f2728h;

    /* renamed from: i, reason: collision with root package name */
    public CheckBox f2729i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f2730j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f2731k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f2732l;

    /* renamed from: m, reason: collision with root package name */
    public LinearLayout f2733m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f2734n;

    /* renamed from: o, reason: collision with root package name */
    public int f2735o;

    /* renamed from: p, reason: collision with root package name */
    public Context f2736p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2737q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f2738r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2739s;

    /* renamed from: t, reason: collision with root package name */
    public LayoutInflater f2740t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2741u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0435a.f6029p);
    }

    private LayoutInflater getInflater() {
        if (this.f2740t == null) {
            this.f2740t = LayoutInflater.from(getContext());
        }
        return this.f2740t;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f2731k;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2732l;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2732l.getLayoutParams();
        rect.top += this.f2732l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i3) {
        LinearLayout linearLayout = this.f2733m;
        if (linearLayout != null) {
            linearLayout.addView(view, i3);
        } else {
            addView(view, i3);
        }
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void d(e eVar, int i3) {
        this.f2725e = eVar;
        setVisibility(eVar.isVisible() ? 0 : 8);
        setTitle(eVar.h(this));
        setCheckable(eVar.isCheckable());
        h(eVar.z(), eVar.e());
        setIcon(eVar.getIcon());
        setEnabled(eVar.isEnabled());
        setSubMenuArrowVisible(eVar.hasSubMenu());
        setContentDescription(eVar.getContentDescription());
    }

    public final void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(d.f.f6132f, (ViewGroup) this, false);
        this.f2729i = checkBox;
        a(checkBox);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(d.f.f6133g, (ViewGroup) this, false);
        this.f2726f = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(d.f.f6134h, (ViewGroup) this, false);
        this.f2727g = radioButton;
        a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public e getItemData() {
        return this.f2725e;
    }

    public void h(boolean z3, char c3) {
        int i3 = (z3 && this.f2725e.z()) ? 0 : 8;
        if (i3 == 0) {
            this.f2730j.setText(this.f2725e.f());
        }
        if (this.f2730j.getVisibility() != i3) {
            this.f2730j.setVisibility(i3);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        O.n0(this, this.f2734n);
        TextView textView = (TextView) findViewById(d.e.f6099A);
        this.f2728h = textView;
        int i3 = this.f2735o;
        if (i3 != -1) {
            textView.setTextAppearance(this.f2736p, i3);
        }
        this.f2730j = (TextView) findViewById(d.e.f6122v);
        ImageView imageView = (ImageView) findViewById(d.e.f6125y);
        this.f2731k = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2738r);
        }
        this.f2732l = (ImageView) findViewById(d.e.f6112l);
        this.f2733m = (LinearLayout) findViewById(d.e.f6108h);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        if (this.f2726f != null && this.f2737q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2726f.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i3, i4);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f2727g == null && this.f2729i == null) {
            return;
        }
        if (this.f2725e.l()) {
            if (this.f2727g == null) {
                g();
            }
            compoundButton = this.f2727g;
            view = this.f2729i;
        } else {
            if (this.f2729i == null) {
                e();
            }
            compoundButton = this.f2729i;
            view = this.f2727g;
        }
        if (z3) {
            compoundButton.setChecked(this.f2725e.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f2729i;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f2727g;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if (this.f2725e.l()) {
            if (this.f2727g == null) {
                g();
            }
            compoundButton = this.f2727g;
        } else {
            if (this.f2729i == null) {
                e();
            }
            compoundButton = this.f2729i;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f2741u = z3;
        this.f2737q = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f2732l;
        if (imageView != null) {
            imageView.setVisibility((this.f2739s || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z3 = this.f2725e.y() || this.f2741u;
        if (z3 || this.f2737q) {
            ImageView imageView = this.f2726f;
            if (imageView == null && drawable == null && !this.f2737q) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f2737q) {
                this.f2726f.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f2726f;
            if (!z3) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f2726f.getVisibility() != 0) {
                this.f2726f.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f2728h.getVisibility() != 8) {
                this.f2728h.setVisibility(8);
            }
        } else {
            this.f2728h.setText(charSequence);
            if (this.f2728h.getVisibility() != 0) {
                this.f2728h.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet);
        C0552S t3 = C0552S.t(getContext(), attributeSet, d.i.f6313o1, i3, 0);
        this.f2734n = t3.g(d.i.f6321q1);
        this.f2735o = t3.m(d.i.f6317p1, -1);
        this.f2737q = t3.a(d.i.f6325r1, false);
        this.f2736p = context;
        this.f2738r = t3.g(d.i.f6329s1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC0435a.f6027n, 0);
        this.f2739s = obtainStyledAttributes.hasValue(0);
        t3.u();
        obtainStyledAttributes.recycle();
    }
}

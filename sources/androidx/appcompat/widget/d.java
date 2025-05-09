package androidx.appcompat.widget;

import K.O;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import d.AbstractC0435a;
import d.g;
import d.i;
import f.AbstractC0467a;
import k.C0523a;
import l.C0552S;
import l.InterfaceC0583x;

/* loaded from: classes.dex */
public class d implements InterfaceC0583x {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f3197a;

    /* renamed from: b, reason: collision with root package name */
    public int f3198b;

    /* renamed from: c, reason: collision with root package name */
    public View f3199c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f3200d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f3201e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f3202f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3203g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f3204h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f3205i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f3206j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f3207k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3208l;

    /* renamed from: m, reason: collision with root package name */
    public int f3209m;

    /* renamed from: n, reason: collision with root package name */
    public int f3210n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f3211o;

    public class a implements View.OnClickListener {

        /* renamed from: e, reason: collision with root package name */
        public final C0523a f3212e;

        public a() {
            this.f3212e = new C0523a(d.this.f3197a.getContext(), 0, R.id.home, 0, 0, d.this.f3204h);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            Window.Callback callback = dVar.f3207k;
            if (callback == null || !dVar.f3208l) {
                return;
            }
            callback.onMenuItemSelected(0, this.f3212e);
        }
    }

    public d(Toolbar toolbar, boolean z3) {
        this(toolbar, z3, g.f6140a, d.d.f6086n);
    }

    @Override // l.InterfaceC0583x
    public void a(int i3) {
        i(i3 != 0 ? AbstractC0467a.b(e(), i3) : null);
    }

    @Override // l.InterfaceC0583x
    public void b(CharSequence charSequence) {
        if (this.f3203g) {
            return;
        }
        o(charSequence);
    }

    @Override // l.InterfaceC0583x
    public void c(Window.Callback callback) {
        this.f3207k = callback;
    }

    public final int d() {
        if (this.f3197a.getNavigationIcon() == null) {
            return 11;
        }
        this.f3211o = this.f3197a.getNavigationIcon();
        return 15;
    }

    public Context e() {
        return this.f3197a.getContext();
    }

    public void f(View view) {
        View view2 = this.f3199c;
        if (view2 != null && (this.f3198b & 16) != 0) {
            this.f3197a.removeView(view2);
        }
        this.f3199c = view;
        if (view == null || (this.f3198b & 16) == 0) {
            return;
        }
        this.f3197a.addView(view);
    }

    public void g(int i3) {
        if (i3 == this.f3210n) {
            return;
        }
        this.f3210n = i3;
        if (TextUtils.isEmpty(this.f3197a.getNavigationContentDescription())) {
            j(this.f3210n);
        }
    }

    @Override // l.InterfaceC0583x
    public CharSequence getTitle() {
        return this.f3197a.getTitle();
    }

    public void h(int i3) {
        View view;
        int i4 = this.f3198b ^ i3;
        this.f3198b = i3;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    p();
                }
                q();
            }
            if ((i4 & 3) != 0) {
                r();
            }
            if ((i4 & 8) != 0) {
                if ((i3 & 8) != 0) {
                    this.f3197a.setTitle(this.f3204h);
                    this.f3197a.setSubtitle(this.f3205i);
                } else {
                    this.f3197a.setTitle((CharSequence) null);
                    this.f3197a.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.f3199c) == null) {
                return;
            }
            if ((i3 & 16) != 0) {
                this.f3197a.addView(view);
            } else {
                this.f3197a.removeView(view);
            }
        }
    }

    public void i(Drawable drawable) {
        this.f3201e = drawable;
        r();
    }

    public void j(int i3) {
        k(i3 == 0 ? null : e().getString(i3));
    }

    public void k(CharSequence charSequence) {
        this.f3206j = charSequence;
        p();
    }

    public void l(Drawable drawable) {
        this.f3202f = drawable;
        q();
    }

    public void m(CharSequence charSequence) {
        this.f3205i = charSequence;
        if ((this.f3198b & 8) != 0) {
            this.f3197a.setSubtitle(charSequence);
        }
    }

    public void n(CharSequence charSequence) {
        this.f3203g = true;
        o(charSequence);
    }

    public final void o(CharSequence charSequence) {
        this.f3204h = charSequence;
        if ((this.f3198b & 8) != 0) {
            this.f3197a.setTitle(charSequence);
            if (this.f3203g) {
                O.m0(this.f3197a.getRootView(), charSequence);
            }
        }
    }

    public final void p() {
        if ((this.f3198b & 4) != 0) {
            if (TextUtils.isEmpty(this.f3206j)) {
                this.f3197a.setNavigationContentDescription(this.f3210n);
            } else {
                this.f3197a.setNavigationContentDescription(this.f3206j);
            }
        }
    }

    public final void q() {
        if ((this.f3198b & 4) == 0) {
            this.f3197a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f3197a;
        Drawable drawable = this.f3202f;
        if (drawable == null) {
            drawable = this.f3211o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void r() {
        Drawable drawable;
        int i3 = this.f3198b;
        if ((i3 & 2) == 0) {
            drawable = null;
        } else if ((i3 & 1) != 0) {
            drawable = this.f3201e;
            if (drawable == null) {
                drawable = this.f3200d;
            }
        } else {
            drawable = this.f3200d;
        }
        this.f3197a.setLogo(drawable);
    }

    @Override // l.InterfaceC0583x
    public void setIcon(int i3) {
        setIcon(i3 != 0 ? AbstractC0467a.b(e(), i3) : null);
    }

    public d(Toolbar toolbar, boolean z3, int i3, int i4) {
        Drawable drawable;
        this.f3209m = 0;
        this.f3210n = 0;
        this.f3197a = toolbar;
        this.f3204h = toolbar.getTitle();
        this.f3205i = toolbar.getSubtitle();
        this.f3203g = this.f3204h != null;
        this.f3202f = toolbar.getNavigationIcon();
        C0552S t3 = C0552S.t(toolbar.getContext(), null, i.f6255a, AbstractC0435a.f6016c, 0);
        this.f3211o = t3.g(i.f6291j);
        if (z3) {
            CharSequence o3 = t3.o(i.f6315p);
            if (!TextUtils.isEmpty(o3)) {
                n(o3);
            }
            CharSequence o4 = t3.o(i.f6307n);
            if (!TextUtils.isEmpty(o4)) {
                m(o4);
            }
            Drawable g3 = t3.g(i.f6299l);
            if (g3 != null) {
                i(g3);
            }
            Drawable g4 = t3.g(i.f6295k);
            if (g4 != null) {
                setIcon(g4);
            }
            if (this.f3202f == null && (drawable = this.f3211o) != null) {
                l(drawable);
            }
            h(t3.j(i.f6283h, 0));
            int m3 = t3.m(i.f6279g, 0);
            if (m3 != 0) {
                f(LayoutInflater.from(this.f3197a.getContext()).inflate(m3, (ViewGroup) this.f3197a, false));
                h(this.f3198b | 16);
            }
            int l3 = t3.l(i.f6287i, 0);
            if (l3 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f3197a.getLayoutParams();
                layoutParams.height = l3;
                this.f3197a.setLayoutParams(layoutParams);
            }
            int e3 = t3.e(i.f6275f, -1);
            int e4 = t3.e(i.f6271e, -1);
            if (e3 >= 0 || e4 >= 0) {
                this.f3197a.F(Math.max(e3, 0), Math.max(e4, 0));
            }
            int m4 = t3.m(i.f6319q, 0);
            if (m4 != 0) {
                Toolbar toolbar2 = this.f3197a;
                toolbar2.H(toolbar2.getContext(), m4);
            }
            int m5 = t3.m(i.f6311o, 0);
            if (m5 != 0) {
                Toolbar toolbar3 = this.f3197a;
                toolbar3.G(toolbar3.getContext(), m5);
            }
            int m6 = t3.m(i.f6303m, 0);
            if (m6 != 0) {
                this.f3197a.setPopupTheme(m6);
            }
        } else {
            this.f3198b = d();
        }
        t3.u();
        g(i3);
        this.f3206j = this.f3197a.getNavigationContentDescription();
        this.f3197a.setNavigationOnClickListener(new a());
    }

    @Override // l.InterfaceC0583x
    public void setIcon(Drawable drawable) {
        this.f3200d = drawable;
        r();
    }
}

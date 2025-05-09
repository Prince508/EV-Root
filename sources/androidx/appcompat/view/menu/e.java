package androidx.appcompat.view.menu;

import K.AbstractC0186b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import f.AbstractC0467a;

/* loaded from: classes.dex */
public final class e implements E.b {

    /* renamed from: A, reason: collision with root package name */
    public View f2821A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2822B;

    /* renamed from: D, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f2824D;

    /* renamed from: a, reason: collision with root package name */
    public final int f2825a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2826b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2827c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2828d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2829e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2830f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2831g;

    /* renamed from: h, reason: collision with root package name */
    public char f2832h;

    /* renamed from: j, reason: collision with root package name */
    public char f2834j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2836l;

    /* renamed from: n, reason: collision with root package name */
    public d f2838n;

    /* renamed from: o, reason: collision with root package name */
    public j f2839o;

    /* renamed from: p, reason: collision with root package name */
    public Runnable f2840p;

    /* renamed from: q, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2841q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2842r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f2843s;

    /* renamed from: z, reason: collision with root package name */
    public int f2850z;

    /* renamed from: i, reason: collision with root package name */
    public int f2833i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2835k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2837m = 0;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f2844t = null;

    /* renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f2845u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2846v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2847w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2848x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f2849y = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2823C = false;

    public e(d dVar, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7) {
        this.f2838n = dVar;
        this.f2825a = i4;
        this.f2826b = i3;
        this.f2827c = i5;
        this.f2828d = i6;
        this.f2829e = charSequence;
        this.f2850z = i7;
    }

    public static void b(StringBuilder sb, int i3, int i4, String str) {
        if ((i3 & i4) == i4) {
            sb.append(str);
        }
    }

    public boolean A() {
        return (this.f2850z & 4) == 4;
    }

    public void a() {
        this.f2838n.E(this);
    }

    public final Drawable c(Drawable drawable) {
        if (drawable != null && this.f2848x && (this.f2846v || this.f2847w)) {
            drawable = D.a.l(drawable).mutate();
            if (this.f2846v) {
                D.a.i(drawable, this.f2844t);
            }
            if (this.f2847w) {
                D.a.j(drawable, this.f2845u);
            }
            this.f2848x = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f2850z & 8) == 0) {
            return false;
        }
        if (this.f2821A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2822B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2838n.e(this);
        }
        return false;
    }

    public int d() {
        return this.f2828d;
    }

    public char e() {
        return this.f2838n.C() ? this.f2834j : this.f2832h;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        if (!i()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2822B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2838n.j(this);
        }
        return false;
    }

    public String f() {
        char e3 = e();
        if (e3 == 0) {
            return "";
        }
        Resources resources = this.f2838n.s().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f2838n.s()).hasPermanentMenuKey()) {
            sb.append(resources.getString(d.g.f6152m));
        }
        int i3 = this.f2838n.C() ? this.f2835k : this.f2833i;
        b(sb, i3, 65536, resources.getString(d.g.f6148i));
        b(sb, i3, 4096, resources.getString(d.g.f6144e));
        b(sb, i3, 2, resources.getString(d.g.f6143d));
        b(sb, i3, 1, resources.getString(d.g.f6149j));
        b(sb, i3, 4, resources.getString(d.g.f6151l));
        b(sb, i3, 8, resources.getString(d.g.f6147h));
        if (e3 == '\b') {
            sb.append(resources.getString(d.g.f6145f));
        } else if (e3 == '\n') {
            sb.append(resources.getString(d.g.f6146g));
        } else if (e3 != ' ') {
            sb.append(e3);
        } else {
            sb.append(resources.getString(d.g.f6150k));
        }
        return sb.toString();
    }

    public AbstractC0186b g() {
        return null;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View view = this.f2821A;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f2835k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f2834j;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f2842r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f2826b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f2836l;
        if (drawable != null) {
            return c(drawable);
        }
        if (this.f2837m == 0) {
            return null;
        }
        Drawable b3 = AbstractC0467a.b(this.f2838n.s(), this.f2837m);
        this.f2837m = 0;
        this.f2836l = b3;
        return c(b3);
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f2844t;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f2845u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f2831g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f2825a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2824D;
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f2833i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f2832h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f2827c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f2839o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f2829e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2830f;
        return charSequence != null ? charSequence : this.f2829e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f2843s;
    }

    public CharSequence h(h.a aVar) {
        return (aVar == null || !aVar.c()) ? getTitle() : getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f2839o != null;
    }

    public boolean i() {
        return ((this.f2850z & 8) == 0 || this.f2821A == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f2823C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f2849y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f2849y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f2849y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f2849y & 8) == 0;
    }

    public boolean j() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f2841q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        d dVar = this.f2838n;
        if (dVar.g(dVar, this)) {
            return true;
        }
        Runnable runnable = this.f2840p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f2831g == null) {
            return false;
        }
        try {
            this.f2838n.s().startActivity(this.f2831g);
            return true;
        } catch (ActivityNotFoundException e3) {
            Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e3);
            return false;
        }
    }

    public boolean k() {
        return (this.f2849y & 32) == 32;
    }

    public boolean l() {
        return (this.f2849y & 4) != 0;
    }

    public boolean m() {
        return (this.f2850z & 1) == 1;
    }

    public boolean n() {
        return (this.f2850z & 2) == 2;
    }

    @Override // android.view.MenuItem
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public E.b setActionView(int i3) {
        Context s3 = this.f2838n.s();
        setActionView(LayoutInflater.from(s3).inflate(i3, (ViewGroup) new LinearLayout(s3), false));
        return this;
    }

    @Override // android.view.MenuItem
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public E.b setActionView(View view) {
        int i3;
        this.f2821A = view;
        if (view != null && view.getId() == -1 && (i3 = this.f2825a) > 0) {
            view.setId(i3);
        }
        this.f2838n.E(this);
        return this;
    }

    public void q(boolean z3) {
        this.f2823C = z3;
        this.f2838n.G(false);
    }

    public void r(boolean z3) {
        int i3 = this.f2849y;
        int i4 = (z3 ? 2 : 0) | (i3 & (-3));
        this.f2849y = i4;
        if (i3 != i4) {
            this.f2838n.G(false);
        }
    }

    public void s(boolean z3) {
        this.f2849y = (z3 ? 4 : 0) | (this.f2849y & (-5));
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3) {
        if (this.f2834j == c3) {
            return this;
        }
        this.f2834j = Character.toLowerCase(c3);
        this.f2838n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        int i3 = this.f2849y;
        int i4 = (z3 ? 1 : 0) | (i3 & (-2));
        this.f2849y = i4;
        if (i3 != i4) {
            this.f2838n.G(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        if ((this.f2849y & 4) != 0) {
            this.f2838n.M(this);
            return this;
        }
        r(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f2849y |= 16;
        } else {
            this.f2849y &= -17;
        }
        this.f2838n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2837m = 0;
        this.f2836l = drawable;
        this.f2848x = true;
        this.f2838n.G(false);
        return this;
    }

    @Override // E.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2844t = colorStateList;
        this.f2846v = true;
        this.f2848x = true;
        this.f2838n.G(false);
        return this;
    }

    @Override // E.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2845u = mode;
        this.f2847w = true;
        this.f2848x = true;
        this.f2838n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f2831g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c3) {
        if (this.f2832h == c3) {
            return this;
        }
        this.f2832h = c3;
        this.f2838n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2822B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2841q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4) {
        this.f2832h = c3;
        this.f2834j = Character.toLowerCase(c4);
        this.f2838n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i3) {
        int i4 = i3 & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2850z = i3;
        this.f2838n.E(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2829e = charSequence;
        this.f2838n.G(false);
        j jVar = this.f2839o;
        if (jVar != null) {
            jVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2830f = charSequence;
        this.f2838n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        if (x(z3)) {
            this.f2838n.F(this);
        }
        return this;
    }

    public void t(boolean z3) {
        if (z3) {
            this.f2849y |= 32;
        } else {
            this.f2849y &= -33;
        }
    }

    public String toString() {
        CharSequence charSequence = this.f2829e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f2824D = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public E.b setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    public void w(j jVar) {
        this.f2839o = jVar;
        jVar.setHeaderTitle(getTitle());
    }

    public boolean x(boolean z3) {
        int i3 = this.f2849y;
        int i4 = (z3 ? 0 : 8) | (i3 & (-9));
        this.f2849y = i4;
        return i3 != i4;
    }

    public boolean y() {
        return this.f2838n.w();
    }

    public boolean z() {
        return this.f2838n.D() && e() != 0;
    }

    @Override // android.view.MenuItem
    public E.b setContentDescription(CharSequence charSequence) {
        this.f2842r = charSequence;
        this.f2838n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public E.b setTooltipText(CharSequence charSequence) {
        this.f2843s = charSequence;
        this.f2838n.G(false);
        return this;
    }

    @Override // E.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3, int i3) {
        if (this.f2834j == c3 && this.f2835k == i3) {
            return this;
        }
        this.f2834j = Character.toLowerCase(c3);
        this.f2835k = KeyEvent.normalizeMetaState(i3);
        this.f2838n.G(false);
        return this;
    }

    @Override // E.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c3, int i3) {
        if (this.f2832h == c3 && this.f2833i == i3) {
            return this;
        }
        this.f2832h = c3;
        this.f2833i = KeyEvent.normalizeMetaState(i3);
        this.f2838n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4, int i3, int i4) {
        this.f2832h = c3;
        this.f2833i = KeyEvent.normalizeMetaState(i3);
        this.f2834j = Character.toLowerCase(c4);
        this.f2835k = KeyEvent.normalizeMetaState(i4);
        this.f2838n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i3) {
        this.f2836l = null;
        this.f2837m = i3;
        this.f2848x = true;
        this.f2838n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i3) {
        return setTitle(this.f2838n.s().getString(i3));
    }
}

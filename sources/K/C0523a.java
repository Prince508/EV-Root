package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: k.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0523a implements E.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f7985a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7986b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7987c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f7988d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f7989e;

    /* renamed from: f, reason: collision with root package name */
    public Intent f7990f;

    /* renamed from: g, reason: collision with root package name */
    public char f7991g;

    /* renamed from: i, reason: collision with root package name */
    public char f7993i;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f7995k;

    /* renamed from: l, reason: collision with root package name */
    public Context f7996l;

    /* renamed from: m, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f7997m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f7998n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f7999o;

    /* renamed from: h, reason: collision with root package name */
    public int f7992h = 4096;

    /* renamed from: j, reason: collision with root package name */
    public int f7994j = 4096;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f8000p = null;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f8001q = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8002r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8003s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f8004t = 16;

    public C0523a(Context context, int i3, int i4, int i5, int i6, CharSequence charSequence) {
        this.f7996l = context;
        this.f7985a = i4;
        this.f7986b = i3;
        this.f7987c = i6;
        this.f7988d = charSequence;
    }

    public final void a() {
        Drawable drawable = this.f7995k;
        if (drawable != null) {
            if (this.f8002r || this.f8003s) {
                Drawable l3 = D.a.l(drawable);
                this.f7995k = l3;
                Drawable mutate = l3.mutate();
                this.f7995k = mutate;
                if (this.f8002r) {
                    D.a.i(mutate, this.f8000p);
                }
                if (this.f8003s) {
                    D.a.j(this.f7995k, this.f8001q);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public E.b setActionView(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public E.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public E.b setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f7994j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f7993i;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f7998n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f7986b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f7995k;
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f8000p;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f8001q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f7990f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f7985a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f7992h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f7991g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f7987c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f7988d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f7989e;
        return charSequence != null ? charSequence : this.f7988d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f7999o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f8004t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f8004t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f8004t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f8004t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3) {
        this.f7993i = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        this.f8004t = (z3 ? 1 : 0) | (this.f8004t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        this.f8004t = (z3 ? 2 : 0) | (this.f8004t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        this.f8004t = (z3 ? 16 : 0) | (this.f8004t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f7995k = drawable;
        a();
        return this;
    }

    @Override // E.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8000p = colorStateList;
        this.f8002r = true;
        a();
        return this;
    }

    @Override // E.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8001q = mode;
        this.f8003s = true;
        a();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f7990f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c3) {
        this.f7991g = c3;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7997m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4) {
        this.f7991g = c3;
        this.f7993i = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f7988d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7989e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        this.f8004t = (this.f8004t & 8) | (z3 ? 0 : 8);
        return this;
    }

    @Override // E.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c3, int i3) {
        this.f7993i = Character.toLowerCase(c3);
        this.f7994j = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public E.b setContentDescription(CharSequence charSequence) {
        this.f7998n = charSequence;
        return this;
    }

    @Override // E.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c3, int i3) {
        this.f7991g = c3;
        this.f7992h = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i3) {
        this.f7988d = this.f7996l.getResources().getString(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public E.b setTooltipText(CharSequence charSequence) {
        this.f7999o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i3) {
        this.f7995k = A.a.d(this.f7996l, i3);
        a();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c3, char c4, int i3, int i4) {
        this.f7991g = c3;
        this.f7992h = KeyEvent.normalizeMetaState(i3);
        this.f7993i = Character.toLowerCase(c4);
        this.f7994j = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i3) {
    }
}

package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.d;

/* loaded from: classes.dex */
public class j extends d implements SubMenu {

    /* renamed from: B, reason: collision with root package name */
    public d f2887B;

    /* renamed from: C, reason: collision with root package name */
    public e f2888C;

    public j(Context context, d dVar, e eVar) {
        super(context);
        this.f2887B = dVar;
        this.f2888C = eVar;
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean B() {
        return this.f2887B.B();
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean C() {
        return this.f2887B.C();
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean D() {
        return this.f2887B.D();
    }

    @Override // androidx.appcompat.view.menu.d
    public void L(d.a aVar) {
        this.f2887B.L(aVar);
    }

    public Menu W() {
        return this.f2887B;
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean e(e eVar) {
        return this.f2887B.e(eVar);
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean g(d dVar, MenuItem menuItem) {
        return super.g(dVar, menuItem) || this.f2887B.g(dVar, menuItem);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f2888C;
    }

    @Override // androidx.appcompat.view.menu.d
    public boolean j(e eVar) {
        return this.f2887B.j(eVar);
    }

    @Override // androidx.appcompat.view.menu.d, android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f2887B.setGroupDividerEnabled(z3);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.O(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.R(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.S(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f2888C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.d, android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f2887B.setQwertyMode(z3);
    }

    @Override // androidx.appcompat.view.menu.d
    public d z() {
        return this.f2887B.z();
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i3) {
        return (SubMenu) super.N(i3);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i3) {
        return (SubMenu) super.Q(i3);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i3) {
        this.f2888C.setIcon(i3);
        return this;
    }
}

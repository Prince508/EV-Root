package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class d implements E.a {

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f2794A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f2795a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f2796b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2797c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2798d;

    /* renamed from: e, reason: collision with root package name */
    public a f2799e;

    /* renamed from: m, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f2807m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f2808n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f2809o;

    /* renamed from: p, reason: collision with root package name */
    public View f2810p;

    /* renamed from: x, reason: collision with root package name */
    public e f2818x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2820z;

    /* renamed from: l, reason: collision with root package name */
    public int f2806l = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2811q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2812r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2813s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2814t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2815u = false;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f2816v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public CopyOnWriteArrayList f2817w = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    public boolean f2819y = false;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f2800f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2801g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f2802h = true;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f2803i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f2804j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f2805k = true;

    public interface a {
        boolean a(d dVar, MenuItem menuItem);

        void b(d dVar);
    }

    public interface b {
        boolean a(e eVar);
    }

    public d(Context context) {
        this.f2795a = context;
        this.f2796b = context.getResources();
        T(true);
    }

    public static int m(ArrayList arrayList, int i3) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((e) arrayList.get(size)).d() <= i3) {
                return size + 1;
            }
        }
        return 0;
    }

    public static int x(int i3) {
        int i4 = ((-65536) & i3) >> 16;
        if (i4 >= 0) {
            int[] iArr = f2794A;
            if (i4 < iArr.length) {
                return (i3 & 65535) | (iArr[i4] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public ArrayList A() {
        if (!this.f2802h) {
            return this.f2801g;
        }
        this.f2801g.clear();
        int size = this.f2800f.size();
        for (int i3 = 0; i3 < size; i3++) {
            e eVar = (e) this.f2800f.get(i3);
            if (eVar.isVisible()) {
                this.f2801g.add(eVar);
            }
        }
        this.f2802h = false;
        this.f2805k = true;
        return this.f2801g;
    }

    public boolean B() {
        return this.f2819y;
    }

    public boolean C() {
        return this.f2797c;
    }

    public boolean D() {
        return this.f2798d;
    }

    public void E(e eVar) {
        this.f2805k = true;
        G(true);
    }

    public void F(e eVar) {
        this.f2802h = true;
        G(true);
    }

    public void G(boolean z3) {
        if (this.f2811q) {
            this.f2812r = true;
            if (z3) {
                this.f2813s = true;
                return;
            }
            return;
        }
        if (z3) {
            this.f2802h = true;
            this.f2805k = true;
        }
        h(z3);
    }

    public boolean H(MenuItem menuItem, int i3) {
        return I(menuItem, null, i3);
    }

    public boolean I(MenuItem menuItem, g gVar, int i3) {
        e eVar = (e) menuItem;
        if (eVar == null || !eVar.isEnabled()) {
            return false;
        }
        boolean j3 = eVar.j();
        eVar.g();
        if (eVar.i()) {
            boolean expandActionView = eVar.expandActionView() | j3;
            if (expandActionView) {
                d(true);
            }
            return expandActionView;
        }
        if (!eVar.hasSubMenu()) {
            if ((i3 & 1) == 0) {
                d(true);
            }
            return j3;
        }
        if ((i3 & 4) == 0) {
            d(false);
        }
        if (!eVar.hasSubMenu()) {
            eVar.w(new j(s(), this, eVar));
        }
        boolean i4 = i((j) eVar.getSubMenu(), gVar) | j3;
        if (!i4) {
            d(true);
        }
        return i4;
    }

    public final void J(int i3, boolean z3) {
        if (i3 < 0 || i3 >= this.f2800f.size()) {
            return;
        }
        this.f2800f.remove(i3);
        if (z3) {
            G(true);
        }
    }

    public void K(g gVar) {
        Iterator it = this.f2817w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar2 = (g) weakReference.get();
            if (gVar2 == null || gVar2 == gVar) {
                this.f2817w.remove(weakReference);
            }
        }
    }

    public void L(a aVar) {
        this.f2799e = aVar;
    }

    public void M(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f2800f.size();
        V();
        for (int i3 = 0; i3 < size; i3++) {
            e eVar = (e) this.f2800f.get(i3);
            if (eVar.getGroupId() == groupId && eVar.l() && eVar.isCheckable()) {
                eVar.r(eVar == menuItem);
            }
        }
        U();
    }

    public d N(int i3) {
        P(0, null, i3, null, null);
        return this;
    }

    public d O(Drawable drawable) {
        P(0, null, 0, drawable, null);
        return this;
    }

    public final void P(int i3, CharSequence charSequence, int i4, Drawable drawable, View view) {
        Resources y3 = y();
        if (view != null) {
            this.f2810p = view;
            this.f2808n = null;
            this.f2809o = null;
        } else {
            if (i3 > 0) {
                this.f2808n = y3.getText(i3);
            } else if (charSequence != null) {
                this.f2808n = charSequence;
            }
            if (i4 > 0) {
                this.f2809o = A.a.d(s(), i4);
            } else if (drawable != null) {
                this.f2809o = drawable;
            }
            this.f2810p = null;
        }
        G(false);
    }

    public d Q(int i3) {
        P(i3, null, 0, null, null);
        return this;
    }

    public d R(CharSequence charSequence) {
        P(0, charSequence, 0, null, null);
        return this;
    }

    public d S(View view) {
        P(0, null, 0, null, view);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (K.T.l(android.view.ViewConfiguration.get(r2.f2795a), r2.f2795a) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f2796b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f2795a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f2795a
            boolean r3 = K.T.l(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f2798d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.d.T(boolean):void");
    }

    public void U() {
        this.f2811q = false;
        if (this.f2812r) {
            this.f2812r = false;
            G(this.f2813s);
        }
    }

    public void V() {
        if (this.f2811q) {
            return;
        }
        this.f2811q = true;
        this.f2812r = false;
        this.f2813s = false;
    }

    public MenuItem a(int i3, int i4, int i5, CharSequence charSequence) {
        int x3 = x(i5);
        e f3 = f(i3, i4, i5, x3, charSequence, this.f2806l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f2807m;
        if (contextMenuInfo != null) {
            f3.u(contextMenuInfo);
        }
        ArrayList arrayList = this.f2800f;
        arrayList.add(m(arrayList, x3), f3);
        G(true);
        return f3;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i3, int i4, int i5, ComponentName componentName, Intent[] intentArr, Intent intent, int i6, MenuItem[] menuItemArr) {
        int i7;
        PackageManager packageManager = this.f2795a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i6 & 1) == 0) {
            removeGroup(i3);
        }
        for (int i8 = 0; i8 < size; i8++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i8);
            int i9 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i9 < 0 ? intent : intentArr[i9]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i3, i4, i5, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i7 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i7] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(g gVar, Context context) {
        this.f2817w.add(new WeakReference(gVar));
        gVar.d(context, this);
        this.f2805k = true;
    }

    public void c() {
        a aVar = this.f2799e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        e eVar = this.f2818x;
        if (eVar != null) {
            e(eVar);
        }
        this.f2800f.clear();
        G(true);
    }

    public void clearHeader() {
        this.f2809o = null;
        this.f2808n = null;
        this.f2810p = null;
        G(false);
    }

    @Override // android.view.Menu
    public void close() {
        d(true);
    }

    public final void d(boolean z3) {
        if (this.f2815u) {
            return;
        }
        this.f2815u = true;
        Iterator it = this.f2817w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar = (g) weakReference.get();
            if (gVar == null) {
                this.f2817w.remove(weakReference);
            } else {
                gVar.b(this, z3);
            }
        }
        this.f2815u = false;
    }

    public boolean e(e eVar) {
        boolean z3 = false;
        if (!this.f2817w.isEmpty() && this.f2818x == eVar) {
            V();
            Iterator it = this.f2817w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                g gVar = (g) weakReference.get();
                if (gVar == null) {
                    this.f2817w.remove(weakReference);
                } else {
                    z3 = gVar.e(this, eVar);
                    if (z3) {
                        break;
                    }
                }
            }
            U();
            if (z3) {
                this.f2818x = null;
            }
        }
        return z3;
    }

    public final e f(int i3, int i4, int i5, int i6, CharSequence charSequence, int i7) {
        return new e(this, i3, i4, i5, i6, charSequence, i7);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i3) {
        MenuItem findItem;
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = (e) this.f2800f.get(i4);
            if (eVar.getItemId() == i3) {
                return eVar;
            }
            if (eVar.hasSubMenu() && (findItem = eVar.getSubMenu().findItem(i3)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g(d dVar, MenuItem menuItem) {
        a aVar = this.f2799e;
        return aVar != null && aVar.a(dVar, menuItem);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i3) {
        return (MenuItem) this.f2800f.get(i3);
    }

    public final void h(boolean z3) {
        if (this.f2817w.isEmpty()) {
            return;
        }
        V();
        Iterator it = this.f2817w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar = (g) weakReference.get();
            if (gVar == null) {
                this.f2817w.remove(weakReference);
            } else {
                gVar.k(z3);
            }
        }
        U();
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f2820z) {
            return true;
        }
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((e) this.f2800f.get(i3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(j jVar, g gVar) {
        if (this.f2817w.isEmpty()) {
            return false;
        }
        boolean j3 = gVar != null ? gVar.j(jVar) : false;
        Iterator it = this.f2817w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar2 = (g) weakReference.get();
            if (gVar2 == null) {
                this.f2817w.remove(weakReference);
            } else if (!j3) {
                j3 = gVar2.j(jVar);
            }
        }
        return j3;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i3, KeyEvent keyEvent) {
        return o(i3, keyEvent) != null;
    }

    public boolean j(e eVar) {
        boolean z3 = false;
        if (this.f2817w.isEmpty()) {
            return false;
        }
        V();
        Iterator it = this.f2817w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            g gVar = (g) weakReference.get();
            if (gVar == null) {
                this.f2817w.remove(weakReference);
            } else {
                z3 = gVar.h(this, eVar);
                if (z3) {
                    break;
                }
            }
        }
        U();
        if (z3) {
            this.f2818x = eVar;
        }
        return z3;
    }

    public int k(int i3) {
        return l(i3, 0);
    }

    public int l(int i3, int i4) {
        int size = size();
        if (i4 < 0) {
            i4 = 0;
        }
        while (i4 < size) {
            if (((e) this.f2800f.get(i4)).getGroupId() == i3) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public int n(int i3) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((e) this.f2800f.get(i4)).getItemId() == i3) {
                return i4;
            }
        }
        return -1;
    }

    public e o(int i3, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2816v;
        arrayList.clear();
        p(arrayList, i3, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (e) arrayList.get(0);
        }
        boolean C3 = C();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = (e) arrayList.get(i4);
            char alphabeticShortcut = C3 ? eVar.getAlphabeticShortcut() : eVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (C3 && alphabeticShortcut == '\b' && i3 == 67))) {
                return eVar;
            }
        }
        return null;
    }

    public void p(List list, int i3, KeyEvent keyEvent) {
        boolean C3 = C();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i3 == 67) {
            int size = this.f2800f.size();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar = (e) this.f2800f.get(i4);
                if (eVar.hasSubMenu()) {
                    ((d) eVar.getSubMenu()).p(list, i3, keyEvent);
                }
                char alphabeticShortcut = C3 ? eVar.getAlphabeticShortcut() : eVar.getNumericShortcut();
                if ((modifiers & 69647) == ((C3 ? eVar.getAlphabeticModifiers() : eVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (C3 && alphabeticShortcut == '\b' && i3 == 67)) && eVar.isEnabled()) {
                        list.add(eVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i3, int i4) {
        return H(findItem(i3), i4);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i3, KeyEvent keyEvent, int i4) {
        e o3 = o(i3, keyEvent);
        boolean H3 = o3 != null ? H(o3, i4) : false;
        if ((i4 & 2) != 0) {
            d(true);
        }
        return H3;
    }

    public void q() {
        ArrayList A3 = A();
        if (this.f2805k) {
            Iterator it = this.f2817w.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                g gVar = (g) weakReference.get();
                if (gVar == null) {
                    this.f2817w.remove(weakReference);
                } else {
                    z3 |= gVar.c();
                }
            }
            if (z3) {
                this.f2803i.clear();
                this.f2804j.clear();
                int size = A3.size();
                for (int i3 = 0; i3 < size; i3++) {
                    e eVar = (e) A3.get(i3);
                    if (eVar.k()) {
                        this.f2803i.add(eVar);
                    } else {
                        this.f2804j.add(eVar);
                    }
                }
            } else {
                this.f2803i.clear();
                this.f2804j.clear();
                this.f2804j.addAll(A());
            }
            this.f2805k = false;
        }
    }

    public ArrayList r() {
        q();
        return this.f2803i;
    }

    @Override // android.view.Menu
    public void removeGroup(int i3) {
        int k3 = k(i3);
        if (k3 >= 0) {
            int size = this.f2800f.size() - k3;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size || ((e) this.f2800f.get(k3)).getGroupId() != i3) {
                    break;
                }
                J(k3, false);
                i4 = i5;
            }
            G(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i3) {
        J(n(i3), true);
    }

    public Context s() {
        return this.f2795a;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i3, boolean z3, boolean z4) {
        int size = this.f2800f.size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = (e) this.f2800f.get(i4);
            if (eVar.getGroupId() == i3) {
                eVar.s(z4);
                eVar.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f2819y = z3;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i3, boolean z3) {
        int size = this.f2800f.size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = (e) this.f2800f.get(i4);
            if (eVar.getGroupId() == i3) {
                eVar.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i3, boolean z3) {
        int size = this.f2800f.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = (e) this.f2800f.get(i4);
            if (eVar.getGroupId() == i3 && eVar.x(z3)) {
                z4 = true;
            }
        }
        if (z4) {
            G(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f2797c = z3;
        G(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f2800f.size();
    }

    public e t() {
        return this.f2818x;
    }

    public CharSequence u() {
        return this.f2808n;
    }

    public ArrayList v() {
        q();
        return this.f2804j;
    }

    public boolean w() {
        return this.f2814t;
    }

    public Resources y() {
        return this.f2796b;
    }

    public d z() {
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i3) {
        return a(0, 0, 0, this.f2796b.getString(i3));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i3) {
        return addSubMenu(0, 0, 0, this.f2796b.getString(i3));
    }

    @Override // android.view.Menu
    public MenuItem add(int i3, int i4, int i5, CharSequence charSequence) {
        return a(i3, i4, i5, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i3, int i4, int i5, CharSequence charSequence) {
        e eVar = (e) a(i3, i4, i5, charSequence);
        j jVar = new j(this.f2795a, this, eVar);
        eVar.w(jVar);
        return jVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i3, int i4, int i5, int i6) {
        return a(i3, i4, i5, this.f2796b.getString(i6));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i3, int i4, int i5, int i6) {
        return addSubMenu(i3, i4, i5, this.f2796b.getString(i6));
    }
}

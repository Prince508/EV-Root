package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: e, reason: collision with root package name */
    public Context f2742e;

    /* renamed from: f, reason: collision with root package name */
    public Context f2743f;

    /* renamed from: g, reason: collision with root package name */
    public d f2744g;

    /* renamed from: h, reason: collision with root package name */
    public LayoutInflater f2745h;

    /* renamed from: i, reason: collision with root package name */
    public LayoutInflater f2746i;

    /* renamed from: j, reason: collision with root package name */
    public g.a f2747j;

    /* renamed from: k, reason: collision with root package name */
    public int f2748k;

    /* renamed from: l, reason: collision with root package name */
    public int f2749l;

    /* renamed from: m, reason: collision with root package name */
    public h f2750m;

    public a(Context context, int i3, int i4) {
        this.f2742e = context;
        this.f2745h = LayoutInflater.from(context);
        this.f2748k = i3;
        this.f2749l = i4;
    }

    public void a(View view, int i3) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f2750m).addView(view, i3);
    }

    @Override // androidx.appcompat.view.menu.g
    public void b(d dVar, boolean z3) {
        g.a aVar = this.f2747j;
        if (aVar != null) {
            aVar.b(dVar, z3);
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public void d(Context context, d dVar) {
        this.f2743f = context;
        this.f2746i = LayoutInflater.from(context);
        this.f2744g = dVar;
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean e(d dVar, e eVar) {
        return false;
    }

    public abstract void f(e eVar, h.a aVar);

    public h.a g(ViewGroup viewGroup) {
        return (h.a) this.f2745h.inflate(this.f2749l, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean h(d dVar, e eVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.g
    public void i(g.a aVar) {
        this.f2747j = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.d] */
    @Override // androidx.appcompat.view.menu.g
    public boolean j(j jVar) {
        g.a aVar = this.f2747j;
        j jVar2 = jVar;
        if (aVar == null) {
            return false;
        }
        if (jVar == null) {
            jVar2 = this.f2744g;
        }
        return aVar.c(jVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.g
    public void k(boolean z3) {
        ViewGroup viewGroup = (ViewGroup) this.f2750m;
        if (viewGroup == null) {
            return;
        }
        d dVar = this.f2744g;
        int i3 = 0;
        if (dVar != null) {
            dVar.q();
            ArrayList A3 = this.f2744g.A();
            int size = A3.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                e eVar = (e) A3.get(i5);
                if (o(i4, eVar)) {
                    View childAt = viewGroup.getChildAt(i4);
                    e itemData = childAt instanceof h.a ? ((h.a) childAt).getItemData() : null;
                    View n3 = n(eVar, childAt, viewGroup);
                    if (eVar != itemData) {
                        n3.setPressed(false);
                        n3.jumpDrawablesToCurrentState();
                    }
                    if (n3 != childAt) {
                        a(n3, i4);
                    }
                    i4++;
                }
            }
            i3 = i4;
        }
        while (i3 < viewGroup.getChildCount()) {
            if (!l(viewGroup, i3)) {
                i3++;
            }
        }
    }

    public boolean l(ViewGroup viewGroup, int i3) {
        viewGroup.removeViewAt(i3);
        return true;
    }

    public g.a m() {
        return this.f2747j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View n(e eVar, View view, ViewGroup viewGroup) {
        h.a g3 = view instanceof h.a ? (h.a) view : g(viewGroup);
        f(eVar, g3);
        return (View) g3;
    }

    public abstract boolean o(int i3, e eVar);
}

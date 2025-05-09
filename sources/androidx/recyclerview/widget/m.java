package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class m extends RecyclerView.l {

    /* renamed from: g, reason: collision with root package name */
    public boolean f4617g = true;

    public final void A(RecyclerView.C c3) {
        I(c3);
        h(c3);
    }

    public final void B(RecyclerView.C c3) {
        J(c3);
    }

    public final void C(RecyclerView.C c3, boolean z3) {
        K(c3, z3);
        h(c3);
    }

    public final void D(RecyclerView.C c3, boolean z3) {
        L(c3, z3);
    }

    public final void E(RecyclerView.C c3) {
        M(c3);
        h(c3);
    }

    public final void F(RecyclerView.C c3) {
        N(c3);
    }

    public final void G(RecyclerView.C c3) {
        O(c3);
        h(c3);
    }

    public final void H(RecyclerView.C c3) {
        P(c3);
    }

    public void I(RecyclerView.C c3) {
    }

    public void J(RecyclerView.C c3) {
    }

    public void K(RecyclerView.C c3, boolean z3) {
    }

    public void L(RecyclerView.C c3, boolean z3) {
    }

    public void M(RecyclerView.C c3) {
    }

    public void N(RecyclerView.C c3) {
    }

    public void O(RecyclerView.C c3) {
    }

    public void P(RecyclerView.C c3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean a(RecyclerView.C c3, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i3;
        int i4;
        return (bVar == null || ((i3 = bVar.f4333a) == (i4 = bVar2.f4333a) && bVar.f4334b == bVar2.f4334b)) ? w(c3) : y(c3, i3, bVar.f4334b, i4, bVar2.f4334b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean b(RecyclerView.C c3, RecyclerView.C c4, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i3;
        int i4;
        int i5 = bVar.f4333a;
        int i6 = bVar.f4334b;
        if (c4.J()) {
            int i7 = bVar.f4333a;
            i4 = bVar.f4334b;
            i3 = i7;
        } else {
            i3 = bVar2.f4333a;
            i4 = bVar2.f4334b;
        }
        return x(c3, c4, i5, i6, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean c(RecyclerView.C c3, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i3 = bVar.f4333a;
        int i4 = bVar.f4334b;
        View view = c3.f4302a;
        int left = bVar2 == null ? view.getLeft() : bVar2.f4333a;
        int top = bVar2 == null ? view.getTop() : bVar2.f4334b;
        if (c3.v() || (i3 == left && i4 == top)) {
            return z(c3);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(c3, i3, i4, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean d(RecyclerView.C c3, RecyclerView.l.b bVar, RecyclerView.l.b bVar2) {
        int i3 = bVar.f4333a;
        int i4 = bVar2.f4333a;
        if (i3 != i4 || bVar.f4334b != bVar2.f4334b) {
            return y(c3, i3, bVar.f4334b, i4, bVar2.f4334b);
        }
        E(c3);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean f(RecyclerView.C c3) {
        return !this.f4617g || c3.t();
    }

    public abstract boolean w(RecyclerView.C c3);

    public abstract boolean x(RecyclerView.C c3, RecyclerView.C c4, int i3, int i4, int i5, int i6);

    public abstract boolean y(RecyclerView.C c3, int i3, int i4, int i5, int i6);

    public abstract boolean z(RecyclerView.C c3);
}

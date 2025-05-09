package androidx.recyclerview.widget;

import K.C0184a;
import K.O;
import L.x;
import L.y;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class k extends C0184a {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f4613d;

    /* renamed from: e, reason: collision with root package name */
    public final a f4614e;

    public static class a extends C0184a {

        /* renamed from: d, reason: collision with root package name */
        public final k f4615d;

        /* renamed from: e, reason: collision with root package name */
        public Map f4616e = new WeakHashMap();

        public a(k kVar) {
            this.f4615d = kVar;
        }

        @Override // K.C0184a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C0184a c0184a = (C0184a) this.f4616e.get(view);
            return c0184a != null ? c0184a.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // K.C0184a
        public y b(View view) {
            C0184a c0184a = (C0184a) this.f4616e.get(view);
            return c0184a != null ? c0184a.b(view) : super.b(view);
        }

        @Override // K.C0184a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C0184a c0184a = (C0184a) this.f4616e.get(view);
            if (c0184a != null) {
                c0184a.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // K.C0184a
        public void g(View view, x xVar) {
            if (this.f4615d.o() || this.f4615d.f4613d.getLayoutManager() == null) {
                super.g(view, xVar);
                return;
            }
            this.f4615d.f4613d.getLayoutManager().S0(view, xVar);
            C0184a c0184a = (C0184a) this.f4616e.get(view);
            if (c0184a != null) {
                c0184a.g(view, xVar);
            } else {
                super.g(view, xVar);
            }
        }

        @Override // K.C0184a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C0184a c0184a = (C0184a) this.f4616e.get(view);
            if (c0184a != null) {
                c0184a.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // K.C0184a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0184a c0184a = (C0184a) this.f4616e.get(viewGroup);
            return c0184a != null ? c0184a.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // K.C0184a
        public boolean j(View view, int i3, Bundle bundle) {
            if (this.f4615d.o() || this.f4615d.f4613d.getLayoutManager() == null) {
                return super.j(view, i3, bundle);
            }
            C0184a c0184a = (C0184a) this.f4616e.get(view);
            if (c0184a != null) {
                if (c0184a.j(view, i3, bundle)) {
                    return true;
                }
            } else if (super.j(view, i3, bundle)) {
                return true;
            }
            return this.f4615d.f4613d.getLayoutManager().m1(view, i3, bundle);
        }

        @Override // K.C0184a
        public void l(View view, int i3) {
            C0184a c0184a = (C0184a) this.f4616e.get(view);
            if (c0184a != null) {
                c0184a.l(view, i3);
            } else {
                super.l(view, i3);
            }
        }

        @Override // K.C0184a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C0184a c0184a = (C0184a) this.f4616e.get(view);
            if (c0184a != null) {
                c0184a.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public C0184a n(View view) {
            return (C0184a) this.f4616e.remove(view);
        }

        public void o(View view) {
            C0184a i3 = O.i(view);
            if (i3 == null || i3 == this) {
                return;
            }
            this.f4616e.put(view, i3);
        }
    }

    public k(RecyclerView recyclerView) {
        this.f4613d = recyclerView;
        C0184a n3 = n();
        if (n3 == null || !(n3 instanceof a)) {
            this.f4614e = new a(this);
        } else {
            this.f4614e = (a) n3;
        }
    }

    @Override // K.C0184a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().O0(accessibilityEvent);
        }
    }

    @Override // K.C0184a
    public void g(View view, x xVar) {
        super.g(view, xVar);
        if (o() || this.f4613d.getLayoutManager() == null) {
            return;
        }
        this.f4613d.getLayoutManager().Q0(xVar);
    }

    @Override // K.C0184a
    public boolean j(View view, int i3, Bundle bundle) {
        if (super.j(view, i3, bundle)) {
            return true;
        }
        if (o() || this.f4613d.getLayoutManager() == null) {
            return false;
        }
        return this.f4613d.getLayoutManager().k1(i3, bundle);
    }

    public C0184a n() {
        return this.f4614e;
    }

    public boolean o() {
        return this.f4613d.k0();
    }
}

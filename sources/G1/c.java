package g1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class c extends CoordinatorLayout.b {

    /* renamed from: a, reason: collision with root package name */
    public d f7226a;

    /* renamed from: b, reason: collision with root package name */
    public int f7227b;

    /* renamed from: c, reason: collision with root package name */
    public int f7228c;

    public c() {
        this.f7227b = 0;
        this.f7228c = 0;
    }

    public int E() {
        d dVar = this.f7226a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    public void F(CoordinatorLayout coordinatorLayout, View view, int i3) {
        coordinatorLayout.G(view, i3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i3) {
        F(coordinatorLayout, view, i3);
        if (this.f7226a == null) {
            this.f7226a = new d(view);
        }
        this.f7226a.c();
        this.f7226a.a();
        int i4 = this.f7227b;
        if (i4 != 0) {
            this.f7226a.e(i4);
            this.f7227b = 0;
        }
        int i5 = this.f7228c;
        if (i5 == 0) {
            return true;
        }
        this.f7226a.d(i5);
        this.f7228c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7227b = 0;
        this.f7228c = 0;
    }
}

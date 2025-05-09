package K;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class B {

    /* renamed from: a, reason: collision with root package name */
    public int f927a;

    /* renamed from: b, reason: collision with root package name */
    public int f928b;

    public B(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f927a | this.f928b;
    }

    public void b(View view, View view2, int i3) {
        c(view, view2, i3, 0);
    }

    public void c(View view, View view2, int i3, int i4) {
        if (i4 == 1) {
            this.f928b = i3;
        } else {
            this.f927a = i3;
        }
    }

    public void d(View view, int i3) {
        if (i3 == 1) {
            this.f928b = 0;
        } else {
            this.f927a = 0;
        }
    }
}

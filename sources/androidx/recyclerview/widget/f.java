package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public int f4590b;

    /* renamed from: c, reason: collision with root package name */
    public int f4591c;

    /* renamed from: d, reason: collision with root package name */
    public int f4592d;

    /* renamed from: e, reason: collision with root package name */
    public int f4593e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4596h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4597i;

    /* renamed from: a, reason: collision with root package name */
    public boolean f4589a = true;

    /* renamed from: f, reason: collision with root package name */
    public int f4594f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f4595g = 0;

    public boolean a(RecyclerView.z zVar) {
        int i3 = this.f4591c;
        return i3 >= 0 && i3 < zVar.b();
    }

    public View b(RecyclerView.u uVar) {
        View o3 = uVar.o(this.f4591c);
        this.f4591c += this.f4592d;
        return o3;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4590b + ", mCurrentPosition=" + this.f4591c + ", mItemDirection=" + this.f4592d + ", mLayoutDirection=" + this.f4593e + ", mStartLine=" + this.f4594f + ", mEndLine=" + this.f4595g + '}';
    }
}

package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0575p extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f8389b = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f8390a;

    public C0575p(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        a(context, attributeSet, i3, i4);
    }

    public final void a(Context context, AttributeSet attributeSet, int i3, int i4) {
        C0552S t3 = C0552S.t(context, attributeSet, d.i.f6333t1, i3, i4);
        int i5 = d.i.f6341v1;
        if (t3.q(i5)) {
            b(t3.a(i5, false));
        }
        setBackgroundDrawable(t3.g(d.i.f6337u1));
        t3.u();
    }

    public final void b(boolean z3) {
        if (f8389b) {
            this.f8390a = z3;
        } else {
            Q.f.a(this, z3);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i3, int i4) {
        if (f8389b && this.f8390a) {
            i4 -= view.getHeight();
        }
        super.showAsDropDown(view, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i3, int i4, int i5, int i6) {
        if (f8389b && this.f8390a) {
            i4 -= view.getHeight();
        }
        super.update(view, i3, i4, i5, i6);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i3, int i4, int i5) {
        if (f8389b && this.f8390a) {
            i4 -= view.getHeight();
        }
        super.showAsDropDown(view, i3, i4, i5);
    }
}

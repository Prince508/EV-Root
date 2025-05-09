package K;

import L.x;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import y.AbstractC0769b;

/* renamed from: K.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0184a {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f1001c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f1002a;

    /* renamed from: b, reason: collision with root package name */
    public final View.AccessibilityDelegate f1003b;

    /* renamed from: K.a$a, reason: collision with other inner class name */
    public static final class C0029a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final C0184a f1004a;

        public C0029a(C0184a c0184a) {
            this.f1004a = c0184a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1004a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            L.y b3 = this.f1004a.b(view);
            if (b3 != null) {
                return (AccessibilityNodeProvider) b3.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1004a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            L.x J02 = L.x.J0(accessibilityNodeInfo);
            J02.A0(O.R(view));
            J02.s0(O.M(view));
            J02.x0(O.l(view));
            J02.E0(O.D(view));
            this.f1004a.g(view, J02);
            J02.e(accessibilityNodeInfo.getText(), view);
            List c3 = C0184a.c(view);
            for (int i3 = 0; i3 < c3.size(); i3++) {
                J02.b((x.a) c3.get(i3));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1004a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1004a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i3, Bundle bundle) {
            return this.f1004a.j(view, i3, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i3) {
            this.f1004a.l(view, i3);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1004a.m(view, accessibilityEvent);
        }
    }

    public C0184a() {
        this(f1001c);
    }

    public static List c(View view) {
        List list = (List) view.getTag(AbstractC0769b.f10118H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f1002a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public L.y b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f1002a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new L.y(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate d() {
        return this.f1003b;
    }

    public final boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] q3 = L.x.q(view.createAccessibilityNodeInfo().getText());
            for (int i3 = 0; q3 != null && i3 < q3.length; i3++) {
                if (clickableSpan.equals(q3[i3])) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f1002a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, L.x xVar) {
        this.f1002a.onInitializeAccessibilityNodeInfo(view, xVar.I0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f1002a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f1002a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i3, Bundle bundle) {
        List c3 = c(view);
        boolean z3 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= c3.size()) {
                break;
            }
            x.a aVar = (x.a) c3.get(i4);
            if (aVar.b() == i3) {
                z3 = aVar.d(view, bundle);
                break;
            }
            i4++;
        }
        if (!z3) {
            z3 = this.f1002a.performAccessibilityAction(view, i3, bundle);
        }
        return (z3 || i3 != AbstractC0769b.f10129a || bundle == null) ? z3 : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public final boolean k(int i3, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC0769b.f10119I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i3)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public void l(View view, int i3) {
        this.f1002a.sendAccessibilityEvent(view, i3);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f1002a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0184a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1002a = accessibilityDelegate;
        this.f1003b = new C0029a(this);
    }
}

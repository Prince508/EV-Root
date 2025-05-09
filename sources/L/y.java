package L;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final Object f1304a;

    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a, reason: collision with root package name */
        public final y f1305a;

        public a(y yVar) {
            this.f1305a = yVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
            x b3 = this.f1305a.b(i3);
            if (b3 == null) {
                return null;
            }
            return b3.I0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List findAccessibilityNodeInfosByText(String str, int i3) {
            List c3 = this.f1305a.c(str, i3);
            if (c3 == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c3.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList.add(((x) c3.get(i4)).I0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i3) {
            x d3 = this.f1305a.d(i3);
            if (d3 == null) {
                return null;
            }
            return d3.I0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i3, int i4, Bundle bundle) {
            return this.f1305a.f(i3, i4, bundle);
        }
    }

    public static class b extends a {
        public b(y yVar) {
            super(yVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i3, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f1305a.a(i3, x.J0(accessibilityNodeInfo), str, bundle);
        }
    }

    public y() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1304a = new b(this);
        } else {
            this.f1304a = new a(this);
        }
    }

    public x b(int i3) {
        return null;
    }

    public List c(String str, int i3) {
        return null;
    }

    public x d(int i3) {
        return null;
    }

    public Object e() {
        return this.f1304a;
    }

    public boolean f(int i3, int i4, Bundle bundle) {
        return false;
    }

    public y(Object obj) {
        this.f1304a = obj;
    }

    public void a(int i3, x xVar, String str, Bundle bundle) {
    }
}

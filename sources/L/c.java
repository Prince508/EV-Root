package L;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public abstract class c {

    public interface a {
        void onTouchExplorationStateChanged(boolean z3);
    }

    public static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final a f1249a;

        public b(a aVar) {
            this.f1249a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f1249a.equals(((b) obj).f1249a);
            }
            return false;
        }

        public int hashCode() {
            return this.f1249a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z3) {
            this.f1249a.onTouchExplorationStateChanged(z3);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}

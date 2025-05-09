package Q;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class f {

    public static class a {
        public static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        public static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        public static void c(PopupWindow popupWindow, boolean z3) {
            popupWindow.setOverlapAnchor(z3);
        }

        public static void d(PopupWindow popupWindow, int i3) {
            popupWindow.setWindowLayoutType(i3);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z3) {
        a.c(popupWindow, z3);
    }

    public static void b(PopupWindow popupWindow, int i3) {
        a.d(popupWindow, i3);
    }

    public static void c(PopupWindow popupWindow, View view, int i3, int i4, int i5) {
        popupWindow.showAsDropDown(view, i3, i4, i5);
    }
}

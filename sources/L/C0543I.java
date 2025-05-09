package l;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: l.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0543I extends AbstractC0541G implements InterfaceC0542H {

    /* renamed from: N, reason: collision with root package name */
    public static Method f8231N;

    /* renamed from: M, reason: collision with root package name */
    public InterfaceC0542H f8232M;

    /* renamed from: l.I$a */
    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: l.I$b */
    public static class b {
        public static void a(PopupWindow popupWindow, boolean z3) {
            popupWindow.setTouchModal(z3);
        }
    }

    /* renamed from: l.I$c */
    public static class c extends AbstractC0538D {

        /* renamed from: q, reason: collision with root package name */
        public final int f8233q;

        /* renamed from: r, reason: collision with root package name */
        public final int f8234r;

        /* renamed from: s, reason: collision with root package name */
        public InterfaceC0542H f8235s;

        /* renamed from: t, reason: collision with root package name */
        public MenuItem f8236t;

        /* renamed from: l.I$c$a */
        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z3) {
            super(context, z3);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f8233q = 21;
                this.f8234r = 22;
            } else {
                this.f8233q = 22;
                this.f8234r = 21;
            }
        }

        @Override // l.AbstractC0538D
        public /* bridge */ /* synthetic */ int d(int i3, int i4, int i5, int i6, int i7) {
            return super.d(i3, i4, i5, i6, i7);
        }

        @Override // l.AbstractC0538D
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i3) {
            return super.e(motionEvent, i3);
        }

        @Override // l.AbstractC0538D, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // l.AbstractC0538D, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // l.AbstractC0538D, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // l.AbstractC0538D, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // l.AbstractC0538D, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.c cVar;
            int i3;
            int pointToPosition;
            int i4;
            if (this.f8235s != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    cVar = (androidx.appcompat.view.menu.c) headerViewListAdapter.getWrappedAdapter();
                } else {
                    cVar = (androidx.appcompat.view.menu.c) adapter;
                    i3 = 0;
                }
                androidx.appcompat.view.menu.e item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i4 = pointToPosition - i3) < 0 || i4 >= cVar.getCount()) ? null : cVar.getItem(i4);
                MenuItem menuItem = this.f8236t;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.d b3 = cVar.b();
                    if (menuItem != null) {
                        this.f8235s.c(b3, menuItem);
                    }
                    this.f8236t = item;
                    if (item != null) {
                        this.f8235s.b(b3, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i3, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i3 == this.f8233q) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i3 != this.f8234r) {
                return super.onKeyDown(i3, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.c) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.c) adapter).b().d(false);
            return true;
        }

        @Override // l.AbstractC0538D, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC0542H interfaceC0542H) {
            this.f8235s = interfaceC0542H;
        }

        @Override // l.AbstractC0538D, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f8231N = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0543I(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
    }

    public void E(Object obj) {
        a.a(this.f8201J, (Transition) obj);
    }

    public void F(Object obj) {
        a.b(this.f8201J, (Transition) obj);
    }

    public void G(InterfaceC0542H interfaceC0542H) {
        this.f8232M = interfaceC0542H;
    }

    public void H(boolean z3) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.f8201J, z3);
            return;
        }
        Method method = f8231N;
        if (method != null) {
            try {
                method.invoke(this.f8201J, Boolean.valueOf(z3));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // l.InterfaceC0542H
    public void b(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
        InterfaceC0542H interfaceC0542H = this.f8232M;
        if (interfaceC0542H != null) {
            interfaceC0542H.b(dVar, menuItem);
        }
    }

    @Override // l.InterfaceC0542H
    public void c(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
        InterfaceC0542H interfaceC0542H = this.f8232M;
        if (interfaceC0542H != null) {
            interfaceC0542H.c(dVar, menuItem);
        }
    }

    @Override // l.AbstractC0541G
    public AbstractC0538D h(Context context, boolean z3) {
        c cVar = new c(context, z3);
        cVar.setHoverListener(this);
        return cVar;
    }
}

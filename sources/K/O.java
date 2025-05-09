package K;

import K.C0184a;
import K.C0205k0;
import K.X;
import L.x;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import y.AbstractC0769b;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public static Field f951a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f952b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f953c = {AbstractC0769b.f10130b, AbstractC0769b.f10131c, AbstractC0769b.f10142n, AbstractC0769b.f10153y, AbstractC0769b.f10112B, AbstractC0769b.f10113C, AbstractC0769b.f10114D, AbstractC0769b.f10115E, AbstractC0769b.f10116F, AbstractC0769b.f10117G, AbstractC0769b.f10132d, AbstractC0769b.f10133e, AbstractC0769b.f10134f, AbstractC0769b.f10135g, AbstractC0769b.f10136h, AbstractC0769b.f10137i, AbstractC0769b.f10138j, AbstractC0769b.f10139k, AbstractC0769b.f10140l, AbstractC0769b.f10141m, AbstractC0769b.f10143o, AbstractC0769b.f10144p, AbstractC0769b.f10145q, AbstractC0769b.f10146r, AbstractC0769b.f10147s, AbstractC0769b.f10148t, AbstractC0769b.f10149u, AbstractC0769b.f10150v, AbstractC0769b.f10151w, AbstractC0769b.f10152x, AbstractC0769b.f10154z, AbstractC0769b.f10111A};

    /* renamed from: d, reason: collision with root package name */
    public static final E f954d = new E() { // from class: K.N
        @Override // K.E
        public final C0190d a(C0190d c0190d) {
            return O.a(c0190d);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final e f955e = new e();

    public class a extends f {
        public a(int i3, Class cls, int i4) {
            super(i3, cls, i4);
        }

        @Override // K.O.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.d(view));
        }

        @Override // K.O.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.j(view, bool.booleanValue());
        }

        @Override // K.O.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public class b extends f {
        public b(int i3, Class cls, int i4, int i5) {
            super(i3, cls, i4, i5);
        }

        @Override // K.O.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return k.b(view);
        }

        @Override // K.O.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            k.h(view, charSequence);
        }

        @Override // K.O.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class c extends f {
        public c(int i3, Class cls, int i4, int i5) {
            super(i3, cls, i4, i5);
        }

        @Override // K.O.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return m.b(view);
        }

        @Override // K.O.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            m.f(view, charSequence);
        }

        @Override // K.O.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class d extends f {
        public d(int i3, Class cls, int i4) {
            super(i3, cls, i4);
        }

        @Override // K.O.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(k.c(view));
        }

        @Override // K.O.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            k.g(view, bool.booleanValue());
        }

        @Override // K.O.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f957a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f958b;

        /* renamed from: c, reason: collision with root package name */
        public final int f959c;

        /* renamed from: d, reason: collision with root package name */
        public final int f960d;

        public f(int i3, Class cls, int i4) {
            this(i3, cls, 0, i4);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.f959c;
        }

        public abstract Object c(View view);

        public abstract void d(View view, Object obj);

        public Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f957a);
            if (this.f958b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                O.g(view);
                view.setTag(this.f957a, obj);
                O.S(view, this.f960d);
            }
        }

        public abstract boolean g(Object obj, Object obj2);

        public f(int i3, Class cls, int i4, int i5) {
            this.f957a = i3;
            this.f958b = cls;
            this.f960d = i4;
            this.f959c = i5;
        }
    }

    public static class g {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class h {

        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public C0205k0 f961a = null;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f962b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C f963c;

            public a(View view, C c3) {
                this.f962b = view;
                this.f963c = c3;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C0205k0 u3 = C0205k0.u(windowInsets, view);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 30) {
                    h.a(windowInsets, this.f962b);
                    if (u3.equals(this.f961a)) {
                        return this.f963c.a(view, u3).s();
                    }
                }
                this.f961a = u3;
                C0205k0 a3 = this.f963c.a(view, u3);
                if (i3 >= 30) {
                    return a3.s();
                }
                O.g0(view);
                return a3.s();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC0769b.f10128R);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static C0205k0 b(View view, C0205k0 c0205k0, Rect rect) {
            WindowInsets s3 = c0205k0.s();
            if (s3 != null) {
                return C0205k0.u(view.computeSystemWindowInsets(s3, rect), view);
            }
            rect.setEmpty();
            return c0205k0;
        }

        public static boolean c(View view, float f3, float f4, boolean z3) {
            return view.dispatchNestedFling(f3, f4, z3);
        }

        public static boolean d(View view, float f3, float f4) {
            return view.dispatchNestedPreFling(f3, f4);
        }

        public static boolean e(View view, int i3, int i4, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i3, i4, iArr, iArr2);
        }

        public static boolean f(View view, int i3, int i4, int i5, int i6, int[] iArr) {
            return view.dispatchNestedScroll(i3, i4, i5, i6, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static C0205k0 j(View view) {
            return C0205k0.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f3) {
            view.setElevation(f3);
        }

        public static void t(View view, boolean z3) {
            view.setNestedScrollingEnabled(z3);
        }

        public static void u(View view, C c3) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC0769b.f10122L, c3);
            }
            if (c3 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC0769b.f10128R));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, c3));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f3) {
            view.setTranslationZ(f3);
        }

        public static void x(View view, float f3) {
            view.setZ(f3);
        }

        public static boolean y(View view, int i3) {
            return view.startNestedScroll(i3);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class i {
        public static C0205k0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C0205k0 t3 = C0205k0.t(rootWindowInsets);
            t3.q(t3);
            t3.d(view.getRootView());
            return t3;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i3) {
            view.setScrollIndicators(i3);
        }

        public static void d(View view, int i3, int i4) {
            view.setScrollIndicators(i3, i4);
        }
    }

    public static class j {
        public static void a(View view, Collection<View> collection, int i3) {
            view.addKeyboardNavigationClusters(collection, i3);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        public static int d(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View i(View view, View view2, int i3) {
            return view.keyboardNavigationClusterSearch(view2, i3);
        }

        public static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        public static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(View view, boolean z3) {
            view.setFocusedByDefault(z3);
        }

        public static void m(View view, int i3) {
            view.setImportantForAutofill(i3);
        }

        public static void n(View view, boolean z3) {
            view.setKeyboardNavigationCluster(z3);
        }

        public static void o(View view, int i3) {
            view.setNextClusterForwardId(i3);
        }

        public static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class k {
        public static void a(View view, final p pVar) {
            int i3 = AbstractC0769b.f10127Q;
            o.g gVar = (o.g) view.getTag(i3);
            if (gVar == null) {
                gVar = new o.g();
                view.setTag(i3, gVar);
            }
            Objects.requireNonNull(pVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(pVar) { // from class: K.P
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            gVar.put(pVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, p pVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            o.g gVar = (o.g) view.getTag(AbstractC0769b.f10127Q);
            if (gVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(pVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i3) {
            return (T) view.requireViewById(i3);
        }

        public static void g(View view, boolean z3) {
            view.setAccessibilityHeading(z3);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, N.a aVar) {
            view.setAutofillId(null);
        }

        public static void j(View view, boolean z3) {
            view.setScreenReaderFocusable(z3);
        }
    }

    public static class l {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3, int i4) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i3, i4);
        }

        public static void e(View view, O.a aVar) {
            view.setContentCaptureSession(null);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class m {
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static J0 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return J0.d(windowInsetsController);
            }
            return null;
        }

        public static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        public static void e(View view, int i3) {
            view.setImportantForContentCapture(i3);
        }

        public static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class n {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C0190d b(View view, C0190d c0190d) {
            ContentInfo f3 = c0190d.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f3);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f3 ? c0190d : C0190d.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, D d3) {
            if (d3 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new o(d3));
            }
        }
    }

    public static final class o implements OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        public final D f964a;

        public o(D d3) {
            this.f964a = d3;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C0190d g3 = C0190d.g(contentInfo);
            C0190d a3 = this.f964a.a(view, g3);
            if (a3 == null) {
                return null;
            }
            return a3 == g3 ? contentInfo : a3.f();
        }
    }

    public interface p {
    }

    public static int A(View view) {
        return view.getPaddingEnd();
    }

    public static void A0(View view, X.b bVar) {
        X.d(view, bVar);
    }

    public static int B(View view) {
        return view.getPaddingStart();
    }

    public static void B0(View view, float f3) {
        h.x(view, f3);
    }

    public static C0205k0 C(View view) {
        return i.a(view);
    }

    public static f C0() {
        return new c(AbstractC0769b.f10126P, CharSequence.class, 64, 30);
    }

    public static CharSequence D(View view) {
        return (CharSequence) C0().e(view);
    }

    public static void D0(View view) {
        h.z(view);
    }

    public static String E(View view) {
        return h.k(view);
    }

    public static float F(View view) {
        return h.l(view);
    }

    public static J0 G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return W.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static int H(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float I(View view) {
        return h.m(view);
    }

    public static boolean J(View view) {
        return j(view) != null;
    }

    public static boolean K(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean L(View view) {
        return view.hasTransientState();
    }

    public static boolean M(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean N(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean O(View view) {
        return view.isLaidOut();
    }

    public static boolean P(View view) {
        return h.p(view);
    }

    public static boolean Q(View view) {
        return view.isPaddingRelative();
    }

    public static boolean R(View view) {
        Boolean bool = (Boolean) i0().e(view);
        return bool != null && bool.booleanValue();
    }

    public static void S(View view, int i3) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z3 = l(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z3) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z3 ? 32 : 2048);
                obtain.setContentChangeTypes(i3);
                if (z3) {
                    obtain.getText().add(l(view));
                    s0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i3 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i3);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(l(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i3);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e3);
                }
            }
        }
    }

    public static void T(View view, int i3) {
        view.offsetLeftAndRight(i3);
    }

    public static void U(View view, int i3) {
        view.offsetTopAndBottom(i3);
    }

    public static C0205k0 V(View view, C0205k0 c0205k0) {
        WindowInsets s3 = c0205k0.s();
        if (s3 != null) {
            WindowInsets b3 = g.b(view, s3);
            if (!b3.equals(s3)) {
                return C0205k0.u(b3, view);
            }
        }
        return c0205k0;
    }

    public static void W(View view, L.x xVar) {
        view.onInitializeAccessibilityNodeInfo(xVar.I0());
    }

    public static f X() {
        return new b(AbstractC0769b.f10121K, CharSequence.class, 8, 28);
    }

    public static boolean Y(View view, int i3, Bundle bundle) {
        return view.performAccessibilityAction(i3, bundle);
    }

    public static C0190d Z(View view, C0190d c0190d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0190d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n.b(view, c0190d);
        }
        D d3 = (D) view.getTag(AbstractC0769b.f10123M);
        if (d3 == null) {
            return s(view).a(c0190d);
        }
        C0190d a3 = d3.a(view, c0190d);
        if (a3 == null) {
            return null;
        }
        return s(view).a(a3);
    }

    public static /* synthetic */ C0190d a(C0190d c0190d) {
        return c0190d;
    }

    public static void a0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static f b() {
        return new d(AbstractC0769b.f10120J, Boolean.class, 28);
    }

    public static void b0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static int c(View view, CharSequence charSequence, L.A a3) {
        int n3 = n(view, charSequence);
        if (n3 != -1) {
            d(view, new x.a(n3, charSequence, a3));
        }
        return n3;
    }

    public static void c0(View view, Runnable runnable, long j3) {
        view.postOnAnimationDelayed(runnable, j3);
    }

    public static void d(View view, x.a aVar) {
        g(view);
        e0(aVar.b(), view);
        m(view).add(aVar);
        S(view, 0);
    }

    public static void d0(View view, int i3) {
        e0(i3, view);
        S(view, 0);
    }

    public static C0205k0 e(View view, C0205k0 c0205k0, Rect rect) {
        return h.b(view, c0205k0, rect);
    }

    public static void e0(int i3, View view) {
        List m3 = m(view);
        for (int i4 = 0; i4 < m3.size(); i4++) {
            if (((x.a) m3.get(i4)).b() == i3) {
                m3.remove(i4);
                return;
            }
        }
    }

    public static C0205k0 f(View view, C0205k0 c0205k0) {
        WindowInsets s3 = c0205k0.s();
        if (s3 != null) {
            WindowInsets a3 = g.a(view, s3);
            if (!a3.equals(s3)) {
                return C0205k0.u(a3, view);
            }
        }
        return c0205k0;
    }

    public static void f0(View view, x.a aVar, CharSequence charSequence, L.A a3) {
        if (a3 == null && charSequence == null) {
            d0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, a3));
        }
    }

    public static void g(View view) {
        C0184a i3 = i(view);
        if (i3 == null) {
            i3 = new C0184a();
        }
        j0(view, i3);
    }

    public static void g0(View view) {
        g.c(view);
    }

    public static int h() {
        return View.generateViewId();
    }

    public static void h0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.d(view, context, iArr, attributeSet, typedArray, i3, i4);
        }
    }

    public static C0184a i(View view) {
        View.AccessibilityDelegate j3 = j(view);
        if (j3 == null) {
            return null;
        }
        return j3 instanceof C0184a.C0029a ? ((C0184a.C0029a) j3).f1004a : new C0184a(j3);
    }

    public static f i0() {
        return new a(AbstractC0769b.f10125O, Boolean.class, 28);
    }

    public static View.AccessibilityDelegate j(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.a(view) : k(view);
    }

    public static void j0(View view, C0184a c0184a) {
        if (c0184a == null && (j(view) instanceof C0184a.C0029a)) {
            c0184a = new C0184a();
        }
        s0(view);
        view.setAccessibilityDelegate(c0184a == null ? null : c0184a.d());
    }

    public static View.AccessibilityDelegate k(View view) {
        if (f952b) {
            return null;
        }
        if (f951a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f951a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f952b = true;
                return null;
            }
        }
        try {
            Object obj = f951a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f952b = true;
            return null;
        }
    }

    public static void k0(View view, boolean z3) {
        b().f(view, Boolean.valueOf(z3));
    }

    public static CharSequence l(View view) {
        return (CharSequence) X().e(view);
    }

    public static void l0(View view, int i3) {
        view.setAccessibilityLiveRegion(i3);
    }

    public static List m(View view) {
        int i3 = AbstractC0769b.f10118H;
        ArrayList arrayList = (ArrayList) view.getTag(i3);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i3, arrayList2);
        return arrayList2;
    }

    public static void m0(View view, CharSequence charSequence) {
        X().f(view, charSequence);
        if (charSequence != null) {
            f955e.a(view);
        } else {
            f955e.d(view);
        }
    }

    public static int n(View view, CharSequence charSequence) {
        List m3 = m(view);
        for (int i3 = 0; i3 < m3.size(); i3++) {
            if (TextUtils.equals(charSequence, ((x.a) m3.get(i3)).c())) {
                return ((x.a) m3.get(i3)).b();
            }
        }
        int i4 = -1;
        int i5 = 0;
        while (true) {
            int[] iArr = f953c;
            if (i5 >= iArr.length || i4 != -1) {
                break;
            }
            int i6 = iArr[i5];
            boolean z3 = true;
            for (int i7 = 0; i7 < m3.size(); i7++) {
                z3 &= ((x.a) m3.get(i7)).b() != i6;
            }
            if (z3) {
                i4 = i6;
            }
            i5++;
        }
        return i4;
    }

    public static void n0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static ColorStateList o(View view) {
        return h.g(view);
    }

    public static void o0(View view, ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    public static PorterDuff.Mode p(View view) {
        return h.h(view);
    }

    public static void p0(View view, PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    public static Display q(View view) {
        return view.getDisplay();
    }

    public static void q0(View view, float f3) {
        h.s(view, f3);
    }

    public static float r(View view) {
        return h.i(view);
    }

    public static void r0(View view, int i3) {
        view.setImportantForAccessibility(i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static E s(View view) {
        return view instanceof E ? (E) view : f954d;
    }

    public static void s0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static boolean t(View view) {
        return view.getFitsSystemWindows();
    }

    public static void t0(View view, int i3) {
        if (Build.VERSION.SDK_INT >= 26) {
            j.m(view, i3);
        }
    }

    public static int u(View view) {
        return view.getImportantForAccessibility();
    }

    public static void u0(View view, int i3) {
        view.setLabelFor(i3);
    }

    public static int v(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j.c(view);
        }
        return 0;
    }

    public static void v0(View view, C c3) {
        h.u(view, c3);
    }

    public static int w(View view) {
        return view.getLayoutDirection();
    }

    public static void w0(View view, int i3, int i4, int i5, int i6) {
        view.setPaddingRelative(i3, i4, i5, i6);
    }

    public static int x(View view) {
        return view.getMinimumHeight();
    }

    public static void x0(View view, CharSequence charSequence) {
        C0().f(view, charSequence);
    }

    public static int y(View view) {
        return view.getMinimumWidth();
    }

    public static void y0(View view, String str) {
        h.v(view, str);
    }

    public static String[] z(View view) {
        return Build.VERSION.SDK_INT >= 31 ? n.a(view) : (String[]) view.getTag(AbstractC0769b.f10124N);
    }

    public static void z0(View view, float f3) {
        h.w(view, f3);
    }

    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: e, reason: collision with root package name */
        public final WeakHashMap f956e = new WeakHashMap();

        public void a(View view) {
            this.f956e.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        public final void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z3 = view.isShown() && view.getWindowVisibility() == 0;
            if (booleanValue != z3) {
                O.S(view, z3 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z3));
            }
        }

        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void d(View view) {
            this.f956e.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public final void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f956e.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}

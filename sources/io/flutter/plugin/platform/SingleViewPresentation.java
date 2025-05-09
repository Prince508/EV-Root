package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import c.InterfaceC0370a;

@InterfaceC0370a
/* loaded from: classes.dex */
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final io.flutter.plugin.platform.a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused;
    private final d state;
    private int viewId;

    public static class a extends FrameLayout {
    }

    public static class b extends ContextWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final InputMethodManager f7682a;

        public b(Context context) {
            this(context, null);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context createDisplayContext(Display display) {
            return new b(super.createDisplayContext(display), this.f7682a);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.f7682a : super.getSystemService(str);
        }

        public b(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.f7682a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }
    }

    public static class c extends ContextWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final z f7683a;

        /* renamed from: b, reason: collision with root package name */
        public WindowManager f7684b;

        /* renamed from: c, reason: collision with root package name */
        public final Context f7685c;

        public c(Context context, z zVar, Context context2) {
            super(context);
            this.f7683a = zVar;
            this.f7685c = context2;
        }

        public final WindowManager a() {
            if (this.f7684b == null) {
                this.f7684b = this.f7683a;
            }
            return this.f7684b;
        }

        public final boolean b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i3 = 0; i3 < stackTrace.length && i3 < 11; i3++) {
                if (stackTrace[i3].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i3].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "window".equals(str) ? b() ? this.f7685c.getSystemService(str) : a() : super.getSystemService(str);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public z f7686a;

        /* renamed from: b, reason: collision with root package name */
        public s f7687b;

        public static /* synthetic */ j a(d dVar) {
            dVar.getClass();
            return null;
        }

        public static /* synthetic */ j b(d dVar, j jVar) {
            dVar.getClass();
            return jVar;
        }
    }

    public SingleViewPresentation(Context context, Display display, j jVar, io.flutter.plugin.platform.a aVar, int i3, View.OnFocusChangeListener onFocusChangeListener) {
        super(new b(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i3;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        d dVar = new d();
        this.state = dVar;
        d.b(dVar, jVar);
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public d detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        return this.state;
    }

    public j getView() {
        d.a(this.state);
        return null;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f7687b == null) {
            this.state.f7687b = new s(getContext());
        }
        if (this.state.f7686a == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            d dVar = this.state;
            dVar.f7686a = new z(windowManager, dVar.f7687b);
        }
        this.container = new FrameLayout(getContext());
        new c(getContext(), this.state.f7686a, this.outerContext);
        d.a(this.state);
        throw null;
    }

    public SingleViewPresentation(Context context, Display display, io.flutter.plugin.platform.a aVar, d dVar, View.OnFocusChangeListener onFocusChangeListener, boolean z3) {
        super(new b(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = dVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z3;
    }
}

package Y1;

import Y1.I;
import Y1.r;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import i2.InterfaceC0504b;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.f;
import j.AbstractC0515e;
import j2.C0522d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import k2.C0534a;
import o2.AbstractC0655f;
import y0.C0771a;

/* loaded from: classes.dex */
public class A extends FrameLayout implements C0534a.c, I.e {

    /* renamed from: A, reason: collision with root package name */
    public final J.a f2393A;

    /* renamed from: e, reason: collision with root package name */
    public s f2394e;

    /* renamed from: f, reason: collision with root package name */
    public t f2395f;

    /* renamed from: g, reason: collision with root package name */
    public r f2396g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f2397h;

    /* renamed from: i, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f2398i;

    /* renamed from: j, reason: collision with root package name */
    public final Set f2399j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2400k;

    /* renamed from: l, reason: collision with root package name */
    public io.flutter.embedding.engine.a f2401l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f2402m;

    /* renamed from: n, reason: collision with root package name */
    public C0534a f2403n;

    /* renamed from: o, reason: collision with root package name */
    public io.flutter.plugin.editing.A f2404o;

    /* renamed from: p, reason: collision with root package name */
    public io.flutter.plugin.editing.j f2405p;

    /* renamed from: q, reason: collision with root package name */
    public C0522d f2406q;

    /* renamed from: r, reason: collision with root package name */
    public I f2407r;

    /* renamed from: s, reason: collision with root package name */
    public C0298c f2408s;

    /* renamed from: t, reason: collision with root package name */
    public io.flutter.view.f f2409t;

    /* renamed from: u, reason: collision with root package name */
    public TextServicesManager f2410u;

    /* renamed from: v, reason: collision with root package name */
    public N f2411v;

    /* renamed from: w, reason: collision with root package name */
    public final FlutterRenderer.g f2412w;

    /* renamed from: x, reason: collision with root package name */
    public final f.k f2413x;

    /* renamed from: y, reason: collision with root package name */
    public final ContentObserver f2414y;

    /* renamed from: z, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.j f2415z;

    public class a implements f.k {
        public a() {
        }

        @Override // io.flutter.view.f.k
        public void a(boolean z3, boolean z4) {
            A.this.y(z3, z4);
        }
    }

    public class b extends ContentObserver {
        public b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3) {
            super.onChange(z3);
            if (A.this.f2401l == null) {
                return;
            }
            W1.b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
            A.this.A();
        }
    }

    public class c implements io.flutter.embedding.engine.renderer.j {
        public c() {
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void b() {
            A.this.f2400k = false;
            Iterator it = A.this.f2399j.iterator();
            while (it.hasNext()) {
                ((io.flutter.embedding.engine.renderer.j) it.next()).b();
            }
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void f() {
            A.this.f2400k = true;
            Iterator it = A.this.f2399j.iterator();
            while (it.hasNext()) {
                ((io.flutter.embedding.engine.renderer.j) it.next()).f();
            }
        }
    }

    public class d implements J.a {
        public d() {
        }

        @Override // J.a, androidx.window.extensions.core.util.function.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(z0.j jVar) {
            A.this.setWindowInfoListenerDisplayFeatures(jVar);
        }
    }

    public enum f {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public A(Context context, s sVar) {
        this(context, (AttributeSet) null, sVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r1 != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L13
            h2.t$c r0 = h2.t.c.dark
            goto L15
        L13:
            h2.t$c r0 = h2.t.c.light
        L15:
            android.view.textservice.TextServicesManager r1 = r6.f2410u
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3e
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L3c
            java.util.List r1 = Y1.v.a(r1)
            java.util.stream.Stream r1 = r1.stream()
            Y1.z r4 = new Y1.z
            r4.<init>()
            boolean r1 = r1.anyMatch(r4)
            android.view.textservice.TextServicesManager r4 = r6.f2410u
            boolean r4 = Y1.w.a(r4)
            if (r4 == 0) goto L3e
            if (r1 == 0) goto L3e
        L3c:
            r1 = r3
            goto L3f
        L3e:
            r1 = r2
        L3f:
            io.flutter.embedding.engine.a r4 = r6.f2401l
            h2.t r4 = r4.v()
            h2.t$b r4 = r4.d()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            h2.t$b r4 = r4.f(r5)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            h2.t$b r4 = r4.c(r5)
            h2.t$b r1 = r4.d(r1)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r3)
            if (r4 != r3) goto L78
            r2 = r3
        L78:
            h2.t$b r1 = r1.b(r2)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            h2.t$b r1 = r1.g(r2)
            h2.t$b r0 = r1.e(r0)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.A.A():void");
    }

    public final void B() {
        if (!v()) {
            W1.b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f2412w.f7595a = getResources().getDisplayMetrics().density;
        this.f2412w.f7610p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f2401l.t().o(this.f2412w);
    }

    @Override // Y1.I.e
    public void a(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        this.f2404o.j(sparseArray);
    }

    @Override // Y1.I.e
    public boolean b(KeyEvent keyEvent) {
        return this.f2404o.p(keyEvent);
    }

    @Override // k2.C0534a.c
    public PointerIcon c(int i3) {
        return PointerIcon.getSystemIcon(getContext(), i3);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f2401l;
        return aVar != null ? aVar.q().y(view) : super.checkInputConnectionProxy(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (v() && this.f2407r.b(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.f fVar = this.f2409t;
        if (fVar == null || !fVar.B()) {
            return null;
        }
        return this.f2409t;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f2401l;
    }

    @Override // Y1.I.e
    public InterfaceC0504b getBinaryMessenger() {
        return this.f2401l.k();
    }

    public r getCurrentImageSurface() {
        return this.f2396g;
    }

    public boolean k() {
        r rVar = this.f2396g;
        if (rVar != null) {
            return rVar.e();
        }
        return false;
    }

    public void l(io.flutter.embedding.engine.renderer.j jVar) {
        this.f2399j.add(jVar);
    }

    public void m(r rVar) {
        io.flutter.embedding.engine.a aVar = this.f2401l;
        if (aVar != null) {
            rVar.a(aVar.t());
        }
    }

    public void n(io.flutter.embedding.engine.a aVar) {
        W1.b.f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (v()) {
            if (aVar == this.f2401l) {
                W1.b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                W1.b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                s();
            }
        }
        this.f2401l = aVar;
        FlutterRenderer t3 = aVar.t();
        this.f2400k = t3.i();
        this.f2397h.a(t3);
        t3.g(this.f2415z);
        this.f2403n = new C0534a(this, this.f2401l.n());
        this.f2404o = new io.flutter.plugin.editing.A(this, this.f2401l.y(), this.f2401l.q());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f2410u = textServicesManager;
            this.f2405p = new io.flutter.plugin.editing.j(textServicesManager, this.f2401l.w());
        } catch (Exception unused) {
            W1.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f2406q = this.f2401l.m();
        this.f2407r = new I(this);
        this.f2408s = new C0298c(this.f2401l.t(), false);
        io.flutter.view.f fVar = new io.flutter.view.f(this, aVar.h(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f2401l.q());
        this.f2409t = fVar;
        fVar.X(this.f2413x);
        y(this.f2409t.B(), this.f2409t.D());
        this.f2401l.q().b(this.f2409t);
        this.f2401l.q().w(this.f2401l.t());
        this.f2404o.o().restartInput(this);
        A();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f2414y);
        B();
        aVar.q().x(this);
        Iterator it = this.f2402m.iterator();
        if (it.hasNext()) {
            AbstractC0515e.a(it.next());
            throw null;
        }
        if (this.f2400k) {
            this.f2415z.f();
        }
    }

    public final f o() {
        Context context = getContext();
        int i3 = context.getResources().getConfiguration().orientation;
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i3 == 2) {
            if (rotation == 1) {
                return f.RIGHT;
            }
            if (rotation == 3) {
                return f.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return f.BOTH;
            }
        }
        return f.NONE;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        Insets insets;
        int i3;
        int i4;
        int i5;
        int i6;
        int ime;
        Insets insets2;
        int i7;
        int i8;
        int i9;
        int i10;
        int systemGestures;
        Insets insets3;
        int i11;
        int i12;
        int i13;
        int i14;
        DisplayCutout displayCutout;
        Insets waterfallInsets;
        int i15;
        int safeInsetTop;
        int i16;
        int safeInsetRight;
        int i17;
        int safeInsetBottom;
        int i18;
        int safeInsetLeft;
        int statusBars;
        Insets systemGestureInsets;
        int i19;
        int i20;
        int i21;
        int i22;
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i23 = Build.VERSION.SDK_INT;
        if (i23 == 29) {
            systemGestureInsets = windowInsets.getSystemGestureInsets();
            FlutterRenderer.g gVar = this.f2412w;
            i19 = systemGestureInsets.top;
            gVar.f7606l = i19;
            FlutterRenderer.g gVar2 = this.f2412w;
            i20 = systemGestureInsets.right;
            gVar2.f7607m = i20;
            FlutterRenderer.g gVar3 = this.f2412w;
            i21 = systemGestureInsets.bottom;
            gVar3.f7608n = i21;
            FlutterRenderer.g gVar4 = this.f2412w;
            i22 = systemGestureInsets.left;
            gVar4.f7609o = i22;
        }
        boolean z3 = (getWindowSystemUiVisibility() & 4) == 0;
        boolean z4 = (getWindowSystemUiVisibility() & 2) == 0;
        if (i23 >= 30) {
            int navigationBars = z4 ? WindowInsets.Type.navigationBars() : 0;
            if (z3) {
                statusBars = WindowInsets.Type.statusBars();
                navigationBars |= statusBars;
            }
            insets = windowInsets.getInsets(navigationBars);
            FlutterRenderer.g gVar5 = this.f2412w;
            i3 = insets.top;
            gVar5.f7598d = i3;
            FlutterRenderer.g gVar6 = this.f2412w;
            i4 = insets.right;
            gVar6.f7599e = i4;
            FlutterRenderer.g gVar7 = this.f2412w;
            i5 = insets.bottom;
            gVar7.f7600f = i5;
            FlutterRenderer.g gVar8 = this.f2412w;
            i6 = insets.left;
            gVar8.f7601g = i6;
            ime = WindowInsets.Type.ime();
            insets2 = windowInsets.getInsets(ime);
            FlutterRenderer.g gVar9 = this.f2412w;
            i7 = insets2.top;
            gVar9.f7602h = i7;
            FlutterRenderer.g gVar10 = this.f2412w;
            i8 = insets2.right;
            gVar10.f7603i = i8;
            FlutterRenderer.g gVar11 = this.f2412w;
            i9 = insets2.bottom;
            gVar11.f7604j = i9;
            FlutterRenderer.g gVar12 = this.f2412w;
            i10 = insets2.left;
            gVar12.f7605k = i10;
            systemGestures = WindowInsets.Type.systemGestures();
            insets3 = windowInsets.getInsets(systemGestures);
            FlutterRenderer.g gVar13 = this.f2412w;
            i11 = insets3.top;
            gVar13.f7606l = i11;
            FlutterRenderer.g gVar14 = this.f2412w;
            i12 = insets3.right;
            gVar14.f7607m = i12;
            FlutterRenderer.g gVar15 = this.f2412w;
            i13 = insets3.bottom;
            gVar15.f7608n = i13;
            FlutterRenderer.g gVar16 = this.f2412w;
            i14 = insets3.left;
            gVar16.f7609o = i14;
            displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                waterfallInsets = displayCutout.getWaterfallInsets();
                FlutterRenderer.g gVar17 = this.f2412w;
                int i24 = gVar17.f7598d;
                i15 = waterfallInsets.top;
                int max = Math.max(i24, i15);
                safeInsetTop = displayCutout.getSafeInsetTop();
                gVar17.f7598d = Math.max(max, safeInsetTop);
                FlutterRenderer.g gVar18 = this.f2412w;
                int i25 = gVar18.f7599e;
                i16 = waterfallInsets.right;
                int max2 = Math.max(i25, i16);
                safeInsetRight = displayCutout.getSafeInsetRight();
                gVar18.f7599e = Math.max(max2, safeInsetRight);
                FlutterRenderer.g gVar19 = this.f2412w;
                int i26 = gVar19.f7600f;
                i17 = waterfallInsets.bottom;
                int max3 = Math.max(i26, i17);
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                gVar19.f7600f = Math.max(max3, safeInsetBottom);
                FlutterRenderer.g gVar20 = this.f2412w;
                int i27 = gVar20.f7601g;
                i18 = waterfallInsets.left;
                int max4 = Math.max(i27, i18);
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                gVar20.f7601g = Math.max(max4, safeInsetLeft);
            }
        } else {
            f fVar = f.NONE;
            if (!z4) {
                fVar = o();
            }
            this.f2412w.f7598d = z3 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f2412w.f7599e = (fVar == f.RIGHT || fVar == f.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f2412w.f7600f = (z4 && t(windowInsets) == 0) ? windowInsets.getSystemWindowInsetBottom() : 0;
            this.f2412w.f7601g = (fVar == f.LEFT || fVar == f.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            FlutterRenderer.g gVar21 = this.f2412w;
            gVar21.f7602h = 0;
            gVar21.f7603i = 0;
            gVar21.f7604j = t(windowInsets);
            this.f2412w.f7605k = 0;
        }
        W1.b.f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f2412w.f7598d + ", Left: " + this.f2412w.f7601g + ", Right: " + this.f2412w.f7599e + "\nKeyboard insets: Bottom: " + this.f2412w.f7604j + ", Left: " + this.f2412w.f7605k + ", Right: " + this.f2412w.f7603i + "System Gesture Insets - Left: " + this.f2412w.f7609o + ", Top: " + this.f2412w.f7606l + ", Right: " + this.f2412w.f7607m + ", Bottom: " + this.f2412w.f7604j);
        B();
        return onApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2411v = r();
        Activity b3 = AbstractC0655f.b(getContext());
        N n3 = this.f2411v;
        if (n3 == null || b3 == null) {
            return;
        }
        n3.a(b3, A.a.e(getContext()), this.f2393A);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f2401l != null) {
            W1.b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f2406q.d(configuration);
            A();
            AbstractC0655f.a(getContext(), this.f2401l);
        }
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !v() ? super.onCreateInputConnection(editorInfo) : this.f2404o.m(this, this.f2407r, editorInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        N n3 = this.f2411v;
        if (n3 != null) {
            n3.b(this.f2393A);
        }
        this.f2411v = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (v() && this.f2408s.j(motionEvent, getContext())) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !v() ? super.onHoverEvent(motionEvent) : this.f2409t.I(motionEvent);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i3) {
        super.onProvideAutofillVirtualStructure(viewStructure, i3);
        this.f2404o.x(viewStructure, i3);
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        W1.b.f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i5 + " x " + i6 + ", it is now " + i3 + " x " + i4);
        FlutterRenderer.g gVar = this.f2412w;
        gVar.f7596b = i3;
        gVar.f7597c = i4;
        B();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!v()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.f2408s.k(motionEvent);
    }

    public void p() {
        this.f2397h.b();
        r rVar = this.f2396g;
        if (rVar == null) {
            r q3 = q();
            this.f2396g = q3;
            addView(q3);
        } else {
            rVar.k(getWidth(), getHeight());
        }
        this.f2398i = this.f2397h;
        r rVar2 = this.f2396g;
        this.f2397h = rVar2;
        io.flutter.embedding.engine.a aVar = this.f2401l;
        if (aVar != null) {
            rVar2.a(aVar.t());
        }
    }

    public r q() {
        return new r(getContext(), getWidth(), getHeight(), r.b.background);
    }

    public N r() {
        try {
            return new N(new C0771a(z0.f.f10280a.d(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void s() {
        W1.b.f("FlutterView", "Detaching from a FlutterEngine: " + this.f2401l);
        if (!v()) {
            W1.b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator it = this.f2402m.iterator();
        if (it.hasNext()) {
            AbstractC0515e.a(it.next());
            throw null;
        }
        getContext().getContentResolver().unregisterContentObserver(this.f2414y);
        this.f2401l.q().F();
        this.f2401l.q().a();
        this.f2409t.P();
        this.f2409t = null;
        this.f2404o.o().restartInput(this);
        this.f2404o.n();
        this.f2407r.d();
        io.flutter.plugin.editing.j jVar = this.f2405p;
        if (jVar != null) {
            jVar.b();
        }
        C0534a c0534a = this.f2403n;
        if (c0534a != null) {
            c0534a.c();
        }
        FlutterRenderer t3 = this.f2401l.t();
        this.f2400k = false;
        t3.l(this.f2415z);
        t3.q();
        t3.n(false);
        io.flutter.embedding.engine.renderer.k kVar = this.f2398i;
        if (kVar != null && this.f2397h == this.f2396g) {
            this.f2397h = kVar;
        }
        this.f2397h.c();
        w();
        this.f2398i = null;
        this.f2401l = null;
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        io.flutter.embedding.engine.renderer.k kVar = this.f2397h;
        if (kVar instanceof s) {
            ((s) kVar).setVisibility(i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
    
        r7 = r7.getDisplayCutout();
     */
    @android.annotation.TargetApi(28)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setWindowInfoListenerDisplayFeatures(z0.j r7) {
        /*
            r6 = this;
            java.util.List r7 = r7.a()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        Ld:
            boolean r1 = r7.hasNext()
            java.lang.String r2 = "FlutterView"
            if (r1 == 0) goto L92
            java.lang.Object r1 = r7.next()
            z0.a r1 = (z0.InterfaceC0785a) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "WindowInfoTracker Display Feature reported with bounds = "
            r3.append(r4)
            android.graphics.Rect r4 = r1.a()
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r4 = " and type = "
            r3.append(r4)
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            W1.b.f(r2, r3)
            boolean r2 = r1 instanceof z0.InterfaceC0787c
            if (r2 == 0) goto L80
            r2 = r1
            z0.c r2 = (z0.InterfaceC0787c) r2
            z0.c$a r3 = r2.b()
            z0.c$a r4 = z0.InterfaceC0787c.a.f10259d
            if (r3 != r4) goto L59
            io.flutter.embedding.engine.renderer.FlutterRenderer$e r3 = io.flutter.embedding.engine.renderer.FlutterRenderer.e.HINGE
            goto L5b
        L59:
            io.flutter.embedding.engine.renderer.FlutterRenderer$e r3 = io.flutter.embedding.engine.renderer.FlutterRenderer.e.FOLD
        L5b:
            z0.c$b r4 = r2.getState()
            z0.c$b r5 = z0.InterfaceC0787c.b.f10262c
            if (r4 != r5) goto L66
            io.flutter.embedding.engine.renderer.FlutterRenderer$d r2 = io.flutter.embedding.engine.renderer.FlutterRenderer.d.POSTURE_FLAT
            goto L73
        L66:
            z0.c$b r2 = r2.getState()
            z0.c$b r4 = z0.InterfaceC0787c.b.f10263d
            if (r2 != r4) goto L71
            io.flutter.embedding.engine.renderer.FlutterRenderer$d r2 = io.flutter.embedding.engine.renderer.FlutterRenderer.d.POSTURE_HALF_OPENED
            goto L73
        L71:
            io.flutter.embedding.engine.renderer.FlutterRenderer$d r2 = io.flutter.embedding.engine.renderer.FlutterRenderer.d.UNKNOWN
        L73:
            io.flutter.embedding.engine.renderer.FlutterRenderer$c r4 = new io.flutter.embedding.engine.renderer.FlutterRenderer$c
            android.graphics.Rect r1 = r1.a()
            r4.<init>(r1, r3, r2)
            r0.add(r4)
            goto Ld
        L80:
            io.flutter.embedding.engine.renderer.FlutterRenderer$c r2 = new io.flutter.embedding.engine.renderer.FlutterRenderer$c
            android.graphics.Rect r1 = r1.a()
            io.flutter.embedding.engine.renderer.FlutterRenderer$e r3 = io.flutter.embedding.engine.renderer.FlutterRenderer.e.UNKNOWN
            io.flutter.embedding.engine.renderer.FlutterRenderer$d r4 = io.flutter.embedding.engine.renderer.FlutterRenderer.d.UNKNOWN
            r2.<init>(r1, r3, r4)
            r0.add(r2)
            goto Ld
        L92:
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r7 < r1) goto Ldb
            android.view.WindowInsets r7 = r6.getRootWindowInsets()
            if (r7 == 0) goto Ldb
            android.view.DisplayCutout r7 = K.u0.a(r7)
            if (r7 == 0) goto Ldb
            java.util.List r7 = Y1.y.a(r7)
            java.util.Iterator r7 = r7.iterator()
        Lac:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Ldb
            java.lang.Object r1 = r7.next()
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "DisplayCutout area reported with bounds = "
            r3.append(r4)
            java.lang.String r4 = r1.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            W1.b.f(r2, r3)
            io.flutter.embedding.engine.renderer.FlutterRenderer$c r3 = new io.flutter.embedding.engine.renderer.FlutterRenderer$c
            io.flutter.embedding.engine.renderer.FlutterRenderer$e r4 = io.flutter.embedding.engine.renderer.FlutterRenderer.e.CUTOUT
            r3.<init>(r1, r4)
            r0.add(r3)
            goto Lac
        Ldb:
            io.flutter.embedding.engine.renderer.FlutterRenderer$g r7 = r6.f2412w
            r7.f7611q = r0
            r6.B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.A.setWindowInfoListenerDisplayFeatures(z0.j):void");
    }

    public final int t(WindowInsets windowInsets) {
        if (windowInsets.getSystemWindowInsetBottom() < getRootView().getHeight() * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    public final void u() {
        W1.b.f("FlutterView", "Initializing FlutterView");
        if (this.f2394e != null) {
            W1.b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            addView(this.f2394e);
        } else if (this.f2395f != null) {
            W1.b.f("FlutterView", "Internally using a FlutterTextureView.");
            addView(this.f2395f);
        } else {
            W1.b.f("FlutterView", "Internally using a FlutterImageView.");
            addView(this.f2396g);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
    }

    public boolean v() {
        io.flutter.embedding.engine.a aVar = this.f2401l;
        return aVar != null && aVar.t() == this.f2397h.getAttachedRenderer();
    }

    public final void w() {
        r rVar = this.f2396g;
        if (rVar != null) {
            rVar.g();
            removeView(this.f2396g);
            this.f2396g = null;
        }
    }

    public void x(io.flutter.embedding.engine.renderer.j jVar) {
        this.f2399j.remove(jVar);
    }

    public final void y(boolean z3, boolean z4) {
        boolean z5 = false;
        if (this.f2401l.t().j()) {
            setWillNotDraw(false);
            return;
        }
        if (!z3 && !z4) {
            z5 = true;
        }
        setWillNotDraw(z5);
    }

    public void z(Runnable runnable) {
        if (this.f2396g == null) {
            W1.b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        io.flutter.embedding.engine.renderer.k kVar = this.f2398i;
        if (kVar == null) {
            W1.b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f2397h = kVar;
        this.f2398i = null;
        FlutterRenderer t3 = this.f2401l.t();
        if (this.f2401l != null && t3 != null) {
            this.f2397h.d();
            t3.g(new e(t3, runnable));
        } else {
            this.f2396g.c();
            w();
            runnable.run();
        }
    }

    public A(Context context, t tVar) {
        this(context, (AttributeSet) null, tVar);
    }

    public A(Context context, AttributeSet attributeSet, s sVar) {
        super(context, attributeSet);
        this.f2399j = new HashSet();
        this.f2402m = new HashSet();
        this.f2412w = new FlutterRenderer.g();
        this.f2413x = new a();
        this.f2414y = new b(new Handler(Looper.getMainLooper()));
        this.f2415z = new c();
        this.f2393A = new d();
        this.f2394e = sVar;
        this.f2397h = sVar;
        u();
    }

    public A(Context context, AttributeSet attributeSet, t tVar) {
        super(context, attributeSet);
        this.f2399j = new HashSet();
        this.f2402m = new HashSet();
        this.f2412w = new FlutterRenderer.g();
        this.f2413x = new a();
        this.f2414y = new b(new Handler(Looper.getMainLooper()));
        this.f2415z = new c();
        this.f2393A = new d();
        this.f2395f = tVar;
        this.f2397h = tVar;
        u();
    }

    public class e implements io.flutter.embedding.engine.renderer.j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FlutterRenderer f2420a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f2421b;

        public e(FlutterRenderer flutterRenderer, Runnable runnable) {
            this.f2420a = flutterRenderer;
            this.f2421b = runnable;
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void f() {
            this.f2420a.l(this);
            this.f2421b.run();
            A a3 = A.this;
            if ((a3.f2397h instanceof r) || a3.f2396g == null) {
                return;
            }
            A.this.f2396g.c();
            A.this.w();
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void b() {
        }
    }
}

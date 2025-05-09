package io.flutter.view;

import android.R;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import h2.C0490a;
import io.flutter.view.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o2.AbstractC0655f;
import o2.InterfaceC0653d;

/* loaded from: classes.dex */
public class f extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final View f7753a;

    /* renamed from: b, reason: collision with root package name */
    public final C0490a f7754b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f7755c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f7756d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.o f7757e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f7758f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f7759g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f7760h;

    /* renamed from: i, reason: collision with root package name */
    public l f7761i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f7762j;

    /* renamed from: k, reason: collision with root package name */
    public Integer f7763k;

    /* renamed from: l, reason: collision with root package name */
    public int f7764l;

    /* renamed from: m, reason: collision with root package name */
    public l f7765m;

    /* renamed from: n, reason: collision with root package name */
    public l f7766n;

    /* renamed from: o, reason: collision with root package name */
    public l f7767o;

    /* renamed from: p, reason: collision with root package name */
    public final List f7768p;

    /* renamed from: q, reason: collision with root package name */
    public int f7769q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f7770r;

    /* renamed from: s, reason: collision with root package name */
    public k f7771s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7772t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7773u;

    /* renamed from: v, reason: collision with root package name */
    public final C0490a.b f7774v;

    /* renamed from: w, reason: collision with root package name */
    public final AccessibilityManager.AccessibilityStateChangeListener f7775w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager.TouchExplorationStateChangeListener f7776x;

    /* renamed from: y, reason: collision with root package name */
    public final ContentObserver f7777y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f7752z = ((g.SCROLL_RIGHT.f7817e | g.SCROLL_LEFT.f7817e) | g.SCROLL_UP.f7817e) | g.SCROLL_DOWN.f7817e;

    /* renamed from: A, reason: collision with root package name */
    public static final int f7749A = ((((((((((i.HAS_CHECKED_STATE.f7852e | i.IS_CHECKED.f7852e) | i.IS_SELECTED.f7852e) | i.IS_TEXT_FIELD.f7852e) | i.IS_FOCUSED.f7852e) | i.HAS_ENABLED_STATE.f7852e) | i.IS_ENABLED.f7852e) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f7852e) | i.HAS_TOGGLED_STATE.f7852e) | i.IS_TOGGLED.f7852e) | i.IS_FOCUSABLE.f7852e) | i.IS_SLIDER.f7852e;

    /* renamed from: B, reason: collision with root package name */
    public static int f7750B = 267386881;

    /* renamed from: C, reason: collision with root package name */
    public static int f7751C = (g.DID_GAIN_ACCESSIBILITY_FOCUS.f7817e & g.DID_LOSE_ACCESSIBILITY_FOCUS.f7817e) & g.SHOW_ON_SCREEN.f7817e;

    public class a implements C0490a.b {
        public a() {
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            f.this.a0(byteBuffer, strArr, byteBufferArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void b(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            f.this.Z(byteBuffer, strArr);
        }

        @Override // h2.C0490a.b
        public void c(String str) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AccessibilityEvent F3 = f.this.F(0, 32);
            F3.getText().add(str);
            f.this.R(F3);
        }

        @Override // h2.C0490a.b
        public void d(int i3) {
            f.this.Q(i3, 8);
        }

        @Override // h2.C0490a.b
        public void e(int i3) {
            f.this.Q(i3, 2);
        }

        @Override // h2.C0490a.b
        public void f(String str) {
            f.this.f7753a.announceForAccessibility(str);
        }

        @Override // h2.C0490a.b
        public void g(int i3) {
            f.this.Q(i3, 1);
        }
    }

    public class b implements AccessibilityManager.AccessibilityStateChangeListener {
        public b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z3) {
            if (f.this.f7773u) {
                return;
            }
            if (z3) {
                f.this.f7754b.g(f.this.f7774v);
                f.this.f7754b.e();
            } else {
                f.this.V(false);
                f.this.f7754b.g(null);
                f.this.f7754b.d();
            }
            if (f.this.f7771s != null) {
                f.this.f7771s.a(z3, f.this.f7755c.isTouchExplorationEnabled());
            }
        }
    }

    public class c extends ContentObserver {
        public c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3) {
            onChange(z3, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3, Uri uri) {
            if (f.this.f7773u) {
                return;
            }
            if (Settings.Global.getFloat(f.this.f7758f, "transition_animation_scale", 1.0f) == 0.0f) {
                f.f(f.this, EnumC0130f.DISABLE_ANIMATIONS.f7792e);
            } else {
                f.e(f.this, ~EnumC0130f.DISABLE_ANIMATIONS.f7792e);
            }
            f.this.S();
        }
    }

    public class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AccessibilityManager f7781a;

        public d(AccessibilityManager accessibilityManager) {
            this.f7781a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z3) {
            if (f.this.f7773u) {
                return;
            }
            if (!z3) {
                f.this.V(false);
                f.this.K();
            }
            if (f.this.f7771s != null) {
                f.this.f7771s.a(this.f7781a.isEnabled(), z3);
            }
        }
    }

    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7783a;

        static {
            int[] iArr = new int[o.values().length];
            f7783a = iArr;
            try {
                iArr[o.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7783a[o.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: io.flutter.view.f$f, reason: collision with other inner class name */
    public enum EnumC0130f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);


        /* renamed from: e, reason: collision with root package name */
        public final int f7792e;

        EnumC0130f(int i3) {
            this.f7792e = i3;
        }
    }

    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152),
        FOCUS(4194304);


        /* renamed from: e, reason: collision with root package name */
        public final int f7817e;

        g(int i3) {
            this.f7817e = i3;
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public int f7818a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f7819b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f7820c = -1;

        /* renamed from: d, reason: collision with root package name */
        public String f7821d;

        /* renamed from: e, reason: collision with root package name */
        public String f7822e;
    }

    public enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728);


        /* renamed from: e, reason: collision with root package name */
        public final int f7852e;

        i(int i3) {
            this.f7852e = i3;
        }
    }

    public static class j extends n {

        /* renamed from: d, reason: collision with root package name */
        public String f7853d;

        public j() {
            super(null);
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    public interface k {
        void a(boolean z3, boolean z4);
    }

    public static class l {

        /* renamed from: B, reason: collision with root package name */
        public p f7855B;

        /* renamed from: D, reason: collision with root package name */
        public int f7857D;

        /* renamed from: E, reason: collision with root package name */
        public int f7858E;

        /* renamed from: F, reason: collision with root package name */
        public int f7859F;

        /* renamed from: G, reason: collision with root package name */
        public int f7860G;

        /* renamed from: H, reason: collision with root package name */
        public float f7861H;

        /* renamed from: I, reason: collision with root package name */
        public float f7862I;

        /* renamed from: J, reason: collision with root package name */
        public float f7863J;

        /* renamed from: K, reason: collision with root package name */
        public String f7864K;

        /* renamed from: L, reason: collision with root package name */
        public String f7865L;

        /* renamed from: M, reason: collision with root package name */
        public float f7866M;

        /* renamed from: N, reason: collision with root package name */
        public float f7867N;

        /* renamed from: O, reason: collision with root package name */
        public float f7868O;

        /* renamed from: P, reason: collision with root package name */
        public float f7869P;

        /* renamed from: Q, reason: collision with root package name */
        public float[] f7870Q;

        /* renamed from: R, reason: collision with root package name */
        public l f7871R;

        /* renamed from: U, reason: collision with root package name */
        public List f7874U;

        /* renamed from: V, reason: collision with root package name */
        public h f7875V;

        /* renamed from: W, reason: collision with root package name */
        public h f7876W;

        /* renamed from: Y, reason: collision with root package name */
        public float[] f7878Y;

        /* renamed from: a, reason: collision with root package name */
        public final f f7880a;

        /* renamed from: a0, reason: collision with root package name */
        public float[] f7881a0;

        /* renamed from: b0, reason: collision with root package name */
        public Rect f7883b0;

        /* renamed from: c, reason: collision with root package name */
        public int f7884c;

        /* renamed from: d, reason: collision with root package name */
        public int f7885d;

        /* renamed from: e, reason: collision with root package name */
        public int f7886e;

        /* renamed from: f, reason: collision with root package name */
        public int f7887f;

        /* renamed from: g, reason: collision with root package name */
        public int f7888g;

        /* renamed from: h, reason: collision with root package name */
        public int f7889h;

        /* renamed from: i, reason: collision with root package name */
        public int f7890i;

        /* renamed from: j, reason: collision with root package name */
        public int f7891j;

        /* renamed from: k, reason: collision with root package name */
        public int f7892k;

        /* renamed from: l, reason: collision with root package name */
        public float f7893l;

        /* renamed from: m, reason: collision with root package name */
        public float f7894m;

        /* renamed from: n, reason: collision with root package name */
        public float f7895n;

        /* renamed from: o, reason: collision with root package name */
        public String f7896o;

        /* renamed from: p, reason: collision with root package name */
        public String f7897p;

        /* renamed from: q, reason: collision with root package name */
        public List f7898q;

        /* renamed from: r, reason: collision with root package name */
        public String f7899r;

        /* renamed from: s, reason: collision with root package name */
        public List f7900s;

        /* renamed from: t, reason: collision with root package name */
        public String f7901t;

        /* renamed from: u, reason: collision with root package name */
        public List f7902u;

        /* renamed from: v, reason: collision with root package name */
        public String f7903v;

        /* renamed from: w, reason: collision with root package name */
        public List f7904w;

        /* renamed from: x, reason: collision with root package name */
        public String f7905x;

        /* renamed from: y, reason: collision with root package name */
        public List f7906y;

        /* renamed from: z, reason: collision with root package name */
        public String f7907z;

        /* renamed from: b, reason: collision with root package name */
        public int f7882b = -1;

        /* renamed from: A, reason: collision with root package name */
        public int f7854A = -1;

        /* renamed from: C, reason: collision with root package name */
        public boolean f7856C = false;

        /* renamed from: S, reason: collision with root package name */
        public List f7872S = new ArrayList();

        /* renamed from: T, reason: collision with root package name */
        public List f7873T = new ArrayList();

        /* renamed from: X, reason: collision with root package name */
        public boolean f7877X = true;

        /* renamed from: Z, reason: collision with root package name */
        public boolean f7879Z = true;

        public l(f fVar) {
            this.f7880a = fVar;
        }

        public static boolean C0(l lVar, InterfaceC0653d interfaceC0653d) {
            return (lVar == null || lVar.l0(interfaceC0653d) == null) ? false : true;
        }

        public static /* synthetic */ int n(l lVar, int i3) {
            int i4 = lVar.f7889h + i3;
            lVar.f7889h = i4;
            return i4;
        }

        public static /* synthetic */ int o(l lVar, int i3) {
            int i4 = lVar.f7889h - i3;
            lVar.f7889h = i4;
            return i4;
        }

        public final float A0(float f3, float f4, float f5, float f6) {
            return Math.max(f3, Math.max(f4, Math.max(f5, f6)));
        }

        public final float B0(float f3, float f4, float f5, float f6) {
            return Math.min(f3, Math.min(f4, Math.min(f5, f6)));
        }

        public final void D0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f3 = fArr[3];
            fArr[0] = fArr[0] / f3;
            fArr[1] = fArr[1] / f3;
            fArr[2] = fArr[2] / f3;
            fArr[3] = 0.0f;
        }

        public final void E0(float[] fArr, Set set, boolean z3) {
            set.add(this);
            if (this.f7879Z) {
                z3 = true;
            }
            if (z3) {
                if (this.f7881a0 == null) {
                    this.f7881a0 = new float[16];
                }
                if (this.f7870Q == null) {
                    this.f7870Q = new float[16];
                }
                Matrix.multiplyMM(this.f7881a0, 0, fArr, 0, this.f7870Q, 0);
                float[] fArr2 = {this.f7866M, this.f7867N, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                D0(fArr3, this.f7881a0, fArr2);
                fArr2[0] = this.f7868O;
                fArr2[1] = this.f7867N;
                D0(fArr4, this.f7881a0, fArr2);
                fArr2[0] = this.f7868O;
                fArr2[1] = this.f7869P;
                D0(fArr5, this.f7881a0, fArr2);
                fArr2[0] = this.f7866M;
                fArr2[1] = this.f7869P;
                D0(fArr6, this.f7881a0, fArr2);
                if (this.f7883b0 == null) {
                    this.f7883b0 = new Rect();
                }
                this.f7883b0.set(Math.round(B0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(B0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(A0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(A0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.f7879Z = false;
            }
            int i3 = -1;
            for (l lVar : this.f7872S) {
                lVar.f7854A = i3;
                i3 = lVar.f7882b;
                lVar.E0(this.f7881a0, set, z3);
            }
        }

        public final void F0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.f7856C = true;
            this.f7864K = this.f7899r;
            this.f7865L = this.f7897p;
            this.f7857D = this.f7884c;
            this.f7858E = this.f7885d;
            this.f7859F = this.f7888g;
            this.f7860G = this.f7889h;
            this.f7861H = this.f7893l;
            this.f7862I = this.f7894m;
            this.f7863J = this.f7895n;
            this.f7884c = byteBuffer.getInt();
            this.f7885d = byteBuffer.getInt();
            this.f7886e = byteBuffer.getInt();
            this.f7887f = byteBuffer.getInt();
            this.f7888g = byteBuffer.getInt();
            this.f7889h = byteBuffer.getInt();
            this.f7890i = byteBuffer.getInt();
            this.f7891j = byteBuffer.getInt();
            this.f7892k = byteBuffer.getInt();
            this.f7893l = byteBuffer.getFloat();
            this.f7894m = byteBuffer.getFloat();
            this.f7895n = byteBuffer.getFloat();
            int i3 = byteBuffer.getInt();
            this.f7896o = i3 == -1 ? null : strArr[i3];
            int i4 = byteBuffer.getInt();
            this.f7897p = i4 == -1 ? null : strArr[i4];
            this.f7898q = q0(byteBuffer, byteBufferArr);
            int i5 = byteBuffer.getInt();
            this.f7899r = i5 == -1 ? null : strArr[i5];
            this.f7900s = q0(byteBuffer, byteBufferArr);
            int i6 = byteBuffer.getInt();
            this.f7901t = i6 == -1 ? null : strArr[i6];
            this.f7902u = q0(byteBuffer, byteBufferArr);
            int i7 = byteBuffer.getInt();
            this.f7903v = i7 == -1 ? null : strArr[i7];
            this.f7904w = q0(byteBuffer, byteBufferArr);
            int i8 = byteBuffer.getInt();
            this.f7905x = i8 == -1 ? null : strArr[i8];
            this.f7906y = q0(byteBuffer, byteBufferArr);
            int i9 = byteBuffer.getInt();
            this.f7907z = i9 == -1 ? null : strArr[i9];
            this.f7855B = p.f(byteBuffer.getInt());
            this.f7866M = byteBuffer.getFloat();
            this.f7867N = byteBuffer.getFloat();
            this.f7868O = byteBuffer.getFloat();
            this.f7869P = byteBuffer.getFloat();
            if (this.f7870Q == null) {
                this.f7870Q = new float[16];
            }
            for (int i10 = 0; i10 < 16; i10++) {
                this.f7870Q[i10] = byteBuffer.getFloat();
            }
            this.f7877X = true;
            this.f7879Z = true;
            int i11 = byteBuffer.getInt();
            this.f7872S.clear();
            this.f7873T.clear();
            for (int i12 = 0; i12 < i11; i12++) {
                l y3 = this.f7880a.y(byteBuffer.getInt());
                y3.f7871R = this;
                this.f7872S.add(y3);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                l y4 = this.f7880a.y(byteBuffer.getInt());
                y4.f7871R = this;
                this.f7873T.add(y4);
            }
            int i14 = byteBuffer.getInt();
            if (i14 == 0) {
                this.f7874U = null;
                return;
            }
            List list = this.f7874U;
            if (list == null) {
                this.f7874U = new ArrayList(i14);
            } else {
                list.clear();
            }
            for (int i15 = 0; i15 < i14; i15++) {
                h x3 = this.f7880a.x(byteBuffer.getInt());
                if (x3.f7820c == g.TAP.f7817e) {
                    this.f7875V = x3;
                } else if (x3.f7820c == g.LONG_PRESS.f7817e) {
                    this.f7876W = x3;
                } else {
                    this.f7874U.add(x3);
                }
                this.f7874U.add(x3);
            }
        }

        public final void g0(List list) {
            if (x0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            Iterator it = this.f7872S.iterator();
            while (it.hasNext()) {
                ((l) it.next()).g0(list);
            }
        }

        public final SpannableString h0(String str, List list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    int i3 = e.f7783a[nVar.f7910c.ordinal()];
                    if (i3 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.f7908a, nVar.f7909b, 0);
                    } else if (i3 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) nVar).f7853d)), nVar.f7908a, nVar.f7909b, 0);
                    }
                }
            }
            return spannableString;
        }

        public final boolean i0() {
            String str;
            String str2 = this.f7897p;
            if (str2 == null && this.f7865L == null) {
                return false;
            }
            return str2 == null || (str = this.f7865L) == null || !str2.equals(str);
        }

        public final boolean j0() {
            return (Float.isNaN(this.f7893l) || Float.isNaN(this.f7861H) || this.f7861H == this.f7893l) ? false : true;
        }

        public final void k0() {
            if (this.f7877X) {
                this.f7877X = false;
                if (this.f7878Y == null) {
                    this.f7878Y = new float[16];
                }
                if (Matrix.invertM(this.f7878Y, 0, this.f7870Q, 0)) {
                    return;
                }
                Arrays.fill(this.f7878Y, 0.0f);
            }
        }

        public final l l0(InterfaceC0653d interfaceC0653d) {
            for (l lVar = this.f7871R; lVar != null; lVar = lVar.f7871R) {
                if (interfaceC0653d.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        public final Rect m0() {
            return this.f7883b0;
        }

        public final CharSequence n0() {
            return h0(this.f7905x, this.f7906y);
        }

        public final CharSequence o0() {
            return h0(this.f7897p, this.f7898q);
        }

        public final String p0() {
            String str;
            if (x0(i.NAMES_ROUTE) && (str = this.f7897p) != null && !str.isEmpty()) {
                return this.f7897p;
            }
            Iterator it = this.f7872S.iterator();
            while (it.hasNext()) {
                String p02 = ((l) it.next()).p0();
                if (p02 != null && !p02.isEmpty()) {
                    return p02;
                }
            }
            return null;
        }

        public final List q0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i3 = byteBuffer.getInt();
            a aVar = null;
            if (i3 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = byteBuffer.getInt();
                int i6 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i7 = e.f7783a[oVar.ordinal()];
                if (i7 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m(aVar);
                    mVar.f7908a = i5;
                    mVar.f7909b = i6;
                    mVar.f7910c = oVar;
                    arrayList.add(mVar);
                } else if (i7 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j(aVar);
                    jVar.f7908a = i5;
                    jVar.f7909b = i6;
                    jVar.f7910c = oVar;
                    jVar.f7853d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        public final CharSequence r0() {
            CharSequence[] charSequenceArr = {o0(), n0()};
            CharSequence charSequence = null;
            for (int i3 = 0; i3 < 2; i3++) {
                CharSequence charSequence2 = charSequenceArr[i3];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        public final CharSequence s0() {
            return h0(this.f7899r, this.f7900s);
        }

        public final CharSequence t0() {
            CharSequence[] charSequenceArr = {s0(), o0(), n0()};
            CharSequence charSequence = null;
            for (int i3 = 0; i3 < 3; i3++) {
                CharSequence charSequence2 = charSequenceArr[i3];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        public final boolean u0(g gVar) {
            return (gVar.f7817e & this.f7858E) != 0;
        }

        public final boolean v0(i iVar) {
            return (iVar.f7852e & this.f7857D) != 0;
        }

        public final boolean w0(g gVar) {
            return (gVar.f7817e & this.f7885d) != 0;
        }

        public final boolean x0(i iVar) {
            return (iVar.f7852e & this.f7884c) != 0;
        }

        public final l y0(float[] fArr, boolean z3) {
            float f3 = fArr[3];
            boolean z4 = false;
            float f4 = fArr[0] / f3;
            float f5 = fArr[1] / f3;
            if (f4 < this.f7866M || f4 >= this.f7868O || f5 < this.f7867N || f5 >= this.f7869P) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l lVar : this.f7873T) {
                if (!lVar.x0(i.IS_HIDDEN)) {
                    lVar.k0();
                    float[] fArr3 = fArr;
                    Matrix.multiplyMV(fArr2, 0, lVar.f7878Y, 0, fArr3, 0);
                    l y02 = lVar.y0(fArr2, z3);
                    if (y02 != null) {
                        return y02;
                    }
                    fArr = fArr3;
                }
            }
            if (z3 && this.f7890i != -1) {
                z4 = true;
            }
            if (z0() || z4) {
                return this;
            }
            return null;
        }

        public final boolean z0() {
            String str;
            String str2;
            String str3;
            if (x0(i.SCOPES_ROUTE)) {
                return false;
            }
            return (!x0(i.IS_FOCUSABLE) && (this.f7885d & (~f.f7752z)) == 0 && (this.f7884c & f.f7749A) == 0 && ((str = this.f7897p) == null || str.isEmpty()) && (((str2 = this.f7899r) == null || str2.isEmpty()) && ((str3 = this.f7905x) == null || str3.isEmpty()))) ? false : true;
        }
    }

    public static class m extends n {
        public m() {
            super(null);
        }

        public /* synthetic */ m(a aVar) {
            this();
        }
    }

    public static class n {

        /* renamed from: a, reason: collision with root package name */
        public int f7908a;

        /* renamed from: b, reason: collision with root package name */
        public int f7909b;

        /* renamed from: c, reason: collision with root package name */
        public o f7910c;

        public n() {
        }

        public /* synthetic */ n(a aVar) {
            this();
        }
    }

    public enum o {
        SPELLOUT,
        LOCALE
    }

    public enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p f(int i3) {
            return i3 != 1 ? i3 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public f(View view, C0490a c0490a, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.o oVar) {
        this(view, c0490a, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), oVar);
    }

    public static /* synthetic */ boolean a(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    public static /* synthetic */ int e(f fVar, int i3) {
        int i4 = i3 & fVar.f7764l;
        fVar.f7764l = i4;
        return i4;
    }

    public static /* synthetic */ int f(f fVar, int i3) {
        int i4 = i3 | fVar.f7764l;
        fVar.f7764l = i4;
        return i4;
    }

    public final void A(float f3, float f4, boolean z3) {
        l y02;
        if (this.f7759g.isEmpty() || (y02 = z().y0(new float[]{f3, f4, 0.0f, 1.0f}, z3)) == this.f7767o) {
            return;
        }
        if (y02 != null) {
            Q(y02.f7882b, 128);
        }
        l lVar = this.f7767o;
        if (lVar != null) {
            Q(lVar.f7882b, 256);
        }
        this.f7767o = y02;
    }

    public boolean B() {
        return this.f7755c.isEnabled();
    }

    public final boolean C(l lVar) {
        if (lVar.x0(i.SCOPES_ROUTE)) {
            return false;
        }
        return (lVar.t0() == null && (lVar.f7885d & (~f7751C)) == 0) ? false : true;
    }

    public boolean D() {
        return this.f7755c.isTouchExplorationEnabled();
    }

    public AccessibilityEvent E(int i3) {
        return AccessibilityEvent.obtain(i3);
    }

    public final AccessibilityEvent F(int i3, int i4) {
        AccessibilityEvent E3 = E(i4);
        E3.setPackageName(this.f7753a.getContext().getPackageName());
        E3.setSource(this.f7753a, i3);
        return E3;
    }

    public AccessibilityNodeInfo G(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    public AccessibilityNodeInfo H(View view, int i3) {
        return AccessibilityNodeInfo.obtain(view, i3);
    }

    public boolean I(MotionEvent motionEvent) {
        return J(motionEvent, false);
    }

    public boolean J(MotionEvent motionEvent, boolean z3) {
        if (!this.f7755c.isTouchExplorationEnabled() || this.f7759g.isEmpty()) {
            return false;
        }
        l y02 = z().y0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z3);
        if (y02 != null && y02.f7890i != -1) {
            if (z3) {
                return false;
            }
            return this.f7756d.onAccessibilityHoverEvent(y02.f7882b, motionEvent);
        }
        if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
            A(motionEvent.getX(), motionEvent.getY(), z3);
        } else {
            if (motionEvent.getAction() != 10) {
                W1.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            K();
        }
        return true;
    }

    public final void K() {
        l lVar = this.f7767o;
        if (lVar != null) {
            Q(lVar.f7882b, 256);
            this.f7767o = null;
        }
    }

    public final void L(l lVar) {
        String p02 = lVar.p0();
        if (p02 == null) {
            p02 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            U(p02);
            return;
        }
        AccessibilityEvent F3 = F(lVar.f7882b, 32);
        F3.getText().add(p02);
        R(F3);
    }

    public final boolean M(l lVar, int i3, Bundle bundle, boolean z3) {
        int i4 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z4 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i5 = lVar.f7888g;
        int i6 = lVar.f7889h;
        O(lVar, i4, z3, z4);
        if (i5 != lVar.f7888g || i6 != lVar.f7889h) {
            String str = lVar.f7899r != null ? lVar.f7899r : "";
            AccessibilityEvent F3 = F(lVar.f7882b, 8192);
            F3.getText().add(str);
            F3.setFromIndex(lVar.f7888g);
            F3.setToIndex(lVar.f7889h);
            F3.setItemCount(str.length());
            R(F3);
        }
        if (i4 == 1) {
            if (z3) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.w0(gVar)) {
                    this.f7754b.c(i3, gVar, Boolean.valueOf(z4));
                    return true;
                }
            }
            if (z3) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.w0(gVar2)) {
                return false;
            }
            this.f7754b.c(i3, gVar2, Boolean.valueOf(z4));
            return true;
        }
        if (i4 != 2) {
            return i4 == 4 || i4 == 8 || i4 == 16;
        }
        if (z3) {
            g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
            if (lVar.w0(gVar3)) {
                this.f7754b.c(i3, gVar3, Boolean.valueOf(z4));
                return true;
            }
        }
        if (z3) {
            return false;
        }
        g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
        if (!lVar.w0(gVar4)) {
            return false;
        }
        this.f7754b.c(i3, gVar4, Boolean.valueOf(z4));
        return true;
    }

    public final boolean N(l lVar, int i3, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f7754b.c(i3, g.SET_TEXT, string);
        lVar.f7899r = string;
        lVar.f7900s = null;
        return true;
    }

    public final void O(l lVar, int i3, boolean z3, boolean z4) {
        if (lVar.f7889h < 0 || lVar.f7888g < 0) {
            return;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 == 8 || i3 == 16) {
                        if (z3) {
                            lVar.f7889h = lVar.f7899r.length();
                        } else {
                            lVar.f7889h = 0;
                        }
                    }
                } else if (z3 && lVar.f7889h < lVar.f7899r.length()) {
                    Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(lVar.f7899r.substring(lVar.f7889h));
                    if (matcher.find()) {
                        l.n(lVar, matcher.start(1));
                    } else {
                        lVar.f7889h = lVar.f7899r.length();
                    }
                } else if (!z3 && lVar.f7889h > 0) {
                    Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(lVar.f7899r.substring(0, lVar.f7889h));
                    if (matcher2.find()) {
                        lVar.f7889h = matcher2.start(1);
                    } else {
                        lVar.f7889h = 0;
                    }
                }
            } else if (z3 && lVar.f7889h < lVar.f7899r.length()) {
                Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(lVar.f7899r.substring(lVar.f7889h));
                matcher3.find();
                if (matcher3.find()) {
                    l.n(lVar, matcher3.start(1));
                } else {
                    lVar.f7889h = lVar.f7899r.length();
                }
            } else if (!z3 && lVar.f7889h > 0) {
                Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(lVar.f7899r.substring(0, lVar.f7889h));
                if (matcher4.find()) {
                    lVar.f7889h = matcher4.start(1);
                }
            }
        } else if (z3 && lVar.f7889h < lVar.f7899r.length()) {
            l.n(lVar, 1);
        } else if (!z3 && lVar.f7889h > 0) {
            l.o(lVar, 1);
        }
        if (z4) {
            return;
        }
        lVar.f7888g = lVar.f7889h;
    }

    public void P() {
        this.f7773u = true;
        this.f7757e.a();
        X(null);
        this.f7755c.removeAccessibilityStateChangeListener(this.f7775w);
        this.f7755c.removeTouchExplorationStateChangeListener(this.f7776x);
        this.f7758f.unregisterContentObserver(this.f7777y);
        this.f7754b.g(null);
    }

    public void Q(int i3, int i4) {
        if (this.f7755c.isEnabled()) {
            R(F(i3, i4));
        }
    }

    public final void R(AccessibilityEvent accessibilityEvent) {
        if (this.f7755c.isEnabled()) {
            this.f7753a.getParent().requestSendAccessibilityEvent(this.f7753a, accessibilityEvent);
        }
    }

    public final void S() {
        this.f7754b.f(this.f7764l);
    }

    public final void T(int i3) {
        AccessibilityEvent F3 = F(i3, 2048);
        F3.setContentChangeTypes(1);
        R(F3);
    }

    public final void U(String str) {
        this.f7753a.setAccessibilityPaneTitle(str);
    }

    public final void V(boolean z3) {
        if (this.f7772t == z3) {
            return;
        }
        this.f7772t = z3;
        if (z3) {
            this.f7764l |= EnumC0130f.ACCESSIBLE_NAVIGATION.f7792e;
        } else {
            this.f7764l &= ~EnumC0130f.ACCESSIBLE_NAVIGATION.f7792e;
        }
        S();
    }

    public final void W() {
        int i3;
        View view = this.f7753a;
        if (view == null || view.getResources() == null) {
            return;
        }
        i3 = this.f7753a.getResources().getConfiguration().fontWeightAdjustment;
        if (i3 == Integer.MAX_VALUE || i3 < 300) {
            this.f7764l &= ~EnumC0130f.BOLD_TEXT.f7792e;
        } else {
            this.f7764l |= EnumC0130f.BOLD_TEXT.f7792e;
        }
        S();
    }

    public void X(k kVar) {
        this.f7771s = kVar;
    }

    public final boolean Y(final l lVar) {
        if (lVar.f7891j > 0) {
            return l.C0(this.f7761i, new InterfaceC0653d() { // from class: io.flutter.view.d
                @Override // o2.InterfaceC0653d
                public final boolean test(Object obj) {
                    return f.a(f.l.this, (f.l) obj);
                }
            }) || !l.C0(this.f7761i, new InterfaceC0653d() { // from class: io.flutter.view.e
                @Override // o2.InterfaceC0653d
                public final boolean test(Object obj) {
                    boolean x02;
                    x02 = ((f.l) obj).x0(f.i.HAS_IMPLICIT_SCROLLING);
                    return x02;
                }
            });
        }
        return false;
    }

    public void Z(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h x3 = x(byteBuffer.getInt());
            x3.f7820c = byteBuffer.getInt();
            int i3 = byteBuffer.getInt();
            String str = null;
            x3.f7821d = i3 == -1 ? null : strArr[i3];
            int i4 = byteBuffer.getInt();
            if (i4 != -1) {
                str = strArr[i4];
            }
            x3.f7822e = str;
        }
    }

    public void a0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        l lVar;
        l lVar2;
        float f3;
        float f4;
        WindowInsets rootWindowInsets;
        View d3;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            l y3 = y(byteBuffer.getInt());
            y3.F0(byteBuffer, strArr, byteBufferArr);
            if (!y3.x0(i.IS_HIDDEN)) {
                if (y3.x0(i.IS_FOCUSED)) {
                    this.f7765m = y3;
                }
                if (y3.f7856C) {
                    arrayList.add(y3);
                }
                if (y3.f7890i != -1 && !this.f7757e.c(y3.f7890i) && (d3 = this.f7757e.d(y3.f7890i)) != null) {
                    d3.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        l z3 = z();
        ArrayList<l> arrayList2 = new ArrayList();
        if (z3 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if ((Build.VERSION.SDK_INT >= 28 ? v() : true) && (rootWindowInsets = this.f7753a.getRootWindowInsets()) != null) {
                if (!this.f7770r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    z3.f7879Z = true;
                    z3.f7877X = true;
                }
                this.f7770r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                Matrix.translateM(fArr, 0, r4.intValue(), 0.0f, 0.0f);
            }
            z3.E0(fArr, hashSet, false);
            z3.g0(arrayList2);
        }
        l lVar3 = null;
        for (l lVar4 : arrayList2) {
            if (!this.f7768p.contains(Integer.valueOf(lVar4.f7882b))) {
                lVar3 = lVar4;
            }
        }
        if (lVar3 == null && arrayList2.size() > 0) {
            lVar3 = (l) arrayList2.get(arrayList2.size() - 1);
        }
        if (lVar3 != null && (lVar3.f7882b != this.f7769q || arrayList2.size() != this.f7768p.size())) {
            this.f7769q = lVar3.f7882b;
            L(lVar3);
        }
        this.f7768p.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.f7768p.add(Integer.valueOf(((l) it.next()).f7882b));
        }
        Iterator it2 = this.f7759g.entrySet().iterator();
        while (it2.hasNext()) {
            l lVar5 = (l) ((Map.Entry) it2.next()).getValue();
            if (!hashSet.contains(lVar5)) {
                b0(lVar5);
                it2.remove();
            }
        }
        T(0);
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            l lVar6 = (l) it3.next();
            if (lVar6.j0()) {
                AccessibilityEvent F3 = F(lVar6.f7882b, 4096);
                float f5 = lVar6.f7893l;
                float f6 = lVar6.f7894m;
                if (Float.isInfinite(lVar6.f7894m)) {
                    if (f5 > 70000.0f) {
                        f5 = 70000.0f;
                    }
                    f6 = 100000.0f;
                }
                if (Float.isInfinite(lVar6.f7895n)) {
                    f3 = f6 + 100000.0f;
                    if (f5 < -70000.0f) {
                        f5 = -70000.0f;
                    }
                    f4 = f5 + 100000.0f;
                } else {
                    f3 = f6 - lVar6.f7895n;
                    f4 = f5 - lVar6.f7895n;
                }
                if (lVar6.u0(g.SCROLL_UP) || lVar6.u0(g.SCROLL_DOWN)) {
                    F3.setScrollY((int) f4);
                    F3.setMaxScrollY((int) f3);
                } else if (lVar6.u0(g.SCROLL_LEFT) || lVar6.u0(g.SCROLL_RIGHT)) {
                    F3.setScrollX((int) f4);
                    F3.setMaxScrollX((int) f3);
                }
                if (lVar6.f7891j > 0) {
                    F3.setItemCount(lVar6.f7891j);
                    F3.setFromIndex(lVar6.f7892k);
                    Iterator it4 = lVar6.f7873T.iterator();
                    int i3 = 0;
                    while (it4.hasNext()) {
                        if (!((l) it4.next()).x0(i.IS_HIDDEN)) {
                            i3++;
                        }
                    }
                    F3.setToIndex((lVar6.f7892k + i3) - 1);
                }
                R(F3);
            }
            if (lVar6.x0(i.IS_LIVE_REGION) && lVar6.i0()) {
                T(lVar6.f7882b);
            }
            l lVar7 = this.f7761i;
            if (lVar7 != null && lVar7.f7882b == lVar6.f7882b) {
                i iVar = i.IS_SELECTED;
                if (!lVar6.v0(iVar) && lVar6.x0(iVar)) {
                    AccessibilityEvent F4 = F(lVar6.f7882b, 4);
                    F4.getText().add(lVar6.f7897p);
                    R(F4);
                }
            }
            l lVar8 = this.f7765m;
            if (lVar8 != null && lVar8.f7882b == lVar6.f7882b && ((lVar2 = this.f7766n) == null || lVar2.f7882b != this.f7765m.f7882b)) {
                this.f7766n = this.f7765m;
                R(F(lVar6.f7882b, 8));
            } else if (this.f7765m == null) {
                this.f7766n = null;
            }
            l lVar9 = this.f7765m;
            if (lVar9 != null && lVar9.f7882b == lVar6.f7882b) {
                i iVar2 = i.IS_TEXT_FIELD;
                if (lVar6.v0(iVar2) && lVar6.x0(iVar2) && ((lVar = this.f7761i) == null || lVar.f7882b == this.f7765m.f7882b)) {
                    String str = lVar6.f7864K != null ? lVar6.f7864K : "";
                    String str2 = lVar6.f7899r != null ? lVar6.f7899r : "";
                    AccessibilityEvent u3 = u(lVar6.f7882b, str, str2);
                    if (u3 != null) {
                        R(u3);
                    }
                    if (lVar6.f7859F != lVar6.f7888g || lVar6.f7860G != lVar6.f7889h) {
                        AccessibilityEvent F5 = F(lVar6.f7882b, 8192);
                        F5.getText().add(str2);
                        F5.setFromIndex(lVar6.f7888g);
                        F5.setToIndex(lVar6.f7889h);
                        F5.setItemCount(str2.length());
                        R(F5);
                    }
                }
            }
        }
    }

    public final void b0(l lVar) {
        View d3;
        Integer num;
        lVar.f7871R = null;
        if (lVar.f7890i != -1 && (num = this.f7762j) != null && this.f7756d.platformViewOfNode(num.intValue()) == this.f7757e.d(lVar.f7890i)) {
            Q(this.f7762j.intValue(), 65536);
            this.f7762j = null;
        }
        if (lVar.f7890i != -1 && (d3 = this.f7757e.d(lVar.f7890i)) != null) {
            d3.setImportantForAccessibility(4);
        }
        l lVar2 = this.f7761i;
        if (lVar2 == lVar) {
            Q(lVar2.f7882b, 65536);
            this.f7761i = null;
        }
        if (this.f7765m == lVar) {
            this.f7765m = null;
        }
        if (this.f7767o == lVar) {
            this.f7767o = null;
        }
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        int i4;
        boolean z3 = true;
        V(true);
        if (i3 >= 65536) {
            return this.f7756d.createAccessibilityNodeInfo(i3);
        }
        if (i3 == -1) {
            AccessibilityNodeInfo G3 = G(this.f7753a);
            this.f7753a.onInitializeAccessibilityNodeInfo(G3);
            if (this.f7759g.containsKey(0)) {
                G3.addChild(this.f7753a, 0);
            }
            G3.setImportantForAccessibility(false);
            return G3;
        }
        l lVar = (l) this.f7759g.get(Integer.valueOf(i3));
        if (lVar == null) {
            return null;
        }
        if (lVar.f7890i != -1 && this.f7757e.c(lVar.f7890i)) {
            View d3 = this.f7757e.d(lVar.f7890i);
            if (d3 == null) {
                return null;
            }
            return this.f7756d.getRootNode(d3, lVar.f7882b, lVar.m0());
        }
        AccessibilityNodeInfo H3 = H(this.f7753a, i3);
        int i5 = Build.VERSION.SDK_INT;
        H3.setImportantForAccessibility(C(lVar));
        H3.setViewIdResourceName("");
        if (lVar.f7896o != null) {
            H3.setViewIdResourceName(lVar.f7896o);
        }
        H3.setPackageName(this.f7753a.getContext().getPackageName());
        H3.setClassName("android.view.View");
        H3.setSource(this.f7753a, i3);
        H3.setFocusable(lVar.z0());
        l lVar2 = this.f7765m;
        if (lVar2 != null) {
            H3.setFocused(lVar2.f7882b == i3);
        }
        l lVar3 = this.f7761i;
        if (lVar3 != null) {
            H3.setAccessibilityFocused(lVar3.f7882b == i3);
        }
        i iVar = i.IS_TEXT_FIELD;
        if (lVar.x0(iVar)) {
            H3.setPassword(lVar.x0(i.IS_OBSCURED));
            if (!lVar.x0(i.IS_READ_ONLY)) {
                H3.setClassName("android.widget.EditText");
            }
            H3.setEditable(!lVar.x0(r9));
            if (lVar.f7888g != -1 && lVar.f7889h != -1) {
                H3.setTextSelection(lVar.f7888g, lVar.f7889h);
            }
            l lVar4 = this.f7761i;
            if (lVar4 != null && lVar4.f7882b == i3) {
                H3.setLiveRegion(1);
            }
            if (lVar.w0(g.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                H3.addAction(256);
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (lVar.w0(g.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                H3.addAction(512);
                i4 = 1;
            }
            if (lVar.w0(g.MOVE_CURSOR_FORWARD_BY_WORD)) {
                H3.addAction(256);
                i4 |= 2;
            }
            if (lVar.w0(g.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                H3.addAction(512);
                i4 |= 2;
            }
            H3.setMovementGranularities(i4);
            if (lVar.f7886e >= 0) {
                int length = lVar.f7899r == null ? 0 : lVar.f7899r.length();
                int unused = lVar.f7887f;
                int unused2 = lVar.f7886e;
                H3.setMaxTextLength((length - lVar.f7887f) + lVar.f7886e);
            }
        }
        if (lVar.w0(g.SET_SELECTION)) {
            H3.addAction(131072);
        }
        if (lVar.w0(g.COPY)) {
            H3.addAction(16384);
        }
        if (lVar.w0(g.CUT)) {
            H3.addAction(65536);
        }
        if (lVar.w0(g.PASTE)) {
            H3.addAction(32768);
        }
        if (lVar.w0(g.SET_TEXT)) {
            H3.addAction(2097152);
        }
        if (lVar.x0(i.IS_BUTTON) || lVar.x0(i.IS_LINK)) {
            H3.setClassName("android.widget.Button");
        }
        if (lVar.x0(i.IS_IMAGE)) {
            H3.setClassName("android.widget.ImageView");
        }
        if (lVar.w0(g.DISMISS)) {
            H3.setDismissable(true);
            H3.addAction(1048576);
        }
        if (lVar.f7871R != null) {
            H3.setParent(this.f7753a, lVar.f7871R.f7882b);
        } else {
            H3.setParent(this.f7753a);
        }
        if (lVar.f7854A != -1) {
            H3.setTraversalAfter(this.f7753a, lVar.f7854A);
        }
        Rect m02 = lVar.m0();
        if (lVar.f7871R != null) {
            Rect m03 = lVar.f7871R.m0();
            Rect rect = new Rect(m02);
            rect.offset(-m03.left, -m03.top);
            H3.setBoundsInParent(rect);
        } else {
            H3.setBoundsInParent(m02);
        }
        H3.setBoundsInScreen(w(m02));
        H3.setVisibleToUser(true);
        H3.setEnabled(!lVar.x0(i.HAS_ENABLED_STATE) || lVar.x0(i.IS_ENABLED));
        if (lVar.w0(g.TAP)) {
            if (lVar.f7875V != null) {
                H3.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, lVar.f7875V.f7822e));
                H3.setClickable(true);
            } else {
                H3.addAction(16);
                H3.setClickable(true);
            }
        }
        if (lVar.w0(g.LONG_PRESS)) {
            if (lVar.f7876W != null) {
                H3.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, lVar.f7876W.f7822e));
                H3.setLongClickable(true);
            } else {
                H3.addAction(32);
                H3.setLongClickable(true);
            }
        }
        g gVar = g.SCROLL_LEFT;
        if (lVar.w0(gVar) || lVar.w0(g.SCROLL_UP) || lVar.w0(g.SCROLL_RIGHT) || lVar.w0(g.SCROLL_DOWN)) {
            H3.setScrollable(true);
            if (lVar.x0(i.HAS_IMPLICIT_SCROLLING)) {
                if (lVar.w0(gVar) || lVar.w0(g.SCROLL_RIGHT)) {
                    if (Y(lVar)) {
                        H3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, lVar.f7891j, false));
                    } else {
                        H3.setClassName("android.widget.HorizontalScrollView");
                    }
                } else if (Y(lVar)) {
                    H3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(lVar.f7891j, 0, false));
                } else {
                    H3.setClassName("android.widget.ScrollView");
                }
            }
            if (lVar.w0(gVar) || lVar.w0(g.SCROLL_UP)) {
                H3.addAction(4096);
            }
            if (lVar.w0(g.SCROLL_RIGHT) || lVar.w0(g.SCROLL_DOWN)) {
                H3.addAction(8192);
            }
        }
        g gVar2 = g.INCREASE;
        if (lVar.w0(gVar2) || lVar.w0(g.DECREASE)) {
            H3.setClassName("android.widget.SeekBar");
            if (lVar.w0(gVar2)) {
                H3.addAction(4096);
            }
            if (lVar.w0(g.DECREASE)) {
                H3.addAction(8192);
            }
        }
        if (lVar.x0(i.IS_LIVE_REGION)) {
            H3.setLiveRegion(1);
        }
        if (lVar.x0(iVar)) {
            H3.setText(lVar.s0());
            if (i5 >= 28) {
                H3.setHintText(lVar.r0());
            }
        } else if (!lVar.x0(i.SCOPES_ROUTE)) {
            CharSequence t02 = lVar.t0();
            if (i5 < 28 && lVar.f7907z != null) {
                t02 = ((Object) (t02 != null ? t02 : "")) + "\n" + lVar.f7907z;
            }
            if (t02 != null) {
                H3.setContentDescription(t02);
            }
        }
        if (i5 >= 28 && lVar.f7907z != null) {
            H3.setTooltipText(lVar.f7907z);
        }
        boolean x02 = lVar.x0(i.HAS_CHECKED_STATE);
        boolean x03 = lVar.x0(i.HAS_TOGGLED_STATE);
        if (!x02 && !x03) {
            z3 = false;
        }
        H3.setCheckable(z3);
        if (x02) {
            H3.setChecked(lVar.x0(i.IS_CHECKED));
            if (lVar.x0(i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                H3.setClassName("android.widget.RadioButton");
            } else {
                H3.setClassName("android.widget.CheckBox");
            }
        } else if (x03) {
            H3.setChecked(lVar.x0(i.IS_TOGGLED));
            H3.setClassName("android.widget.Switch");
        }
        H3.setSelected(lVar.x0(i.IS_SELECTED));
        if (i5 >= 28) {
            H3.setHeading(lVar.x0(i.IS_HEADER));
        }
        l lVar5 = this.f7761i;
        if (lVar5 == null || lVar5.f7882b != i3) {
            H3.addAction(64);
        } else {
            H3.addAction(128);
        }
        if (lVar.f7874U != null) {
            for (h hVar : lVar.f7874U) {
                H3.addAction(new AccessibilityNodeInfo.AccessibilityAction(hVar.f7818a, hVar.f7821d));
            }
        }
        for (l lVar6 : lVar.f7872S) {
            if (!lVar6.x0(i.IS_HIDDEN)) {
                if (lVar6.f7890i != -1) {
                    View d4 = this.f7757e.d(lVar6.f7890i);
                    if (!this.f7757e.c(lVar6.f7890i)) {
                        H3.addChild(d4);
                    }
                }
                H3.addChild(this.f7753a, lVar6.f7882b);
            }
        }
        return H3;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i3) {
        if (i3 == 1) {
            l lVar = this.f7765m;
            if (lVar != null) {
                return createAccessibilityNodeInfo(lVar.f7882b);
            }
            Integer num = this.f7763k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i3 != 2) {
            return null;
        }
        l lVar2 = this.f7761i;
        if (lVar2 != null) {
            return createAccessibilityNodeInfo(lVar2.f7882b);
        }
        Integer num2 = this.f7762j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i3, int i4, Bundle bundle) {
        if (i3 >= 65536) {
            boolean performAction = this.f7756d.performAction(i3, i4, bundle);
            if (performAction && i4 == 128) {
                this.f7762j = null;
            }
            return performAction;
        }
        l lVar = (l) this.f7759g.get(Integer.valueOf(i3));
        if (lVar == null) {
            return false;
        }
        switch (i4) {
            case 16:
                this.f7754b.b(i3, g.TAP);
                return true;
            case 32:
                this.f7754b.b(i3, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f7761i == null) {
                    this.f7753a.invalidate();
                }
                this.f7761i = lVar;
                this.f7754b.b(i3, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap = new HashMap();
                hashMap.put("type", "didGainFocus");
                hashMap.put("nodeId", Integer.valueOf(lVar.f7882b));
                this.f7754b.f7242a.c(hashMap);
                Q(i3, 32768);
                if (lVar.w0(g.INCREASE) || lVar.w0(g.DECREASE)) {
                    Q(i3, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f7761i;
                if (lVar2 != null && lVar2.f7882b == i3) {
                    this.f7761i = null;
                }
                Integer num = this.f7762j;
                if (num != null && num.intValue() == i3) {
                    this.f7762j = null;
                }
                this.f7754b.b(i3, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                Q(i3, 65536);
                return true;
            case 256:
                return M(lVar, i3, bundle, true);
            case 512:
                return M(lVar, i3, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (lVar.w0(gVar)) {
                    this.f7754b.b(i3, gVar);
                } else {
                    g gVar2 = g.SCROLL_LEFT;
                    if (lVar.w0(gVar2)) {
                        this.f7754b.b(i3, gVar2);
                    } else {
                        g gVar3 = g.INCREASE;
                        if (!lVar.w0(gVar3)) {
                            return false;
                        }
                        lVar.f7899r = lVar.f7901t;
                        lVar.f7900s = lVar.f7902u;
                        Q(i3, 4);
                        this.f7754b.b(i3, gVar3);
                    }
                }
                return true;
            case 8192:
                g gVar4 = g.SCROLL_DOWN;
                if (lVar.w0(gVar4)) {
                    this.f7754b.b(i3, gVar4);
                } else {
                    g gVar5 = g.SCROLL_RIGHT;
                    if (lVar.w0(gVar5)) {
                        this.f7754b.b(i3, gVar5);
                    } else {
                        g gVar6 = g.DECREASE;
                        if (!lVar.w0(gVar6)) {
                            return false;
                        }
                        lVar.f7899r = lVar.f7903v;
                        lVar.f7900s = lVar.f7904w;
                        Q(i3, 4);
                        this.f7754b.b(i3, gVar6);
                    }
                }
                return true;
            case 16384:
                this.f7754b.b(i3, g.COPY);
                return true;
            case 32768:
                this.f7754b.b(i3, g.PASTE);
                return true;
            case 65536:
                this.f7754b.b(i3, g.CUT);
                return true;
            case 131072:
                HashMap hashMap2 = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap2.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap2.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                } else {
                    hashMap2.put("base", Integer.valueOf(lVar.f7889h));
                    hashMap2.put("extent", Integer.valueOf(lVar.f7889h));
                }
                this.f7754b.c(i3, g.SET_SELECTION, hashMap2);
                l lVar3 = (l) this.f7759g.get(Integer.valueOf(i3));
                lVar3.f7888g = ((Integer) hashMap2.get("base")).intValue();
                lVar3.f7889h = ((Integer) hashMap2.get("extent")).intValue();
                return true;
            case 1048576:
                this.f7754b.b(i3, g.DISMISS);
                return true;
            case 2097152:
                return N(lVar, i3, bundle);
            case R.id.accessibilityActionShowOnScreen:
                this.f7754b.b(i3, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = (h) this.f7760h.get(Integer.valueOf(i4 - f7750B));
                if (hVar == null) {
                    return false;
                }
                this.f7754b.c(i3, g.CUSTOM_ACTION, Integer.valueOf(hVar.f7819b));
                return true;
        }
    }

    public final AccessibilityEvent u(int i3, String str, String str2) {
        AccessibilityEvent F3 = F(i3, 16);
        F3.setBeforeText(str);
        F3.getText().add(str2);
        int i4 = 0;
        while (i4 < str.length() && i4 < str2.length() && str.charAt(i4) == str2.charAt(i4)) {
            i4++;
        }
        if (i4 >= str.length() && i4 >= str2.length()) {
            return null;
        }
        F3.setFromIndex(i4);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i4 && length2 >= i4 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        F3.setRemovedCount((length - i4) + 1);
        F3.setAddedCount((length2 - i4) + 1);
        return F3;
    }

    public final boolean v() {
        int i3;
        Activity b3 = AbstractC0655f.b(this.f7753a.getContext());
        if (b3 == null || b3.getWindow() == null) {
            return false;
        }
        i3 = b3.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i3 == 2 || i3 == 0;
    }

    public final Rect w(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f7753a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    public final h x(int i3) {
        h hVar = (h) this.f7760h.get(Integer.valueOf(i3));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        hVar2.f7819b = i3;
        hVar2.f7818a = f7750B + i3;
        this.f7760h.put(Integer.valueOf(i3), hVar2);
        return hVar2;
    }

    public final l y(int i3) {
        l lVar = (l) this.f7759g.get(Integer.valueOf(i3));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        lVar2.f7882b = i3;
        this.f7759g.put(Integer.valueOf(i3), lVar2);
        return lVar2;
    }

    public final l z() {
        return (l) this.f7759g.get(0);
    }

    public f(View view, C0490a c0490a, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.o oVar) {
        this.f7759g = new HashMap();
        this.f7760h = new HashMap();
        this.f7764l = 0;
        this.f7768p = new ArrayList();
        this.f7769q = 0;
        this.f7770r = 0;
        this.f7772t = false;
        this.f7773u = false;
        this.f7774v = new a();
        b bVar = new b();
        this.f7775w = bVar;
        c cVar = new c(new Handler());
        this.f7777y = cVar;
        this.f7753a = view;
        this.f7754b = c0490a;
        this.f7755c = accessibilityManager;
        this.f7758f = contentResolver;
        this.f7756d = accessibilityViewEmbedder;
        this.f7757e = oVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        d dVar = new d(accessibilityManager);
        this.f7776x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (Build.VERSION.SDK_INT >= 31) {
            W();
        }
        oVar.b(this);
    }
}

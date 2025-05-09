package L;

import L.A;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j.AbstractC0515e;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y.AbstractC0769b;

/* loaded from: classes.dex */
public class x {

    /* renamed from: d, reason: collision with root package name */
    public static int f1250d;

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f1251a;

    /* renamed from: b, reason: collision with root package name */
    public int f1252b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f1253c = -1;

    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final a f1254A;

        /* renamed from: B, reason: collision with root package name */
        public static final a f1255B;

        /* renamed from: C, reason: collision with root package name */
        public static final a f1256C;

        /* renamed from: D, reason: collision with root package name */
        public static final a f1257D;

        /* renamed from: E, reason: collision with root package name */
        public static final a f1258E;

        /* renamed from: F, reason: collision with root package name */
        public static final a f1259F;

        /* renamed from: G, reason: collision with root package name */
        public static final a f1260G;

        /* renamed from: H, reason: collision with root package name */
        public static final a f1261H;

        /* renamed from: I, reason: collision with root package name */
        public static final a f1262I;

        /* renamed from: J, reason: collision with root package name */
        public static final a f1263J;

        /* renamed from: K, reason: collision with root package name */
        public static final a f1264K;

        /* renamed from: L, reason: collision with root package name */
        public static final a f1265L;

        /* renamed from: M, reason: collision with root package name */
        public static final a f1266M;

        /* renamed from: N, reason: collision with root package name */
        public static final a f1267N;

        /* renamed from: O, reason: collision with root package name */
        public static final a f1268O;

        /* renamed from: P, reason: collision with root package name */
        public static final a f1269P;

        /* renamed from: Q, reason: collision with root package name */
        public static final a f1270Q;

        /* renamed from: R, reason: collision with root package name */
        public static final a f1271R;

        /* renamed from: S, reason: collision with root package name */
        public static final a f1272S;

        /* renamed from: T, reason: collision with root package name */
        public static final a f1273T;

        /* renamed from: U, reason: collision with root package name */
        public static final a f1274U;

        /* renamed from: V, reason: collision with root package name */
        public static final a f1275V;

        /* renamed from: e, reason: collision with root package name */
        public static final a f1276e = new a(1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f1277f = new a(2, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f1278g = new a(4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f1279h = new a(8, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f1280i = new a(16, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f1281j = new a(32, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f1282k = new a(64, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f1283l = new a(128, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f1284m = new a(256, (CharSequence) null, A.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f1285n = new a(512, (CharSequence) null, A.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f1286o = new a(1024, (CharSequence) null, A.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f1287p = new a(2048, (CharSequence) null, A.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f1288q = new a(4096, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f1289r = new a(8192, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f1290s = new a(16384, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f1291t = new a(32768, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f1292u = new a(65536, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f1293v = new a(131072, (CharSequence) null, A.g.class);

        /* renamed from: w, reason: collision with root package name */
        public static final a f1294w = new a(262144, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f1295x = new a(524288, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f1296y = new a(1048576, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f1297z = new a(2097152, (CharSequence) null, A.h.class);

        /* renamed from: a, reason: collision with root package name */
        public final Object f1298a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1299b;

        /* renamed from: c, reason: collision with root package name */
        public final Class f1300c;

        /* renamed from: d, reason: collision with root package name */
        public final A f1301d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            int i3 = Build.VERSION.SDK_INT;
            f1254A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f1255B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, A.e.class);
            f1256C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f1257D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f1258E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f1259F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f1260G = new a(i3 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            if (i3 >= 29) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction = accessibilityAction20;
            } else {
                accessibilityAction = null;
            }
            f1261H = new a(accessibilityAction, R.id.accessibilityActionPageDown, null, null, null);
            if (i3 >= 29) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction2 = accessibilityAction19;
            } else {
                accessibilityAction2 = null;
            }
            f1262I = new a(accessibilityAction2, R.id.accessibilityActionPageLeft, null, null, null);
            if (i3 >= 29) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction3 = accessibilityAction18;
            } else {
                accessibilityAction3 = null;
            }
            f1263J = new a(accessibilityAction3, R.id.accessibilityActionPageRight, null, null, null);
            f1264K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f1265L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, A.f.class);
            f1266M = new a(i3 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, A.d.class);
            f1267N = new a(i3 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i3 >= 28) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction4 = accessibilityAction17;
            } else {
                accessibilityAction4 = null;
            }
            f1268O = new a(accessibilityAction4, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i3 >= 30) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction5 = accessibilityAction16;
            } else {
                accessibilityAction5 = null;
            }
            f1269P = new a(accessibilityAction5, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i3 >= 30) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction6 = accessibilityAction15;
            } else {
                accessibilityAction6 = null;
            }
            f1270Q = new a(accessibilityAction6, R.id.accessibilityActionImeEnter, null, null, null);
            if (i3 >= 32) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
                accessibilityAction7 = accessibilityAction14;
            } else {
                accessibilityAction7 = null;
            }
            f1271R = new a(accessibilityAction7, R.id.accessibilityActionDragStart, null, null, null);
            if (i3 >= 32) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
                accessibilityAction8 = accessibilityAction13;
            } else {
                accessibilityAction8 = null;
            }
            f1272S = new a(accessibilityAction8, R.id.accessibilityActionDragDrop, null, null, null);
            if (i3 >= 32) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
                accessibilityAction9 = accessibilityAction12;
            } else {
                accessibilityAction9 = null;
            }
            f1273T = new a(accessibilityAction9, R.id.accessibilityActionDragCancel, null, null, null);
            if (i3 >= 33) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
                accessibilityAction10 = accessibilityAction11;
            } else {
                accessibilityAction10 = null;
            }
            f1274U = new a(accessibilityAction10, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f1275V = new a(i3 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i3, CharSequence charSequence) {
            this(null, i3, charSequence, null, null);
        }

        public a a(CharSequence charSequence, A a3) {
            return new a(null, this.f1299b, charSequence, a3, this.f1300c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1298a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f1298a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f1301d == null) {
                return false;
            }
            Class cls = this.f1300c;
            if (cls != null) {
                try {
                    AbstractC0515e.a(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception e3) {
                    Class cls2 = this.f1300c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e3);
                }
            }
            return this.f1301d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f1298a;
            return obj2 == null ? aVar.f1298a == null : obj2.equals(aVar.f1298a);
        }

        public int hashCode() {
            Object obj = this.f1298a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String i3 = x.i(this.f1299b);
            if (i3.equals("ACTION_UNKNOWN") && c() != null) {
                i3 = c().toString();
            }
            sb.append(i3);
            return sb.toString();
        }

        public a(int i3, CharSequence charSequence, A a3) {
            this(null, i3, charSequence, a3, null);
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i3, CharSequence charSequence, Class cls) {
            this(null, i3, charSequence, null, cls);
        }

        public a(Object obj, int i3, CharSequence charSequence, A a3, Class cls) {
            this.f1299b = i3;
            this.f1301d = a3;
            if (obj == null) {
                this.f1298a = new AccessibilityNodeInfo.AccessibilityAction(i3, charSequence);
            } else {
                this.f1298a = obj;
            }
            this.f1300c = cls;
        }
    }

    public static class b {
        public static Object a(int i3, float f3, float f4, float f5) {
            return new AccessibilityNodeInfo.RangeInfo(i3, f3, f4, f5);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    public static class c {
        public static f a(boolean z3, int i3, int i4, int i5, int i6, boolean z4, String str, String str2) {
            return new f(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z3).setColumnIndex(i3).setRowIndex(i4).setColumnSpan(i5).setRowSpan(i6).setSelected(z4).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static x b(AccessibilityNodeInfo accessibilityNodeInfo, int i3, int i4) {
            return x.K0(accessibilityNodeInfo.getChild(i3, i4));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static x f(AccessibilityNodeInfo accessibilityNodeInfo, int i3) {
            return x.K0(accessibilityNodeInfo.getParent(i3));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
            accessibilityNodeInfo.setTextSelectable(z3);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    public static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z3);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j3) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j3));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z3) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z3);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z3);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final Object f1302a;

        public e(Object obj) {
            this.f1302a = obj;
        }

        public static e a(int i3, int i4, boolean z3, int i5) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i3, i4, z3, i5));
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Object f1303a;

        public f(Object obj) {
            this.f1303a = obj;
        }

        public static f a(int i3, int i4, int i5, int i6, boolean z3, boolean z4) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, i4, i5, i6, z3, z4));
        }
    }

    public x(Object obj) {
        this.f1251a = (AccessibilityNodeInfo) obj;
    }

    public static x J0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new x(accessibilityNodeInfo);
    }

    public static x K0(Object obj) {
        if (obj != null) {
            return new x(obj);
        }
        return null;
    }

    public static x X() {
        return J0(AccessibilityNodeInfo.obtain());
    }

    public static x Y(x xVar) {
        return J0(AccessibilityNodeInfo.obtain(xVar.f1251a));
    }

    public static x Z(View view) {
        return J0(AccessibilityNodeInfo.obtain(view));
    }

    public static String i(int i3) {
        if (i3 == 1) {
            return "ACTION_FOCUS";
        }
        if (i3 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i3) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i3) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i3) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i3) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public CharSequence A() {
        if (!E()) {
            return this.f1251a.getText();
        }
        List g3 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List g4 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List g5 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List g6 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f1251a.getText(), 0, this.f1251a.getText().length()));
        for (int i3 = 0; i3 < g3.size(); i3++) {
            spannableString.setSpan(new C0261a(((Integer) g6.get(i3)).intValue(), this, u().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) g3.get(i3)).intValue(), ((Integer) g4.get(i3)).intValue(), ((Integer) g5.get(i3)).intValue());
        }
        return spannableString;
    }

    public void A0(boolean z3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1251a.setScreenReaderFocusable(z3);
        } else {
            e0(1, z3);
        }
    }

    public CharSequence B() {
        CharSequence tooltipText;
        if (Build.VERSION.SDK_INT < 28) {
            return this.f1251a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        tooltipText = this.f1251a.getTooltipText();
        return tooltipText;
    }

    public void B0(boolean z3) {
        this.f1251a.setScrollable(z3);
    }

    public String C() {
        return Build.VERSION.SDK_INT >= 33 ? c.g(this.f1251a) : this.f1251a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void C0(boolean z3) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1251a.setShowingHintText(z3);
        } else {
            e0(4, z3);
        }
    }

    public String D() {
        return this.f1251a.getViewIdResourceName();
    }

    public void D0(View view, int i3) {
        this.f1253c = i3;
        this.f1251a.setSource(view, i3);
    }

    public final boolean E() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public void E0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.f1251a, charSequence);
        } else {
            this.f1251a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final int F(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i3)).get())) {
                    return sparseArray.keyAt(i3);
                }
            }
        }
        int i4 = f1250d;
        f1250d = i4 + 1;
        return i4;
    }

    public void F0(CharSequence charSequence) {
        this.f1251a.setText(charSequence);
    }

    public boolean G() {
        return Build.VERSION.SDK_INT >= 34 ? d.f(this.f1251a) : k(64);
    }

    public void G0(View view) {
        this.f1251a.setTraversalAfter(view);
    }

    public boolean H() {
        return this.f1251a.isCheckable();
    }

    public void H0(boolean z3) {
        this.f1251a.setVisibleToUser(z3);
    }

    public boolean I() {
        return this.f1251a.isChecked();
    }

    public AccessibilityNodeInfo I0() {
        return this.f1251a;
    }

    public boolean J() {
        return this.f1251a.isClickable();
    }

    public boolean K() {
        return this.f1251a.isContextClickable();
    }

    public boolean L() {
        return this.f1251a.isEnabled();
    }

    public boolean M() {
        return this.f1251a.isFocusable();
    }

    public boolean N() {
        return this.f1251a.isFocused();
    }

    public boolean O() {
        return k(67108864);
    }

    public boolean P() {
        return this.f1251a.isImportantForAccessibility();
    }

    public boolean Q() {
        return this.f1251a.isLongClickable();
    }

    public boolean R() {
        return this.f1251a.isPassword();
    }

    public boolean S() {
        return this.f1251a.isScrollable();
    }

    public boolean T() {
        return this.f1251a.isSelected();
    }

    public boolean U() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT < 26) {
            return k(4);
        }
        isShowingHintText = this.f1251a.isShowingHintText();
        return isShowingHintText;
    }

    public boolean V() {
        return Build.VERSION.SDK_INT >= 33 ? c.h(this.f1251a) : k(8388608);
    }

    public boolean W() {
        return this.f1251a.isVisibleToUser();
    }

    public void a(int i3) {
        this.f1251a.addAction(i3);
    }

    public boolean a0(int i3, Bundle bundle) {
        return this.f1251a.performAction(i3, bundle);
    }

    public void b(a aVar) {
        this.f1251a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f1298a);
    }

    public void c(View view, int i3) {
        this.f1251a.addChild(view, i3);
    }

    public final void c0(View view) {
        SparseArray y3 = y(view);
        if (y3 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < y3.size(); i3++) {
                if (((WeakReference) y3.valueAt(i3)).get() == null) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                y3.remove(((Integer) arrayList.get(i4)).intValue());
            }
        }
    }

    public final void d(ClickableSpan clickableSpan, Spanned spanned, int i3) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i3));
    }

    public void d0(boolean z3) {
        this.f1251a.setAccessibilityFocused(z3);
    }

    public void e(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            f();
            c0(view);
            ClickableSpan[] q3 = q(charSequence);
            if (q3 == null || q3.length <= 0) {
                return;
            }
            u().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", AbstractC0769b.f10129a);
            SparseArray w3 = w(view);
            for (int i3 = 0; i3 < q3.length; i3++) {
                int F3 = F(q3[i3], w3);
                w3.put(F3, new WeakReference(q3[i3]));
                d(q3[i3], (Spanned) charSequence, F3);
            }
        }
    }

    public final void e0(int i3, boolean z3) {
        Bundle u3 = u();
        if (u3 != null) {
            int i4 = u3.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i3);
            if (!z3) {
                i3 = 0;
            }
            u3.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i3 | i4);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1251a;
        if (accessibilityNodeInfo == null) {
            if (xVar.f1251a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(xVar.f1251a)) {
            return false;
        }
        return this.f1253c == xVar.f1253c && this.f1252b == xVar.f1252b;
    }

    public final void f() {
        this.f1251a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f1251a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f1251a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f1251a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public void f0(Rect rect) {
        this.f1251a.setBoundsInParent(rect);
    }

    public final List g(String str) {
        ArrayList<Integer> integerArrayList = this.f1251a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f1251a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void g0(Rect rect) {
        this.f1251a.setBoundsInScreen(rect);
    }

    public List h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f1251a.getActionList();
        if (actionList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new a(actionList.get(i3)));
        }
        return arrayList;
    }

    public void h0(boolean z3) {
        this.f1251a.setCheckable(z3);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1251a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(boolean z3) {
        this.f1251a.setChecked(z3);
    }

    public int j() {
        return this.f1251a.getActions();
    }

    public void j0(CharSequence charSequence) {
        this.f1251a.setClassName(charSequence);
    }

    public final boolean k(int i3) {
        Bundle u3 = u();
        return u3 != null && (u3.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i3) == i3;
    }

    public void k0(boolean z3) {
        this.f1251a.setClickable(z3);
    }

    public void l(Rect rect) {
        this.f1251a.getBoundsInParent(rect);
    }

    public void l0(Object obj) {
        this.f1251a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f1302a);
    }

    public void m(Rect rect) {
        this.f1251a.getBoundsInScreen(rect);
    }

    public void m0(Object obj) {
        this.f1251a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f1303a);
    }

    public void n(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f1251a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f1251a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void n0(CharSequence charSequence) {
        this.f1251a.setContentDescription(charSequence);
    }

    public int o() {
        return this.f1251a.getChildCount();
    }

    public void o0(boolean z3) {
        this.f1251a.setEnabled(z3);
    }

    public CharSequence p() {
        return this.f1251a.getClassName();
    }

    public void p0(CharSequence charSequence) {
        this.f1251a.setError(charSequence);
    }

    public void q0(boolean z3) {
        this.f1251a.setFocusable(z3);
    }

    public CharSequence r() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f1251a) : this.f1251a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void r0(boolean z3) {
        this.f1251a.setFocused(z3);
    }

    public CharSequence s() {
        return this.f1251a.getContentDescription();
    }

    public void s0(boolean z3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1251a.setHeading(z3);
        } else {
            e0(2, z3);
        }
    }

    public CharSequence t() {
        return this.f1251a.getError();
    }

    public void t0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1251a.setHintText(charSequence);
        } else {
            this.f1251a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb.append("; boundsInParent: " + rect);
        m(rect);
        sb.append("; boundsInScreen: " + rect);
        n(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(x());
        sb.append("; className: ");
        sb.append(p());
        sb.append("; text: ");
        sb.append(A());
        sb.append("; error: ");
        sb.append(t());
        sb.append("; maxTextLength: ");
        sb.append(v());
        sb.append("; stateDescription: ");
        sb.append(z());
        sb.append("; contentDescription: ");
        sb.append(s());
        sb.append("; tooltipText: ");
        sb.append(B());
        sb.append("; viewIdResName: ");
        sb.append(D());
        sb.append("; uniqueId: ");
        sb.append(C());
        sb.append("; checkable: ");
        sb.append(H());
        sb.append("; checked: ");
        sb.append(I());
        sb.append("; focusable: ");
        sb.append(M());
        sb.append("; focused: ");
        sb.append(N());
        sb.append("; selected: ");
        sb.append(T());
        sb.append("; clickable: ");
        sb.append(J());
        sb.append("; longClickable: ");
        sb.append(Q());
        sb.append("; contextClickable: ");
        sb.append(K());
        sb.append("; enabled: ");
        sb.append(L());
        sb.append("; password: ");
        sb.append(R());
        sb.append("; scrollable: " + S());
        sb.append("; containerTitle: ");
        sb.append(r());
        sb.append("; granularScrollingSupported: ");
        sb.append(O());
        sb.append("; importantForAccessibility: ");
        sb.append(P());
        sb.append("; visible: ");
        sb.append(W());
        sb.append("; isTextSelectable: ");
        sb.append(V());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(G());
        sb.append("; [");
        List h3 = h();
        for (int i3 = 0; i3 < h3.size(); i3++) {
            a aVar = (a) h3.get(i3);
            String i4 = i(aVar.b());
            if (i4.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                i4 = aVar.c().toString();
            }
            sb.append(i4);
            if (i3 != h3.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Bundle u() {
        return this.f1251a.getExtras();
    }

    public void u0(View view) {
        this.f1251a.setLabelFor(view);
    }

    public int v() {
        return this.f1251a.getMaxTextLength();
    }

    public void v0(int i3) {
        this.f1251a.setMaxTextLength(i3);
    }

    public final SparseArray w(View view) {
        SparseArray y3 = y(view);
        if (y3 != null) {
            return y3;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(AbstractC0769b.f10119I, sparseArray);
        return sparseArray;
    }

    public void w0(CharSequence charSequence) {
        this.f1251a.setPackageName(charSequence);
    }

    public CharSequence x() {
        return this.f1251a.getPackageName();
    }

    public void x0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1251a.setPaneTitle(charSequence);
        } else {
            this.f1251a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public final SparseArray y(View view) {
        return (SparseArray) view.getTag(AbstractC0769b.f10119I);
    }

    public void y0(View view) {
        this.f1252b = -1;
        this.f1251a.setParent(view);
    }

    public CharSequence z() {
        return Build.VERSION.SDK_INT >= 30 ? b.b(this.f1251a) : this.f1251a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void z0(View view, int i3) {
        this.f1252b = i3;
        this.f1251a.setParent(view, i3);
    }

    public x(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1251a = accessibilityNodeInfo;
    }

    public void b0() {
    }
}

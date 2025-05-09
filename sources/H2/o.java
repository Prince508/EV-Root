package h2;

import a2.C0313a;
import i2.C0507e;
import i2.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final i2.i f7285a;

    /* renamed from: b, reason: collision with root package name */
    public h f7286b;

    /* renamed from: c, reason: collision with root package name */
    public final i.c f7287c;

    public class a implements i.c {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x014c A[Catch: JSONException -> 0x0040, TryCatch #2 {JSONException -> 0x0040, blocks: (B:5:0x002c, B:6:0x0030, B:11:0x00e0, B:14:0x00e5, B:16:0x00f5, B:18:0x010e, B:20:0x0122, B:30:0x0126, B:23:0x0140, B:25:0x014c, B:27:0x0159, B:32:0x012b, B:33:0x015e, B:35:0x016c, B:37:0x01a2, B:39:0x01b0, B:56:0x0242, B:49:0x025e, B:88:0x0199, B:74:0x01d7, B:81:0x01f9, B:46:0x0219, B:67:0x023a, B:60:0x0256, B:53:0x0272, B:90:0x0035, B:93:0x0043, B:96:0x004e, B:99:0x005a, B:102:0x0066, B:105:0x0071, B:108:0x007c, B:111:0x0086, B:114:0x0090, B:117:0x009a, B:120:0x00a4, B:123:0x00ae, B:126:0x00b9, B:129:0x00c4, B:132:0x00cf, B:42:0x0202), top: B:4:0x002c, inners: #0, #5, #8, #11 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0159 A[Catch: JSONException -> 0x0040, TryCatch #2 {JSONException -> 0x0040, blocks: (B:5:0x002c, B:6:0x0030, B:11:0x00e0, B:14:0x00e5, B:16:0x00f5, B:18:0x010e, B:20:0x0122, B:30:0x0126, B:23:0x0140, B:25:0x014c, B:27:0x0159, B:32:0x012b, B:33:0x015e, B:35:0x016c, B:37:0x01a2, B:39:0x01b0, B:56:0x0242, B:49:0x025e, B:88:0x0199, B:74:0x01d7, B:81:0x01f9, B:46:0x0219, B:67:0x023a, B:60:0x0256, B:53:0x0272, B:90:0x0035, B:93:0x0043, B:96:0x004e, B:99:0x005a, B:102:0x0066, B:105:0x0071, B:108:0x007c, B:111:0x0086, B:114:0x0090, B:117:0x009a, B:120:0x00a4, B:123:0x00ae, B:126:0x00b9, B:129:0x00c4, B:132:0x00cf, B:42:0x0202), top: B:4:0x002c, inners: #0, #5, #8, #11 }] */
        @Override // i2.i.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(i2.h r6, i2.i.d r7) {
            /*
                Method dump skipped, instructions count: 756
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: h2.o.a.a(i2.h, i2.i$d):void");
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7289a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7290b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f7291c;

        static {
            int[] iArr = new int[k.values().length];
            f7291c = iArr;
            try {
                iArr[k.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7291c[k.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7291c[k.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7291c[k.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[l.values().length];
            f7290b = iArr2;
            try {
                iArr2[l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7290b[l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[f.values().length];
            f7289a = iArr3;
            try {
                iArr3[f.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7289a[f.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7289a[f.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7289a[f.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f7292a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7293b;

        public c(int i3, String str) {
            this.f7292a = i3;
            this.f7293b = str;
        }
    }

    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        /* renamed from: e, reason: collision with root package name */
        public String f7297e;

        d(String str) {
            this.f7297e = str;
        }

        public static d f(String str) {
            for (d dVar : values()) {
                if (dVar.f7297e.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum e {
        PLAIN_TEXT("text/plain");


        /* renamed from: e, reason: collision with root package name */
        public String f7300e;

        e(String str) {
            this.f7300e = str;
        }

        public static e f(String str) {
            for (e eVar : values()) {
                if (eVar.f7300e.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        /* renamed from: e, reason: collision with root package name */
        public String f7306e;

        f(String str) {
            this.f7306e = str;
        }

        public static f f(String str) {
            for (f fVar : values()) {
                if (fVar.f7306e.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum g {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        /* renamed from: e, reason: collision with root package name */
        public final String f7313e;

        g(String str) {
            this.f7313e = str;
        }

        public static g f(String str) {
            for (g gVar : values()) {
                String str2 = gVar.f7313e;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface h {
        void a();

        void g(boolean z3);

        void h();

        CharSequence i(e eVar);

        void j();

        void k(String str);

        void l(g gVar);

        void m(i iVar);

        void n(k kVar);

        void o(int i3);

        void p(List list);

        void q(String str);

        boolean r();

        void s(c cVar);

        void t(j jVar);
    }

    public enum i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");


        /* renamed from: e, reason: collision with root package name */
        public final String f7317e;

        i(String str) {
            this.f7317e = str;
        }

        public static i f(String str) {
            for (i iVar : values()) {
                if (iVar.f7317e.equals(str)) {
                    return iVar;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f7318a;

        /* renamed from: b, reason: collision with root package name */
        public final d f7319b;

        /* renamed from: c, reason: collision with root package name */
        public final Boolean f7320c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f7321d;

        /* renamed from: e, reason: collision with root package name */
        public final d f7322e;

        /* renamed from: f, reason: collision with root package name */
        public final Integer f7323f;

        /* renamed from: g, reason: collision with root package name */
        public final Boolean f7324g;

        public j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.f7318a = num;
            this.f7319b = dVar;
            this.f7320c = bool;
            this.f7321d = num2;
            this.f7322e = dVar2;
            this.f7323f = num3;
            this.f7324g = bool2;
        }
    }

    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");


        /* renamed from: e, reason: collision with root package name */
        public String f7330e;

        k(String str) {
            this.f7330e = str;
        }

        public static k f(String str) {
            for (k kVar : values()) {
                if (kVar.f7330e.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        /* renamed from: e, reason: collision with root package name */
        public String f7334e;

        l(String str) {
            this.f7334e = str;
        }

        public static l f(String str) {
            for (l lVar : values()) {
                if (lVar.f7334e.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public o(C0313a c0313a) {
        a aVar = new a();
        this.f7287c = aVar;
        i2.i iVar = new i2.i(c0313a, "flutter/platform", C0507e.f7498a);
        this.f7285a = iVar;
        iVar.e(aVar);
    }

    public final c g(JSONObject jSONObject) {
        int i3 = jSONObject.getInt("primaryColor");
        if (i3 != 0) {
            i3 |= -16777216;
        }
        return new c(i3, jSONObject.getString("label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L38
            java.lang.String r4 = r10.getString(r1)
            h2.o$f r4 = h2.o.f.f(r4)
            int[] r8 = h2.o.b.f7289a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L30
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L2a
            if (r4 == r5) goto L27
            goto L32
        L27:
            r2 = r2 | 8
            goto L32
        L2a:
            r2 = r2 | 2
            goto L32
        L2d:
            r2 = r2 | 4
            goto L32
        L30:
            r2 = r2 | 1
        L32:
            if (r3 != 0) goto L35
            r3 = r2
        L35:
            int r1 = r1 + 1
            goto L4
        L38:
            if (r2 == 0) goto L57
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L4c;
                case 5: goto L4a;
                case 6: goto L4d;
                case 7: goto L4d;
                case 8: goto L49;
                case 9: goto L4d;
                case 10: goto L46;
                case 11: goto L45;
                case 12: goto L4d;
                case 13: goto L4d;
                case 14: goto L4d;
                case 15: goto L42;
                default: goto L41;
            }
        L41:
            goto L53
        L42:
            r10 = 13
            return r10
        L45:
            return r6
        L46:
            r10 = 11
            return r10
        L49:
            return r1
        L4a:
            r10 = 12
        L4c:
            return r10
        L4d:
            if (r3 == r6) goto L56
            if (r3 == r5) goto L55
            if (r3 == r1) goto L54
        L53:
            return r7
        L54:
            return r1
        L55:
            return r10
        L56:
            return r0
        L57:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.o.h(org.json.JSONArray):int");
    }

    public final j i(JSONObject jSONObject) {
        return new j(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? d.f(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.f(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    public final k j(String str) {
        int i3 = b.f7291c[k.f(str).ordinal()];
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? k.EDGE_TO_EDGE : k.EDGE_TO_EDGE : k.IMMERSIVE_STICKY : k.IMMERSIVE : k.LEAN_BACK;
    }

    public final List k(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            int i4 = b.f7290b[l.f(jSONArray.getString(i3)).ordinal()];
            if (i4 == 1) {
                arrayList.add(l.TOP_OVERLAYS);
            } else if (i4 == 2) {
                arrayList.add(l.BOTTOM_OVERLAYS);
            }
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.f7286b = hVar;
    }

    public void m(boolean z3) {
        W1.b.f("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f7285a.c("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z3)));
    }
}

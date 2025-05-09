package h2;

import a2.C0313a;
import android.os.Bundle;
import i2.C0507e;
import i2.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final i2.i f7411a;

    /* renamed from: b, reason: collision with root package name */
    public f f7412b;

    /* renamed from: c, reason: collision with root package name */
    public final i.c f7413c;

    public class a implements i.c {
        public a() {
        }

        @Override // i2.i.c
        public void a(i2.h hVar, i.d dVar) {
            Object obj;
            Bundle bundle;
            if (w.this.f7412b == null) {
                return;
            }
            String str = hVar.f7499a;
            obj = hVar.f7500b;
            W1.b.f("TextInputChannel", "Received '" + str + "' message.");
            str.getClass();
            switch (str) {
                case "TextInput.setPlatformViewClient":
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        w.this.f7412b.e(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                        dVar.b(null);
                        break;
                    } catch (JSONException e3) {
                        dVar.a("error", e3.getMessage(), null);
                        return;
                    }
                case "TextInput.setEditingState":
                    try {
                        w.this.f7412b.d(e.a((JSONObject) obj));
                        dVar.b(null);
                        break;
                    } catch (JSONException e4) {
                        dVar.a("error", e4.getMessage(), null);
                        return;
                    }
                case "TextInput.setClient":
                    try {
                        JSONArray jSONArray = (JSONArray) obj;
                        w.this.f7412b.g(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                        dVar.b(null);
                        break;
                    } catch (NoSuchFieldException | JSONException e5) {
                        dVar.a("error", e5.getMessage(), null);
                        return;
                    }
                case "TextInput.hide":
                    w.this.f7412b.j();
                    dVar.b(null);
                    break;
                case "TextInput.show":
                    w.this.f7412b.a();
                    dVar.b(null);
                    break;
                case "TextInput.sendAppPrivateCommand":
                    try {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 == null || string2.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        }
                        w.this.f7412b.b(string, bundle);
                        dVar.b(null);
                        break;
                    } catch (JSONException e6) {
                        dVar.a("error", e6.getMessage(), null);
                        return;
                    }
                    break;
                case "TextInput.setEditableSizeAndTransform":
                    try {
                        JSONObject jSONObject3 = (JSONObject) obj;
                        double d3 = jSONObject3.getDouble("width");
                        double d4 = jSONObject3.getDouble("height");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int i3 = 0; i3 < 16; i3++) {
                            dArr[i3] = jSONArray2.getDouble(i3);
                        }
                        w.this.f7412b.f(d3, d4, dArr);
                        dVar.b(null);
                        break;
                    } catch (JSONException e7) {
                        dVar.a("error", e7.getMessage(), null);
                        return;
                    }
                case "TextInput.finishAutofillContext":
                    w.this.f7412b.i(((Boolean) obj).booleanValue());
                    dVar.b(null);
                    break;
                case "TextInput.clearClient":
                    w.this.f7412b.c();
                    dVar.b(null);
                    break;
                case "TextInput.requestAutofill":
                    w.this.f7412b.h();
                    dVar.b(null);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7415a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7416b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7417c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f7418d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f7419e;

        /* renamed from: f, reason: collision with root package name */
        public final d f7420f;

        /* renamed from: g, reason: collision with root package name */
        public final c f7421g;

        /* renamed from: h, reason: collision with root package name */
        public final Integer f7422h;

        /* renamed from: i, reason: collision with root package name */
        public final String f7423i;

        /* renamed from: j, reason: collision with root package name */
        public final a f7424j;

        /* renamed from: k, reason: collision with root package name */
        public final String[] f7425k;

        /* renamed from: l, reason: collision with root package name */
        public final b[] f7426l;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final String f7427a;

            /* renamed from: b, reason: collision with root package name */
            public final String[] f7428b;

            /* renamed from: c, reason: collision with root package name */
            public final e f7429c;

            /* renamed from: d, reason: collision with root package name */
            public final String f7430d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f7427a = str;
                this.f7428b = strArr;
                this.f7430d = str2;
                this.f7429c = eVar;
            }

            public static a a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    strArr[i3] = b(jSONArray.getString(i3));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x00a3, code lost:
            
                if (r17.equals("familyName") == false) goto L7;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static java.lang.String b(java.lang.String r17) {
                /*
                    Method dump skipped, instructions count: 802
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: h2.w.b.a.b(java.lang.String):java.lang.String");
            }
        }

        public b(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, d dVar, c cVar, Integer num, String str, a aVar, String[] strArr, b[] bVarArr) {
            this.f7415a = z3;
            this.f7416b = z4;
            this.f7417c = z5;
            this.f7418d = z6;
            this.f7419e = z7;
            this.f7420f = dVar;
            this.f7421g = cVar;
            this.f7422h = num;
            this.f7423i = str;
            this.f7424j = aVar;
            this.f7425k = strArr;
            this.f7426l = bVarArr;
        }

        public static b a(JSONObject jSONObject) {
            b[] bVarArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                bVarArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                b[] bVarArr2 = new b[length];
                for (int i3 = 0; i3 < length; i3++) {
                    bVarArr2[i3] = a(jSONArray.getJSONObject(i3));
                }
                bVarArr = bVarArr2;
            }
            Integer b3 = b(string);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                    arrayList.add(jSONArray2.optString(i4));
                }
            }
            return new b(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), d.f(jSONObject.getString("textCapitalization")), c.a(jSONObject.getJSONObject("inputType")), b3, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : a.a(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), bVarArr);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0073, code lost:
        
            if (r12.equals("TextInputAction.done") == false) goto L4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Integer b(java.lang.String r12) {
            /*
                r0 = 7
                r1 = 6
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r12.getClass()
                r6 = 1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                r8 = 0
                java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
                r10 = -1
                int r11 = r12.hashCode()
                switch(r11) {
                    case -810971940: goto L76;
                    case -737377923: goto L6d;
                    case -737089298: goto L62;
                    case -737080013: goto L57;
                    case -736940669: goto L4c;
                    case 469250275: goto L41;
                    case 1241689507: goto L36;
                    case 1539450297: goto L2b;
                    case 2110497650: goto L1e;
                    default: goto L1b;
                }
            L1b:
                r6 = r10
                goto L80
            L1e:
                java.lang.String r6 = "TextInputAction.previous"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L27
                goto L1b
            L27:
                r6 = 8
                goto L80
            L2b:
                java.lang.String r6 = "TextInputAction.newline"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L34
                goto L1b
            L34:
                r6 = r0
                goto L80
            L36:
                java.lang.String r6 = "TextInputAction.go"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L3f
                goto L1b
            L3f:
                r6 = r1
                goto L80
            L41:
                java.lang.String r6 = "TextInputAction.search"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L4a
                goto L1b
            L4a:
                r6 = r2
                goto L80
            L4c:
                java.lang.String r6 = "TextInputAction.send"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L55
                goto L1b
            L55:
                r6 = r3
                goto L80
            L57:
                java.lang.String r6 = "TextInputAction.none"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L60
                goto L1b
            L60:
                r6 = r4
                goto L80
            L62:
                java.lang.String r6 = "TextInputAction.next"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L6b
                goto L1b
            L6b:
                r6 = r5
                goto L80
            L6d:
                java.lang.String r8 = "TextInputAction.done"
                boolean r12 = r12.equals(r8)
                if (r12 != 0) goto L80
                goto L1b
            L76:
                java.lang.String r6 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r6)
                if (r12 != 0) goto L7f
                goto L1b
            L7f:
                r6 = r8
            L80:
                switch(r6) {
                    case 0: goto La4;
                    case 1: goto L9f;
                    case 2: goto L9a;
                    case 3: goto L99;
                    case 4: goto L94;
                    case 5: goto L8f;
                    case 6: goto L8a;
                    case 7: goto L89;
                    case 8: goto L84;
                    default: goto L83;
                }
            L83:
                return r9
            L84:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
                return r12
            L89:
                return r7
            L8a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L8f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L94:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L99:
                return r7
            L9a:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            L9f:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            La4:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: h2.w.b.b(java.lang.String):java.lang.Integer");
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final g f7431a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7432b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7433c;

        public c(g gVar, boolean z3, boolean z4) {
            this.f7431a = gVar;
            this.f7432b = z3;
            this.f7433c = z4;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.f(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        /* renamed from: e, reason: collision with root package name */
        public final String f7439e;

        d(String str) {
            this.f7439e = str;
        }

        public static d f(String str) {
            for (d dVar : values()) {
                if (dVar.f7439e.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f7440a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7441b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7442c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7443d;

        /* renamed from: e, reason: collision with root package name */
        public final int f7444e;

        public e(String str, int i3, int i4, int i5, int i6) {
            if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i4 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i3) + ", " + String.valueOf(i4) + ")");
            }
            if (!(i5 == -1 && i6 == -1) && (i5 < 0 || i5 > i6)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i5) + ", " + String.valueOf(i6) + ")");
            }
            if (i6 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i5));
            }
            if (i3 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i3));
            }
            if (i4 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i4));
            }
            this.f7440a = str;
            this.f7441b = i3;
            this.f7442c = i4;
            this.f7443d = i5;
            this.f7444e = i6;
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int i3 = this.f7443d;
            return i3 >= 0 && this.f7444e > i3;
        }

        public boolean c() {
            return this.f7441b >= 0;
        }
    }

    public interface f {
        void a();

        void b(String str, Bundle bundle);

        void c();

        void d(e eVar);

        void e(int i3, boolean z3);

        void f(double d3, double d4, double[] dArr);

        void g(int i3, b bVar);

        void h();

        void i(boolean z3);

        void j();
    }

    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");


        /* renamed from: e, reason: collision with root package name */
        public final String f7457e;

        g(String str) {
            this.f7457e = str;
        }

        public static g f(String str) {
            for (g gVar : values()) {
                if (gVar.f7457e.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public w(C0313a c0313a) {
        a aVar = new a();
        this.f7413c = aVar;
        i2.i iVar = new i2.i(c0313a, "flutter/textinput", C0507e.f7498a);
        this.f7411a = iVar;
        iVar.e(aVar);
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(((io.flutter.plugin.editing.k) it.next()).b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    public static HashMap d(String str, int i3, int i4, int i5, int i6) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i3));
        hashMap.put("selectionExtent", Integer.valueOf(i4));
        hashMap.put("composingBase", Integer.valueOf(i5));
        hashMap.put("composingExtent", Integer.valueOf(i6));
        return hashMap;
    }

    public void b(int i3, Map map) {
        W1.b.f("TextInputChannel", "Sending 'commitContent' message.");
        this.f7411a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.commitContent", map));
    }

    public void e(int i3) {
        W1.b.f("TextInputChannel", "Sending 'done' message.");
        this.f7411a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.done"));
    }

    public void f(int i3) {
        W1.b.f("TextInputChannel", "Sending 'go' message.");
        this.f7411a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.go"));
    }

    public void g(int i3) {
        W1.b.f("TextInputChannel", "Sending 'newline' message.");
        this.f7411a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.newline"));
    }

    public void h(int i3) {
        W1.b.f("TextInputChannel", "Sending 'next' message.");
        this.f7411a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.next"));
    }

    public void i(int i3, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.f7411a.c("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i3), hashMap));
    }

    public void j(int i3) {
        W1.b.f("TextInputChannel", "Sending 'previous' message.");
        this.f7411a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.previous"));
    }

    public void k() {
        this.f7411a.c("TextInputClient.requestExistingInputState", null);
    }

    public void l(int i3) {
        W1.b.f("TextInputChannel", "Sending 'search' message.");
        this.f7411a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.search"));
    }

    public void m(int i3) {
        W1.b.f("TextInputChannel", "Sending 'send' message.");
        this.f7411a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.send"));
    }

    public void n(f fVar) {
        this.f7412b = fVar;
    }

    public void o(int i3) {
        W1.b.f("TextInputChannel", "Sending 'unspecified' message.");
        this.f7411a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i3), "TextInputAction.unspecified"));
    }

    public void p(int i3, String str, int i4, int i5, int i6, int i7) {
        W1.b.f("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i4 + "\nSelection end: " + i5 + "\nComposing start: " + i6 + "\nComposing end: " + i7);
        this.f7411a.c("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i3), d(str, i4, i5, i6, i7)));
    }

    public void q(int i3, ArrayList arrayList) {
        W1.b.f("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.f7411a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i3), c(arrayList)));
    }

    public void r(int i3, HashMap hashMap) {
        W1.b.f("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            e eVar = (e) entry.getValue();
            hashMap2.put((String) entry.getKey(), d(eVar.f7440a, eVar.f7441b, eVar.f7442c, -1, -1));
        }
        this.f7411a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i3), hashMap2));
    }
}

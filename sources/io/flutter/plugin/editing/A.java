package io.flutter.plugin.editing;

import Y1.I;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import h2.w;
import io.flutter.plugin.editing.i;
import java.util.HashMap;

/* loaded from: classes.dex */
public class A implements i.b {

    /* renamed from: a, reason: collision with root package name */
    public final View f7613a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f7614b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f7615c;

    /* renamed from: d, reason: collision with root package name */
    public final h2.w f7616d;

    /* renamed from: e, reason: collision with root package name */
    public c f7617e = new c(c.a.NO_TARGET, 0);

    /* renamed from: f, reason: collision with root package name */
    public w.b f7618f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f7619g;

    /* renamed from: h, reason: collision with root package name */
    public i f7620h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7621i;

    /* renamed from: j, reason: collision with root package name */
    public InputConnection f7622j;

    /* renamed from: k, reason: collision with root package name */
    public io.flutter.plugin.platform.r f7623k;

    /* renamed from: l, reason: collision with root package name */
    public Rect f7624l;

    /* renamed from: m, reason: collision with root package name */
    public ImeSyncDeferringInsetsCallback f7625m;

    /* renamed from: n, reason: collision with root package name */
    public w.e f7626n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7627o;

    public class a implements w.f {
        public a() {
        }

        @Override // h2.w.f
        public void a() {
            A a3 = A.this;
            a3.D(a3.f7613a);
        }

        @Override // h2.w.f
        public void b(String str, Bundle bundle) {
            A.this.z(str, bundle);
        }

        @Override // h2.w.f
        public void c() {
            A.this.k();
        }

        @Override // h2.w.f
        public void d(w.e eVar) {
            A a3 = A.this;
            a3.C(a3.f7613a, eVar);
        }

        @Override // h2.w.f
        public void e(int i3, boolean z3) {
            A.this.A(i3, z3);
        }

        @Override // h2.w.f
        public void f(double d3, double d4, double[] dArr) {
            A.this.y(d3, d4, dArr);
        }

        @Override // h2.w.f
        public void g(int i3, w.b bVar) {
            A.this.B(i3, bVar);
        }

        @Override // h2.w.f
        public void h() {
            A.this.v();
        }

        @Override // h2.w.f
        public void i(boolean z3) {
            if (Build.VERSION.SDK_INT < 26 || A.this.f7615c == null) {
                return;
            }
            if (z3) {
                A.this.f7615c.commit();
            } else {
                A.this.f7615c.cancel();
            }
        }

        @Override // h2.w.f
        public void j() {
            if (A.this.f7617e.f7633a == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                A.this.w();
            } else {
                A a3 = A.this;
                a3.q(a3.f7613a);
            }
        }
    }

    public class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7629a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ double[] f7630b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ double[] f7631c;

        public b(boolean z3, double[] dArr, double[] dArr2) {
            this.f7629a = z3;
            this.f7630b = dArr;
            this.f7631c = dArr2;
        }

        @Override // io.flutter.plugin.editing.A.d
        public void a(double d3, double d4) {
            double d5 = 1.0d;
            if (!this.f7629a) {
                double[] dArr = this.f7630b;
                d5 = 1.0d / (((dArr[3] * d3) + (dArr[7] * d4)) + dArr[15]);
            }
            double[] dArr2 = this.f7630b;
            double d6 = ((dArr2[0] * d3) + (dArr2[4] * d4) + dArr2[12]) * d5;
            double d7 = ((dArr2[1] * d3) + (dArr2[5] * d4) + dArr2[13]) * d5;
            double[] dArr3 = this.f7631c;
            if (d6 < dArr3[0]) {
                dArr3[0] = d6;
            } else if (d6 > dArr3[1]) {
                dArr3[1] = d6;
            }
            if (d7 < dArr3[2]) {
                dArr3[2] = d7;
            } else if (d7 > dArr3[3]) {
                dArr3[3] = d7;
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public a f7633a;

        /* renamed from: b, reason: collision with root package name */
        public int f7634b;

        public enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public c(a aVar, int i3) {
            this.f7633a = aVar;
            this.f7634b = i3;
        }
    }

    public interface d {
        void a(double d3, double d4);
    }

    public A(View view, h2.w wVar, io.flutter.plugin.platform.r rVar) {
        this.f7613a = view;
        this.f7620h = new i(null, view);
        this.f7614b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            this.f7615c = p.a(view.getContext().getSystemService(l.a()));
        } else {
            this.f7615c = null;
        }
        if (i3 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f7625m = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f7616d = wVar;
        wVar.n(new a());
        wVar.k();
        this.f7623k = rVar;
        rVar.v(this);
    }

    public static boolean l(w.e eVar, w.e eVar2) {
        int i3 = eVar.f7444e - eVar.f7443d;
        if (i3 != eVar2.f7444e - eVar2.f7443d) {
            return true;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (eVar.f7440a.charAt(eVar.f7443d + i4) != eVar2.f7440a.charAt(eVar2.f7443d + i4)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int r(h2.w.c r1, boolean r2, boolean r3, boolean r4, boolean r5, h2.w.d r6) {
        /*
            h2.w$g r5 = r1.f7431a
            h2.w$g r0 = h2.w.g.DATETIME
            if (r5 != r0) goto L8
            r1 = 4
            return r1
        L8:
            h2.w$g r0 = h2.w.g.NUMBER
            if (r5 != r0) goto L1c
            boolean r2 = r1.f7432b
            if (r2 == 0) goto L13
            r2 = 4098(0x1002, float:5.743E-42)
            goto L14
        L13:
            r2 = 2
        L14:
            boolean r1 = r1.f7433c
            if (r1 == 0) goto L1b
            r1 = r2 | 8192(0x2000, float:1.148E-41)
            return r1
        L1b:
            return r2
        L1c:
            h2.w$g r1 = h2.w.g.PHONE
            if (r5 != r1) goto L22
            r1 = 3
            return r1
        L22:
            h2.w$g r1 = h2.w.g.NONE
            if (r5 != r1) goto L28
            r1 = 0
            return r1
        L28:
            h2.w$g r1 = h2.w.g.MULTILINE
            if (r5 != r1) goto L30
            r1 = 131073(0x20001, float:1.83672E-40)
            goto L54
        L30:
            h2.w$g r1 = h2.w.g.EMAIL_ADDRESS
            if (r5 != r1) goto L37
            r1 = 33
            goto L54
        L37:
            h2.w$g r1 = h2.w.g.URL
            if (r5 != r1) goto L3e
            r1 = 17
            goto L54
        L3e:
            h2.w$g r1 = h2.w.g.VISIBLE_PASSWORD
            if (r5 != r1) goto L45
            r1 = 145(0x91, float:2.03E-43)
            goto L54
        L45:
            h2.w$g r1 = h2.w.g.NAME
            if (r5 != r1) goto L4c
            r1 = 97
            goto L54
        L4c:
            h2.w$g r1 = h2.w.g.POSTAL_ADDRESS
            if (r5 != r1) goto L53
            r1 = 113(0x71, float:1.58E-43)
            goto L54
        L53:
            r1 = 1
        L54:
            if (r2 == 0) goto L5b
            r2 = 524416(0x80080, float:7.34863E-40)
        L59:
            r1 = r1 | r2
            goto L67
        L5b:
            if (r3 == 0) goto L61
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
        L61:
            if (r4 != 0) goto L67
            r2 = 524432(0x80090, float:7.34886E-40)
            goto L59
        L67:
            h2.w$d r2 = h2.w.d.CHARACTERS
            if (r6 != r2) goto L6e
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            return r1
        L6e:
            h2.w$d r2 = h2.w.d.WORDS
            if (r6 != r2) goto L75
            r1 = r1 | 8192(0x2000, float:1.148E-41)
            return r1
        L75:
            h2.w$d r2 = h2.w.d.SENTENCES
            if (r6 != r2) goto L7b
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.A.r(h2.w$c, boolean, boolean, boolean, boolean, h2.w$d):int");
    }

    public final void A(int i3, boolean z3) {
        if (!z3) {
            this.f7617e = new c(c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i3);
            this.f7622j = null;
        } else {
            this.f7613a.requestFocus();
            this.f7617e = new c(c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i3);
            this.f7614b.restartInput(this.f7613a);
            this.f7621i = false;
        }
    }

    public void B(int i3, w.b bVar) {
        w();
        this.f7618f = bVar;
        this.f7617e = new c(c.a.FRAMEWORK_CLIENT, i3);
        this.f7620h.l(this);
        w.b.a aVar = bVar.f7424j;
        this.f7620h = new i(aVar != null ? aVar.f7429c : null, this.f7613a);
        F(bVar);
        this.f7621i = true;
        E();
        this.f7624l = null;
        this.f7620h.a(this);
    }

    public void C(View view, w.e eVar) {
        w.e eVar2;
        if (!this.f7621i && (eVar2 = this.f7626n) != null && eVar2.b()) {
            boolean l3 = l(this.f7626n, eVar);
            this.f7621i = l3;
            if (l3) {
                W1.b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f7626n = eVar;
        this.f7620h.n(eVar);
        if (this.f7621i) {
            this.f7614b.restartInput(view);
            this.f7621i = false;
        }
    }

    public void D(View view) {
        w.c cVar;
        w.b bVar = this.f7618f;
        if (bVar != null && (cVar = bVar.f7421g) != null && cVar.f7431a == w.g.NONE) {
            q(view);
        } else {
            view.requestFocus();
            this.f7614b.showSoftInput(view, 0);
        }
    }

    public void E() {
        if (this.f7617e.f7633a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f7627o = false;
        }
    }

    public final void F(w.b bVar) {
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (bVar == null || bVar.f7424j == null) {
            this.f7619g = null;
            return;
        }
        w.b[] bVarArr = bVar.f7426l;
        SparseArray sparseArray = new SparseArray();
        this.f7619g = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.f7424j.f7427a.hashCode(), bVar);
            return;
        }
        for (w.b bVar2 : bVarArr) {
            w.b.a aVar = bVar2.f7424j;
            if (aVar != null) {
                this.f7619g.put(aVar.f7427a.hashCode(), bVar2);
                AutofillManager autofillManager = this.f7615c;
                View view = this.f7613a;
                int hashCode = aVar.f7427a.hashCode();
                forText = AutofillValue.forText(aVar.f7429c.f7440a);
                autofillManager.notifyValueChanged(view, hashCode, forText);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r5 == r9.f7444e) goto L23;
     */
    @Override // io.flutter.plugin.editing.i.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            if (r8 == 0) goto Lb
            io.flutter.plugin.editing.i r8 = r7.f7620h
            java.lang.String r8 = r8.toString()
            r7.u(r8)
        Lb:
            io.flutter.plugin.editing.i r8 = r7.f7620h
            int r2 = r8.i()
            io.flutter.plugin.editing.i r8 = r7.f7620h
            int r3 = r8.h()
            io.flutter.plugin.editing.i r8 = r7.f7620h
            int r4 = r8.g()
            io.flutter.plugin.editing.i r8 = r7.f7620h
            int r5 = r8.f()
            io.flutter.plugin.editing.i r8 = r7.f7620h
            java.util.ArrayList r8 = r8.e()
            h2.w$e r9 = r7.f7626n
            if (r9 == 0) goto La7
            io.flutter.plugin.editing.i r9 = r7.f7620h
            java.lang.String r9 = r9.toString()
            h2.w$e r10 = r7.f7626n
            java.lang.String r10 = r10.f7440a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L50
            h2.w$e r9 = r7.f7626n
            int r10 = r9.f7441b
            if (r2 != r10) goto L50
            int r10 = r9.f7442c
            if (r3 != r10) goto L50
            int r10 = r9.f7443d
            if (r4 != r10) goto L50
            int r9 = r9.f7444e
            if (r5 != r9) goto L50
            goto La7
        L50:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "send EditingState to flutter: "
            r9.append(r10)
            io.flutter.plugin.editing.i r10 = r7.f7620h
            java.lang.String r10 = r10.toString()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "TextInputPlugin"
            W1.b.f(r10, r9)
            h2.w$b r9 = r7.f7618f
            boolean r9 = r9.f7419e
            if (r9 == 0) goto L81
            h2.w r9 = r7.f7616d
            io.flutter.plugin.editing.A$c r10 = r7.f7617e
            int r10 = r10.f7634b
            r9.q(r10, r8)
            io.flutter.plugin.editing.i r8 = r7.f7620h
            r8.c()
            goto L99
        L81:
            h2.w r0 = r7.f7616d
            io.flutter.plugin.editing.A$c r8 = r7.f7617e
            int r1 = r8.f7634b
            io.flutter.plugin.editing.i r8 = r7.f7620h
            java.lang.String r8 = r8.toString()
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r8
            r0.p(r1, r2, r3, r4, r5, r6)
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
        L99:
            h2.w$e r0 = new h2.w$e
            io.flutter.plugin.editing.i r8 = r7.f7620h
            java.lang.String r1 = r8.toString()
            r0.<init>(r1, r2, r3, r4, r5)
            r7.f7626n = r0
            return
        La7:
            io.flutter.plugin.editing.i r8 = r7.f7620h
            r8.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.A.a(boolean, boolean, boolean):void");
    }

    public void j(SparseArray sparseArray) {
        w.b bVar;
        w.b.a aVar;
        w.b.a aVar2;
        CharSequence textValue;
        if (Build.VERSION.SDK_INT < 26 || (bVar = this.f7618f) == null || this.f7619g == null || (aVar = bVar.f7424j) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            w.b bVar2 = (w.b) this.f7619g.get(sparseArray.keyAt(i3));
            if (bVar2 != null && (aVar2 = bVar2.f7424j) != null) {
                textValue = x.a(sparseArray.valueAt(i3)).getTextValue();
                String charSequence = textValue.toString();
                w.e eVar = new w.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                if (aVar2.f7427a.equals(aVar.f7427a)) {
                    this.f7620h.n(eVar);
                } else {
                    hashMap.put(aVar2.f7427a, eVar);
                }
            }
        }
        this.f7616d.r(this.f7617e.f7634b, hashMap);
    }

    public void k() {
        if (this.f7617e.f7633a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            return;
        }
        this.f7620h.l(this);
        w();
        this.f7618f = null;
        F(null);
        this.f7617e = new c(c.a.NO_TARGET, 0);
        E();
        this.f7624l = null;
        this.f7614b.restartInput(this.f7613a);
    }

    public InputConnection m(View view, I i3, EditorInfo editorInfo) {
        c cVar = this.f7617e;
        c.a aVar = cVar.f7633a;
        if (aVar == c.a.NO_TARGET) {
            this.f7622j = null;
            return null;
        }
        if (aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        }
        if (aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            if (this.f7627o) {
                return this.f7622j;
            }
            InputConnection onCreateInputConnection = this.f7623k.d(cVar.f7634b).onCreateInputConnection(editorInfo);
            this.f7622j = onCreateInputConnection;
            return onCreateInputConnection;
        }
        w.b bVar = this.f7618f;
        int r3 = r(bVar.f7421g, bVar.f7415a, bVar.f7416b, bVar.f7417c, bVar.f7418d, bVar.f7420f);
        editorInfo.inputType = r3;
        editorInfo.imeOptions = 33554432;
        if (Build.VERSION.SDK_INT >= 26 && !this.f7618f.f7418d) {
            editorInfo.imeOptions = 33554432 | 16777216;
        }
        Integer num = this.f7618f.f7422h;
        int intValue = num == null ? (r3 & 131072) != 0 ? 1 : 6 : num.intValue();
        w.b bVar2 = this.f7618f;
        String str = bVar2.f7423i;
        if (str != null) {
            editorInfo.actionLabel = str;
            editorInfo.actionId = intValue;
        }
        editorInfo.imeOptions = intValue | editorInfo.imeOptions;
        String[] strArr = bVar2.f7425k;
        if (strArr != null) {
            P.c.d(editorInfo, strArr);
        }
        h hVar = new h(view, this.f7617e.f7634b, this.f7616d, i3, this.f7620h, editorInfo);
        editorInfo.initialSelStart = this.f7620h.i();
        editorInfo.initialSelEnd = this.f7620h.h();
        this.f7622j = hVar;
        return hVar;
    }

    public void n() {
        this.f7623k.G();
        this.f7616d.n(null);
        w();
        this.f7620h.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f7625m;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager o() {
        return this.f7614b;
    }

    public boolean p(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!o().isAcceptingText() || (inputConnection = this.f7622j) == null) {
            return false;
        }
        return inputConnection instanceof h ? ((h) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public final void q(View view) {
        w();
        this.f7614b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    public void s() {
        if (this.f7617e.f7633a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f7627o = true;
        }
    }

    public final boolean t() {
        return this.f7619g != null;
    }

    public final void u(String str) {
        AutofillValue forText;
        if (Build.VERSION.SDK_INT < 26 || this.f7615c == null || !t()) {
            return;
        }
        String str2 = this.f7618f.f7424j.f7427a;
        AutofillManager autofillManager = this.f7615c;
        View view = this.f7613a;
        int hashCode = str2.hashCode();
        forText = AutofillValue.forText(str);
        autofillManager.notifyValueChanged(view, hashCode, forText);
    }

    public final void v() {
        if (Build.VERSION.SDK_INT < 26 || this.f7615c == null || !t()) {
            return;
        }
        String str = this.f7618f.f7424j.f7427a;
        int[] iArr = new int[2];
        this.f7613a.getLocationOnScreen(iArr);
        Rect rect = new Rect(this.f7624l);
        rect.offset(iArr[0], iArr[1]);
        this.f7615c.notifyViewEntered(this.f7613a, str.hashCode(), rect);
    }

    public final void w() {
        w.b bVar;
        if (Build.VERSION.SDK_INT < 26 || this.f7615c == null || (bVar = this.f7618f) == null || bVar.f7424j == null || !t()) {
            return;
        }
        this.f7615c.notifyViewExited(this.f7613a, this.f7618f.f7424j.f7427a.hashCode());
    }

    public void x(ViewStructure viewStructure, int i3) {
        AutofillId autofillId;
        AutofillValue forText;
        Rect rect;
        AutofillValue forText2;
        if (Build.VERSION.SDK_INT < 26 || !t()) {
            return;
        }
        String str = this.f7618f.f7424j.f7427a;
        autofillId = viewStructure.getAutofillId();
        for (int i4 = 0; i4 < this.f7619g.size(); i4++) {
            int keyAt = this.f7619g.keyAt(i4);
            w.b.a aVar = ((w.b) this.f7619g.valueAt(i4)).f7424j;
            if (aVar != null) {
                viewStructure.addChildCount(1);
                ViewStructure newChild = viewStructure.newChild(i4);
                newChild.setAutofillId(autofillId, keyAt);
                String[] strArr = aVar.f7428b;
                if (strArr.length > 0) {
                    newChild.setAutofillHints(strArr);
                }
                newChild.setAutofillType(1);
                newChild.setVisibility(0);
                String str2 = aVar.f7430d;
                if (str2 != null) {
                    newChild.setHint(str2);
                }
                if (str.hashCode() != keyAt || (rect = this.f7624l) == null) {
                    newChild.setDimens(0, 0, 0, 0, 1, 1);
                    forText = AutofillValue.forText(aVar.f7429c.f7440a);
                    newChild.setAutofillValue(forText);
                } else {
                    newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f7624l.height());
                    forText2 = AutofillValue.forText(this.f7620h);
                    newChild.setAutofillValue(forText2);
                }
            }
        }
    }

    public final void y(double d3, double d4, double[] dArr) {
        double[] dArr2 = new double[4];
        boolean z3 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d5 = dArr[12];
        double d6 = dArr[15];
        double d7 = d5 / d6;
        dArr2[1] = d7;
        dArr2[0] = d7;
        double d8 = dArr[13] / d6;
        dArr2[3] = d8;
        dArr2[2] = d8;
        b bVar = new b(z3, dArr, dArr2);
        bVar.a(d3, 0.0d);
        bVar.a(d3, d4);
        bVar.a(0.0d, d4);
        double d9 = this.f7613a.getContext().getResources().getDisplayMetrics().density;
        this.f7624l = new Rect((int) (dArr2[0] * d9), (int) (dArr2[2] * d9), (int) Math.ceil(dArr2[1] * d9), (int) Math.ceil(dArr2[3] * d9));
    }

    public void z(String str, Bundle bundle) {
        this.f7614b.sendAppPrivateCommand(this.f7613a, str, bundle);
    }
}

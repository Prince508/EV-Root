package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import h2.w;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class i extends SpannableStringBuilder {

    /* renamed from: e, reason: collision with root package name */
    public int f7656e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f7657f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f7658g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f7659h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f7660i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public String f7661j;

    /* renamed from: k, reason: collision with root package name */
    public String f7662k;

    /* renamed from: l, reason: collision with root package name */
    public int f7663l;

    /* renamed from: m, reason: collision with root package name */
    public int f7664m;

    /* renamed from: n, reason: collision with root package name */
    public int f7665n;

    /* renamed from: o, reason: collision with root package name */
    public int f7666o;

    /* renamed from: p, reason: collision with root package name */
    public BaseInputConnection f7667p;

    public class a extends BaseInputConnection {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Editable f7668a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, boolean z3, Editable editable) {
            super(view, z3);
            this.f7668a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f7668a;
        }
    }

    public interface b {
        void a(boolean z3, boolean z4, boolean z5);
    }

    public i(w.e eVar, View view) {
        this.f7667p = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    public void a(b bVar) {
        if (this.f7657f > 0) {
            W1.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f7656e <= 0) {
            this.f7658g.add(bVar);
        } else {
            W1.b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f7659h.add(bVar);
        }
    }

    public void b() {
        this.f7656e++;
        if (this.f7657f > 0) {
            W1.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f7656e != 1 || this.f7658g.isEmpty()) {
            return;
        }
        this.f7662k = toString();
        this.f7663l = i();
        this.f7664m = h();
        this.f7665n = g();
        this.f7666o = f();
    }

    public void c() {
        this.f7660i.clear();
    }

    public void d() {
        int i3 = this.f7656e;
        if (i3 == 0) {
            W1.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i3 == 1) {
            Iterator it = this.f7659h.iterator();
            while (it.hasNext()) {
                j((b) it.next(), true, true, true);
            }
            if (!this.f7658g.isEmpty()) {
                W1.b.f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f7658g.size()) + " listener(s)");
                k(!toString().equals(this.f7662k), (this.f7663l == i() && this.f7664m == h()) ? false : true, (this.f7665n == g() && this.f7666o == f()) ? false : true);
            }
        }
        this.f7658g.addAll(this.f7659h);
        this.f7659h.clear();
        this.f7656e--;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList(this.f7660i);
        this.f7660i.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public final void j(b bVar, boolean z3, boolean z4, boolean z5) {
        this.f7657f++;
        bVar.a(z3, z4, z5);
        this.f7657f--;
    }

    public final void k(boolean z3, boolean z4, boolean z5) {
        if (z3 || z4 || z5) {
            Iterator it = this.f7658g.iterator();
            while (it.hasNext()) {
                j((b) it.next(), z3, z4, z5);
            }
        }
    }

    public void l(b bVar) {
        if (this.f7657f > 0) {
            W1.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f7658g.remove(bVar);
        if (this.f7656e > 0) {
            this.f7659h.remove(bVar);
        }
    }

    public void m(int i3, int i4) {
        if (i3 < 0 || i3 >= i4) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f7667p.setComposingRegion(i3, i4);
        }
    }

    public void n(w.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.f7440a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f7441b, eVar.f7442c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f7443d, eVar.f7444e);
        c();
        d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i3, int i4, int i5) {
        super.setSpan(obj, i3, i4, i5);
        this.f7660i.add(new k(toString(), i(), h(), g(), f()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f7661j;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f7661j = spannableStringBuilder;
        return spannableStringBuilder;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        if (this.f7657f > 0) {
            W1.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String iVar = toString();
        int i7 = i4 - i3;
        boolean z3 = i7 != i6 - i5;
        for (int i8 = 0; i8 < i7 && !z3; i8++) {
            z3 |= charAt(i3 + i8) != charSequence.charAt(i5 + i8);
        }
        if (z3) {
            this.f7661j = null;
        }
        int i9 = i();
        int h3 = h();
        int g3 = g();
        int f3 = f();
        SpannableStringBuilder replace = super.replace(i3, i4, charSequence, i5, i6);
        this.f7660i.add(new k(iVar, i3, i4, charSequence, i(), h(), g(), f()));
        if (this.f7656e > 0) {
            return replace;
        }
        k(z3, (i() == i9 && h() == h3) ? false : true, (g() == g3 && f() == f3) ? false : true);
        return replace;
    }
}

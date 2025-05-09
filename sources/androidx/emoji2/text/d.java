package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.c;
import androidx.emoji2.text.f;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c.i f3912a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3913b;

    /* renamed from: c, reason: collision with root package name */
    public c.d f3914c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3915d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f3916e;

    public static final class a {
        public static int a(CharSequence charSequence, int i3, int i4) {
            int length = charSequence.length();
            if (i3 < 0 || length < i3 || i4 < 0) {
                return -1;
            }
            while (true) {
                boolean z3 = false;
                while (i4 != 0) {
                    i3--;
                    if (i3 < 0) {
                        return z3 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i3);
                    if (z3) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i4--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i4--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z3 = true;
                    }
                }
                return i3;
            }
        }

        public static int b(CharSequence charSequence, int i3, int i4) {
            int length = charSequence.length();
            if (i3 < 0 || length < i3 || i4 < 0) {
                return -1;
            }
            while (true) {
                boolean z3 = false;
                while (i4 != 0) {
                    if (i3 >= length) {
                        if (z3) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i3);
                    if (z3) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i4--;
                        i3++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i4--;
                        i3++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i3++;
                        z3 = true;
                    }
                }
                return i3;
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f3917a = 1;

        /* renamed from: b, reason: collision with root package name */
        public final f.a f3918b;

        /* renamed from: c, reason: collision with root package name */
        public f.a f3919c;

        /* renamed from: d, reason: collision with root package name */
        public f.a f3920d;

        /* renamed from: e, reason: collision with root package name */
        public int f3921e;

        /* renamed from: f, reason: collision with root package name */
        public int f3922f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f3923g;

        /* renamed from: h, reason: collision with root package name */
        public final int[] f3924h;

        public b(f.a aVar, boolean z3, int[] iArr) {
            this.f3918b = aVar;
            this.f3919c = aVar;
            this.f3923g = z3;
            this.f3924h = iArr;
        }

        public static boolean d(int i3) {
            return i3 == 65039;
        }

        public static boolean f(int i3) {
            return i3 == 65038;
        }

        public int a(int i3) {
            f.a a3 = this.f3919c.a(i3);
            int i4 = 2;
            if (this.f3917a != 2) {
                if (a3 == null) {
                    i4 = g();
                } else {
                    this.f3917a = 2;
                    this.f3919c = a3;
                    this.f3922f = 1;
                }
            } else if (a3 != null) {
                this.f3919c = a3;
                this.f3922f++;
            } else if (f(i3)) {
                i4 = g();
            } else if (!d(i3)) {
                if (this.f3919c.b() != null) {
                    i4 = 3;
                    if (this.f3922f != 1) {
                        this.f3920d = this.f3919c;
                        g();
                    } else if (h()) {
                        this.f3920d = this.f3919c;
                        g();
                    } else {
                        i4 = g();
                    }
                } else {
                    i4 = g();
                }
            }
            this.f3921e = i3;
            return i4;
        }

        public a0.e b() {
            return this.f3919c.b();
        }

        public a0.e c() {
            return this.f3920d.b();
        }

        public boolean e() {
            if (this.f3917a != 2 || this.f3919c.b() == null) {
                return false;
            }
            return this.f3922f > 1 || h();
        }

        public final int g() {
            this.f3917a = 1;
            this.f3919c = this.f3918b;
            this.f3922f = 0;
            return 1;
        }

        public final boolean h() {
            if (this.f3919c.b().j() || d(this.f3921e)) {
                return true;
            }
            if (this.f3923g) {
                if (this.f3924h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f3924h, this.f3919c.b().b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(f fVar, c.i iVar, c.d dVar, boolean z3, int[] iArr) {
        this.f3912a = iVar;
        this.f3913b = fVar;
        this.f3914c = dVar;
        this.f3915d = z3;
        this.f3916e = iArr;
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z3) {
        a0.f[] fVarArr;
        if (g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!f(selectionStart, selectionEnd) && (fVarArr = (a0.f[]) editable.getSpans(selectionStart, selectionEnd, a0.f.class)) != null && fVarArr.length > 0) {
            for (a0.f fVar : fVarArr) {
                int spanStart = editable.getSpanStart(fVar);
                int spanEnd = editable.getSpanEnd(fVar);
                if ((z3 && spanStart == selectionStart) || ((!z3 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(InputConnection inputConnection, Editable editable, int i3, int i4, boolean z3) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i3 >= 0 && i4 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z3) {
                max = a.a(editable, selectionStart, Math.max(i3, 0));
                min = a.b(editable, selectionEnd, Math.max(i4, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i3, 0);
                min = Math.min(selectionEnd + i4, editable.length());
            }
            a0.f[] fVarArr = (a0.f[]) editable.getSpans(max, min, a0.f.class);
            if (fVarArr != null && fVarArr.length > 0) {
                for (a0.f fVar : fVarArr) {
                    int spanStart = editable.getSpanStart(fVar);
                    int spanEnd = editable.getSpanEnd(fVar);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean d(Editable editable, int i3, KeyEvent keyEvent) {
        if (!(i3 != 67 ? i3 != 112 ? false : b(editable, keyEvent, true) : b(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    public static boolean f(int i3, int i4) {
        return i3 == -1 || i4 == -1 || i3 != i4;
    }

    public static boolean g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    public final void a(Spannable spannable, a0.e eVar, int i3, int i4) {
        spannable.setSpan(this.f3912a.a(eVar), i3, i4, 33);
    }

    public final boolean e(CharSequence charSequence, int i3, int i4, a0.e eVar) {
        if (eVar.d() == 0) {
            eVar.k(this.f3914c.a(charSequence, i3, i4, eVar.h()));
        }
        return eVar.d() == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0119, code lost:
    
        if (r0 != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x011b, code lost:
    
        ((a0.i) r11).d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0121, code lost:
    
        return r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:99:0x000e, B:102:0x0013, B:104:0x0017, B:106:0x0024, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:23:0x0065, B:29:0x0074, B:30:0x0080, B:34:0x009b, B:60:0x00ab, B:64:0x00b7, B:65:0x00c1, B:47:0x00cb, B:50:0x00d2, B:37:0x00d7, B:39:0x00e2, B:71:0x00e9, B:75:0x00f3, B:78:0x00ff, B:79:0x0104, B:81:0x010d, B:6:0x002f), top: B:98:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:99:0x000e, B:102:0x0013, B:104:0x0017, B:106:0x0024, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:23:0x0065, B:29:0x0074, B:30:0x0080, B:34:0x009b, B:60:0x00ab, B:64:0x00b7, B:65:0x00c1, B:47:0x00cb, B:50:0x00d2, B:37:0x00d7, B:39:0x00e2, B:71:0x00e9, B:75:0x00f3, B:78:0x00ff, B:79:0x0104, B:81:0x010d, B:6:0x002f), top: B:98:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:99:0x000e, B:102:0x0013, B:104:0x0017, B:106:0x0024, B:9:0x003a, B:11:0x0042, B:13:0x0045, B:15:0x0049, B:17:0x0055, B:19:0x0058, B:23:0x0065, B:29:0x0074, B:30:0x0080, B:34:0x009b, B:60:0x00ab, B:64:0x00b7, B:65:0x00c1, B:47:0x00cb, B:50:0x00d2, B:37:0x00d7, B:39:0x00e2, B:71:0x00e9, B:75:0x00f3, B:78:0x00ff, B:79:0x0104, B:81:0x010d, B:6:0x002f), top: B:98:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence h(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}

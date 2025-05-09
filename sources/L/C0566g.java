package l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0566g {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton f8352a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f8353b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f8354c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8355d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8356e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8357f;

    public C0566g(CompoundButton compoundButton) {
        this.f8352a = compoundButton;
    }

    public void a() {
        Drawable a3 = Q.b.a(this.f8352a);
        if (a3 != null) {
            if (this.f8355d || this.f8356e) {
                Drawable mutate = D.a.l(a3).mutate();
                if (this.f8355d) {
                    D.a.i(mutate, this.f8353b);
                }
                if (this.f8356e) {
                    D.a.j(mutate, this.f8354c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f8352a.getDrawableState());
                }
                this.f8352a.setButtonDrawable(mutate);
            }
        }
    }

    public ColorStateList c() {
        return this.f8353b;
    }

    public PorterDuff.Mode d() {
        return this.f8354c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:9:0x0057, B:11:0x005f, B:12:0x0068, B:14:0x0070, B:21:0x003c, B:23:0x0044, B:25:0x004a), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:9:0x0057, B:11:0x005f, B:12:0x0068, B:14:0x0070, B:21:0x003c, B:23:0x0044, B:25:0x004a), top: B:2:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.f8352a
            android.content.Context r0 = r0.getContext()
            int[] r3 = d.i.f6316p0
            r8 = 0
            l.S r9 = l.C0552S.t(r0, r11, r3, r12, r8)
            android.widget.CompoundButton r1 = r10.f8352a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r9.p()
            r7 = 0
            r4 = r11
            r6 = r12
            K.O.h0(r1, r2, r3, r4, r5, r6, r7)
            int r11 = d.i.f6324r0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.q(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L3c
            int r11 = r9.m(r11, r8)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L3c
            android.widget.CompoundButton r12 = r10.f8352a     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            android.graphics.drawable.Drawable r11 = f.AbstractC0467a.b(r0, r11)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            goto L57
        L39:
            r0 = move-exception
            r11 = r0
            goto L83
        L3c:
            int r11 = d.i.f6320q0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.q(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L57
            int r11 = r9.m(r11, r8)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L57
            android.widget.CompoundButton r12 = r10.f8352a     // Catch: java.lang.Throwable -> L39
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L39
            android.graphics.drawable.Drawable r11 = f.AbstractC0467a.b(r0, r11)     // Catch: java.lang.Throwable -> L39
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L39
        L57:
            int r11 = d.i.f6328s0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.q(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L68
            android.widget.CompoundButton r12 = r10.f8352a     // Catch: java.lang.Throwable -> L39
            android.content.res.ColorStateList r11 = r9.c(r11)     // Catch: java.lang.Throwable -> L39
            Q.b.b(r12, r11)     // Catch: java.lang.Throwable -> L39
        L68:
            int r11 = d.i.f6332t0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.q(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L7f
            android.widget.CompoundButton r12 = r10.f8352a     // Catch: java.lang.Throwable -> L39
            r0 = -1
            int r11 = r9.j(r11, r0)     // Catch: java.lang.Throwable -> L39
            r0 = 0
            android.graphics.PorterDuff$Mode r11 = l.AbstractC0537C.e(r11, r0)     // Catch: java.lang.Throwable -> L39
            Q.b.c(r12, r11)     // Catch: java.lang.Throwable -> L39
        L7f:
            r9.u()
            return
        L83:
            r9.u()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0566g.e(android.util.AttributeSet, int):void");
    }

    public void f() {
        if (this.f8357f) {
            this.f8357f = false;
        } else {
            this.f8357f = true;
            a();
        }
    }

    public void g(ColorStateList colorStateList) {
        this.f8353b = colorStateList;
        this.f8355d = true;
        a();
    }

    public void h(PorterDuff.Mode mode) {
        this.f8354c = mode;
        this.f8356e = true;
        a();
    }

    public int b(int i3) {
        return i3;
    }
}

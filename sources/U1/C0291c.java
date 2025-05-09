package U1;

import T1.b;
import android.text.TextUtils;
import java.io.IOException;

/* renamed from: U1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291c extends b.a {

    /* renamed from: a, reason: collision with root package name */
    public long f2116a = 20;

    /* renamed from: b, reason: collision with root package name */
    public int f2117b = 0;

    /* renamed from: c, reason: collision with root package name */
    public b.C0056b[] f2118c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f2119d;

    public C a() {
        String[] strArr = this.f2119d;
        return strArr != null ? c(strArr) : e();
    }

    public C b(Process process) {
        try {
            C c3 = new C(this, process);
            if (d(8)) {
                T1.b.f2058g = true;
            }
            AbstractC0294f.c(c3);
            if (this.f2118c != null) {
                F.c();
                for (b.C0056b c0056b : this.f2118c) {
                }
            }
            return c3;
        } catch (IOException e3) {
            throw new T1.a("Unable to create a shell!", e3);
        }
    }

    public final C c(String... strArr) {
        try {
            TextUtils.join(" ", strArr);
            return b(Runtime.getRuntime().exec(strArr));
        } catch (IOException e3) {
            throw new T1.a("Unable to create a shell!", e3);
        }
    }

    public boolean d(int i3) {
        return (this.f2117b & i3) == i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r1.d() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final U1.C e() {
        /*
            r5 = this;
            r0 = 1
            boolean r1 = r5.d(r0)
            java.lang.String r2 = "su"
            r3 = 0
            if (r1 != 0) goto L21
            r1 = 2
            boolean r1 = r5.d(r1)
            if (r1 == 0) goto L21
            java.lang.String r1 = "--mount-master"
            java.lang.String[] r1 = new java.lang.String[]{r2, r1}     // Catch: T1.a -> L21
            U1.C r1 = r5.c(r1)     // Catch: T1.a -> L21
            boolean r4 = r1.d()     // Catch: T1.a -> L22
            if (r4 != 0) goto L22
        L21:
            r1 = r3
        L22:
            if (r1 != 0) goto L3b
            boolean r4 = r5.d(r0)
            if (r4 != 0) goto L3b
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: T1.a -> L3b
            U1.C r1 = r5.c(r2)     // Catch: T1.a -> L3b
            boolean r2 = r1.d()     // Catch: T1.a -> L3b
            if (r2 != 0) goto L39
            goto L3a
        L39:
            r3 = r1
        L3a:
            r1 = r3
        L3b:
            if (r1 != 0) goto L51
            boolean r0 = r5.d(r0)
            if (r0 != 0) goto L47
            r0 = 0
            U1.F.k(r0)
        L47:
            java.lang.String r0 = "sh"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            U1.C r1 = r5.c(r0)
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.C0291c.e():U1.C");
    }
}

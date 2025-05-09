package M2;

import P2.C;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends C {

    /* renamed from: i, reason: collision with root package name */
    public final b f1421i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceArray f1422j;

    public j(long j3, j jVar, b bVar, int i3) {
        super(j3, jVar, i3);
        this.f1421i = bVar;
        this.f1422j = new AtomicReferenceArray(c.f1395b * 2);
    }

    public final void A(int i3, Object obj) {
        this.f1422j.set((i3 * 2) + 1, obj);
    }

    public final void B(int i3, Object obj) {
        z(i3, obj);
    }

    @Override // P2.C
    public int n() {
        return c.f1395b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0062, code lost:
    
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0067, code lost:
    
        r4 = u().f1386f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006d, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x006f, code lost:
    
        P2.x.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // P2.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(int r4, java.lang.Throwable r5, s2.i r6) {
        /*
            r3 = this;
            int r5 = M2.c.f1395b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof K2.N0
            if (r2 != 0) goto L73
            boolean r2 = r1 instanceof M2.u
            if (r2 == 0) goto L1b
            goto L73
        L1b:
            P2.F r2 = M2.c.j()
            if (r1 == r2) goto L62
            P2.F r2 = M2.c.i()
            if (r1 != r2) goto L28
            goto L62
        L28:
            P2.F r2 = M2.c.p()
            if (r1 == r2) goto Le
            P2.F r2 = M2.c.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            P2.F r4 = M2.c.f()
            if (r1 == r4) goto L99
            P2.F r4 = M2.c.f1397d
            if (r1 != r4) goto L40
            goto L99
        L40:
            P2.F r4 = M2.c.z()
            if (r1 != r4) goto L47
            goto L99
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            r3.s(r4)
            if (r0 == 0) goto L99
            M2.b r4 = r3.u()
            B2.l r4 = r4.f1386f
            if (r4 == 0) goto L99
            P2.x.b(r4, r5, r6)
            return
        L73:
            if (r0 == 0) goto L7a
            P2.F r2 = M2.c.j()
            goto L7e
        L7a:
            P2.F r2 = M2.c.i()
        L7e:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L99
            M2.b r4 = r3.u()
            B2.l r4 = r4.f1386f
            if (r4 == 0) goto L99
            P2.x.b(r4, r5, r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.j.o(int, java.lang.Throwable, s2.i):void");
    }

    public final boolean r(int i3, Object obj, Object obj2) {
        return i.a(this.f1422j, (i3 * 2) + 1, obj, obj2);
    }

    public final void s(int i3) {
        z(i3, null);
    }

    public final Object t(int i3, Object obj) {
        return this.f1422j.getAndSet((i3 * 2) + 1, obj);
    }

    public final b u() {
        b bVar = this.f1421i;
        C2.k.b(bVar);
        return bVar;
    }

    public final Object v(int i3) {
        return this.f1422j.get(i3 * 2);
    }

    public final Object w(int i3) {
        return this.f1422j.get((i3 * 2) + 1);
    }

    public final void x(int i3, boolean z3) {
        if (z3) {
            u().G0((this.f1739g * c.f1395b) + i3);
        }
        p();
    }

    public final Object y(int i3) {
        Object v3 = v(i3);
        s(i3);
        return v3;
    }

    public final void z(int i3, Object obj) {
        this.f1422j.lazySet(i3 * 2, obj);
    }
}

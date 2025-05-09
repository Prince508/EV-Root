package s0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import s0.AbstractC0715k;

/* loaded from: classes.dex */
public class w extends AbstractC0715k {

    /* renamed from: V, reason: collision with root package name */
    public int f9270V;

    /* renamed from: T, reason: collision with root package name */
    public ArrayList f9268T = new ArrayList();

    /* renamed from: U, reason: collision with root package name */
    public boolean f9269U = true;

    /* renamed from: W, reason: collision with root package name */
    public boolean f9271W = false;

    /* renamed from: X, reason: collision with root package name */
    public int f9272X = 0;

    public class a extends s {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0715k f9273a;

        public a(AbstractC0715k abstractC0715k) {
            this.f9273a = abstractC0715k;
        }

        @Override // s0.s, s0.AbstractC0715k.h
        public void a(AbstractC0715k abstractC0715k) {
            this.f9273a.f0();
            abstractC0715k.b0(this);
        }
    }

    public class b extends s {
        public b() {
        }

        @Override // s0.s, s0.AbstractC0715k.h
        public void j(AbstractC0715k abstractC0715k) {
            w.this.f9268T.remove(abstractC0715k);
            if (w.this.M()) {
                return;
            }
            w.this.X(AbstractC0715k.i.f9257c, false);
            w wVar = w.this;
            wVar.f9204F = true;
            wVar.X(AbstractC0715k.i.f9256b, false);
        }
    }

    public static class c extends s {

        /* renamed from: a, reason: collision with root package name */
        public w f9276a;

        public c(w wVar) {
            this.f9276a = wVar;
        }

        @Override // s0.s, s0.AbstractC0715k.h
        public void a(AbstractC0715k abstractC0715k) {
            w wVar = this.f9276a;
            int i3 = wVar.f9270V - 1;
            wVar.f9270V = i3;
            if (i3 == 0) {
                wVar.f9271W = false;
                wVar.u();
            }
            abstractC0715k.b0(this);
        }

        @Override // s0.s, s0.AbstractC0715k.h
        public void f(AbstractC0715k abstractC0715k) {
            w wVar = this.f9276a;
            if (wVar.f9271W) {
                return;
            }
            wVar.n0();
            this.f9276a.f9271W = true;
        }
    }

    public w A0(int i3) {
        if (i3 == 0) {
            this.f9269U = true;
            return this;
        }
        if (i3 == 1) {
            this.f9269U = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i3);
    }

    @Override // s0.AbstractC0715k
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public w m0(long j3) {
        return (w) super.m0(j3);
    }

    public final void C0() {
        c cVar = new c(this);
        Iterator it = this.f9268T.iterator();
        while (it.hasNext()) {
            ((AbstractC0715k) it.next()).c(cVar);
        }
        this.f9270V = this.f9268T.size();
    }

    @Override // s0.AbstractC0715k
    public boolean M() {
        for (int i3 = 0; i3 < this.f9268T.size(); i3++) {
            if (((AbstractC0715k) this.f9268T.get(i3)).M()) {
                return true;
            }
        }
        return false;
    }

    @Override // s0.AbstractC0715k
    public boolean N() {
        int size = this.f9268T.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!((AbstractC0715k) this.f9268T.get(i3)).N()) {
                return false;
            }
        }
        return true;
    }

    @Override // s0.AbstractC0715k
    public void Y(View view) {
        super.Y(view);
        int size = this.f9268T.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC0715k) this.f9268T.get(i3)).Y(view);
        }
    }

    @Override // s0.AbstractC0715k
    public void a0() {
        this.f9211M = 0L;
        b bVar = new b();
        for (int i3 = 0; i3 < this.f9268T.size(); i3++) {
            AbstractC0715k abstractC0715k = (AbstractC0715k) this.f9268T.get(i3);
            abstractC0715k.c(bVar);
            abstractC0715k.a0();
            long J3 = abstractC0715k.J();
            if (this.f9269U) {
                this.f9211M = Math.max(this.f9211M, J3);
            } else {
                long j3 = this.f9211M;
                abstractC0715k.f9213O = j3;
                this.f9211M = j3 + J3;
            }
        }
    }

    @Override // s0.AbstractC0715k
    public void d0(View view) {
        super.d0(view);
        int size = this.f9268T.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC0715k) this.f9268T.get(i3)).d0(view);
        }
    }

    @Override // s0.AbstractC0715k
    public void f0() {
        if (this.f9268T.isEmpty()) {
            n0();
            u();
            return;
        }
        C0();
        if (this.f9269U) {
            Iterator it = this.f9268T.iterator();
            while (it.hasNext()) {
                ((AbstractC0715k) it.next()).f0();
            }
            return;
        }
        for (int i3 = 1; i3 < this.f9268T.size(); i3++) {
            ((AbstractC0715k) this.f9268T.get(i3 - 1)).c(new a((AbstractC0715k) this.f9268T.get(i3)));
        }
        AbstractC0715k abstractC0715k = (AbstractC0715k) this.f9268T.get(0);
        if (abstractC0715k != null) {
            abstractC0715k.f0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // s0.AbstractC0715k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g0(long r20, long r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r5 = r0.J()
            s0.w r7 = r0.f9231v
            r8 = 0
            if (r7 == 0) goto L22
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L18
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 < 0) goto Lc2
        L18:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L22
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L22
            goto Lc2
        L22:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r10 = 0
            r11 = 1
            if (r7 >= 0) goto L2a
            r12 = r11
            goto L2b
        L2a:
            r12 = r10
        L2b:
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 < 0) goto L33
            int r14 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r14 < 0) goto L3b
        L33:
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 > 0) goto L42
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 <= 0) goto L42
        L3b:
            r0.f9204F = r10
            s0.k$i r14 = s0.AbstractC0715k.i.f9255a
            r0.X(r14, r12)
        L42:
            boolean r14 = r0.f9269U
            if (r14 == 0) goto L5f
        L46:
            java.util.ArrayList r7 = r0.f9268T
            int r7 = r7.size()
            if (r10 >= r7) goto L5c
            java.util.ArrayList r7 = r0.f9268T
            java.lang.Object r7 = r7.get(r10)
            s0.k r7 = (s0.AbstractC0715k) r7
            r7.g0(r1, r3)
            int r10 = r10 + 1
            goto L46
        L5c:
            r16 = r8
            goto La7
        L5f:
            int r10 = r0.v0(r3)
            if (r7 < 0) goto L8a
        L65:
            java.util.ArrayList r7 = r0.f9268T
            int r7 = r7.size()
            if (r10 >= r7) goto L5c
            java.util.ArrayList r7 = r0.f9268T
            java.lang.Object r7 = r7.get(r10)
            s0.k r7 = (s0.AbstractC0715k) r7
            long r14 = r7.f9213O
            r16 = r8
            long r8 = r1 - r14
            int r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r18 >= 0) goto L80
            goto La7
        L80:
            long r14 = r3 - r14
            r7.g0(r8, r14)
            int r10 = r10 + 1
            r8 = r16
            goto L65
        L8a:
            r16 = r8
        L8c:
            if (r10 < 0) goto La7
            java.util.ArrayList r7 = r0.f9268T
            java.lang.Object r7 = r7.get(r10)
            s0.k r7 = (s0.AbstractC0715k) r7
            long r8 = r7.f9213O
            long r14 = r1 - r8
            long r8 = r3 - r8
            r7.g0(r14, r8)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 < 0) goto La4
            goto La7
        La4:
            int r10 = r10 + (-1)
            goto L8c
        La7:
            s0.w r7 = r0.f9231v
            if (r7 == 0) goto Lc2
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lb3
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto Lb9
        Lb3:
            if (r13 >= 0) goto Lc2
            int r2 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r2 < 0) goto Lc2
        Lb9:
            if (r1 <= 0) goto Lbd
            r0.f9204F = r11
        Lbd:
            s0.k$i r1 = s0.AbstractC0715k.i.f9256b
            r0.X(r1, r12)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.w.g0(long, long):void");
    }

    @Override // s0.AbstractC0715k
    public void i0(AbstractC0715k.e eVar) {
        super.i0(eVar);
        this.f9272X |= 8;
        int size = this.f9268T.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC0715k) this.f9268T.get(i3)).i0(eVar);
        }
    }

    @Override // s0.AbstractC0715k
    public void j() {
        super.j();
        int size = this.f9268T.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC0715k) this.f9268T.get(i3)).j();
        }
    }

    @Override // s0.AbstractC0715k
    public void k(y yVar) {
        if (P(yVar.f9279b)) {
            Iterator it = this.f9268T.iterator();
            while (it.hasNext()) {
                AbstractC0715k abstractC0715k = (AbstractC0715k) it.next();
                if (abstractC0715k.P(yVar.f9279b)) {
                    abstractC0715k.k(yVar);
                    yVar.f9280c.add(abstractC0715k);
                }
            }
        }
    }

    @Override // s0.AbstractC0715k
    public void k0(AbstractC0711g abstractC0711g) {
        super.k0(abstractC0711g);
        this.f9272X |= 4;
        if (this.f9268T != null) {
            for (int i3 = 0; i3 < this.f9268T.size(); i3++) {
                ((AbstractC0715k) this.f9268T.get(i3)).k0(abstractC0711g);
            }
        }
    }

    @Override // s0.AbstractC0715k
    public void l0(u uVar) {
        super.l0(uVar);
        this.f9272X |= 2;
        int size = this.f9268T.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC0715k) this.f9268T.get(i3)).l0(uVar);
        }
    }

    @Override // s0.AbstractC0715k
    public void m(y yVar) {
        super.m(yVar);
        int size = this.f9268T.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((AbstractC0715k) this.f9268T.get(i3)).m(yVar);
        }
    }

    @Override // s0.AbstractC0715k
    public void n(y yVar) {
        if (P(yVar.f9279b)) {
            Iterator it = this.f9268T.iterator();
            while (it.hasNext()) {
                AbstractC0715k abstractC0715k = (AbstractC0715k) it.next();
                if (abstractC0715k.P(yVar.f9279b)) {
                    abstractC0715k.n(yVar);
                    yVar.f9280c.add(abstractC0715k);
                }
            }
        }
    }

    @Override // s0.AbstractC0715k
    public String o0(String str) {
        String o02 = super.o0(str);
        for (int i3 = 0; i3 < this.f9268T.size(); i3++) {
            StringBuilder sb = new StringBuilder();
            sb.append(o02);
            sb.append("\n");
            sb.append(((AbstractC0715k) this.f9268T.get(i3)).o0(str + "  "));
            o02 = sb.toString();
        }
        return o02;
    }

    @Override // s0.AbstractC0715k
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public w c(AbstractC0715k.h hVar) {
        return (w) super.c(hVar);
    }

    @Override // s0.AbstractC0715k
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC0715k clone() {
        w wVar = (w) super.clone();
        wVar.f9268T = new ArrayList();
        int size = this.f9268T.size();
        for (int i3 = 0; i3 < size; i3++) {
            wVar.s0(((AbstractC0715k) this.f9268T.get(i3)).clone());
        }
        return wVar;
    }

    @Override // s0.AbstractC0715k
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public w e(View view) {
        for (int i3 = 0; i3 < this.f9268T.size(); i3++) {
            ((AbstractC0715k) this.f9268T.get(i3)).e(view);
        }
        return (w) super.e(view);
    }

    public w r0(AbstractC0715k abstractC0715k) {
        s0(abstractC0715k);
        long j3 = this.f9216g;
        if (j3 >= 0) {
            abstractC0715k.h0(j3);
        }
        if ((this.f9272X & 1) != 0) {
            abstractC0715k.j0(x());
        }
        if ((this.f9272X & 2) != 0) {
            B();
            abstractC0715k.l0(null);
        }
        if ((this.f9272X & 4) != 0) {
            abstractC0715k.k0(A());
        }
        if ((this.f9272X & 8) != 0) {
            abstractC0715k.i0(w());
        }
        return this;
    }

    @Override // s0.AbstractC0715k
    public void s(ViewGroup viewGroup, z zVar, z zVar2, ArrayList arrayList, ArrayList arrayList2) {
        long E3 = E();
        int size = this.f9268T.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0715k abstractC0715k = (AbstractC0715k) this.f9268T.get(i3);
            if (E3 > 0 && (this.f9269U || i3 == 0)) {
                long E4 = abstractC0715k.E();
                if (E4 > 0) {
                    abstractC0715k.m0(E4 + E3);
                } else {
                    abstractC0715k.m0(E3);
                }
            }
            abstractC0715k.s(viewGroup, zVar, zVar2, arrayList, arrayList2);
        }
    }

    public final void s0(AbstractC0715k abstractC0715k) {
        this.f9268T.add(abstractC0715k);
        abstractC0715k.f9231v = this;
    }

    public AbstractC0715k t0(int i3) {
        if (i3 < 0 || i3 >= this.f9268T.size()) {
            return null;
        }
        return (AbstractC0715k) this.f9268T.get(i3);
    }

    public int u0() {
        return this.f9268T.size();
    }

    public final int v0(long j3) {
        for (int i3 = 1; i3 < this.f9268T.size(); i3++) {
            if (((AbstractC0715k) this.f9268T.get(i3)).f9213O > j3) {
                return i3 - 1;
            }
        }
        return this.f9268T.size() - 1;
    }

    @Override // s0.AbstractC0715k
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public w b0(AbstractC0715k.h hVar) {
        return (w) super.b0(hVar);
    }

    @Override // s0.AbstractC0715k
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public w c0(View view) {
        for (int i3 = 0; i3 < this.f9268T.size(); i3++) {
            ((AbstractC0715k) this.f9268T.get(i3)).c0(view);
        }
        return (w) super.c0(view);
    }

    @Override // s0.AbstractC0715k
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public w h0(long j3) {
        ArrayList arrayList;
        super.h0(j3);
        if (this.f9216g >= 0 && (arrayList = this.f9268T) != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC0715k) this.f9268T.get(i3)).h0(j3);
            }
        }
        return this;
    }

    @Override // s0.AbstractC0715k
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public w j0(TimeInterpolator timeInterpolator) {
        this.f9272X |= 1;
        ArrayList arrayList = this.f9268T;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC0715k) this.f9268T.get(i3)).j0(timeInterpolator);
            }
        }
        return (w) super.j0(timeInterpolator);
    }
}

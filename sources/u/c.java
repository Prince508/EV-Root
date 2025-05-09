package u;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends m {

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f9541k;

    /* renamed from: l, reason: collision with root package name */
    public int f9542l;

    public c(t.e eVar, int i3) {
        super(eVar);
        this.f9541k = new ArrayList();
        this.f9592f = i3;
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b8, code lost:
    
        if (r2 != r7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e4, code lost:
    
        r12 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01e0, code lost:
    
        r12 = r25 + 1;
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01de, code lost:
    
        if (r2 != r7) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0414, code lost:
    
        r1 = r1 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d6, code lost:
    
        if (r2.f9561j != false) goto L58;
     */
    @Override // u.m, u.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(u.d r27) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.c.a(u.d):void");
    }

    @Override // u.m
    public void d() {
        Iterator it = this.f9541k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).d();
        }
        int size = this.f9541k.size();
        if (size < 1) {
            return;
        }
        t.e eVar = ((m) this.f9541k.get(0)).f9588b;
        t.e eVar2 = ((m) this.f9541k.get(size - 1)).f9588b;
        if (this.f9592f == 0) {
            t.d dVar = eVar.f9338B;
            t.d dVar2 = eVar2.f9340D;
            f i3 = i(dVar, 0);
            int c3 = dVar.c();
            t.e r3 = r();
            if (r3 != null) {
                c3 = r3.f9338B.c();
            }
            if (i3 != null) {
                b(this.f9594h, i3, c3);
            }
            f i4 = i(dVar2, 0);
            int c4 = dVar2.c();
            t.e s3 = s();
            if (s3 != null) {
                c4 = s3.f9340D.c();
            }
            if (i4 != null) {
                b(this.f9595i, i4, -c4);
            }
        } else {
            t.d dVar3 = eVar.f9339C;
            t.d dVar4 = eVar2.f9341E;
            f i5 = i(dVar3, 1);
            int c5 = dVar3.c();
            t.e r4 = r();
            if (r4 != null) {
                c5 = r4.f9339C.c();
            }
            if (i5 != null) {
                b(this.f9594h, i5, c5);
            }
            f i6 = i(dVar4, 1);
            int c6 = dVar4.c();
            t.e s4 = s();
            if (s4 != null) {
                c6 = s4.f9341E.c();
            }
            if (i6 != null) {
                b(this.f9595i, i6, -c6);
            }
        }
        this.f9594h.f9552a = this;
        this.f9595i.f9552a = this;
    }

    @Override // u.m
    public void e() {
        for (int i3 = 0; i3 < this.f9541k.size(); i3++) {
            ((m) this.f9541k.get(i3)).e();
        }
    }

    @Override // u.m
    public void f() {
        this.f9589c = null;
        Iterator it = this.f9541k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
    }

    @Override // u.m
    public long j() {
        int size = this.f9541k.size();
        long j3 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            j3 = j3 + r4.f9594h.f9557f + ((m) this.f9541k.get(i3)).j() + r4.f9595i.f9557f;
        }
        return j3;
    }

    @Override // u.m
    public boolean m() {
        int size = this.f9541k.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!((m) this.f9541k.get(i3)).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        t.e eVar;
        t.e eVar2 = this.f9588b;
        t.e H3 = eVar2.H(this.f9592f);
        while (true) {
            t.e eVar3 = H3;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            } else {
                H3 = eVar2.H(this.f9592f);
            }
        }
        this.f9588b = eVar;
        this.f9541k.add(eVar.J(this.f9592f));
        t.e F3 = eVar.F(this.f9592f);
        while (F3 != null) {
            this.f9541k.add(F3.J(this.f9592f));
            F3 = F3.F(this.f9592f);
        }
        Iterator it = this.f9541k.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            int i3 = this.f9592f;
            if (i3 == 0) {
                mVar.f9588b.f9367c = this;
            } else if (i3 == 1) {
                mVar.f9588b.f9369d = this;
            }
        }
        if (this.f9592f == 0 && ((t.f) this.f9588b.G()).a1() && this.f9541k.size() > 1) {
            ArrayList arrayList = this.f9541k;
            this.f9588b = ((m) arrayList.get(arrayList.size() - 1)).f9588b;
        }
        this.f9542l = this.f9592f == 0 ? this.f9588b.x() : this.f9588b.L();
    }

    public final t.e r() {
        for (int i3 = 0; i3 < this.f9541k.size(); i3++) {
            m mVar = (m) this.f9541k.get(i3);
            if (mVar.f9588b.O() != 8) {
                return mVar.f9588b;
            }
        }
        return null;
    }

    public final t.e s() {
        for (int size = this.f9541k.size() - 1; size >= 0; size--) {
            m mVar = (m) this.f9541k.get(size);
            if (mVar.f9588b.O() != 8) {
                return mVar.f9588b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f9592f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator it = this.f9541k.iterator();
        while (it.hasNext()) {
            String str = sb2 + "<";
            sb2 = (str + ((m) it.next())) + "> ";
        }
        return sb2;
    }
}

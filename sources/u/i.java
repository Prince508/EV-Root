package u;

import java.util.Iterator;
import t.C0723a;
import u.f;

/* loaded from: classes.dex */
public class i extends m {
    public i(t.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f9594h.f9562k.add(fVar);
        fVar.f9563l.add(this.f9594h);
    }

    @Override // u.m, u.d
    public void a(d dVar) {
        C0723a c0723a = (C0723a) this.f9588b;
        int L02 = c0723a.L0();
        Iterator it = this.f9594h.f9563l.iterator();
        int i3 = 0;
        int i4 = -1;
        while (it.hasNext()) {
            int i5 = ((f) it.next()).f9558g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (L02 == 0 || L02 == 2) {
            this.f9594h.d(i4 + c0723a.M0());
        } else {
            this.f9594h.d(i3 + c0723a.M0());
        }
    }

    @Override // u.m
    public void d() {
        t.e eVar = this.f9588b;
        if (eVar instanceof C0723a) {
            this.f9594h.f9553b = true;
            C0723a c0723a = (C0723a) eVar;
            int L02 = c0723a.L0();
            boolean K02 = c0723a.K0();
            int i3 = 0;
            if (L02 == 0) {
                this.f9594h.f9556e = f.a.LEFT;
                while (i3 < c0723a.f9491x0) {
                    t.e eVar2 = c0723a.f9490w0[i3];
                    if (K02 || eVar2.O() != 8) {
                        f fVar = eVar2.f9371e.f9594h;
                        fVar.f9562k.add(this.f9594h);
                        this.f9594h.f9563l.add(fVar);
                    }
                    i3++;
                }
                q(this.f9588b.f9371e.f9594h);
                q(this.f9588b.f9371e.f9595i);
                return;
            }
            if (L02 == 1) {
                this.f9594h.f9556e = f.a.RIGHT;
                while (i3 < c0723a.f9491x0) {
                    t.e eVar3 = c0723a.f9490w0[i3];
                    if (K02 || eVar3.O() != 8) {
                        f fVar2 = eVar3.f9371e.f9595i;
                        fVar2.f9562k.add(this.f9594h);
                        this.f9594h.f9563l.add(fVar2);
                    }
                    i3++;
                }
                q(this.f9588b.f9371e.f9594h);
                q(this.f9588b.f9371e.f9595i);
                return;
            }
            if (L02 == 2) {
                this.f9594h.f9556e = f.a.TOP;
                while (i3 < c0723a.f9491x0) {
                    t.e eVar4 = c0723a.f9490w0[i3];
                    if (K02 || eVar4.O() != 8) {
                        f fVar3 = eVar4.f9373f.f9594h;
                        fVar3.f9562k.add(this.f9594h);
                        this.f9594h.f9563l.add(fVar3);
                    }
                    i3++;
                }
                q(this.f9588b.f9373f.f9594h);
                q(this.f9588b.f9373f.f9595i);
                return;
            }
            if (L02 != 3) {
                return;
            }
            this.f9594h.f9556e = f.a.BOTTOM;
            while (i3 < c0723a.f9491x0) {
                t.e eVar5 = c0723a.f9490w0[i3];
                if (K02 || eVar5.O() != 8) {
                    f fVar4 = eVar5.f9373f.f9595i;
                    fVar4.f9562k.add(this.f9594h);
                    this.f9594h.f9563l.add(fVar4);
                }
                i3++;
            }
            q(this.f9588b.f9373f.f9594h);
            q(this.f9588b.f9373f.f9595i);
        }
    }

    @Override // u.m
    public void e() {
        t.e eVar = this.f9588b;
        if (eVar instanceof C0723a) {
            int L02 = ((C0723a) eVar).L0();
            if (L02 == 0 || L02 == 1) {
                this.f9588b.F0(this.f9594h.f9558g);
            } else {
                this.f9588b.G0(this.f9594h.f9558g);
            }
        }
    }

    @Override // u.m
    public void f() {
        this.f9589c = null;
        this.f9594h.c();
    }

    @Override // u.m
    public boolean m() {
        return false;
    }
}

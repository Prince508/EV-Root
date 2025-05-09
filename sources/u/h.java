package u;

/* loaded from: classes.dex */
public class h extends m {
    public h(t.e eVar) {
        super(eVar);
        eVar.f9371e.f();
        eVar.f9373f.f();
        this.f9592f = ((t.h) eVar).K0();
    }

    @Override // u.m, u.d
    public void a(d dVar) {
        f fVar = this.f9594h;
        if (fVar.f9554c && !fVar.f9561j) {
            this.f9594h.d((int) ((((f) fVar.f9563l.get(0)).f9558g * ((t.h) this.f9588b).N0()) + 0.5f));
        }
    }

    @Override // u.m
    public void d() {
        t.h hVar = (t.h) this.f9588b;
        int L02 = hVar.L0();
        int M02 = hVar.M0();
        hVar.N0();
        if (hVar.K0() == 1) {
            if (L02 != -1) {
                this.f9594h.f9563l.add(this.f9588b.f9350N.f9371e.f9594h);
                this.f9588b.f9350N.f9371e.f9594h.f9562k.add(this.f9594h);
                this.f9594h.f9557f = L02;
            } else if (M02 != -1) {
                this.f9594h.f9563l.add(this.f9588b.f9350N.f9371e.f9595i);
                this.f9588b.f9350N.f9371e.f9595i.f9562k.add(this.f9594h);
                this.f9594h.f9557f = -M02;
            } else {
                f fVar = this.f9594h;
                fVar.f9553b = true;
                fVar.f9563l.add(this.f9588b.f9350N.f9371e.f9595i);
                this.f9588b.f9350N.f9371e.f9595i.f9562k.add(this.f9594h);
            }
            q(this.f9588b.f9371e.f9594h);
            q(this.f9588b.f9371e.f9595i);
            return;
        }
        if (L02 != -1) {
            this.f9594h.f9563l.add(this.f9588b.f9350N.f9373f.f9594h);
            this.f9588b.f9350N.f9373f.f9594h.f9562k.add(this.f9594h);
            this.f9594h.f9557f = L02;
        } else if (M02 != -1) {
            this.f9594h.f9563l.add(this.f9588b.f9350N.f9373f.f9595i);
            this.f9588b.f9350N.f9373f.f9595i.f9562k.add(this.f9594h);
            this.f9594h.f9557f = -M02;
        } else {
            f fVar2 = this.f9594h;
            fVar2.f9553b = true;
            fVar2.f9563l.add(this.f9588b.f9350N.f9373f.f9595i);
            this.f9588b.f9350N.f9373f.f9595i.f9562k.add(this.f9594h);
        }
        q(this.f9588b.f9373f.f9594h);
        q(this.f9588b.f9373f.f9595i);
    }

    @Override // u.m
    public void e() {
        if (((t.h) this.f9588b).K0() == 1) {
            this.f9588b.F0(this.f9594h.f9558g);
        } else {
            this.f9588b.G0(this.f9594h.f9558g);
        }
    }

    @Override // u.m
    public void f() {
        this.f9594h.c();
    }

    @Override // u.m
    public boolean m() {
        return false;
    }

    public final void q(f fVar) {
        this.f9594h.f9562k.add(fVar);
        fVar.f9563l.add(this.f9594h);
    }
}

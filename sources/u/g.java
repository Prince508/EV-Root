package u;

import u.f;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f9573m;

    public g(m mVar) {
        super(mVar);
        if (mVar instanceof j) {
            this.f9556e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f9556e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // u.f
    public void d(int i3) {
        if (this.f9561j) {
            return;
        }
        this.f9561j = true;
        this.f9558g = i3;
        for (d dVar : this.f9562k) {
            dVar.a(dVar);
        }
    }
}

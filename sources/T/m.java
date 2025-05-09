package t;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class m extends e {

    /* renamed from: w0, reason: collision with root package name */
    public ArrayList f9506w0 = new ArrayList();

    public abstract void K0();

    public void L0(e eVar) {
        this.f9506w0.remove(eVar);
        eVar.w0(null);
    }

    public void M0() {
        this.f9506w0.clear();
    }

    @Override // t.e
    public void Y() {
        this.f9506w0.clear();
        super.Y();
    }

    @Override // t.e
    public void a0(s.c cVar) {
        super.a0(cVar);
        int size = this.f9506w0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((e) this.f9506w0.get(i3)).a0(cVar);
        }
    }

    public void c(e eVar) {
        this.f9506w0.add(eVar);
        if (eVar.G() != null) {
            ((m) eVar.G()).L0(eVar);
        }
        eVar.w0(this);
    }
}

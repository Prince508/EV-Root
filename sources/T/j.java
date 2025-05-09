package t;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class j extends e implements i {

    /* renamed from: w0, reason: collision with root package name */
    public e[] f9490w0 = new e[4];

    /* renamed from: x0, reason: collision with root package name */
    public int f9491x0 = 0;

    @Override // t.i
    public void b() {
        this.f9491x0 = 0;
        Arrays.fill(this.f9490w0, (Object) null);
    }

    @Override // t.i
    public void c(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i3 = this.f9491x0 + 1;
        e[] eVarArr = this.f9490w0;
        if (i3 > eVarArr.length) {
            this.f9490w0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f9490w0;
        int i4 = this.f9491x0;
        eVarArr2[i4] = eVar;
        this.f9491x0 = i4 + 1;
    }

    @Override // t.i
    public void a(f fVar) {
    }
}

package R2;

import K2.M;

/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f1947g;

    public k(Runnable runnable, long j3, i iVar) {
        super(j3, iVar);
        this.f1947g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f1947g.run();
        } finally {
            this.f1945f.b();
        }
    }

    public String toString() {
        return "Task[" + M.a(this.f1947g) + '@' + M.b(this.f1947g) + ", " + this.f1944e + ", " + this.f1945f + ']';
    }
}

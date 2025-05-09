package J;

import C2.k;

/* loaded from: classes.dex */
public class f extends e {

    /* renamed from: c, reason: collision with root package name */
    public final Object f836c;

    public f(int i3) {
        super(i3);
        this.f836c = new Object();
    }

    @Override // J.e, J.d
    public boolean a(Object obj) {
        boolean a3;
        k.e(obj, "instance");
        synchronized (this.f836c) {
            a3 = super.a(obj);
        }
        return a3;
    }

    @Override // J.e, J.d
    public Object b() {
        Object b3;
        synchronized (this.f836c) {
            b3 = super.b();
        }
        return b3;
    }
}

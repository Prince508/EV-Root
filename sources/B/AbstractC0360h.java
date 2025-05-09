package b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: b.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0360h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4674a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f4675b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public B2.a f4676c;

    public AbstractC0360h(boolean z3) {
        this.f4674a = z3;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(C0354b c0354b);

    public abstract void d(C0354b c0354b);

    public final boolean e() {
        return this.f4674a;
    }

    public final void f() {
        Iterator it = this.f4675b.iterator();
        while (it.hasNext()) {
            ((InterfaceC0355c) it.next()).cancel();
        }
    }

    public final void g(boolean z3) {
        this.f4674a = z3;
        B2.a aVar = this.f4676c;
        if (aVar != null) {
            aVar.b();
        }
    }
}

package q2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements d, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public B2.a f8870e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f8871f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f8872g;

    public j(B2.a aVar, Object obj) {
        C2.k.e(aVar, "initializer");
        this.f8870e = aVar;
        this.f8871f = l.f8873a;
        this.f8872g = obj == null ? this : obj;
    }

    public boolean a() {
        return this.f8871f != l.f8873a;
    }

    @Override // q2.d
    public Object getValue() {
        Object obj;
        Object obj2 = this.f8871f;
        l lVar = l.f8873a;
        if (obj2 != lVar) {
            return obj2;
        }
        synchronized (this.f8872g) {
            obj = this.f8871f;
            if (obj == lVar) {
                B2.a aVar = this.f8870e;
                C2.k.b(aVar);
                obj = aVar.b();
                this.f8871f = obj;
                this.f8870e = null;
            }
        }
        return obj;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ j(B2.a aVar, Object obj, int i3, C2.g gVar) {
        this(aVar, (i3 & 2) != 0 ? null : obj);
    }
}

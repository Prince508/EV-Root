package androidx.lifecycle;

import androidx.lifecycle.AbstractC0347h;
import androidx.lifecycle.E;
import i0.AbstractC0499a;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0499a.b f4038a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC0499a.b f4039b = new c();

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC0499a.b f4040c = new a();

    public static final class a implements AbstractC0499a.b {
    }

    public static final class b implements AbstractC0499a.b {
    }

    public static final class c implements AbstractC0499a.b {
    }

    public static final class d implements E.b {
        @Override // androidx.lifecycle.E.b
        public D b(Class cls, AbstractC0499a abstractC0499a) {
            C2.k.e(cls, "modelClass");
            C2.k.e(abstractC0499a, "extras");
            return new B();
        }
    }

    public static final void a(o0.f fVar) {
        C2.k.e(fVar, "<this>");
        AbstractC0347h.b b3 = fVar.h().b();
        if (b3 != AbstractC0347h.b.INITIALIZED && b3 != AbstractC0347h.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.m().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            A a3 = new A(fVar.m(), (H) fVar);
            fVar.m().h("androidx.lifecycle.internal.SavedStateHandlesProvider", a3);
            fVar.h().a(new y(a3));
        }
    }

    public static final B b(H h3) {
        C2.k.e(h3, "<this>");
        return (B) new E(h3, new d()).b("androidx.lifecycle.internal.SavedStateHandlesVM", B.class);
    }
}

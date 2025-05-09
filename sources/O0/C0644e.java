package o0;

import C2.k;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0347h;

/* renamed from: o0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f8777d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final f f8778a;

    /* renamed from: b, reason: collision with root package name */
    public final C0643d f8779b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8780c;

    /* renamed from: o0.e$a */
    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public final C0644e a(f fVar) {
            k.e(fVar, "owner");
            return new C0644e(fVar, null);
        }

        public a() {
        }
    }

    public /* synthetic */ C0644e(f fVar, C2.g gVar) {
        this(fVar);
    }

    public static final C0644e a(f fVar) {
        return f8777d.a(fVar);
    }

    public final C0643d b() {
        return this.f8779b;
    }

    public final void c() {
        AbstractC0347h h3 = this.f8778a.h();
        if (h3.b() != AbstractC0347h.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        h3.a(new C0641b(this.f8778a));
        this.f8779b.e(h3);
        this.f8780c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f8780c) {
            c();
        }
        AbstractC0347h h3 = this.f8778a.h();
        if (!h3.b().f(AbstractC0347h.b.STARTED)) {
            this.f8779b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + h3.b()).toString());
    }

    public final void e(Bundle bundle) {
        k.e(bundle, "outBundle");
        this.f8779b.g(bundle);
    }

    public C0644e(f fVar) {
        this.f8778a = fVar;
        this.f8779b = new C0643d();
    }
}

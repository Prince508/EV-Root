package j0;

import androidx.lifecycle.D;
import androidx.lifecycle.E;
import androidx.lifecycle.G;
import androidx.lifecycle.l;
import j.AbstractC0515e;
import o.h;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0517b extends AbstractC0516a {

    /* renamed from: a, reason: collision with root package name */
    public final l f7976a;

    /* renamed from: b, reason: collision with root package name */
    public final a f7977b;

    /* renamed from: j0.b$a */
    public static class a extends D {

        /* renamed from: f, reason: collision with root package name */
        public static final E.b f7978f = new C0131a();

        /* renamed from: d, reason: collision with root package name */
        public h f7979d = new h();

        /* renamed from: e, reason: collision with root package name */
        public boolean f7980e = false;

        /* renamed from: j0.b$a$a, reason: collision with other inner class name */
        public static class C0131a implements E.b {
            @Override // androidx.lifecycle.E.b
            public D a(Class cls) {
                return new a();
            }
        }

        public static a d(G g3) {
            return (a) new E(g3, f7978f).a(a.class);
        }

        @Override // androidx.lifecycle.D
        public void c() {
            super.c();
            if (this.f7979d.l() <= 0) {
                this.f7979d.b();
            } else {
                AbstractC0515e.a(this.f7979d.m(0));
                throw null;
            }
        }

        public void e() {
            if (this.f7979d.l() <= 0) {
                return;
            }
            AbstractC0515e.a(this.f7979d.m(0));
            throw null;
        }
    }

    public C0517b(l lVar, G g3) {
        this.f7976a = lVar;
        this.f7977b = a.d(g3);
    }

    @Override // j0.AbstractC0516a
    public void b() {
        this.f7977b.e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        J.b.a(this.f7976a, sb);
        sb.append("}}");
        return sb.toString();
    }
}

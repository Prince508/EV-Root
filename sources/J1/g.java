package J1;

import M1.b;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f877b = new g();

    /* renamed from: c, reason: collision with root package name */
    public static final b f878c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f879a = new AtomicReference();

    public static class b implements M1.b {
        public b() {
        }

        @Override // M1.b
        public b.a a(M1.c cVar, String str, String str2) {
            return f.f875a;
        }
    }

    public static g b() {
        return f877b;
    }

    public M1.b a() {
        M1.b bVar = (M1.b) this.f879a.get();
        return bVar == null ? f878c : bVar;
    }
}

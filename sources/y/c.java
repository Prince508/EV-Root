package Y;

import C2.k;
import C2.l;
import K2.I;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f2384a = new c();

    public static final class a extends l implements B2.a {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ B2.a f2385f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(B2.a aVar) {
            super(0);
            this.f2385f = aVar;
        }

        @Override // B2.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File b() {
            File file = (File) this.f2385f.b();
            String a3 = z2.e.a(file);
            h hVar = h.f2390a;
            if (k.a(a3, hVar.f())) {
                return file;
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: " + hVar.f()).toString());
        }
    }

    public final V.f a(W.b bVar, List list, I i3, B2.a aVar) {
        k.e(list, "migrations");
        k.e(i3, "scope");
        k.e(aVar, "produceFile");
        return new b(V.g.f2217a.a(h.f2390a, bVar, list, i3, new a(aVar)));
    }
}

package X;

import C2.k;
import C2.l;
import K2.H0;
import K2.I;
import K2.J;
import K2.V;
import android.content.Context;
import java.util.List;
import r2.AbstractC0700m;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: X.a$a, reason: collision with other inner class name */
    public static final class C0068a extends l implements B2.l {

        /* renamed from: f, reason: collision with root package name */
        public static final C0068a f2347f = new C0068a();

        public C0068a() {
            super(1);
        }

        @Override // B2.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List j(Context context) {
            k.e(context, "it");
            return AbstractC0700m.f();
        }
    }

    public static final D2.a a(String str, W.b bVar, B2.l lVar, I i3) {
        k.e(str, "name");
        k.e(lVar, "produceMigrations");
        k.e(i3, "scope");
        return new c(str, bVar, lVar, i3);
    }

    public static /* synthetic */ D2.a b(String str, W.b bVar, B2.l lVar, I i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            bVar = null;
        }
        if ((i4 & 4) != 0) {
            lVar = C0068a.f2347f;
        }
        if ((i4 & 8) != 0) {
            i3 = J.a(V.b().r(H0.b(null, 1, null)));
        }
        return a(str, bVar, lVar, i3);
    }
}

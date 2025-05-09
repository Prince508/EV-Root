package K2;

import java.io.Closeable;
import s2.i;

/* renamed from: K2.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0232f0 extends F implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final a f1194g = new a(null);

    /* renamed from: K2.f0$a */
    public static final class a extends s2.b {

        /* renamed from: K2.f0$a$a, reason: collision with other inner class name */
        public static final class C0033a extends C2.l implements B2.l {

            /* renamed from: f, reason: collision with root package name */
            public static final C0033a f1195f = new C0033a();

            public C0033a() {
                super(1);
            }

            @Override // B2.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC0232f0 j(i.b bVar) {
                if (bVar instanceof AbstractC0232f0) {
                    return (AbstractC0232f0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public a() {
            super(F.f1153f, C0033a.f1195f);
        }
    }
}

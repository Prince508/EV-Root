package J1;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final Class f890a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f891b;

    public class a extends l {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f892c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f892c = bVar;
        }

        @Override // J1.l
        public Object a(B1.g gVar) {
            return this.f892c.a(gVar);
        }
    }

    public interface b {
        Object a(B1.g gVar);
    }

    public /* synthetic */ l(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static l b(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public abstract Object a(B1.g gVar);

    public Class c() {
        return this.f890a;
    }

    public Class d() {
        return this.f891b;
    }

    public l(Class cls, Class cls2) {
        this.f890a = cls;
        this.f891b = cls2;
    }
}

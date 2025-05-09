package J1;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final Q1.a f884a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f885b;

    public class a extends j {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f886c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Q1.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f886c = bVar;
        }
    }

    public interface b {
    }

    public /* synthetic */ j(Q1.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static j a(b bVar, Q1.a aVar, Class cls) {
        return new a(aVar, cls, bVar);
    }

    public final Q1.a b() {
        return this.f884a;
    }

    public final Class c() {
        return this.f885b;
    }

    public j(Q1.a aVar, Class cls) {
        this.f884a = aVar;
        this.f885b = cls;
    }
}

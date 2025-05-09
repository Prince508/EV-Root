package J1;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public final Class f887a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f888b;

    public class a extends k {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f889c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f889c = bVar;
        }
    }

    public interface b {
    }

    public /* synthetic */ k(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static k a(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class b() {
        return this.f887a;
    }

    public Class c() {
        return this.f888b;
    }

    public k(Class cls, Class cls2) {
        this.f887a = cls;
        this.f888b = cls2;
    }
}

package J1;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Class f863a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f864b;

    public class a extends c {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f865c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f865c = bVar;
        }
    }

    public interface b {
    }

    public /* synthetic */ c(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }

    public static c a(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class b() {
        return this.f863a;
    }

    public Class c() {
        return this.f864b;
    }

    public c(Class cls, Class cls2) {
        this.f863a = cls;
        this.f864b = cls2;
    }
}

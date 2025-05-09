package J1;

import B1.y;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final Q1.a f860a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f861b;

    public class a extends b {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0025b f862c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Q1.a aVar, Class cls, InterfaceC0025b interfaceC0025b) {
            super(aVar, cls, null);
            this.f862c = interfaceC0025b;
        }

        @Override // J1.b
        public B1.g d(q qVar, y yVar) {
            return this.f862c.a(qVar, yVar);
        }
    }

    /* renamed from: J1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0025b {
        B1.g a(q qVar, y yVar);
    }

    public /* synthetic */ b(Q1.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }

    public static b a(InterfaceC0025b interfaceC0025b, Q1.a aVar, Class cls) {
        return new a(aVar, cls, interfaceC0025b);
    }

    public final Q1.a b() {
        return this.f860a;
    }

    public final Class c() {
        return this.f861b;
    }

    public abstract B1.g d(q qVar, y yVar);

    public b(Q1.a aVar, Class cls) {
        this.f860a = aVar;
        this.f861b = cls;
    }
}

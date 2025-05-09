package B1;

import J1.d;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.O;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final J1.d f71a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f72b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final d.a f73a;

        public a(d.a aVar) {
            this.f73a = aVar;
        }

        public O a(AbstractC0417h abstractC0417h) {
            return b(this.f73a.d(abstractC0417h));
        }

        public final O b(O o3) {
            this.f73a.e(o3);
            return this.f73a.a(o3);
        }
    }

    public i(J1.d dVar, Class cls) {
        if (!dVar.i().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", dVar.toString(), cls.getName()));
        }
        this.f71a = dVar;
        this.f72b = cls;
    }

    @Override // B1.h
    public final O1.y a(AbstractC0417h abstractC0417h) {
        try {
            return (O1.y) O1.y.c0().t(b()).u(e().a(abstractC0417h).h()).s(this.f71a.g()).j();
        } catch (A e3) {
            throw new GeneralSecurityException("Unexpected proto", e3);
        }
    }

    @Override // B1.h
    public final String b() {
        return this.f71a.d();
    }

    @Override // B1.h
    public final Object c(AbstractC0417h abstractC0417h) {
        try {
            return f(this.f71a.h(abstractC0417h));
        } catch (A e3) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f71a.c().getName(), e3);
        }
    }

    @Override // B1.h
    public final O d(AbstractC0417h abstractC0417h) {
        try {
            return e().a(abstractC0417h);
        } catch (A e3) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f71a.f().b().getName(), e3);
        }
    }

    public final a e() {
        return new a(this.f71a.f());
    }

    public final Object f(O o3) {
        if (Void.class.equals(this.f72b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f71a.j(o3);
        return this.f71a.e(o3, this.f72b);
    }
}

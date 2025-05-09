package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class G implements f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final N f5734b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final N f5735a;

    public class a implements N {
        @Override // com.google.crypto.tink.shaded.protobuf.N
        public boolean a(Class cls) {
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.N
        public M b(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    public static class b implements N {

        /* renamed from: a, reason: collision with root package name */
        public N[] f5736a;

        public b(N... nArr) {
            this.f5736a = nArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.N
        public boolean a(Class cls) {
            for (N n3 : this.f5736a) {
                if (n3.a(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.N
        public M b(Class cls) {
            for (N n3 : this.f5736a) {
                if (n3.a(cls)) {
                    return n3.b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public G() {
        this(b());
    }

    public static N b() {
        return new b(C0431w.c(), c());
    }

    public static N c() {
        try {
            return (N) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f5734b;
        }
    }

    public static boolean d(M m3) {
        return m3.a() == Z.PROTO2;
    }

    public static e0 e(Class cls, M m3) {
        return AbstractC0432x.class.isAssignableFrom(cls) ? d(m3) ? S.T(cls, m3, W.b(), E.b(), g0.L(), AbstractC0427s.b(), L.b()) : S.T(cls, m3, W.b(), E.b(), g0.L(), null, L.b()) : d(m3) ? S.T(cls, m3, W.a(), E.a(), g0.G(), AbstractC0427s.a(), L.a()) : S.T(cls, m3, W.a(), E.a(), g0.H(), null, L.a());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public e0 a(Class cls) {
        g0.I(cls);
        M b3 = this.f5735a.b(cls);
        return b3.c() ? AbstractC0432x.class.isAssignableFrom(cls) ? T.m(g0.L(), AbstractC0427s.b(), b3.b()) : T.m(g0.G(), AbstractC0427s.a(), b3.b()) : e(cls, b3);
    }

    public G(N n3) {
        this.f5735a = (N) AbstractC0434z.b(n3, "messageInfoFactory");
    }
}

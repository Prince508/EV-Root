package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class B implements Z {

    /* renamed from: b, reason: collision with root package name */
    public static final I f3543b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final I f3544a;

    public static class a implements I {
        @Override // androidx.datastore.preferences.protobuf.I
        public boolean a(Class cls) {
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.I
        public H b(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    public static class b implements I {

        /* renamed from: a, reason: collision with root package name */
        public I[] f3545a;

        public b(I... iArr) {
            this.f3545a = iArr;
        }

        @Override // androidx.datastore.preferences.protobuf.I
        public boolean a(Class cls) {
            for (I i3 : this.f3545a) {
                if (i3.a(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.I
        public H b(Class cls) {
            for (I i3 : this.f3545a) {
                if (i3.a(cls)) {
                    return i3.b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public B() {
        this(b());
    }

    public static I b() {
        return new b(C0332s.c(), c());
    }

    public static I c() {
        try {
            return (I) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f3543b;
        }
    }

    public static boolean d(H h3) {
        return h3.a() == T.PROTO2;
    }

    public static Y e(Class cls, H h3) {
        return AbstractC0333t.class.isAssignableFrom(cls) ? d(h3) ? M.M(cls, h3, Q.b(), A.b(), a0.L(), AbstractC0330p.b(), G.b()) : M.M(cls, h3, Q.b(), A.b(), a0.L(), null, G.b()) : d(h3) ? M.M(cls, h3, Q.a(), A.a(), a0.G(), AbstractC0330p.a(), G.a()) : M.M(cls, h3, Q.a(), A.a(), a0.H(), null, G.a());
    }

    @Override // androidx.datastore.preferences.protobuf.Z
    public Y a(Class cls) {
        a0.I(cls);
        H b3 = this.f3544a.b(cls);
        return b3.c() ? AbstractC0333t.class.isAssignableFrom(cls) ? N.l(a0.L(), AbstractC0330p.b(), b3.b()) : N.l(a0.G(), AbstractC0330p.a(), b3.b()) : e(cls, b3);
    }

    public B(I i3) {
        this.f3544a = (I) AbstractC0334u.b(i3, "messageInfoFactory");
    }
}

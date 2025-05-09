package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0431w implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final C0431w f5996a = new C0431w();

    public static C0431w c() {
        return f5996a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.N
    public boolean a(Class cls) {
        return AbstractC0432x.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.N
    public M b(Class cls) {
        if (!AbstractC0432x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (M) AbstractC0432x.v(cls.asSubclass(AbstractC0432x.class)).k();
        } catch (Exception e3) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e3);
        }
    }
}

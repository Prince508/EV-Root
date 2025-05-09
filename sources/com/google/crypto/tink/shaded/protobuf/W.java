package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public abstract class W {

    /* renamed from: a, reason: collision with root package name */
    public static final U f5765a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final U f5766b = new V();

    public static U a() {
        return f5765a;
    }

    public static U b() {
        return f5766b;
    }

    public static U c() {
        try {
            return (U) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

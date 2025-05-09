package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0427s {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0426q f5927a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC0426q f5928b = c();

    public static AbstractC0426q a() {
        AbstractC0426q abstractC0426q = f5928b;
        if (abstractC0426q != null) {
            return abstractC0426q;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC0426q b() {
        return f5927a;
    }

    public static AbstractC0426q c() {
        try {
            return (AbstractC0426q) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static final J f5739a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final J f5740b = new K();

    public static J a() {
        return f5739a;
    }

    public static J b() {
        return f5740b;
    }

    public static J c() {
        try {
            return (J) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}

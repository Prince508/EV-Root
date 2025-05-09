package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0424o {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f5856a = c();

    public static C0425p a() {
        C0425p b3 = b("getEmptyRegistry");
        return b3 != null ? b3 : C0425p.f5883d;
    }

    public static final C0425p b(String str) {
        Class cls = f5856a;
        if (cls == null) {
            return null;
        }
        try {
            return (C0425p) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}

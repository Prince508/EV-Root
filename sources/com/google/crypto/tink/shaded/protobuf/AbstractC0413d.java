package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0413d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f5782a;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f5783b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f5784c;

    static {
        f5784c = (f5782a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f5783b;
    }

    public static boolean c() {
        if (f5782a) {
            return true;
        }
        return (f5783b == null || f5784c) ? false : true;
    }
}

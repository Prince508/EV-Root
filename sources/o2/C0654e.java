package o2;

import r0.AbstractC0675a;

/* renamed from: o2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654e implements AutoCloseable {
    public C0654e(String str) {
        a(str);
    }

    public static void a(String str) {
        AbstractC0675a.c(c(str));
    }

    public static void b(String str, int i3) {
        AbstractC0675a.a(c(str), i3);
    }

    public static String c(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void d() {
        AbstractC0675a.f();
    }

    public static void e(String str, int i3) {
        AbstractC0675a.d(c(str), i3);
    }

    public static C0654e f(String str) {
        return new C0654e(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        d();
    }
}

package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f5770c = new a0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f5772b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final f0 f5771a = new G();

    public static a0 a() {
        return f5770c;
    }

    public e0 b(Class cls, e0 e0Var) {
        AbstractC0434z.b(cls, "messageType");
        AbstractC0434z.b(e0Var, "schema");
        return (e0) this.f5772b.putIfAbsent(cls, e0Var);
    }

    public e0 c(Class cls) {
        e0 b3;
        AbstractC0434z.b(cls, "messageType");
        e0 e0Var = (e0) this.f5772b.get(cls);
        return (e0Var != null || (b3 = b(cls, (e0Var = this.f5771a.a(cls)))) == null) ? e0Var : b3;
    }

    public e0 d(Object obj) {
        return c(obj.getClass());
    }
}

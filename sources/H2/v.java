package h2;

import a2.C0313a;
import i2.C0503a;
import i2.C0506d;
import java.util.HashMap;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final C0503a f7410a;

    public v(C0313a c0313a) {
        this.f7410a = new C0503a(c0313a, "flutter/system", C0506d.f7497a);
    }

    public void a() {
        W1.b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f7410a.c(hashMap);
    }
}

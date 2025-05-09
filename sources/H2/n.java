package h2;

import a2.C0313a;
import i2.C0507e;
import i2.i;
import java.util.HashMap;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final i2.i f7282a;

    /* renamed from: b, reason: collision with root package name */
    public final i.c f7283b;

    public class a implements i.c {
        public a() {
        }

        @Override // i2.i.c
        public void a(i2.h hVar, i.d dVar) {
            dVar.b(null);
        }
    }

    public n(C0313a c0313a) {
        a aVar = new a();
        this.f7283b = aVar;
        i2.i iVar = new i2.i(c0313a, "flutter/navigation", C0507e.f7498a);
        this.f7282a = iVar;
        iVar.e(aVar);
    }

    public void a() {
        W1.b.f("NavigationChannel", "Sending message to pop route.");
        this.f7282a.c("popRoute", null);
    }

    public void b(String str) {
        W1.b.f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap hashMap = new HashMap();
        hashMap.put("location", str);
        this.f7282a.c("pushRouteInformation", hashMap);
    }

    public void c(String str) {
        W1.b.f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f7282a.c("setInitialRoute", str);
    }
}

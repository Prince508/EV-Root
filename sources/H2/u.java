package h2;

import a2.C0313a;
import i2.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public final i2.i f7406a;

    /* renamed from: b, reason: collision with root package name */
    public b f7407b;

    /* renamed from: c, reason: collision with root package name */
    public final i.c f7408c;

    public class a implements i.c {
        public a() {
        }

        @Override // i2.i.c
        public void a(i2.h hVar, i.d dVar) {
            if (u.this.f7407b == null) {
                W1.b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = hVar.f7499a;
            Object obj = hVar.f7500b;
            W1.b.f("SpellCheckChannel", "Received '" + str + "' message.");
            str.getClass();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.c();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                u.this.f7407b.a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e3) {
                dVar.a("error", e3.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, i.d dVar);
    }

    public u(C0313a c0313a) {
        a aVar = new a();
        this.f7408c = aVar;
        i2.i iVar = new i2.i(c0313a, "flutter/spellcheck", i2.m.f7514b);
        this.f7406a = iVar;
        iVar.e(aVar);
    }

    public void b(b bVar) {
        this.f7407b = bVar;
    }
}

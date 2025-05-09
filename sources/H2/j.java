package h2;

import i2.InterfaceC0504b;
import i2.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final i2.i f7258a;

    /* renamed from: b, reason: collision with root package name */
    public b f7259b;

    /* renamed from: c, reason: collision with root package name */
    public final i.c f7260c;

    public class a implements i.c {

        /* renamed from: b, reason: collision with root package name */
        public Map f7261b = new HashMap();

        public a() {
        }

        @Override // i2.i.c
        public void a(i2.h hVar, i.d dVar) {
            if (j.this.f7259b == null) {
                dVar.b(this.f7261b);
                return;
            }
            String str = hVar.f7499a;
            str.getClass();
            if (!str.equals("getKeyboardState")) {
                dVar.c();
                return;
            }
            try {
                this.f7261b = j.this.f7259b.a();
            } catch (IllegalStateException e3) {
                dVar.a("error", e3.getMessage(), null);
            }
            dVar.b(this.f7261b);
        }
    }

    public interface b {
        Map a();
    }

    public j(InterfaceC0504b interfaceC0504b) {
        a aVar = new a();
        this.f7260c = aVar;
        i2.i iVar = new i2.i(interfaceC0504b, "flutter/keyboard", i2.m.f7514b);
        this.f7258a = iVar;
        iVar.e(aVar);
    }

    public void b(b bVar) {
        this.f7259b = bVar;
    }
}

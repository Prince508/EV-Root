package h2;

import a2.C0313a;
import i2.i;
import java.util.HashMap;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final i2.i f7278a;

    /* renamed from: b, reason: collision with root package name */
    public b f7279b;

    /* renamed from: c, reason: collision with root package name */
    public final i.c f7280c;

    public class a implements i.c {
        public a() {
        }

        @Override // i2.i.c
        public void a(i2.h hVar, i.d dVar) {
            if (m.this.f7279b == null) {
                return;
            }
            String str = hVar.f7499a;
            W1.b.f("MouseCursorChannel", "Received '" + str + "' message.");
            try {
                if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                    try {
                        m.this.f7279b.a((String) ((HashMap) hVar.f7500b).get("kind"));
                        dVar.b(Boolean.TRUE);
                    } catch (Exception e3) {
                        dVar.a("error", "Error when setting cursors: " + e3.getMessage(), null);
                    }
                }
            } catch (Exception e4) {
                dVar.a("error", "Unhandled error: " + e4.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public m(C0313a c0313a) {
        a aVar = new a();
        this.f7280c = aVar;
        i2.i iVar = new i2.i(c0313a, "flutter/mousecursor", i2.m.f7514b);
        this.f7278a = iVar;
        iVar.e(aVar);
    }

    public void b(b bVar) {
        this.f7279b = bVar;
    }
}

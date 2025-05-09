package h2;

import a2.C0313a;
import android.content.pm.PackageManager;
import i2.i;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final i2.i f7374a;

    /* renamed from: b, reason: collision with root package name */
    public final PackageManager f7375b;

    /* renamed from: c, reason: collision with root package name */
    public b f7376c;

    /* renamed from: d, reason: collision with root package name */
    public final i.c f7377d;

    public class a implements i.c {
        public a() {
        }

        @Override // i2.i.c
        public void a(i2.h hVar, i.d dVar) {
            if (r.this.f7376c == null) {
                return;
            }
            String str = hVar.f7499a;
            Object obj = hVar.f7500b;
            str.getClass();
            if (!str.equals("ProcessText.processTextAction")) {
                if (!str.equals("ProcessText.queryTextActions")) {
                    dVar.c();
                    return;
                }
                try {
                    dVar.b(r.this.f7376c.c());
                    return;
                } catch (IllegalStateException e3) {
                    dVar.a("error", e3.getMessage(), null);
                    return;
                }
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                r.this.f7376c.d((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), dVar);
            } catch (IllegalStateException e4) {
                dVar.a("error", e4.getMessage(), null);
            }
        }
    }

    public interface b {
        Map c();

        void d(String str, String str2, boolean z3, i.d dVar);
    }

    public r(C0313a c0313a, PackageManager packageManager) {
        a aVar = new a();
        this.f7377d = aVar;
        this.f7375b = packageManager;
        i2.i iVar = new i2.i(c0313a, "flutter/processtext", i2.m.f7514b);
        this.f7374a = iVar;
        iVar.e(aVar);
    }

    public void b(b bVar) {
        this.f7376c = bVar;
    }
}

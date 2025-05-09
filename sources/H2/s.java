package h2;

import a2.C0313a;
import i2.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7379a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7380b;

    /* renamed from: c, reason: collision with root package name */
    public i2.i f7381c;

    /* renamed from: d, reason: collision with root package name */
    public i.d f7382d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7383e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7384f;

    /* renamed from: g, reason: collision with root package name */
    public final i.c f7385g;

    public class b implements i.c {
        public b() {
        }

        @Override // i2.i.c
        public void a(i2.h hVar, i.d dVar) {
            String str = hVar.f7499a;
            Object obj = hVar.f7500b;
            str.getClass();
            if (!str.equals("get")) {
                if (!str.equals("put")) {
                    dVar.c();
                    return;
                }
                s.this.f7380b = (byte[]) obj;
                dVar.b(null);
                return;
            }
            s.this.f7384f = true;
            if (!s.this.f7383e) {
                s sVar = s.this;
                if (sVar.f7379a) {
                    sVar.f7382d = dVar;
                    return;
                }
            }
            s sVar2 = s.this;
            dVar.b(sVar2.i(sVar2.f7380b));
        }
    }

    public s(C0313a c0313a, boolean z3) {
        this(new i2.i(c0313a, "flutter/restoration", i2.m.f7514b), z3);
    }

    public void g() {
        this.f7380b = null;
    }

    public byte[] h() {
        return this.f7380b;
    }

    public final Map i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void j(byte[] bArr) {
        this.f7383e = true;
        i.d dVar = this.f7382d;
        if (dVar != null) {
            dVar.b(i(bArr));
            this.f7382d = null;
            this.f7380b = bArr;
        } else if (this.f7384f) {
            this.f7381c.d("push", i(bArr), new a(bArr));
        } else {
            this.f7380b = bArr;
        }
    }

    public s(i2.i iVar, boolean z3) {
        this.f7383e = false;
        this.f7384f = false;
        b bVar = new b();
        this.f7385g = bVar;
        this.f7381c = iVar;
        this.f7379a = z3;
        iVar.e(bVar);
    }

    public class a implements i.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f7386a;

        public a(byte[] bArr) {
            this.f7386a = bArr;
        }

        @Override // i2.i.d
        public void a(String str, String str2, Object obj) {
            W1.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // i2.i.d
        public void b(Object obj) {
            s.this.f7380b = this.f7386a;
        }

        @Override // i2.i.d
        public void c() {
        }
    }
}

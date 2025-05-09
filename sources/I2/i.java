package i2;

import i2.InterfaceC0504b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0504b f7501a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7502b;

    /* renamed from: c, reason: collision with root package name */
    public final j f7503c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0504b.c f7504d;

    public final class a implements InterfaceC0504b.a {

        /* renamed from: a, reason: collision with root package name */
        public final c f7505a;

        /* renamed from: i2.i$a$a, reason: collision with other inner class name */
        public class C0127a implements d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC0504b.InterfaceC0126b f7507a;

            public C0127a(InterfaceC0504b.InterfaceC0126b interfaceC0126b) {
                this.f7507a = interfaceC0126b;
            }

            @Override // i2.i.d
            public void a(String str, String str2, Object obj) {
                this.f7507a.a(i.this.f7503c.f(str, str2, obj));
            }

            @Override // i2.i.d
            public void b(Object obj) {
                this.f7507a.a(i.this.f7503c.b(obj));
            }

            @Override // i2.i.d
            public void c() {
                this.f7507a.a(null);
            }
        }

        public a(c cVar) {
            this.f7505a = cVar;
        }

        @Override // i2.InterfaceC0504b.a
        public void a(ByteBuffer byteBuffer, InterfaceC0504b.InterfaceC0126b interfaceC0126b) {
            try {
                this.f7505a.a(i.this.f7503c.c(byteBuffer), new C0127a(interfaceC0126b));
            } catch (RuntimeException e3) {
                W1.b.c("MethodChannel#" + i.this.f7502b, "Failed to handle method call", e3);
                interfaceC0126b.a(i.this.f7503c.e("error", e3.getMessage(), null, W1.b.d(e3)));
            }
        }
    }

    public final class b implements InterfaceC0504b.InterfaceC0126b {

        /* renamed from: a, reason: collision with root package name */
        public final d f7509a;

        public b(d dVar) {
            this.f7509a = dVar;
        }

        @Override // i2.InterfaceC0504b.InterfaceC0126b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f7509a.c();
                } else {
                    try {
                        this.f7509a.b(i.this.f7503c.d(byteBuffer));
                    } catch (C0505c e3) {
                        this.f7509a.a(e3.f7495e, e3.getMessage(), e3.f7496f);
                    }
                }
            } catch (RuntimeException e4) {
                W1.b.c("MethodChannel#" + i.this.f7502b, "Failed to handle method call result", e4);
            }
        }
    }

    public interface c {
        void a(h hVar, d dVar);
    }

    public interface d {
        void a(String str, String str2, Object obj);

        void b(Object obj);

        void c();
    }

    public i(InterfaceC0504b interfaceC0504b, String str) {
        this(interfaceC0504b, str, m.f7514b);
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f7501a.c(this.f7502b, this.f7503c.a(new h(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        if (this.f7504d != null) {
            this.f7501a.d(this.f7502b, cVar != null ? new a(cVar) : null, this.f7504d);
        } else {
            this.f7501a.b(this.f7502b, cVar != null ? new a(cVar) : null);
        }
    }

    public i(InterfaceC0504b interfaceC0504b, String str, j jVar) {
        this(interfaceC0504b, str, jVar, null);
    }

    public i(InterfaceC0504b interfaceC0504b, String str, j jVar, InterfaceC0504b.c cVar) {
        this.f7501a = interfaceC0504b;
        this.f7502b = str;
        this.f7503c = jVar;
        this.f7504d = cVar;
    }
}

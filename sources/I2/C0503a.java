package i2;

import i2.InterfaceC0504b;
import java.nio.ByteBuffer;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0503a {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0504b f7484a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7485b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0509g f7486c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0504b.c f7487d;

    /* renamed from: i2.a$b */
    public final class b implements InterfaceC0504b.a {

        /* renamed from: a, reason: collision with root package name */
        public final d f7488a;

        /* renamed from: i2.a$b$a, reason: collision with other inner class name */
        public class C0125a implements e {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC0504b.InterfaceC0126b f7490a;

            public C0125a(InterfaceC0504b.InterfaceC0126b interfaceC0126b) {
                this.f7490a = interfaceC0126b;
            }

            @Override // i2.C0503a.e
            public void a(Object obj) {
                this.f7490a.a(C0503a.this.f7486c.b(obj));
            }
        }

        @Override // i2.InterfaceC0504b.a
        public void a(ByteBuffer byteBuffer, InterfaceC0504b.InterfaceC0126b interfaceC0126b) {
            try {
                this.f7488a.a(C0503a.this.f7486c.a(byteBuffer), new C0125a(interfaceC0126b));
            } catch (RuntimeException e3) {
                W1.b.c("BasicMessageChannel#" + C0503a.this.f7485b, "Failed to handle message", e3);
                interfaceC0126b.a(null);
            }
        }

        public b(d dVar) {
            this.f7488a = dVar;
        }
    }

    /* renamed from: i2.a$c */
    public final class c implements InterfaceC0504b.InterfaceC0126b {

        /* renamed from: a, reason: collision with root package name */
        public final e f7492a;

        @Override // i2.InterfaceC0504b.InterfaceC0126b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.f7492a.a(C0503a.this.f7486c.a(byteBuffer));
            } catch (RuntimeException e3) {
                W1.b.c("BasicMessageChannel#" + C0503a.this.f7485b, "Failed to handle message reply", e3);
            }
        }

        public c(e eVar) {
            this.f7492a = eVar;
        }
    }

    /* renamed from: i2.a$d */
    public interface d {
        void a(Object obj, e eVar);
    }

    /* renamed from: i2.a$e */
    public interface e {
        void a(Object obj);
    }

    public C0503a(InterfaceC0504b interfaceC0504b, String str, InterfaceC0509g interfaceC0509g) {
        this(interfaceC0504b, str, interfaceC0509g, null);
    }

    public void c(Object obj) {
        d(obj, null);
    }

    public void d(Object obj, e eVar) {
        this.f7484a.c(this.f7485b, this.f7486c.b(obj), eVar != null ? new c(eVar) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [i2.b] */
    /* JADX WARN: Type inference failed for: r1v0, types: [i2.a$a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [i2.b$a] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public void e(d dVar) {
        if (this.f7487d != null) {
            this.f7484a.d(this.f7485b, dVar != null ? new b(dVar) : null, this.f7487d);
        } else {
            this.f7484a.b(this.f7485b, dVar != null ? new b(dVar) : 0);
        }
    }

    public C0503a(InterfaceC0504b interfaceC0504b, String str, InterfaceC0509g interfaceC0509g, InterfaceC0504b.c cVar) {
        this.f7484a = interfaceC0504b;
        this.f7485b = str;
        this.f7486c = interfaceC0509g;
        this.f7487d = cVar;
    }
}

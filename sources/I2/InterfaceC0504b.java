package i2;

import java.nio.ByteBuffer;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0504b {

    /* renamed from: i2.b$a */
    public interface a {
        void a(ByteBuffer byteBuffer, InterfaceC0126b interfaceC0126b);
    }

    /* renamed from: i2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0126b {
        void a(ByteBuffer byteBuffer);
    }

    /* renamed from: i2.b$c */
    public interface c {
    }

    /* renamed from: i2.b$d */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f7494a = true;

        public boolean a() {
            return this.f7494a;
        }
    }

    c a(d dVar);

    void b(String str, a aVar);

    void c(String str, ByteBuffer byteBuffer, InterfaceC0126b interfaceC0126b);

    void d(String str, a aVar, c cVar);

    default c f() {
        return a(new d());
    }
}

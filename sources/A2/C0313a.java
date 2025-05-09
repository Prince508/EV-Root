package a2;

import android.content.res.AssetManager;
import c2.C0400d;
import i2.InterfaceC0504b;
import i2.n;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import o2.C0654e;

/* renamed from: a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0313a implements InterfaceC0504b {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f2664a;

    /* renamed from: b, reason: collision with root package name */
    public final AssetManager f2665b;

    /* renamed from: c, reason: collision with root package name */
    public final a2.c f2666c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0504b f2667d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2668e;

    /* renamed from: f, reason: collision with root package name */
    public String f2669f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0504b.a f2670g;

    /* renamed from: a2.a$a, reason: collision with other inner class name */
    public class C0074a implements InterfaceC0504b.a {
        public C0074a() {
        }

        @Override // i2.InterfaceC0504b.a
        public void a(ByteBuffer byteBuffer, InterfaceC0504b.InterfaceC0126b interfaceC0126b) {
            C0313a.this.f2669f = n.f7517b.a(byteBuffer);
            C0313a.g(C0313a.this);
        }
    }

    /* renamed from: a2.a$c */
    public static class c implements InterfaceC0504b {

        /* renamed from: a, reason: collision with root package name */
        public final a2.c f2675a;

        public /* synthetic */ c(a2.c cVar, C0074a c0074a) {
            this(cVar);
        }

        @Override // i2.InterfaceC0504b
        public InterfaceC0504b.c a(InterfaceC0504b.d dVar) {
            return this.f2675a.a(dVar);
        }

        @Override // i2.InterfaceC0504b
        public void b(String str, InterfaceC0504b.a aVar) {
            this.f2675a.b(str, aVar);
        }

        @Override // i2.InterfaceC0504b
        public void c(String str, ByteBuffer byteBuffer, InterfaceC0504b.InterfaceC0126b interfaceC0126b) {
            this.f2675a.c(str, byteBuffer, interfaceC0126b);
        }

        @Override // i2.InterfaceC0504b
        public void d(String str, InterfaceC0504b.a aVar, InterfaceC0504b.c cVar) {
            this.f2675a.d(str, aVar, cVar);
        }

        public c(a2.c cVar) {
            this.f2675a = cVar;
        }
    }

    /* renamed from: a2.a$d */
    public interface d {
    }

    public C0313a(FlutterJNI flutterJNI, AssetManager assetManager) {
        this.f2668e = false;
        C0074a c0074a = new C0074a();
        this.f2670g = c0074a;
        this.f2664a = flutterJNI;
        this.f2665b = assetManager;
        a2.c cVar = new a2.c(flutterJNI);
        this.f2666c = cVar;
        cVar.b("flutter/isolate", c0074a);
        this.f2667d = new c(cVar, null);
        if (flutterJNI.isAttached()) {
            this.f2668e = true;
        }
    }

    public static /* synthetic */ d g(C0313a c0313a) {
        c0313a.getClass();
        return null;
    }

    @Override // i2.InterfaceC0504b
    public InterfaceC0504b.c a(InterfaceC0504b.d dVar) {
        return this.f2667d.a(dVar);
    }

    @Override // i2.InterfaceC0504b
    public void b(String str, InterfaceC0504b.a aVar) {
        this.f2667d.b(str, aVar);
    }

    @Override // i2.InterfaceC0504b
    public void c(String str, ByteBuffer byteBuffer, InterfaceC0504b.InterfaceC0126b interfaceC0126b) {
        this.f2667d.c(str, byteBuffer, interfaceC0126b);
    }

    @Override // i2.InterfaceC0504b
    public void d(String str, InterfaceC0504b.a aVar, InterfaceC0504b.c cVar) {
        this.f2667d.d(str, aVar, cVar);
    }

    public void h(b bVar, List list) {
        if (this.f2668e) {
            W1.b.g("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        C0654e f3 = C0654e.f("DartExecutor#executeDartEntrypoint");
        try {
            W1.b.f("DartExecutor", "Executing Dart entrypoint: " + bVar);
            this.f2664a.runBundleAndSnapshotFromLibrary(bVar.f2672a, bVar.f2674c, bVar.f2673b, this.f2665b, list);
            this.f2668e = true;
            if (f3 != null) {
                f3.close();
            }
        } finally {
        }
    }

    public boolean i() {
        return this.f2668e;
    }

    public void j() {
        if (this.f2664a.isAttached()) {
            this.f2664a.notifyLowMemoryWarning();
        }
    }

    public void k() {
        W1.b.f("DartExecutor", "Attached to JNI. Registering the platform message handler for this Dart execution context.");
        this.f2664a.setPlatformMessageHandler(this.f2666c);
    }

    public void l() {
        W1.b.f("DartExecutor", "Detached from JNI. De-registering the platform message handler for this Dart execution context.");
        this.f2664a.setPlatformMessageHandler(null);
    }

    /* renamed from: a2.a$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f2672a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2673b;

        /* renamed from: c, reason: collision with root package name */
        public final String f2674c;

        public b(String str, String str2) {
            this.f2672a = str;
            this.f2673b = null;
            this.f2674c = str2;
        }

        public static b a() {
            C0400d c3 = W1.a.e().c();
            if (c3.k()) {
                return new b(c3.g(), "main");
            }
            throw new AssertionError("DartEntrypoints can only be created once a FlutterEngine is created.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f2672a.equals(bVar.f2672a)) {
                return this.f2674c.equals(bVar.f2674c);
            }
            return false;
        }

        public int hashCode() {
            return (this.f2672a.hashCode() * 31) + this.f2674c.hashCode();
        }

        public String toString() {
            return "DartEntrypoint( bundle path: " + this.f2672a + ", function: " + this.f2674c + " )";
        }

        public b(String str, String str2, String str3) {
            this.f2672a = str;
            this.f2673b = str2;
            this.f2674c = str3;
        }
    }
}

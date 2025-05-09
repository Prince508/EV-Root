package e2;

import android.content.Context;
import i2.InterfaceC0504b;
import io.flutter.plugin.platform.l;
import io.flutter.view.TextureRegistry;

/* renamed from: e2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0465a {

    /* renamed from: e2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0118a {
    }

    /* renamed from: e2.a$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f7164a;

        /* renamed from: b, reason: collision with root package name */
        public final io.flutter.embedding.engine.a f7165b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC0504b f7166c;

        /* renamed from: d, reason: collision with root package name */
        public final TextureRegistry f7167d;

        /* renamed from: e, reason: collision with root package name */
        public final l f7168e;

        /* renamed from: f, reason: collision with root package name */
        public final InterfaceC0118a f7169f;

        /* renamed from: g, reason: collision with root package name */
        public final io.flutter.embedding.engine.b f7170g;

        public b(Context context, io.flutter.embedding.engine.a aVar, InterfaceC0504b interfaceC0504b, TextureRegistry textureRegistry, l lVar, InterfaceC0118a interfaceC0118a, io.flutter.embedding.engine.b bVar) {
            this.f7164a = context;
            this.f7165b = aVar;
            this.f7166c = interfaceC0504b;
            this.f7167d = textureRegistry;
            this.f7168e = lVar;
            this.f7169f = interfaceC0118a;
            this.f7170g = bVar;
        }

        public Context a() {
            return this.f7164a;
        }

        public InterfaceC0504b b() {
            return this.f7166c;
        }
    }

    void b(b bVar);

    void p(b bVar);
}

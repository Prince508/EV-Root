package T1;

import U1.AbstractC0294f;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class b implements Closeable {

    /* renamed from: e, reason: collision with root package name */
    public static Executor f2056e = Executors.newCachedThreadPool();

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2057f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f2058g = false;

    public static abstract class a {
    }

    /* renamed from: T1.b$b, reason: collision with other inner class name */
    public static class C0056b {
    }

    public static b b() {
        return AbstractC0294f.a();
    }

    public abstract void a(c cVar);

    public abstract int c();

    public boolean d() {
        return c() >= 1;
    }

    public interface c {
        void a(OutputStream outputStream, InputStream inputStream, InputStream inputStream2);

        default void b() {
        }
    }
}

package Z1;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static volatile c f2633b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f2634a = new HashMap();

    public static c b() {
        if (f2633b == null) {
            synchronized (c.class) {
                try {
                    if (f2633b == null) {
                        f2633b = new c();
                    }
                } finally {
                }
            }
        }
        return f2633b;
    }

    public io.flutter.embedding.engine.b a(String str) {
        return (io.flutter.embedding.engine.b) this.f2634a.get(str);
    }
}

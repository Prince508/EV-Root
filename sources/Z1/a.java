package Z1;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static a f2609b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f2610a = new HashMap();

    public static a b() {
        if (f2609b == null) {
            f2609b = new a();
        }
        return f2609b;
    }

    public io.flutter.embedding.engine.a a(String str) {
        return (io.flutter.embedding.engine.a) this.f2610a.get(str);
    }

    public void c(String str, io.flutter.embedding.engine.a aVar) {
        if (aVar != null) {
            this.f2610a.put(str, aVar);
        } else {
            this.f2610a.remove(str);
        }
    }

    public void d(String str) {
        c(str, null);
    }
}

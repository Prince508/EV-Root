package i2;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f7499a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7500b;

    public h(String str, Object obj) {
        this.f7499a = str;
        this.f7500b = obj;
    }

    public Object a(String str) {
        Object obj = this.f7500b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public Object b() {
        return this.f7500b;
    }
}

package i2;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: i2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507e implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final C0507e f7498a = new C0507e();

    @Override // i2.j
    public ByteBuffer a(h hVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", hVar.f7499a);
            jSONObject.put("args", AbstractC0508f.a(hVar.f7500b));
            return C0506d.f7497a.b(jSONObject);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // i2.j
    public ByteBuffer b(Object obj) {
        return C0506d.f7497a.b(new JSONArray().put(AbstractC0508f.a(obj)));
    }

    @Override // i2.j
    public h c(ByteBuffer byteBuffer) {
        try {
            Object a3 = C0506d.f7497a.a(byteBuffer);
            if (a3 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) a3;
                Object obj = jSONObject.get("method");
                Object g3 = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new h((String) obj, g3);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + a3);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // i2.j
    public Object d(ByteBuffer byteBuffer) {
        try {
            Object a3 = C0506d.f7497a.a(byteBuffer);
            if (a3 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) a3;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g3 = g(jSONArray.opt(1));
                    Object g4 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g3 == null || (g3 instanceof String))) {
                        throw new C0505c((String) obj, (String) g3, g4);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + a3);
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // i2.j
    public ByteBuffer e(String str, String str2, Object obj, String str3) {
        return C0506d.f7497a.b(new JSONArray().put(str).put(AbstractC0508f.a(str2)).put(AbstractC0508f.a(obj)).put(AbstractC0508f.a(str3)));
    }

    @Override // i2.j
    public ByteBuffer f(String str, String str2, Object obj) {
        return C0506d.f7497a.b(new JSONArray().put(str).put(AbstractC0508f.a(str2)).put(AbstractC0508f.a(obj)));
    }

    public Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}

package i2;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: i2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506d implements InterfaceC0509g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0506d f7497a = new C0506d();

    @Override // i2.InterfaceC0509g
    public Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(n.f7517b.a(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e3) {
            throw new IllegalArgumentException("Invalid JSON", e3);
        }
    }

    @Override // i2.InterfaceC0509g
    public ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        Object a3 = AbstractC0508f.a(obj);
        return a3 instanceof String ? n.f7517b.b(JSONObject.quote((String) a3)) : n.f7517b.b(a3.toString());
    }
}

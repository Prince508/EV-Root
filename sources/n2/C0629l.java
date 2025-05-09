package n2;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: n2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0629l extends i2.l {
    @Override // i2.l
    public Object g(byte b3, ByteBuffer byteBuffer) {
        C2.k.e(byteBuffer, "buffer");
        if (b3 != -127) {
            return super.g(b3, byteBuffer);
        }
        Object f3 = f(byteBuffer);
        List list = f3 instanceof List ? (List) f3 : null;
        if (list != null) {
            return C0614E.f8563c.a(list);
        }
        return null;
    }

    @Override // i2.l
    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        C2.k.e(byteArrayOutputStream, "stream");
        if (!(obj instanceof C0614E)) {
            super.p(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(129);
            p(byteArrayOutputStream, ((C0614E) obj).b());
        }
    }
}

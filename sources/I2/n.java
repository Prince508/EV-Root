package i2;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class n implements InterfaceC0509g {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f7516a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final n f7517b = new n();

    @Override // i2.InterfaceC0509g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String a(ByteBuffer byteBuffer) {
        byte[] bArr;
        int i3;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i3 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i3 = 0;
        }
        return new String(bArr, i3, remaining, f7516a);
    }

    @Override // i2.InterfaceC0509g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer b(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f7516a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}

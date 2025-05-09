package R0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c {
    public static byte[] a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }
}

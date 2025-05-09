package B1;

import O1.C;
import O1.I;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f69a = new byte[0];

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70a;

        static {
            int[] iArr = new int[I.values().length];
            f70a = iArr;
            try {
                iArr[I.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70a[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70a[I.TINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70a[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static byte[] a(C.c cVar) {
        int i3 = a.f70a[cVar.b0().ordinal()];
        if (i3 == 1 || i3 == 2) {
            return ByteBuffer.allocate(5).put((byte) 0).putInt(cVar.a0()).array();
        }
        if (i3 == 3) {
            return ByteBuffer.allocate(5).put((byte) 1).putInt(cVar.a0()).array();
        }
        if (i3 == 4) {
            return f69a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}

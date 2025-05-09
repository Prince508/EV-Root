package Q1;

import P1.k;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1839a;

    public a(byte[] bArr, int i3, int i4) {
        byte[] bArr2 = new byte[i4];
        this.f1839a = bArr2;
        System.arraycopy(bArr, i3, bArr2, 0, i4);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static a b(byte[] bArr, int i3, int i4) {
        if (bArr != null) {
            return new a(bArr, i3, i4);
        }
        throw new NullPointerException("data must be non-null");
    }

    public int c() {
        return this.f1839a.length;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f1839a, this.f1839a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f1839a);
    }

    public String toString() {
        return "Bytes(" + k.b(this.f1839a) + ")";
    }
}

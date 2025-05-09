package O1;

import com.google.crypto.tink.shaded.protobuf.AbstractC0434z;

/* loaded from: classes.dex */
public enum u implements AbstractC0434z.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: m, reason: collision with root package name */
    public static final AbstractC0434z.b f1581m = new AbstractC0434z.b() { // from class: O1.u.a
    };

    /* renamed from: e, reason: collision with root package name */
    public final int f1583e;

    u(int i3) {
        this.f1583e = i3;
    }

    public static u c(int i3) {
        if (i3 == 0) {
            return UNKNOWN_HASH;
        }
        if (i3 == 1) {
            return SHA1;
        }
        if (i3 == 2) {
            return SHA384;
        }
        if (i3 == 3) {
            return SHA256;
        }
        if (i3 == 4) {
            return SHA512;
        }
        if (i3 != 5) {
            return null;
        }
        return SHA224;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.f1583e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

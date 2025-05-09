package O1;

import com.google.crypto.tink.shaded.protobuf.AbstractC0434z;

/* loaded from: classes.dex */
public enum I implements AbstractC0434z.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    public static final AbstractC0434z.b f1548l = new AbstractC0434z.b() { // from class: O1.I.a
    };

    /* renamed from: e, reason: collision with root package name */
    public final int f1550e;

    I(int i3) {
        this.f1550e = i3;
    }

    public static I c(int i3) {
        if (i3 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i3 == 1) {
            return TINK;
        }
        if (i3 == 2) {
            return LEGACY;
        }
        if (i3 == 3) {
            return RAW;
        }
        if (i3 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.f1550e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

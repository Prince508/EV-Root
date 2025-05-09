package O1;

import com.google.crypto.tink.shaded.protobuf.AbstractC0434z;

/* loaded from: classes.dex */
public enum z implements AbstractC0434z.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    public static final AbstractC0434z.b f1602k = new AbstractC0434z.b() { // from class: O1.z.a
    };

    /* renamed from: e, reason: collision with root package name */
    public final int f1604e;

    z(int i3) {
        this.f1604e = i3;
    }

    public static z c(int i3) {
        if (i3 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i3 == 1) {
            return ENABLED;
        }
        if (i3 == 2) {
            return DISABLED;
        }
        if (i3 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.f1604e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

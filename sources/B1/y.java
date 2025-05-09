package B1;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f124a = new y();

    public static y a() {
        return f124a;
    }

    public static y b(y yVar) {
        if (yVar != null) {
            return yVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}

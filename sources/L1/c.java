package L1;

import G1.b;
import K1.g;
import K1.i;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final b.EnumC0011b f1335b = b.EnumC0011b.f581f;

    /* renamed from: a, reason: collision with root package name */
    public final i f1336a;

    public c(i iVar) {
        if (!f1335b.c()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f1336a = iVar;
    }
}

package L1;

import G1.b;
import K1.g;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final b.EnumC0011b f1333b = b.EnumC0011b.f580e;

    /* renamed from: a, reason: collision with root package name */
    public final K1.a f1334a;

    public b(K1.a aVar) {
        if (!f1333b.c()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.f1334a = aVar;
    }
}

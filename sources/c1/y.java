package C1;

import C1.A;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class y extends AbstractC0174b {

    /* renamed from: a, reason: collision with root package name */
    public final A f291a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.b f292b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.a f293c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f294d;

    public y(A a3, Q1.b bVar, Q1.a aVar, Integer num) {
        this.f291a = a3;
        this.f292b = bVar;
        this.f293c = aVar;
        this.f294d = num;
    }

    public static y a(A.a aVar, Q1.b bVar, Integer num) {
        A.a aVar2 = A.a.f170d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.b() == 32) {
            A a3 = A.a(aVar);
            return new y(a3, bVar, b(a3, num), num);
        }
        throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.b());
    }

    public static Q1.a b(A a3, Integer num) {
        if (a3.b() == A.a.f170d) {
            return Q1.a.a(new byte[0]);
        }
        if (a3.b() == A.a.f169c) {
            return Q1.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (a3.b() == A.a.f168b) {
            return Q1.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + a3.b());
    }
}

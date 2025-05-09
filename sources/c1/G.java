package C1;

import C1.I;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class G extends AbstractC0174b {

    /* renamed from: a, reason: collision with root package name */
    public final I f183a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.b f184b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.a f185c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f186d;

    public G(I i3, Q1.b bVar, Q1.a aVar, Integer num) {
        this.f183a = i3;
        this.f184b = bVar;
        this.f185c = aVar;
        this.f186d = num;
    }

    public static G a(I.a aVar, Q1.b bVar, Integer num) {
        I.a aVar2 = I.a.f191d;
        if (aVar != aVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + aVar + " the value of idRequirement must be non-null");
        }
        if (aVar == aVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bVar.b() == 32) {
            I a3 = I.a(aVar);
            return new G(a3, bVar, b(a3, num), num);
        }
        throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + bVar.b());
    }

    public static Q1.a b(I i3, Integer num) {
        if (i3.b() == I.a.f191d) {
            return Q1.a.a(new byte[0]);
        }
        if (i3.b() == I.a.f190c) {
            return Q1.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        }
        if (i3.b() == I.a.f189b) {
            return Q1.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        throw new IllegalStateException("Unknown Variant: " + i3.b());
    }
}

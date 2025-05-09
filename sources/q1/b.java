package Q1;

import B1.y;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f1840a;

    public b(a aVar) {
        this.f1840a = aVar;
    }

    public static b a(byte[] bArr, y yVar) {
        if (yVar != null) {
            return new b(a.a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public int b() {
        return this.f1840a.c();
    }
}

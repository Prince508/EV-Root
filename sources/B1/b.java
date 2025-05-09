package B1;

import O1.C;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f68a;

    public b(InputStream inputStream) {
        this.f68a = inputStream;
    }

    public static p b(byte[] bArr) {
        return new b(new ByteArrayInputStream(bArr));
    }

    @Override // B1.p
    public O1.t a() {
        try {
            return O1.t.Z(this.f68a, C0425p.b());
        } finally {
            this.f68a.close();
        }
    }

    @Override // B1.p
    public C read() {
        try {
            return C.e0(this.f68a, C0425p.b());
        } finally {
            this.f68a.close();
        }
    }
}

package S1;

import android.content.Context;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes.dex */
public class o extends h {
    public o(Context context, a aVar) {
        super(context, aVar);
    }

    @Override // S1.h
    public String c() {
        return "VGhpcyBpcyB0aGUga2V5IGZvcihBIHNlY3XyZZBzdG9yYWdlIEFFUyBLZXkK";
    }

    @Override // S1.h
    public Cipher d() {
        return Cipher.getInstance("AES/GCM/NoPadding");
    }

    @Override // S1.h
    public int e() {
        return 12;
    }

    @Override // S1.h
    public AlgorithmParameterSpec f(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }
}

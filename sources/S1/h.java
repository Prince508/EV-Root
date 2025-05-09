package S1;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Cipher f1971a;

    /* renamed from: b, reason: collision with root package name */
    public final SecureRandom f1972b = new SecureRandom();

    /* renamed from: c, reason: collision with root package name */
    public Key f1973c;

    public h(Context context, a aVar) {
        String c3 = c();
        SharedPreferences sharedPreferences = context.getSharedPreferences("FlutterSecureKeyStorage", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String string = sharedPreferences.getString(c3, null);
        this.f1971a = d();
        if (string != null) {
            try {
                this.f1973c = aVar.b(Base64.decode(string, 0), "AES");
                return;
            } catch (Exception e3) {
                Log.e("StorageCipher18Impl", "unwrap key failed", e3);
            }
        }
        byte[] bArr = new byte[16];
        this.f1972b.nextBytes(bArr);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f1973c = secretKeySpec;
        edit.putString(c3, Base64.encodeToString(aVar.a(secretKeySpec), 0));
        edit.apply();
    }

    @Override // S1.i
    public byte[] a(byte[] bArr) {
        int e3 = e();
        byte[] bArr2 = new byte[e3];
        this.f1972b.nextBytes(bArr2);
        this.f1971a.init(1, this.f1973c, f(bArr2));
        byte[] doFinal = this.f1971a.doFinal(bArr);
        byte[] bArr3 = new byte[doFinal.length + e3];
        System.arraycopy(bArr2, 0, bArr3, 0, e3);
        System.arraycopy(doFinal, 0, bArr3, e3, doFinal.length);
        return bArr3;
    }

    @Override // S1.i
    public byte[] b(byte[] bArr) {
        int e3 = e();
        byte[] bArr2 = new byte[e3];
        System.arraycopy(bArr, 0, bArr2, 0, e3);
        AlgorithmParameterSpec f3 = f(bArr2);
        int length = bArr.length - e();
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, e3, bArr3, 0, length);
        this.f1971a.init(2, this.f1973c, f3);
        return this.f1971a.doFinal(bArr3);
    }

    public String c() {
        return "VGhpcyBpcyB0aGUga2V5IGZvciBhIHNlY3VyZSBzdG9yYWdlIEFFUyBLZXkK";
    }

    public Cipher d() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    public int e() {
        return 16;
    }

    public AlgorithmParameterSpec f(byte[] bArr) {
        return new IvParameterSpec(bArr);
    }
}

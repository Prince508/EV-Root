package S1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Map;

/* loaded from: classes.dex */
public class m {

    /* renamed from: e, reason: collision with root package name */
    public static final d f1979e = d.RSA_ECB_PKCS1Padding;

    /* renamed from: f, reason: collision with root package name */
    public static final l f1980f = l.AES_CBC_PKCS7Padding;

    /* renamed from: a, reason: collision with root package name */
    public final d f1981a;

    /* renamed from: b, reason: collision with root package name */
    public final l f1982b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1983c;

    /* renamed from: d, reason: collision with root package name */
    public final l f1984d;

    public m(SharedPreferences sharedPreferences, Map map) {
        d dVar = f1979e;
        this.f1981a = d.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmKey", dVar.name()));
        l lVar = f1980f;
        this.f1982b = l.valueOf(sharedPreferences.getString("FlutterSecureSAlgorithmStorage", lVar.name()));
        d valueOf = d.valueOf(b(map, "keyCipherAlgorithm", dVar.name()));
        int i3 = valueOf.f1968f;
        int i4 = Build.VERSION.SDK_INT;
        this.f1983c = i3 <= i4 ? valueOf : dVar;
        l valueOf2 = l.valueOf(b(map, "storageCipherAlgorithm", lVar.name()));
        this.f1984d = valueOf2.f1978f <= i4 ? valueOf2 : lVar;
    }

    public i a(Context context) {
        return this.f1984d.f1977e.a(context, this.f1983c.f1967e.a(context));
    }

    public final String b(Map map, String str, String str2) {
        Object obj = map.get(str);
        return obj != null ? obj.toString() : str2;
    }

    public i c(Context context) {
        return this.f1982b.f1977e.a(context, this.f1981a.f1967e.a(context));
    }

    public void d(SharedPreferences.Editor editor) {
        editor.remove("FlutterSecureSAlgorithmKey");
        editor.remove("FlutterSecureSAlgorithmStorage");
    }

    public boolean e() {
        return (this.f1981a == this.f1983c && this.f1982b == this.f1984d) ? false : true;
    }

    public void f(SharedPreferences.Editor editor) {
        editor.putString("FlutterSecureSAlgorithmKey", this.f1983c.name());
        editor.putString("FlutterSecureSAlgorithmStorage", this.f1984d.name());
    }
}

package R1;

import S1.i;
import S1.m;
import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import android.util.Log;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import p0.SharedPreferencesC0659a;
import p0.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public final Context f1883c;

    /* renamed from: e, reason: collision with root package name */
    public Map f1885e;

    /* renamed from: g, reason: collision with root package name */
    public SharedPreferences f1887g;

    /* renamed from: h, reason: collision with root package name */
    public i f1888h;

    /* renamed from: i, reason: collision with root package name */
    public m f1889i;

    /* renamed from: a, reason: collision with root package name */
    public final String f1881a = "SecureStorageAndroid";

    /* renamed from: d, reason: collision with root package name */
    public String f1884d = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg";

    /* renamed from: f, reason: collision with root package name */
    public String f1886f = "FlutterSecureStorage";

    /* renamed from: j, reason: collision with root package name */
    public Boolean f1890j = Boolean.FALSE;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f1882b = StandardCharsets.UTF_8;

    public a(Context context, Map map) {
        this.f1885e = map;
        this.f1883c = context.getApplicationContext();
    }

    public String a(String str) {
        return this.f1884d + "_" + str;
    }

    public final void b(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        try {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains(this.f1884d)) {
                    sharedPreferences2.edit().putString(key, d((String) value)).apply();
                    sharedPreferences.edit().remove(key).apply();
                }
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            this.f1889i.d(edit);
            edit.apply();
        } catch (Exception e3) {
            Log.e("SecureStorageAndroid", "Data migration failed", e3);
        }
    }

    public boolean c(String str) {
        g();
        return this.f1887g.contains(str);
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return new String(this.f1888h.b(Base64.decode(str, 0)), this.f1882b);
    }

    public void e(String str) {
        g();
        SharedPreferences.Editor edit = this.f1887g.edit();
        edit.remove(str);
        edit.apply();
    }

    public void f() {
        g();
        SharedPreferences.Editor edit = this.f1887g.edit();
        edit.clear();
        if (!j()) {
            this.f1889i.f(edit);
        }
        edit.apply();
    }

    public final void g() {
        h();
        SharedPreferences sharedPreferences = this.f1883c.getSharedPreferences(this.f1886f, 0);
        if (this.f1888h == null) {
            try {
                k(sharedPreferences);
            } catch (Exception e3) {
                Log.e("SecureStorageAndroid", "StorageCipher initialization failed", e3);
            }
        }
        if (!j()) {
            this.f1887g = sharedPreferences;
            return;
        }
        try {
            SharedPreferences l3 = l(this.f1883c);
            this.f1887g = l3;
            b(sharedPreferences, l3);
        } catch (Exception e4) {
            Log.e("SecureStorageAndroid", "EncryptedSharedPreferences initialization failed", e4);
            this.f1887g = sharedPreferences;
            this.f1890j = Boolean.TRUE;
        }
    }

    public void h() {
        if (this.f1885e.containsKey("sharedPreferencesName") && !((String) this.f1885e.get("sharedPreferencesName")).isEmpty()) {
            this.f1886f = (String) this.f1885e.get("sharedPreferencesName");
        }
        if (!this.f1885e.containsKey("preferencesKeyPrefix") || ((String) this.f1885e.get("preferencesKeyPrefix")).isEmpty()) {
            return;
        }
        this.f1884d = (String) this.f1885e.get("preferencesKeyPrefix");
    }

    public boolean i() {
        return this.f1885e.containsKey("resetOnError") && this.f1885e.get("resetOnError").equals("true");
    }

    public final boolean j() {
        return !this.f1890j.booleanValue() && this.f1885e.containsKey("encryptedSharedPreferences") && this.f1885e.get("encryptedSharedPreferences").equals("true");
    }

    public final void k(SharedPreferences sharedPreferences) {
        this.f1889i = new m(sharedPreferences, this.f1885e);
        if (j()) {
            this.f1888h = this.f1889i.c(this.f1883c);
        } else if (this.f1889i.e()) {
            m(this.f1889i, sharedPreferences);
        } else {
            this.f1888h = this.f1889i.a(this.f1883c);
        }
    }

    public final SharedPreferences l(Context context) {
        return SharedPreferencesC0659a.a(context, this.f1886f, new c.a(context).b(new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setEncryptionPaddings("NoPadding").setBlockModes("GCM").setKeySize(256).build()).a(), SharedPreferencesC0659a.d.AES256_SIV, SharedPreferencesC0659a.e.AES256_GCM);
    }

    public final void m(m mVar, SharedPreferences sharedPreferences) {
        try {
            this.f1888h = mVar.c(this.f1883c);
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if ((value instanceof String) && key.contains(this.f1884d)) {
                    hashMap.put(key, d((String) value));
                }
            }
            this.f1888h = mVar.a(this.f1883c);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                edit.putString((String) entry2.getKey(), Base64.encodeToString(this.f1888h.a(((String) entry2.getValue()).getBytes(this.f1882b)), 0));
            }
            mVar.f(edit);
            edit.apply();
        } catch (Exception e3) {
            Log.e("SecureStorageAndroid", "re-encryption failed", e3);
            this.f1888h = mVar.c(this.f1883c);
        }
    }

    public String n(String str) {
        g();
        String string = this.f1887g.getString(str, null);
        return j() ? string : d(string);
    }

    public Map o() {
        g();
        Map<String, ?> all = this.f1887g.getAll();
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (entry.getKey().contains(this.f1884d)) {
                String replaceFirst = entry.getKey().replaceFirst(this.f1884d + '_', "");
                if (j()) {
                    hashMap.put(replaceFirst, (String) entry.getValue());
                } else {
                    hashMap.put(replaceFirst, d((String) entry.getValue()));
                }
            }
        }
        return hashMap;
    }

    public void p(String str, String str2) {
        g();
        SharedPreferences.Editor edit = this.f1887g.edit();
        if (j()) {
            edit.putString(str, str2);
        } else {
            edit.putString(str, Base64.encodeToString(this.f1888h.a(str2.getBytes(this.f1882b)), 0));
        }
        edit.apply();
    }
}

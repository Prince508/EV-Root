package d1;

import android.content.Context;
import android.content.SharedPreferences;
import com.easyvictory.cheto.utils.package_settings.IPackageSettings;
import java.util.HashMap;
import java.util.Map;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0440a {

    /* renamed from: a, reason: collision with root package name */
    public String f6375a;

    /* renamed from: b, reason: collision with root package name */
    public Context f6376b;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f6377c;

    public C0440a(Context context, String str) {
        this.f6376b = context;
        this.f6375a = str;
        this.f6377c = context.getSharedPreferences(String.format("%s_settings", str), 0);
    }

    public Map a() {
        HashMap hashMap = new HashMap();
        hashMap.put("auto_restart", Integer.valueOf(this.f6377c.getInt("auto_restart", 0)));
        return hashMap;
    }

    public IPackageSettings b() {
        return new IPackageSettings((Map<String, Object>) a());
    }

    public void c(Map map) {
        SharedPreferences.Editor edit = this.f6377c.edit();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Long) {
                edit.putLong(str, ((Long) value).longValue());
            } else if (value instanceof Integer) {
                edit.putInt(str, ((Integer) value).intValue());
            } else if (value instanceof Float) {
                edit.putFloat(str, ((Float) value).floatValue());
            } else if (value instanceof Boolean) {
                edit.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value instanceof String) {
                edit.putString(str, (String) value);
            }
        }
        edit.commit();
    }
}

package I1;

import B1.q;
import O1.C;
import O1.t;
import P1.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d implements q {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences.Editor f830a;

    /* renamed from: b, reason: collision with root package name */
    public final String f831b;

    public d(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f831b = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f830a = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f830a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // B1.q
    public void a(t tVar) {
        if (!this.f830a.putString(this.f831b, k.b(tVar.e())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // B1.q
    public void b(C c3) {
        if (!this.f830a.putString(this.f831b, k.b(c3.e())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}

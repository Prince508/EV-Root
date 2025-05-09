package n2;

import android.content.Context;
import java.util.Set;

/* renamed from: n2.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0616G {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ H2.h[] f8687a = {C2.u.e(new C2.q(AbstractC0616G.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};

    /* renamed from: b, reason: collision with root package name */
    public static final D2.a f8688b = X.a.b("FlutterSharedPreferences", null, null, null, 14, null);

    public static final V.f b(Context context) {
        return (V.f) f8688b.a(context, f8687a[0]);
    }

    public static final boolean c(String str, Object obj, Set set) {
        C2.k.e(str, "key");
        return set == null ? (obj instanceof Boolean) || (obj instanceof Long) || (obj instanceof String) || (obj instanceof Double) : set.contains(str);
    }

    public static final Object d(Object obj, InterfaceC0613D interfaceC0613D) {
        C2.k.e(interfaceC0613D, "listEncoder");
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (J2.n.p(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, null)) {
            String substring = str.substring(40);
            C2.k.d(substring, "substring(...)");
            return interfaceC0613D.b(substring);
        }
        if (!J2.n.p(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu", false, 2, null)) {
            return obj;
        }
        String substring2 = str.substring(40);
        C2.k.d(substring2, "substring(...)");
        return Double.valueOf(Double.parseDouble(substring2));
    }
}

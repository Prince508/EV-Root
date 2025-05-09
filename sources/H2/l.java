package h2;

import a2.C0313a;
import i2.C0507e;
import i2.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final i2.i f7274a;

    /* renamed from: b, reason: collision with root package name */
    public b f7275b;

    /* renamed from: c, reason: collision with root package name */
    public final i.c f7276c;

    public class a implements i.c {
        public a() {
        }

        @Override // i2.i.c
        public void a(i2.h hVar, i.d dVar) {
            if (l.this.f7275b == null) {
                return;
            }
            String str = hVar.f7499a;
            str.getClass();
            if (!str.equals("Localization.getStringResource")) {
                dVar.c();
                return;
            }
            JSONObject jSONObject = (JSONObject) hVar.b();
            try {
                dVar.b(l.this.f7275b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e3) {
                dVar.a("error", e3.getMessage(), null);
            }
        }
    }

    public interface b {
        String a(String str, String str2);
    }

    public l(C0313a c0313a) {
        a aVar = new a();
        this.f7276c = aVar;
        i2.i iVar = new i2.i(c0313a, "flutter/localization", C0507e.f7498a);
        this.f7274a = iVar;
        iVar.e(aVar);
    }

    public void b(List list) {
        W1.b.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            W1.b.f("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.f7274a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f7275b = bVar;
    }
}

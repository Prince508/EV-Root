package j2;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import h2.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: j2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0522d {

    /* renamed from: a, reason: collision with root package name */
    public final l f7981a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f7982b;

    /* renamed from: c, reason: collision with root package name */
    public final l.b f7983c;

    /* renamed from: j2.d$a */
    public class a implements l.b {
        public a() {
        }

        @Override // h2.l.b
        public String a(String str, String str2) {
            Context context = C0522d.this.f7982b;
            if (str2 != null) {
                Locale b3 = C0522d.b(str2);
                Configuration configuration = new Configuration(C0522d.this.f7982b.getResources().getConfiguration());
                configuration.setLocale(b3);
                context = C0522d.this.f7982b.createConfigurationContext(configuration);
            }
            int identifier = context.getResources().getIdentifier(str, "string", C0522d.this.f7982b.getPackageName());
            if (identifier != 0) {
                return context.getResources().getString(identifier);
            }
            return null;
        }
    }

    public C0522d(Context context, l lVar) {
        a aVar = new a();
        this.f7983c = aVar;
        this.f7982b = context;
        this.f7981a = lVar;
        lVar.c(aVar);
    }

    public static Locale b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i3 = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = "";
        } else {
            str2 = split[1];
            i3 = 2;
        }
        if (split.length > i3 && split[i3].length() >= 2 && split[i3].length() <= 3) {
            str4 = split[i3];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale c(List list) {
        Locale lookup;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 26) {
            LocaleList locales = this.f7982b.getResources().getConfiguration().getLocales();
            for (int i3 = 0; i3 < locales.size(); i3++) {
                Locale locale = locales.get(i3);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Locale locale2 = (Locale) it.next();
                    if (locale.equals(locale2)) {
                        return locale2;
                    }
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Locale locale3 = (Locale) it2.next();
                    if (locale.getLanguage().equals(locale3.toLanguageTag())) {
                        return locale3;
                    }
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Locale locale4 = (Locale) it3.next();
                    if (locale.getLanguage().equals(locale4.getLanguage())) {
                        return locale4;
                    }
                }
            }
            return (Locale) list.get(0);
        }
        ArrayList arrayList = new ArrayList();
        LocaleList locales2 = this.f7982b.getResources().getConfiguration().getLocales();
        int size = locales2.size();
        for (int i4 = 0; i4 < size; i4++) {
            Locale locale5 = locales2.get(i4);
            String language = locale5.getLanguage();
            if (!locale5.getScript().isEmpty()) {
                language = language + "-" + locale5.getScript();
            }
            if (!locale5.getCountry().isEmpty()) {
                language = language + "-" + locale5.getCountry();
            }
            arrayList.add(AbstractC0520b.a(language));
            AbstractC0521c.a();
            arrayList.add(AbstractC0520b.a(locale5.getLanguage()));
            AbstractC0521c.a();
            arrayList.add(AbstractC0520b.a(locale5.getLanguage() + "-*"));
        }
        lookup = Locale.lookup(arrayList, list);
        return lookup != null ? lookup : (Locale) list.get(0);
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(locales.get(i3));
        }
        this.f7981a.b(arrayList);
    }
}

package P1;

import P1.j;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f1710b = new i(new j.a());

    /* renamed from: c, reason: collision with root package name */
    public static final i f1711c = new i(new j.e());

    /* renamed from: d, reason: collision with root package name */
    public static final i f1712d = new i(new j.g());

    /* renamed from: e, reason: collision with root package name */
    public static final i f1713e = new i(new j.f());

    /* renamed from: f, reason: collision with root package name */
    public static final i f1714f = new i(new j.b());

    /* renamed from: g, reason: collision with root package name */
    public static final i f1715g = new i(new j.d());

    /* renamed from: h, reason: collision with root package name */
    public static final i f1716h = new i(new j.c());

    /* renamed from: a, reason: collision with root package name */
    public final e f1717a;

    public static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        public final j f1718a;

        @Override // P1.i.e
        public Object a(String str) {
            Iterator it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f1718a.a(str, (Provider) it.next());
                } catch (Exception e3) {
                    if (exc == null) {
                        exc = e3;
                    }
                }
            }
            return this.f1718a.a(str, null);
        }

        public b(j jVar) {
            this.f1718a = jVar;
        }
    }

    public static class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final j f1719a;

        @Override // P1.i.e
        public Object a(String str) {
            return this.f1719a.a(str, null);
        }

        public c(j jVar) {
            this.f1719a = jVar;
        }
    }

    public static class d implements e {

        /* renamed from: a, reason: collision with root package name */
        public final j f1720a;

        @Override // P1.i.e
        public Object a(String str) {
            Iterator it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f1720a.a(str, (Provider) it.next());
                } catch (Exception e3) {
                    if (exc == null) {
                        exc = e3;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }

        public d(j jVar) {
            this.f1720a = jVar;
        }
    }

    public interface e {
        Object a(String str);
    }

    public i(j jVar) {
        if (G1.b.c()) {
            this.f1717a = new d(jVar);
        } else if (q.b()) {
            this.f1717a = new b(jVar);
        } else {
            this.f1717a = new c(jVar);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        return this.f1717a.a(str);
    }
}

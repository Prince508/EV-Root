package B1;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f74b = Logger.getLogger(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentMap f75a;

    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J1.d f76a;

        public a(J1.d dVar) {
            this.f76a = dVar;
        }

        @Override // B1.j.b
        public h a(Class cls) {
            try {
                return new i(this.f76a, cls);
            } catch (IllegalArgumentException e3) {
                throw new GeneralSecurityException("Primitive type not supported", e3);
            }
        }

        @Override // B1.j.b
        public Set b() {
            return this.f76a.i();
        }

        @Override // B1.j.b
        public h c() {
            J1.d dVar = this.f76a;
            return new i(dVar, dVar.b());
        }

        @Override // B1.j.b
        public Class d() {
            return this.f76a.getClass();
        }
    }

    public interface b {
        h a(Class cls);

        Set b();

        h c();

        Class d();
    }

    public j(j jVar) {
        this.f75a = new ConcurrentHashMap(jVar.f75a);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static b b(J1.d dVar) {
        return new a(dVar);
    }

    public static String i(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        boolean z3 = true;
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            if (!z3) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z3 = false;
        }
        return sb.toString();
    }

    public h c(String str, Class cls) {
        return e(str, (Class) a(cls));
    }

    public final synchronized b d(String str) {
        if (!this.f75a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (b) this.f75a.get(str);
    }

    public final h e(String str, Class cls) {
        b d3 = d(str);
        if (cls == null) {
            return d3.c();
        }
        if (d3.b().contains(cls)) {
            return d3.a(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + d3.d() + ", supported primitives: " + i(d3.b()));
    }

    public h f(String str) {
        return d(str).c();
    }

    public synchronized void g(J1.d dVar) {
        if (!dVar.a().c()) {
            throw new GeneralSecurityException("failed to register key manager " + dVar.getClass() + " as it is not FIPS compatible.");
        }
        h(b(dVar), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005c, code lost:
    
        r4.f75a.putIfAbsent(r0, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void h(B1.j.b r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            B1.h r0 = r5.c()     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L58
            java.util.concurrent.ConcurrentMap r1 = r4.f75a     // Catch: java.lang.Throwable -> L58
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L58
            B1.j$b r1 = (B1.j.b) r1     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L5a
            java.lang.Class r2 = r1.d()     // Catch: java.lang.Throwable -> L58
            java.lang.Class r3 = r5.d()     // Catch: java.lang.Throwable -> L58
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L22
            goto L5a
        L22:
            java.util.logging.Logger r6 = B1.j.f74b     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "Attempted overwrite of a registered key manager for key type "
            r2.append(r3)     // Catch: java.lang.Throwable -> L58
            r2.append(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L58
            r6.warning(r2)     // Catch: java.lang.Throwable -> L58
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "typeUrl (%s) is already registered with %s, cannot be re-registered with %s"
            java.lang.Class r1 = r1.d()     // Catch: java.lang.Throwable -> L58
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L58
            java.lang.Class r5 = r5.d()     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L58
            java.lang.Object[] r5 = new java.lang.Object[]{r0, r1, r5}     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = java.lang.String.format(r2, r5)     // Catch: java.lang.Throwable -> L58
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L58
            throw r6     // Catch: java.lang.Throwable -> L58
        L58:
            r5 = move-exception
            goto L69
        L5a:
            if (r6 != 0) goto L62
            java.util.concurrent.ConcurrentMap r6 = r4.f75a     // Catch: java.lang.Throwable -> L58
            r6.putIfAbsent(r0, r5)     // Catch: java.lang.Throwable -> L58
            goto L67
        L62:
            java.util.concurrent.ConcurrentMap r6 = r4.f75a     // Catch: java.lang.Throwable -> L58
            r6.put(r0, r5)     // Catch: java.lang.Throwable -> L58
        L67:
            monitor-exit(r4)
            return
        L69:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L58
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.j.h(B1.j$b, boolean):void");
    }

    public boolean j(String str) {
        return this.f75a.containsKey(str);
    }

    public j() {
        this.f75a = new ConcurrentHashMap();
    }
}

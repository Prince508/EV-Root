package B1;

import J1.d;
import O1.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.O;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f117a = Logger.getLogger(x.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f118b = new AtomicReference(new j());

    /* renamed from: c, reason: collision with root package name */
    public static final ConcurrentMap f119c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentMap f120d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentMap f121e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentMap f122f = new ConcurrentHashMap();

    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J1.d f123a;

        public a(J1.d dVar) {
            this.f123a = dVar;
        }
    }

    public interface b {
    }

    public static b a(J1.d dVar) {
        return new a(dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0052, code lost:
    
        r5 = (java.util.Map.Entry) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (B1.x.f122f.containsKey(r5.getKey()) == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted to register a new key template " + ((java.lang.String) r5.getKey()) + " from an existing key manager of type " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r3 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        if (r3.hasNext() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        r4 = (java.util.Map.Entry) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (B1.x.f122f.containsKey(r4.getKey()) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c7, code lost:
    
        throw new java.security.GeneralSecurityException("Attempted overwrite of a registered key template " + ((java.lang.String) r4.getKey()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (((B1.j) B1.x.f118b.get()).j(r3) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
    
        r4 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        if (r4.hasNext() == false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void b(java.lang.String r3, java.util.Map r4, boolean r5) {
        /*
            java.lang.Class<B1.x> r0 = B1.x.class
            monitor-enter(r0)
            if (r5 == 0) goto L34
            java.util.concurrent.ConcurrentMap r1 = B1.x.f120d     // Catch: java.lang.Throwable -> L31
            boolean r2 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L34
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L1a
            goto L34
        L1a:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "New keys are already disallowed for key type "
            r5.append(r1)     // Catch: java.lang.Throwable -> L31
            r5.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L31
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L31
            throw r4     // Catch: java.lang.Throwable -> L31
        L31:
            r3 = move-exception
            goto Lc8
        L34:
            if (r5 == 0) goto Lca
            java.util.concurrent.atomic.AtomicReference r5 = B1.x.f118b     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L31
            B1.j r5 = (B1.j) r5     // Catch: java.lang.Throwable -> L31
            boolean r5 = r5.j(r3)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L8a
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L31
        L4c:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto Lca
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L31
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentMap r1 = B1.x.f122f     // Catch: java.lang.Throwable -> L31
            java.lang.Object r2 = r5.getKey()     // Catch: java.lang.Throwable -> L31
            boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L65
            goto L4c
        L65:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "Attempted to register a new key template "
            r1.append(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L31
            r1.append(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = " from an existing key manager of type "
            r1.append(r5)     // Catch: java.lang.Throwable -> L31
            r1.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L31
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L31
            throw r4     // Catch: java.lang.Throwable -> L31
        L8a:
            java.util.Set r3 = r4.entrySet()     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L31
        L92:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto Lca
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L31
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.ConcurrentMap r5 = B1.x.f122f     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r4.getKey()     // Catch: java.lang.Throwable -> L31
            boolean r5 = r5.containsKey(r1)     // Catch: java.lang.Throwable -> L31
            if (r5 != 0) goto Lab
            goto L92
        Lab:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r5.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "Attempted overwrite of a registered key template "
            r5.append(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r4 = r4.getKey()     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L31
            r5.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L31
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        Lc8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r3
        Lca:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.x.b(java.lang.String, java.util.Map, boolean):void");
    }

    public static Object c(g gVar, Class cls) {
        return J1.h.c().b(gVar, cls);
    }

    public static Class d(Class cls) {
        try {
            return J1.h.c().a(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object e(O1.y yVar, Class cls) {
        return f(yVar.a0(), yVar.b0(), cls);
    }

    public static Object f(String str, AbstractC0417h abstractC0417h, Class cls) {
        return ((j) f118b.get()).c(str, cls).c(abstractC0417h);
    }

    public static Object g(String str, byte[] bArr, Class cls) {
        return f(str, AbstractC0417h.m(bArr), cls);
    }

    public static h h(String str) {
        return ((j) f118b.get()).f(str);
    }

    public static synchronized Map i() {
        Map unmodifiableMap;
        synchronized (x.class) {
            unmodifiableMap = Collections.unmodifiableMap(f122f);
        }
        return unmodifiableMap;
    }

    public static synchronized O j(A a3) {
        O d3;
        synchronized (x.class) {
            h h3 = h(a3.a0());
            if (!((Boolean) f120d.get(a3.a0())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a3.a0());
            }
            d3 = h3.d(a3.b0());
        }
        return d3;
    }

    public static synchronized O1.y k(A a3) {
        O1.y a4;
        synchronized (x.class) {
            h h3 = h(a3.a0());
            if (!((Boolean) f120d.get(a3.a0())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a3.a0());
            }
            a4 = h3.a(a3.b0());
        }
        return a4;
    }

    public static synchronized void l(J1.d dVar, boolean z3) {
        synchronized (x.class) {
            try {
                if (dVar == null) {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
                AtomicReference atomicReference = f118b;
                j jVar = new j((j) atomicReference.get());
                jVar.g(dVar);
                String d3 = dVar.d();
                b(d3, z3 ? dVar.f().c() : Collections.EMPTY_MAP, z3);
                if (!((j) atomicReference.get()).j(d3)) {
                    f119c.put(d3, a(dVar));
                    if (z3) {
                        m(d3, dVar.f().c());
                    }
                }
                f120d.put(d3, Boolean.valueOf(z3));
                atomicReference.set(jVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void m(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f122f.put((String) entry.getKey(), l.a(str, ((O) ((d.a.C0026a) entry.getValue()).f870a).e(), ((d.a.C0026a) entry.getValue()).f871b));
        }
    }

    public static synchronized void n(w wVar) {
        synchronized (x.class) {
            J1.h.c().e(wVar);
        }
    }

    public static Object o(v vVar, Class cls) {
        return J1.h.c().f(vVar, cls);
    }
}

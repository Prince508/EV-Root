package J0;

import F0.d;
import G0.c;
import P0.a;
import R0.j;
import j.AbstractC0515e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.jar.Attributes;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f837a = {"SHA-512", "SHA-384", "SHA-256", "SHA-1"};

    /* renamed from: b, reason: collision with root package name */
    public static final Map f838b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f839c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f840a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f841b;

        public b(String str, byte[] bArr) {
            this.f840a = str;
            this.f841b = bArr;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f842a;

        /* renamed from: b, reason: collision with root package name */
        public final List f843b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final List f844c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final List f845d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public final List f846e = new ArrayList();

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final String f847a;

            /* renamed from: b, reason: collision with root package name */
            public final String f848b;

            /* renamed from: c, reason: collision with root package name */
            public final String f849c;

            /* renamed from: d, reason: collision with root package name */
            public final List f850d;

            /* renamed from: e, reason: collision with root package name */
            public final List f851e;

            /* renamed from: f, reason: collision with root package name */
            public final List f852f;

            public final void d(d.e eVar, Object... objArr) {
                this.f852f.add(new d.f(eVar, objArr));
            }

            public final void e(d.e eVar, Object... objArr) {
                this.f851e.add(new d.f(eVar, objArr));
            }

            public final boolean f() {
                return !this.f852f.isEmpty();
            }

            public List g() {
                return this.f852f;
            }

            public List h() {
                return this.f851e;
            }

            public a(String str, String str2, String str3) {
                this.f850d = new ArrayList();
                this.f851e = new ArrayList();
                this.f852f = new ArrayList();
                this.f847a = str;
                this.f849c = str2;
                this.f848b = str3;
            }
        }

        public final void d(d.e eVar, Object... objArr) {
            this.f846e.add(new d.f(eVar, objArr));
        }

        public final void e(d.e eVar, Object... objArr) {
            this.f845d.add(new d.f(eVar, objArr));
        }

        public final boolean f() {
            if (!this.f846e.isEmpty()) {
                return true;
            }
            Iterator it = this.f843b.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).f()) {
                    return true;
                }
            }
            return false;
        }

        public List g() {
            return this.f846e;
        }

        public List h() {
            return this.f845d;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f853a;

        /* renamed from: b, reason: collision with root package name */
        public final c.a f854b;

        /* renamed from: c, reason: collision with root package name */
        public final T0.a f855c;

        /* renamed from: d, reason: collision with root package name */
        public final T0.a f856d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f857e;

        /* renamed from: f, reason: collision with root package name */
        public byte[] f858f;

        /* renamed from: g, reason: collision with root package name */
        public Set f859g;

        public final void a(a.b bVar, Map map, Set set) {
            String a3 = bVar.a("X-Android-APK-Signed");
            if (a3 == null) {
                if (set.isEmpty()) {
                    return;
                }
                this.f854b.e(d.e.JAR_SIG_NO_APK_SIG_STRIP_PROTECTION, this.f855c.f());
                return;
            }
            if (map.isEmpty()) {
                return;
            }
            Set keySet = map.keySet();
            HashSet<Integer> hashSet = new HashSet(1);
            StringTokenizer stringTokenizer = new StringTokenizer(a3, ",");
            while (stringTokenizer.hasMoreTokens()) {
                String trim = stringTokenizer.nextToken().trim();
                if (!trim.isEmpty()) {
                    try {
                        int parseInt = Integer.parseInt(trim);
                        if (keySet.contains(Integer.valueOf(parseInt))) {
                            hashSet.add(Integer.valueOf(parseInt));
                        } else {
                            this.f854b.e(d.e.JAR_SIG_UNKNOWN_APK_SIG_SCHEME_ID, this.f855c.f(), Integer.valueOf(parseInt));
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            for (Integer num : hashSet) {
                num.intValue();
                if (!set.contains(num)) {
                    this.f854b.d(d.e.JAR_SIG_MISSING_APK_SIG_REFERENCED, this.f855c.f(), num, (String) map.get(num));
                }
            }
        }

        public String b() {
            return this.f853a;
        }

        public c.a c() {
            return this.f854b;
        }

        public Set d() {
            return this.f859g;
        }

        public String e() {
            return this.f856d.f();
        }

        public String f() {
            return this.f855c.f();
        }

        public boolean g() {
            return this.f857e;
        }

        public void h() {
            this.f857e = true;
        }

        public final boolean i(a.b bVar, boolean z3, byte[] bArr, int i3, int i4) {
            Base64.Encoder encoder;
            String encodeToString;
            Base64.Encoder encoder2;
            String encodeToString2;
            Collection<b> i5 = e.i(bVar, z3 ? "-Digest" : "-Digest-Manifest", i3, i4);
            if (i5.isEmpty()) {
                this.f854b.e(d.e.JAR_SIG_NO_MANIFEST_DIGEST_IN_SIG_FILE, this.f855c.f());
                return false;
            }
            boolean z4 = true;
            for (b bVar2 : i5) {
                String str = bVar2.f840a;
                byte[] e3 = e.e(str, bArr);
                byte[] bArr2 = bVar2.f841b;
                if (!Arrays.equals(bArr2, e3)) {
                    c.a aVar = this.f854b;
                    d.e eVar = d.e.JAR_SIG_ZIP_ENTRY_DIGEST_DID_NOT_VERIFY;
                    String f3 = this.f855c.f();
                    encoder = Base64.getEncoder();
                    encodeToString = encoder.encodeToString(e3);
                    encoder2 = Base64.getEncoder();
                    encodeToString2 = encoder2.encodeToString(bArr2);
                    aVar.e(eVar, "META-INF/MANIFEST.MF", str, f3, encodeToString, encodeToString2);
                    z4 = false;
                }
            }
            return z4;
        }

        public final void j(a.b bVar, boolean z3, a.b bVar2, byte[] bArr, int i3, int i4) {
            Base64.Encoder encoder;
            String encodeToString;
            Base64.Encoder encoder2;
            String encodeToString2;
            String c3 = bVar.c();
            Collection<b> i5 = e.i(bVar, "-Digest", i3, i4);
            if (i5.isEmpty()) {
                this.f854b.d(d.e.JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_SIG_FILE, c3, this.f855c.f());
                return;
            }
            int e3 = bVar2.e();
            int d3 = bVar2.d();
            if (z3) {
                int i6 = e3 + d3;
                if (bArr[i6 - 1] == 10 && bArr[i6 - 2] == 10) {
                    d3--;
                }
            }
            for (b bVar3 : i5) {
                String str = bVar3.f840a;
                byte[] f3 = e.f(str, bArr, e3, d3);
                byte[] bArr2 = bVar3.f841b;
                if (!Arrays.equals(bArr2, f3)) {
                    c.a aVar = this.f854b;
                    d.e eVar = d.e.JAR_SIG_MANIFEST_SECTION_DIGEST_DID_NOT_VERIFY;
                    String f4 = this.f855c.f();
                    encoder = Base64.getEncoder();
                    encodeToString = encoder.encodeToString(f3);
                    encoder2 = Base64.getEncoder();
                    encodeToString2 = encoder2.encodeToString(bArr2);
                    aVar.d(eVar, c3, str, f4, encodeToString, encodeToString2);
                }
            }
        }

        public final void k(a.b bVar, a.b bVar2, byte[] bArr, int i3, int i4) {
            Base64.Encoder encoder;
            String encodeToString;
            Base64.Encoder encoder2;
            String encodeToString2;
            Collection<b> i5 = e.i(bVar, "-Digest-Manifest-Main-Attributes", i3, i4);
            if (i5.isEmpty()) {
                return;
            }
            for (b bVar3 : i5) {
                String str = bVar3.f840a;
                byte[] f3 = e.f(str, bArr, bVar2.e(), bVar2.d());
                byte[] bArr2 = bVar3.f841b;
                if (!Arrays.equals(bArr2, f3)) {
                    c.a aVar = this.f854b;
                    d.e eVar = d.e.JAR_SIG_MANIFEST_MAIN_SECTION_DIGEST_DID_NOT_VERIFY;
                    String f4 = this.f855c.f();
                    encoder = Base64.getEncoder();
                    encodeToString = encoder.encodeToString(f3);
                    encoder2 = Base64.getEncoder();
                    encodeToString2 = encoder2.encodeToString(bArr2);
                    aVar.d(eVar, str, f4, encodeToString, encodeToString2);
                }
            }
        }

        public void l(U0.c cVar, long j3, int i3, int i4) {
            try {
                byte[] b3 = T0.b.b(cVar, this.f856d, j3);
                try {
                    this.f858f = T0.b.b(cVar, this.f855c, j3);
                    try {
                        AbstractC0515e.a(N0.c.s(ByteBuffer.wrap(b3), Q0.a.class));
                        throw null;
                    } catch (N0.e e3) {
                        e3.printStackTrace();
                        this.f854b.d(d.e.JAR_SIG_PARSE_EXCEPTION, this.f856d.f(), e3);
                    }
                } catch (V0.a e4) {
                    throw new G0.a("Malformed ZIP entry: " + this.f855c.f(), e4);
                }
            } catch (V0.a e5) {
                throw new G0.a("Malformed ZIP entry: " + this.f856d.f(), e5);
            }
        }

        public void m(byte[] bArr, a.b bVar, Map map, Map map2, Set set, int i3, int i4) {
            P0.a aVar = new P0.a(this.f858f);
            a.b g3 = aVar.g();
            if (g3.b(Attributes.Name.SIGNATURE_VERSION) == null) {
                this.f854b.d(d.e.JAR_SIG_MISSING_VERSION_ATTR_IN_SIG_FILE, this.f855c.f());
                h();
                return;
            }
            if (i4 >= 24) {
                a(g3, map2, set);
                if (this.f854b.f()) {
                    return;
                }
            }
            String a3 = g3.a("Created-By");
            int i5 = 0;
            boolean z3 = a3 != null ? a3.indexOf("signtool") != -1 : false;
            boolean i6 = i(g3, z3, bArr, i3, i4);
            boolean z4 = z3;
            if (!z4) {
                k(g3, bVar, bArr, i3, i4);
            }
            if (this.f854b.f()) {
                return;
            }
            List<a.b> c3 = aVar.c();
            HashSet hashSet = new HashSet(c3.size());
            for (a.b bVar2 : c3) {
                int i7 = i5 + 1;
                String c4 = bVar2.c();
                if (c4 == null) {
                    this.f854b.d(d.e.JAR_SIG_UNNNAMED_SIG_FILE_SECTION, this.f855c.f(), Integer.valueOf(i7));
                    h();
                    return;
                }
                if (!hashSet.add(c4)) {
                    this.f854b.d(d.e.JAR_SIG_DUPLICATE_SIG_FILE_SECTION, this.f855c.f(), c4);
                    h();
                    return;
                }
                if (!i6) {
                    a.b bVar3 = (a.b) map.get(c4);
                    if (bVar3 == null) {
                        this.f854b.d(d.e.JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_SIG_FILE, c4, this.f855c.f());
                        h();
                    } else {
                        boolean z5 = z4;
                        j(bVar2, z5, bVar3, bArr, i3, i4);
                        z4 = z5;
                    }
                }
                i5 = i7;
            }
            this.f859g = hashSet;
        }

        public d(String str, T0.a aVar, T0.a aVar2, c.a aVar3) {
            this.f853a = str;
            this.f854b = aVar3;
            this.f856d = aVar;
            this.f855c = aVar2;
        }
    }

    /* renamed from: J0.e$e, reason: collision with other inner class name */
    public static class C0024e {
        public static void b(U0.c cVar, long j3, List list, Set set, Map map, Set set2, int i3, int i4, c cVar2) {
            HashMap hashMap = new HashMap(1);
            ArrayList arrayList = new ArrayList(1);
            Iterator it = list.iterator();
            T0.a aVar = null;
            while (it.hasNext()) {
                T0.a aVar2 = (T0.a) it.next();
                String f3 = aVar2.f();
                if (f3.startsWith("META-INF/")) {
                    if (aVar == null && "META-INF/MANIFEST.MF".equals(f3)) {
                        aVar = aVar2;
                    } else if (f3.endsWith(".SF")) {
                        hashMap.put(f3, aVar2);
                    } else if (f3.endsWith(".RSA") || f3.endsWith(".DSA") || f3.endsWith(".EC")) {
                        arrayList.add(aVar2);
                    }
                }
            }
            if (aVar == null) {
                cVar2.d(d.e.JAR_SIG_NO_MANIFEST, new Object[0]);
                return;
            }
            U0.c cVar3 = cVar;
            long j4 = j3;
            try {
                byte[] b3 = T0.b.b(cVar3, aVar, j4);
                j o3 = e.o(b3, set, cVar2);
                if (cVar2.f()) {
                    return;
                }
                a.b bVar = (a.b) o3.a();
                Map map2 = (Map) o3.b();
                ArrayList<d> arrayList2 = new ArrayList(arrayList.size());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    T0.a aVar3 = (T0.a) it2.next();
                    String f4 = aVar3.f();
                    int lastIndexOf = f4.lastIndexOf(46);
                    if (lastIndexOf == -1) {
                        throw new RuntimeException("Signature block file name does not contain extension: " + f4);
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it3 = it2;
                    sb.append(f4.substring(0, lastIndexOf));
                    sb.append(".SF");
                    String sb2 = sb.toString();
                    T0.a aVar4 = (T0.a) hashMap.get(sb2);
                    if (aVar4 == null) {
                        cVar2.e(d.e.JAR_SIG_MISSING_FILE, f4, sb2);
                        it2 = it3;
                    } else {
                        String substring = f4.substring(9);
                        arrayList2.add(new d(substring, aVar3, aVar4, new c.a(substring, f4, aVar4.f())));
                        it2 = it3;
                        hashMap = hashMap;
                    }
                }
                if (arrayList2.isEmpty()) {
                    cVar2.d(d.e.JAR_SIG_NO_SIGNATURES, new Object[0]);
                    return;
                }
                if (arrayList2.size() > 10) {
                    cVar2.d(d.e.JAR_SIG_MAX_SIGNATURES_EXCEEDED, 10, Integer.valueOf(arrayList2.size()));
                    return;
                }
                for (d dVar : arrayList2) {
                    ArrayList arrayList3 = arrayList2;
                    dVar.l(cVar3, j4, i3, i4);
                    if (dVar.c().f()) {
                        cVar2.f843b.add(dVar.c());
                    }
                    cVar3 = cVar;
                    j4 = j3;
                    arrayList2 = arrayList3;
                }
                ArrayList<d> arrayList4 = arrayList2;
                if (cVar2.f()) {
                    return;
                }
                ArrayList<d> arrayList5 = new ArrayList(arrayList4.size());
                for (d dVar2 : arrayList4) {
                    byte[] bArr = b3;
                    Map map3 = map2;
                    a.b bVar2 = bVar;
                    dVar2.m(bArr, bVar2, map3, map, set2, i3, i4);
                    if (dVar2.g()) {
                        cVar2.f844c.add(dVar2.c());
                    } else if (dVar2.c().f()) {
                        cVar2.f843b.add(dVar2.c());
                    } else {
                        arrayList5.add(dVar2);
                    }
                    b3 = bArr;
                    bVar = bVar2;
                    map2 = map3;
                }
                Map map4 = map2;
                if (cVar2.f()) {
                    return;
                }
                if (arrayList5.isEmpty()) {
                    cVar2.d(d.e.JAR_SIG_NO_SIGNATURES, new Object[0]);
                    return;
                }
                Set<d> r3 = e.r(cVar, j3, list, map4, arrayList5, i3, i4, cVar2);
                if (cVar2.f()) {
                    return;
                }
                HashSet hashSet = new HashSet((cVar2.f843b.size() * 2) + 1);
                hashSet.add(aVar.f());
                for (d dVar3 : r3) {
                    hashSet.add(dVar3.e());
                    hashSet.add(dVar3.f());
                }
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    String f5 = ((T0.a) it4.next()).f();
                    if (f5.startsWith("META-INF/") && !f5.endsWith("/") && !hashSet.contains(f5)) {
                        cVar2.e(d.e.JAR_SIG_UNPROTECTED_ZIP_ENTRY, f5);
                    }
                }
                for (d dVar4 : arrayList5) {
                    if (r3.contains(dVar4)) {
                        cVar2.f843b.add(dVar4.c());
                    } else {
                        cVar2.f844c.add(dVar4.c());
                    }
                }
                cVar2.f842a = true;
            } catch (V0.a e3) {
                throw new G0.a("Malformed ZIP entry: " + aVar.f(), e3);
            }
        }
    }

    static {
        HashMap hashMap = new HashMap(8);
        f838b = hashMap;
        hashMap.put("MD5", "MD5");
        hashMap.put("SHA", "SHA-1");
        hashMap.put("SHA1", "SHA-1");
        hashMap.put("SHA-1", "SHA-1");
        hashMap.put("SHA-256", "SHA-256");
        hashMap.put("SHA-384", "SHA-384");
        hashMap.put("SHA-512", "SHA-512");
        HashMap hashMap2 = new HashMap(5);
        f839c = hashMap2;
        hashMap2.put("MD5", 0);
        hashMap2.put("SHA-1", 0);
        hashMap2.put("SHA-256", 0);
        hashMap2.put("SHA-384", 9);
        hashMap2.put("SHA-512", 9);
    }

    public static Set d(List list, c cVar) {
        HashSet hashSet = new HashSet(list.size());
        Iterator it = list.iterator();
        HashSet hashSet2 = null;
        while (it.hasNext()) {
            String f3 = ((T0.a) it.next()).f();
            if (!hashSet.add(f3)) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet();
                }
                if (hashSet2.add(f3)) {
                    cVar.d(d.e.JAR_SIG_DUPLICATE_ZIP_ENTRY, f3);
                }
            }
        }
        return hashSet;
    }

    public static byte[] e(String str, byte[] bArr) {
        return k(str).digest(bArr);
    }

    public static byte[] f(String str, byte[] bArr, int i3, int i4) {
        MessageDigest k3 = k(str);
        k3.update(bArr, i3, i4);
        return k3.digest();
    }

    public static String g(String str) {
        return (String) f838b.get(str.toUpperCase(Locale.US));
    }

    public static byte[] h(Collection collection, String str) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f840a.equalsIgnoreCase(str)) {
                return bVar.f841b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r1.isEmpty() != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Collection i(P0.a.b r8, java.lang.String r9, int r10, int r11) {
        /*
            java.util.Base64$Decoder r0 = J0.c.a()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 1
            r1.<init>(r2)
            r2 = 0
            r3 = 18
            if (r10 >= r3) goto L5e
            java.lang.String r4 = "Digest-Algorithms"
            java.lang.String r4 = r8.a(r4)
            if (r4 != 0) goto L19
            java.lang.String r4 = "SHA SHA1"
        L19:
            java.util.StringTokenizer r5 = new java.util.StringTokenizer
            r5.<init>(r4)
        L1e:
            boolean r4 = r5.hasMoreTokens()
            if (r4 == 0) goto L57
            java.lang.String r4 = r5.nextToken()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r8.a(r6)
            if (r6 != 0) goto L3e
            goto L1e
        L3e:
            java.lang.String r4 = g(r4)
            if (r4 == 0) goto L1e
            int r7 = l(r4)
            if (r7 <= r10) goto L4b
            goto L1e
        L4b:
            J0.e$b r10 = new J0.e$b
            byte[] r5 = J0.d.a(r0, r6)
            r10.<init>(r4, r5)
            r1.add(r10)
        L57:
            boolean r10 = r1.isEmpty()
            if (r10 == 0) goto L5e
            goto L8d
        L5e:
            if (r11 < r3) goto L8d
            java.lang.String[] r10 = J0.e.f837a
            int r11 = r10.length
            r3 = 0
        L64:
            if (r3 >= r11) goto L8d
            r4 = r10[r3]
            java.lang.String r5 = j(r4, r9)
            java.lang.String r5 = r8.a(r5)
            if (r5 != 0) goto L75
            int r3 = r3 + 1
            goto L64
        L75:
            byte[] r8 = J0.d.a(r0, r5)
            byte[] r9 = h(r1, r4)
            if (r9 == 0) goto L85
            boolean r9 = java.util.Arrays.equals(r9, r8)
            if (r9 != 0) goto L8d
        L85:
            J0.e$b r9 = new J0.e$b
            r9.<init>(r4, r8)
            r1.add(r9)
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.e.i(P0.a$b, java.lang.String, int, int):java.util.Collection");
    }

    public static String j(String str, String str2) {
        if ("SHA-1".equalsIgnoreCase(str)) {
            return "SHA1" + str2;
        }
        return str + str2;
    }

    public static MessageDigest k(String str) {
        return MessageDigest.getInstance(str);
    }

    public static int l(String str) {
        Integer num = (Integer) f839c.get(str.toUpperCase(Locale.US));
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    public static List m(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).b());
        }
        return arrayList;
    }

    public static boolean n(String str) {
        if (str.startsWith("META-INF/")) {
            return false;
        }
        return !str.endsWith("/");
    }

    public static j o(byte[] bArr, Set set, c cVar) {
        P0.a aVar = new P0.a(bArr);
        a.b g3 = aVar.g();
        List<a.b> c3 = aVar.c();
        HashMap hashMap = new HashMap(c3.size());
        int i3 = 0;
        for (a.b bVar : c3) {
            i3++;
            String c4 = bVar.c();
            if (c4 == null) {
                cVar.d(d.e.JAR_SIG_UNNNAMED_MANIFEST_SECTION, Integer.valueOf(i3));
            } else if (hashMap.put(c4, bVar) != null) {
                cVar.d(d.e.JAR_SIG_DUPLICATE_MANIFEST_SECTION, c4);
            } else if (!set.contains(c4)) {
                cVar.d(d.e.JAR_SIG_MISSING_ZIP_ENTRY_REFERENCED_IN_MANIFEST, c4);
            }
        }
        return j.c(g3, hashMap);
    }

    public static List p(U0.c cVar, c.C0010c c0010c) {
        return T0.c.l(cVar, c0010c);
    }

    public static c q(U0.c cVar, c.C0010c c0010c, Map map, Set set, int i3, int i4) {
        if (i3 <= i4) {
            c cVar2 = new c();
            List p3 = p(cVar, c0010c);
            Set d3 = d(p3, cVar2);
            if (cVar2.f()) {
                return cVar2;
            }
            C0024e.b(cVar, c0010c.a(), p3, d3, map, set, i3, i4, cVar2);
            return cVar2;
        }
        throw new IllegalArgumentException("minSdkVersion (" + i3 + ") > maxSdkVersion (" + i4 + ")");
    }

    public static Set r(U0.c cVar, long j3, Collection collection, Map map, List list, int i3, int i4, c cVar2) {
        ArrayList arrayList;
        String str;
        Base64.Encoder encoder;
        String encodeToString;
        Base64.Encoder encoder2;
        String encodeToString2;
        ArrayList arrayList2 = new ArrayList(collection);
        Collections.sort(arrayList2, T0.a.f2028l);
        Iterator it = arrayList2.iterator();
        ArrayList arrayList3 = null;
        String str2 = null;
        while (true) {
            int i5 = 0;
            if (!it.hasNext()) {
                break;
            }
            T0.a aVar = (T0.a) it.next();
            String f3 = aVar.f();
            if (n(f3)) {
                a.b bVar = (a.b) map.get(f3);
                if (bVar == null) {
                    cVar2.d(d.e.JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_MANIFEST, f3);
                } else {
                    ArrayList arrayList4 = new ArrayList(list.size());
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        d dVar = (d) it2.next();
                        if (dVar.d().contains(f3)) {
                            arrayList4.add(dVar);
                        }
                    }
                    if (arrayList4.isEmpty()) {
                        cVar2.d(d.e.JAR_SIG_ZIP_ENTRY_NOT_SIGNED, f3);
                    } else {
                        if (arrayList3 == null) {
                            str2 = f3;
                            arrayList3 = arrayList4;
                        } else if (!arrayList4.equals(arrayList3)) {
                            cVar2.d(d.e.JAR_SIG_ZIP_ENTRY_SIGNERS_MISMATCH, str2, m(arrayList3), f3, m(arrayList4));
                        }
                        ArrayList arrayList5 = new ArrayList(i(bVar, "-Digest", i3, i4));
                        if (arrayList5.isEmpty()) {
                            cVar2.d(d.e.JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_MANIFEST, f3);
                        } else {
                            MessageDigest[] messageDigestArr = new MessageDigest[arrayList5.size()];
                            for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                                messageDigestArr[i6] = k(((b) arrayList5.get(i6)).f840a);
                            }
                            try {
                                T0.b.c(cVar, aVar, j3, U0.b.a(messageDigestArr));
                                while (i5 < arrayList5.size()) {
                                    b bVar2 = (b) arrayList5.get(i5);
                                    byte[] digest = messageDigestArr[i5].digest();
                                    Iterator it3 = it;
                                    if (Arrays.equals(bVar2.f841b, digest)) {
                                        arrayList = arrayList3;
                                        str = str2;
                                    } else {
                                        d.e eVar = d.e.JAR_SIG_ZIP_ENTRY_DIGEST_DID_NOT_VERIFY;
                                        arrayList = arrayList3;
                                        String str3 = bVar2.f840a;
                                        str = str2;
                                        encoder = Base64.getEncoder();
                                        encodeToString = encoder.encodeToString(digest);
                                        encoder2 = Base64.getEncoder();
                                        encodeToString2 = encoder2.encodeToString(bVar2.f841b);
                                        cVar2.d(eVar, f3, str3, "META-INF/MANIFEST.MF", encodeToString, encodeToString2);
                                    }
                                    i5++;
                                    it = it3;
                                    arrayList3 = arrayList;
                                    str2 = str;
                                }
                            } catch (V0.a e3) {
                                throw new G0.a("Malformed ZIP entry: " + f3, e3);
                            } catch (IOException e4) {
                                throw new IOException("Failed to read entry: " + f3, e4);
                            }
                        }
                        it = it;
                        arrayList3 = arrayList3;
                        str2 = str2;
                    }
                }
            }
        }
        if (arrayList3 != null) {
            return new HashSet(arrayList3);
        }
        cVar2.d(d.e.JAR_SIG_NO_SIGNED_ZIP_ENTRIES, new Object[0]);
        return Collections.EMPTY_SET;
    }
}

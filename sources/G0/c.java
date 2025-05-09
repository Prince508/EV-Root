package G0;

import H0.a;
import R0.j;
import android.R;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class c {

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final j[] f573a = {j.c('C', 2), j.c('D', 3), j.c('E', 4), j.c('F', 7), j.c('G', 8), j.c('H', 10), j.c('I', 13), j.c('J', 15), j.c('K', 18), j.c('L', 20), j.c('M', 22), j.c('N', 23), j.c('O', 25)};

        /* renamed from: b, reason: collision with root package name */
        public static final Comparator f574b = new a();

        public static class a implements Comparator {
            public a() {
            }

            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(j jVar, j jVar2) {
                return ((Character) jVar.a()).charValue() - ((Character) jVar2.a()).charValue();
            }
        }
    }

    /* renamed from: G0.c$c, reason: collision with other inner class name */
    public static class C0010c extends V0.b {
        public C0010c(long j3, long j4, int i3, long j5, ByteBuffer byteBuffer) {
            super(j3, j4, i3, j5, byteBuffer);
        }
    }

    public static byte[] a(byte[] bArr) {
        return d.a(bArr);
    }

    public static C0010c b(U0.c cVar) {
        V0.b c3 = d.c(cVar);
        return new C0010c(c3.a(), c3.c(), c3.b(), c3.e(), c3.d());
    }

    public static int c(ByteBuffer byteBuffer, String str, int i3) {
        if (str == null) {
            throw new NullPointerException("elementName cannot be null");
        }
        try {
            H0.a aVar = new H0.a(byteBuffer);
            for (int n3 = aVar.n(); n3 != 2; n3 = aVar.u()) {
                if (n3 == 3 && str.equals(aVar.o())) {
                    for (int i4 = 0; i4 < aVar.h(); i4++) {
                        if (aVar.j(i4) == i3) {
                            int l3 = aVar.l(i4);
                            if (l3 != 1 && l3 != 2) {
                                throw new G0.a("Unsupported value type, " + l3 + ", for attribute " + String.format("0x%08X", Integer.valueOf(i3)) + " under element " + str);
                            }
                            return aVar.i(i4);
                        }
                    }
                }
            }
            throw new G0.a("Failed to determine APK's " + str + " attribute " + String.format("0x%08X", Integer.valueOf(i3)) + " value");
        } catch (a.f e3) {
            throw new G0.a("Unable to determine value for attribute " + String.format("0x%08X", Integer.valueOf(i3)) + " under element " + str + "; malformed binary resource: AndroidManifest.xml", e3);
        }
    }

    public static int d(String str) {
        char charAt = str.isEmpty() ? ' ' : str.charAt(0);
        if (charAt < 'A' || charAt > 'Z') {
            throw new e("Unable to determine APK's minimum supported Android platform version : Unsupported codename in AndroidManifest.xml's minSdkVersion: \"" + str + "\"", str);
        }
        j[] jVarArr = b.f573a;
        int binarySearch = Arrays.binarySearch(jVarArr, j.c(Character.valueOf(charAt), null), b.f574b);
        if (binarySearch >= 0) {
            return ((Integer) jVarArr[binarySearch].b()).intValue();
        }
        if ((-1) - binarySearch == 0) {
            return 1;
        }
        j jVar = jVarArr[(-2) - binarySearch];
        return ((Integer) jVar.b()).intValue() + (charAt - ((Character) jVar.a()).charValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        r4 = r0.l(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r4 == 1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r4 != 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        r6 = r0.i(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        r2 = java.lang.Math.max(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        throw new G0.f("Unable to determine APK's minimum supported Android: unsupported value type in AndroidManifest.xml's minSdkVersion. Only integer values supported.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0052, code lost:
    
        r6 = d(r0.k(r6));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(java.nio.ByteBuffer r6) {
        /*
            H0.a r0 = new H0.a     // Catch: H0.a.f -> L69
            r0.<init>(r6)     // Catch: H0.a.f -> L69
            int r6 = r0.n()     // Catch: H0.a.f -> L69
            r1 = 1
            r2 = r1
        Lb:
            r3 = 2
            if (r6 == r3) goto L68
            r4 = 3
            if (r6 != r4) goto L63
            int r6 = r0.m()     // Catch: H0.a.f -> L69
            if (r6 != r3) goto L63
            java.lang.String r6 = "uses-sdk"
            java.lang.String r4 = r0.o()     // Catch: H0.a.f -> L69
            boolean r6 = r6.equals(r4)     // Catch: H0.a.f -> L69
            if (r6 == 0) goto L63
            java.lang.String r6 = r0.p()     // Catch: H0.a.f -> L69
            boolean r6 = r6.isEmpty()     // Catch: H0.a.f -> L69
            if (r6 == 0) goto L63
            r6 = 0
        L2e:
            int r4 = r0.h()     // Catch: H0.a.f -> L69
            if (r6 >= r4) goto L5e
            int r4 = r0.j(r6)     // Catch: H0.a.f -> L69
            r5 = 16843276(0x101020c, float:2.3695027E-38)
            if (r4 != r5) goto L5b
            int r4 = r0.l(r6)     // Catch: H0.a.f -> L69
            if (r4 == r1) goto L52
            if (r4 != r3) goto L4a
            int r6 = r0.i(r6)     // Catch: H0.a.f -> L69
            goto L5f
        L4a:
            G0.f r6 = new G0.f     // Catch: H0.a.f -> L69
            java.lang.String r0 = "Unable to determine APK's minimum supported Android: unsupported value type in AndroidManifest.xml's minSdkVersion. Only integer values supported."
            r6.<init>(r0)     // Catch: H0.a.f -> L69
            throw r6     // Catch: H0.a.f -> L69
        L52:
            java.lang.String r6 = r0.k(r6)     // Catch: H0.a.f -> L69
            int r6 = d(r6)     // Catch: H0.a.f -> L69
            goto L5f
        L5b:
            int r6 = r6 + 1
            goto L2e
        L5e:
            r6 = r1
        L5f:
            int r2 = java.lang.Math.max(r2, r6)     // Catch: H0.a.f -> L69
        L63:
            int r6 = r0.u()     // Catch: H0.a.f -> L69
            goto Lb
        L68:
            return r2
        L69:
            r6 = move-exception
            G0.f r0 = new G0.f
            java.lang.String r1 = "Unable to determine APK's minimum supported Android platform version: malformed binary resource: AndroidManifest.xml"
            r0.<init>(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.c.e(java.nio.ByteBuffer):int");
    }

    public static int f(ByteBuffer byteBuffer) {
        try {
            return c(byteBuffer, "manifest", R.attr.targetSandboxVersion);
        } catch (G0.a unused) {
            return 1;
        }
    }

    public static int g(ByteBuffer byteBuffer) {
        try {
            return c(byteBuffer, "uses-sdk", R.attr.targetSdkVersion);
        } catch (G0.a unused) {
            byteBuffer.rewind();
            try {
                return e(byteBuffer);
            } catch (G0.a unused2) {
                return 1;
            }
        }
    }
}

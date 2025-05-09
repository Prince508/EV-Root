package L0;

import F0.d;
import G0.c;
import H0.e;
import H0.k;
import R0.h;
import R0.m;
import U0.g;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final g f1306a;

    /* renamed from: b, reason: collision with root package name */
    public final U0.c f1307b;

    /* renamed from: c, reason: collision with root package name */
    public final c.C0010c f1308c;

    /* renamed from: d, reason: collision with root package name */
    public final e.f f1309d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f1310e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1311f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1312g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1313h;

    /* renamed from: i, reason: collision with root package name */
    public final OptionalInt f1314i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1315j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f1316k;

    public static class b {

        /* renamed from: b, reason: collision with root package name */
        public U0.c f1318b;

        /* renamed from: c, reason: collision with root package name */
        public c.C0010c f1319c;

        /* renamed from: d, reason: collision with root package name */
        public ByteBuffer f1320d;

        /* renamed from: e, reason: collision with root package name */
        public Set f1321e;

        /* renamed from: f, reason: collision with root package name */
        public e.f f1322f;

        /* renamed from: g, reason: collision with root package name */
        public int f1323g;

        /* renamed from: h, reason: collision with root package name */
        public int f1324h;

        /* renamed from: a, reason: collision with root package name */
        public g f1317a = g.f2092a;

        /* renamed from: i, reason: collision with root package name */
        public int f1325i = -262969152;

        /* renamed from: j, reason: collision with root package name */
        public boolean f1326j = true;

        /* renamed from: k, reason: collision with root package name */
        public OptionalInt f1327k = OptionalInt.empty();

        public b(U0.c cVar, c.C0010c c0010c, int i3, int i4) {
            this.f1318b = cVar;
            this.f1319c = c0010c;
            this.f1323g = i3;
            this.f1324h = i4;
        }

        public c a() {
            int i3;
            int i4 = this.f1325i;
            if (i4 == -262969152) {
                this.f1323g = Math.max(this.f1323g, 28);
                i3 = 3;
            } else {
                if (i4 != 462663009) {
                    throw new IllegalArgumentException(String.format("Unsupported APK Signature Scheme V3 block ID: 0x%08x", Integer.valueOf(this.f1325i)));
                }
                this.f1323g = this.f1324h;
                i3 = 31;
            }
            if (this.f1322f == null) {
                this.f1322f = new e.f(i3);
            }
            if (this.f1321e == null) {
                this.f1321e = new HashSet(1);
            }
            c cVar = new c(this.f1317a, this.f1318b, this.f1319c, this.f1321e, this.f1322f, this.f1323g, this.f1324h, this.f1325i, this.f1327k, this.f1326j);
            ByteBuffer byteBuffer = this.f1320d;
            if (byteBuffer != null) {
                cVar.f1316k = byteBuffer;
            }
            return cVar;
        }

        public b b(int i3) {
            this.f1325i = i3;
            return this;
        }

        public b c(int i3) {
            this.f1327k = OptionalInt.of(i3);
            return this;
        }

        public b d(g gVar) {
            this.f1317a = gVar;
            return this;
        }
    }

    public static /* synthetic */ boolean b(int i3) {
        return i3 == -1029262406;
    }

    public static boolean f(e.f.a aVar) {
        return aVar.f706l.stream().mapToInt(new ToIntFunction() { // from class: L0.a
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                int a3;
                a3 = ((e.f.a.C0018a) obj).a();
                return a3;
            }
        }).anyMatch(new IntPredicate() { // from class: L0.b
            @Override // java.util.function.IntPredicate
            public final boolean test(int i3) {
                return c.b(i3);
            }
        });
    }

    public final void d(ByteBuffer byteBuffer, CertificateFactory certificateFactory, e.f.a aVar) {
        byte[] encoded;
        ByteBuffer m3 = e.m(byteBuffer);
        byte[] bArr = new byte[m3.remaining()];
        m3.get(bArr);
        m3.flip();
        aVar.f707m = bArr;
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        aVar.f708n = i3;
        aVar.f709o = i4;
        if (i3 < 0 || i3 > i4) {
            aVar.h(d.e.V3_SIG_INVALID_SDK_VERSIONS, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        ByteBuffer m4 = e.m(byteBuffer);
        byte[] q3 = e.q(byteBuffer);
        ArrayList arrayList = new ArrayList(1);
        int i5 = 0;
        while (m4.hasRemaining()) {
            i5++;
            try {
                ByteBuffer m5 = e.m(m4);
                int i6 = m5.getInt();
                byte[] q4 = e.q(m5);
                aVar.f704j.add(new e.f.a.c(i6, q4));
                k f3 = k.f(i6);
                if (f3 == null) {
                    aVar.i(d.e.V3_SIG_UNKNOWN_SIG_ALGORITHM, Integer.valueOf(i6));
                } else {
                    arrayList.add(new e.h(f3, q4));
                }
            } catch (G0.a | BufferUnderflowException unused) {
                aVar.h(d.e.V3_SIG_MALFORMED_SIGNATURE, Integer.valueOf(i5));
                return;
            }
        }
        if (aVar.f704j.isEmpty()) {
            aVar.h(d.e.V3_SIG_NO_SIGNATURES, new Object[0]);
            return;
        }
        try {
            for (e.h hVar : e.n(arrayList, aVar.f708n, aVar.f709o)) {
                k kVar = hVar.f724a;
                String str = (String) kVar.k().a();
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) kVar.k().b();
                try {
                    PublicKey generatePublic = KeyFactory.getInstance(kVar.i()).generatePublic(new X509EncodedKeySpec(q3));
                    try {
                        Signature signature = Signature.getInstance(str);
                        signature.initVerify(generatePublic);
                        if (algorithmParameterSpec != null) {
                            signature.setParameter(algorithmParameterSpec);
                        }
                        m3.position(0);
                        signature.update(m3);
                        byte[] bArr2 = hVar.f725b;
                        if (!signature.verify(bArr2)) {
                            aVar.h(d.e.V3_SIG_DID_NOT_VERIFY, kVar);
                            return;
                        } else {
                            aVar.f705k.put(kVar, bArr2);
                            this.f1310e.add(kVar.g());
                        }
                    } catch (InvalidAlgorithmParameterException e3) {
                        e = e3;
                        aVar.h(d.e.V3_SIG_VERIFY_EXCEPTION, kVar, e);
                        return;
                    } catch (InvalidKeyException e4) {
                        e = e4;
                        aVar.h(d.e.V3_SIG_VERIFY_EXCEPTION, kVar, e);
                        return;
                    } catch (SignatureException e5) {
                        e = e5;
                        aVar.h(d.e.V3_SIG_VERIFY_EXCEPTION, kVar, e);
                        return;
                    }
                } catch (Exception e6) {
                    aVar.h(d.e.V3_SIG_MALFORMED_PUBLIC_KEY, e6);
                    return;
                }
            }
            m3.position(0);
            ByteBuffer m6 = e.m(m3);
            ByteBuffer m7 = e.m(m3);
            int i7 = m3.getInt();
            if (i7 != i3) {
                aVar.h(d.e.V3_MIN_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD, Integer.valueOf(i3), Integer.valueOf(i7));
            }
            int i8 = m3.getInt();
            if (i8 != i4) {
                aVar.h(d.e.V3_MAX_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD, Integer.valueOf(i4), Integer.valueOf(i8));
            }
            ByteBuffer m8 = e.m(m3);
            int i9 = -1;
            while (m7.hasRemaining()) {
                int i10 = i9 + 1;
                byte[] q5 = e.q(m7);
                try {
                    aVar.f675c.add(new h(m.d(q5, certificateFactory), q5));
                    i9 = i10;
                } catch (CertificateException e7) {
                    aVar.h(d.e.V3_SIG_MALFORMED_CERTIFICATE, Integer.valueOf(i10), Integer.valueOf(i9 + 2), e7);
                    return;
                }
            }
            if (aVar.f675c.isEmpty()) {
                aVar.h(d.e.V3_SIG_NO_CERTIFICATES, new Object[0]);
                return;
            }
            X509Certificate x509Certificate = (X509Certificate) aVar.f675c.get(0);
            try {
                encoded = e.j(x509Certificate.getPublicKey());
            } catch (InvalidKeyException e8) {
                System.out.println("Caught an exception encoding the public key: " + e8);
                e8.printStackTrace();
                encoded = x509Certificate.getPublicKey().getEncoded();
            }
            if (!Arrays.equals(q3, encoded)) {
                aVar.h(d.e.V3_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD, e.s(encoded), e.s(q3));
                return;
            }
            int i11 = 0;
            while (m6.hasRemaining()) {
                i11++;
                try {
                    ByteBuffer m9 = e.m(m6);
                    aVar.f702h.add(new e.f.a.b(m9.getInt(), e.q(m9)));
                } catch (G0.a | BufferUnderflowException unused2) {
                    aVar.h(d.e.V3_SIG_MALFORMED_DIGEST, Integer.valueOf(i11));
                    return;
                }
            }
            ArrayList arrayList2 = new ArrayList(aVar.f704j.size());
            Iterator it = aVar.f704j.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((e.f.a.c) it.next()).a()));
            }
            ArrayList arrayList3 = new ArrayList(aVar.f702h.size());
            Iterator it2 = aVar.f702h.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(((e.f.a.b) it2.next()).a()));
            }
            if (!arrayList2.equals(arrayList3)) {
                aVar.h(d.e.V3_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS, arrayList2, arrayList3);
                return;
            }
            int i12 = 0;
            boolean z3 = false;
            while (m8.hasRemaining()) {
                i12++;
                try {
                    ByteBuffer m10 = e.m(m8);
                    int i13 = m10.getInt();
                    byte[] a3 = R0.c.a(m10);
                    aVar.f706l.add(new e.f.a.C0018a(i13, a3));
                    if (i13 == 1000370060) {
                        try {
                            F0.g f4 = F0.g.f(a3);
                            aVar.f710p = f4;
                            if (aVar.f710p.g() != f4.c((X509Certificate) aVar.f675c.get(0)).g()) {
                                aVar.h(d.e.V3_SIG_POR_CERT_MISMATCH, new Object[0]);
                            }
                        } catch (IllegalArgumentException unused3) {
                            aVar.h(d.e.V3_SIG_POR_CERT_MISMATCH, new Object[0]);
                        } catch (SecurityException unused4) {
                            aVar.h(d.e.V3_SIG_POR_DID_NOT_VERIFY, new Object[0]);
                        } catch (Exception unused5) {
                            aVar.h(d.e.V3_SIG_MALFORMED_LINEAGE, new Object[0]);
                        }
                    } else if (i13 == 1436519170) {
                        if (this.f1312g >= 33 && this.f1315j) {
                            int i14 = ByteBuffer.wrap(a3).order(ByteOrder.LITTLE_ENDIAN).getInt();
                            if (this.f1314i.isPresent()) {
                                int asInt = this.f1314i.getAsInt();
                                if (i14 != asInt) {
                                    aVar.h(d.e.V31_ROTATION_MIN_SDK_MISMATCH, Integer.valueOf(i14), Integer.valueOf(asInt));
                                }
                            } else {
                                aVar.h(d.e.V31_BLOCK_MISSING, Integer.valueOf(i14));
                            }
                        }
                        z3 = true;
                    } else if (i13 != -1029262406) {
                        aVar.i(d.e.V3_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE, Integer.valueOf(i13));
                    } else if (this.f1313h != 462663009) {
                        aVar.i(d.e.V31_ROTATION_TARGETS_DEV_RELEASE_ATTR_ON_V3_SIGNER, new Object[0]);
                    }
                } catch (G0.a | BufferUnderflowException unused6) {
                    aVar.h(d.e.V3_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE, Integer.valueOf(i12));
                    return;
                }
            }
            if (this.f1315j && this.f1314i.isPresent() && !z3) {
                aVar.i(d.e.V31_ROTATION_MIN_SDK_ATTR_MISSING, Integer.valueOf(this.f1314i.getAsInt()));
            }
        } catch (e.C0017e unused7) {
            aVar.h(d.e.V3_SIG_NO_SUPPORTED_SIGNATURES, new Object[0]);
        }
    }

    public e.f e() {
        try {
            if (this.f1316k == null) {
                this.f1316k = e.k(this.f1307b, this.f1308c, this.f1313h, this.f1309d).f752a;
            }
            ByteBuffer m3 = e.m(this.f1316k);
            if (!m3.hasRemaining()) {
                this.f1309d.c(d.e.V3_SIG_NO_SIGNERS, new Object[0]);
                return this.f1309d;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                int i3 = 0;
                while (m3.hasRemaining()) {
                    int i4 = i3 + 1;
                    e.f.a aVar = new e.f.a();
                    aVar.f673a = i3;
                    this.f1309d.f699g.add(aVar);
                    try {
                        d(e.m(m3), certificateFactory, aVar);
                        i3 = i4;
                    } catch (G0.a | BufferUnderflowException unused) {
                        aVar.h(d.e.V3_SIG_MALFORMED_SIGNER, new Object[0]);
                        return this.f1309d;
                    }
                }
                return this.f1309d;
            } catch (CertificateException e3) {
                throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
            }
        } catch (G0.a unused2) {
            this.f1309d.c(d.e.V3_SIG_MALFORMED_SIGNERS, new Object[0]);
            return this.f1309d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        if (r4 < (r12.f1314i.isPresent() ? r12.f1314i.getAsInt() - 1 : r12.f1312g)) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public H0.e.f g() {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.c.g():H0.e$f");
    }

    public c(g gVar, U0.c cVar, c.C0010c c0010c, Set set, e.f fVar, int i3, int i4, int i5, OptionalInt optionalInt, boolean z3) {
        this.f1306a = gVar;
        this.f1307b = cVar;
        this.f1308c = c0010c;
        this.f1310e = set;
        this.f1309d = fVar;
        this.f1311f = i3;
        this.f1312g = i4;
        this.f1313h = i5;
        this.f1314i = optionalInt;
        this.f1315j = z3;
    }
}

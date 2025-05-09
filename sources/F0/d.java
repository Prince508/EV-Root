package F0;

import F0.d;
import G0.c;
import H0.e;
import H0.i;
import H0.k;
import J0.e;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;

/* loaded from: classes.dex */
public class d {

    /* renamed from: f, reason: collision with root package name */
    public static final Set f348f = new HashSet(Arrays.asList(e.V3_SIG_MALFORMED_LINEAGE, e.V3_INCONSISTENT_LINEAGES, e.V3_SIG_POR_DID_NOT_VERIFY, e.V3_SIG_POR_CERT_MISMATCH));

    /* renamed from: g, reason: collision with root package name */
    public static final Map f349g = j();

    /* renamed from: a, reason: collision with root package name */
    public final File f350a;

    /* renamed from: b, reason: collision with root package name */
    public final U0.c f351b;

    /* renamed from: c, reason: collision with root package name */
    public final File f352c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f353d;

    /* renamed from: e, reason: collision with root package name */
    public final int f354e;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final Map f355a;

        static {
            HashMap hashMap = new HashMap();
            f355a = hashMap;
            hashMap.put(1, e.V2_SIG_MALFORMED_SIGNERS);
            hashMap.put(2, e.V2_SIG_NO_SIGNERS);
            hashMap.put(3, e.V2_SIG_MALFORMED_SIGNER);
            hashMap.put(4, e.V2_SIG_MALFORMED_SIGNATURE);
            hashMap.put(5, e.V2_SIG_NO_SIGNATURES);
            hashMap.put(6, e.V2_SIG_MALFORMED_CERTIFICATE);
            hashMap.put(7, e.V2_SIG_NO_CERTIFICATES);
            hashMap.put(8, e.V2_SIG_MALFORMED_DIGEST);
            hashMap.put(9, e.V3_SIG_MALFORMED_SIGNERS);
            hashMap.put(10, e.V3_SIG_NO_SIGNERS);
            hashMap.put(11, e.V3_SIG_MALFORMED_SIGNER);
            hashMap.put(12, e.V3_SIG_MALFORMED_SIGNATURE);
            hashMap.put(13, e.V3_SIG_NO_SIGNATURES);
            hashMap.put(14, e.V3_SIG_MALFORMED_CERTIFICATE);
            hashMap.put(15, e.V3_SIG_NO_CERTIFICATES);
            hashMap.put(16, e.V3_SIG_MALFORMED_DIGEST);
            hashMap.put(17, e.SOURCE_STAMP_NO_SIGNATURE);
            hashMap.put(18, e.SOURCE_STAMP_MALFORMED_CERTIFICATE);
            hashMap.put(19, e.SOURCE_STAMP_UNKNOWN_SIG_ALGORITHM);
            hashMap.put(20, e.SOURCE_STAMP_MALFORMED_SIGNATURE);
            hashMap.put(21, e.SOURCE_STAMP_DID_NOT_VERIFY);
            hashMap.put(22, e.SOURCE_STAMP_VERIFY_EXCEPTION);
            hashMap.put(23, e.SOURCE_STAMP_EXPECTED_DIGEST_MISMATCH);
            hashMap.put(24, e.SOURCE_STAMP_SIGNATURE_BLOCK_WITHOUT_CERT_DIGEST);
            hashMap.put(25, e.SOURCE_STAMP_CERT_DIGEST_AND_SIG_BLOCK_MISSING);
            hashMap.put(26, e.SOURCE_STAMP_NO_SUPPORTED_SIGNATURE);
            hashMap.put(27, e.SOURCE_STAMP_CERTIFICATE_MISMATCH_BETWEEN_SIGNATURE_BLOCK_AND_APK);
            hashMap.put(28, e.MALFORMED_APK);
            hashMap.put(29, e.UNEXPECTED_EXCEPTION);
            hashMap.put(30, e.SOURCE_STAMP_SIG_MISSING);
            hashMap.put(31, e.SOURCE_STAMP_MALFORMED_ATTRIBUTE);
            hashMap.put(32, e.SOURCE_STAMP_UNKNOWN_ATTRIBUTE);
            hashMap.put(33, e.SOURCE_STAMP_MALFORMED_LINEAGE);
            hashMap.put(34, e.SOURCE_STAMP_POR_CERT_MISMATCH);
            hashMap.put(35, e.SOURCE_STAMP_POR_DID_NOT_VERIFY);
            hashMap.put(36, e.JAR_SIG_NO_SIGNATURES);
            hashMap.put(37, e.JAR_SIG_PARSE_EXCEPTION);
            hashMap.put(38, e.SOURCE_STAMP_INVALID_TIMESTAMP);
            hashMap.put(39, e.SOURCE_STAMP_SIGNATURE_SCHEME_NOT_AVAILABLE);
        }

        public static List a(List list) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                F0.b bVar = (F0.b) it.next();
                if (bVar instanceof f) {
                    arrayList.add((f) bVar);
                } else {
                    arrayList.add(new f((e) f355a.get(Integer.valueOf(bVar.a())), bVar.b()));
                }
            }
            return arrayList;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final File f356a;

        /* renamed from: b, reason: collision with root package name */
        public final U0.c f357b;

        /* renamed from: c, reason: collision with root package name */
        public File f358c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f359d;

        /* renamed from: e, reason: collision with root package name */
        public int f360e = Integer.MAX_VALUE;

        public c(File file) {
            if (file == null) {
                throw new NullPointerException("apk == null");
            }
            this.f356a = file;
            this.f357b = null;
        }

        public d a() {
            return new d(this.f356a, this.f357b, this.f358c, this.f359d, this.f360e);
        }
    }

    /* renamed from: F0.d$d, reason: collision with other inner class name */
    public static class C0006d {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f361a;

        /* renamed from: b, reason: collision with root package name */
        public final int f362b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0006d)) {
                return false;
            }
            C0006d c0006d = (C0006d) obj;
            return hashCode() == c0006d.hashCode() && Arrays.equals(this.f361a, c0006d.f361a);
        }

        public int hashCode() {
            return this.f362b;
        }

        public C0006d(byte[] bArr) {
            this.f361a = bArr;
            this.f362b = Arrays.hashCode(bArr);
        }
    }

    public enum e {
        JAR_SIG_NO_SIGNATURES("No JAR signatures"),
        JAR_SIG_MAX_SIGNATURES_EXCEEDED("APK Signature Scheme v1 only supports a maximum of %1$d signers, found %2$d"),
        JAR_SIG_NO_SIGNED_ZIP_ENTRIES("No JAR entries covered by JAR signatures"),
        JAR_SIG_DUPLICATE_ZIP_ENTRY("Duplicate entry: %1$s"),
        JAR_SIG_DUPLICATE_MANIFEST_SECTION("Duplicate section in META-INF/MANIFEST.MF: %1$s"),
        JAR_SIG_UNNNAMED_MANIFEST_SECTION("Malformed META-INF/MANIFEST.MF: invidual section #%1$d does not have a name"),
        JAR_SIG_UNNNAMED_SIG_FILE_SECTION("Malformed %1$s: invidual section #%2$d does not have a name"),
        JAR_SIG_NO_MANIFEST("Missing META-INF/MANIFEST.MF"),
        JAR_SIG_MISSING_ZIP_ENTRY_REFERENCED_IN_MANIFEST("%1$s entry referenced by META-INF/MANIFEST.MF not found in the APK"),
        JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_MANIFEST("No digest for %1$s in META-INF/MANIFEST.MF"),
        JAR_SIG_NO_ZIP_ENTRY_DIGEST_IN_SIG_FILE("No digest for %1$s in %2$s"),
        JAR_SIG_ZIP_ENTRY_NOT_SIGNED("%1$s entry not signed"),
        JAR_SIG_ZIP_ENTRY_SIGNERS_MISMATCH("Entries %1$s and %3$s are signed with different sets of signers : <%2$s> vs <%4$s>"),
        JAR_SIG_ZIP_ENTRY_DIGEST_DID_NOT_VERIFY("%2$s digest of %1$s does not match the digest specified in %3$s. Expected: <%5$s>, actual: <%4$s>"),
        JAR_SIG_MANIFEST_MAIN_SECTION_DIGEST_DID_NOT_VERIFY("%1$s digest of META-INF/MANIFEST.MF main section does not match the digest specified in %2$s. Expected: <%4$s>, actual: <%3$s>"),
        JAR_SIG_MANIFEST_SECTION_DIGEST_DID_NOT_VERIFY("%2$s digest of META-INF/MANIFEST.MF section for %1$s does not match the digest specified in %3$s. Expected: <%5$s>, actual: <%4$s>"),
        JAR_SIG_NO_MANIFEST_DIGEST_IN_SIG_FILE("%1$s does not specify digest of META-INF/MANIFEST.MF. This slows down verification."),
        JAR_SIG_NO_APK_SIG_STRIP_PROTECTION("APK is signed using APK Signature Scheme v2 but these signatures may be stripped without being detected because %1$s does not contain anti-stripping protections."),
        JAR_SIG_MISSING_FILE("Partial JAR signature. Found: %1$s, missing: %2$s"),
        JAR_SIG_VERIFY_EXCEPTION("Failed to verify JAR signature %1$s against %2$s: %3$s"),
        JAR_SIG_UNSUPPORTED_SIG_ALG("JAR signature %1$s uses digest algorithm %5$s and signature algorithm %6$s which is not supported on API Level(s) %4$s for which this APK is being verified"),
        JAR_SIG_PARSE_EXCEPTION("Failed to parse JAR signature %1$s: %2$s"),
        JAR_SIG_MALFORMED_CERTIFICATE("Malformed certificate in JAR signature %1$s: %2$s"),
        JAR_SIG_DID_NOT_VERIFY("JAR signature %1$s did not verify against %2$s"),
        JAR_SIG_NO_SIGNERS("JAR signature %1$s contains no signers"),
        JAR_SIG_DUPLICATE_SIG_FILE_SECTION("Duplicate section in %1$s: %2$s"),
        JAR_SIG_MISSING_VERSION_ATTR_IN_SIG_FILE("Malformed %1$s: missing Signature-Version attribute"),
        JAR_SIG_UNKNOWN_APK_SIG_SCHEME_ID("JAR signature %1$s references unknown APK signature scheme ID: %2$d"),
        JAR_SIG_MISSING_APK_SIG_REFERENCED("JAR signature %1$s indicates the APK is signed using %3$s but no such signature was found. Signature stripped?"),
        JAR_SIG_UNPROTECTED_ZIP_ENTRY("%1$s not protected by signature. Unauthorized modifications to this JAR entry will not be detected. Delete or move the entry outside of META-INF/."),
        JAR_SIG_MISSING("No JAR signature from this signer"),
        NO_SIG_FOR_TARGET_SANDBOX_VERSION("Missing APK Signature Scheme v2 signature required for target sandbox version %1$d"),
        MIN_SIG_SCHEME_FOR_TARGET_SDK_NOT_MET("Target SDK version %1$d requires a minimum of signature scheme v%2$d; the APK is not signed with this or a later signature scheme"),
        V2_SIG_MISSING("No APK Signature Scheme v2 signature from this signer"),
        V2_SIG_MALFORMED_SIGNERS("Malformed list of signers"),
        V2_SIG_MALFORMED_SIGNER("Malformed signer block"),
        V2_SIG_MALFORMED_PUBLIC_KEY("Malformed public key: %1$s"),
        V2_SIG_MALFORMED_CERTIFICATE("Malformed certificate #%2$d: %3$s"),
        V2_SIG_MALFORMED_SIGNATURE("Malformed APK Signature Scheme v2 signature record #%1$d"),
        V2_SIG_MALFORMED_DIGEST("Malformed APK Signature Scheme v2 digest record #%1$d"),
        V2_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE("Malformed additional attribute #%1$d"),
        V2_SIG_UNKNOWN_APK_SIG_SCHEME_ID("APK Signature Scheme v2 signer: %1$s references unknown APK signature scheme ID: %2$d"),
        V2_SIG_MISSING_APK_SIG_REFERENCED("APK Signature Scheme v2 signature %1$s indicates the APK is signed using %2$s but no such signature was found. Signature stripped?"),
        V2_SIG_MAX_SIGNATURES_EXCEEDED("APK Signature Scheme V2 only supports a maximum of %1$d signers, found %2$d"),
        V2_SIG_NO_SIGNERS("No signers in APK Signature Scheme v2 signature"),
        V2_SIG_UNKNOWN_SIG_ALGORITHM("Unknown signature algorithm: %1$#x"),
        V2_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE("Unknown additional attribute: ID %1$#x"),
        V2_SIG_VERIFY_EXCEPTION("Failed to verify %1$s signature: %2$s"),
        V2_SIG_DID_NOT_VERIFY("%1$s signature over signed-data did not verify"),
        V2_SIG_NO_SIGNATURES("No signatures"),
        V2_SIG_NO_SUPPORTED_SIGNATURES("No supported signatures: %1$s"),
        V2_SIG_NO_CERTIFICATES("No certificates"),
        V2_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD("Public key mismatch between certificate and signature record: <%1$s> vs <%2$s>"),
        V2_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS("Signature algorithms mismatch between signatures and digests records: %1$s vs %2$s"),
        V2_SIG_APK_DIGEST_DID_NOT_VERIFY("APK integrity check failed. %1$s digest mismatch. Expected: <%2$s>, actual: <%3$s>"),
        V3_SIG_MALFORMED_SIGNERS("Malformed list of signers"),
        V3_SIG_MALFORMED_SIGNER("Malformed signer block"),
        V3_SIG_MALFORMED_PUBLIC_KEY("Malformed public key: %1$s"),
        V3_SIG_MALFORMED_CERTIFICATE("Malformed certificate #%2$d: %3$s"),
        V3_SIG_MALFORMED_SIGNATURE("Malformed APK Signature Scheme v3 signature record #%1$d"),
        V3_SIG_MALFORMED_DIGEST("Malformed APK Signature Scheme v3 digest record #%1$d"),
        V3_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE("Malformed additional attribute #%1$d"),
        V3_SIG_NO_SIGNERS("No signers in APK Signature Scheme v3 signature"),
        V3_SIG_MULTIPLE_SIGNERS("Multiple APK Signature Scheme v3 signatures found for a single  platform version."),
        V3_SIG_MULTIPLE_PAST_SIGNERS("Multiple signatures found for pre-v3 signing with an APK  Signature Scheme v3 signer.  Only one allowed."),
        V3_SIG_PAST_SIGNERS_MISMATCH("v3 signer differs from v1/v2 signer without proper signing certificate lineage."),
        V3_SIG_UNKNOWN_SIG_ALGORITHM("Unknown signature algorithm: %1$#x"),
        V3_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE("Unknown additional attribute: ID %1$#x"),
        V3_SIG_VERIFY_EXCEPTION("Failed to verify %1$s signature: %2$s"),
        V3_SIG_INVALID_SDK_VERSIONS("Invalid SDK Version parameter(s) encountered in APK Signature scheme v3 signature: minSdkVersion %1$s maxSdkVersion: %2$s"),
        V3_SIG_DID_NOT_VERIFY("%1$s signature over signed-data did not verify"),
        V3_SIG_NO_SIGNATURES("No signatures"),
        V3_SIG_NO_SUPPORTED_SIGNATURES("No supported signatures"),
        V3_SIG_NO_CERTIFICATES("No certificates"),
        V3_MIN_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD("minSdkVersion mismatch between signed data and signature record: <%1$s> vs <%2$s>"),
        V3_MAX_SDK_VERSION_MISMATCH_BETWEEN_SIGNER_AND_SIGNED_DATA_RECORD("maxSdkVersion mismatch between signed data and signature record: <%1$s> vs <%2$s>"),
        V3_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD("Public key mismatch between certificate and signature record: <%1$s> vs <%2$s>"),
        V3_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS("Signature algorithms mismatch between signatures and digests records: %1$s vs %2$s"),
        V3_SIG_APK_DIGEST_DID_NOT_VERIFY("APK integrity check failed. %1$s digest mismatch. Expected: <%2$s>, actual: <%3$s>"),
        V3_SIG_POR_DID_NOT_VERIFY("SigningCertificateLineage attribute containd a proof-of-rotation record with signature(s) that did not verify."),
        V3_SIG_MALFORMED_LINEAGE("Failed to parse the SigningCertificateLineage structure in the APK Signature Scheme v3 signature's additional attributes section."),
        V3_SIG_POR_CERT_MISMATCH("APK signing certificate differs from the associated certificate found in the signer's SigningCertificateLineage."),
        V3_INCONSISTENT_SDK_VERSIONS("APK Signature Scheme v3 signers supported min/max SDK versions are not continuous."),
        V3_MISSING_SDK_VERSIONS("APK Signature Scheme v3 signers supported min/max SDK versions do not cover the entire desired range.  Found min:  %1$s max %2$s"),
        V3_INCONSISTENT_LINEAGES("SigningCertificateLineages targeting different platform versions using APK Signature Scheme v3 are not all a part of the same overall lineage."),
        V31_BLOCK_MISSING("The v3 signer indicates key rotation should be supported starting from SDK version %1$s, but a v3.1 block was not found"),
        V31_ROTATION_MIN_SDK_MISMATCH("The v3 signer indicates key rotation should be supported starting from SDK version %1$s, but the v3.1 block targets %2$s for rotation"),
        V31_ROTATION_MIN_SDK_ATTR_MISSING("APK supports key rotation starting from SDK version %1$s, but the v3 signer does not contain the attribute to detect if this signature is stripped"),
        V31_BLOCK_FOUND_WITHOUT_V3_BLOCK("The APK contains a v3.1 signing block without a v3.0 base block"),
        V31_ROTATION_TARGETS_DEV_RELEASE_ATTR_ON_V3_SIGNER("The rotation-targets-dev-release attribute is only supported on v3.1 signers; this attribute will be ignored by the platform in a v3.0 signer"),
        APK_SIG_BLOCK_UNKNOWN_ENTRY_ID("APK Signing Block contains unknown entry: ID %1$#x"),
        V4_SIG_MALFORMED_SIGNERS("V4 signature has malformed signer block"),
        V4_SIG_UNKNOWN_SIG_ALGORITHM("V4 signature has unknown signing algorithm: %1$#x"),
        V4_SIG_NO_SIGNATURES("V4 signature has no signature found"),
        V4_SIG_NO_SUPPORTED_SIGNATURES("V4 signature has no supported signature"),
        V4_SIG_DID_NOT_VERIFY("%1$s signature over signed-data did not verify"),
        V4_SIG_VERIFY_EXCEPTION("Failed to verify %1$s signature: %2$s"),
        V4_SIG_MALFORMED_PUBLIC_KEY("Malformed public key: %1$s"),
        V4_SIG_MALFORMED_CERTIFICATE("V4 signature has malformed certificate"),
        V4_SIG_NO_CERTIFICATE("V4 signature has no certificate"),
        V4_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD("V4 signature has mismatched certificate and signature: <%1$s> vs <%2$s>"),
        V4_SIG_APK_ROOT_DID_NOT_VERIFY("V4 signature's hash tree root (content digest) did not verity"),
        V4_SIG_APK_TREE_DID_NOT_VERIFY("V4 signature's hash tree did not verity"),
        V4_SIG_MULTIPLE_SIGNERS("V4 signature only supports one signer"),
        V41_SIG_NEEDS_TWO_SIGNERS("V4.1 signature requires two signers"),
        V4_SIG_V2_V3_SIGNERS_MISMATCH("V4 signature and V2/V3 signature have mismatched certificates"),
        V4_SIG_V2_V3_DIGESTS_MISMATCH("V4 signature and V%1$d signature have mismatched digests, V%1$d digest: %2$s, V4 digest: %3$s"),
        V4_SIG_UNEXPECTED_DIGESTS("V4 signature does not have the expected number of digests, found %1$d"),
        V4_SIG_VERSION_NOT_CURRENT("V4 signature format version %1$d is different from the tool's current version %2$d"),
        SOURCE_STAMP_CERT_DIGEST_AND_SIG_BLOCK_MISSING("Neither the source stamp certificate digest file nor the signature block are present in the APK"),
        SOURCE_STAMP_SIG_MISSING("No SourceStamp signature"),
        SOURCE_STAMP_MALFORMED_CERTIFICATE("Malformed certificate: %1$s"),
        SOURCE_STAMP_MALFORMED_SIGNATURE("Malformed SourceStamp signature"),
        SOURCE_STAMP_UNKNOWN_SIG_ALGORITHM("Unknown signature algorithm: %1$#x"),
        SOURCE_STAMP_VERIFY_EXCEPTION("Failed to verify %1$s signature: %2$s"),
        SOURCE_STAMP_DID_NOT_VERIFY("%1$s signature over signed-data did not verify"),
        SOURCE_STAMP_NO_SIGNATURE("No signature"),
        SOURCE_STAMP_NO_SUPPORTED_SIGNATURE("Signature(s) {%1$s} not supported: %2$s"),
        SOURCE_STAMP_CERTIFICATE_MISMATCH_BETWEEN_SIGNATURE_BLOCK_AND_APK("Certificate mismatch between SourceStamp block in APK signing block and SourceStamp file in APK: <%1$s> vs <%2$s>"),
        SOURCE_STAMP_SIGNATURE_BLOCK_WITHOUT_CERT_DIGEST("A source stamp signature block was found without a corresponding certificate digest in the APK"),
        SOURCE_STAMP_EXPECTED_DIGEST_MISMATCH("The source stamp certificate digest in the APK, %1$s, does not match the expected digest, %2$s"),
        SOURCE_STAMP_MALFORMED_ATTRIBUTE("Malformed stamp attribute #%1$d"),
        SOURCE_STAMP_UNKNOWN_ATTRIBUTE("Unknown stamp attribute: ID %1$#x"),
        SOURCE_STAMP_MALFORMED_LINEAGE("Failed to parse the SigningCertificateLineage structure in the source stamp attributes section."),
        SOURCE_STAMP_POR_CERT_MISMATCH("APK signing certificate differs from the associated certificate found in the signer's SigningCertificateLineage."),
        SOURCE_STAMP_POR_DID_NOT_VERIFY("Source stamp SigningCertificateLineage attribute contains a proof-of-rotation record with signature(s) that did not verify."),
        SOURCE_STAMP_INVALID_TIMESTAMP("The source stamp timestamp attribute has an invalid value: %1$d"),
        SOURCE_STAMP_SIGNATURE_SCHEME_NOT_AVAILABLE("No digests are available in the source stamp for signature scheme: %1$d"),
        MALFORMED_APK("Malformed APK; the following exception was caught when attempting to parse the APK: %1$s"),
        UNEXPECTED_EXCEPTION("An unexpected exception was caught when verifying the signature: %1$s");


        /* renamed from: e, reason: collision with root package name */
        public final String f494e;

        e(String str) {
            this.f494e = str;
        }

        public final String h() {
            return this.f494e;
        }
    }

    public static class f extends F0.b {

        /* renamed from: d, reason: collision with root package name */
        public final e f495d;

        /* renamed from: e, reason: collision with root package name */
        public final Object[] f496e;

        public f(e eVar, Object[] objArr) {
            super(eVar.f494e, objArr);
            this.f495d = eVar;
            this.f496e = objArr;
        }

        @Override // F0.b
        public Object[] b() {
            return (Object[]) this.f496e.clone();
        }

        @Override // F0.b
        public String toString() {
            return String.format(this.f495d.h(), this.f496e);
        }
    }

    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final List f497a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final List f498b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final List f499c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        public final List f500d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public final List f501e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public final List f502f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        public final List f503g = new ArrayList();

        /* renamed from: h, reason: collision with root package name */
        public final List f504h = new ArrayList();

        /* renamed from: i, reason: collision with root package name */
        public final List f505i = new ArrayList();

        /* renamed from: j, reason: collision with root package name */
        public a f506j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f507k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f508l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f509m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f510n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f511o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f512p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f513q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f514r;

        /* renamed from: s, reason: collision with root package name */
        public F0.g f515s;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final List f516a;

            /* renamed from: b, reason: collision with root package name */
            public final List f517b;

            /* renamed from: c, reason: collision with root package name */
            public final List f518c;

            /* renamed from: d, reason: collision with root package name */
            public final List f519d;

            /* renamed from: e, reason: collision with root package name */
            public final List f520e;

            /* renamed from: f, reason: collision with root package name */
            public final EnumC0007a f521f;

            /* renamed from: g, reason: collision with root package name */
            public final long f522g;

            /* renamed from: F0.d$g$a$a, reason: collision with other inner class name */
            public enum EnumC0007a {
                STAMP_VERIFIED,
                STAMP_VERIFICATION_FAILED,
                CERT_DIGEST_MISMATCH,
                STAMP_MISSING,
                STAMP_NOT_VERIFIED,
                VERIFICATION_ERROR
            }

            public boolean a() {
                return !this.f518c.isEmpty();
            }

            public List b() {
                return this.f518c;
            }

            public List c() {
                return this.f519d;
            }

            public a(H0.c cVar) {
                this.f516a = cVar.f675c;
                this.f517b = cVar.f676d;
                List a3 = b.a(cVar.e());
                this.f518c = a3;
                List a4 = b.a(cVar.g());
                this.f519d = a4;
                this.f520e = b.a(cVar.f());
                if (a3.isEmpty() && a4.isEmpty()) {
                    this.f521f = EnumC0007a.STAMP_VERIFIED;
                } else {
                    this.f521f = EnumC0007a.STAMP_VERIFICATION_FAILED;
                }
                this.f522g = cVar.f674b;
            }
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public final String f530a;

            /* renamed from: b, reason: collision with root package name */
            public final List f531b;

            /* renamed from: c, reason: collision with root package name */
            public final String f532c;

            /* renamed from: d, reason: collision with root package name */
            public final String f533d;

            /* renamed from: e, reason: collision with root package name */
            public final List f534e;

            /* renamed from: f, reason: collision with root package name */
            public final List f535f;

            public final void d(e eVar, Object... objArr) {
                this.f534e.add(new f(eVar, objArr));
            }

            public boolean e() {
                return !this.f534e.isEmpty();
            }

            public X509Certificate f() {
                if (this.f531b.isEmpty()) {
                    return null;
                }
                return (X509Certificate) this.f531b.get(0);
            }

            public String g() {
                return this.f530a;
            }

            public List h() {
                return this.f535f;
            }

            public b(e.c.a aVar) {
                this.f530a = aVar.f847a;
                this.f531b = aVar.f850d;
                this.f532c = aVar.f849c;
                this.f533d = aVar.f848b;
                this.f534e = aVar.g();
                this.f535f = aVar.h();
            }
        }

        public static class c {

            /* renamed from: a, reason: collision with root package name */
            public final int f536a;

            /* renamed from: b, reason: collision with root package name */
            public final List f537b;

            /* renamed from: c, reason: collision with root package name */
            public final List f538c;

            /* renamed from: d, reason: collision with root package name */
            public final List f539d;

            /* renamed from: e, reason: collision with root package name */
            public final List f540e;

            public final void d(e eVar, Object... objArr) {
                this.f538c.add(new f(eVar, objArr));
            }

            public boolean e() {
                return !this.f538c.isEmpty();
            }

            public X509Certificate f() {
                if (this.f537b.isEmpty()) {
                    return null;
                }
                return (X509Certificate) this.f537b.get(0);
            }

            public List g() {
                return this.f540e;
            }

            public int h() {
                return this.f536a;
            }

            public List i() {
                return this.f539d;
            }

            public c(e.f.a aVar) {
                this.f536a = aVar.f673a;
                this.f537b = aVar.f675c;
                this.f538c = aVar.e();
                this.f539d = aVar.g();
                this.f540e = aVar.f702h;
            }
        }

        /* renamed from: F0.d$g$d, reason: collision with other inner class name */
        public static class C0008d {

            /* renamed from: a, reason: collision with root package name */
            public final int f541a;

            /* renamed from: b, reason: collision with root package name */
            public final List f542b;

            /* renamed from: c, reason: collision with root package name */
            public final List f543c;

            /* renamed from: d, reason: collision with root package name */
            public final List f544d;

            /* renamed from: e, reason: collision with root package name */
            public final List f545e;

            /* renamed from: f, reason: collision with root package name */
            public final int f546f;

            /* renamed from: g, reason: collision with root package name */
            public final int f547g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f548h;

            /* renamed from: i, reason: collision with root package name */
            public final F0.g f549i;

            public static /* synthetic */ boolean b(int i3) {
                return i3 == -1029262406;
            }

            public boolean e() {
                return !this.f543c.isEmpty();
            }

            public X509Certificate f() {
                if (this.f542b.isEmpty()) {
                    return null;
                }
                return (X509Certificate) this.f542b.get(0);
            }

            public List g() {
                return this.f545e;
            }

            public List h() {
                return this.f544d;
            }

            public C0008d(e.f.a aVar) {
                this.f541a = aVar.f673a;
                this.f542b = aVar.f675c;
                this.f543c = aVar.e();
                this.f544d = aVar.g();
                this.f545e = aVar.f702h;
                this.f546f = aVar.f708n;
                this.f547g = aVar.f709o;
                this.f549i = aVar.f710p;
                this.f548h = aVar.f706l.stream().mapToInt(new ToIntFunction() { // from class: F0.e
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj) {
                        int a3;
                        a3 = ((e.f.a.C0018a) obj).a();
                        return a3;
                    }
                }).anyMatch(new IntPredicate() { // from class: F0.f
                    @Override // java.util.function.IntPredicate
                    public final boolean test(int i3) {
                        return d.g.C0008d.b(i3);
                    }
                });
            }
        }

        public static class e {

            /* renamed from: a, reason: collision with root package name */
            public final int f550a;

            /* renamed from: b, reason: collision with root package name */
            public final List f551b;

            /* renamed from: c, reason: collision with root package name */
            public final List f552c;

            /* renamed from: d, reason: collision with root package name */
            public final List f553d;

            /* renamed from: e, reason: collision with root package name */
            public final List f554e;

            public List b() {
                return this.f554e;
            }

            public e(e.f.a aVar) {
                this.f550a = aVar.f673a;
                this.f551b = aVar.f675c;
                this.f552c = aVar.e();
                this.f553d = aVar.g();
                this.f554e = aVar.f702h;
            }
        }

        public final void A() {
            this.f507k = true;
        }

        public void f(e eVar, Object... objArr) {
            this.f497a.add(new f(eVar, objArr));
        }

        public final void g(X509Certificate x509Certificate) {
            this.f499c.add(x509Certificate);
        }

        public void h(e eVar, Object... objArr) {
            this.f498b.add(new f(eVar, objArr));
        }

        public boolean i() {
            if (!this.f497a.isEmpty()) {
                return true;
            }
            if (this.f514r && !this.f498b.isEmpty()) {
                return true;
            }
            if (!this.f500d.isEmpty()) {
                for (b bVar : this.f500d) {
                    if (bVar.e()) {
                        return true;
                    }
                    if (this.f514r && !bVar.h().isEmpty()) {
                        return true;
                    }
                }
            }
            if (!this.f502f.isEmpty()) {
                for (c cVar : this.f502f) {
                    if (cVar.e()) {
                        return true;
                    }
                    if (this.f514r && !cVar.i().isEmpty()) {
                        return true;
                    }
                }
            }
            if (!this.f503g.isEmpty()) {
                for (C0008d c0008d : this.f503g) {
                    if (c0008d.e()) {
                        return true;
                    }
                    if (this.f514r && !c0008d.h().isEmpty()) {
                        return true;
                    }
                }
            }
            if (!this.f504h.isEmpty()) {
                for (C0008d c0008d2 : this.f504h) {
                    if (c0008d2.e()) {
                        return true;
                    }
                    if (this.f514r && !c0008d2.h().isEmpty()) {
                        return true;
                    }
                }
            }
            a aVar = this.f506j;
            if (aVar == null) {
                return false;
            }
            if (aVar.a()) {
                return true;
            }
            return this.f514r && !this.f506j.c().isEmpty();
        }

        public List j() {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f497a);
            if (this.f514r) {
                arrayList.addAll(this.f498b);
            }
            if (!this.f500d.isEmpty()) {
                for (b bVar : this.f500d) {
                    arrayList.addAll(bVar.f534e);
                    if (this.f514r) {
                        arrayList.addAll(bVar.h());
                    }
                }
            }
            if (!this.f502f.isEmpty()) {
                for (c cVar : this.f502f) {
                    arrayList.addAll(cVar.f538c);
                    if (this.f514r) {
                        arrayList.addAll(cVar.i());
                    }
                }
            }
            if (!this.f503g.isEmpty()) {
                for (C0008d c0008d : this.f503g) {
                    arrayList.addAll(c0008d.f543c);
                    if (this.f514r) {
                        arrayList.addAll(c0008d.h());
                    }
                }
            }
            if (!this.f504h.isEmpty()) {
                for (C0008d c0008d2 : this.f504h) {
                    arrayList.addAll(c0008d2.f543c);
                    if (this.f514r) {
                        arrayList.addAll(c0008d2.h());
                    }
                }
            }
            a aVar = this.f506j;
            if (aVar != null) {
                arrayList.addAll(aVar.b());
                if (this.f514r) {
                    arrayList.addAll(this.f506j.c());
                }
            }
            return arrayList;
        }

        public List k() {
            return this.f499c;
        }

        public F0.g l() {
            return this.f515s;
        }

        public List m() {
            return this.f500d;
        }

        public List n() {
            return this.f502f;
        }

        public List o() {
            return this.f504h;
        }

        public List p() {
            return this.f503g;
        }

        public List q() {
            return this.f505i;
        }

        public boolean r() {
            return this.f507k;
        }

        public boolean s() {
            return this.f508l;
        }

        public boolean t() {
            return this.f509m;
        }

        public boolean u() {
            return this.f511o;
        }

        public boolean v() {
            return this.f510n;
        }

        public boolean w() {
            return this.f512p;
        }

        public final void x(H0.b bVar) {
            if (bVar.f668a != 0) {
                throw new IllegalArgumentException("Unknown ApkSigResult Signing Block Scheme Id " + bVar.f668a);
            }
            this.f513q = bVar.f669b;
            if (bVar.f670c.isEmpty()) {
                return;
            }
            this.f506j = new a((H0.c) bVar.f670c.get(0));
        }

        public final void y(e.f fVar) {
            if (fVar == null) {
                return;
            }
            if (fVar.a()) {
                this.f497a.addAll(fVar.e());
            }
            if (fVar.b()) {
                this.f498b.addAll(fVar.f());
            }
            int i3 = fVar.f668a;
            if (i3 == 0) {
                this.f513q = fVar.f669b;
                if (fVar.f699g.isEmpty()) {
                    return;
                }
                this.f506j = new a((H0.c) fVar.f699g.get(0));
                return;
            }
            if (i3 == 31) {
                this.f511o = fVar.f669b;
                Iterator it = fVar.f699g.iterator();
                while (it.hasNext()) {
                    this.f504h.add(new C0008d((e.f.a) it.next()));
                }
                this.f515s = fVar.f698f;
                return;
            }
            if (i3 == 2) {
                this.f509m = fVar.f669b;
                Iterator it2 = fVar.f699g.iterator();
                while (it2.hasNext()) {
                    this.f502f.add(new c((e.f.a) it2.next()));
                }
                return;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalArgumentException("Unknown Signing Block Scheme Id");
                }
                this.f512p = fVar.f669b;
                Iterator it3 = fVar.f699g.iterator();
                while (it3.hasNext()) {
                    this.f505i.add(new e((e.f.a) it3.next()));
                }
                return;
            }
            this.f510n = fVar.f669b;
            Iterator it4 = fVar.f699g.iterator();
            while (it4.hasNext()) {
                this.f503g.add(new C0008d((e.f.a) it4.next()));
            }
            if (this.f515s == null) {
                this.f515s = fVar.f698f;
            }
        }

        public final void z(e.c cVar) {
            this.f508l = cVar.f842a;
            this.f497a.addAll(cVar.g());
            this.f498b.addAll(cVar.h());
            Iterator it = cVar.f843b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                this.f500d.add(new b((e.c.a) it.next()));
            }
            Iterator it2 = cVar.f844c.iterator();
            while (it2.hasNext()) {
                this.f501e.add(new b((e.c.a) it2.next()));
            }
        }
    }

    public static void b(List list, List list2, g gVar) {
        try {
            if (Arrays.equals(((X509Certificate) list2.get(0)).getEncoded(), ((X509Certificate) list.get(0)).getEncoded())) {
                return;
            }
            gVar.f(e.V4_SIG_V2_V3_SIGNERS_MISMATCH, new Object[0]);
        } catch (CertificateEncodingException e3) {
            throw new RuntimeException("Failed to encode APK signer cert", e3);
        }
    }

    public static void c(List list, List list2, byte[] bArr, g gVar) {
        if (list.size() != 1) {
            gVar.f(e.V4_SIG_MULTIPLE_SIGNERS, new Object[0]);
        }
        b(list2, ((g.C0008d) list.get(0)).f542b, gVar);
        byte[] k3 = k(((g.C0008d) list.get(0)).g());
        if (Arrays.equals(bArr, k3)) {
            return;
        }
        gVar.f(e.V4_SIG_V2_V3_DIGESTS_MISMATCH, 3, H0.e.s(k3), H0.e.s(bArr));
    }

    public static void d(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e.f.a.b bVar = (e.f.a.b) it.next();
            k f3 = k.f(bVar.a());
            if (f3 != null) {
                map.put(f3.g(), bVar.b());
            }
        }
    }

    public static ByteBuffer e(U0.c cVar, c.C0010c c0010c) {
        try {
            return F0.a.b(J0.e.p(cVar, c0010c), cVar.b(0L, c0010c.a()));
        } catch (V0.a e3) {
            throw new G0.a("Failed to read AndroidManifest.xml", e3);
        }
    }

    public static Map f(List list, U0.c cVar, c.C0010c c0010c) {
        T0.a aVar;
        EnumMap enumMap = new EnumMap(i.class);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = (T0.a) it.next();
            if ("META-INF/MANIFEST.MF".equals(aVar.f())) {
                break;
            }
        }
        if (aVar == null) {
            return enumMap;
        }
        try {
            enumMap.put((EnumMap) i.SHA256, (i) G0.c.a(T0.b.b(cVar, aVar, c0010c.a())));
            return enumMap;
        } catch (V0.a e3) {
            throw new G0.a("Failed to read APK", e3);
        }
    }

    public static Map g(e.f fVar) {
        HashMap hashMap = new HashMap();
        Iterator it = fVar.f699g.iterator();
        while (it.hasNext()) {
            d(((e.f.a) it.next()).f702h, hashMap);
        }
        return hashMap;
    }

    public static int h(int i3) {
        return i3 >= 30 ? 2 : 1;
    }

    public static Map i(int i3) {
        if (i3 >= 28) {
            return f349g;
        }
        if (i3 < 24) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(2, (String) f349g.get(2));
        return hashMap;
    }

    public static Map j() {
        HashMap hashMap = new HashMap(2);
        hashMap.put(2, "APK Signature Scheme v2");
        hashMap.put(3, "APK Signature Scheme v3");
        return hashMap;
    }

    public static byte[] k(List list) {
        HashMap hashMap = new HashMap();
        d(list, hashMap);
        return H0.e.p(hashMap);
    }

    public g l() {
        RandomAccessFile randomAccessFile = null;
        try {
            U0.c cVar = this.f351b;
            if (cVar == null) {
                if (this.f350a == null) {
                    throw new IllegalStateException("APK not provided");
                }
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f350a, "r");
                try {
                    cVar = U0.d.a(randomAccessFile2, 0L, randomAccessFile2.length());
                    randomAccessFile = randomAccessFile2;
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    throw th;
                }
            }
            g m3 = m(cVar);
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            return m3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x03df, code lost:
    
        if (r5.isEmpty() != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0449, code lost:
    
        if (r5.isEmpty() != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
    
        if (r9.i() != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0127, code lost:
    
        if (r9.i() != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x00e0, code lost:
    
        if (r9.i() != false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0142, code lost:
    
        if (r9.i() != false) goto L251;
     */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final F0.d.g m(U0.c r21) {
        /*
            Method dump skipped, instructions count: 1470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.d.m(U0.c):F0.d$g");
    }

    public final int n(U0.c cVar, c.C0010c c0010c) {
        Integer num = this.f353d;
        if (num == null) {
            int e3 = G0.c.e(e(cVar, c0010c).slice());
            if (e3 <= this.f354e) {
                return e3;
            }
            throw new IllegalArgumentException("minSdkVersion from APK (" + e3 + ") > maxSdkVersion (" + this.f354e + ")");
        }
        if (num.intValue() < 0) {
            throw new IllegalArgumentException("minSdkVersion must not be negative: " + this.f353d);
        }
        Integer num2 = this.f353d;
        if (num2 == null || num2.intValue() <= this.f354e) {
            return this.f353d.intValue();
        }
        throw new IllegalArgumentException("minSdkVersion (" + this.f353d + ") > maxSdkVersion (" + this.f354e + ")");
    }

    public d(File file, U0.c cVar, File file2, Integer num, int i3) {
        this.f350a = file;
        this.f351b = cVar;
        this.f352c = file2;
        this.f353d = num;
        this.f354e = i3;
    }
}

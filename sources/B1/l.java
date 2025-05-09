package B1;

import O1.A;
import O1.I;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final A f81a;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f82a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f83b;

        static {
            int[] iArr = new int[b.values().length];
            f83b = iArr;
            try {
                iArr[b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83b[b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83b[b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83b[b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[I.values().length];
            f82a = iArr2;
            try {
                iArr2[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82a[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82a[I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f82a[I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    public l(A a3) {
        this.f81a = a3;
    }

    public static l a(String str, byte[] bArr, b bVar) {
        return new l((A) A.c0().t(str).u(AbstractC0417h.m(bArr)).s(c(bVar)).j());
    }

    public static I c(b bVar) {
        int i3 = a.f83b[bVar.ordinal()];
        if (i3 == 1) {
            return I.TINK;
        }
        if (i3 == 2) {
            return I.LEGACY;
        }
        if (i3 == 3) {
            return I.RAW;
        }
        if (i3 == 4) {
            return I.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    public A b() {
        return this.f81a;
    }
}

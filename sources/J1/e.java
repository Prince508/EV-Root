package J1;

import O1.I;
import O1.y;

/* loaded from: classes.dex */
public final class e extends B1.g {

    /* renamed from: a, reason: collision with root package name */
    public final o f872a;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f873a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f874b;

        static {
            int[] iArr = new int[y.c.values().length];
            f874b = iArr;
            try {
                iArr[y.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f874b[y.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[I.values().length];
            f873a = iArr2;
            try {
                iArr2[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f873a[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f873a[I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f873a[I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public e(o oVar, B1.y yVar) {
        a(oVar, yVar);
        this.f872a = oVar;
    }

    public static void a(o oVar, B1.y yVar) {
        int i3 = a.f874b[oVar.d().ordinal()];
        if (i3 == 1 || i3 == 2) {
            B1.y.b(yVar);
        }
    }
}

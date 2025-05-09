package K2;

/* loaded from: classes.dex */
public enum K {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1164a;

        static {
            int[] iArr = new int[K.values().length];
            try {
                iArr[K.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[K.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[K.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[K.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1164a = iArr;
        }
    }

    public final void f(B2.p pVar, Object obj, s2.e eVar) {
        int i3 = a.f1164a[ordinal()];
        if (i3 == 1) {
            Q2.a.d(pVar, obj, eVar, null, 4, null);
            return;
        }
        if (i3 == 2) {
            s2.g.a(pVar, obj, eVar);
        } else if (i3 == 3) {
            Q2.b.a(pVar, obj, eVar);
        } else if (i3 != 4) {
            throw new q2.f();
        }
    }

    public final boolean g() {
        return this == LAZY;
    }
}

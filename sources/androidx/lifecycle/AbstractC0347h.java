package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0347h {

    /* renamed from: a, reason: collision with root package name */
    public AtomicReference f3979a = new AtomicReference();

    /* renamed from: androidx.lifecycle.h$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0091a Companion = new C0091a(null);

        /* renamed from: androidx.lifecycle.h$a$a, reason: collision with other inner class name */
        public static final class C0091a {

            /* renamed from: androidx.lifecycle.h$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0092a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f3980a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f3980a = iArr;
                }
            }

            public /* synthetic */ C0091a(C2.g gVar) {
                this();
            }

            public final a a(b bVar) {
                C2.k.e(bVar, "state");
                int i3 = C0092a.f3980a[bVar.ordinal()];
                if (i3 == 1) {
                    return a.ON_DESTROY;
                }
                if (i3 == 2) {
                    return a.ON_STOP;
                }
                if (i3 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b bVar) {
                C2.k.e(bVar, "state");
                int i3 = C0092a.f3980a[bVar.ordinal()];
                if (i3 == 1) {
                    return a.ON_START;
                }
                if (i3 == 2) {
                    return a.ON_RESUME;
                }
                if (i3 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public C0091a() {
            }
        }

        /* renamed from: androidx.lifecycle.h$a$b */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f3981a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f3981a = iArr;
            }
        }

        public final b f() {
            switch (b.f3981a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.h$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean f(b bVar) {
            C2.k.e(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    public abstract void a(k kVar);

    public abstract b b();

    public abstract void c(k kVar);
}

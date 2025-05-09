package P2;

/* loaded from: classes.dex */
public abstract class D {
    public static final C b(Object obj) {
        if (obj == AbstractC0277d.f1759a) {
            throw new IllegalStateException("Does not contain segment");
        }
        C2.k.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (C) obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC0277d.f1759a;
    }

    public static Object a(Object obj) {
        return obj;
    }
}

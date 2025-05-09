package r2;

import java.util.Collection;

/* renamed from: r2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0701n extends AbstractC0700m {
    public static int k(Iterable iterable, int i3) {
        C2.k.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i3;
    }
}

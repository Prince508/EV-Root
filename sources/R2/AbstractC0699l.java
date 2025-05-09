package r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: r2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0699l {
    public static final Object[] a(Object[] objArr, boolean z3) {
        C2.k.e(objArr, "<this>");
        if (z3 && C2.k.a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        C2.k.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static List b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        C2.k.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static final Object[] c(int i3, Object[] objArr) {
        C2.k.e(objArr, "array");
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }
}

package r2;

import java.util.Arrays;
import java.util.List;

/* renamed from: r2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0696i extends AbstractC0695h {
    public static final List b(Object[] objArr) {
        C2.k.e(objArr, "<this>");
        List a3 = AbstractC0698k.a(objArr);
        C2.k.d(a3, "asList(...)");
        return a3;
    }

    public static final Object[] c(Object[] objArr, Object[] objArr2, int i3, int i4, int i5) {
        C2.k.e(objArr, "<this>");
        C2.k.e(objArr2, "destination");
        System.arraycopy(objArr, i4, objArr2, i3, i5 - i4);
        return objArr2;
    }

    public static /* synthetic */ Object[] d(Object[] objArr, Object[] objArr2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i3 = 0;
        }
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = objArr.length;
        }
        return c(objArr, objArr2, i3, i4, i5);
    }

    public static final void e(Object[] objArr, Object obj, int i3, int i4) {
        C2.k.e(objArr, "<this>");
        Arrays.fill(objArr, i3, i4, obj);
    }
}

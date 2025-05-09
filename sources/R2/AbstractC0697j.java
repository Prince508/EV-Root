package r2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: r2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0697j extends AbstractC0696i {
    public static final boolean f(Object[] objArr, Object obj) {
        C2.k.e(objArr, "<this>");
        return j(objArr, obj) >= 0;
    }

    public static List g(Object[] objArr, int i3) {
        C2.k.e(objArr, "<this>");
        if (i3 >= 0) {
            return m(objArr, G2.e.a(objArr.length - i3, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i3 + " is less than zero.").toString());
    }

    public static final int h(Object[] objArr) {
        C2.k.e(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object i(Object[] objArr, int i3) {
        C2.k.e(objArr, "<this>");
        if (i3 < 0 || i3 >= objArr.length) {
            return null;
        }
        return objArr[i3];
    }

    public static final int j(Object[] objArr, Object obj) {
        C2.k.e(objArr, "<this>");
        int i3 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i3 < length) {
                if (objArr[i3] == null) {
                    return i3;
                }
                i3++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i3 < length2) {
            if (C2.k.a(obj, objArr[i3])) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static char k(char[] cArr) {
        C2.k.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object l(Object[] objArr) {
        C2.k.e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final List m(Object[] objArr, int i3) {
        C2.k.e(objArr, "<this>");
        if (i3 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i3 + " is less than zero.").toString());
        }
        if (i3 == 0) {
            return AbstractC0700m.f();
        }
        int length = objArr.length;
        if (i3 >= length) {
            return o(objArr);
        }
        if (i3 == 1) {
            return AbstractC0699l.b(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = length - i3; i4 < length; i4++) {
            arrayList.add(objArr[i4]);
        }
        return arrayList;
    }

    public static final Collection n(Object[] objArr, Collection collection) {
        C2.k.e(objArr, "<this>");
        C2.k.e(collection, "destination");
        for (Object obj : objArr) {
            collection.add(obj);
        }
        return collection;
    }

    public static final List o(Object[] objArr) {
        C2.k.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? p(objArr) : AbstractC0699l.b(objArr[0]) : AbstractC0700m.f();
    }

    public static final List p(Object[] objArr) {
        C2.k.e(objArr, "<this>");
        return new ArrayList(AbstractC0700m.e(objArr));
    }

    public static final Set q(Object[] objArr) {
        C2.k.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) n(objArr, new LinkedHashSet(AbstractC0684B.a(objArr.length))) : AbstractC0686D.a(objArr[0]) : AbstractC0687E.b();
    }
}

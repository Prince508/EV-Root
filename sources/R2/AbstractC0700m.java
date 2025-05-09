package r2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: r2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0700m extends AbstractC0699l {
    public static ArrayList d(Object... objArr) {
        C2.k.e(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C0692e(objArr, true));
    }

    public static final Collection e(Object[] objArr) {
        C2.k.e(objArr, "<this>");
        return new C0692e(objArr, false);
    }

    public static List f() {
        return w.f9010e;
    }

    public static int g(List list) {
        C2.k.e(list, "<this>");
        return list.size() - 1;
    }

    public static List h(Object... objArr) {
        C2.k.e(objArr, "elements");
        return objArr.length > 0 ? AbstractC0696i.b(objArr) : f();
    }

    public static final List i(List list) {
        C2.k.e(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : AbstractC0699l.b(list.get(0)) : f();
    }

    public static void j() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}

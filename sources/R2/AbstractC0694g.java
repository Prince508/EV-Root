package r2;

import java.lang.reflect.Array;

/* renamed from: r2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0694g {
    public static final Object[] a(Object[] objArr, int i3) {
        C2.k.e(objArr, "reference");
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i3);
        C2.k.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }
}

package androidx.lifecycle;

import j.AbstractC0515e;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r2.AbstractC0699l;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f4002a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f4003b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final Map f4004c = new HashMap();

    public static final String c(String str) {
        C2.k.e(str, "className");
        return J2.n.n(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    public static final InterfaceC0349j f(Object obj) {
        C2.k.e(obj, "object");
        boolean z3 = obj instanceof InterfaceC0349j;
        boolean z4 = obj instanceof InterfaceC0342c;
        if (z3 && z4) {
            return new C0343d((InterfaceC0342c) obj, (InterfaceC0349j) obj);
        }
        if (z4) {
            return new C0343d((InterfaceC0342c) obj, null);
        }
        if (z3) {
            return (InterfaceC0349j) obj;
        }
        Class<?> cls = obj.getClass();
        n nVar = f4002a;
        if (nVar.d(cls) != 2) {
            return new v(obj);
        }
        Object obj2 = f4004c.get(cls);
        C2.k.b(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            nVar.a((Constructor) list.get(0), obj);
            return new C(null);
        }
        int size = list.size();
        InterfaceC0345f[] interfaceC0345fArr = new InterfaceC0345f[size];
        for (int i3 = 0; i3 < size; i3++) {
            f4002a.a((Constructor) list.get(i3), obj);
            interfaceC0345fArr[i3] = null;
        }
        return new C0341b(interfaceC0345fArr);
    }

    public final InterfaceC0345f a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            C2.k.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            AbstractC0515e.a(newInstance);
            return null;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    public final Constructor b(Class cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            C2.k.d(name, "fullPackage");
            if (name.length() != 0) {
                C2.k.d(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                C2.k.d(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            C2.k.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c3 = c(canonicalName);
            if (name.length() != 0) {
                c3 = name + '.' + c3;
            }
            Class<?> cls2 = Class.forName(c3);
            C2.k.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final int d(Class cls) {
        Map map = f4003b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g3 = g(cls);
        map.put(cls, Integer.valueOf(g3));
        return g3;
    }

    public final boolean e(Class cls) {
        return cls != null && k.class.isAssignableFrom(cls);
    }

    public final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b3 = b(cls);
        if (b3 != null) {
            f4004c.put(cls, AbstractC0699l.b(b3));
            return 2;
        }
        if (C0340a.f3968c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            C2.k.d(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f4004c.get(superclass);
            C2.k.b(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        C2.k.d(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (e(cls2)) {
                C2.k.d(cls2, "intrface");
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f4004c.get(cls2);
                C2.k.b(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f4004c.put(cls, arrayList);
        return 2;
    }
}

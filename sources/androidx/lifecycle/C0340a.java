package androidx.lifecycle;

import androidx.lifecycle.AbstractC0347h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340a {

    /* renamed from: c, reason: collision with root package name */
    public static C0340a f3968c = new C0340a();

    /* renamed from: a, reason: collision with root package name */
    public final Map f3969a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f3970b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    public static class C0090a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f3971a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map f3972b;

        public C0090a(Map map) {
            this.f3972b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC0347h.a aVar = (AbstractC0347h.a) entry.getValue();
                List list = (List) this.f3971a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f3971a.put(aVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        public static void b(List list, l lVar, AbstractC0347h.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(lVar, aVar, obj);
                }
            }
        }

        public void a(l lVar, AbstractC0347h.a aVar, Object obj) {
            b((List) this.f3971a.get(aVar), lVar, aVar, obj);
            b((List) this.f3971a.get(AbstractC0347h.a.ON_ANY), lVar, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f3973a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f3974b;

        public b(int i3, Method method) {
            this.f3973a = i3;
            this.f3974b = method;
            method.setAccessible(true);
        }

        public void a(l lVar, AbstractC0347h.a aVar, Object obj) {
            try {
                int i3 = this.f3973a;
                if (i3 == 0) {
                    this.f3974b.invoke(obj, new Object[0]);
                } else if (i3 == 1) {
                    this.f3974b.invoke(obj, lVar);
                } else {
                    if (i3 != 2) {
                        return;
                    }
                    this.f3974b.invoke(obj, lVar, aVar);
                }
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to call observer method", e4.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3973a == bVar.f3973a && this.f3974b.getName().equals(bVar.f3974b.getName());
        }

        public int hashCode() {
            return (this.f3973a * 31) + this.f3974b.getName().hashCode();
        }
    }

    public final C0090a a(Class cls, Method[] methodArr) {
        int i3;
        C0090a c3;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c3 = c(superclass)) != null) {
            hashMap.putAll(c3.f3972b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f3972b.entrySet()) {
                e(hashMap, (b) entry.getKey(), (AbstractC0347h.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            s sVar = (s) method.getAnnotation(s.class);
            if (sVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else {
                    if (!l.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i3 = 1;
                }
                AbstractC0347h.a value = sVar.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC0347h.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC0347h.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(i3, method), value, cls);
                z3 = true;
            }
        }
        C0090a c0090a = new C0090a(hashMap);
        this.f3969a.put(cls, c0090a);
        this.f3970b.put(cls, Boolean.valueOf(z3));
        return c0090a;
    }

    public final Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e3) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
        }
    }

    public C0090a c(Class cls) {
        C0090a c0090a = (C0090a) this.f3969a.get(cls);
        return c0090a != null ? c0090a : a(cls, null);
    }

    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f3970b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b3 = b(cls);
        for (Method method : b3) {
            if (((s) method.getAnnotation(s.class)) != null) {
                a(cls, b3);
                return true;
            }
        }
        this.f3970b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map map, b bVar, AbstractC0347h.a aVar, Class cls) {
        AbstractC0347h.a aVar2 = (AbstractC0347h.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f3974b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}

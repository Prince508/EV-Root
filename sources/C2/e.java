package C2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import r2.AbstractC0684B;
import r2.AbstractC0685C;
import r2.AbstractC0700m;
import r2.AbstractC0701n;

/* loaded from: classes.dex */
public final class e implements H2.b, d {

    /* renamed from: b, reason: collision with root package name */
    public static final a f306b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final Map f307c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f308d;

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f309e;

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f310f;

    /* renamed from: g, reason: collision with root package name */
    public static final Map f311g;

    /* renamed from: a, reason: collision with root package name */
    public final Class f312a;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final String a(Class cls) {
            String str;
            k.e(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) e.f310f.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) e.f310f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class cls) {
            String str;
            k.e(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass()) {
                return null;
            }
            if (!cls.isLocalClass()) {
                if (!cls.isArray()) {
                    String str3 = (String) e.f311g.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) e.f311g.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                k.b(simpleName);
                String I3 = J2.o.I(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (I3 != null) {
                    return I3;
                }
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                k.b(simpleName);
                return J2.o.H(simpleName, '$', null, 2, null);
            }
            k.b(simpleName);
            return J2.o.I(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public final boolean c(Object obj, Class cls) {
            k.e(cls, "jClass");
            Map map = e.f307c;
            k.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return w.c(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = A2.a.b(A2.a.c(cls));
            }
            return cls.isInstance(obj);
        }

        public a() {
        }
    }

    static {
        List h3 = AbstractC0700m.h(B2.a.class, B2.l.class, B2.p.class, B2.q.class, B2.r.class, B2.s.class, B2.t.class, B2.u.class, B2.v.class, B2.w.class, B2.b.class, B2.c.class, B2.d.class, B2.e.class, B2.f.class, B2.g.class, B2.h.class, B2.i.class, B2.j.class, B2.k.class, B2.m.class, B2.n.class, B2.o.class);
        ArrayList arrayList = new ArrayList(AbstractC0701n.k(h3, 10));
        int i3 = 0;
        for (Object obj : h3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0700m.j();
            }
            arrayList.add(q2.k.a((Class) obj, Integer.valueOf(i3)));
            i3 = i4;
        }
        f307c = AbstractC0685C.g(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f308d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f309e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        k.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            k.b(str);
            sb.append(J2.o.K(str, '.', null, 2, null));
            sb.append("CompanionObject");
            q2.g a3 = q2.k.a(sb.toString(), str + ".Companion");
            hashMap3.put(a3.c(), a3.d());
        }
        for (Map.Entry entry : f307c.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f310f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0684B.a(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            k.b(str2);
            linkedHashMap.put(key, J2.o.K(str2, '.', null, 2, null));
        }
        f311g = linkedHashMap;
    }

    public e(Class cls) {
        k.e(cls, "jClass");
        this.f312a = cls;
    }

    @Override // H2.b
    public String a() {
        return f306b.a(c());
    }

    @Override // H2.b
    public String b() {
        return f306b.b(c());
    }

    @Override // C2.d
    public Class c() {
        return this.f312a;
    }

    @Override // H2.b
    public boolean d(Object obj) {
        return f306b.c(obj, c());
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && k.a(A2.a.b(this), A2.a.b((H2.b) obj));
    }

    public int hashCode() {
        return A2.a.b(this).hashCode();
    }

    public String toString() {
        return c() + " (Kotlin reflection is not available)";
    }
}

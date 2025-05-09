package N0;

import N0.c;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1431a;

        static {
            int[] iArr = new int[m.values().length];
            f1431a = iArr;
            try {
                iArr[m.CHOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1431a[m.SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1431a[m.UNENCODED_CONTAINER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1431a[m.SET_OF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1431a[m.SEQUENCE_OF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1431a[m.INTEGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1431a[m.OBJECT_IDENTIFIER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1431a[m.UTC_TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1431a[m.GENERALIZED_TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1431a[m.BOOLEAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Field f1432a;

        /* renamed from: b, reason: collision with root package name */
        public final i f1433b;

        /* renamed from: c, reason: collision with root package name */
        public final m f1434c;

        /* renamed from: d, reason: collision with root package name */
        public final k f1435d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1436e;

        /* renamed from: f, reason: collision with root package name */
        public final int f1437f;

        /* renamed from: g, reason: collision with root package name */
        public final l f1438g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f1439h;

        public b(Field field, i iVar) {
            this.f1432a = field;
            this.f1433b = iVar;
            m type = iVar.type();
            this.f1434c = type;
            k cls = iVar.cls();
            cls = cls == k.AUTOMATIC ? iVar.tagNumber() != -1 ? k.CONTEXT_SPECIFIC : k.UNIVERSAL : cls;
            this.f1435d = cls;
            this.f1436e = O0.d.b(cls);
            this.f1437f = iVar.tagNumber() != -1 ? iVar.tagNumber() : (type == m.CHOICE || type == m.ANY) ? -1 : O0.d.d(type);
            l tagging = iVar.tagging();
            this.f1438g = tagging;
            if ((tagging != l.EXPLICIT && tagging != l.IMPLICIT) || iVar.tagNumber() != -1) {
                this.f1439h = iVar.optional();
                return;
            }
            throw new e("Tag number must be specified when tagging mode is " + tagging);
        }

        public i a() {
            return this.f1433b;
        }

        public int b() {
            return this.f1436e;
        }

        public int c() {
            return this.f1437f;
        }

        public Field d() {
            return this.f1432a;
        }

        public boolean e() {
            return this.f1439h;
        }

        public void f(O0.a aVar, Object obj) {
            int d3 = aVar.d();
            if (this.f1437f != -1) {
                int e3 = aVar.e();
                if (d3 != this.f1436e || e3 != this.f1437f) {
                    throw new C0039c("Tag mismatch. Expected: " + O0.d.h(this.f1436e, this.f1437f) + ", but found " + O0.d.h(d3, e3));
                }
            } else if (d3 != this.f1436e) {
                throw new C0039c("Tag mismatch. Expected class: " + O0.d.i(this.f1436e) + ", but found " + O0.d.i(d3));
            }
            if (this.f1438g == l.EXPLICIT) {
                try {
                    aVar = aVar.a().a();
                } catch (O0.b e4) {
                    throw new e("Failed to read contents of EXPLICIT data value", e4);
                }
            }
            d.b(obj, this.f1432a, this.f1434c, aVar);
        }
    }

    /* renamed from: N0.c$c, reason: collision with other inner class name */
    public static class C0039c extends e {
        public C0039c(String str) {
            super(str);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final byte[] f1440a = new byte[0];

        public static Object a(m mVar, O0.a aVar, Class cls) {
            if (ByteBuffer.class.equals(cls)) {
                return aVar.c();
            }
            if (byte[].class.equals(cls)) {
                ByteBuffer c3 = aVar.c();
                if (!c3.hasRemaining()) {
                    return f1440a;
                }
                byte[] bArr = new byte[c3.remaining()];
                c3.get(bArr);
                return bArr;
            }
            if (j.class.equals(cls)) {
                return new j(aVar.b());
            }
            ByteBuffer c4 = aVar.c();
            int i3 = a.f1431a[mVar.ordinal()];
            if (i3 == 1) {
                N0.d dVar = (N0.d) cls.getDeclaredAnnotation(N0.d.class);
                if (dVar != null && dVar.type() == m.CHOICE) {
                    return c.t(aVar, cls);
                }
            } else if (i3 != 2) {
                switch (i3) {
                    case 6:
                        if (Integer.TYPE.equals(cls) || Integer.class.equals(cls)) {
                            return Integer.valueOf(c.o(c4));
                        }
                        if (Long.TYPE.equals(cls) || Long.class.equals(cls)) {
                            return Long.valueOf(c.p(c4));
                        }
                        if (BigInteger.class.equals(cls)) {
                            return c.n(c4);
                        }
                        break;
                    case 7:
                        if (String.class.equals(cls)) {
                            return c.q(c4);
                        }
                        break;
                    case 8:
                    case 9:
                        if (String.class.equals(cls)) {
                            return new String(R0.c.a(c4));
                        }
                        break;
                    case 10:
                        if (Boolean.TYPE.equals(cls)) {
                            if (c4.remaining() == 1) {
                                return new Boolean(c4.get() != 0);
                            }
                            throw new e("Incorrect encoded size of boolean value: " + c4.remaining());
                        }
                        break;
                }
            } else {
                N0.d dVar2 = (N0.d) cls.getDeclaredAnnotation(N0.d.class);
                if (dVar2 != null && dVar2.type() == m.SEQUENCE) {
                    return c.u(aVar, cls);
                }
            }
            throw new e("Unsupported conversion: ASN.1 " + mVar + " to " + cls.getName());
        }

        public static void b(Object obj, Field field, m mVar, O0.a aVar) {
            try {
                int i3 = a.f1431a[mVar.ordinal()];
                if (i3 != 4 && i3 != 5) {
                    field.set(obj, a(mVar, aVar, field.getType()));
                } else if (j.class.equals(field.getType())) {
                    field.set(obj, a(mVar, aVar, field.getType()));
                } else {
                    field.set(obj, c.w(aVar, c.m(field)));
                }
            } catch (ReflectiveOperationException e3) {
                throw new e("Failed to set value of " + obj.getClass().getName() + "." + field.getName(), e3);
            }
        }
    }

    public static /* synthetic */ int a(b bVar, b bVar2) {
        return bVar.a().index() - bVar2.a().index();
    }

    public static long j(ByteBuffer byteBuffer) {
        long j3 = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0L;
        }
        while (byteBuffer.hasRemaining()) {
            if (j3 > 72057594037927935L) {
                throw new e("Base-128 number too large");
            }
            j3 = (j3 << 7) | (r0 & Byte.MAX_VALUE);
            if ((byteBuffer.get() & 128) == 0) {
                return j3;
            }
        }
        throw new e("Truncated base-128 encoded input: missing terminating byte, with highest bit not set");
    }

    public static List k(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            i iVar = (i) field.getDeclaredAnnotation(i.class);
            if (iVar != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new e(i.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new b(field, iVar));
                } catch (e e3) {
                    throw new e("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e3);
                }
            }
        }
        return arrayList;
    }

    public static m l(Class cls) {
        N0.d dVar = (N0.d) cls.getDeclaredAnnotation(N0.d.class);
        if (dVar == null) {
            throw new e(cls.getName() + " is not annotated with " + N0.d.class.getName());
        }
        int i3 = a.f1431a[dVar.type().ordinal()];
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            return dVar.type();
        }
        throw new e("Unsupported ASN.1 container annotation type: " + dVar.type());
    }

    public static Class m(Field field) {
        String typeName;
        typeName = field.getGenericType().getTypeName();
        int indexOf = typeName.indexOf(60);
        if (indexOf == -1) {
            throw new e("Not a container type: " + field.getGenericType());
        }
        int i3 = indexOf + 1;
        int indexOf2 = typeName.indexOf(62, i3);
        if (indexOf2 != -1) {
            return Class.forName(typeName.substring(i3, indexOf2));
        }
        throw new e("Not a container type: " + field.getGenericType());
    }

    public static BigInteger n(ByteBuffer byteBuffer) {
        return !byteBuffer.hasRemaining() ? BigInteger.ZERO : new BigInteger(R0.c.a(byteBuffer));
    }

    public static int o(ByteBuffer byteBuffer) {
        BigInteger n3 = n(byteBuffer);
        if (n3.compareTo(BigInteger.valueOf(-2147483648L)) < 0 || n3.compareTo(BigInteger.valueOf(2147483647L)) > 0) {
            throw new e(String.format("INTEGER cannot be represented as int: %1$d (0x%1$x)", n3));
        }
        return n3.intValue();
    }

    public static long p(ByteBuffer byteBuffer) {
        BigInteger n3 = n(byteBuffer);
        if (n3.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0 || n3.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
            throw new e(String.format("INTEGER cannot be represented as long: %1$d (0x%1$x)", n3));
        }
        return n3.longValue();
    }

    public static String q(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new e("Empty OBJECT IDENTIFIER");
        }
        long j3 = j(byteBuffer);
        int min = (int) Math.min(j3 / 40, 2L);
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(min));
        sb.append('.');
        sb.append(Long.toString(j3 - (min * 40)));
        while (byteBuffer.hasRemaining()) {
            long j4 = j(byteBuffer);
            sb.append('.');
            sb.append(Long.toString(j4));
        }
        return sb.toString();
    }

    public static Object r(O0.a aVar, Class cls) {
        if (aVar == null) {
            throw new NullPointerException("container == null");
        }
        if (cls == null) {
            throw new NullPointerException("containerClass == null");
        }
        m l3 = l(cls);
        int i3 = a.f1431a[l3.ordinal()];
        if (i3 == 1) {
            return t(aVar, cls);
        }
        if (i3 != 2) {
            if (i3 == 3) {
                return v(aVar, cls, true);
            }
            throw new e("Parsing container " + l3 + " not supported");
        }
        int d3 = O0.d.d(l3);
        if (aVar.d() == 0 && aVar.e() == d3) {
            return u(aVar, cls);
        }
        throw new C0039c("Unexpected data value read as " + cls.getName() + ". Expected " + O0.d.h(0, d3) + ", but read: " + O0.d.h(aVar.d(), aVar.e()));
    }

    public static Object s(ByteBuffer byteBuffer, Class cls) {
        try {
            O0.a a3 = new O0.e(byteBuffer).a();
            if (a3 != null) {
                return r(a3, cls);
            }
            throw new e("Empty input");
        } catch (O0.b e3) {
            throw new e("Failed to decode top-level data value", e3);
        }
    }

    public static Object t(O0.a aVar, Class cls) {
        List k3 = k(cls);
        if (k3.isEmpty()) {
            throw new e("No fields annotated with " + i.class.getName() + " in CHOICE class " + cls.getName());
        }
        int i3 = 0;
        while (i3 < k3.size() - 1) {
            b bVar = (b) k3.get(i3);
            int c3 = bVar.c();
            int b3 = bVar.b();
            i3++;
            for (int i4 = i3; i4 < k3.size(); i4++) {
                b bVar2 = (b) k3.get(i4);
                int c4 = bVar2.c();
                int b4 = bVar2.b();
                if (c3 == c4 && b3 == b4) {
                    throw new e("CHOICE fields are indistinguishable because they have the same tag class and number: " + cls.getName() + "." + bVar.d().getName() + " and ." + bVar2.d().getName());
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            Iterator it = k3.iterator();
            while (it.hasNext()) {
                try {
                    ((b) it.next()).f(aVar, newInstance);
                    return newInstance;
                } catch (C0039c unused) {
                }
            }
            throw new e("No options of CHOICE " + cls.getName() + " matched");
        } catch (IllegalArgumentException | ReflectiveOperationException e3) {
            throw new e("Failed to instantiate " + cls.getName(), e3);
        }
    }

    public static Object u(O0.a aVar, Class cls) {
        return v(aVar, cls, false);
    }

    public static Object v(O0.a aVar, Class cls, boolean z3) {
        O0.a a3;
        List<b> k3 = k(cls);
        Collections.sort(k3, new Comparator() { // from class: N0.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.a((c.b) obj, (c.b) obj2);
            }
        });
        if (k3.size() > 1) {
            b bVar = null;
            for (b bVar2 : k3) {
                if (bVar != null && bVar.a().index() == bVar2.a().index()) {
                    throw new e("Fields have the same index: " + cls.getName() + "." + bVar.d().getName() + " and ." + bVar2.d().getName());
                }
                bVar = bVar2;
            }
        }
        int i3 = 0;
        try {
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            O0.c a4 = aVar.a();
            while (i3 < k3.size()) {
                if (z3 && i3 == 0) {
                    a3 = aVar;
                } else {
                    try {
                        a3 = a4.a();
                    } catch (O0.b e3) {
                        throw new e("Malformed data value", e3);
                    }
                }
                if (a3 == null) {
                    break;
                }
                for (int i4 = i3; i4 < k3.size(); i4++) {
                    b bVar3 = (b) k3.get(i4);
                    try {
                        if (bVar3.e()) {
                            try {
                                bVar3.f(a3, newInstance);
                            } catch (C0039c unused) {
                            }
                        } else {
                            bVar3.f(a3, newInstance);
                        }
                        i3 = i4 + 1;
                        break;
                    } catch (e e4) {
                        throw new e("Failed to parse " + cls.getName() + "." + bVar3.d().getName(), e4);
                    }
                }
            }
            return newInstance;
        } catch (IllegalArgumentException | ReflectiveOperationException e5) {
            throw new e("Failed to instantiate " + cls.getName(), e5);
        }
    }

    public static List w(O0.a aVar, Class cls) {
        ArrayList arrayList = new ArrayList();
        O0.c a3 = aVar.a();
        while (true) {
            try {
                O0.a a4 = a3.a();
                if (a4 == null) {
                    return arrayList;
                }
                arrayList.add(ByteBuffer.class.equals(cls) ? a4.c() : j.class.equals(cls) ? new j(a4.b()) : r(a4, cls));
            } catch (O0.b e3) {
                throw new e("Malformed data value", e3);
            }
        }
    }
}

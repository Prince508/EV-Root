package N0;

import N0.g;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1441a = new j(new byte[]{5, 0});

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1442a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1443b;

        static {
            int[] iArr = new int[l.values().length];
            f1443b = iArr;
            try {
                iArr[l.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1443b[l.EXPLICIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1443b[l.IMPLICIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[m.values().length];
            f1442a = iArr2;
            try {
                iArr2[m.CHOICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1442a[m.SEQUENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1442a[m.UNENCODED_CONTAINER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1442a[m.OCTET_STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1442a[m.BIT_STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1442a[m.INTEGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1442a[m.BOOLEAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1442a[m.UTC_TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1442a[m.GENERALIZED_TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1442a[m.OBJECT_IDENTIFIER.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1442a[m.SET_OF.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1442a[m.SEQUENCE_OF.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Field f1444a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f1445b;

        /* renamed from: c, reason: collision with root package name */
        public final i f1446c;

        /* renamed from: d, reason: collision with root package name */
        public final m f1447d;

        /* renamed from: e, reason: collision with root package name */
        public final m f1448e;

        /* renamed from: f, reason: collision with root package name */
        public final k f1449f;

        /* renamed from: g, reason: collision with root package name */
        public final int f1450g;

        /* renamed from: h, reason: collision with root package name */
        public final int f1451h;

        /* renamed from: i, reason: collision with root package name */
        public final l f1452i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f1453j;

        public b(Object obj, Field field, i iVar) {
            this.f1445b = obj;
            this.f1444a = field;
            this.f1446c = iVar;
            m type = iVar.type();
            this.f1447d = type;
            this.f1448e = iVar.elementType();
            k cls = iVar.cls();
            cls = cls == k.AUTOMATIC ? iVar.tagNumber() != -1 ? k.CONTEXT_SPECIFIC : k.UNIVERSAL : cls;
            this.f1449f = cls;
            this.f1450g = O0.d.b(cls);
            this.f1451h = iVar.tagNumber() != -1 ? iVar.tagNumber() : (type == m.CHOICE || type == m.ANY) ? -1 : O0.d.d(type);
            l tagging = iVar.tagging();
            this.f1452i = tagging;
            if ((tagging != l.EXPLICIT && tagging != l.IMPLICIT) || iVar.tagNumber() != -1) {
                this.f1453j = iVar.optional();
                return;
            }
            throw new h("Tag number must be specified when tagging mode is " + tagging);
        }

        public i a() {
            return this.f1446c;
        }

        public Field b() {
            return this.f1444a;
        }

        public byte[] c() {
            Object p3 = g.p(this.f1445b, this.f1444a);
            if (p3 == null) {
                if (this.f1453j) {
                    return null;
                }
                throw new h("Required field not set");
            }
            byte[] a3 = d.a(p3, this.f1447d, this.f1448e);
            int i3 = a.f1443b[this.f1452i.ordinal()];
            if (i3 == 1) {
                return a3;
            }
            if (i3 == 2) {
                return g.m(this.f1450g, true, this.f1451h, a3);
            }
            if (i3 != 3) {
                throw new RuntimeException("Unknown tagging mode: " + this.f1452i);
            }
            if (O0.d.c(a3[0]) == 31) {
                throw new h("High-tag-number form not supported");
            }
            int i4 = this.f1451h;
            if (i4 < 31) {
                byte g3 = O0.d.g(a3[0], i4);
                a3[0] = g3;
                a3[0] = O0.d.f(g3, this.f1450g);
                return a3;
            }
            throw new h("Unsupported high tag number: " + this.f1451h);
        }
    }

    public static class c implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public static final c f1454a = new c();

        @Override // java.util.Comparator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            int min = Math.min(bArr.length, bArr2.length);
            for (int i3 = 0; i3 < min; i3++) {
                int i4 = (bArr[i3] & 255) - (bArr2[i3] & 255);
                if (i4 != 0) {
                    return i4;
                }
            }
            return bArr.length - bArr2.length;
        }
    }

    public static final class d {
        public static byte[] a(Object obj, m mVar, m mVar2) {
            byte[] bArr;
            Class<?> cls = obj.getClass();
            if (j.class.equals(cls)) {
                ByteBuffer a3 = ((j) obj).a();
                byte[] bArr2 = new byte[a3.remaining()];
                a3.get(bArr2);
                return bArr2;
            }
            if (mVar == null || mVar == m.ANY) {
                return g.n(obj);
            }
            switch (a.f1442a[mVar.ordinal()]) {
                case 1:
                    N0.d dVar = (N0.d) cls.getDeclaredAnnotation(N0.d.class);
                    if (dVar != null && dVar.type() == m.CHOICE) {
                        return g.r(obj);
                    }
                    break;
                case 2:
                    N0.d dVar2 = (N0.d) cls.getDeclaredAnnotation(N0.d.class);
                    if (dVar2 != null && dVar2.type() == m.SEQUENCE) {
                        return g.w(obj);
                    }
                    break;
                case 4:
                case 5:
                    if (obj instanceof ByteBuffer) {
                        ByteBuffer byteBuffer = (ByteBuffer) obj;
                        bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.slice().get(bArr);
                    } else {
                        bArr = obj instanceof byte[] ? (byte[]) obj : null;
                    }
                    if (bArr != null) {
                        return g.m(0, false, O0.d.d(mVar), bArr);
                    }
                    break;
                case 6:
                    if (obj instanceof Integer) {
                        return g.s(((Integer) obj).intValue());
                    }
                    if (obj instanceof Long) {
                        return g.t(((Long) obj).longValue());
                    }
                    if (obj instanceof BigInteger) {
                        return g.u((BigInteger) obj);
                    }
                    break;
                case 7:
                    if (obj instanceof Boolean) {
                        return g.q(((Boolean) obj).booleanValue());
                    }
                    break;
                case 8:
                case 9:
                    if (obj instanceof String) {
                        return g.m(0, false, O0.d.d(mVar), ((String) obj).getBytes());
                    }
                    break;
                case 10:
                    if (obj instanceof String) {
                        return g.v((String) obj);
                    }
                    break;
                case 11:
                    return g.A((Collection) obj, mVar2);
                case 12:
                    return g.y((Collection) obj, mVar2);
            }
            throw new h("Unsupported conversion: " + cls.getName() + " to ASN.1 " + mVar);
        }
    }

    public static byte[] A(Collection collection, m mVar) {
        return z(collection, mVar, true);
    }

    public static /* synthetic */ int a(b bVar, b bVar2) {
        return bVar.a().index() - bVar2.a().index();
    }

    public static byte[] m(int i3, boolean z3, int i4, byte[]... bArr) {
        byte[] bArr2;
        if (i4 >= 31) {
            throw new IllegalArgumentException("High tag numbers not supported: " + i4);
        }
        int i5 = 6;
        byte b3 = (byte) ((i3 << 6) | (z3 ? 32 : 0) | i4);
        int i6 = 0;
        for (byte[] bArr3 : bArr) {
            i6 += bArr3.length;
        }
        int i7 = 2;
        if (i6 < 128) {
            bArr2 = new byte[i6 + 2];
            bArr2[0] = b3;
            bArr2[1] = (byte) i6;
        } else {
            if (i6 <= 255) {
                byte[] bArr4 = new byte[i6 + 3];
                bArr4[1] = -127;
                bArr4[2] = (byte) i6;
                i5 = 3;
                bArr2 = bArr4;
            } else if (i6 <= 65535) {
                byte[] bArr5 = new byte[i6 + 4];
                bArr5[1] = -126;
                bArr5[2] = (byte) (i6 >> 8);
                bArr5[3] = (byte) (i6 & 255);
                bArr2 = bArr5;
                i5 = 4;
            } else if (i6 <= 16777215) {
                byte[] bArr6 = new byte[i6 + 5];
                bArr6[1] = -125;
                bArr6[2] = (byte) (i6 >> 16);
                bArr6[3] = (byte) ((i6 >> 8) & 255);
                bArr6[4] = (byte) (i6 & 255);
                bArr2 = bArr6;
                i5 = 5;
            } else {
                byte[] bArr7 = new byte[i6 + 6];
                bArr7[1] = -124;
                bArr7[2] = (byte) (i6 >> 24);
                bArr7[3] = (byte) ((i6 >> 16) & 255);
                bArr7[4] = (byte) ((i6 >> 8) & 255);
                bArr7[5] = (byte) (i6 & 255);
                bArr2 = bArr7;
            }
            bArr2[0] = b3;
            i7 = i5;
        }
        for (byte[] bArr8 : bArr) {
            System.arraycopy(bArr8, 0, bArr2, i7, bArr8.length);
            i7 += bArr8.length;
        }
        return bArr2;
    }

    public static byte[] n(Object obj) {
        Class<?> cls = obj.getClass();
        N0.d dVar = (N0.d) cls.getDeclaredAnnotation(N0.d.class);
        if (dVar == null) {
            throw new h(cls.getName() + " not annotated with " + N0.d.class.getName());
        }
        m type = dVar.type();
        int i3 = a.f1442a[type.ordinal()];
        if (i3 == 1) {
            return r(obj);
        }
        if (i3 == 2) {
            return w(obj);
        }
        if (i3 == 3) {
            return x(obj, true);
        }
        throw new h("Unsupported container type: " + type);
    }

    public static List o(Object obj) {
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            i iVar = (i) field.getDeclaredAnnotation(i.class);
            if (iVar != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new h(i.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new b(obj, field, iVar));
                } catch (h e3) {
                    throw new h("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e3);
                }
            }
        }
        return arrayList;
    }

    public static Object p(Object obj, Field field) {
        try {
            return field.get(obj);
        } catch (ReflectiveOperationException e3) {
            throw new h("Failed to read " + obj.getClass().getName() + "." + field.getName(), e3);
        }
    }

    public static byte[] q(boolean z3) {
        byte[] bArr = new byte[1];
        if (z3) {
            bArr[0] = 1;
        } else {
            bArr[0] = 0;
        }
        return m(0, false, 1, bArr);
    }

    public static byte[] r(Object obj) {
        Class<?> cls = obj.getClass();
        List<b> o3 = o(obj);
        if (o3.isEmpty()) {
            throw new h("No fields annotated with " + i.class.getName() + " in CHOICE class " + cls.getName());
        }
        b bVar = null;
        for (b bVar2 : o3) {
            if (p(obj, bVar2.b()) != null) {
                if (bVar != null) {
                    throw new h("Multiple non-null fields in CHOICE class " + cls.getName() + ": " + bVar.b().getName() + ", " + bVar2.b().getName());
                }
                bVar = bVar2;
            }
        }
        if (bVar != null) {
            return bVar.c();
        }
        throw new h("No non-null fields in CHOICE class " + cls.getName());
    }

    public static byte[] s(int i3) {
        return t(i3);
    }

    public static byte[] t(long j3) {
        return u(BigInteger.valueOf(j3));
    }

    public static byte[] u(BigInteger bigInteger) {
        return m(0, false, 2, bigInteger.toByteArray());
    }

    public static byte[] v(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String[] split = str.split("\\.");
        if (split.length < 2) {
            throw new h("OBJECT IDENTIFIER must contain at least two nodes: " + str);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt > 6 || parseInt < 0) {
                throw new h("Invalid value for node #1: " + parseInt);
            }
            try {
                int parseInt2 = Integer.parseInt(split[1]);
                if (parseInt2 >= 40 || parseInt2 < 0) {
                    throw new h("Invalid value for node #2: " + parseInt2);
                }
                int i3 = (parseInt * 40) + parseInt2;
                if (i3 > 255) {
                    throw new h("First two nodes out of range: " + parseInt + "." + parseInt2);
                }
                byteArrayOutputStream.write(i3);
                for (int i4 = 2; i4 < split.length; i4++) {
                    String str2 = split[i4];
                    try {
                        int parseInt3 = Integer.parseInt(str2);
                        if (parseInt3 < 0) {
                            throw new h("Invalid value for node #" + (i4 + 1) + ": " + parseInt3);
                        }
                        if (parseInt3 <= 127) {
                            byteArrayOutputStream.write(parseInt3);
                        } else if (parseInt3 < 16384) {
                            byteArrayOutputStream.write((parseInt3 >> 7) | 128);
                            byteArrayOutputStream.write(parseInt3 & 127);
                        } else {
                            if (parseInt3 >= 2097152) {
                                throw new h("Node #" + (i4 + 1) + " too large: " + parseInt3);
                            }
                            byteArrayOutputStream.write((parseInt3 >> 14) | 128);
                            byteArrayOutputStream.write((127 & (parseInt3 >> 7)) | 128);
                            byteArrayOutputStream.write(parseInt3 & 127);
                        }
                    } catch (NumberFormatException unused) {
                        throw new h("Node #" + (i4 + 1) + " not numeric: " + str2);
                    }
                }
                return m(0, false, 6, byteArrayOutputStream.toByteArray());
            } catch (NumberFormatException unused2) {
                throw new h("Node #2 not numeric: " + split[1]);
            }
        } catch (NumberFormatException unused3) {
            throw new h("Node #1 not numeric: " + split[0]);
        }
    }

    public static byte[] w(Object obj) {
        return x(obj, false);
    }

    public static byte[] x(Object obj, boolean z3) {
        Class<?> cls = obj.getClass();
        List<b> o3 = o(obj);
        Collections.sort(o3, new Comparator() { // from class: N0.f
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return g.a((g.b) obj2, (g.b) obj3);
            }
        });
        if (o3.size() > 1) {
            b bVar = null;
            for (b bVar2 : o3) {
                if (bVar != null && bVar.a().index() == bVar2.a().index()) {
                    throw new h("Fields have the same index: " + cls.getName() + "." + bVar.b().getName() + " and ." + bVar2.b().getName());
                }
                bVar = bVar2;
            }
        }
        ArrayList<byte[]> arrayList = new ArrayList(o3.size());
        int i3 = 0;
        for (b bVar3 : o3) {
            try {
                byte[] c3 = bVar3.c();
                if (c3 != null) {
                    arrayList.add(c3);
                    i3 += c3.length;
                }
            } catch (h e3) {
                throw new h("Failed to encode " + cls.getName() + "." + bVar3.b().getName(), e3);
            }
        }
        if (!z3) {
            return m(0, true, 16, (byte[][]) arrayList.toArray(new byte[0][]));
        }
        byte[] bArr = new byte[i3];
        int i4 = 0;
        for (byte[] bArr2 : arrayList) {
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    public static byte[] y(Collection collection, m mVar) {
        return z(collection, mVar, false);
    }

    public static byte[] z(Collection collection, m mVar, boolean z3) {
        int i3;
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(d.a(it.next(), mVar, null));
        }
        if (z3) {
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, c.f1454a);
            }
            i3 = 17;
        } else {
            i3 = 16;
        }
        return m(0, true, i3, (byte[][]) arrayList.toArray(new byte[0][]));
    }
}

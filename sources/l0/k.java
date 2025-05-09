package l0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f8464a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f8465b = {112, 114, 109, 0};

    public static void A(InputStream inputStream) {
        AbstractC0588c.h(inputStream);
        int j3 = AbstractC0588c.j(inputStream);
        if (j3 == 6 || j3 == 7) {
            return;
        }
        while (j3 > 0) {
            AbstractC0588c.j(inputStream);
            for (int j4 = AbstractC0588c.j(inputStream); j4 > 0; j4--) {
                AbstractC0588c.h(inputStream);
            }
            j3--;
        }
    }

    public static boolean B(OutputStream outputStream, byte[] bArr, C0587b[] c0587bArr) {
        if (Arrays.equals(bArr, l.f8466a)) {
            N(outputStream, c0587bArr);
            return true;
        }
        if (Arrays.equals(bArr, l.f8467b)) {
            M(outputStream, c0587bArr);
            return true;
        }
        if (Arrays.equals(bArr, l.f8469d)) {
            K(outputStream, c0587bArr);
            return true;
        }
        if (Arrays.equals(bArr, l.f8468c)) {
            L(outputStream, c0587bArr);
            return true;
        }
        if (!Arrays.equals(bArr, l.f8470e)) {
            return false;
        }
        J(outputStream, c0587bArr);
        return true;
    }

    public static void C(OutputStream outputStream, C0587b c0587b) {
        int[] iArr = c0587b.f8447h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            AbstractC0588c.p(outputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
    }

    public static m D(C0587b[] c0587bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            AbstractC0588c.p(byteArrayOutputStream, c0587bArr.length);
            int i3 = 2;
            for (C0587b c0587b : c0587bArr) {
                AbstractC0588c.q(byteArrayOutputStream, c0587b.f8442c);
                AbstractC0588c.q(byteArrayOutputStream, c0587b.f8443d);
                AbstractC0588c.q(byteArrayOutputStream, c0587b.f8446g);
                String j3 = j(c0587b.f8440a, c0587b.f8441b, l.f8466a);
                int k3 = AbstractC0588c.k(j3);
                AbstractC0588c.p(byteArrayOutputStream, k3);
                i3 = i3 + 14 + k3;
                AbstractC0588c.n(byteArrayOutputStream, j3);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i3 == byteArray.length) {
                m mVar = new m(EnumC0589d.DEX_FILES, i3, byteArray, false);
                byteArrayOutputStream.close();
                return mVar;
            }
            throw AbstractC0588c.c("Expected size " + i3 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void E(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f8464a);
        outputStream.write(bArr);
    }

    public static void F(OutputStream outputStream, C0587b c0587b) {
        I(outputStream, c0587b);
        C(outputStream, c0587b);
        H(outputStream, c0587b);
    }

    public static void G(OutputStream outputStream, C0587b c0587b, String str) {
        AbstractC0588c.p(outputStream, AbstractC0588c.k(str));
        AbstractC0588c.p(outputStream, c0587b.f8444e);
        AbstractC0588c.q(outputStream, c0587b.f8445f);
        AbstractC0588c.q(outputStream, c0587b.f8442c);
        AbstractC0588c.q(outputStream, c0587b.f8446g);
        AbstractC0588c.n(outputStream, str);
    }

    public static void H(OutputStream outputStream, C0587b c0587b) {
        byte[] bArr = new byte[k(c0587b.f8446g)];
        for (Map.Entry entry : c0587b.f8448i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, c0587b);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, c0587b);
            }
        }
        outputStream.write(bArr);
    }

    public static void I(OutputStream outputStream, C0587b c0587b) {
        int i3 = 0;
        for (Map.Entry entry : c0587b.f8448i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC0588c.p(outputStream, intValue - i3);
                AbstractC0588c.p(outputStream, 0);
                i3 = intValue;
            }
        }
    }

    public static void J(OutputStream outputStream, C0587b[] c0587bArr) {
        AbstractC0588c.p(outputStream, c0587bArr.length);
        for (C0587b c0587b : c0587bArr) {
            String j3 = j(c0587b.f8440a, c0587b.f8441b, l.f8470e);
            AbstractC0588c.p(outputStream, AbstractC0588c.k(j3));
            AbstractC0588c.p(outputStream, c0587b.f8448i.size());
            AbstractC0588c.p(outputStream, c0587b.f8447h.length);
            AbstractC0588c.q(outputStream, c0587b.f8442c);
            AbstractC0588c.n(outputStream, j3);
            Iterator it = c0587b.f8448i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC0588c.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i3 : c0587b.f8447h) {
                AbstractC0588c.p(outputStream, i3);
            }
        }
    }

    public static void K(OutputStream outputStream, C0587b[] c0587bArr) {
        AbstractC0588c.r(outputStream, c0587bArr.length);
        for (C0587b c0587b : c0587bArr) {
            int size = c0587b.f8448i.size() * 4;
            String j3 = j(c0587b.f8440a, c0587b.f8441b, l.f8469d);
            AbstractC0588c.p(outputStream, AbstractC0588c.k(j3));
            AbstractC0588c.p(outputStream, c0587b.f8447h.length);
            AbstractC0588c.q(outputStream, size);
            AbstractC0588c.q(outputStream, c0587b.f8442c);
            AbstractC0588c.n(outputStream, j3);
            Iterator it = c0587b.f8448i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC0588c.p(outputStream, ((Integer) it.next()).intValue());
                AbstractC0588c.p(outputStream, 0);
            }
            for (int i3 : c0587b.f8447h) {
                AbstractC0588c.p(outputStream, i3);
            }
        }
    }

    public static void L(OutputStream outputStream, C0587b[] c0587bArr) {
        byte[] b3 = b(c0587bArr, l.f8468c);
        AbstractC0588c.r(outputStream, c0587bArr.length);
        AbstractC0588c.m(outputStream, b3);
    }

    public static void M(OutputStream outputStream, C0587b[] c0587bArr) {
        byte[] b3 = b(c0587bArr, l.f8467b);
        AbstractC0588c.r(outputStream, c0587bArr.length);
        AbstractC0588c.m(outputStream, b3);
    }

    public static void N(OutputStream outputStream, C0587b[] c0587bArr) {
        O(outputStream, c0587bArr);
    }

    public static void O(OutputStream outputStream, C0587b[] c0587bArr) {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(c0587bArr));
        arrayList.add(c(c0587bArr));
        arrayList.add(d(c0587bArr));
        long length2 = l.f8466a.length + f8464a.length + 4 + (arrayList.size() * 16);
        AbstractC0588c.q(outputStream, arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            m mVar = (m) arrayList.get(i3);
            AbstractC0588c.q(outputStream, mVar.f8473a.f());
            AbstractC0588c.q(outputStream, length2);
            if (mVar.f8476d) {
                byte[] bArr = mVar.f8475c;
                long length3 = bArr.length;
                byte[] b3 = AbstractC0588c.b(bArr);
                arrayList2.add(b3);
                AbstractC0588c.q(outputStream, b3.length);
                AbstractC0588c.q(outputStream, length3);
                length = b3.length;
            } else {
                arrayList2.add(mVar.f8475c);
                AbstractC0588c.q(outputStream, mVar.f8475c.length);
                AbstractC0588c.q(outputStream, 0L);
                length = mVar.f8475c.length;
            }
            length2 += length;
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            outputStream.write((byte[]) arrayList2.get(i4));
        }
    }

    public static int a(C0587b c0587b) {
        Iterator it = c0587b.f8448i.entrySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return i3;
    }

    public static byte[] b(C0587b[] c0587bArr, byte[] bArr) {
        int i3 = 0;
        int i4 = 0;
        for (C0587b c0587b : c0587bArr) {
            i4 += AbstractC0588c.k(j(c0587b.f8440a, c0587b.f8441b, bArr)) + 16 + (c0587b.f8444e * 2) + c0587b.f8445f + k(c0587b.f8446g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i4);
        if (Arrays.equals(bArr, l.f8468c)) {
            int length = c0587bArr.length;
            while (i3 < length) {
                C0587b c0587b2 = c0587bArr[i3];
                G(byteArrayOutputStream, c0587b2, j(c0587b2.f8440a, c0587b2.f8441b, bArr));
                F(byteArrayOutputStream, c0587b2);
                i3++;
            }
        } else {
            for (C0587b c0587b3 : c0587bArr) {
                G(byteArrayOutputStream, c0587b3, j(c0587b3.f8440a, c0587b3.f8441b, bArr));
            }
            int length2 = c0587bArr.length;
            while (i3 < length2) {
                F(byteArrayOutputStream, c0587bArr[i3]);
                i3++;
            }
        }
        if (byteArrayOutputStream.size() == i4) {
            return byteArrayOutputStream.toByteArray();
        }
        throw AbstractC0588c.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i4);
    }

    public static m c(C0587b[] c0587bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = 0;
        for (int i4 = 0; i4 < c0587bArr.length; i4++) {
            try {
                C0587b c0587b = c0587bArr[i4];
                AbstractC0588c.p(byteArrayOutputStream, i4);
                AbstractC0588c.p(byteArrayOutputStream, c0587b.f8444e);
                i3 = i3 + 4 + (c0587b.f8444e * 2);
                C(byteArrayOutputStream, c0587b);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i3 == byteArray.length) {
            m mVar = new m(EnumC0589d.CLASSES, i3, byteArray, true);
            byteArrayOutputStream.close();
            return mVar;
        }
        throw AbstractC0588c.c("Expected size " + i3 + ", does not match actual size " + byteArray.length);
    }

    public static m d(C0587b[] c0587bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = 0;
        for (int i4 = 0; i4 < c0587bArr.length; i4++) {
            try {
                C0587b c0587b = c0587bArr[i4];
                int a3 = a(c0587b);
                byte[] e3 = e(c0587b);
                byte[] f3 = f(c0587b);
                AbstractC0588c.p(byteArrayOutputStream, i4);
                int length = e3.length + 2 + f3.length;
                AbstractC0588c.q(byteArrayOutputStream, length);
                AbstractC0588c.p(byteArrayOutputStream, a3);
                byteArrayOutputStream.write(e3);
                byteArrayOutputStream.write(f3);
                i3 = i3 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i3 == byteArray.length) {
            m mVar = new m(EnumC0589d.METHODS, i3, byteArray, true);
            byteArrayOutputStream.close();
            return mVar;
        }
        throw AbstractC0588c.c("Expected size " + i3 + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(C0587b c0587b) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, c0587b);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] f(C0587b c0587b) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, c0587b);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    public static String h(String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    public static C0587b i(C0587b[] c0587bArr, String str) {
        if (c0587bArr.length <= 0) {
            return null;
        }
        String h3 = h(str);
        for (int i3 = 0; i3 < c0587bArr.length; i3++) {
            if (c0587bArr[i3].f8441b.equals(h3)) {
                return c0587bArr[i3];
            }
        }
        return null;
    }

    public static String j(String str, String str2, byte[] bArr) {
        String a3 = l.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a3);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a3);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + l.a(bArr) + str2;
    }

    public static int k(int i3) {
        return y(i3 * 2) / 8;
    }

    public static int l(int i3, int i4, int i5) {
        if (i3 == 1) {
            throw AbstractC0588c.c("HOT methods are not stored in the bitmap");
        }
        if (i3 == 2) {
            return i4;
        }
        if (i3 == 4) {
            return i4 + i5;
        }
        throw AbstractC0588c.c("Unexpected flag: " + i3);
    }

    public static int[] m(InputStream inputStream, int i3) {
        int[] iArr = new int[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += AbstractC0588c.h(inputStream);
            iArr[i5] = i4;
        }
        return iArr;
    }

    public static int n(BitSet bitSet, int i3, int i4) {
        int i5 = bitSet.get(l(2, i3, i4)) ? 2 : 0;
        return bitSet.get(l(4, i3, i4)) ? i5 | 4 : i5;
    }

    public static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, AbstractC0588c.d(inputStream, bArr.length))) {
            return AbstractC0588c.d(inputStream, l.f8467b.length);
        }
        throw AbstractC0588c.c("Invalid magic");
    }

    public static void p(InputStream inputStream, C0587b c0587b) {
        int available = inputStream.available() - c0587b.f8445f;
        int i3 = 0;
        while (inputStream.available() > available) {
            i3 += AbstractC0588c.h(inputStream);
            c0587b.f8448i.put(Integer.valueOf(i3), 1);
            for (int h3 = AbstractC0588c.h(inputStream); h3 > 0; h3--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw AbstractC0588c.c("Read too much data during profile line parse");
        }
    }

    public static C0587b[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, C0587b[] c0587bArr) {
        if (Arrays.equals(bArr, l.f8471f)) {
            if (Arrays.equals(l.f8466a, bArr2)) {
                throw AbstractC0588c.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, c0587bArr);
        }
        if (Arrays.equals(bArr, l.f8472g)) {
            return t(inputStream, bArr2, c0587bArr);
        }
        throw AbstractC0588c.c("Unsupported meta version");
    }

    public static C0587b[] r(InputStream inputStream, byte[] bArr, C0587b[] c0587bArr) {
        if (!Arrays.equals(bArr, l.f8471f)) {
            throw AbstractC0588c.c("Unsupported meta version");
        }
        int j3 = AbstractC0588c.j(inputStream);
        byte[] e3 = AbstractC0588c.e(inputStream, (int) AbstractC0588c.i(inputStream), (int) AbstractC0588c.i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC0588c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e3);
        try {
            C0587b[] s3 = s(byteArrayInputStream, j3, c0587bArr);
            byteArrayInputStream.close();
            return s3;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C0587b[] s(InputStream inputStream, int i3, C0587b[] c0587bArr) {
        if (inputStream.available() == 0) {
            return new C0587b[0];
        }
        if (i3 != c0587bArr.length) {
            throw AbstractC0588c.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i3];
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int h3 = AbstractC0588c.h(inputStream);
            iArr[i4] = AbstractC0588c.h(inputStream);
            strArr[i4] = AbstractC0588c.f(inputStream, h3);
        }
        for (int i5 = 0; i5 < i3; i5++) {
            C0587b c0587b = c0587bArr[i5];
            if (!c0587b.f8441b.equals(strArr[i5])) {
                throw AbstractC0588c.c("Order of dexfiles in metadata did not match baseline");
            }
            int i6 = iArr[i5];
            c0587b.f8444e = i6;
            c0587b.f8447h = m(inputStream, i6);
        }
        return c0587bArr;
    }

    public static C0587b[] t(InputStream inputStream, byte[] bArr, C0587b[] c0587bArr) {
        int h3 = AbstractC0588c.h(inputStream);
        byte[] e3 = AbstractC0588c.e(inputStream, (int) AbstractC0588c.i(inputStream), (int) AbstractC0588c.i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC0588c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e3);
        try {
            C0587b[] u3 = u(byteArrayInputStream, bArr, h3, c0587bArr);
            byteArrayInputStream.close();
            return u3;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C0587b[] u(InputStream inputStream, byte[] bArr, int i3, C0587b[] c0587bArr) {
        if (inputStream.available() == 0) {
            return new C0587b[0];
        }
        if (i3 != c0587bArr.length) {
            throw AbstractC0588c.c("Mismatched number of dex files found in metadata");
        }
        for (int i4 = 0; i4 < i3; i4++) {
            AbstractC0588c.h(inputStream);
            String f3 = AbstractC0588c.f(inputStream, AbstractC0588c.h(inputStream));
            long i5 = AbstractC0588c.i(inputStream);
            int h3 = AbstractC0588c.h(inputStream);
            C0587b i6 = i(c0587bArr, f3);
            if (i6 == null) {
                throw AbstractC0588c.c("Missing profile key: " + f3);
            }
            i6.f8443d = i5;
            int[] m3 = m(inputStream, h3);
            if (Arrays.equals(bArr, l.f8470e)) {
                i6.f8444e = h3;
                i6.f8447h = m3;
            }
        }
        return c0587bArr;
    }

    public static void v(InputStream inputStream, C0587b c0587b) {
        BitSet valueOf = BitSet.valueOf(AbstractC0588c.d(inputStream, AbstractC0588c.a(c0587b.f8446g * 2)));
        int i3 = 0;
        while (true) {
            int i4 = c0587b.f8446g;
            if (i3 >= i4) {
                return;
            }
            int n3 = n(valueOf, i3, i4);
            if (n3 != 0) {
                Integer num = (Integer) c0587b.f8448i.get(Integer.valueOf(i3));
                if (num == null) {
                    num = 0;
                }
                c0587b.f8448i.put(Integer.valueOf(i3), Integer.valueOf(n3 | num.intValue()));
            }
            i3++;
        }
    }

    public static C0587b[] w(InputStream inputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, l.f8467b)) {
            throw AbstractC0588c.c("Unsupported version");
        }
        int j3 = AbstractC0588c.j(inputStream);
        byte[] e3 = AbstractC0588c.e(inputStream, (int) AbstractC0588c.i(inputStream), (int) AbstractC0588c.i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC0588c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e3);
        try {
            C0587b[] x3 = x(byteArrayInputStream, str, j3);
            byteArrayInputStream.close();
            return x3;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C0587b[] x(InputStream inputStream, String str, int i3) {
        if (inputStream.available() == 0) {
            return new C0587b[0];
        }
        C0587b[] c0587bArr = new C0587b[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int h3 = AbstractC0588c.h(inputStream);
            int h4 = AbstractC0588c.h(inputStream);
            c0587bArr[i4] = new C0587b(str, AbstractC0588c.f(inputStream, h3), AbstractC0588c.i(inputStream), 0L, h4, (int) AbstractC0588c.i(inputStream), (int) AbstractC0588c.i(inputStream), new int[h4], new TreeMap());
        }
        for (int i5 = 0; i5 < i3; i5++) {
            C0587b c0587b = c0587bArr[i5];
            p(inputStream, c0587b);
            c0587b.f8447h = m(inputStream, c0587b.f8444e);
            v(inputStream, c0587b);
        }
        return c0587bArr;
    }

    public static int y(int i3) {
        return (i3 + 7) & (-8);
    }

    public static void z(byte[] bArr, int i3, int i4, C0587b c0587b) {
        int l3 = l(i3, i4, c0587b.f8446g);
        int i5 = l3 / 8;
        bArr[i5] = (byte) ((1 << (l3 % 8)) | bArr[i5]);
    }
}

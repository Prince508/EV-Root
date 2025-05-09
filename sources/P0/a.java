package P0;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.jar.Attributes;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1658e = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1659a;

    /* renamed from: b, reason: collision with root package name */
    public int f1660b;

    /* renamed from: c, reason: collision with root package name */
    public int f1661c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f1662d;

    /* renamed from: P0.a$a, reason: collision with other inner class name */
    public static class C0043a {

        /* renamed from: a, reason: collision with root package name */
        public final String f1663a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1664b;

        public C0043a(String str, String str2) {
            this.f1663a = str;
            this.f1664b = str2;
        }

        public String a() {
            return this.f1663a;
        }

        public String b() {
            return this.f1664b;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f1665a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1666b;

        /* renamed from: c, reason: collision with root package name */
        public final String f1667c;

        /* renamed from: d, reason: collision with root package name */
        public final List f1668d;

        public b(int i3, int i4, List list) {
            String str;
            this.f1665a = i3;
            this.f1666b = i4;
            if (!list.isEmpty()) {
                C0043a c0043a = (C0043a) list.get(0);
                if ("Name".equalsIgnoreCase(c0043a.a())) {
                    str = c0043a.b();
                    this.f1667c = str;
                    this.f1668d = Collections.unmodifiableList(new ArrayList(list));
                }
            }
            str = null;
            this.f1667c = str;
            this.f1668d = Collections.unmodifiableList(new ArrayList(list));
        }

        public String a(String str) {
            for (C0043a c0043a : this.f1668d) {
                if (c0043a.a().equalsIgnoreCase(str)) {
                    return c0043a.b();
                }
            }
            return null;
        }

        public String b(Attributes.Name name) {
            return a(name.toString());
        }

        public String c() {
            return this.f1667c;
        }

        public int d() {
            return this.f1666b;
        }

        public int e() {
            return this.f1665a;
        }
    }

    public a(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, int i3, int i4) {
        byte[] bArr3 = new byte[bArr.length + i4];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, i3, bArr3, bArr.length, i4);
        return bArr3;
    }

    public static C0043a b(String str) {
        int indexOf = str.indexOf(": ");
        return indexOf == -1 ? new C0043a(str, "") : new C0043a(str.substring(0, indexOf), str.substring(indexOf + 2));
    }

    public List c() {
        ArrayList arrayList = new ArrayList();
        while (true) {
            b g3 = g();
            if (g3 == null) {
                return arrayList;
            }
            arrayList.add(g3);
        }
    }

    public final String d() {
        byte[] e3 = e();
        if (e3 == null) {
            return null;
        }
        return e3.length == 0 ? "" : new String(e3, StandardCharsets.UTF_8);
    }

    public final byte[] e() {
        byte[] bArr = this.f1662d;
        if (bArr != null && bArr.length == 0) {
            this.f1662d = null;
            return f1658e;
        }
        byte[] f3 = f();
        if (f3 == null) {
            byte[] bArr2 = this.f1662d;
            if (bArr2 == null) {
                return null;
            }
            this.f1662d = null;
            return bArr2;
        }
        if (f3.length == 0) {
            byte[] bArr3 = this.f1662d;
            if (bArr3 == null) {
                return f1658e;
            }
            this.f1662d = f1658e;
            return bArr3;
        }
        byte[] bArr4 = this.f1662d;
        if (bArr4 != null) {
            if (f3.length == 0 || f3[0] != 32) {
                this.f1662d = f3;
                return bArr4;
            }
            this.f1662d = null;
            f3 = a(bArr4, f3, 1, f3.length - 1);
        }
        while (true) {
            byte[] f4 = f();
            if (f4 == null) {
                return f3;
            }
            if (f4.length == 0) {
                this.f1662d = f1658e;
                return f3;
            }
            if (f4[0] != 32) {
                this.f1662d = f4;
                return f3;
            }
            f3 = a(f3, f4, 1, f4.length - 1);
        }
    }

    public final byte[] f() {
        int i3;
        int i4;
        int i5 = this.f1660b;
        if (i5 >= this.f1661c) {
            return null;
        }
        int i6 = i5;
        while (true) {
            i3 = this.f1661c;
            if (i6 >= i3) {
                i6 = -1;
                i4 = -1;
                break;
            }
            byte[] bArr = this.f1659a;
            byte b3 = bArr[i6];
            if (b3 == 13) {
                i4 = i6 + 1;
                if (i4 < i3 && bArr[i4] == 10) {
                    i4 = i6 + 2;
                }
            } else {
                if (b3 == 10) {
                    i4 = i6 + 1;
                    break;
                }
                i6++;
            }
        }
        if (i6 == -1) {
            i6 = i3;
        } else {
            i3 = i4;
        }
        this.f1660b = i3;
        return i6 == i5 ? f1658e : Arrays.copyOfRange(this.f1659a, i5, i6);
    }

    public b g() {
        int i3;
        String d3;
        do {
            i3 = this.f1660b;
            d3 = d();
            if (d3 == null) {
                return null;
            }
        } while (d3.length() == 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(b(d3));
        while (true) {
            String d4 = d();
            if (d4 == null || d4.length() == 0) {
                break;
            }
            arrayList.add(b(d4));
        }
        return new b(i3, this.f1660b - i3, arrayList);
    }

    public a(byte[] bArr, int i3, int i4) {
        this.f1659a = bArr;
        this.f1660b = i3;
        this.f1661c = i3 + i4;
    }
}

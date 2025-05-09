package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0417h implements Iterable, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0417h f5793f = new j(AbstractC0434z.f6011d);

    /* renamed from: g, reason: collision with root package name */
    public static final f f5794g;

    /* renamed from: h, reason: collision with root package name */
    public static final Comparator f5795h;

    /* renamed from: e, reason: collision with root package name */
    public int f5796e = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$a */
    public class a extends c {

        /* renamed from: e, reason: collision with root package name */
        public int f5797e = 0;

        /* renamed from: f, reason: collision with root package name */
        public final int f5798f;

        public a() {
            this.f5798f = AbstractC0417h.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h.g
        public byte a() {
            int i3 = this.f5797e;
            if (i3 >= this.f5798f) {
                throw new NoSuchElementException();
            }
            this.f5797e = i3 + 1;
            return AbstractC0417h.this.q(i3);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5797e < this.f5798f;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$b */
    public class b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC0417h abstractC0417h, AbstractC0417h abstractC0417h2) {
            g s3 = abstractC0417h.s();
            g s4 = abstractC0417h2.s();
            while (s3.hasNext() && s4.hasNext()) {
                int compareTo = Integer.valueOf(AbstractC0417h.z(s3.a())).compareTo(Integer.valueOf(AbstractC0417h.z(s4.a())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(abstractC0417h.size()).compareTo(Integer.valueOf(abstractC0417h2.size()));
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$c */
    public static abstract class c implements g {
        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$d */
    public static final class d implements f {
        public d() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h.f
        public byte[] a(byte[] bArr, int i3, int i4) {
            return Arrays.copyOfRange(bArr, i3, i4 + i3);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$e */
    public static final class e extends j {

        /* renamed from: j, reason: collision with root package name */
        public final int f5800j;

        /* renamed from: k, reason: collision with root package name */
        public final int f5801k;

        public e(byte[] bArr, int i3, int i4) {
            super(bArr);
            AbstractC0417h.l(i3, i3 + i4, bArr.length);
            this.f5800j = i3;
            this.f5801k = i4;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h.j
        public int I() {
            return this.f5800j;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h.j, com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public byte j(int i3) {
            AbstractC0417h.k(i3, size());
            return this.f5804i[this.f5800j + i3];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h.j, com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public void p(byte[] bArr, int i3, int i4, int i5) {
            System.arraycopy(this.f5804i, I() + i3, bArr, i4, i5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h.j, com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public byte q(int i3) {
            return this.f5804i[this.f5800j + i3];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h.j, com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public int size() {
            return this.f5801k;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$f */
    public interface f {
        byte[] a(byte[] bArr, int i3, int i4);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$g */
    public interface g extends Iterator {
        byte a();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$h, reason: collision with other inner class name */
    public static final class C0113h {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC0420k f5802a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f5803b;

        public /* synthetic */ C0113h(int i3, a aVar) {
            this(i3);
        }

        public AbstractC0417h a() {
            this.f5802a.c();
            return new j(this.f5803b);
        }

        public AbstractC0420k b() {
            return this.f5802a;
        }

        public C0113h(int i3) {
            byte[] bArr = new byte[i3];
            this.f5803b = bArr;
            this.f5802a = AbstractC0420k.U(bArr);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$i */
    public static abstract class i extends AbstractC0417h {
        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.s();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$j */
    public static class j extends i {

        /* renamed from: i, reason: collision with root package name */
        public final byte[] f5804i;

        public j(byte[] bArr) {
            bArr.getClass();
            this.f5804i = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public final String B(Charset charset) {
            return new String(this.f5804i, I(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public final void G(AbstractC0416g abstractC0416g) {
            abstractC0416g.a(this.f5804i, I(), size());
        }

        public final boolean H(AbstractC0417h abstractC0417h, int i3, int i4) {
            if (i4 > abstractC0417h.size()) {
                throw new IllegalArgumentException("Length too large: " + i4 + size());
            }
            int i5 = i3 + i4;
            if (i5 > abstractC0417h.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i3 + ", " + i4 + ", " + abstractC0417h.size());
            }
            if (!(abstractC0417h instanceof j)) {
                return abstractC0417h.x(i3, i5).equals(x(0, i4));
            }
            j jVar = (j) abstractC0417h;
            byte[] bArr = this.f5804i;
            byte[] bArr2 = jVar.f5804i;
            int I3 = I() + i4;
            int I4 = I();
            int I5 = jVar.I() + i3;
            while (I4 < I3) {
                if (bArr[I4] != bArr2[I5]) {
                    return false;
                }
                I4++;
                I5++;
            }
            return true;
        }

        public int I() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC0417h) || size() != ((AbstractC0417h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int w3 = w();
            int w4 = jVar.w();
            if (w3 == 0 || w4 == 0 || w3 == w4) {
                return H(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public byte j(int i3) {
            return this.f5804i[i3];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public void p(byte[] bArr, int i3, int i4, int i5) {
            System.arraycopy(this.f5804i, i3, bArr, i4, i5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public byte q(int i3) {
            return this.f5804i[i3];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public final boolean r() {
            int I3 = I();
            return p0.n(this.f5804i, I3, size() + I3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public int size() {
            return this.f5804i.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public final AbstractC0418i u() {
            return AbstractC0418i.j(this.f5804i, I(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public final int v(int i3, int i4, int i5) {
            return AbstractC0434z.h(i3, this.f5804i, I() + i4, i5);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h
        public final AbstractC0417h x(int i3, int i4) {
            int l3 = AbstractC0417h.l(i3, i4, size());
            return l3 == 0 ? AbstractC0417h.f5793f : new e(this.f5804i, I() + i3, l3);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$k */
    public static final class k implements f {
        public k() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0417h.f
        public byte[] a(byte[] bArr, int i3, int i4) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            return bArr2;
        }

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f5794g = AbstractC0413d.c() ? new k(aVar) : new d(aVar);
        f5795h = new b();
    }

    public static AbstractC0417h E(byte[] bArr) {
        return new j(bArr);
    }

    public static AbstractC0417h F(byte[] bArr, int i3, int i4) {
        return new e(bArr, i3, i4);
    }

    public static void k(int i3, int i4) {
        if (((i4 - (i3 + 1)) | i3) < 0) {
            if (i3 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i3);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i3 + ", " + i4);
        }
    }

    public static int l(int i3, int i4, int i5) {
        int i6 = i4 - i3;
        if ((i3 | i4 | i6 | (i5 - i4)) >= 0) {
            return i6;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i3 + " < 0");
        }
        if (i4 < i3) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i3 + ", " + i4);
        }
        throw new IndexOutOfBoundsException("End index: " + i4 + " >= " + i5);
    }

    public static AbstractC0417h m(byte[] bArr) {
        return n(bArr, 0, bArr.length);
    }

    public static AbstractC0417h n(byte[] bArr, int i3, int i4) {
        l(i3, i3 + i4, bArr.length);
        return new j(f5794g.a(bArr, i3, i4));
    }

    public static AbstractC0417h o(String str) {
        return new j(str.getBytes(AbstractC0434z.f6009b));
    }

    public static C0113h t(int i3) {
        return new C0113h(i3, null);
    }

    public static int z(byte b3) {
        return b3 & 255;
    }

    public final String A(Charset charset) {
        return size() == 0 ? "" : B(charset);
    }

    public abstract String B(Charset charset);

    public final String C() {
        return A(AbstractC0434z.f6009b);
    }

    public final String D() {
        if (size() <= 50) {
            return i0.a(this);
        }
        return i0.a(x(0, 47)) + "...";
    }

    public abstract void G(AbstractC0416g abstractC0416g);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i3 = this.f5796e;
        if (i3 == 0) {
            int size = size();
            i3 = v(size, 0, size);
            if (i3 == 0) {
                i3 = 1;
            }
            this.f5796e = i3;
        }
        return i3;
    }

    public abstract byte j(int i3);

    public abstract void p(byte[] bArr, int i3, int i4, int i5);

    public abstract byte q(int i3);

    public abstract boolean r();

    public g s() {
        return new a();
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), D());
    }

    public abstract AbstractC0418i u();

    public abstract int v(int i3, int i4, int i5);

    public final int w() {
        return this.f5796e;
    }

    public abstract AbstractC0417h x(int i3, int i4);

    public final byte[] y() {
        int size = size();
        if (size == 0) {
            return AbstractC0434z.f6011d;
        }
        byte[] bArr = new byte[size];
        p(bArr, 0, 0, size);
        return bArr;
    }
}

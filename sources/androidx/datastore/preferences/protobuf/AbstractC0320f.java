package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0320f implements Iterable, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0320f f3626f = new i(AbstractC0334u.f3849c);

    /* renamed from: g, reason: collision with root package name */
    public static final InterfaceC0082f f3627g;

    /* renamed from: h, reason: collision with root package name */
    public static final Comparator f3628h;

    /* renamed from: e, reason: collision with root package name */
    public int f3629e = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.f$a */
    public class a extends c {

        /* renamed from: e, reason: collision with root package name */
        public int f3630e = 0;

        /* renamed from: f, reason: collision with root package name */
        public final int f3631f;

        public a() {
            this.f3631f = AbstractC0320f.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f.g
        public byte a() {
            int i3 = this.f3630e;
            if (i3 >= this.f3631f) {
                throw new NoSuchElementException();
            }
            this.f3630e = i3 + 1;
            return AbstractC0320f.this.p(i3);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3630e < this.f3631f;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$b */
    public static class b implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC0320f abstractC0320f, AbstractC0320f abstractC0320f2) {
            g r3 = abstractC0320f.r();
            g r4 = abstractC0320f2.r();
            while (r3.hasNext() && r4.hasNext()) {
                int compare = Integer.compare(AbstractC0320f.v(r3.a()), AbstractC0320f.v(r4.a()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(abstractC0320f.size(), abstractC0320f2.size());
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$c */
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

    /* renamed from: androidx.datastore.preferences.protobuf.f$d */
    public static final class d implements InterfaceC0082f {
        public d() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f.InterfaceC0082f
        public byte[] a(byte[] bArr, int i3, int i4) {
            return Arrays.copyOfRange(bArr, i3, i4 + i3);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$e */
    public static final class e extends i {

        /* renamed from: j, reason: collision with root package name */
        public final int f3633j;

        /* renamed from: k, reason: collision with root package name */
        public final int f3634k;

        public e(byte[] bArr, int i3, int i4) {
            super(bArr);
            AbstractC0320f.l(i3, i3 + i4, bArr.length);
            this.f3633j = i3;
            this.f3634k = i4;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f.i
        public int D() {
            return this.f3633j;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f.i, androidx.datastore.preferences.protobuf.AbstractC0320f
        public byte j(int i3) {
            AbstractC0320f.k(i3, size());
            return this.f3635i[this.f3633j + i3];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f.i, androidx.datastore.preferences.protobuf.AbstractC0320f
        public byte p(int i3) {
            return this.f3635i[this.f3633j + i3];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f.i, androidx.datastore.preferences.protobuf.AbstractC0320f
        public int size() {
            return this.f3634k;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$f, reason: collision with other inner class name */
    public interface InterfaceC0082f {
        byte[] a(byte[] bArr, int i3, int i4);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$g */
    public interface g extends Iterator {
        byte a();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$h */
    public static abstract class h extends AbstractC0320f {
        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.r();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$i */
    public static class i extends h {

        /* renamed from: i, reason: collision with root package name */
        public final byte[] f3635i;

        public i(byte[] bArr) {
            bArr.getClass();
            this.f3635i = bArr;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f
        public final void B(AbstractC0319e abstractC0319e) {
            abstractC0319e.a(this.f3635i, D(), size());
        }

        public final boolean C(AbstractC0320f abstractC0320f, int i3, int i4) {
            if (i4 > abstractC0320f.size()) {
                throw new IllegalArgumentException("Length too large: " + i4 + size());
            }
            int i5 = i3 + i4;
            if (i5 > abstractC0320f.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i3 + ", " + i4 + ", " + abstractC0320f.size());
            }
            if (!(abstractC0320f instanceof i)) {
                return abstractC0320f.u(i3, i5).equals(u(0, i4));
            }
            i iVar = (i) abstractC0320f;
            byte[] bArr = this.f3635i;
            byte[] bArr2 = iVar.f3635i;
            int D3 = D() + i4;
            int D4 = D();
            int D5 = iVar.D() + i3;
            while (D4 < D3) {
                if (bArr[D4] != bArr2[D5]) {
                    return false;
                }
                D4++;
                D5++;
            }
            return true;
        }

        public int D() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC0320f) || size() != ((AbstractC0320f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int t3 = t();
            int t4 = iVar.t();
            if (t3 == 0 || t4 == 0 || t3 == t4) {
                return C(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f
        public byte j(int i3) {
            return this.f3635i[i3];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f
        public byte p(int i3) {
            return this.f3635i[i3];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f
        public final boolean q() {
            int D3 = D();
            return k0.n(this.f3635i, D3, size() + D3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f
        public final int s(int i3, int i4, int i5) {
            return AbstractC0334u.i(i3, this.f3635i, D() + i4, i5);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f
        public int size() {
            return this.f3635i.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f
        public final AbstractC0320f u(int i3, int i4) {
            int l3 = AbstractC0320f.l(i3, i4, size());
            return l3 == 0 ? AbstractC0320f.f3626f : new e(this.f3635i, D() + i3, l3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f
        public final String x(Charset charset) {
            return new String(this.f3635i, D(), size(), charset);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.f$j */
    public static final class j implements InterfaceC0082f {
        public j() {
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0320f.InterfaceC0082f
        public byte[] a(byte[] bArr, int i3, int i4) {
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, i3, bArr2, 0, i4);
            return bArr2;
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        a aVar = null;
        f3627g = AbstractC0318d.c() ? new j(aVar) : new d(aVar);
        f3628h = new b();
    }

    public static AbstractC0320f A(byte[] bArr, int i3, int i4) {
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

    public static AbstractC0320f m(byte[] bArr) {
        return n(bArr, 0, bArr.length);
    }

    public static AbstractC0320f n(byte[] bArr, int i3, int i4) {
        l(i3, i3 + i4, bArr.length);
        return new i(f3627g.a(bArr, i3, i4));
    }

    public static AbstractC0320f o(String str) {
        return new i(str.getBytes(AbstractC0334u.f3847a));
    }

    public static int v(byte b3) {
        return b3 & 255;
    }

    public static AbstractC0320f z(byte[] bArr) {
        return new i(bArr);
    }

    public abstract void B(AbstractC0319e abstractC0319e);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i3 = this.f3629e;
        if (i3 == 0) {
            int size = size();
            i3 = s(size, 0, size);
            if (i3 == 0) {
                i3 = 1;
            }
            this.f3629e = i3;
        }
        return i3;
    }

    public abstract byte j(int i3);

    public abstract byte p(int i3);

    public abstract boolean q();

    public g r() {
        return new a();
    }

    public abstract int s(int i3, int i4, int i5);

    public abstract int size();

    public final int t() {
        return this.f3629e;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract AbstractC0320f u(int i3, int i4);

    public final String w(Charset charset) {
        return size() == 0 ? "" : x(charset);
    }

    public abstract String x(Charset charset);

    public final String y() {
        return w(AbstractC0334u.f3847a);
    }
}

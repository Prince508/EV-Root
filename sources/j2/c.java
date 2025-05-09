package J2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c implements Iterator {

    /* renamed from: j, reason: collision with root package name */
    public static final a f919j = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f920e;

    /* renamed from: f, reason: collision with root package name */
    public int f921f;

    /* renamed from: g, reason: collision with root package name */
    public int f922g;

    /* renamed from: h, reason: collision with root package name */
    public int f923h;

    /* renamed from: i, reason: collision with root package name */
    public int f924i;

    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public a() {
        }
    }

    public c(CharSequence charSequence) {
        C2.k.e(charSequence, "string");
        this.f920e = charSequence;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f921f = 0;
        int i3 = this.f923h;
        int i4 = this.f922g;
        this.f922g = this.f924i + i3;
        return this.f920e.subSequence(i4, i3).toString();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i3;
        int i4;
        int i5 = this.f921f;
        if (i5 != 0) {
            return i5 == 1;
        }
        if (this.f924i < 0) {
            this.f921f = 2;
            return false;
        }
        int length = this.f920e.length();
        int length2 = this.f920e.length();
        for (int i6 = this.f922g; i6 < length2; i6++) {
            char charAt = this.f920e.charAt(i6);
            if (charAt == '\n' || charAt == '\r') {
                i3 = (charAt == '\r' && (i4 = i6 + 1) < this.f920e.length() && this.f920e.charAt(i4) == '\n') ? 2 : 1;
                length = i6;
                this.f921f = 1;
                this.f924i = i3;
                this.f923h = length;
                return true;
            }
        }
        i3 = -1;
        this.f921f = 1;
        this.f924i = i3;
        this.f923h = length;
        return true;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

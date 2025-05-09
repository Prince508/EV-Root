package w0;

import J2.o;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k implements Comparable {

    /* renamed from: j, reason: collision with root package name */
    public static final a f9940j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final k f9941k = new k(0, 0, 0, "");

    /* renamed from: l, reason: collision with root package name */
    public static final k f9942l = new k(0, 1, 0, "");

    /* renamed from: m, reason: collision with root package name */
    public static final k f9943m;

    /* renamed from: n, reason: collision with root package name */
    public static final k f9944n;

    /* renamed from: e, reason: collision with root package name */
    public final int f9945e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9946f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9947g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9948h;

    /* renamed from: i, reason: collision with root package name */
    public final q2.d f9949i;

    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public final k a() {
            return k.f9942l;
        }

        public final k b(String str) {
            String group;
            if (str != null && !o.y(str)) {
                Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
                if (matcher.matches() && (group = matcher.group(1)) != null) {
                    int parseInt = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    if (group2 != null) {
                        int parseInt2 = Integer.parseInt(group2);
                        String group3 = matcher.group(3);
                        if (group3 != null) {
                            int parseInt3 = Integer.parseInt(group3);
                            String group4 = matcher.group(4) != null ? matcher.group(4) : "";
                            C2.k.d(group4, "description");
                            return new k(parseInt, parseInt2, parseInt3, group4, null);
                        }
                    }
                }
            }
            return null;
        }

        public a() {
        }
    }

    public static final class b extends C2.l implements B2.a {
        public b() {
            super(0);
        }

        @Override // B2.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BigInteger b() {
            return BigInteger.valueOf(k.this.h()).shiftLeft(32).or(BigInteger.valueOf(k.this.i())).shiftLeft(32).or(BigInteger.valueOf(k.this.j()));
        }
    }

    static {
        k kVar = new k(1, 0, 0, "");
        f9943m = kVar;
        f9944n = kVar;
    }

    public /* synthetic */ k(int i3, int i4, int i5, String str, C2.g gVar) {
        this(i3, i4, i5, str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f9945e == kVar.f9945e && this.f9946f == kVar.f9946f && this.f9947g == kVar.f9947g;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        C2.k.e(kVar, "other");
        return g().compareTo(kVar.g());
    }

    public final BigInteger g() {
        Object value = this.f9949i.getValue();
        C2.k.d(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public final int h() {
        return this.f9945e;
    }

    public int hashCode() {
        return ((((527 + this.f9945e) * 31) + this.f9946f) * 31) + this.f9947g;
    }

    public final int i() {
        return this.f9946f;
    }

    public final int j() {
        return this.f9947g;
    }

    public String toString() {
        String str;
        if (o.y(this.f9948h)) {
            str = "";
        } else {
            str = '-' + this.f9948h;
        }
        return this.f9945e + '.' + this.f9946f + '.' + this.f9947g + str;
    }

    public k(int i3, int i4, int i5, String str) {
        this.f9945e = i3;
        this.f9946f = i4;
        this.f9947g = i5;
        this.f9948h = str;
        this.f9949i = q2.e.a(new b());
    }
}

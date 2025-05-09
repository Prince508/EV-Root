package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l0;
import j.AbstractC0515e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331q {

    /* renamed from: d, reason: collision with root package name */
    public static final C0331q f3761d = new C0331q(true);

    /* renamed from: a, reason: collision with root package name */
    public final b0 f3762a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3763b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3764c;

    /* renamed from: androidx.datastore.preferences.protobuf.q$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3765a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f3766b;

        static {
            int[] iArr = new int[l0.b.values().length];
            f3766b = iArr;
            try {
                iArr[l0.b.f3717g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3766b[l0.b.f3718h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3766b[l0.b.f3719i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3766b[l0.b.f3720j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3766b[l0.b.f3721k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3766b[l0.b.f3722l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3766b[l0.b.f3723m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3766b[l0.b.f3724n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3766b[l0.b.f3726p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3766b[l0.b.f3727q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3766b[l0.b.f3725o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3766b[l0.b.f3728r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3766b[l0.b.f3729s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3766b[l0.b.f3731u.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3766b[l0.b.f3732v.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3766b[l0.b.f3733w.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3766b[l0.b.f3734x.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3766b[l0.b.f3730t.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[l0.c.values().length];
            f3765a = iArr2;
            try {
                iArr2[l0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f3765a[l0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f3765a[l0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f3765a[l0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f3765a[l0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f3765a[l0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f3765a[l0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f3765a[l0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f3765a[l0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.q$b */
    public interface b extends Comparable {
        boolean a();

        l0.b b();

        int d();

        boolean e();
    }

    public C0331q() {
        this.f3762a = b0.q(16);
    }

    public static int b(l0.b bVar, int i3, Object obj) {
        int P3 = AbstractC0323i.P(i3);
        if (bVar == l0.b.f3726p) {
            P3 *= 2;
        }
        return P3 + c(bVar, obj);
    }

    public static int c(l0.b bVar, Object obj) {
        switch (a.f3766b[bVar.ordinal()]) {
            case 1:
                return AbstractC0323i.i(((Double) obj).doubleValue());
            case 2:
                return AbstractC0323i.q(((Float) obj).floatValue());
            case 3:
                return AbstractC0323i.x(((Long) obj).longValue());
            case 4:
                return AbstractC0323i.T(((Long) obj).longValue());
            case 5:
                return AbstractC0323i.v(((Integer) obj).intValue());
            case 6:
                return AbstractC0323i.o(((Long) obj).longValue());
            case 7:
                return AbstractC0323i.m(((Integer) obj).intValue());
            case 8:
                return AbstractC0323i.d(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC0323i.s((J) obj);
            case 10:
                return AbstractC0323i.A((J) obj);
            case 11:
                return obj instanceof AbstractC0320f ? AbstractC0323i.g((AbstractC0320f) obj) : AbstractC0323i.O((String) obj);
            case 12:
                return obj instanceof AbstractC0320f ? AbstractC0323i.g((AbstractC0320f) obj) : AbstractC0323i.e((byte[]) obj);
            case 13:
                return AbstractC0323i.R(((Integer) obj).intValue());
            case 14:
                return AbstractC0323i.G(((Integer) obj).intValue());
            case 15:
                return AbstractC0323i.I(((Long) obj).longValue());
            case 16:
                return AbstractC0323i.K(((Integer) obj).intValue());
            case 17:
                return AbstractC0323i.M(((Long) obj).longValue());
            case 18:
                return AbstractC0323i.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        l0.b b3 = bVar.b();
        int d3 = bVar.d();
        if (!bVar.a()) {
            return b(b3, d3, obj);
        }
        int i3 = 0;
        if (bVar.e()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i3 += c(b3, it.next());
            }
            return AbstractC0323i.P(d3) + i3 + AbstractC0323i.E(i3);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i3 += b(b3, d3, it2.next());
        }
        return i3;
    }

    public static int i(l0.b bVar, boolean z3) {
        if (z3) {
            return 2;
        }
        return bVar.f();
    }

    public static boolean l(Map.Entry entry) {
        AbstractC0515e.a(entry.getKey());
        throw null;
    }

    public static boolean m(l0.b bVar, Object obj) {
        AbstractC0334u.a(obj);
        switch (a.f3765a[bVar.c().ordinal()]) {
            case 7:
                if ((obj instanceof AbstractC0320f) || (obj instanceof byte[])) {
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                }
                break;
            case 9:
                if (!(obj instanceof J)) {
                }
                break;
        }
        return false;
    }

    public static C0331q r() {
        return new C0331q();
    }

    public static void u(AbstractC0323i abstractC0323i, l0.b bVar, int i3, Object obj) {
        if (bVar == l0.b.f3726p) {
            abstractC0323i.r0(i3, (J) obj);
        } else {
            abstractC0323i.N0(i3, i(bVar, false));
            v(abstractC0323i, bVar, obj);
        }
    }

    public static void v(AbstractC0323i abstractC0323i, l0.b bVar, Object obj) {
        switch (a.f3766b[bVar.ordinal()]) {
            case 1:
                abstractC0323i.i0(((Double) obj).doubleValue());
                break;
            case 2:
                abstractC0323i.q0(((Float) obj).floatValue());
                break;
            case 3:
                abstractC0323i.y0(((Long) obj).longValue());
                break;
            case 4:
                abstractC0323i.R0(((Long) obj).longValue());
                break;
            case 5:
                abstractC0323i.w0(((Integer) obj).intValue());
                break;
            case 6:
                abstractC0323i.o0(((Long) obj).longValue());
                break;
            case 7:
                abstractC0323i.m0(((Integer) obj).intValue());
                break;
            case 8:
                abstractC0323i.c0(((Boolean) obj).booleanValue());
                break;
            case 9:
                abstractC0323i.t0((J) obj);
                break;
            case 10:
                abstractC0323i.A0((J) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC0320f)) {
                    abstractC0323i.M0((String) obj);
                    break;
                } else {
                    abstractC0323i.g0((AbstractC0320f) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof AbstractC0320f)) {
                    abstractC0323i.d0((byte[]) obj);
                    break;
                } else {
                    abstractC0323i.g0((AbstractC0320f) obj);
                    break;
                }
            case 13:
                abstractC0323i.P0(((Integer) obj).intValue());
                break;
            case 14:
                abstractC0323i.E0(((Integer) obj).intValue());
                break;
            case 15:
                abstractC0323i.G0(((Long) obj).longValue());
                break;
            case 16:
                abstractC0323i.I0(((Integer) obj).intValue());
                break;
            case 17:
                abstractC0323i.K0(((Long) obj).longValue());
                break;
            case 18:
                abstractC0323i.k0(((Integer) obj).intValue());
                break;
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0331q clone() {
        C0331q r3 = r();
        for (int i3 = 0; i3 < this.f3762a.k(); i3++) {
            Map.Entry j3 = this.f3762a.j(i3);
            AbstractC0515e.a(j3.getKey());
            r3.s(null, j3.getValue());
        }
        for (Map.Entry entry : this.f3762a.m()) {
            AbstractC0515e.a(entry.getKey());
            r3.s(null, entry.getValue());
        }
        r3.f3764c = this.f3764c;
        return r3;
    }

    public Iterator e() {
        return this.f3764c ? new C0337x(this.f3762a.h().iterator()) : this.f3762a.h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0331q) {
            return this.f3762a.equals(((C0331q) obj).f3762a);
        }
        return false;
    }

    public int f() {
        int i3 = 0;
        for (int i4 = 0; i4 < this.f3762a.k(); i4++) {
            i3 += g(this.f3762a.j(i4));
        }
        Iterator it = this.f3762a.m().iterator();
        while (it.hasNext()) {
            i3 += g((Map.Entry) it.next());
        }
        return i3;
    }

    public final int g(Map.Entry entry) {
        AbstractC0515e.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public int h() {
        int i3 = 0;
        for (int i4 = 0; i4 < this.f3762a.k(); i4++) {
            Map.Entry j3 = this.f3762a.j(i4);
            AbstractC0515e.a(j3.getKey());
            i3 += d(null, j3.getValue());
        }
        for (Map.Entry entry : this.f3762a.m()) {
            AbstractC0515e.a(entry.getKey());
            i3 += d(null, entry.getValue());
        }
        return i3;
    }

    public int hashCode() {
        return this.f3762a.hashCode();
    }

    public boolean j() {
        return this.f3762a.isEmpty();
    }

    public boolean k() {
        for (int i3 = 0; i3 < this.f3762a.k(); i3++) {
            if (!l(this.f3762a.j(i3))) {
                return false;
            }
        }
        Iterator it = this.f3762a.m().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return this.f3764c ? new C0337x(this.f3762a.entrySet().iterator()) : this.f3762a.entrySet().iterator();
    }

    public void o() {
        if (this.f3763b) {
            return;
        }
        this.f3762a.p();
        this.f3763b = true;
    }

    public void p(C0331q c0331q) {
        for (int i3 = 0; i3 < c0331q.f3762a.k(); i3++) {
            q(c0331q.f3762a.j(i3));
        }
        Iterator it = c0331q.f3762a.m().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public final void q(Map.Entry entry) {
        AbstractC0515e.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public void s(b bVar, Object obj) {
        if (!bVar.a()) {
            t(bVar.b(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar.b(), it.next());
            }
            obj = arrayList;
        }
        this.f3762a.r(bVar, obj);
    }

    public final void t(l0.b bVar, Object obj) {
        if (!m(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public C0331q(boolean z3) {
        this(b0.q(0));
        o();
    }

    public C0331q(b0 b0Var) {
        this.f3762a = b0Var;
        o();
    }
}

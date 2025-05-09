package t;

import java.util.HashSet;
import java.util.Iterator;
import s.i;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public final e f9319b;

    /* renamed from: c, reason: collision with root package name */
    public final b f9320c;

    /* renamed from: d, reason: collision with root package name */
    public d f9321d;

    /* renamed from: g, reason: collision with root package name */
    public s.i f9324g;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f9318a = null;

    /* renamed from: e, reason: collision with root package name */
    public int f9322e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f9323f = -1;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9325a;

        static {
            int[] iArr = new int[b.values().length];
            f9325a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9325a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9325a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9325a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9325a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9325a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9325a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9325a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9325a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f9319b = eVar;
        this.f9320c = bVar;
    }

    public boolean a(d dVar, int i3) {
        return b(dVar, i3, -1, false);
    }

    public boolean b(d dVar, int i3, int i4, boolean z3) {
        if (dVar == null) {
            l();
            return true;
        }
        if (!z3 && !k(dVar)) {
            return false;
        }
        this.f9321d = dVar;
        if (dVar.f9318a == null) {
            dVar.f9318a = new HashSet();
        }
        this.f9321d.f9318a.add(this);
        if (i3 > 0) {
            this.f9322e = i3;
        } else {
            this.f9322e = 0;
        }
        this.f9323f = i4;
        return true;
    }

    public int c() {
        d dVar;
        if (this.f9319b.O() == 8) {
            return 0;
        }
        return (this.f9323f <= -1 || (dVar = this.f9321d) == null || dVar.f9319b.O() != 8) ? this.f9322e : this.f9323f;
    }

    public final d d() {
        switch (a.f9325a[this.f9320c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f9319b.f9340D;
            case 3:
                return this.f9319b.f9338B;
            case 4:
                return this.f9319b.f9341E;
            case 5:
                return this.f9319b.f9339C;
            default:
                throw new AssertionError(this.f9320c.name());
        }
    }

    public e e() {
        return this.f9319b;
    }

    public s.i f() {
        return this.f9324g;
    }

    public d g() {
        return this.f9321d;
    }

    public b h() {
        return this.f9320c;
    }

    public boolean i() {
        HashSet hashSet = this.f9318a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).d().j()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f9321d != null;
    }

    public boolean k(d dVar) {
        if (dVar == null) {
            return false;
        }
        b h3 = dVar.h();
        b bVar = this.f9320c;
        if (h3 == bVar) {
            return bVar != b.BASELINE || (dVar.e().S() && e().S());
        }
        switch (a.f9325a[bVar.ordinal()]) {
            case 1:
                return (h3 == b.BASELINE || h3 == b.CENTER_X || h3 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z3 = h3 == b.LEFT || h3 == b.RIGHT;
                return dVar.e() instanceof h ? z3 || h3 == b.CENTER_X : z3;
            case 4:
            case 5:
                boolean z4 = h3 == b.TOP || h3 == b.BOTTOM;
                return dVar.e() instanceof h ? z4 || h3 == b.CENTER_Y : z4;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f9320c.name());
        }
    }

    public void l() {
        HashSet hashSet;
        d dVar = this.f9321d;
        if (dVar != null && (hashSet = dVar.f9318a) != null) {
            hashSet.remove(this);
        }
        this.f9321d = null;
        this.f9322e = 0;
        this.f9323f = -1;
    }

    public void m(s.c cVar) {
        s.i iVar = this.f9324g;
        if (iVar == null) {
            this.f9324g = new s.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public void n(int i3) {
        if (j()) {
            this.f9323f = i3;
        }
    }

    public String toString() {
        return this.f9319b.r() + ":" + this.f9320c.toString();
    }
}

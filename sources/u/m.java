package u;

import t.d;
import t.e;

/* loaded from: classes.dex */
public abstract class m implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f9587a;

    /* renamed from: b, reason: collision with root package name */
    public t.e f9588b;

    /* renamed from: c, reason: collision with root package name */
    public k f9589c;

    /* renamed from: d, reason: collision with root package name */
    public e.b f9590d;

    /* renamed from: e, reason: collision with root package name */
    public g f9591e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f9592f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9593g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f9594h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f9595i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public b f9596j = b.NONE;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9597a;

        static {
            int[] iArr = new int[d.b.values().length];
            f9597a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9597a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9597a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9597a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9597a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public m(t.e eVar) {
        this.f9588b = eVar;
    }

    @Override // u.d
    public abstract void a(d dVar);

    public final void b(f fVar, f fVar2, int i3) {
        fVar.f9563l.add(fVar2);
        fVar.f9557f = i3;
        fVar2.f9562k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i3, g gVar) {
        fVar.f9563l.add(fVar2);
        fVar.f9563l.add(this.f9591e);
        fVar.f9559h = i3;
        fVar.f9560i = gVar;
        fVar2.f9562k.add(fVar);
        gVar.f9562k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i3, int i4) {
        if (i4 == 0) {
            t.e eVar = this.f9588b;
            int i5 = eVar.f9393p;
            int max = Math.max(eVar.f9391o, i3);
            if (i5 > 0) {
                max = Math.min(i5, i3);
            }
            if (max != i3) {
                return max;
            }
        } else {
            t.e eVar2 = this.f9588b;
            int i6 = eVar2.f9399s;
            int max2 = Math.max(eVar2.f9397r, i3);
            if (i6 > 0) {
                max2 = Math.min(i6, i3);
            }
            if (max2 != i3) {
                return max2;
            }
        }
        return i3;
    }

    public final f h(t.d dVar) {
        t.d dVar2 = dVar.f9321d;
        if (dVar2 == null) {
            return null;
        }
        t.e eVar = dVar2.f9319b;
        int i3 = a.f9597a[dVar2.f9320c.ordinal()];
        if (i3 == 1) {
            return eVar.f9371e.f9594h;
        }
        if (i3 == 2) {
            return eVar.f9371e.f9595i;
        }
        if (i3 == 3) {
            return eVar.f9373f.f9594h;
        }
        if (i3 == 4) {
            return eVar.f9373f.f9584k;
        }
        if (i3 != 5) {
            return null;
        }
        return eVar.f9373f.f9595i;
    }

    public final f i(t.d dVar, int i3) {
        t.d dVar2 = dVar.f9321d;
        if (dVar2 == null) {
            return null;
        }
        t.e eVar = dVar2.f9319b;
        m mVar = i3 == 0 ? eVar.f9371e : eVar.f9373f;
        int i4 = a.f9597a[dVar2.f9320c.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f9595i;
        }
        return mVar.f9594h;
    }

    public long j() {
        if (this.f9591e.f9561j) {
            return r0.f9558g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f9593g;
    }

    public final void l(int i3, int i4) {
        int i5 = this.f9587a;
        if (i5 == 0) {
            this.f9591e.d(g(i4, i3));
            return;
        }
        if (i5 == 1) {
            this.f9591e.d(Math.min(g(this.f9591e.f9573m, i3), i4));
            return;
        }
        if (i5 == 2) {
            t.e G3 = this.f9588b.G();
            if (G3 != null) {
                if ((i3 == 0 ? G3.f9371e : G3.f9373f).f9591e.f9561j) {
                    t.e eVar = this.f9588b;
                    this.f9591e.d(g((int) ((r9.f9558g * (i3 == 0 ? eVar.f9395q : eVar.f9401t)) + 0.5f), i3));
                    return;
                }
                return;
            }
            return;
        }
        if (i5 != 3) {
            return;
        }
        t.e eVar2 = this.f9588b;
        m mVar = eVar2.f9371e;
        e.b bVar = mVar.f9590d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && mVar.f9587a == 3) {
            l lVar = eVar2.f9373f;
            if (lVar.f9590d == bVar2 && lVar.f9587a == 3) {
                return;
            }
        }
        if (i3 == 0) {
            mVar = eVar2.f9373f;
        }
        if (mVar.f9591e.f9561j) {
            float t3 = eVar2.t();
            this.f9591e.d(i3 == 1 ? (int) ((mVar.f9591e.f9558g / t3) + 0.5f) : (int) ((t3 * mVar.f9591e.f9558g) + 0.5f));
        }
    }

    public abstract boolean m();

    public void n(d dVar, t.d dVar2, t.d dVar3, int i3) {
        f h3 = h(dVar2);
        f h4 = h(dVar3);
        if (h3.f9561j && h4.f9561j) {
            int c3 = h3.f9558g + dVar2.c();
            int c4 = h4.f9558g - dVar3.c();
            int i4 = c4 - c3;
            if (!this.f9591e.f9561j && this.f9590d == e.b.MATCH_CONSTRAINT) {
                l(i3, i4);
            }
            g gVar = this.f9591e;
            if (gVar.f9561j) {
                if (gVar.f9558g == i4) {
                    this.f9594h.d(c3);
                    this.f9595i.d(c4);
                    return;
                }
                t.e eVar = this.f9588b;
                float w3 = i3 == 0 ? eVar.w() : eVar.K();
                if (h3 == h4) {
                    c3 = h3.f9558g;
                    c4 = h4.f9558g;
                    w3 = 0.5f;
                }
                this.f9594h.d((int) (c3 + 0.5f + (((c4 - c3) - this.f9591e.f9558g) * w3)));
                this.f9595i.d(this.f9594h.f9558g + this.f9591e.f9558g);
            }
        }
    }

    public void o(d dVar) {
    }

    public void p(d dVar) {
    }
}

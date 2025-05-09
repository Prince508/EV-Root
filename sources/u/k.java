package u;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class k {

    /* renamed from: h, reason: collision with root package name */
    public static int f9576h;

    /* renamed from: c, reason: collision with root package name */
    public m f9579c;

    /* renamed from: d, reason: collision with root package name */
    public m f9580d;

    /* renamed from: f, reason: collision with root package name */
    public int f9582f;

    /* renamed from: g, reason: collision with root package name */
    public int f9583g;

    /* renamed from: a, reason: collision with root package name */
    public int f9577a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9578b = false;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f9581e = new ArrayList();

    public k(m mVar, int i3) {
        this.f9579c = null;
        this.f9580d = null;
        int i4 = f9576h;
        this.f9582f = i4;
        f9576h = i4 + 1;
        this.f9579c = mVar;
        this.f9580d = mVar;
        this.f9583g = i3;
    }

    public void a(m mVar) {
        this.f9581e.add(mVar);
        this.f9580d = mVar;
    }

    public long b(t.f fVar, int i3) {
        long j3;
        int i4;
        m mVar = this.f9579c;
        if (mVar instanceof c) {
            if (((c) mVar).f9592f != i3) {
                return 0L;
            }
        } else if (i3 == 0) {
            if (!(mVar instanceof j)) {
                return 0L;
            }
        } else if (!(mVar instanceof l)) {
            return 0L;
        }
        f fVar2 = (i3 == 0 ? fVar.f9371e : fVar.f9373f).f9594h;
        f fVar3 = (i3 == 0 ? fVar.f9371e : fVar.f9373f).f9595i;
        boolean contains = mVar.f9594h.f9563l.contains(fVar2);
        boolean contains2 = this.f9579c.f9595i.f9563l.contains(fVar3);
        long j4 = this.f9579c.j();
        if (contains && contains2) {
            long d3 = d(this.f9579c.f9594h, 0L);
            long c3 = c(this.f9579c.f9595i, 0L);
            long j5 = d3 - j4;
            m mVar2 = this.f9579c;
            int i5 = mVar2.f9595i.f9557f;
            if (j5 >= (-i5)) {
                j5 += i5;
            }
            int i6 = mVar2.f9594h.f9557f;
            long j6 = ((-c3) - j4) - i6;
            if (j6 >= i6) {
                j6 -= i6;
            }
            float o3 = mVar2.f9588b.o(i3);
            float f3 = o3 > 0.0f ? (long) ((j6 / o3) + (j5 / (1.0f - o3))) : 0L;
            long j7 = ((long) ((f3 * o3) + 0.5f)) + j4 + ((long) ((f3 * (1.0f - o3)) + 0.5f));
            j3 = r12.f9594h.f9557f + j7;
            i4 = this.f9579c.f9595i.f9557f;
        } else {
            if (contains) {
                return Math.max(d(this.f9579c.f9594h, r12.f9557f), this.f9579c.f9594h.f9557f + j4);
            }
            if (contains2) {
                return Math.max(-c(this.f9579c.f9595i, r12.f9557f), (-this.f9579c.f9595i.f9557f) + j4);
            }
            j3 = r12.f9594h.f9557f + this.f9579c.j();
            i4 = this.f9579c.f9595i.f9557f;
        }
        return j3 - i4;
    }

    public final long c(f fVar, long j3) {
        m mVar = fVar.f9555d;
        if (mVar instanceof i) {
            return j3;
        }
        int size = fVar.f9562k.size();
        long j4 = j3;
        for (int i3 = 0; i3 < size; i3++) {
            d dVar = (d) fVar.f9562k.get(i3);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f9555d != mVar) {
                    j4 = Math.min(j4, c(fVar2, fVar2.f9557f + j3));
                }
            }
        }
        if (fVar != mVar.f9595i) {
            return j4;
        }
        long j5 = j3 - mVar.j();
        return Math.min(Math.min(j4, c(mVar.f9594h, j5)), j5 - mVar.f9594h.f9557f);
    }

    public final long d(f fVar, long j3) {
        m mVar = fVar.f9555d;
        if (mVar instanceof i) {
            return j3;
        }
        int size = fVar.f9562k.size();
        long j4 = j3;
        for (int i3 = 0; i3 < size; i3++) {
            d dVar = (d) fVar.f9562k.get(i3);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f9555d != mVar) {
                    j4 = Math.max(j4, d(fVar2, fVar2.f9557f + j3));
                }
            }
        }
        if (fVar != mVar.f9594h) {
            return j4;
        }
        long j5 = j3 + mVar.j();
        return Math.max(Math.max(j4, d(mVar.f9595i, j5)), j5 - mVar.f9595i.f9557f);
    }
}

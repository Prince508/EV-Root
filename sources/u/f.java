package u;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public m f9555d;

    /* renamed from: f, reason: collision with root package name */
    public int f9557f;

    /* renamed from: g, reason: collision with root package name */
    public int f9558g;

    /* renamed from: a, reason: collision with root package name */
    public d f9552a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9553b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9554c = false;

    /* renamed from: e, reason: collision with root package name */
    public a f9556e = a.UNKNOWN;

    /* renamed from: h, reason: collision with root package name */
    public int f9559h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f9560i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9561j = false;

    /* renamed from: k, reason: collision with root package name */
    public List f9562k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public List f9563l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(m mVar) {
        this.f9555d = mVar;
    }

    @Override // u.d
    public void a(d dVar) {
        Iterator it = this.f9563l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f9561j) {
                return;
            }
        }
        this.f9554c = true;
        d dVar2 = this.f9552a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f9553b) {
            this.f9555d.a(this);
            return;
        }
        f fVar = null;
        int i3 = 0;
        for (f fVar2 : this.f9563l) {
            if (!(fVar2 instanceof g)) {
                i3++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i3 == 1 && fVar.f9561j) {
            g gVar = this.f9560i;
            if (gVar != null) {
                if (!gVar.f9561j) {
                    return;
                } else {
                    this.f9557f = this.f9559h * gVar.f9558g;
                }
            }
            d(fVar.f9558g + this.f9557f);
        }
        d dVar3 = this.f9552a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f9562k.add(dVar);
        if (this.f9561j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f9563l.clear();
        this.f9562k.clear();
        this.f9561j = false;
        this.f9558g = 0;
        this.f9554c = false;
        this.f9553b = false;
    }

    public void d(int i3) {
        if (this.f9561j) {
            return;
        }
        this.f9561j = true;
        this.f9558g = i3;
        for (d dVar : this.f9562k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9555d.f9588b.r());
        sb.append(":");
        sb.append(this.f9556e);
        sb.append("(");
        sb.append(this.f9561j ? Integer.valueOf(this.f9558g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f9563l.size());
        sb.append(":d=");
        sb.append(this.f9562k.size());
        sb.append(">");
        return sb.toString();
    }
}

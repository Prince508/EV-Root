package com.google.android.material.carousel;

import f1.AbstractC0474a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f5173a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5174b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5175c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5176d;

    /* renamed from: com.google.android.material.carousel.b$b, reason: collision with other inner class name */
    public static final class C0106b {

        /* renamed from: a, reason: collision with root package name */
        public final float f5177a;

        /* renamed from: b, reason: collision with root package name */
        public final float f5178b;

        /* renamed from: d, reason: collision with root package name */
        public c f5180d;

        /* renamed from: e, reason: collision with root package name */
        public c f5181e;

        /* renamed from: c, reason: collision with root package name */
        public final List f5179c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public int f5182f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f5183g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f5184h = 0.0f;

        /* renamed from: i, reason: collision with root package name */
        public int f5185i = -1;

        public C0106b(float f3, float f4) {
            this.f5177a = f3;
            this.f5178b = f4;
        }

        public static float j(float f3, float f4, int i3, int i4) {
            return (f3 - (i3 * f4)) + (i4 * f4);
        }

        public C0106b a(float f3, float f4, float f5) {
            return d(f3, f4, f5, false, true);
        }

        public C0106b b(float f3, float f4, float f5) {
            return c(f3, f4, f5, false);
        }

        public C0106b c(float f3, float f4, float f5, boolean z3) {
            return d(f3, f4, f5, z3, false);
        }

        public C0106b d(float f3, float f4, float f5, boolean z3, boolean z4) {
            float f6;
            float f7 = f5 / 2.0f;
            float f8 = f3 - f7;
            float f9 = f7 + f3;
            float f10 = this.f5178b;
            if (f9 > f10) {
                f6 = Math.abs(f9 - Math.max(f9 - f5, f10));
            } else {
                f6 = 0.0f;
                if (f8 < 0.0f) {
                    f6 = Math.abs(f8 - Math.min(f8 + f5, 0.0f));
                }
            }
            return e(f3, f4, f5, z3, z4, f6);
        }

        public C0106b e(float f3, float f4, float f5, boolean z3, boolean z4, float f6) {
            return f(f3, f4, f5, z3, z4, f6, 0.0f, 0.0f);
        }

        public C0106b f(float f3, float f4, float f5, boolean z3, boolean z4, float f6, float f7, float f8) {
            if (f5 <= 0.0f) {
                return this;
            }
            if (z4) {
                if (z3) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i3 = this.f5185i;
                if (i3 != -1 && i3 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f5185i = this.f5179c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f3, f4, f5, z4, f6, f7, f8);
            if (z3) {
                if (this.f5180d == null) {
                    this.f5180d = cVar;
                    this.f5182f = this.f5179c.size();
                }
                if (this.f5183g != -1 && this.f5179c.size() - this.f5183g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f5 != this.f5180d.f5189d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f5181e = cVar;
                this.f5183g = this.f5179c.size();
            } else {
                if (this.f5180d == null && cVar.f5189d < this.f5184h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f5181e != null && cVar.f5189d > this.f5184h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f5184h = cVar.f5189d;
            this.f5179c.add(cVar);
            return this;
        }

        public C0106b g(float f3, float f4, float f5, int i3) {
            return h(f3, f4, f5, i3, false);
        }

        public C0106b h(float f3, float f4, float f5, int i3, boolean z3) {
            if (i3 > 0 && f5 > 0.0f) {
                for (int i4 = 0; i4 < i3; i4++) {
                    c((i4 * f5) + f3, f4, f5, z3);
                }
            }
            return this;
        }

        public b i() {
            if (this.f5180d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < this.f5179c.size(); i3++) {
                c cVar = (c) this.f5179c.get(i3);
                arrayList.add(new c(j(this.f5180d.f5187b, this.f5177a, this.f5182f, i3), cVar.f5187b, cVar.f5188c, cVar.f5189d, cVar.f5190e, cVar.f5191f, cVar.f5192g, cVar.f5193h));
            }
            return new b(this.f5177a, arrayList, this.f5182f, this.f5183g);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final float f5186a;

        /* renamed from: b, reason: collision with root package name */
        public final float f5187b;

        /* renamed from: c, reason: collision with root package name */
        public final float f5188c;

        /* renamed from: d, reason: collision with root package name */
        public final float f5189d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f5190e;

        /* renamed from: f, reason: collision with root package name */
        public final float f5191f;

        /* renamed from: g, reason: collision with root package name */
        public final float f5192g;

        /* renamed from: h, reason: collision with root package name */
        public final float f5193h;

        public c(float f3, float f4, float f5, float f6) {
            this(f3, f4, f5, f6, false, 0.0f, 0.0f, 0.0f);
        }

        public static c a(c cVar, c cVar2, float f3) {
            return new c(AbstractC0474a.a(cVar.f5186a, cVar2.f5186a, f3), AbstractC0474a.a(cVar.f5187b, cVar2.f5187b, f3), AbstractC0474a.a(cVar.f5188c, cVar2.f5188c, f3), AbstractC0474a.a(cVar.f5189d, cVar2.f5189d, f3));
        }

        public c(float f3, float f4, float f5, float f6, boolean z3, float f7, float f8, float f9) {
            this.f5186a = f3;
            this.f5187b = f4;
            this.f5188c = f5;
            this.f5189d = f6;
            this.f5190e = z3;
            this.f5191f = f7;
            this.f5192g = f8;
            this.f5193h = f9;
        }
    }

    public static b m(b bVar, b bVar2, float f3) {
        if (bVar.f() != bVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List g3 = bVar.g();
        List g4 = bVar2.g();
        if (g3.size() != g4.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < bVar.g().size(); i3++) {
            arrayList.add(c.a((c) g3.get(i3), (c) g4.get(i3), f3));
        }
        return new b(bVar.f(), arrayList, AbstractC0474a.c(bVar.b(), bVar2.b(), f3), AbstractC0474a.c(bVar.i(), bVar2.i(), f3));
    }

    public static b n(b bVar, float f3) {
        C0106b c0106b = new C0106b(bVar.f(), f3);
        float f4 = (f3 - bVar.j().f5187b) - (bVar.j().f5189d / 2.0f);
        int size = bVar.g().size() - 1;
        while (size >= 0) {
            c cVar = (c) bVar.g().get(size);
            c0106b.d((cVar.f5189d / 2.0f) + f4, cVar.f5188c, cVar.f5189d, size >= bVar.b() && size <= bVar.i(), cVar.f5190e);
            f4 += cVar.f5189d;
            size--;
        }
        return c0106b.i();
    }

    public c a() {
        return (c) this.f5174b.get(this.f5175c);
    }

    public int b() {
        return this.f5175c;
    }

    public c c() {
        return (c) this.f5174b.get(0);
    }

    public c d() {
        for (int i3 = 0; i3 < this.f5174b.size(); i3++) {
            c cVar = (c) this.f5174b.get(i3);
            if (!cVar.f5190e) {
                return cVar;
            }
        }
        return null;
    }

    public List e() {
        return this.f5174b.subList(this.f5175c, this.f5176d + 1);
    }

    public float f() {
        return this.f5173a;
    }

    public List g() {
        return this.f5174b;
    }

    public c h() {
        return (c) this.f5174b.get(this.f5176d);
    }

    public int i() {
        return this.f5176d;
    }

    public c j() {
        return (c) this.f5174b.get(r0.size() - 1);
    }

    public c k() {
        for (int size = this.f5174b.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f5174b.get(size);
            if (!cVar.f5190e) {
                return cVar;
            }
        }
        return null;
    }

    public int l() {
        Iterator it = this.f5174b.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f5190e) {
                i3++;
            }
        }
        return this.f5174b.size() - i3;
    }

    public b(float f3, List list, int i3, int i4) {
        this.f5173a = f3;
        this.f5174b = Collections.unmodifiableList(list);
        this.f5175c = i3;
        this.f5176d = i4;
    }
}

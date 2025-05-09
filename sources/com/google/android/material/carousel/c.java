package com.google.android.material.carousel;

import com.google.android.material.carousel.b;
import f1.AbstractC0474a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k1.AbstractC0532f;
import k1.InterfaceC0528b;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f5194a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5195b;

    /* renamed from: c, reason: collision with root package name */
    public final List f5196c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f5197d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f5198e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5199f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5200g;

    public c(b bVar, List list, List list2) {
        this.f5194a = bVar;
        this.f5195b = Collections.unmodifiableList(list);
        this.f5196c = Collections.unmodifiableList(list2);
        float f3 = ((b) list.get(list.size() - 1)).c().f5186a - bVar.c().f5186a;
        this.f5199f = f3;
        float f4 = bVar.j().f5186a - ((b) list2.get(list2.size() - 1)).j().f5186a;
        this.f5200g = f4;
        this.f5197d = m(f3, list, true);
        this.f5198e = m(f4, list2, false);
    }

    public static int b(b bVar, float f3) {
        for (int i3 = bVar.i(); i3 < bVar.g().size(); i3++) {
            if (f3 == ((b.c) bVar.g().get(i3)).f5188c) {
                return i3;
            }
        }
        return bVar.g().size() - 1;
    }

    public static int c(b bVar) {
        for (int i3 = 0; i3 < bVar.g().size(); i3++) {
            if (!((b.c) bVar.g().get(i3)).f5190e) {
                return i3;
            }
        }
        return -1;
    }

    public static int d(b bVar, float f3) {
        for (int b3 = bVar.b() - 1; b3 >= 0; b3--) {
            if (f3 == ((b.c) bVar.g().get(b3)).f5188c) {
                return b3;
            }
        }
        return 0;
    }

    public static int e(b bVar) {
        for (int size = bVar.g().size() - 1; size >= 0; size--) {
            if (!((b.c) bVar.g().get(size)).f5190e) {
                return size;
            }
        }
        return -1;
    }

    public static c f(InterfaceC0528b interfaceC0528b, b bVar, float f3, float f4, float f5) {
        return new c(bVar, p(interfaceC0528b, bVar, f3, f4), n(interfaceC0528b, bVar, f3, f5));
    }

    public static float[] m(float f3, List list, boolean z3) {
        int size = list.size();
        float[] fArr = new float[size];
        int i3 = 1;
        while (i3 < size) {
            int i4 = i3 - 1;
            b bVar = (b) list.get(i4);
            b bVar2 = (b) list.get(i3);
            fArr[i3] = i3 == size + (-1) ? 1.0f : fArr[i4] + ((z3 ? bVar2.c().f5186a - bVar.c().f5186a : bVar.j().f5186a - bVar2.j().f5186a) / f3);
            i3++;
        }
        return fArr;
    }

    public static List n(InterfaceC0528b interfaceC0528b, b bVar, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        int e3 = e(bVar);
        float a3 = interfaceC0528b.f() ? interfaceC0528b.a() : interfaceC0528b.d();
        if (!r(interfaceC0528b, bVar) && e3 != -1) {
            int i3 = e3 - bVar.i();
            float f5 = bVar.c().f5187b - (bVar.c().f5189d / 2.0f);
            if (i3 <= 0 && bVar.h().f5191f > 0.0f) {
                arrayList.add(v(bVar, f5 - bVar.h().f5191f, a3));
                return arrayList;
            }
            int i4 = 0;
            float f6 = 0.0f;
            while (i4 < i3) {
                b bVar2 = (b) arrayList.get(arrayList.size() - 1);
                int i5 = e3 - i4;
                float f7 = f6 + ((b.c) bVar.g().get(i5)).f5191f;
                int i6 = i5 + 1;
                b t3 = t(bVar2, e3, i6 < bVar.g().size() ? d(bVar2, ((b.c) bVar.g().get(i6)).f5188c) + 1 : 0, f5 - f7, bVar.b() + i4 + 1, bVar.i() + i4 + 1, a3);
                if (i4 == i3 - 1 && f4 > 0.0f) {
                    t3 = u(t3, f4, a3, false, f3);
                }
                arrayList.add(t3);
                i4++;
                f6 = f7;
            }
        } else if (f4 > 0.0f) {
            arrayList.add(u(bVar, f4, a3, false, f3));
        }
        return arrayList;
    }

    public static float[] o(List list, float f3, float[] fArr) {
        int size = list.size();
        float f4 = fArr[0];
        int i3 = 1;
        while (i3 < size) {
            float f5 = fArr[i3];
            if (f3 <= f5) {
                return new float[]{AbstractC0474a.b(0.0f, 1.0f, f4, f5, f3), i3 - 1, i3};
            }
            i3++;
            f4 = f5;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static List p(InterfaceC0528b interfaceC0528b, b bVar, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        int c3 = c(bVar);
        float a3 = interfaceC0528b.f() ? interfaceC0528b.a() : interfaceC0528b.d();
        if (!q(bVar) && c3 != -1) {
            int b3 = bVar.b() - c3;
            float f5 = bVar.c().f5187b - (bVar.c().f5189d / 2.0f);
            if (b3 <= 0 && bVar.a().f5191f > 0.0f) {
                arrayList.add(v(bVar, f5 + bVar.a().f5191f, a3));
                return arrayList;
            }
            int i3 = 0;
            float f6 = 0.0f;
            while (i3 < b3) {
                b bVar2 = (b) arrayList.get(arrayList.size() - 1);
                int i4 = c3 + i3;
                int size = bVar.g().size() - 1;
                float f7 = f6 + ((b.c) bVar.g().get(i4)).f5191f;
                int i5 = i4 - 1;
                if (i5 >= 0) {
                    size = b(bVar2, ((b.c) bVar.g().get(i5)).f5188c) - 1;
                }
                b t3 = t(bVar2, c3, size, f5 + f7, (bVar.b() - i3) - 1, (bVar.i() - i3) - 1, a3);
                if (i3 == b3 - 1 && f4 > 0.0f) {
                    t3 = u(t3, f4, a3, true, f3);
                }
                arrayList.add(t3);
                i3++;
                f6 = f7;
            }
        } else if (f4 > 0.0f) {
            arrayList.add(u(bVar, f4, a3, true, f3));
        }
        return arrayList;
    }

    public static boolean q(b bVar) {
        return bVar.a().f5187b - (bVar.a().f5189d / 2.0f) >= 0.0f && bVar.a() == bVar.d();
    }

    public static boolean r(InterfaceC0528b interfaceC0528b, b bVar) {
        int d3 = interfaceC0528b.d();
        if (interfaceC0528b.f()) {
            d3 = interfaceC0528b.a();
        }
        return bVar.h().f5187b + (bVar.h().f5189d / 2.0f) <= ((float) d3) && bVar.h() == bVar.k();
    }

    public static b s(List list, float f3, float[] fArr) {
        float[] o3 = o(list, f3, fArr);
        return b.m((b) list.get((int) o3[1]), (b) list.get((int) o3[2]), o3[0]);
    }

    public static b t(b bVar, int i3, int i4, float f3, int i5, int i6, float f4) {
        ArrayList arrayList = new ArrayList(bVar.g());
        arrayList.add(i4, (b.c) arrayList.remove(i3));
        b.C0106b c0106b = new b.C0106b(bVar.f(), f4);
        int i7 = 0;
        while (i7 < arrayList.size()) {
            b.c cVar = (b.c) arrayList.get(i7);
            float f5 = cVar.f5189d;
            c0106b.e(f3 + (f5 / 2.0f), cVar.f5188c, f5, i7 >= i5 && i7 <= i6, cVar.f5190e, cVar.f5191f);
            f3 += cVar.f5189d;
            i7++;
        }
        return c0106b.i();
    }

    public static b u(b bVar, float f3, float f4, boolean z3, float f5) {
        ArrayList arrayList = new ArrayList(bVar.g());
        b.C0106b c0106b = new b.C0106b(bVar.f(), f4);
        float l3 = f3 / bVar.l();
        float f6 = z3 ? f3 : 0.0f;
        int i3 = 0;
        while (i3 < arrayList.size()) {
            b.c cVar = (b.c) arrayList.get(i3);
            if (cVar.f5190e) {
                c0106b.e(cVar.f5187b, cVar.f5188c, cVar.f5189d, false, true, cVar.f5191f);
            } else {
                boolean z4 = i3 >= bVar.b() && i3 <= bVar.i();
                float f7 = cVar.f5189d - l3;
                float b3 = AbstractC0532f.b(f7, bVar.f(), f5);
                float f8 = (f7 / 2.0f) + f6;
                float f9 = f8 - cVar.f5187b;
                c0106b.f(f8, b3, f7, z4, false, cVar.f5191f, z3 ? f9 : 0.0f, z3 ? 0.0f : f9);
                f6 += f7;
            }
            i3++;
        }
        return c0106b.i();
    }

    public static b v(b bVar, float f3, float f4) {
        return t(bVar, 0, 0, f3, bVar.b(), bVar.i(), f4);
    }

    public final b a(List list, float f3, float[] fArr) {
        float[] o3 = o(list, f3, fArr);
        return o3[0] >= 0.5f ? (b) list.get((int) o3[2]) : (b) list.get((int) o3[1]);
    }

    public b g() {
        return this.f5194a;
    }

    public b h() {
        return (b) this.f5196c.get(r0.size() - 1);
    }

    public Map i(int i3, int i4, int i5, boolean z3) {
        float f3 = this.f5194a.f();
        HashMap hashMap = new HashMap();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= i3) {
                break;
            }
            int i8 = z3 ? (i3 - i6) - 1 : i6;
            if (i8 * f3 * (z3 ? -1 : 1) > i5 - this.f5200g || i6 >= i3 - this.f5196c.size()) {
                Integer valueOf = Integer.valueOf(i8);
                List list = this.f5196c;
                hashMap.put(valueOf, (b) list.get(F.a.b(i7, 0, list.size() - 1)));
                i7++;
            }
            i6++;
        }
        int i9 = 0;
        for (int i10 = i3 - 1; i10 >= 0; i10--) {
            int i11 = z3 ? (i3 - i10) - 1 : i10;
            if (i11 * f3 * (z3 ? -1 : 1) < i4 + this.f5199f || i10 < this.f5195b.size()) {
                Integer valueOf2 = Integer.valueOf(i11);
                List list2 = this.f5195b;
                hashMap.put(valueOf2, (b) list2.get(F.a.b(i9, 0, list2.size() - 1)));
                i9++;
            }
        }
        return hashMap;
    }

    public b j(float f3, float f4, float f5) {
        return k(f3, f4, f5, false);
    }

    public b k(float f3, float f4, float f5, boolean z3) {
        float b3;
        List list;
        float[] fArr;
        float f6 = this.f5199f + f4;
        float f7 = f5 - this.f5200g;
        float f8 = l().a().f5192g;
        float f9 = h().h().f5193h;
        if (this.f5199f == f8) {
            f6 += f8;
        }
        if (this.f5200g == f9) {
            f7 -= f9;
        }
        if (f3 < f6) {
            b3 = AbstractC0474a.b(1.0f, 0.0f, f4, f6, f3);
            list = this.f5195b;
            fArr = this.f5197d;
        } else {
            if (f3 <= f7) {
                return this.f5194a;
            }
            b3 = AbstractC0474a.b(0.0f, 1.0f, f7, f5, f3);
            list = this.f5196c;
            fArr = this.f5198e;
        }
        return z3 ? a(list, b3, fArr) : s(list, b3, fArr);
    }

    public b l() {
        return (b) this.f5195b.get(r0.size() - 1);
    }
}

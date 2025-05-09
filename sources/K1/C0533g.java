package k1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: k1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0533g extends AbstractC0532f {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f8143d = {1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f8144e = {1, 0};

    /* renamed from: c, reason: collision with root package name */
    public int f8145c = 0;

    @Override // k1.AbstractC0532f
    public com.google.android.material.carousel.b g(InterfaceC0528b interfaceC0528b, View view) {
        float d3 = interfaceC0528b.d();
        if (interfaceC0528b.f()) {
            d3 = interfaceC0528b.a();
        }
        float f3 = d3;
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        float f4 = ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (interfaceC0528b.f()) {
            f4 = ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f5 = f4;
        float d4 = d() + f5;
        float max = Math.max(c() + f5, d4);
        float min = Math.min(measuredHeight + f5, f3);
        float a3 = F.a.a((measuredHeight / 3.0f) + f5, d4 + f5, max + f5);
        float f6 = (min + a3) / 2.0f;
        int[] iArr = f8143d;
        if (f3 < 2.0f * d4) {
            iArr = new int[]{0};
        }
        int[] iArr2 = f8144e;
        if (interfaceC0528b.c() == 1) {
            iArr = AbstractC0532f.a(iArr);
            iArr2 = AbstractC0532f.a(iArr2);
        }
        int[] iArr3 = iArr2;
        int[] iArr4 = iArr;
        int max2 = (int) Math.max(1.0d, Math.floor(((f3 - (com.google.android.material.carousel.a.i(iArr3) * f6)) - (com.google.android.material.carousel.a.i(iArr4) * max)) / min));
        int ceil = (int) Math.ceil(f3 / min);
        int i3 = (ceil - max2) + 1;
        int[] iArr5 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            iArr5[i4] = ceil - i4;
        }
        C0527a c3 = C0527a.c(f3, a3, d4, max, iArr4, f6, iArr3, min, iArr5);
        this.f8145c = c3.e();
        if (i(c3, interfaceC0528b.b())) {
            c3 = C0527a.c(f3, a3, d4, max, new int[]{c3.f8130c}, f6, new int[]{c3.f8131d}, min, new int[]{c3.f8134g});
        }
        return com.google.android.material.carousel.a.d(view.getContext(), f5, f3, c3, interfaceC0528b.c());
    }

    @Override // k1.AbstractC0532f
    public boolean h(InterfaceC0528b interfaceC0528b, int i3) {
        if (i3 >= this.f8145c || interfaceC0528b.b() < this.f8145c) {
            return i3 >= this.f8145c && interfaceC0528b.b() < this.f8145c;
        }
        return true;
    }

    public boolean i(C0527a c0527a, int i3) {
        int e3 = c0527a.e() - i3;
        boolean z3 = e3 > 0 && (c0527a.f8130c > 0 || c0527a.f8131d > 1);
        while (e3 > 0) {
            int i4 = c0527a.f8130c;
            if (i4 > 0) {
                c0527a.f8130c = i4 - 1;
            } else {
                int i5 = c0527a.f8131d;
                if (i5 > 1) {
                    c0527a.f8131d = i5 - 1;
                }
            }
            e3--;
        }
        return z3;
    }
}

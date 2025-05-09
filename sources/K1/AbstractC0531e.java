package k1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: k1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0531e {

    /* renamed from: a, reason: collision with root package name */
    public final int f8138a;

    /* renamed from: k1.e$a */
    public class a extends AbstractC0531e {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CarouselLayoutManager f8139b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i3, CarouselLayoutManager carouselLayoutManager) {
            super(i3, null);
            this.f8139b = carouselLayoutManager;
        }

        @Override // k1.AbstractC0531e
        public float d(RecyclerView.p pVar) {
            return ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // k1.AbstractC0531e
        public int e() {
            return this.f8139b.b0();
        }

        @Override // k1.AbstractC0531e
        public int f() {
            return e();
        }

        @Override // k1.AbstractC0531e
        public int g() {
            return this.f8139b.i0();
        }

        @Override // k1.AbstractC0531e
        public int h() {
            return this.f8139b.s0() - this.f8139b.j0();
        }

        @Override // k1.AbstractC0531e
        public int i() {
            return j();
        }

        @Override // k1.AbstractC0531e
        public int j() {
            return 0;
        }

        @Override // k1.AbstractC0531e
        public void k(View view, int i3, int i4) {
            int g3 = g();
            this.f8139b.D0(view, g3, i3, g3 + m(view), i4);
        }

        @Override // k1.AbstractC0531e
        public void l(View view, Rect rect, float f3, float f4) {
            view.offsetTopAndBottom((int) (f4 - (rect.top + f3)));
        }

        public int m(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f8139b.X(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }
    }

    /* renamed from: k1.e$b */
    public class b extends AbstractC0531e {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CarouselLayoutManager f8140b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i3, CarouselLayoutManager carouselLayoutManager) {
            super(i3, null);
            this.f8140b = carouselLayoutManager;
        }

        @Override // k1.AbstractC0531e
        public float d(RecyclerView.p pVar) {
            return ((ViewGroup.MarginLayoutParams) pVar).rightMargin + ((ViewGroup.MarginLayoutParams) pVar).leftMargin;
        }

        @Override // k1.AbstractC0531e
        public int e() {
            return this.f8140b.b0() - this.f8140b.h0();
        }

        @Override // k1.AbstractC0531e
        public int f() {
            return this.f8140b.F2() ? g() : h();
        }

        @Override // k1.AbstractC0531e
        public int g() {
            return 0;
        }

        @Override // k1.AbstractC0531e
        public int h() {
            return this.f8140b.s0();
        }

        @Override // k1.AbstractC0531e
        public int i() {
            return this.f8140b.F2() ? h() : g();
        }

        @Override // k1.AbstractC0531e
        public int j() {
            return this.f8140b.k0();
        }

        @Override // k1.AbstractC0531e
        public void k(View view, int i3, int i4) {
            int j3 = j();
            this.f8140b.D0(view, i3, j3, i4, j3 + m(view));
        }

        @Override // k1.AbstractC0531e
        public void l(View view, Rect rect, float f3, float f4) {
            view.offsetLeftAndRight((int) (f4 - (rect.left + f3)));
        }

        public int m(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f8140b.W(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }
    }

    public /* synthetic */ AbstractC0531e(int i3, a aVar) {
        this(i3);
    }

    public static AbstractC0531e a(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    public static AbstractC0531e b(CarouselLayoutManager carouselLayoutManager, int i3) {
        if (i3 == 0) {
            return a(carouselLayoutManager);
        }
        if (i3 == 1) {
            return c(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static AbstractC0531e c(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    public abstract float d(RecyclerView.p pVar);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract void k(View view, int i3, int i4);

    public abstract void l(View view, Rect rect, float f3, float f4);

    public AbstractC0531e(int i3) {
        this.f8138a = i3;
    }
}

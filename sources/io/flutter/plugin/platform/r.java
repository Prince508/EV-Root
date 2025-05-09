package io.flutter.plugin.platform;

import Y1.A;
import Y1.C0298c;
import Y1.K;
import a2.C0313a;
import android.content.Context;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import d2.AbstractC0441a;
import h2.q;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.platform.r;
import io.flutter.view.TextureRegistry;
import j.AbstractC0515e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class r implements o {

    /* renamed from: w, reason: collision with root package name */
    public static Class[] f7710w = {SurfaceView.class};

    /* renamed from: x, reason: collision with root package name */
    public static boolean f7711x = true;

    /* renamed from: y, reason: collision with root package name */
    public static boolean f7712y = true;

    /* renamed from: b, reason: collision with root package name */
    public C0298c f7714b;

    /* renamed from: c, reason: collision with root package name */
    public Context f7715c;

    /* renamed from: d, reason: collision with root package name */
    public A f7716d;

    /* renamed from: e, reason: collision with root package name */
    public TextureRegistry f7717e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.plugin.editing.A f7718f;

    /* renamed from: g, reason: collision with root package name */
    public h2.q f7719g;

    /* renamed from: o, reason: collision with root package name */
    public int f7727o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7728p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7729q = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7733u = false;

    /* renamed from: v, reason: collision with root package name */
    public final q.g f7734v = new a();

    /* renamed from: a, reason: collision with root package name */
    public final m f7713a = new m();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f7721i = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final io.flutter.plugin.platform.a f7720h = new io.flutter.plugin.platform.a();

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f7722j = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f7725m = new SparseArray();

    /* renamed from: r, reason: collision with root package name */
    public final HashSet f7730r = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f7731s = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f7726n = new SparseArray();

    /* renamed from: k, reason: collision with root package name */
    public final SparseArray f7723k = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f7724l = new SparseArray();

    /* renamed from: t, reason: collision with root package name */
    public final K f7732t = K.a();

    public class a implements q.g {
        public a() {
        }

        public static /* synthetic */ void j(a aVar, y yVar, float f3, q.b bVar) {
            r.this.j0(yVar);
            if (r.this.f7715c != null) {
                f3 = r.this.L();
            }
            bVar.a(new q.c(r.this.f0(yVar.d(), f3), r.this.f0(yVar.c(), f3)));
        }

        @Override // h2.q.g
        public void a(int i3) {
            if (!r.this.c(i3)) {
                AbstractC0515e.a(r.this.f7723k.get(i3));
                W1.b.b("PlatformViewsController", "Clearing focus on an unknown view with id: " + i3);
                return;
            }
            View e3 = ((y) r.this.f7721i.get(Integer.valueOf(i3))).e();
            if (e3 != null) {
                e3.clearFocus();
                return;
            }
            W1.b.b("PlatformViewsController", "Clearing focus on a null view with id: " + i3);
        }

        @Override // h2.q.g
        public void b(boolean z3) {
            r.this.f7729q = z3;
        }

        @Override // h2.q.g
        public void c(int i3, double d3, double d4) {
            if (r.this.c(i3)) {
                return;
            }
            W1.b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i3);
        }

        @Override // h2.q.g
        public void d(int i3, int i4) {
            if (!r.k0(i4)) {
                throw new IllegalStateException("Trying to set unknown direction value: " + i4 + "(view id: " + i3 + ")");
            }
            if (!r.this.c(i3)) {
                AbstractC0515e.a(r.this.f7723k.get(i3));
                W1.b.b("PlatformViewsController", "Setting direction to an unknown view with id: " + i3);
                return;
            }
            View e3 = ((y) r.this.f7721i.get(Integer.valueOf(i3))).e();
            if (e3 != null) {
                e3.setLayoutDirection(i4);
                return;
            }
            W1.b.b("PlatformViewsController", "Setting direction to a null view with id: " + i3);
        }

        @Override // h2.q.g
        public void e(q.d dVar) {
            r.this.I(19);
            r.this.J(dVar);
            r.this.C(dVar, false);
            r.this.z(null, dVar);
        }

        @Override // h2.q.g
        public void f(q.e eVar, final q.b bVar) {
            int h02 = r.this.h0(eVar.f7356b);
            int h03 = r.this.h0(eVar.f7357c);
            int i3 = eVar.f7355a;
            if (r.this.c(i3)) {
                final float L3 = r.this.L();
                final y yVar = (y) r.this.f7721i.get(Integer.valueOf(i3));
                r.this.P(yVar);
                yVar.i(h02, h03, new Runnable() { // from class: io.flutter.plugin.platform.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.j(r.a.this, yVar, L3, bVar);
                    }
                });
                return;
            }
            AbstractC0515e.a(r.this.f7723k.get(i3));
            W1.b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i3);
        }

        @Override // h2.q.g
        public void g(q.f fVar) {
            int i3 = fVar.f7358a;
            float f3 = r.this.f7715c.getResources().getDisplayMetrics().density;
            if (r.this.c(i3)) {
                ((y) r.this.f7721i.get(Integer.valueOf(i3))).b(r.this.g0(f3, fVar, true));
                return;
            }
            AbstractC0515e.a(r.this.f7723k.get(i3));
            W1.b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i3);
        }

        @Override // h2.q.g
        public void h(int i3) {
            AbstractC0515e.a(r.this.f7723k.get(i3));
            W1.b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i3);
        }

        @Override // h2.q.g
        public long i(q.d dVar) {
            r.this.J(dVar);
            int i3 = dVar.f7342a;
            if (r.this.f7726n.get(i3) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i3);
            }
            if (r.this.f7717e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i3);
            }
            if (r.this.f7716d != null) {
                r.this.C(dVar, true);
                throw null;
            }
            throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i3);
        }
    }

    public static MotionEvent.PointerCoords Z(Object obj, float f3) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d3 = f3;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d3);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d3);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d3);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d3);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d3);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d3);
        return pointerCoords;
    }

    public static List a0(Object obj, float f3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(Z(it.next(), f3));
        }
        return arrayList;
    }

    public static MotionEvent.PointerProperties b0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    public static List c0(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(b0(it.next()));
        }
        return arrayList;
    }

    public static void i0(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    public static boolean k0(int i3) {
        return i3 == 0 || i3 == 1;
    }

    public FlutterOverlaySurface A() {
        return B(new b(this.f7716d.getContext(), this.f7716d.getWidth(), this.f7716d.getHeight(), this.f7720h));
    }

    public FlutterOverlaySurface B(b bVar) {
        int i3 = this.f7727o;
        this.f7727o = i3 + 1;
        this.f7725m.put(i3, bVar);
        return new FlutterOverlaySurface(i3, bVar.getSurface());
    }

    public j C(q.d dVar, boolean z3) {
        this.f7713a.a(dVar.f7343b);
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f7343b);
    }

    public void D() {
        for (int i3 = 0; i3 < this.f7725m.size(); i3++) {
            b bVar = (b) this.f7725m.valueAt(i3);
            bVar.c();
            bVar.g();
        }
    }

    public void E() {
        h2.q qVar = this.f7719g;
        if (qVar != null) {
            qVar.d(null);
        }
        D();
        this.f7719g = null;
        this.f7715c = null;
        this.f7717e = null;
    }

    public void F() {
        for (int i3 = 0; i3 < this.f7726n.size(); i3++) {
            this.f7716d.removeView((n) this.f7726n.valueAt(i3));
        }
        for (int i4 = 0; i4 < this.f7724l.size(); i4++) {
            this.f7716d.removeView((AbstractC0441a) this.f7724l.valueAt(i4));
        }
        D();
        d0();
        this.f7716d = null;
        this.f7728p = false;
        if (this.f7723k.size() <= 0) {
            return;
        }
        AbstractC0515e.a(this.f7723k.valueAt(0));
        throw null;
    }

    public void G() {
        this.f7718f = null;
    }

    public final void H() {
        while (this.f7723k.size() > 0) {
            this.f7734v.h(this.f7723k.keyAt(0));
        }
    }

    public final void I(int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= i3) {
            return;
        }
        throw new IllegalStateException("Trying to use platform views with API " + i4 + ", required API level is: " + i3);
    }

    public final void J(q.d dVar) {
        if (k0(dVar.f7348g)) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f7348g + "(view id: " + dVar.f7342a + ")");
    }

    public final void K(boolean z3) {
        for (int i3 = 0; i3 < this.f7725m.size(); i3++) {
            int keyAt = this.f7725m.keyAt(i3);
            b bVar = (b) this.f7725m.valueAt(i3);
            if (this.f7730r.contains(Integer.valueOf(keyAt))) {
                this.f7716d.m(bVar);
                z3 &= bVar.e();
            } else {
                if (!this.f7728p) {
                    bVar.c();
                }
                bVar.setVisibility(8);
                this.f7716d.removeView(bVar);
            }
        }
        for (int i4 = 0; i4 < this.f7724l.size(); i4++) {
            int keyAt2 = this.f7724l.keyAt(i4);
            View view = (View) this.f7724l.get(keyAt2);
            if (!this.f7731s.contains(Integer.valueOf(keyAt2)) || (!z3 && this.f7729q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public final float L() {
        return this.f7715c.getResources().getDisplayMetrics().density;
    }

    public l M() {
        return this.f7713a;
    }

    public void N(int i3) {
        AbstractC0515e.a(this.f7723k.get(i3));
        throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
    }

    public final void O() {
        if (!this.f7729q || this.f7728p) {
            return;
        }
        this.f7716d.p();
        this.f7728p = true;
    }

    public final void P(y yVar) {
        io.flutter.plugin.editing.A a3 = this.f7718f;
        if (a3 == null) {
            return;
        }
        a3.s();
        yVar.f();
    }

    public void Q() {
    }

    public void R() {
        this.f7730r.clear();
        this.f7731s.clear();
    }

    public void S() {
        H();
    }

    public void T(int i3, int i4, int i5, int i6, int i7) {
        if (this.f7725m.get(i3) == null) {
            throw new IllegalStateException("The overlay surface (id:" + i3 + ") doesn't exist");
        }
        O();
        View view = (b) this.f7725m.get(i3);
        if (view.getParent() == null) {
            this.f7716d.addView(view);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
        layoutParams.leftMargin = i4;
        layoutParams.topMargin = i5;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        view.bringToFront();
        this.f7730r.add(Integer.valueOf(i3));
    }

    public void U(int i3, int i4, int i5, int i6, int i7, int i8, int i9, FlutterMutatorsStack flutterMutatorsStack) {
        O();
        N(i3);
        AbstractC0441a abstractC0441a = (AbstractC0441a) this.f7724l.get(i3);
        abstractC0441a.a(flutterMutatorsStack, i4, i5, i6, i7);
        abstractC0441a.setVisibility(0);
        abstractC0441a.bringToFront();
        new FrameLayout.LayoutParams(i8, i9);
        AbstractC0515e.a(this.f7723k.get(i3));
        throw null;
    }

    public void V() {
        boolean z3 = false;
        if (this.f7728p && this.f7731s.isEmpty()) {
            this.f7728p = false;
            this.f7716d.z(new Runnable() { // from class: io.flutter.plugin.platform.p
                @Override // java.lang.Runnable
                public final void run() {
                    r.this.K(false);
                }
            });
        } else {
            if (this.f7728p && this.f7716d.k()) {
                z3 = true;
            }
            K(z3);
        }
    }

    public void W() {
        H();
    }

    public void X() {
        Iterator it = this.f7721i.values().iterator();
        while (it.hasNext()) {
            ((y) it.next()).h();
        }
    }

    public void Y(int i3) {
        if (i3 < 40) {
            return;
        }
        Iterator it = this.f7721i.values().iterator();
        while (it.hasNext()) {
            ((y) it.next()).a();
        }
    }

    @Override // io.flutter.plugin.platform.o
    public void a() {
        this.f7720h.b(null);
    }

    @Override // io.flutter.plugin.platform.o
    public void b(io.flutter.view.f fVar) {
        this.f7720h.b(fVar);
    }

    @Override // io.flutter.plugin.platform.o
    public boolean c(int i3) {
        return this.f7721i.containsKey(Integer.valueOf(i3));
    }

    @Override // io.flutter.plugin.platform.o
    public View d(int i3) {
        if (c(i3)) {
            return ((y) this.f7721i.get(Integer.valueOf(i3))).e();
        }
        AbstractC0515e.a(this.f7723k.get(i3));
        return null;
    }

    public final void d0() {
        if (this.f7716d == null) {
            W1.b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i3 = 0; i3 < this.f7725m.size(); i3++) {
            this.f7716d.removeView((View) this.f7725m.valueAt(i3));
        }
        this.f7725m.clear();
    }

    public void e0(boolean z3) {
        this.f7733u = z3;
    }

    public final int f0(double d3, float f3) {
        return (int) Math.round(d3 / f3);
    }

    public MotionEvent g0(float f3, q.f fVar, boolean z3) {
        MotionEvent b3 = this.f7732t.b(K.a.c(fVar.f7373p));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) a0(fVar.f7364g, f3).toArray(new MotionEvent.PointerCoords[fVar.f7362e]);
        if (z3 || b3 == null) {
            return MotionEvent.obtain(fVar.f7359b.longValue(), fVar.f7360c.longValue(), fVar.f7361d, fVar.f7362e, (MotionEvent.PointerProperties[]) c0(fVar.f7363f).toArray(new MotionEvent.PointerProperties[fVar.f7362e]), pointerCoordsArr, fVar.f7365h, fVar.f7366i, fVar.f7367j, fVar.f7368k, fVar.f7369l, fVar.f7370m, fVar.f7371n, fVar.f7372o);
        }
        i0(b3, pointerCoordsArr);
        return b3;
    }

    public final int h0(double d3) {
        return (int) Math.round(d3 * L());
    }

    public final void j0(y yVar) {
        io.flutter.plugin.editing.A a3 = this.f7718f;
        if (a3 == null) {
            return;
        }
        a3.E();
        yVar.g();
    }

    public void u(Context context, TextureRegistry textureRegistry, C0313a c0313a) {
        if (this.f7715c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f7715c = context;
        this.f7717e = textureRegistry;
        h2.q qVar = new h2.q(c0313a);
        this.f7719g = qVar;
        qVar.d(this.f7734v);
    }

    public void v(io.flutter.plugin.editing.A a3) {
        this.f7718f = a3;
    }

    public void w(FlutterRenderer flutterRenderer) {
        this.f7714b = new C0298c(flutterRenderer, true);
    }

    public void x(A a3) {
        this.f7716d = a3;
        for (int i3 = 0; i3 < this.f7726n.size(); i3++) {
            this.f7716d.addView((n) this.f7726n.valueAt(i3));
        }
        for (int i4 = 0; i4 < this.f7724l.size(); i4++) {
            this.f7716d.addView((AbstractC0441a) this.f7724l.valueAt(i4));
        }
        if (this.f7723k.size() <= 0) {
            return;
        }
        AbstractC0515e.a(this.f7723k.valueAt(0));
        throw null;
    }

    public boolean y(View view) {
        if (view == null || !this.f7722j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) this.f7722j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    public final void z(j jVar, q.d dVar) {
        I(19);
        W1.b.e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.f7342a);
    }
}

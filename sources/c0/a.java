package C0;

import C2.g;
import C2.k;
import C2.l;
import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r2.AbstractC0700m;
import w0.h;
import w0.j;
import z0.InterfaceC0785a;
import z0.InterfaceC0787c;
import z0.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0003a f158b = new C0003a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f159c = a.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    public final j f160a;

    /* renamed from: C0.a$a, reason: collision with other inner class name */
    public static final class C0003a {
        public /* synthetic */ C0003a(g gVar) {
            this();
        }

        public final int a(SidecarDeviceState sidecarDeviceState) {
            k.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    k.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                    return ((Integer) invoke).intValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        public final int b(SidecarDeviceState sidecarDeviceState) {
            k.e(sidecarDeviceState, "sidecarDeviceState");
            int a3 = a(sidecarDeviceState);
            if (a3 < 0 || a3 > 4) {
                return 0;
            }
            return a3;
        }

        public final List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            k.e(sidecarWindowLayoutInfo, "info");
            try {
                try {
                    List list = sidecarWindowLayoutInfo.displayFeatures;
                    return list == null ? AbstractC0700m.f() : list;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    return AbstractC0700m.f();
                }
            } catch (NoSuchFieldError unused2) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                k.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) invoke;
            }
        }

        public final void d(SidecarDeviceState sidecarDeviceState, int i3) {
            k.e(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i3;
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } catch (NoSuchFieldError unused2) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i3));
            }
        }

        public C0003a() {
        }
    }

    public static final class b extends l implements B2.l {

        /* renamed from: f, reason: collision with root package name */
        public static final b f161f = new b();

        public b() {
            super(1);
        }

        @Override // B2.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean j(SidecarDisplayFeature sidecarDisplayFeature) {
            k.e(sidecarDisplayFeature, "$this$require");
            boolean z3 = true;
            if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
                z3 = false;
            }
            return Boolean.valueOf(z3);
        }
    }

    public static final class c extends l implements B2.l {

        /* renamed from: f, reason: collision with root package name */
        public static final c f162f = new c();

        public c() {
            super(1);
        }

        @Override // B2.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean j(SidecarDisplayFeature sidecarDisplayFeature) {
            k.e(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
        }
    }

    public static final class d extends l implements B2.l {

        /* renamed from: f, reason: collision with root package name */
        public static final d f163f = new d();

        public d() {
            super(1);
        }

        @Override // B2.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean j(SidecarDisplayFeature sidecarDisplayFeature) {
            k.e(sidecarDisplayFeature, "$this$require");
            boolean z3 = true;
            if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
                z3 = false;
            }
            return Boolean.valueOf(z3);
        }
    }

    public static final class e extends l implements B2.l {

        /* renamed from: f, reason: collision with root package name */
        public static final e f164f = new e();

        public e() {
            super(1);
        }

        @Override // B2.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean j(SidecarDisplayFeature sidecarDisplayFeature) {
            k.e(sidecarDisplayFeature, "$this$require");
            return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
        }
    }

    public a(j jVar) {
        k.e(jVar, "verificationMode");
        this.f160a = jVar;
    }

    public final boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (k.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        C0003a c0003a = f158b;
        return c0003a.b(sidecarDeviceState) == c0003a.b(sidecarDeviceState2);
    }

    public final boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (k.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return k.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public final boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (!b((SidecarDisplayFeature) list.get(i3), (SidecarDisplayFeature) list2.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (k.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        C0003a c0003a = f158b;
        return c(c0003a.c(sidecarWindowLayoutInfo), c0003a.c(sidecarWindowLayoutInfo2));
    }

    public final List e(List list, SidecarDeviceState sidecarDeviceState) {
        k.e(list, "sidecarDisplayFeatures");
        k.e(sidecarDeviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0785a g3 = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g3 != null) {
                arrayList.add(g3);
            }
        }
        return arrayList;
    }

    public final z0.j f(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        k.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new z0.j(AbstractC0700m.f());
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        C0003a c0003a = f158b;
        c0003a.d(sidecarDeviceState2, c0003a.b(sidecarDeviceState));
        return new z0.j(e(c0003a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final InterfaceC0785a g(SidecarDisplayFeature sidecarDisplayFeature, SidecarDeviceState sidecarDeviceState) {
        d.b a3;
        InterfaceC0787c.b bVar;
        k.e(sidecarDisplayFeature, "feature");
        k.e(sidecarDeviceState, "deviceState");
        h.a aVar = h.f9931a;
        String str = f159c;
        k.d(str, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) h.a.b(aVar, sidecarDisplayFeature, str, this.f160a, null, 4, null).c("Type must be either TYPE_FOLD or TYPE_HINGE", b.f161f).c("Feature bounds must not be 0", c.f162f).c("TYPE_FOLD must have 0 area", d.f163f).c("Feature be pinned to either left or top", e.f164f).a();
        if (sidecarDisplayFeature2 == null) {
            return null;
        }
        int type = sidecarDisplayFeature2.getType();
        if (type == 1) {
            a3 = d.b.f10269b.a();
        } else {
            if (type != 2) {
                return null;
            }
            a3 = d.b.f10269b.b();
        }
        int b3 = f158b.b(sidecarDeviceState);
        if (b3 == 0 || b3 == 1) {
            return null;
        }
        if (b3 == 2) {
            bVar = InterfaceC0787c.b.f10263d;
        } else if (b3 == 3) {
            bVar = InterfaceC0787c.b.f10262c;
        } else {
            if (b3 == 4) {
                return null;
            }
            bVar = InterfaceC0787c.b.f10262c;
        }
        Rect rect = sidecarDisplayFeature.getRect();
        k.d(rect, "feature.rect");
        return new z0.d(new w0.b(rect), a3, bVar);
    }

    public /* synthetic */ a(j jVar, int i3, g gVar) {
        this((i3 & 1) != 0 ? j.QUIET : jVar);
    }
}

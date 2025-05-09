package B0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import z0.InterfaceC0787c;
import z0.d;
import z0.j;
import z0.k;
import z0.o;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f63a = new f();

    public final InterfaceC0787c a(k kVar, FoldingFeature foldingFeature) {
        d.b a3;
        InterfaceC0787c.b bVar;
        C2.k.e(kVar, "windowMetrics");
        C2.k.e(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            a3 = d.b.f10269b.a();
        } else {
            if (type != 2) {
                return null;
            }
            a3 = d.b.f10269b.b();
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            bVar = InterfaceC0787c.b.f10262c;
        } else {
            if (state != 2) {
                return null;
            }
            bVar = InterfaceC0787c.b.f10263d;
        }
        Rect bounds = foldingFeature.getBounds();
        C2.k.d(bounds, "oemFeature.bounds");
        if (!d(kVar, new w0.b(bounds))) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        C2.k.d(bounds2, "oemFeature.bounds");
        return new z0.d(new w0.b(bounds2), a3, bVar);
    }

    public final j b(Context context, WindowLayoutInfo windowLayoutInfo) {
        C2.k.e(context, "context");
        C2.k.e(windowLayoutInfo, "info");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            return c(o.f10303b.d(context), windowLayoutInfo);
        }
        if (i3 < 29 || !(context instanceof Activity)) {
            throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        }
        return c(o.f10303b.c((Activity) context), windowLayoutInfo);
    }

    public final j c(k kVar, WindowLayoutInfo windowLayoutInfo) {
        InterfaceC0787c interfaceC0787c;
        C2.k.e(kVar, "windowMetrics");
        C2.k.e(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        C2.k.d(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                f fVar = f63a;
                C2.k.d(foldingFeature, "feature");
                interfaceC0787c = fVar.a(kVar, foldingFeature);
            } else {
                interfaceC0787c = null;
            }
            if (interfaceC0787c != null) {
                arrayList.add(interfaceC0787c);
            }
        }
        return new j(arrayList);
    }

    public final boolean d(k kVar, w0.b bVar) {
        Rect a3 = kVar.a();
        if (bVar.e()) {
            return false;
        }
        if (bVar.d() != a3.width() && bVar.a() != a3.height()) {
            return false;
        }
        if (bVar.d() >= a3.width() || bVar.a() >= a3.height()) {
            return (bVar.d() == a3.width() && bVar.a() == a3.height()) ? false : true;
        }
        return false;
    }
}

package B0;

import C2.k;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes.dex */
public abstract class a implements A0.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0002a f51a = new C0002a(null);

    /* renamed from: B0.a$a, reason: collision with other inner class name */
    public static final class C0002a {
        public /* synthetic */ C0002a(C2.g gVar) {
            this();
        }

        public final A0.a a(WindowLayoutComponent windowLayoutComponent, w0.d dVar) {
            k.e(windowLayoutComponent, "component");
            k.e(dVar, "adapter");
            int a3 = w0.e.f9922a.a();
            return a3 >= 2 ? new e(windowLayoutComponent) : a3 == 1 ? new d(windowLayoutComponent, dVar) : new c();
        }

        public C0002a() {
        }
    }
}

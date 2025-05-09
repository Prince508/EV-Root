package y0;

import C2.k;
import N2.d;
import android.app.Activity;
import java.util.concurrent.Executor;
import x0.C0766a;
import z0.f;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0771a implements f {

    /* renamed from: b, reason: collision with root package name */
    public final f f10183b;

    /* renamed from: c, reason: collision with root package name */
    public final C0766a f10184c;

    public C0771a(f fVar, C0766a c0766a) {
        this.f10183b = fVar;
        this.f10184c = c0766a;
    }

    @Override // z0.f
    public d a(Activity activity) {
        k.e(activity, "activity");
        return this.f10183b.a(activity);
    }

    public final void b(Activity activity, Executor executor, J.a aVar) {
        k.e(activity, "activity");
        k.e(executor, "executor");
        k.e(aVar, "consumer");
        this.f10184c.a(executor, aVar, this.f10183b.a(activity));
    }

    public final void c(J.a aVar) {
        k.e(aVar, "consumer");
        this.f10184c.b(aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0771a(f fVar) {
        this(fVar, new C0766a());
        k.e(fVar, "tracker");
    }
}

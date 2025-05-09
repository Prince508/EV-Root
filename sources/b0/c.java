package B0;

import C2.k;
import android.content.Context;
import java.util.concurrent.Executor;
import r2.AbstractC0700m;
import z0.j;

/* loaded from: classes.dex */
public final class c implements A0.a {
    public static final void d(J.a aVar) {
        k.e(aVar, "$callback");
        aVar.accept(new j(AbstractC0700m.f()));
    }

    @Override // A0.a
    public void a(J.a aVar) {
        k.e(aVar, "callback");
    }

    @Override // A0.a
    public void b(Context context, Executor executor, final J.a aVar) {
        k.e(context, "context");
        k.e(executor, "executor");
        k.e(aVar, "callback");
        executor.execute(new Runnable() { // from class: B0.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(J.a.this);
            }
        });
    }
}

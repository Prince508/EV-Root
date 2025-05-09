package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.u;
import java.util.List;
import q0.C0670a;
import r2.AbstractC0700m;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements q0.b {
    @Override // q0.b
    public List a() {
        return AbstractC0700m.f();
    }

    @Override // q0.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public l b(Context context) {
        C2.k.e(context, "context");
        C0670a e3 = C0670a.e(context);
        C2.k.d(e3, "getInstance(context)");
        if (!e3.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C0348i.a(context);
        u.b bVar = u.f4021m;
        bVar.b(context);
        return bVar.a();
    }
}

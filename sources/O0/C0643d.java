package o0;

import C2.k;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0347h;
import androidx.lifecycle.InterfaceC0349j;
import androidx.lifecycle.l;
import java.util.Iterator;
import java.util.Map;
import n.b;

/* renamed from: o0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643d {

    /* renamed from: f, reason: collision with root package name */
    public static final b f8771f = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public boolean f8773b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f8774c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8775d;

    /* renamed from: a, reason: collision with root package name */
    public final n.b f8772a = new n.b();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8776e = true;

    /* renamed from: o0.d$a */
    public interface a {
    }

    /* renamed from: o0.d$b */
    public static final class b {
        public /* synthetic */ b(C2.g gVar) {
            this();
        }

        public b() {
        }
    }

    /* renamed from: o0.d$c */
    public interface c {
        Bundle a();
    }

    public static final void d(C0643d c0643d, l lVar, AbstractC0347h.a aVar) {
        k.e(c0643d, "this$0");
        k.e(lVar, "<anonymous parameter 0>");
        k.e(aVar, "event");
        if (aVar == AbstractC0347h.a.ON_START) {
            c0643d.f8776e = true;
        } else if (aVar == AbstractC0347h.a.ON_STOP) {
            c0643d.f8776e = false;
        }
    }

    public final Bundle b(String str) {
        k.e(str, "key");
        if (!this.f8775d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f8774c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f8774c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f8774c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f8774c = null;
        return bundle2;
    }

    public final c c(String str) {
        k.e(str, "key");
        Iterator it = this.f8772a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            k.d(entry, "components");
            String str2 = (String) entry.getKey();
            c cVar = (c) entry.getValue();
            if (k.a(str2, str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(AbstractC0347h abstractC0347h) {
        k.e(abstractC0347h, "lifecycle");
        if (this.f8773b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        abstractC0347h.a(new InterfaceC0349j() { // from class: o0.c
            @Override // androidx.lifecycle.InterfaceC0349j
            public final void d(l lVar, AbstractC0347h.a aVar) {
                C0643d.d(C0643d.this, lVar, aVar);
            }
        });
        this.f8773b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f8773b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.f8775d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.f8774c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f8775d = true;
    }

    public final void g(Bundle bundle) {
        k.e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f8774c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b.d l3 = this.f8772a.l();
        k.d(l3, "this.components.iteratorWithAdditions()");
        while (l3.hasNext()) {
            Map.Entry entry = (Map.Entry) l3.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void h(String str, c cVar) {
        k.e(str, "key");
        k.e(cVar, "provider");
        if (((c) this.f8772a.o(str, cVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }
}

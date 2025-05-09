package androidx.lifecycle;

import android.os.Bundle;
import j.AbstractC0515e;
import java.util.Iterator;
import java.util.Map;
import o0.C0643d;

/* loaded from: classes.dex */
public final class A implements C0643d.c {

    /* renamed from: a, reason: collision with root package name */
    public final C0643d f3947a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3948b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f3949c;

    /* renamed from: d, reason: collision with root package name */
    public final q2.d f3950d;

    public static final class a extends C2.l implements B2.a {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ H f3951f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H h3) {
            super(0);
            this.f3951f = h3;
        }

        @Override // B2.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B b() {
            return z.b(this.f3951f);
        }
    }

    public A(C0643d c0643d, H h3) {
        C2.k.e(c0643d, "savedStateRegistry");
        C2.k.e(h3, "viewModelStoreOwner");
        this.f3947a = c0643d;
        this.f3950d = q2.e.a(new a(h3));
    }

    @Override // o0.C0643d.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3949c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = b().d().entrySet().iterator();
        if (!it.hasNext()) {
            this.f3948b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        AbstractC0515e.a(entry.getValue());
        throw null;
    }

    public final B b() {
        return (B) this.f3950d.getValue();
    }

    public final void c() {
        if (this.f3948b) {
            return;
        }
        Bundle b3 = this.f3947a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3949c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (b3 != null) {
            bundle.putAll(b3);
        }
        this.f3949c = bundle;
        this.f3948b = true;
        b();
    }
}

package androidx.lifecycle;

import androidx.lifecycle.AbstractC0347h;
import androidx.lifecycle.C0340a;

/* loaded from: classes.dex */
public class v implements InterfaceC0349j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4033a;

    /* renamed from: b, reason: collision with root package name */
    public final C0340a.C0090a f4034b;

    public v(Object obj) {
        this.f4033a = obj;
        this.f4034b = C0340a.f3968c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC0349j
    public void d(l lVar, AbstractC0347h.a aVar) {
        this.f4034b.a(lVar, aVar, this.f4033a);
    }
}

package p2;

import C2.k;
import android.content.Context;
import e2.InterfaceC0465a;
import i2.InterfaceC0504b;
import i2.i;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661a implements InterfaceC0465a {

    /* renamed from: b, reason: collision with root package name */
    public i f8849b;

    public final void a(InterfaceC0504b interfaceC0504b, Context context) {
        this.f8849b = new i(interfaceC0504b, "PonnamKarthik/fluttertoast");
        C0665e c0665e = new C0665e(context);
        i iVar = this.f8849b;
        if (iVar != null) {
            iVar.e(c0665e);
        }
    }

    @Override // e2.InterfaceC0465a
    public void b(InterfaceC0465a.b bVar) {
        k.e(bVar, "binding");
        InterfaceC0504b b3 = bVar.b();
        k.d(b3, "getBinaryMessenger(...)");
        Context a3 = bVar.a();
        k.d(a3, "getApplicationContext(...)");
        a(b3, a3);
    }

    public final void c() {
        i iVar = this.f8849b;
        if (iVar != null) {
            iVar.e(null);
        }
        this.f8849b = null;
    }

    @Override // e2.InterfaceC0465a
    public void p(InterfaceC0465a.b bVar) {
        k.e(bVar, "p0");
        c();
    }
}

package com.easyvictory.cheto.plugins;

import android.app.Activity;
import e2.InterfaceC0465a;
import i2.i;

/* loaded from: classes.dex */
public class c implements InterfaceC0465a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f4958d = U2.a.a(-17420062650606L);

    /* renamed from: b, reason: collision with root package name */
    public final Activity f4959b;

    /* renamed from: c, reason: collision with root package name */
    public i f4960c;

    public c(Activity activity) {
        this.f4959b = activity;
    }

    @Override // e2.InterfaceC0465a
    public void b(InterfaceC0465a.b bVar) {
        i iVar = new i(bVar.b(), U2.a.a(-17252558926062L));
        this.f4960c = iVar;
        iVar.e(new MethodCallHandlerImpl(this.f4959b));
    }

    @Override // e2.InterfaceC0465a
    public void p(InterfaceC0465a.b bVar) {
        this.f4960c.e(null);
    }
}

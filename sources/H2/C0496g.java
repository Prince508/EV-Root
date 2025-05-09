package h2;

import a2.C0313a;
import b2.InterfaceC0369a;
import i2.i;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0496g {

    /* renamed from: a, reason: collision with root package name */
    public final i2.i f7250a;

    /* renamed from: b, reason: collision with root package name */
    public Map f7251b;

    /* renamed from: c, reason: collision with root package name */
    public final i.c f7252c;

    /* renamed from: h2.g$a */
    public class a implements i.c {
        public a() {
        }

        @Override // i2.i.c
        public void a(i2.h hVar, i.d dVar) {
            C0496g.a(C0496g.this);
        }
    }

    public C0496g(C0313a c0313a) {
        a aVar = new a();
        this.f7252c = aVar;
        i2.i iVar = new i2.i(c0313a, "flutter/deferredcomponent", i2.m.f7514b);
        this.f7250a = iVar;
        iVar.e(aVar);
        W1.a.e().a();
        this.f7251b = new HashMap();
    }

    public static /* synthetic */ InterfaceC0369a a(C0496g c0496g) {
        c0496g.getClass();
        return null;
    }
}

package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l0;

/* loaded from: classes.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    public final a f3546a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3547b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3548c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final l0.b f3549a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f3550b;

        /* renamed from: c, reason: collision with root package name */
        public final l0.b f3551c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f3552d;

        public a(l0.b bVar, Object obj, l0.b bVar2, Object obj2) {
            this.f3549a = bVar;
            this.f3550b = obj;
            this.f3551c = bVar2;
            this.f3552d = obj2;
        }
    }

    public C(l0.b bVar, Object obj, l0.b bVar2, Object obj2) {
        this.f3546a = new a(bVar, obj, bVar2, obj2);
        this.f3547b = obj;
        this.f3548c = obj2;
    }

    public static int b(a aVar, Object obj, Object obj2) {
        return C0331q.b(aVar.f3549a, 1, obj) + C0331q.b(aVar.f3551c, 2, obj2);
    }

    public static C d(l0.b bVar, Object obj, l0.b bVar2, Object obj2) {
        return new C(bVar, obj, bVar2, obj2);
    }

    public static void e(AbstractC0323i abstractC0323i, a aVar, Object obj, Object obj2) {
        C0331q.u(abstractC0323i, aVar.f3549a, 1, obj);
        C0331q.u(abstractC0323i, aVar.f3551c, 2, obj2);
    }

    public int a(int i3, Object obj, Object obj2) {
        return AbstractC0323i.P(i3) + AbstractC0323i.y(b(this.f3546a, obj, obj2));
    }

    public a c() {
        return this.f3546a;
    }
}

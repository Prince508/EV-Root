package androidx.lifecycle;

import androidx.lifecycle.AbstractC0347h;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0343d implements InterfaceC0349j {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0342c f3976a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0349j f3977b;

    /* renamed from: androidx.lifecycle.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3978a;

        static {
            int[] iArr = new int[AbstractC0347h.a.values().length];
            try {
                iArr[AbstractC0347h.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC0347h.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC0347h.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC0347h.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC0347h.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC0347h.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC0347h.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f3978a = iArr;
        }
    }

    public C0343d(InterfaceC0342c interfaceC0342c, InterfaceC0349j interfaceC0349j) {
        C2.k.e(interfaceC0342c, "defaultLifecycleObserver");
        this.f3976a = interfaceC0342c;
        this.f3977b = interfaceC0349j;
    }

    @Override // androidx.lifecycle.InterfaceC0349j
    public void d(l lVar, AbstractC0347h.a aVar) {
        C2.k.e(lVar, "source");
        C2.k.e(aVar, "event");
        switch (a.f3978a[aVar.ordinal()]) {
            case 1:
                this.f3976a.c(lVar);
                break;
            case 2:
                this.f3976a.g(lVar);
                break;
            case 3:
                this.f3976a.a(lVar);
                break;
            case 4:
                this.f3976a.e(lVar);
                break;
            case 5:
                this.f3976a.f(lVar);
                break;
            case 6:
                this.f3976a.b(lVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0349j interfaceC0349j = this.f3977b;
        if (interfaceC0349j != null) {
            interfaceC0349j.d(lVar, aVar);
        }
    }
}

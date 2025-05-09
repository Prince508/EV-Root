package h2;

import a2.C0313a;
import i2.C0503a;
import java.util.Locale;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public b f7263a;

    /* renamed from: b, reason: collision with root package name */
    public b f7264b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7265c;

    /* renamed from: d, reason: collision with root package name */
    public final C0503a f7266d;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7267a;

        static {
            int[] iArr = new int[b.values().length];
            f7267a = iArr;
            try {
                iArr[b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7267a[b.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7267a[b.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7267a[b.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7267a[b.DETACHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public k(C0313a c0313a) {
        this(new C0503a(c0313a, "flutter/lifecycle", i2.n.f7517b));
    }

    public void a() {
        g(this.f7263a, true);
    }

    public void b() {
        g(b.DETACHED, this.f7265c);
    }

    public void c() {
        g(b.INACTIVE, this.f7265c);
    }

    public void d() {
        g(b.PAUSED, this.f7265c);
    }

    public void e() {
        g(b.RESUMED, this.f7265c);
    }

    public void f() {
        g(this.f7263a, false);
    }

    public final void g(b bVar, boolean z3) {
        b bVar2 = this.f7263a;
        if (bVar2 == bVar && z3 == this.f7265c) {
            return;
        }
        if (bVar == null && bVar2 == null) {
            this.f7265c = z3;
            return;
        }
        int i3 = a.f7267a[bVar.ordinal()];
        b bVar3 = i3 != 1 ? (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5) ? bVar : null : z3 ? b.RESUMED : b.INACTIVE;
        this.f7263a = bVar;
        this.f7265c = z3;
        if (bVar3 == this.f7264b) {
            return;
        }
        String str = "AppLifecycleState." + bVar3.name().toLowerCase(Locale.ROOT);
        W1.b.f("LifecycleChannel", "Sending " + str + " message.");
        this.f7266d.c(str);
        this.f7264b = bVar3;
    }

    public k(C0503a c0503a) {
        this.f7263a = null;
        this.f7264b = null;
        this.f7265c = true;
        this.f7266d = c0503a;
    }
}

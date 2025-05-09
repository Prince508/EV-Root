package t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0731a {

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0731a f9517e = new EnumC0731a("COROUTINE_SUSPENDED", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC0731a f9518f = new EnumC0731a("UNDECIDED", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC0731a f9519g = new EnumC0731a("RESUMED", 2);

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ EnumC0731a[] f9520h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ v2.a f9521i;

    static {
        EnumC0731a[] c3 = c();
        f9520h = c3;
        f9521i = v2.b.a(c3);
    }

    public EnumC0731a(String str, int i3) {
    }

    public static final /* synthetic */ EnumC0731a[] c() {
        return new EnumC0731a[]{f9517e, f9518f, f9519g};
    }

    public static EnumC0731a valueOf(String str) {
        return (EnumC0731a) Enum.valueOf(EnumC0731a.class, str);
    }

    public static EnumC0731a[] values() {
        return (EnumC0731a[]) f9520h.clone();
    }
}

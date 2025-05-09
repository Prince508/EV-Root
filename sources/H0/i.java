package H0;

/* loaded from: classes.dex */
public enum i {
    CHUNKED_SHA256(1, "SHA-256", 32),
    CHUNKED_SHA512(2, "SHA-512", 64),
    VERITY_CHUNKED_SHA256(3, "SHA-256", 32),
    SHA256(4, "SHA-256", 32);


    /* renamed from: e, reason: collision with root package name */
    public final int f731e;

    /* renamed from: f, reason: collision with root package name */
    public final String f732f;

    /* renamed from: g, reason: collision with root package name */
    public final int f733g;

    i(int i3, String str, int i4) {
        this.f731e = i3;
        this.f732f = str;
        this.f733g = i4;
    }

    public int f() {
        return this.f733g;
    }

    public int g() {
        return this.f731e;
    }

    public String h() {
        return this.f732f;
    }
}

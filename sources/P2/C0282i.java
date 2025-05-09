package P2;

/* renamed from: P2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282i extends RuntimeException {

    /* renamed from: e, reason: collision with root package name */
    public final transient s2.i f1764e;

    public C0282i(s2.i iVar) {
        this.f1764e = iVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f1764e.toString();
    }
}

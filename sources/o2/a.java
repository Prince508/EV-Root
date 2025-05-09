package O2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: e, reason: collision with root package name */
    public final transient N2.e f1605e;

    public a(N2.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f1605e = eVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

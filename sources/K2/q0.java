package K2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class q0 extends CancellationException {

    /* renamed from: e, reason: collision with root package name */
    public final transient p0 f1214e;

    public q0(String str, Throwable th, p0 p0Var) {
        super(str);
        this.f1214e = p0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return C2.k.a(q0Var.getMessage(), getMessage()) && C2.k.a(q0Var.f1214e, this.f1214e) && C2.k.a(q0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C2.k.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f1214e.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f1214e;
    }
}

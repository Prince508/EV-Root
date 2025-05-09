package L2;

import C2.g;
import C2.k;
import K2.Q;
import K2.V;
import K2.t0;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import s2.i;

/* loaded from: classes.dex */
public final class c extends d implements Q {
    private volatile c _immediate;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f1337g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1338h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1339i;

    /* renamed from: j, reason: collision with root package name */
    public final c f1340j;

    public c(Handler handler, String str, boolean z3) {
        super(null);
        this.f1337g = handler;
        this.f1338h = str;
        this.f1339i = z3;
        this._immediate = z3 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f1340j = cVar;
    }

    @Override // K2.F
    public void c(i iVar, Runnable runnable) {
        if (this.f1337g.post(runnable)) {
            return;
        }
        s(iVar, runnable);
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f1337g == this.f1337g;
    }

    public int hashCode() {
        return System.identityHashCode(this.f1337g);
    }

    @Override // K2.F
    public boolean j(i iVar) {
        return (this.f1339i && k.a(Looper.myLooper(), this.f1337g.getLooper())) ? false : true;
    }

    public final void s(i iVar, Runnable runnable) {
        t0.c(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        V.b().c(iVar, runnable);
    }

    @Override // K2.z0
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public c o() {
        return this.f1340j;
    }

    @Override // K2.F
    public String toString() {
        String q3 = q();
        if (q3 != null) {
            return q3;
        }
        String str = this.f1338h;
        if (str == null) {
            str = this.f1337g.toString();
        }
        if (!this.f1339i) {
            return str;
        }
        return str + ".immediate";
    }

    public /* synthetic */ c(Handler handler, String str, int i3, g gVar) {
        this(handler, (i3 & 2) != 0 ? null : str);
    }

    public c(Handler handler, String str) {
        this(handler, str, false);
    }
}

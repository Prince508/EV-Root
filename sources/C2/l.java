package C2;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class l implements h, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final int f316e;

    public l(int i3) {
        this.f316e = i3;
    }

    @Override // C2.h
    public int e() {
        return this.f316e;
    }

    public String toString() {
        String g3 = u.g(this);
        k.d(g3, "renderLambdaToString(...)");
        return g3;
    }
}

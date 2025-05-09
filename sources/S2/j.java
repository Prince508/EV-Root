package s2;

import B2.p;
import C2.k;
import java.io.Serializable;
import s2.i;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final j f9292e = new j();

    @Override // s2.i
    public i H(i.c cVar) {
        k.e(cVar, "key");
        return this;
    }

    @Override // s2.i
    public i.b a(i.c cVar) {
        k.e(cVar, "key");
        return null;
    }

    @Override // s2.i
    public Object e(Object obj, p pVar) {
        k.e(pVar, "operation");
        return obj;
    }

    public int hashCode() {
        return 0;
    }

    @Override // s2.i
    public i r(i iVar) {
        k.e(iVar, "context");
        return iVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}

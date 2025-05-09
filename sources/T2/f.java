package T2;

import P2.C;
import P2.F;
import java.util.concurrent.atomic.AtomicReferenceArray;
import s2.i;

/* loaded from: classes.dex */
public final class f extends C {

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceArray f2089i;

    public f(long j3, f fVar, int i3) {
        super(j3, fVar, i3);
        int i4;
        i4 = e.f2088f;
        this.f2089i = new AtomicReferenceArray(i4);
    }

    @Override // P2.C
    public int n() {
        int i3;
        i3 = e.f2088f;
        return i3;
    }

    @Override // P2.C
    public void o(int i3, Throwable th, i iVar) {
        F f3;
        f3 = e.f2087e;
        r().set(i3, f3);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f2089i;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f1739g + ", hashCode=" + hashCode() + ']';
    }
}

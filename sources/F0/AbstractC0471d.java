package f0;

import C2.k;
import e0.AbstractComponentCallbacksC0459p;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0471d extends RuntimeException {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractComponentCallbacksC0459p f7190e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0471d(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, String str) {
        super(str);
        k.e(abstractComponentCallbacksC0459p, "fragment");
        this.f7190e = abstractComponentCallbacksC0459p;
    }

    public final AbstractComponentCallbacksC0459p a() {
        return this.f7190e;
    }
}

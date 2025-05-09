package f0;

import C2.k;
import e0.AbstractComponentCallbacksC0459p;

/* renamed from: f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0468a extends AbstractC0471d {

    /* renamed from: f, reason: collision with root package name */
    public final String f7171f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0468a(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, String str) {
        super(abstractComponentCallbacksC0459p, "Attempting to reuse fragment " + abstractComponentCallbacksC0459p + " with previous ID " + str);
        k.e(abstractComponentCallbacksC0459p, "fragment");
        k.e(str, "previousFragmentId");
        this.f7171f = str;
    }
}

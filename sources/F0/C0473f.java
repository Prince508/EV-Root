package f0;

import C2.k;
import e0.AbstractComponentCallbacksC0459p;

/* renamed from: f0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473f extends AbstractC0471d {

    /* renamed from: f, reason: collision with root package name */
    public final AbstractComponentCallbacksC0459p f7192f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7193g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0473f(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2, int i3) {
        super(abstractComponentCallbacksC0459p, "Attempting to nest fragment " + abstractComponentCallbacksC0459p + " within the view of parent fragment " + abstractComponentCallbacksC0459p2 + " via container with ID " + i3 + " without using parent's childFragmentManager");
        k.e(abstractComponentCallbacksC0459p, "fragment");
        k.e(abstractComponentCallbacksC0459p2, "expectedParentFragment");
        this.f7192f = abstractComponentCallbacksC0459p2;
        this.f7193g = i3;
    }
}

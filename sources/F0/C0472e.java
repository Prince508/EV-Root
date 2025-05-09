package f0;

import C2.k;
import android.view.ViewGroup;
import e0.AbstractComponentCallbacksC0459p;

/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472e extends AbstractC0471d {

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f7191f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0472e(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, ViewGroup viewGroup) {
        super(abstractComponentCallbacksC0459p, "Attempting to add fragment " + abstractComponentCallbacksC0459p + " to container " + viewGroup + " which is not a FragmentContainerView");
        k.e(abstractComponentCallbacksC0459p, "fragment");
        k.e(viewGroup, "container");
        this.f7191f = viewGroup;
    }
}

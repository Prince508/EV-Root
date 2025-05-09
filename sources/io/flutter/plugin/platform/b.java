package io.flutter.plugin.platform;

import Y1.r;
import android.content.Context;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public class b extends Y1.r {

    /* renamed from: k, reason: collision with root package name */
    public a f7689k;

    public b(Context context, int i3, int i4, a aVar) {
        super(context, i3, i4, r.b.overlay);
        this.f7689k = aVar;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        a aVar = this.f7689k;
        if (aVar == null || !aVar.a(motionEvent, true)) {
            return super.onHoverEvent(motionEvent);
        }
        return true;
    }
}

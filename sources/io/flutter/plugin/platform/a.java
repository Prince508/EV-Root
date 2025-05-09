package io.flutter.plugin.platform;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public io.flutter.view.f f7688a;

    public boolean a(MotionEvent motionEvent, boolean z3) {
        io.flutter.view.f fVar = this.f7688a;
        if (fVar == null) {
            return false;
        }
        return fVar.J(motionEvent, z3);
    }

    public void b(io.flutter.view.f fVar) {
        this.f7688a = fVar;
    }
}

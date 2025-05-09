package h2;

import a2.C0313a;
import android.window.BackEvent;
import i2.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: h2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0495f {

    /* renamed from: a, reason: collision with root package name */
    public final i2.i f7247a;

    /* renamed from: b, reason: collision with root package name */
    public final i.c f7248b;

    /* renamed from: h2.f$a */
    public class a implements i.c {
        public a() {
        }

        @Override // i2.i.c
        public void a(i2.h hVar, i.d dVar) {
            dVar.b(null);
        }
    }

    public C0495f(C0313a c0313a) {
        a aVar = new a();
        this.f7248b = aVar;
        i2.i iVar = new i2.i(c0313a, "flutter/backgesture", i2.m.f7514b);
        this.f7247a = iVar;
        iVar.e(aVar);
    }

    public final Map a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        HashMap hashMap = new HashMap(3);
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        hashMap.put("touchOffset", (Float.isNaN(touchX) || Float.isNaN(touchY)) ? null : Arrays.asList(Float.valueOf(touchX), Float.valueOf(touchY)));
        progress = backEvent.getProgress();
        hashMap.put("progress", Float.valueOf(progress));
        swipeEdge = backEvent.getSwipeEdge();
        hashMap.put("swipeEdge", Integer.valueOf(swipeEdge));
        return hashMap;
    }

    public void b() {
        W1.b.f("BackGestureChannel", "Sending message to cancel back gesture");
        this.f7247a.c("cancelBackGesture", null);
    }

    public void c() {
        W1.b.f("BackGestureChannel", "Sending message to commit back gesture");
        this.f7247a.c("commitBackGesture", null);
    }

    public void d(BackEvent backEvent) {
        W1.b.f("BackGestureChannel", "Sending message to start back gesture");
        this.f7247a.c("startBackGesture", a(backEvent));
    }

    public void e(BackEvent backEvent) {
        W1.b.f("BackGestureChannel", "Sending message to update back gesture progress");
        this.f7247a.c("updateBackGestureProgress", a(backEvent));
    }
}

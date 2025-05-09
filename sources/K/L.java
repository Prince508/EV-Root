package K;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public static Map f945a = Collections.synchronizedMap(new WeakHashMap());

    public static class a {
        public static float a(VelocityTracker velocityTracker, int i3) {
            return velocityTracker.getAxisVelocity(i3);
        }

        public static float b(VelocityTracker velocityTracker, int i3, int i4) {
            return velocityTracker.getAxisVelocity(i3, i4);
        }

        public static boolean c(VelocityTracker velocityTracker, int i3) {
            return velocityTracker.isAxisSupported(i3);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f945a.containsKey(velocityTracker)) {
                f945a.put(velocityTracker, new M());
            }
            ((M) f945a.get(velocityTracker)).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i3) {
        c(velocityTracker, i3, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i3, float f3) {
        velocityTracker.computeCurrentVelocity(i3, f3);
        M e3 = e(velocityTracker);
        if (e3 != null) {
            e3.c(i3, f3);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i3) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i3);
        }
        if (i3 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i3 == 1) {
            return velocityTracker.getYVelocity();
        }
        M e3 = e(velocityTracker);
        if (e3 != null) {
            return e3.d(i3);
        }
        return 0.0f;
    }

    public static M e(VelocityTracker velocityTracker) {
        return (M) f945a.get(velocityTracker);
    }
}

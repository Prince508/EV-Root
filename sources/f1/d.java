package f1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public long f7201a;

    /* renamed from: b, reason: collision with root package name */
    public long f7202b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f7203c;

    /* renamed from: d, reason: collision with root package name */
    public int f7204d;

    /* renamed from: e, reason: collision with root package name */
    public int f7205e;

    public d(long j3, long j4) {
        this.f7203c = null;
        this.f7204d = 0;
        this.f7205e = 1;
        this.f7201a = j3;
        this.f7202b = j4;
    }

    public static d a(ValueAnimator valueAnimator) {
        d dVar = new d(valueAnimator.getStartDelay(), valueAnimator.getDuration(), e(valueAnimator));
        dVar.f7204d = valueAnimator.getRepeatCount();
        dVar.f7205e = valueAnimator.getRepeatMode();
        return dVar;
    }

    public static TimeInterpolator e(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? AbstractC0474a.f7195b : interpolator instanceof AccelerateInterpolator ? AbstractC0474a.f7196c : interpolator instanceof DecelerateInterpolator ? AbstractC0474a.f7197d : interpolator;
    }

    public long b() {
        return this.f7201a;
    }

    public long c() {
        return this.f7202b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.f7203c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0474a.f7195b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (b() == dVar.b() && c() == dVar.c() && f() == dVar.f() && g() == dVar.g()) {
            return d().getClass().equals(dVar.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.f7204d;
    }

    public int g() {
        return this.f7205e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public d(long j3, long j4, TimeInterpolator timeInterpolator) {
        this.f7204d = 0;
        this.f7205e = 1;
        this.f7201a = j3;
        this.f7202b = j4;
        this.f7203c = timeInterpolator;
    }
}

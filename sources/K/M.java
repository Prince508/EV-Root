package K;

import android.view.MotionEvent;

/* loaded from: classes.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f946a = new float[20];

    /* renamed from: b, reason: collision with root package name */
    public final long[] f947b = new long[20];

    /* renamed from: c, reason: collision with root package name */
    public float f948c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public int f949d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f950e = 0;

    public static float f(float f3) {
        return (f3 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f3) * 2.0f));
    }

    public void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f949d != 0 && eventTime - this.f947b[this.f950e] > 40) {
            b();
        }
        int i3 = (this.f950e + 1) % 20;
        this.f950e = i3;
        int i4 = this.f949d;
        if (i4 != 20) {
            this.f949d = i4 + 1;
        }
        this.f946a[i3] = motionEvent.getAxisValue(26);
        this.f947b[this.f950e] = eventTime;
    }

    public final void b() {
        this.f949d = 0;
        this.f948c = 0.0f;
    }

    public void c(int i3, float f3) {
        float e3 = e() * i3;
        this.f948c = e3;
        if (e3 < (-Math.abs(f3))) {
            this.f948c = -Math.abs(f3);
        } else if (this.f948c > Math.abs(f3)) {
            this.f948c = Math.abs(f3);
        }
    }

    public float d(int i3) {
        if (i3 != 26) {
            return 0.0f;
        }
        return this.f948c;
    }

    public final float e() {
        long[] jArr;
        long j3;
        int i3 = this.f949d;
        if (i3 < 2) {
            return 0.0f;
        }
        int i4 = this.f950e;
        int i5 = ((i4 + 20) - (i3 - 1)) % 20;
        long j4 = this.f947b[i4];
        while (true) {
            jArr = this.f947b;
            j3 = jArr[i5];
            if (j4 - j3 <= 100) {
                break;
            }
            this.f949d--;
            i5 = (i5 + 1) % 20;
        }
        int i6 = this.f949d;
        if (i6 < 2) {
            return 0.0f;
        }
        if (i6 == 2) {
            int i7 = (i5 + 1) % 20;
            if (j3 == jArr[i7]) {
                return 0.0f;
            }
            return this.f946a[i7] / (r2 - j3);
        }
        float f3 = 0.0f;
        int i8 = 0;
        for (int i9 = 0; i9 < this.f949d - 1; i9++) {
            int i10 = i9 + i5;
            long[] jArr2 = this.f947b;
            long j5 = jArr2[i10 % 20];
            int i11 = (i10 + 1) % 20;
            if (jArr2[i11] != j5) {
                i8++;
                float f4 = f(f3);
                float f5 = this.f946a[i11] / (this.f947b[i11] - j5);
                f3 += (f5 - f4) * Math.abs(f5);
                if (i8 == 1) {
                    f3 *= 0.5f;
                }
            }
        }
        return f(f3);
    }
}

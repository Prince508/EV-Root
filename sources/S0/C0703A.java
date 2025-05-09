package s0;

import java.util.Arrays;

/* renamed from: s0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0703A {

    /* renamed from: a, reason: collision with root package name */
    public long[] f9103a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f9104b = new float[20];

    /* renamed from: c, reason: collision with root package name */
    public int f9105c = 0;

    public C0703A() {
        long[] jArr = new long[20];
        this.f9103a = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    public void a(long j3, float f3) {
        int i3 = (this.f9105c + 1) % 20;
        this.f9105c = i3;
        this.f9103a[i3] = j3;
        this.f9104b[i3] = f3;
    }

    public float b() {
        float c3;
        int i3 = this.f9105c;
        if (i3 == 0 && this.f9103a[i3] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j3 = this.f9103a[i3];
        int i4 = 0;
        long j4 = j3;
        while (true) {
            long j5 = this.f9103a[i3];
            if (j5 == Long.MIN_VALUE) {
                break;
            }
            float f3 = j3 - j5;
            float abs = Math.abs(j5 - j4);
            if (f3 > 100.0f || abs > 40.0f) {
                break;
            }
            if (i3 == 0) {
                i3 = 20;
            }
            i3--;
            i4++;
            if (i4 >= 20) {
                break;
            }
            j4 = j5;
        }
        if (i4 < 2) {
            return 0.0f;
        }
        if (i4 == 2) {
            int i5 = this.f9105c;
            int i6 = i5 == 0 ? 19 : i5 - 1;
            long[] jArr = this.f9103a;
            float f4 = jArr[i5] - jArr[i6];
            if (f4 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f9104b;
            c3 = (fArr[i5] - fArr[i6]) / f4;
        } else {
            int i7 = this.f9105c;
            int i8 = ((i7 - i4) + 21) % 20;
            int i9 = (i7 + 21) % 20;
            long j6 = this.f9103a[i8];
            float f5 = this.f9104b[i8];
            int i10 = i8 + 1;
            float f6 = 0.0f;
            for (int i11 = i10 % 20; i11 != i9; i11 = (i11 + 1) % 20) {
                long j7 = this.f9103a[i11];
                float f7 = j7 - j6;
                if (f7 != 0.0f) {
                    float f8 = this.f9104b[i11];
                    float f9 = (f8 - f5) / f7;
                    f6 += (f9 - c(f6)) * Math.abs(f9);
                    if (i11 == i10) {
                        f6 *= 0.5f;
                    }
                    f5 = f8;
                    j6 = j7;
                }
            }
            c3 = c(f6);
        }
        return c3 * 1000.0f;
    }

    public final float c(float f3) {
        return (float) (Math.signum(f3) * Math.sqrt(Math.abs(f3) * 2.0f));
    }
}

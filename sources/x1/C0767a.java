package x1;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0767a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f9979a;

    public C0767a(float f3) {
        this.f9979a = f3;
    }

    @Override // x1.c
    public float a(RectF rectF) {
        return this.f9979a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0767a) && this.f9979a == ((C0767a) obj).f9979a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f9979a)});
    }
}

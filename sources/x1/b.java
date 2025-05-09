package x1;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f9980a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9981b;

    public b(float f3, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f9980a;
            f3 += ((b) cVar).f9981b;
        }
        this.f9980a = cVar;
        this.f9981b = f3;
    }

    @Override // x1.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f9980a.a(rectF) + this.f9981b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f9980a.equals(bVar.f9980a) && this.f9981b == bVar.f9981b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9980a, Float.valueOf(this.f9981b)});
    }
}

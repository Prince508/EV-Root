package s;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class i {

    /* renamed from: o, reason: collision with root package name */
    public static int f9068o = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9069a;

    /* renamed from: b, reason: collision with root package name */
    public String f9070b;

    /* renamed from: f, reason: collision with root package name */
    public float f9074f;

    /* renamed from: j, reason: collision with root package name */
    public a f9078j;

    /* renamed from: c, reason: collision with root package name */
    public int f9071c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f9072d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f9073e = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9075g = false;

    /* renamed from: h, reason: collision with root package name */
    public float[] f9076h = new float[9];

    /* renamed from: i, reason: collision with root package name */
    public float[] f9077i = new float[9];

    /* renamed from: k, reason: collision with root package name */
    public b[] f9079k = new b[16];

    /* renamed from: l, reason: collision with root package name */
    public int f9080l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f9081m = 0;

    /* renamed from: n, reason: collision with root package name */
    public HashSet f9082n = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f9078j = aVar;
    }

    public static void b() {
        f9068o++;
    }

    public final void a(b bVar) {
        int i3 = 0;
        while (true) {
            int i4 = this.f9080l;
            if (i3 >= i4) {
                b[] bVarArr = this.f9079k;
                if (i4 >= bVarArr.length) {
                    this.f9079k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f9079k;
                int i5 = this.f9080l;
                bVarArr2[i5] = bVar;
                this.f9080l = i5 + 1;
                return;
            }
            if (this.f9079k[i3] == bVar) {
                return;
            } else {
                i3++;
            }
        }
    }

    public final void c(b bVar) {
        int i3 = this.f9080l;
        int i4 = 0;
        while (i4 < i3) {
            if (this.f9079k[i4] == bVar) {
                while (i4 < i3 - 1) {
                    b[] bVarArr = this.f9079k;
                    int i5 = i4 + 1;
                    bVarArr[i4] = bVarArr[i5];
                    i4 = i5;
                }
                this.f9080l--;
                return;
            }
            i4++;
        }
    }

    public void d() {
        this.f9070b = null;
        this.f9078j = a.UNKNOWN;
        this.f9073e = 0;
        this.f9071c = -1;
        this.f9072d = -1;
        this.f9074f = 0.0f;
        this.f9075g = false;
        int i3 = this.f9080l;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f9079k[i4] = null;
        }
        this.f9080l = 0;
        this.f9081m = 0;
        this.f9069a = false;
        Arrays.fill(this.f9077i, 0.0f);
    }

    public void e(d dVar, float f3) {
        this.f9074f = f3;
        this.f9075g = true;
        int i3 = this.f9080l;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f9079k[i4].B(dVar, this, false);
        }
        this.f9080l = 0;
    }

    public void f(a aVar, String str) {
        this.f9078j = aVar;
    }

    public final void g(b bVar) {
        int i3 = this.f9080l;
        for (int i4 = 0; i4 < i3; i4++) {
            this.f9079k[i4].C(bVar, false);
        }
        this.f9080l = 0;
    }

    public String toString() {
        if (this.f9070b != null) {
            return "" + this.f9070b;
        }
        return "" + this.f9071c;
    }
}

package s;

/* loaded from: classes.dex */
public class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f9056a;

    /* renamed from: b, reason: collision with root package name */
    public int f9057b;

    public g(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f9056a = new Object[i3];
    }

    @Override // s.f
    public boolean a(Object obj) {
        int i3 = this.f9057b;
        Object[] objArr = this.f9056a;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f9057b = i3 + 1;
        return true;
    }

    @Override // s.f
    public Object b() {
        int i3 = this.f9057b;
        if (i3 <= 0) {
            return null;
        }
        int i4 = i3 - 1;
        Object[] objArr = this.f9056a;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f9057b = i3 - 1;
        return obj;
    }

    @Override // s.f
    public void c(Object[] objArr, int i3) {
        if (i3 > objArr.length) {
            i3 = objArr.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            Object obj = objArr[i4];
            int i5 = this.f9057b;
            Object[] objArr2 = this.f9056a;
            if (i5 < objArr2.length) {
                objArr2[i5] = obj;
                this.f9057b = i5 + 1;
            }
        }
    }
}

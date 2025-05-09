package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class W implements H {

    /* renamed from: a, reason: collision with root package name */
    public final J f3591a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3592b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f3593c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3594d;

    public W(J j3, String str, Object[] objArr) {
        this.f3591a = j3;
        this.f3592b = str;
        this.f3593c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f3594d = charAt;
            return;
        }
        int i3 = charAt & 8191;
        int i4 = 13;
        int i5 = 1;
        while (true) {
            int i6 = i5 + 1;
            char charAt2 = str.charAt(i5);
            if (charAt2 < 55296) {
                this.f3594d = i3 | (charAt2 << i4);
                return;
            } else {
                i3 |= (charAt2 & 8191) << i4;
                i4 += 13;
                i5 = i6;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public T a() {
        return (this.f3594d & 1) == 1 ? T.PROTO2 : T.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public J b() {
        return this.f3591a;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public boolean c() {
        return (this.f3594d & 2) == 2;
    }

    public Object[] d() {
        return this.f3593c;
    }

    public String e() {
        return this.f3592b;
    }
}

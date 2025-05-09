package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class c0 implements M {

    /* renamed from: a, reason: collision with root package name */
    public final O f5778a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5779b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f5780c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5781d;

    public c0(O o3, String str, Object[] objArr) {
        this.f5778a = o3;
        this.f5779b = str;
        this.f5780c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5781d = charAt;
            return;
        }
        int i3 = charAt & 8191;
        int i4 = 13;
        int i5 = 1;
        while (true) {
            int i6 = i5 + 1;
            char charAt2 = str.charAt(i5);
            if (charAt2 < 55296) {
                this.f5781d = i3 | (charAt2 << i4);
                return;
            } else {
                i3 |= (charAt2 & 8191) << i4;
                i4 += 13;
                i5 = i6;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public Z a() {
        return (this.f5781d & 1) == 1 ? Z.PROTO2 : Z.PROTO3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public O b() {
        return this.f5778a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public boolean c() {
        return (this.f5781d & 2) == 2;
    }

    public Object[] d() {
        return this.f5780c;
    }

    public String e() {
        return this.f5779b;
    }
}

package O0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f1526a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f1527b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1528c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1529d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1530e;

    public a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i3, boolean z3, int i4) {
        this.f1526a = byteBuffer;
        this.f1527b = byteBuffer2;
        this.f1528c = i3;
        this.f1529d = z3;
        this.f1530e = i4;
    }

    public c a() {
        return new e(c());
    }

    public ByteBuffer b() {
        return this.f1526a.slice();
    }

    public ByteBuffer c() {
        return this.f1527b.slice();
    }

    public int d() {
        return this.f1528c;
    }

    public int e() {
        return this.f1530e;
    }
}

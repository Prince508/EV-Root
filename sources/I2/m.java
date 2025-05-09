package i2;

import i2.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class m implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final m f7514b = new m(l.f7511a);

    /* renamed from: a, reason: collision with root package name */
    public final l f7515a;

    public m(l lVar) {
        this.f7515a = lVar;
    }

    @Override // i2.j
    public ByteBuffer a(h hVar) {
        l.a aVar = new l.a();
        this.f7515a.p(aVar, hVar.f7499a);
        this.f7515a.p(aVar, hVar.f7500b);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // i2.j
    public ByteBuffer b(Object obj) {
        l.a aVar = new l.a();
        aVar.write(0);
        this.f7515a.p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // i2.j
    public h c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f3 = this.f7515a.f(byteBuffer);
        Object f4 = this.f7515a.f(byteBuffer);
        if (!(f3 instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new h((String) f3, f4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // i2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L4a
            goto L1e
        L11:
            i2.l r0 = r4.f7515a
            java.lang.Object r0 = r0.f(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            i2.l r0 = r4.f7515a
            java.lang.Object r0 = r0.f(r5)
            i2.l r1 = r4.f7515a
            java.lang.Object r1 = r1.f(r5)
            i2.l r2 = r4.f7515a
            java.lang.Object r2 = r2.f(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L4a
            if (r1 == 0) goto L3a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L4a
        L3a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L4a
            i2.c r5 = new i2.c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.m.d(java.nio.ByteBuffer):java.lang.Object");
    }

    @Override // i2.j
    public ByteBuffer e(String str, String str2, Object obj, String str3) {
        l.a aVar = new l.a();
        aVar.write(1);
        this.f7515a.p(aVar, str);
        this.f7515a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f7515a.p(aVar, W1.b.d((Throwable) obj));
        } else {
            this.f7515a.p(aVar, obj);
        }
        this.f7515a.p(aVar, str3);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    @Override // i2.j
    public ByteBuffer f(String str, String str2, Object obj) {
        l.a aVar = new l.a();
        aVar.write(1);
        this.f7515a.p(aVar, str);
        this.f7515a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f7515a.p(aVar, W1.b.d((Throwable) obj));
        } else {
            this.f7515a.p(aVar, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }
}

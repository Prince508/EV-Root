package N2;

import P2.F;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class s extends O2.b implements n, d, O2.k {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1513i = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: h, reason: collision with root package name */
    public int f1514h;

    public static final class a extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f1515h;

        /* renamed from: i, reason: collision with root package name */
        public Object f1516i;

        /* renamed from: j, reason: collision with root package name */
        public Object f1517j;

        /* renamed from: k, reason: collision with root package name */
        public Object f1518k;

        /* renamed from: l, reason: collision with root package name */
        public Object f1519l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f1520m;

        /* renamed from: o, reason: collision with root package name */
        public int f1522o;

        public a(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f1520m = obj;
            this.f1522o |= Integer.MIN_VALUE;
            return s.this.b(null, this);
        }
    }

    public s(Object obj) {
        this._state = obj;
    }

    @Override // O2.k
    public d a(s2.i iVar, int i3, M2.a aVar) {
        return t.d(this, iVar, i3, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
    
        if (r6.e(r0) == r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0097, B:19:0x009c, B:21:0x00bd, B:23:0x00c3, B:27:0x00a2, B:30:0x00a9, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0097, B:19:0x009c, B:21:0x00bd, B:23:0x00c3, B:27:0x00a2, B:30:0x00a9, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0097, B:19:0x009c, B:21:0x00bd, B:23:0x00c3, B:27:0x00a2, B:30:0x00a9, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c1 -> B:15:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d3 -> B:15:0x008f). Please report as a decompilation issue!!! */
    @Override // N2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(N2.e r11, s2.e r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.s.b(N2.e, s2.e):java.lang.Object");
    }

    @Override // N2.e
    public Object d(Object obj, s2.e eVar) {
        setValue(obj);
        return q2.n.f8874a;
    }

    @Override // N2.n
    public Object getValue() {
        F f3 = O2.m.f1628a;
        Object obj = f1513i.get(this);
        if (obj == f3) {
            return null;
        }
        return obj;
    }

    @Override // O2.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public u e() {
        return new u();
    }

    @Override // O2.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public u[] f(int i3) {
        return new u[i3];
    }

    public final boolean k(Object obj, Object obj2) {
        int i3;
        O2.d[] h3;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1513i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !C2.k.a(obj3, obj)) {
                return false;
            }
            if (C2.k.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i4 = this.f1514h;
            if ((i4 & 1) != 0) {
                this.f1514h = i4 + 2;
                return true;
            }
            int i5 = i4 + 1;
            this.f1514h = i5;
            O2.d[] h4 = h();
            q2.n nVar = q2.n.f8874a;
            while (true) {
                u[] uVarArr = (u[]) h4;
                if (uVarArr != null) {
                    for (u uVar : uVarArr) {
                        if (uVar != null) {
                            uVar.g();
                        }
                    }
                }
                synchronized (this) {
                    i3 = this.f1514h;
                    if (i3 == i5) {
                        this.f1514h = i5 + 1;
                        return true;
                    }
                    h3 = h();
                    q2.n nVar2 = q2.n.f8874a;
                }
                h4 = h3;
                i5 = i3;
            }
        }
    }

    @Override // N2.n
    public void setValue(Object obj) {
        if (obj == null) {
            obj = O2.m.f1628a;
        }
        k(null, obj);
    }
}

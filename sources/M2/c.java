package M2;

import K2.InterfaceC0243l;
import P2.F;
import P2.I;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1394a = new j(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f1395b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1396c;

    /* renamed from: d, reason: collision with root package name */
    public static final F f1397d;

    /* renamed from: e, reason: collision with root package name */
    public static final F f1398e;

    /* renamed from: f, reason: collision with root package name */
    public static final F f1399f;

    /* renamed from: g, reason: collision with root package name */
    public static final F f1400g;

    /* renamed from: h, reason: collision with root package name */
    public static final F f1401h;

    /* renamed from: i, reason: collision with root package name */
    public static final F f1402i;

    /* renamed from: j, reason: collision with root package name */
    public static final F f1403j;

    /* renamed from: k, reason: collision with root package name */
    public static final F f1404k;

    /* renamed from: l, reason: collision with root package name */
    public static final F f1405l;

    /* renamed from: m, reason: collision with root package name */
    public static final F f1406m;

    /* renamed from: n, reason: collision with root package name */
    public static final F f1407n;

    /* renamed from: o, reason: collision with root package name */
    public static final F f1408o;

    /* renamed from: p, reason: collision with root package name */
    public static final F f1409p;

    /* renamed from: q, reason: collision with root package name */
    public static final F f1410q;

    /* renamed from: r, reason: collision with root package name */
    public static final F f1411r;

    /* renamed from: s, reason: collision with root package name */
    public static final F f1412s;

    public /* synthetic */ class a extends C2.j implements B2.p {

        /* renamed from: n, reason: collision with root package name */
        public static final a f1413n = new a();

        public a() {
            super(2, c.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // B2.p
        public /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
            return n(((Number) obj).longValue(), (j) obj2);
        }

        public final j n(long j3, j jVar) {
            return c.x(j3, jVar);
        }
    }

    static {
        int e3;
        int e4;
        e3 = I.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        f1395b = e3;
        e4 = I.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        f1396c = e4;
        f1397d = new F("BUFFERED");
        f1398e = new F("SHOULD_BUFFER");
        f1399f = new F("S_RESUMING_BY_RCV");
        f1400g = new F("RESUMING_BY_EB");
        f1401h = new F("POISONED");
        f1402i = new F("DONE_RCV");
        f1403j = new F("INTERRUPTED_SEND");
        f1404k = new F("INTERRUPTED_RCV");
        f1405l = new F("CHANNEL_CLOSED");
        f1406m = new F("SUSPEND");
        f1407n = new F("SUSPEND_NO_WAITER");
        f1408o = new F("FAILED");
        f1409p = new F("NO_RECEIVE_RESULT");
        f1410q = new F("CLOSE_HANDLER_CLOSED");
        f1411r = new F("CLOSE_HANDLER_INVOKED");
        f1412s = new F("NO_CLOSE_CAUSE");
    }

    public static final long A(int i3) {
        if (i3 == 0) {
            return 0L;
        }
        if (i3 != Integer.MAX_VALUE) {
            return i3;
        }
        return Long.MAX_VALUE;
    }

    public static final boolean B(InterfaceC0243l interfaceC0243l, Object obj, B2.l lVar) {
        Object z3 = interfaceC0243l.z(obj, null, lVar);
        if (z3 == null) {
            return false;
        }
        interfaceC0243l.I(z3);
        return true;
    }

    public static /* synthetic */ boolean C(InterfaceC0243l interfaceC0243l, Object obj, B2.l lVar, int i3, Object obj2) {
        if ((i3 & 2) != 0) {
            lVar = null;
        }
        return B(interfaceC0243l, obj, lVar);
    }

    public static final long v(long j3, boolean z3) {
        return (z3 ? 4611686018427387904L : 0L) + j3;
    }

    public static final long w(long j3, int i3) {
        return (i3 << 60) + j3;
    }

    public static final j x(long j3, j jVar) {
        return new j(j3, jVar, jVar.u(), 0);
    }

    public static final H2.e y() {
        return a.f1413n;
    }

    public static final F z() {
        return f1405l;
    }
}

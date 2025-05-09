package Y1;

import Y1.D;
import Y1.I;
import Y1.J;
import android.view.KeyEvent;
import i2.InterfaceC0504b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class H implements I.d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0504b f2458a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f2459b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2460c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final I.b f2461d = new I.b();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2462a;

        static {
            int[] iArr = new int[D.b.values().length];
            f2462a = iArr;
            try {
                iArr[D.b.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2462a[D.b.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2462a[D.b.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public H(InterfaceC0504b interfaceC0504b) {
        this.f2458a = interfaceC0504b;
        for (J.e eVar : J.a()) {
            this.f2460c.put(Long.valueOf(eVar.f2482c), eVar);
        }
    }

    public static /* synthetic */ void b(H h3, J.c cVar, KeyEvent keyEvent) {
        h3.getClass();
        h3.n(false, Long.valueOf(cVar.f2477b), Long.valueOf(cVar.f2476a), keyEvent.getEventTime());
    }

    public static /* synthetic */ void c(H h3, J.c cVar, long j3, KeyEvent keyEvent) {
        h3.getClass();
        h3.n(false, Long.valueOf(cVar.f2477b), Long.valueOf(j3), keyEvent.getEventTime());
    }

    public static /* synthetic */ void d(I.d.a aVar, ByteBuffer byteBuffer) {
        Boolean bool = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                bool = Boolean.valueOf(byteBuffer.get() != 0);
            }
        } else {
            W1.b.g("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
        }
        aVar.a(bool.booleanValue());
    }

    public static D.b e(KeyEvent keyEvent) {
        boolean z3 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z3 ? D.b.kRepeat : D.b.kDown;
        }
        if (action == 1) {
            return D.b.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    public static long j(long j3, long j4) {
        return (j3 & 4294967295L) | j4;
    }

    @Override // Y1.I.d
    public void a(KeyEvent keyEvent, I.d.a aVar) {
        if (i(keyEvent, aVar)) {
            return;
        }
        n(true, 0L, 0L, 0L);
        aVar.a(true);
    }

    public final Long f(KeyEvent keyEvent) {
        Long l3 = (Long) J.f2474b.get(Long.valueOf(keyEvent.getKeyCode()));
        return l3 != null ? l3 : Long.valueOf(j(keyEvent.getKeyCode(), 73014444032L));
    }

    public final Long g(KeyEvent keyEvent) {
        long scanCode = keyEvent.getScanCode();
        if (scanCode == 0) {
            return Long.valueOf(j(keyEvent.getKeyCode(), 73014444032L));
        }
        Long l3 = (Long) J.f2473a.get(Long.valueOf(scanCode));
        return l3 != null ? l3 : Long.valueOf(j(keyEvent.getScanCode(), 73014444032L));
    }

    public Map h() {
        return Collections.unmodifiableMap(this.f2459b);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145 A[LOOP:2: B:62:0x013f->B:64:0x0145, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(android.view.KeyEvent r16, Y1.I.d.a r17) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.H.i(android.view.KeyEvent, Y1.I$d$a):boolean");
    }

    public final void k(D d3, final I.d.a aVar) {
        this.f2458a.c("flutter/keydata", d3.a(), aVar == null ? null : new InterfaceC0504b.InterfaceC0126b() { // from class: Y1.E
            @Override // i2.InterfaceC0504b.InterfaceC0126b
            public final void a(ByteBuffer byteBuffer) {
                H.d(I.d.a.this, byteBuffer);
            }
        });
    }

    public void l(J.d dVar, boolean z3, long j3, final long j4, final KeyEvent keyEvent, ArrayList arrayList) {
        J.c[] cVarArr = dVar.f2479b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        boolean z4 = false;
        int i3 = 0;
        while (true) {
            J.c[] cVarArr2 = dVar.f2479b;
            boolean z5 = true;
            if (i3 >= cVarArr2.length) {
                break;
            }
            final J.c cVar = cVarArr2[i3];
            boolean containsKey = this.f2459b.containsKey(Long.valueOf(cVar.f2476a));
            zArr[i3] = containsKey;
            if (cVar.f2477b == j3) {
                int i4 = a.f2462a[e(keyEvent).ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        boolArr[i3] = Boolean.valueOf(zArr[i3]);
                    } else if (i4 == 3) {
                        if (!z3) {
                            arrayList.add(new Runnable() { // from class: Y1.G
                                @Override // java.lang.Runnable
                                public final void run() {
                                    H.b(H.this, cVar, keyEvent);
                                }
                            });
                        }
                        boolArr[i3] = Boolean.valueOf(zArr[i3]);
                    }
                    i3++;
                } else {
                    boolArr[i3] = Boolean.FALSE;
                    if (!z3) {
                        arrayList.add(new Runnable() { // from class: Y1.F
                            @Override // java.lang.Runnable
                            public final void run() {
                                H.c(H.this, cVar, j4, keyEvent);
                            }
                        });
                    }
                }
            } else if (!z4 && !containsKey) {
                z5 = false;
            }
            z4 = z5;
            i3++;
        }
        if (z3) {
            for (int i5 = 0; i5 < dVar.f2479b.length; i5++) {
                if (boolArr[i5] == null) {
                    if (z4) {
                        boolArr[i5] = Boolean.valueOf(zArr[i5]);
                    } else {
                        boolArr[i5] = Boolean.TRUE;
                        z4 = true;
                    }
                }
            }
            if (!z4) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i6 = 0; i6 < dVar.f2479b.length; i6++) {
                if (boolArr[i6] == null) {
                    boolArr[i6] = Boolean.FALSE;
                }
            }
        }
        for (int i7 = 0; i7 < dVar.f2479b.length; i7++) {
            if (zArr[i7] != boolArr[i7].booleanValue()) {
                J.c cVar2 = dVar.f2479b[i7];
                n(boolArr[i7].booleanValue(), Long.valueOf(cVar2.f2477b), Long.valueOf(cVar2.f2476a), keyEvent.getEventTime());
            }
        }
    }

    public void m(J.e eVar, boolean z3, long j3, KeyEvent keyEvent) {
        if (eVar.f2482c == j3 || eVar.f2483d == z3) {
            return;
        }
        boolean containsKey = this.f2459b.containsKey(Long.valueOf(eVar.f2481b));
        boolean z4 = !containsKey;
        if (!containsKey) {
            eVar.f2483d = !eVar.f2483d;
        }
        n(z4, Long.valueOf(eVar.f2482c), Long.valueOf(eVar.f2481b), keyEvent.getEventTime());
        if (containsKey) {
            eVar.f2483d = !eVar.f2483d;
        }
        n(containsKey, Long.valueOf(eVar.f2482c), Long.valueOf(eVar.f2481b), keyEvent.getEventTime());
    }

    public final void n(boolean z3, Long l3, Long l4, long j3) {
        D d3 = new D();
        d3.f2431a = j3;
        d3.f2432b = z3 ? D.b.kDown : D.b.kUp;
        d3.f2434d = l3.longValue();
        d3.f2433c = l4.longValue();
        d3.f2437g = null;
        d3.f2435e = true;
        d3.f2436f = D.a.kKeyboard;
        if (l4.longValue() != 0 && l3.longValue() != 0) {
            if (!z3) {
                l3 = null;
            }
            o(l4, l3);
        }
        k(d3, null);
    }

    public void o(Long l3, Long l4) {
        if (l4 != null) {
            if (((Long) this.f2459b.put(l3, l4)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) this.f2459b.remove(l3)) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}

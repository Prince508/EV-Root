package M2;

/* loaded from: classes.dex */
public abstract class g {
    public static final d a(int i3, a aVar, B2.l lVar) {
        if (i3 == -2) {
            return aVar == a.SUSPEND ? new b(d.f1414c.a(), lVar) : new o(1, aVar, lVar);
        }
        if (i3 != -1) {
            return i3 != 0 ? i3 != Integer.MAX_VALUE ? aVar == a.SUSPEND ? new b(i3, lVar) : new o(i3, aVar, lVar) : new b(Integer.MAX_VALUE, lVar) : aVar == a.SUSPEND ? new b(0, lVar) : new o(1, aVar, lVar);
        }
        if (aVar == a.SUSPEND) {
            return new o(1, a.DROP_OLDEST, lVar);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static /* synthetic */ d b(int i3, a aVar, B2.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i3 = 0;
        }
        if ((i4 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        return a(i3, aVar, lVar);
    }
}

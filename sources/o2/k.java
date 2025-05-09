package O2;

/* loaded from: classes.dex */
public interface k extends N2.d {

    public static final class a {
        public static /* synthetic */ N2.d a(k kVar, s2.i iVar, int i3, M2.a aVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i4 & 1) != 0) {
                iVar = s2.j.f9292e;
            }
            if ((i4 & 2) != 0) {
                i3 = -3;
            }
            if ((i4 & 4) != 0) {
                aVar = M2.a.SUSPEND;
            }
            return kVar.a(iVar, i3, aVar);
        }
    }

    N2.d a(s2.i iVar, int i3, M2.a aVar);
}

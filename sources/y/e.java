package Y;

import C2.k;
import Y.d;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class e {
    public static final d a() {
        return new a(null, true, 1, null);
    }

    public static final a b(d.b... bVarArr) {
        k.e(bVarArr, "pairs");
        a aVar = new a(null, false, 1, null);
        aVar.h((d.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return aVar;
    }
}

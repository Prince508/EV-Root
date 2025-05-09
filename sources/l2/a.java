package L2;

import K2.z0;
import P2.t;
import android.os.Looper;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements t {
    @Override // P2.t
    public int a() {
        return 1073741823;
    }

    @Override // P2.t
    public String b() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // P2.t
    public z0 c(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }
}

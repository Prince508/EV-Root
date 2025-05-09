package X;

import C2.k;
import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public abstract class b {
    public static final File a(Context context, String str) {
        k.e(context, "<this>");
        k.e(str, "name");
        return U.a.a(context, k.j(str, ".preferences_pb"));
    }
}

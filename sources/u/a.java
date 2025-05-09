package U;

import C2.k;
import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public abstract class a {
    public static final File a(Context context, String str) {
        k.e(context, "<this>");
        k.e(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), k.j("datastore/", str));
    }
}

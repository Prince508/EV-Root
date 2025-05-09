package z2;

import C2.k;
import J2.o;
import java.io.File;

/* loaded from: classes.dex */
public abstract class e extends d {
    public static String a(File file) {
        k.e(file, "<this>");
        String name = file.getName();
        k.d(name, "getName(...)");
        return o.J(name, '.', "");
    }
}

package K2;

/* loaded from: classes.dex */
public abstract class z0 extends F {
    public abstract z0 o();

    public final String q() {
        z0 z0Var;
        z0 c3 = V.c();
        if (this == c3) {
            return "Dispatchers.Main";
        }
        try {
            z0Var = c3.o();
        } catch (UnsupportedOperationException unused) {
            z0Var = null;
        }
        if (this == z0Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}

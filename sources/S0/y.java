package s0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class y {

    /* renamed from: b, reason: collision with root package name */
    public View f9279b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f9278a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f9280c = new ArrayList();

    public y(View view) {
        this.f9279b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f9279b == yVar.f9279b && this.f9278a.equals(yVar.f9278a);
    }

    public int hashCode() {
        return (this.f9279b.hashCode() * 31) + this.f9278a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f9279b + "\n") + "    values:";
        for (String str2 : this.f9278a.keySet()) {
            str = str + "    " + str2 + ": " + this.f9278a.get(str2) + "\n";
        }
        return str;
    }
}

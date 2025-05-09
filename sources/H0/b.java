package H0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f668a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f669b;

    /* renamed from: c, reason: collision with root package name */
    public final List f670c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final List f671d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final List f672e = new ArrayList();

    public b(int i3) {
        this.f668a = i3;
    }

    public boolean a() {
        if (!this.f672e.isEmpty()) {
            return true;
        }
        if (this.f670c.isEmpty()) {
            return false;
        }
        Iterator it = this.f670c.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).c()) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        if (!this.f671d.isEmpty()) {
            return true;
        }
        if (this.f670c.isEmpty()) {
            return false;
        }
        Iterator it = this.f670c.iterator();
        while (it.hasNext()) {
            if (((c) it.next()).d()) {
                return true;
            }
        }
        return false;
    }
}

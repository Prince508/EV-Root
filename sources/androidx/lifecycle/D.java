package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public final Map f3953a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Set f3954b = new LinkedHashSet();

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f3955c = false;

    public static void b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public final void a() {
        this.f3955c = true;
        Map map = this.f3953a;
        if (map != null) {
            synchronized (map) {
                try {
                    Iterator it = this.f3953a.values().iterator();
                    while (it.hasNext()) {
                        b(it.next());
                    }
                } finally {
                }
            }
        }
        Set set = this.f3954b;
        if (set != null) {
            synchronized (set) {
                try {
                    Iterator it2 = this.f3954b.iterator();
                    while (it2.hasNext()) {
                        b((Closeable) it2.next());
                    }
                } finally {
                }
            }
            this.f3954b.clear();
        }
        c();
    }

    public void c() {
    }
}

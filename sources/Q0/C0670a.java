package q0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r0.AbstractC0675a;

/* renamed from: q0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0670a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0670a f8860d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f8861e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f8864c;

    /* renamed from: b, reason: collision with root package name */
    public final Set f8863b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final Map f8862a = new HashMap();

    public C0670a(Context context) {
        this.f8864c = context.getApplicationContext();
    }

    public static C0670a e(Context context) {
        if (f8860d == null) {
            synchronized (f8861e) {
                try {
                    if (f8860d == null) {
                        f8860d = new C0670a(context);
                    }
                } finally {
                }
            }
        }
        return f8860d;
    }

    public void a() {
        try {
            try {
                AbstractC0675a.c("Startup");
                b(this.f8864c.getPackageManager().getProviderInfo(new ComponentName(this.f8864c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e3) {
                throw new d(e3);
            }
        } finally {
            AbstractC0675a.f();
        }
    }

    public void b(Bundle bundle) {
        String string = this.f8864c.getString(c.f8865a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f8863b.add(cls);
                        }
                    }
                }
                Iterator it = this.f8863b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e3) {
                throw new d(e3);
            }
        }
    }

    public Object c(Class cls) {
        Object obj;
        synchronized (f8861e) {
            try {
                obj = this.f8862a.get(cls);
                if (obj == null) {
                    obj = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final Object d(Class cls, Set set) {
        Object obj;
        if (AbstractC0675a.h()) {
            try {
                AbstractC0675a.c(cls.getSimpleName());
            } catch (Throwable th) {
                AbstractC0675a.f();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f8862a.containsKey(cls)) {
            obj = this.f8862a.get(cls);
        } else {
            set.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> a3 = bVar.a();
                if (!a3.isEmpty()) {
                    for (Class cls2 : a3) {
                        if (!this.f8862a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                obj = bVar.b(this.f8864c);
                set.remove(cls);
                this.f8862a.put(cls, obj);
            } catch (Throwable th2) {
                throw new d(th2);
            }
        }
        AbstractC0675a.f();
        return obj;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f8863b.contains(cls);
    }
}

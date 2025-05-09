package o0;

import C2.k;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0347h;
import androidx.lifecycle.InterfaceC0349j;
import androidx.lifecycle.l;
import j.AbstractC0515e;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import o0.C0643d;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641b implements InterfaceC0349j {

    /* renamed from: b, reason: collision with root package name */
    public static final a f8768b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final f f8769a;

    /* renamed from: o0.b$a */
    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public a() {
        }
    }

    public C0641b(f fVar) {
        k.e(fVar, "owner");
        this.f8769a = fVar;
    }

    @Override // androidx.lifecycle.InterfaceC0349j
    public void d(l lVar, AbstractC0347h.a aVar) {
        k.e(lVar, "source");
        k.e(aVar, "event");
        if (aVar != AbstractC0347h.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        lVar.h().c(this);
        Bundle b3 = this.f8769a.m().b("androidx.savedstate.Restarter");
        if (b3 == null) {
            return;
        }
        ArrayList<String> stringArrayList = b3.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            h(it.next());
        }
    }

    public final void h(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, C0641b.class.getClassLoader()).asSubclass(C0643d.a.class);
            k.d(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    k.d(newInstance, "{\n                constr…wInstance()\n            }");
                    AbstractC0515e.a(newInstance);
                    throw null;
                } catch (Exception e3) {
                    throw new RuntimeException("Failed to instantiate " + str, e3);
                }
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("Class " + str + " wasn't found", e5);
        }
    }
}

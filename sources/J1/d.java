package J1;

import B1.l;
import G1.b;
import O1.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.O;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f866a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f867b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f868c;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f869a;

        /* renamed from: J1.d$a$a, reason: collision with other inner class name */
        public static final class C0026a {

            /* renamed from: a, reason: collision with root package name */
            public Object f870a;

            /* renamed from: b, reason: collision with root package name */
            public l.b f871b;

            public C0026a(Object obj, l.b bVar) {
                this.f870a = obj;
                this.f871b = bVar;
            }
        }

        public a(Class cls) {
            this.f869a = cls;
        }

        public abstract O a(O o3);

        public final Class b() {
            return this.f869a;
        }

        public Map c() {
            return Collections.EMPTY_MAP;
        }

        public abstract O d(AbstractC0417h abstractC0417h);

        public abstract void e(O o3);
    }

    public d(Class cls, m... mVarArr) {
        this.f866a = cls;
        HashMap hashMap = new HashMap();
        for (m mVar : mVarArr) {
            if (hashMap.containsKey(mVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + mVar.b().getCanonicalName());
            }
            hashMap.put(mVar.b(), mVar);
        }
        if (mVarArr.length > 0) {
            this.f868c = mVarArr[0].b();
        } else {
            this.f868c = Void.class;
        }
        this.f867b = Collections.unmodifiableMap(hashMap);
    }

    public b.EnumC0011b a() {
        return b.EnumC0011b.f580e;
    }

    public final Class b() {
        return this.f868c;
    }

    public final Class c() {
        return this.f866a;
    }

    public abstract String d();

    public final Object e(O o3, Class cls) {
        m mVar = (m) this.f867b.get(cls);
        if (mVar != null) {
            return mVar.a(o3);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a f();

    public abstract y.c g();

    public abstract O h(AbstractC0417h abstractC0417h);

    public final Set i() {
        return this.f867b.keySet();
    }

    public abstract void j(O o3);
}

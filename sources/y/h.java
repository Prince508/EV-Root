package Y;

import V.k;
import X.f;
import X.h;
import Y.d;
import androidx.datastore.preferences.protobuf.AbstractC0333t;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import q2.n;
import r2.u;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final h f2390a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final String f2391b = "preferences_pb";

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2392a;

        static {
            int[] iArr = new int[h.b.values().length];
            iArr[h.b.BOOLEAN.ordinal()] = 1;
            iArr[h.b.FLOAT.ordinal()] = 2;
            iArr[h.b.DOUBLE.ordinal()] = 3;
            iArr[h.b.INTEGER.ordinal()] = 4;
            iArr[h.b.LONG.ordinal()] = 5;
            iArr[h.b.STRING.ordinal()] = 6;
            iArr[h.b.STRING_SET.ordinal()] = 7;
            iArr[h.b.VALUE_NOT_SET.ordinal()] = 8;
            f2392a = iArr;
        }
    }

    @Override // V.k
    public Object b(InputStream inputStream, s2.e eVar) {
        X.f a3 = X.d.f2355a.a(inputStream);
        Y.a b3 = e.b(new d.b[0]);
        Map K3 = a3.K();
        C2.k.d(K3, "preferencesProto.preferencesMap");
        for (Map.Entry entry : K3.entrySet()) {
            String str = (String) entry.getKey();
            X.h hVar = (X.h) entry.getValue();
            h hVar2 = f2390a;
            C2.k.d(str, "name");
            C2.k.d(hVar, "value");
            hVar2.d(str, hVar, b3);
        }
        return b3.d();
    }

    public final void d(String str, X.h hVar, Y.a aVar) {
        h.b X2 = hVar.X();
        switch (X2 == null ? -1 : a.f2392a[X2.ordinal()]) {
            case -1:
                throw new V.a("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new q2.f();
            case 1:
                aVar.j(f.a(str), Boolean.valueOf(hVar.P()));
                return;
            case 2:
                aVar.j(f.c(str), Float.valueOf(hVar.S()));
                return;
            case 3:
                aVar.j(f.b(str), Double.valueOf(hVar.R()));
                return;
            case 4:
                aVar.j(f.d(str), Integer.valueOf(hVar.T()));
                return;
            case 5:
                aVar.j(f.e(str), Long.valueOf(hVar.U()));
                return;
            case 6:
                d.a f3 = f.f(str);
                String V2 = hVar.V();
                C2.k.d(V2, "value.string");
                aVar.j(f3, V2);
                return;
            case 7:
                d.a g3 = f.g(str);
                List M3 = hVar.W().M();
                C2.k.d(M3, "value.stringSet.stringsList");
                aVar.j(g3, u.A(M3));
                return;
            case 8:
                throw new V.a("Value not set.", null, 2, null);
        }
    }

    @Override // V.k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public d c() {
        return e.a();
    }

    public final String f() {
        return f2391b;
    }

    public final X.h g(Object obj) {
        if (obj instanceof Boolean) {
            AbstractC0333t m3 = X.h.Y().u(((Boolean) obj).booleanValue()).m();
            C2.k.d(m3, "newBuilder().setBoolean(value).build()");
            return (X.h) m3;
        }
        if (obj instanceof Float) {
            AbstractC0333t m4 = X.h.Y().w(((Number) obj).floatValue()).m();
            C2.k.d(m4, "newBuilder().setFloat(value).build()");
            return (X.h) m4;
        }
        if (obj instanceof Double) {
            AbstractC0333t m5 = X.h.Y().v(((Number) obj).doubleValue()).m();
            C2.k.d(m5, "newBuilder().setDouble(value).build()");
            return (X.h) m5;
        }
        if (obj instanceof Integer) {
            AbstractC0333t m6 = X.h.Y().x(((Number) obj).intValue()).m();
            C2.k.d(m6, "newBuilder().setInteger(value).build()");
            return (X.h) m6;
        }
        if (obj instanceof Long) {
            AbstractC0333t m7 = X.h.Y().y(((Number) obj).longValue()).m();
            C2.k.d(m7, "newBuilder().setLong(value).build()");
            return (X.h) m7;
        }
        if (obj instanceof String) {
            AbstractC0333t m8 = X.h.Y().z((String) obj).m();
            C2.k.d(m8, "newBuilder().setString(value).build()");
            return (X.h) m8;
        }
        if (!(obj instanceof Set)) {
            throw new IllegalStateException(C2.k.j("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
        AbstractC0333t m9 = X.h.Y().A(X.g.N().u((Set) obj)).m();
        C2.k.d(m9, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
        return (X.h) m9;
    }

    @Override // V.k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object a(d dVar, OutputStream outputStream, s2.e eVar) {
        Map a3 = dVar.a();
        f.a N3 = X.f.N();
        for (Map.Entry entry : a3.entrySet()) {
            N3.u(((d.a) entry.getKey()).a(), g(entry.getValue()));
        }
        ((X.f) N3.m()).m(outputStream);
        return n.f8874a;
    }
}

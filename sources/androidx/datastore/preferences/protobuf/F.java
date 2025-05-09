package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C;
import java.util.Map;

/* loaded from: classes.dex */
public class F implements E {
    public static int i(int i3, Object obj, Object obj2) {
        D d3 = (D) obj;
        C c3 = (C) obj2;
        int i4 = 0;
        if (d3.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : d3.entrySet()) {
            i4 += c3.a(i3, entry.getKey(), entry.getValue());
        }
        return i4;
    }

    public static D j(Object obj, Object obj2) {
        D d3 = (D) obj;
        D d4 = (D) obj2;
        if (!d4.isEmpty()) {
            if (!d3.j()) {
                d3 = d3.m();
            }
            d3.l(d4);
        }
        return d3;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Map b(Object obj) {
        return (D) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object c(Object obj) {
        return D.e().m();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public int d(int i3, Object obj, Object obj2) {
        return i(i3, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Map e(Object obj) {
        return (D) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public boolean f(Object obj) {
        return !((D) obj).j();
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object g(Object obj) {
        ((D) obj).k();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public C.a h(Object obj) {
        return ((C) obj).c();
    }
}

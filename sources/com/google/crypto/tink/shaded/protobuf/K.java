package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.H;
import j.AbstractC0515e;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class K implements J {
    public static int i(int i3, Object obj, Object obj2) {
        I i4 = (I) obj;
        AbstractC0515e.a(obj2);
        if (i4.isEmpty()) {
            return 0;
        }
        Iterator it = i4.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static I j(Object obj, Object obj2) {
        I i3 = (I) obj;
        I i4 = (I) obj2;
        if (!i4.isEmpty()) {
            if (!i3.j()) {
                i3 = i3.m();
            }
            i3.l(i4);
        }
        return i3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Map b(Object obj) {
        return (I) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Object c(Object obj) {
        return I.e().m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public int d(int i3, Object obj, Object obj2) {
        return i(i3, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Map e(Object obj) {
        return (I) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public boolean f(Object obj) {
        return !((I) obj).j();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public Object g(Object obj) {
        ((I) obj).k();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public H.a h(Object obj) {
        AbstractC0515e.a(obj);
        throw null;
    }
}

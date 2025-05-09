package C2;

import H2.g;

/* loaded from: classes.dex */
public abstract class p extends r implements H2.g {
    public p(Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, i3);
    }

    @Override // C2.c
    public H2.a c() {
        return u.e(this);
    }

    @Override // H2.g
    public g.a i() {
        ((H2.g) n()).i();
        return null;
    }

    @Override // B2.l
    public Object j(Object obj) {
        return get(obj);
    }
}

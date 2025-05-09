package v2;

import C2.k;
import java.io.Serializable;
import r2.AbstractC0690c;
import r2.AbstractC0697j;

/* loaded from: classes.dex */
public final class c extends AbstractC0690c implements a, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final Enum[] f9890f;

    public c(Enum[] enumArr) {
        k.e(enumArr, "entries");
        this.f9890f = enumArr;
    }

    @Override // r2.AbstractC0689b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return l((Enum) obj);
        }
        return false;
    }

    @Override // r2.AbstractC0690c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return n((Enum) obj);
        }
        return -1;
    }

    @Override // r2.AbstractC0689b
    public int j() {
        return this.f9890f.length;
    }

    public boolean l(Enum r3) {
        k.e(r3, "element");
        return ((Enum) AbstractC0697j.i(this.f9890f, r3.ordinal())) == r3;
    }

    @Override // r2.AbstractC0690c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return o((Enum) obj);
        }
        return -1;
    }

    @Override // r2.AbstractC0690c, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Enum get(int i3) {
        AbstractC0690c.f8995e.a(i3, this.f9890f.length);
        return this.f9890f[i3];
    }

    public int n(Enum r3) {
        k.e(r3, "element");
        int ordinal = r3.ordinal();
        if (((Enum) AbstractC0697j.i(this.f9890f, ordinal)) == r3) {
            return ordinal;
        }
        return -1;
    }

    public int o(Enum r22) {
        k.e(r22, "element");
        return indexOf(r22);
    }
}

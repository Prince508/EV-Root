package G2;

import C2.g;

/* loaded from: classes.dex */
public final class c extends G2.a {

    /* renamed from: i, reason: collision with root package name */
    public static final a f591i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final c f592j = new c(1, 0);

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public c(int i3, int i4) {
        super(i3, i4, 1);
    }

    @Override // G2.a
    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return i() == cVar.i() && j() == cVar.j();
    }

    @Override // G2.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (i() * 31) + j();
    }

    @Override // G2.a
    public boolean isEmpty() {
        return i() > j();
    }

    @Override // G2.a
    public String toString() {
        return i() + ".." + j();
    }
}

package F0;

import H0.k;
import L0.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f555a;

    /* renamed from: b, reason: collision with root package name */
    public final List f556b;

    public g(int i3, List list) {
        this.f555a = i3;
        this.f556b = list;
    }

    public static int a(List list) {
        int l3;
        if (list == null) {
            throw new IllegalArgumentException("Can't calculate minimum SDK version of null nodes");
        }
        Iterator it = list.iterator();
        int i3 = 28;
        while (it.hasNext()) {
            k kVar = ((d.a) it.next()).f1330c;
            if (kVar != null && (l3 = kVar.l()) > i3) {
                i3 = l3;
            }
        }
        return i3;
    }

    public static g b(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        g gVar = (g) list.get(0);
        for (int i3 = 1; i3 < list.size(); i3++) {
            gVar = gVar.e((g) list.get(i3));
        }
        return gVar;
    }

    public static g f(byte[] bArr) {
        List a3 = L0.d.a(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
        return new g(a(a3), a3);
    }

    public g c(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException("x509Certificate == null");
        }
        for (int i3 = 0; i3 < this.f556b.size(); i3++) {
            if (((d.a) this.f556b.get(i3)).f1328a.equals(x509Certificate)) {
                return new g(this.f555a, new ArrayList(this.f556b.subList(0, i3 + 1)));
            }
        }
        throw new IllegalArgumentException("Certificate not found in SigningCertificateLineage");
    }

    public boolean d(X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            throw new NullPointerException("cert == null");
        }
        for (int i3 = 0; i3 < this.f556b.size(); i3++) {
            if (((d.a) this.f556b.get(i3)).f1328a.equals(x509Certificate)) {
                return true;
            }
        }
        return false;
    }

    public g e(g gVar) {
        g gVar2;
        g gVar3;
        int i3 = 0;
        if (gVar.d(((d.a) this.f556b.get(0)).f1328a)) {
            gVar3 = this;
            gVar2 = gVar;
        } else {
            gVar2 = this;
            gVar3 = gVar;
        }
        d.a aVar = (d.a) gVar3.f556b.get(0);
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (i3 >= gVar2.g()) {
                break;
            }
            int i4 = i3 + 1;
            d.a aVar2 = (d.a) gVar2.f556b.get(i3);
            if (aVar2.f1328a.equals(aVar.f1328a)) {
                i3 = i4;
                break;
            }
            arrayList.add(aVar2);
            i3 = i4;
        }
        if (i3 == arrayList.size()) {
            throw new IllegalArgumentException("The provided lineage is not a descendant or an ancestor of this lineage");
        }
        arrayList.add(aVar);
        int i5 = 1;
        while (i3 < gVar2.g() && i5 < gVar3.g()) {
            int i6 = i3 + 1;
            d.a aVar3 = (d.a) gVar2.f556b.get(i3);
            int i7 = i5 + 1;
            d.a aVar4 = (d.a) gVar3.f556b.get(i5);
            if (!aVar3.f1328a.equals(aVar4.f1328a)) {
                throw new IllegalArgumentException("The provided lineage diverges from this lineage");
            }
            arrayList.add(aVar4);
            i3 = i6;
            i5 = i7;
        }
        while (i3 < gVar2.g()) {
            arrayList.add((d.a) gVar2.f556b.get(i3));
            i3++;
        }
        while (i5 < gVar3.g()) {
            arrayList.add((d.a) gVar3.f556b.get(i5));
            i5++;
        }
        return new g(Math.min(this.f555a, gVar.f555a), arrayList);
    }

    public int g() {
        return this.f556b.size();
    }
}

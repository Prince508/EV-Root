package J2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r2.AbstractC0700m;
import r2.AbstractC0701n;
import r2.u;

/* loaded from: classes.dex */
public abstract class g extends d {
    public static final B2.l d(final String str) {
        return str.length() == 0 ? new B2.l() { // from class: J2.e
            @Override // B2.l
            public final Object j(Object obj) {
                String e3;
                e3 = g.e((String) obj);
                return e3;
            }
        } : new B2.l() { // from class: J2.f
            @Override // B2.l
            public final Object j(Object obj) {
                String f3;
                f3 = g.f(str, (String) obj);
                return f3;
            }
        };
    }

    public static final String e(String str) {
        C2.k.e(str, "line");
        return str;
    }

    public static final String f(String str, String str2) {
        C2.k.e(str2, "line");
        return str + str2;
    }

    public static final int g(String str) {
        int length = str.length();
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (!a.c(str.charAt(i3))) {
                break;
            }
            i3++;
        }
        return i3 == -1 ? str.length() : i3;
    }

    public static final String h(String str, String str2) {
        Appendable q3;
        String str3;
        C2.k.e(str, "<this>");
        C2.k.e(str2, "newIndent");
        List D3 = o.D(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : D3) {
            if (!o.y((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0701n.k(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(g((String) it.next())));
        }
        Integer num = (Integer) u.v(arrayList2);
        int i3 = 0;
        int intValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * D3.size());
        B2.l d3 = d(str2);
        int g3 = AbstractC0700m.g(D3);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : D3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0700m.j();
            }
            String str4 = (String) obj2;
            if ((i3 == 0 || i3 == g3) && o.y(str4)) {
                str4 = null;
            } else {
                String L3 = q.L(str4, intValue);
                if (L3 != null && (str3 = (String) d3.j(L3)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i3 = i4;
        }
        q3 = u.q(arrayList3, new StringBuilder(length), (r14 & 2) != 0 ? ", " : "\n", (r14 & 4) != 0 ? "" : null, (r14 & 8) == 0 ? null : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : null);
        return ((StringBuilder) q3).toString();
    }

    public static String i(String str) {
        C2.k.e(str, "<this>");
        return h(str, "");
    }
}

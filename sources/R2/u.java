package r2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class u extends t {
    public static Set A(Iterable iterable) {
        C2.k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC0687E.c((Set) w(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC0687E.b();
        }
        if (size != 1) {
            return (Set) w(iterable, new LinkedHashSet(AbstractC0684B.a(collection.size())));
        }
        return AbstractC0686D.a(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static boolean o(Iterable iterable, Object obj) {
        C2.k.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : p(iterable, obj) >= 0;
    }

    public static final int p(Iterable iterable, Object obj) {
        C2.k.e(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i3 = 0;
        for (Object obj2 : iterable) {
            if (i3 < 0) {
                AbstractC0700m.j();
            }
            if (C2.k.a(obj, obj2)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public static final Appendable q(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, B2.l lVar) {
        C2.k.e(iterable, "<this>");
        C2.k.e(appendable, "buffer");
        C2.k.e(charSequence, "separator");
        C2.k.e(charSequence2, "prefix");
        C2.k.e(charSequence3, "postfix");
        C2.k.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i4 = 0;
        for (Object obj : iterable) {
            i4++;
            if (i4 > 1) {
                appendable.append(charSequence);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            J2.d.a(appendable, obj, lVar);
        }
        if (i3 >= 0 && i4 > i3) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String s(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, B2.l lVar) {
        C2.k.e(iterable, "<this>");
        C2.k.e(charSequence, "separator");
        C2.k.e(charSequence2, "prefix");
        C2.k.e(charSequence3, "postfix");
        C2.k.e(charSequence4, "truncated");
        return ((StringBuilder) q(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i3, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String t(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, B2.l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i4 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i4 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        if ((i4 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i4 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        B2.l lVar2 = lVar;
        return s(iterable, charSequence, charSequence2, charSequence3, i3, charSequence5, lVar2);
    }

    public static Object u(List list) {
        C2.k.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC0700m.g(list));
    }

    public static Comparable v(Iterable iterable) {
        C2.k.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final Collection w(Iterable iterable, Collection collection) {
        C2.k.e(iterable, "<this>");
        C2.k.e(collection, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
        return collection;
    }

    public static List x(Iterable iterable) {
        C2.k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC0700m.i(y(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return AbstractC0700m.f();
        }
        if (size != 1) {
            return z(collection);
        }
        return AbstractC0699l.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final List y(Iterable iterable) {
        C2.k.e(iterable, "<this>");
        return iterable instanceof Collection ? z((Collection) iterable) : (List) w(iterable, new ArrayList());
    }

    public static List z(Collection collection) {
        C2.k.e(collection, "<this>");
        return new ArrayList(collection);
    }
}

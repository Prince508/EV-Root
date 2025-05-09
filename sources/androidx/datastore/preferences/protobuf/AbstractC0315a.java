package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.J;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0315a implements J {
    protected int memoizedHashCode = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0081a implements J.a {
        public static void h(Iterable iterable, List list) {
            AbstractC0334u.a(iterable);
            if (!(iterable instanceof InterfaceC0339z)) {
                i(iterable, list);
                return;
            }
            List e3 = ((InterfaceC0339z) iterable).e();
            InterfaceC0339z interfaceC0339z = (InterfaceC0339z) list;
            int size = list.size();
            for (Object obj : e3) {
                if (obj == null) {
                    String str = "Element at index " + (interfaceC0339z.size() - size) + " is null.";
                    for (int size2 = interfaceC0339z.size() - 1; size2 >= size; size2--) {
                        interfaceC0339z.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC0320f) {
                    interfaceC0339z.g((AbstractC0320f) obj);
                } else {
                    interfaceC0339z.add((String) obj);
                }
            }
        }

        public static void i(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        public static e0 l(J j3) {
            return new e0(j3);
        }

        public abstract AbstractC0081a j(AbstractC0315a abstractC0315a);

        @Override // androidx.datastore.preferences.protobuf.J.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public AbstractC0081a g(J j3) {
            if (c().getClass().isInstance(j3)) {
                return j((AbstractC0315a) j3);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public static void h(Iterable iterable, List list) {
        AbstractC0081a.h(iterable, list);
    }

    public abstract int i();

    public int j(Y y3) {
        int i3 = i();
        if (i3 != -1) {
            return i3;
        }
        int d3 = y3.d(this);
        l(d3);
        return d3;
    }

    public e0 k() {
        return new e0(this);
    }

    public abstract void l(int i3);

    public void m(OutputStream outputStream) {
        AbstractC0323i Z2 = AbstractC0323i.Z(outputStream, AbstractC0323i.C(a()));
        f(Z2);
        Z2.W();
    }
}

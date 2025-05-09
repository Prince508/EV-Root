package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0334u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f3540a;

    /* renamed from: b, reason: collision with root package name */
    public static final A f3541b;

    public static final class b extends A {

        /* renamed from: c, reason: collision with root package name */
        public static final Class f3542c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public b() {
            super();
        }

        public static List f(Object obj, long j3) {
            return (List) j0.A(obj, j3);
        }

        public static List g(Object obj, long j3, int i3) {
            List f3 = f(obj, j3);
            if (f3.isEmpty()) {
                List c0338y = f3 instanceof InterfaceC0339z ? new C0338y(i3) : new ArrayList(i3);
                j0.O(obj, j3, c0338y);
                return c0338y;
            }
            if (f3542c.isAssignableFrom(f3.getClass())) {
                ArrayList arrayList = new ArrayList(f3.size() + i3);
                arrayList.addAll(f3);
                j0.O(obj, j3, arrayList);
                return arrayList;
            }
            if (!(f3 instanceof i0)) {
                return f3;
            }
            C0338y c0338y2 = new C0338y(f3.size() + i3);
            c0338y2.addAll((i0) f3);
            j0.O(obj, j3, c0338y2);
            return c0338y2;
        }

        @Override // androidx.datastore.preferences.protobuf.A
        public void c(Object obj, long j3) {
            Object unmodifiableList;
            List list = (List) j0.A(obj, j3);
            if (list instanceof InterfaceC0339z) {
                unmodifiableList = ((InterfaceC0339z) list).a();
            } else if (f3542c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            j0.O(obj, j3, unmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.A
        public void d(Object obj, Object obj2, long j3) {
            List f3 = f(obj2, j3);
            List g3 = g(obj, j3, f3.size());
            int size = g3.size();
            int size2 = f3.size();
            if (size > 0 && size2 > 0) {
                g3.addAll(f3);
            }
            if (size > 0) {
                f3 = g3;
            }
            j0.O(obj, j3, f3);
        }

        @Override // androidx.datastore.preferences.protobuf.A
        public List e(Object obj, long j3) {
            return g(obj, j3, 10);
        }
    }

    public static final class c extends A {
        public c() {
            super();
        }

        public static AbstractC0334u.b f(Object obj, long j3) {
            return (AbstractC0334u.b) j0.A(obj, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.A
        public void c(Object obj, long j3) {
            f(obj, j3).b();
        }

        @Override // androidx.datastore.preferences.protobuf.A
        public void d(Object obj, Object obj2, long j3) {
            AbstractC0334u.b f3 = f(obj, j3);
            AbstractC0334u.b f4 = f(obj2, j3);
            int size = f3.size();
            int size2 = f4.size();
            if (size > 0 && size2 > 0) {
                if (!f3.f()) {
                    f3 = f3.d(size2 + size);
                }
                f3.addAll(f4);
            }
            if (size > 0) {
                f4 = f3;
            }
            j0.O(obj, j3, f4);
        }

        @Override // androidx.datastore.preferences.protobuf.A
        public List e(Object obj, long j3) {
            AbstractC0334u.b f3 = f(obj, j3);
            if (f3.f()) {
                return f3;
            }
            int size = f3.size();
            AbstractC0334u.b d3 = f3.d(size == 0 ? 10 : size * 2);
            j0.O(obj, j3, d3);
            return d3;
        }
    }

    static {
        f3540a = new b();
        f3541b = new c();
    }

    public static A a() {
        return f3540a;
    }

    public static A b() {
        return f3541b;
    }

    public abstract void c(Object obj, long j3);

    public abstract void d(Object obj, Object obj2, long j3);

    public abstract List e(Object obj, long j3);

    public A() {
    }
}

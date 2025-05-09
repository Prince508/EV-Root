package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC0434z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final E f5731a;

    /* renamed from: b, reason: collision with root package name */
    public static final E f5732b;

    public static final class b extends E {

        /* renamed from: c, reason: collision with root package name */
        public static final Class f5733c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public b() {
            super();
        }

        public static List f(Object obj, long j3) {
            return (List) o0.C(obj, j3);
        }

        public static List g(Object obj, long j3, int i3) {
            List f3 = f(obj, j3);
            if (f3.isEmpty()) {
                List c3 = f3 instanceof D ? new C(i3) : ((f3 instanceof Y) && (f3 instanceof AbstractC0434z.d)) ? ((AbstractC0434z.d) f3).d(i3) : new ArrayList(i3);
                o0.R(obj, j3, c3);
                return c3;
            }
            if (f5733c.isAssignableFrom(f3.getClass())) {
                ArrayList arrayList = new ArrayList(f3.size() + i3);
                arrayList.addAll(f3);
                o0.R(obj, j3, arrayList);
                return arrayList;
            }
            if (f3 instanceof n0) {
                C c4 = new C(f3.size() + i3);
                c4.addAll((n0) f3);
                o0.R(obj, j3, c4);
                return c4;
            }
            if ((f3 instanceof Y) && (f3 instanceof AbstractC0434z.d)) {
                AbstractC0434z.d dVar = (AbstractC0434z.d) f3;
                if (!dVar.f()) {
                    AbstractC0434z.d d3 = dVar.d(f3.size() + i3);
                    o0.R(obj, j3, d3);
                    return d3;
                }
            }
            return f3;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public void c(Object obj, long j3) {
            Object unmodifiableList;
            List list = (List) o0.C(obj, j3);
            if (list instanceof D) {
                unmodifiableList = ((D) list).a();
            } else {
                if (f5733c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof Y) && (list instanceof AbstractC0434z.d)) {
                    AbstractC0434z.d dVar = (AbstractC0434z.d) list;
                    if (dVar.f()) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            o0.R(obj, j3, unmodifiableList);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
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
            o0.R(obj, j3, f3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public List e(Object obj, long j3) {
            return g(obj, j3, 10);
        }
    }

    public static final class c extends E {
        public c() {
            super();
        }

        public static AbstractC0434z.d f(Object obj, long j3) {
            return (AbstractC0434z.d) o0.C(obj, j3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public void c(Object obj, long j3) {
            f(obj, j3).b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public void d(Object obj, Object obj2, long j3) {
            AbstractC0434z.d f3 = f(obj, j3);
            AbstractC0434z.d f4 = f(obj2, j3);
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
            o0.R(obj, j3, f4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.E
        public List e(Object obj, long j3) {
            AbstractC0434z.d f3 = f(obj, j3);
            if (f3.f()) {
                return f3;
            }
            int size = f3.size();
            AbstractC0434z.d d3 = f3.d(size == 0 ? 10 : size * 2);
            o0.R(obj, j3, d3);
            return d3;
        }
    }

    static {
        f5731a = new b();
        f5732b = new c();
    }

    public static E a() {
        return f5731a;
    }

    public static E b() {
        return f5732b;
    }

    public abstract void c(Object obj, long j3);

    public abstract void d(Object obj, Object obj2, long j3);

    public abstract List e(Object obj, long j3);

    public E() {
    }
}

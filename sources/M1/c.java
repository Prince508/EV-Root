package M1;

import B1.k;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final M1.a f1362a;

    /* renamed from: b, reason: collision with root package name */
    public final List f1363b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f1364c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f1365a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public M1.a f1366b = M1.a.f1359b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f1367c = null;

        public b a(k kVar, int i3, String str, String str2) {
            ArrayList arrayList = this.f1365a;
            if (arrayList == null) {
                throw new IllegalStateException("addEntry cannot be called after build()");
            }
            arrayList.add(new C0037c(kVar, i3, str, str2));
            return this;
        }

        public c b() {
            if (this.f1365a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            Integer num = this.f1367c;
            if (num != null && !c(num.intValue())) {
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            c cVar = new c(this.f1366b, Collections.unmodifiableList(this.f1365a), this.f1367c);
            this.f1365a = null;
            return cVar;
        }

        public final boolean c(int i3) {
            Iterator it = this.f1365a.iterator();
            while (it.hasNext()) {
                if (((C0037c) it.next()).a() == i3) {
                    return true;
                }
            }
            return false;
        }

        public b d(M1.a aVar) {
            if (this.f1365a == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build()");
            }
            this.f1366b = aVar;
            return this;
        }

        public b e(int i3) {
            if (this.f1365a == null) {
                throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
            }
            this.f1367c = Integer.valueOf(i3);
            return this;
        }
    }

    /* renamed from: M1.c$c, reason: collision with other inner class name */
    public static final class C0037c {

        /* renamed from: a, reason: collision with root package name */
        public final k f1368a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1369b;

        /* renamed from: c, reason: collision with root package name */
        public final String f1370c;

        /* renamed from: d, reason: collision with root package name */
        public final String f1371d;

        public int a() {
            return this.f1369b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0037c)) {
                return false;
            }
            C0037c c0037c = (C0037c) obj;
            return this.f1368a == c0037c.f1368a && this.f1369b == c0037c.f1369b && this.f1370c.equals(c0037c.f1370c) && this.f1371d.equals(c0037c.f1371d);
        }

        public int hashCode() {
            return Objects.hash(this.f1368a, Integer.valueOf(this.f1369b), this.f1370c, this.f1371d);
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f1368a, Integer.valueOf(this.f1369b), this.f1370c, this.f1371d);
        }

        public C0037c(k kVar, int i3, String str, String str2) {
            this.f1368a = kVar;
            this.f1369b = i3;
            this.f1370c = str;
            this.f1371d = str2;
        }
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1362a.equals(cVar.f1362a) && this.f1363b.equals(cVar.f1363b) && Objects.equals(this.f1364c, cVar.f1364c);
    }

    public int hashCode() {
        return Objects.hash(this.f1362a, this.f1363b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f1362a, this.f1363b, this.f1364c);
    }

    public c(M1.a aVar, List list, Integer num) {
        this.f1362a = aVar;
        this.f1363b = list;
        this.f1364c = num;
    }
}

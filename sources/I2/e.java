package I2;

import C2.k;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class e extends d {

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f833a;

        public a(Iterator it) {
            this.f833a = it;
        }

        @Override // I2.b
        public Iterator iterator() {
            return this.f833a;
        }
    }

    public static b a(Iterator it) {
        k.e(it, "<this>");
        return b(new a(it));
    }

    public static final b b(b bVar) {
        k.e(bVar, "<this>");
        return bVar instanceof I2.a ? bVar : new I2.a(bVar);
    }
}

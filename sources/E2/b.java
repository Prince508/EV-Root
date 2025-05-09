package E2;

import C2.k;
import java.util.Random;

/* loaded from: classes.dex */
public final class b extends E2.a {

    /* renamed from: g, reason: collision with root package name */
    public final a f342g = new a();

    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // E2.a
    public Random c() {
        Object obj = this.f342g.get();
        k.d(obj, "get(...)");
        return (Random) obj;
    }
}

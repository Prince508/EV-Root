package O2;

import K2.p0;
import P2.B;
import s2.i;

/* loaded from: classes.dex */
public abstract class p {

    public static final class a extends C2.l implements B2.p {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n f1639f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar) {
            super(2);
            this.f1639f = nVar;
        }

        public final Integer a(int i3, i.b bVar) {
            i.c key = bVar.getKey();
            i.b a3 = this.f1639f.f1632i.a(key);
            if (key != p0.f1211b) {
                return Integer.valueOf(bVar != a3 ? Integer.MIN_VALUE : i3 + 1);
            }
            p0 p0Var = (p0) a3;
            C2.k.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            p0 b3 = p.b((p0) bVar, p0Var);
            if (b3 == p0Var) {
                if (p0Var != null) {
                    i3++;
                }
                return Integer.valueOf(i3);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b3 + ", expected child of " + p0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // B2.p
        public /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (i.b) obj2);
        }
    }

    public static final void a(n nVar, s2.i iVar) {
        if (((Number) iVar.e(0, new a(nVar))).intValue() == nVar.f1633j) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + nVar.f1632i + ",\n\t\tbut emission happened in " + iVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final p0 b(p0 p0Var, p0 p0Var2) {
        while (p0Var != null) {
            if (p0Var == p0Var2 || !(p0Var instanceof B)) {
                return p0Var;
            }
            p0Var = p0Var.getParent();
        }
        return null;
    }
}

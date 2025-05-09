package u2;

/* loaded from: classes.dex */
public abstract class j extends AbstractC0748a {
    public j(s2.e eVar) {
        super(eVar);
        if (eVar != null && eVar.c() != s2.j.f9292e) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // s2.e
    public s2.i c() {
        return s2.j.f9292e;
    }
}

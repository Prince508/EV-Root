package Y1;

import Y1.I;
import android.view.KeyEvent;
import h2.i;

/* loaded from: classes.dex */
public class C implements I.d {

    /* renamed from: a, reason: collision with root package name */
    public final h2.i f2429a;

    /* renamed from: b, reason: collision with root package name */
    public final I.b f2430b = new I.b();

    public C(h2.i iVar) {
        this.f2429a = iVar;
    }

    @Override // Y1.I.d
    public void a(KeyEvent keyEvent, final I.d.a aVar) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.f2429a.d(new i.b(keyEvent, this.f2430b.a(keyEvent.getUnicodeChar())), action != 0, new i.a() { // from class: Y1.B
                @Override // h2.i.a
                public final void a(boolean z3) {
                    I.d.a.this.a(z3);
                }
            });
        } else {
            aVar.a(false);
        }
    }
}

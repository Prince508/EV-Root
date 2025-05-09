package Y1;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import h2.j;
import i2.InterfaceC0504b;
import io.flutter.plugin.editing.h;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public class I implements h.a, j.b {

    /* renamed from: a, reason: collision with root package name */
    public final d[] f2463a;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f2464b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final e f2465c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f2466a = 0;

        public Character a(int i3) {
            char c3 = (char) i3;
            if ((Integer.MIN_VALUE & i3) != 0) {
                int i4 = i3 & Integer.MAX_VALUE;
                int i5 = this.f2466a;
                if (i5 != 0) {
                    this.f2466a = KeyCharacterMap.getDeadChar(i5, i4);
                } else {
                    this.f2466a = i4;
                }
            } else {
                int i6 = this.f2466a;
                if (i6 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i6, i3);
                    if (deadChar > 0) {
                        c3 = (char) deadChar;
                    }
                    this.f2466a = 0;
                }
            }
            return Character.valueOf(c3);
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public final KeyEvent f2467a;

        /* renamed from: b, reason: collision with root package name */
        public int f2468b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2469c = false;

        public class a implements d.a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f2471a;

            public a() {
                this.f2471a = false;
            }

            @Override // Y1.I.d.a
            public void a(boolean z3) {
                if (this.f2471a) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.f2471a = true;
                c cVar = c.this;
                int i3 = cVar.f2468b - 1;
                cVar.f2468b = i3;
                boolean z4 = z3 | cVar.f2469c;
                cVar.f2469c = z4;
                if (i3 != 0 || z4) {
                    return;
                }
                I.this.e(cVar.f2467a);
            }
        }

        public c(KeyEvent keyEvent) {
            this.f2468b = I.this.f2463a.length;
            this.f2467a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    public interface d {

        public interface a {
            void a(boolean z3);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    public interface e {
        void a(KeyEvent keyEvent);

        boolean b(KeyEvent keyEvent);

        InterfaceC0504b getBinaryMessenger();
    }

    public I(e eVar) {
        this.f2465c = eVar;
        this.f2463a = new d[]{new H(eVar.getBinaryMessenger()), new C(new h2.i(eVar.getBinaryMessenger()))};
        new h2.j(eVar.getBinaryMessenger()).b(this);
    }

    @Override // h2.j.b
    public Map a() {
        return ((H) this.f2463a[0]).h();
    }

    @Override // io.flutter.plugin.editing.h.a
    public boolean b(KeyEvent keyEvent) {
        if (this.f2464b.remove(keyEvent)) {
            return false;
        }
        if (this.f2463a.length <= 0) {
            e(keyEvent);
            return true;
        }
        c cVar = new c(keyEvent);
        for (d dVar : this.f2463a) {
            dVar.a(keyEvent, cVar.a());
        }
        return true;
    }

    public void d() {
        int size = this.f2464b.size();
        if (size > 0) {
            W1.b.g("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }

    public final void e(KeyEvent keyEvent) {
        e eVar = this.f2465c;
        if (eVar == null || eVar.b(keyEvent)) {
            return;
        }
        this.f2464b.add(keyEvent);
        this.f2465c.a(keyEvent);
        if (this.f2464b.remove(keyEvent)) {
            W1.b.g("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }
}

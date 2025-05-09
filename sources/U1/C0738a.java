package u1;

import android.graphics.Typeface;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0738a extends AbstractC0743f {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f9614a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0159a f9615b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9616c;

    /* renamed from: u1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0159a {
        void a(Typeface typeface);
    }

    public C0738a(InterfaceC0159a interfaceC0159a, Typeface typeface) {
        this.f9614a = typeface;
        this.f9615b = interfaceC0159a;
    }

    @Override // u1.AbstractC0743f
    public void a(int i3) {
        d(this.f9614a);
    }

    @Override // u1.AbstractC0743f
    public void b(Typeface typeface, boolean z3) {
        d(typeface);
    }

    public void c() {
        this.f9616c = true;
    }

    public final void d(Typeface typeface) {
        if (this.f9616c) {
            return;
        }
        this.f9615b.a(typeface);
    }
}

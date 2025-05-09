package androidx.emoji2.text;

import J.g;
import a0.h;
import android.graphics.Typeface;
import android.util.SparseArray;
import b0.C0364b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final C0364b f3936a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f3937b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3938c = new a(1024);

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f3939d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray f3940a;

        /* renamed from: b, reason: collision with root package name */
        public a0.e f3941b;

        public a() {
            this(1);
        }

        public a a(int i3) {
            SparseArray sparseArray = this.f3940a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i3);
        }

        public final a0.e b() {
            return this.f3941b;
        }

        public void c(a0.e eVar, int i3, int i4) {
            a a3 = a(eVar.b(i3));
            if (a3 == null) {
                a3 = new a();
                this.f3940a.put(eVar.b(i3), a3);
            }
            if (i4 > i3) {
                a3.c(eVar, i3 + 1, i4);
            } else {
                a3.f3941b = eVar;
            }
        }

        public a(int i3) {
            this.f3940a = new SparseArray(i3);
        }
    }

    public f(Typeface typeface, C0364b c0364b) {
        this.f3939d = typeface;
        this.f3936a = c0364b;
        this.f3937b = new char[c0364b.k() * 2];
        a(c0364b);
    }

    public static f b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            G.d.a("EmojiCompat.MetadataRepo.create");
            return new f(typeface, h.b(byteBuffer));
        } finally {
            G.d.b();
        }
    }

    public final void a(C0364b c0364b) {
        int k3 = c0364b.k();
        for (int i3 = 0; i3 < k3; i3++) {
            a0.e eVar = new a0.e(this, i3);
            Character.toChars(eVar.f(), this.f3937b, i3 * 2);
            h(eVar);
        }
    }

    public char[] c() {
        return this.f3937b;
    }

    public C0364b d() {
        return this.f3936a;
    }

    public int e() {
        return this.f3936a.l();
    }

    public a f() {
        return this.f3938c;
    }

    public Typeface g() {
        return this.f3939d;
    }

    public void h(a0.e eVar) {
        g.h(eVar, "emoji metadata cannot be null");
        g.b(eVar.c() > 0, "invalid metadata codepoint length");
        this.f3938c.c(eVar, 0, eVar.c() - 1);
    }
}

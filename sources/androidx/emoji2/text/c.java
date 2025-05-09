package androidx.emoji2.text;

import a0.j;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class c {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f3880n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public static final Object f3881o = new Object();

    /* renamed from: p, reason: collision with root package name */
    public static volatile c f3882p;

    /* renamed from: b, reason: collision with root package name */
    public final Set f3884b;

    /* renamed from: e, reason: collision with root package name */
    public final b f3887e;

    /* renamed from: f, reason: collision with root package name */
    public final g f3888f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3889g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3890h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f3891i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3892j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3893k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3894l;

    /* renamed from: m, reason: collision with root package name */
    public final d f3895m;

    /* renamed from: a, reason: collision with root package name */
    public final ReadWriteLock f3883a = new ReentrantReadWriteLock();

    /* renamed from: c, reason: collision with root package name */
    public volatile int f3885c = 3;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f3886d = new Handler(Looper.getMainLooper());

    public static final class a extends b {

        /* renamed from: b, reason: collision with root package name */
        public volatile androidx.emoji2.text.d f3896b;

        /* renamed from: c, reason: collision with root package name */
        public volatile androidx.emoji2.text.f f3897c;

        /* renamed from: androidx.emoji2.text.c$a$a, reason: collision with other inner class name */
        public class C0085a extends h {
            public C0085a() {
            }

            @Override // androidx.emoji2.text.c.h
            public void a(Throwable th) {
                a.this.f3899a.m(th);
            }

            @Override // androidx.emoji2.text.c.h
            public void b(androidx.emoji2.text.f fVar) {
                a.this.d(fVar);
            }
        }

        public a(c cVar) {
            super(cVar);
        }

        @Override // androidx.emoji2.text.c.b
        public void a() {
            try {
                this.f3899a.f3888f.a(new C0085a());
            } catch (Throwable th) {
                this.f3899a.m(th);
            }
        }

        @Override // androidx.emoji2.text.c.b
        public CharSequence b(CharSequence charSequence, int i3, int i4, int i5, boolean z3) {
            return this.f3896b.h(charSequence, i3, i4, i5, z3);
        }

        @Override // androidx.emoji2.text.c.b
        public void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f3897c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f3899a.f3889g);
        }

        public void d(androidx.emoji2.text.f fVar) {
            if (fVar == null) {
                this.f3899a.m(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f3897c = fVar;
            androidx.emoji2.text.f fVar2 = this.f3897c;
            i iVar = new i();
            d dVar = this.f3899a.f3895m;
            c cVar = this.f3899a;
            this.f3896b = new androidx.emoji2.text.d(fVar2, iVar, dVar, cVar.f3890h, cVar.f3891i);
            this.f3899a.n();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f3899a;

        public b(c cVar) {
            this.f3899a = cVar;
        }

        public abstract void a();

        public abstract CharSequence b(CharSequence charSequence, int i3, int i4, int i5, boolean z3);

        public abstract void c(EditorInfo editorInfo);
    }

    /* renamed from: androidx.emoji2.text.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0086c {

        /* renamed from: a, reason: collision with root package name */
        public final g f3900a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3901b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3902c;

        /* renamed from: d, reason: collision with root package name */
        public int[] f3903d;

        /* renamed from: e, reason: collision with root package name */
        public Set f3904e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f3905f;

        /* renamed from: g, reason: collision with root package name */
        public int f3906g = -16711936;

        /* renamed from: h, reason: collision with root package name */
        public int f3907h = 0;

        /* renamed from: i, reason: collision with root package name */
        public d f3908i = new androidx.emoji2.text.b();

        public AbstractC0086c(g gVar) {
            J.g.h(gVar, "metadataLoader cannot be null.");
            this.f3900a = gVar;
        }

        public final g a() {
            return this.f3900a;
        }

        public AbstractC0086c b(int i3) {
            this.f3907h = i3;
            return this;
        }
    }

    public interface d {
        boolean a(CharSequence charSequence, int i3, int i4, int i5);
    }

    public static abstract class e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    public static class f implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final List f3909e;

        /* renamed from: f, reason: collision with root package name */
        public final Throwable f3910f;

        /* renamed from: g, reason: collision with root package name */
        public final int f3911g;

        public f(e eVar, int i3) {
            this(Arrays.asList((e) J.g.h(eVar, "initCallback cannot be null")), i3, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f3909e.size();
            int i3 = 0;
            if (this.f3911g != 1) {
                while (i3 < size) {
                    ((e) this.f3909e.get(i3)).a(this.f3910f);
                    i3++;
                }
            } else {
                while (i3 < size) {
                    ((e) this.f3909e.get(i3)).b();
                    i3++;
                }
            }
        }

        public f(Collection collection, int i3) {
            this(collection, i3, null);
        }

        public f(Collection collection, int i3, Throwable th) {
            J.g.h(collection, "initCallbacks cannot be null");
            this.f3909e = new ArrayList(collection);
            this.f3911g = i3;
            this.f3910f = th;
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(androidx.emoji2.text.f fVar);
    }

    public static class i {
        public a0.f a(a0.e eVar) {
            return new j(eVar);
        }
    }

    public c(AbstractC0086c abstractC0086c) {
        this.f3889g = abstractC0086c.f3901b;
        this.f3890h = abstractC0086c.f3902c;
        this.f3891i = abstractC0086c.f3903d;
        this.f3892j = abstractC0086c.f3905f;
        this.f3893k = abstractC0086c.f3906g;
        this.f3888f = abstractC0086c.f3900a;
        this.f3894l = abstractC0086c.f3907h;
        this.f3895m = abstractC0086c.f3908i;
        o.b bVar = new o.b();
        this.f3884b = bVar;
        Set set = abstractC0086c.f3904e;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(abstractC0086c.f3904e);
        }
        this.f3887e = new a(this);
        l();
    }

    public static c b() {
        c cVar;
        synchronized (f3880n) {
            cVar = f3882p;
            J.g.i(cVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return cVar;
    }

    public static boolean e(InputConnection inputConnection, Editable editable, int i3, int i4, boolean z3) {
        return androidx.emoji2.text.d.c(inputConnection, editable, i3, i4, z3);
    }

    public static boolean f(Editable editable, int i3, KeyEvent keyEvent) {
        return androidx.emoji2.text.d.d(editable, i3, keyEvent);
    }

    public static c g(AbstractC0086c abstractC0086c) {
        c cVar;
        c cVar2 = f3882p;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (f3880n) {
            try {
                cVar = f3882p;
                if (cVar == null) {
                    cVar = new c(abstractC0086c);
                    f3882p = cVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public static boolean h() {
        return f3882p != null;
    }

    public int c() {
        return this.f3893k;
    }

    public int d() {
        this.f3883a.readLock().lock();
        try {
            return this.f3885c;
        } finally {
            this.f3883a.readLock().unlock();
        }
    }

    public boolean i() {
        return this.f3892j;
    }

    public final boolean j() {
        return d() == 1;
    }

    public void k() {
        J.g.i(this.f3894l == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (j()) {
            return;
        }
        this.f3883a.writeLock().lock();
        try {
            if (this.f3885c == 0) {
                return;
            }
            this.f3885c = 0;
            this.f3883a.writeLock().unlock();
            this.f3887e.a();
        } finally {
            this.f3883a.writeLock().unlock();
        }
    }

    public final void l() {
        this.f3883a.writeLock().lock();
        try {
            if (this.f3894l == 0) {
                this.f3885c = 0;
            }
            this.f3883a.writeLock().unlock();
            if (d() == 0) {
                this.f3887e.a();
            }
        } catch (Throwable th) {
            this.f3883a.writeLock().unlock();
            throw th;
        }
    }

    public void m(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f3883a.writeLock().lock();
        try {
            this.f3885c = 2;
            arrayList.addAll(this.f3884b);
            this.f3884b.clear();
            this.f3883a.writeLock().unlock();
            this.f3886d.post(new f(arrayList, this.f3885c, th));
        } catch (Throwable th2) {
            this.f3883a.writeLock().unlock();
            throw th2;
        }
    }

    public void n() {
        ArrayList arrayList = new ArrayList();
        this.f3883a.writeLock().lock();
        try {
            this.f3885c = 1;
            arrayList.addAll(this.f3884b);
            this.f3884b.clear();
            this.f3883a.writeLock().unlock();
            this.f3886d.post(new f(arrayList, this.f3885c));
        } catch (Throwable th) {
            this.f3883a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence o(CharSequence charSequence) {
        return p(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence p(CharSequence charSequence, int i3, int i4) {
        return q(charSequence, i3, i4, Integer.MAX_VALUE);
    }

    public CharSequence q(CharSequence charSequence, int i3, int i4, int i5) {
        return r(charSequence, i3, i4, i5, 0);
    }

    public CharSequence r(CharSequence charSequence, int i3, int i4, int i5, int i6) {
        boolean z3;
        J.g.i(j(), "Not initialized yet");
        J.g.e(i3, "start cannot be negative");
        J.g.e(i4, "end cannot be negative");
        J.g.e(i5, "maxEmojiCount cannot be negative");
        J.g.b(i3 <= i4, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        J.g.b(i3 <= charSequence.length(), "start should be < than charSequence length");
        J.g.b(i4 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i3 == i4) {
            return charSequence;
        }
        if (i6 != 1) {
            z3 = i6 != 2 ? this.f3889g : false;
        } else {
            z3 = true;
        }
        return this.f3887e.b(charSequence, i3, i4, i5, z3);
    }

    public void s(e eVar) {
        J.g.h(eVar, "initCallback cannot be null");
        this.f3883a.writeLock().lock();
        try {
            if (this.f3885c != 1 && this.f3885c != 2) {
                this.f3884b.add(eVar);
                this.f3883a.writeLock().unlock();
            }
            this.f3886d.post(new f(eVar, this.f3885c));
            this.f3883a.writeLock().unlock();
        } catch (Throwable th) {
            this.f3883a.writeLock().unlock();
            throw th;
        }
    }

    public void t(e eVar) {
        J.g.h(eVar, "initCallback cannot be null");
        this.f3883a.writeLock().lock();
        try {
            this.f3884b.remove(eVar);
        } finally {
            this.f3883a.writeLock().unlock();
        }
    }

    public void u(EditorInfo editorInfo) {
        if (!j() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f3887e.c(editorInfo);
    }
}

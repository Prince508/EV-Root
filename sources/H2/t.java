package h2;

import a2.C0313a;
import android.os.Build;
import android.util.DisplayMetrics;
import i2.C0503a;
import i2.C0506d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class t {

    /* renamed from: b, reason: collision with root package name */
    public static final a f7389b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final C0503a f7390a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ConcurrentLinkedQueue f7391a = new ConcurrentLinkedQueue();

        /* renamed from: b, reason: collision with root package name */
        public b f7392b;

        /* renamed from: c, reason: collision with root package name */
        public b f7393c;

        /* renamed from: h2.t$a$a, reason: collision with other inner class name */
        public class C0122a implements C0503a.e {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b f7394a;

            public C0122a(b bVar) {
                this.f7394a = bVar;
            }

            @Override // i2.C0503a.e
            public void a(Object obj) {
                a.this.f7391a.remove(this.f7394a);
                if (a.this.f7391a.isEmpty()) {
                    return;
                }
                W1.b.b("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(this.f7394a.f7397a));
            }
        }

        public static class b {

            /* renamed from: c, reason: collision with root package name */
            public static int f7396c = Integer.MIN_VALUE;

            /* renamed from: a, reason: collision with root package name */
            public final int f7397a;

            /* renamed from: b, reason: collision with root package name */
            public final DisplayMetrics f7398b;

            public b(DisplayMetrics displayMetrics) {
                int i3 = f7396c;
                f7396c = i3 + 1;
                this.f7397a = i3;
                this.f7398b = displayMetrics;
            }
        }

        public C0503a.e b(b bVar) {
            this.f7391a.add(bVar);
            b bVar2 = this.f7393c;
            this.f7393c = bVar;
            if (bVar2 == null) {
                return null;
            }
            return new C0122a(bVar2);
        }

        public b c(int i3) {
            b bVar;
            if (this.f7392b == null) {
                this.f7392b = (b) this.f7391a.poll();
            }
            while (true) {
                bVar = this.f7392b;
                if (bVar == null || bVar.f7397a >= i3) {
                    break;
                }
                this.f7392b = (b) this.f7391a.poll();
            }
            if (bVar == null) {
                W1.b.b("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i3) + ", after exhausting the queue.");
                return null;
            }
            if (bVar.f7397a == i3) {
                return bVar;
            }
            W1.b.b("SettingsChannel", "Cannot find config with generation: " + String.valueOf(i3) + ", the oldest config is now: " + String.valueOf(this.f7392b.f7397a));
            return null;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final C0503a f7399a;

        /* renamed from: b, reason: collision with root package name */
        public Map f7400b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        public DisplayMetrics f7401c;

        public b(C0503a c0503a) {
            this.f7399a = c0503a;
        }

        public void a() {
            W1.b.f("SettingsChannel", "Sending message: \ntextScaleFactor: " + this.f7400b.get("textScaleFactor") + "\nalwaysUse24HourFormat: " + this.f7400b.get("alwaysUse24HourFormat") + "\nplatformBrightness: " + this.f7400b.get("platformBrightness"));
            DisplayMetrics displayMetrics = this.f7401c;
            if (!t.c() || displayMetrics == null) {
                this.f7399a.c(this.f7400b);
                return;
            }
            a.b bVar = new a.b(displayMetrics);
            C0503a.e b3 = t.f7389b.b(bVar);
            this.f7400b.put("configurationId", Integer.valueOf(bVar.f7397a));
            this.f7399a.d(this.f7400b, b3);
        }

        public b b(boolean z3) {
            this.f7400b.put("brieflyShowPassword", Boolean.valueOf(z3));
            return this;
        }

        public b c(DisplayMetrics displayMetrics) {
            this.f7401c = displayMetrics;
            return this;
        }

        public b d(boolean z3) {
            this.f7400b.put("nativeSpellCheckServiceDefined", Boolean.valueOf(z3));
            return this;
        }

        public b e(c cVar) {
            this.f7400b.put("platformBrightness", cVar.f7405e);
            return this;
        }

        public b f(float f3) {
            this.f7400b.put("textScaleFactor", Float.valueOf(f3));
            return this;
        }

        public b g(boolean z3) {
            this.f7400b.put("alwaysUse24HourFormat", Boolean.valueOf(z3));
            return this;
        }
    }

    public enum c {
        light("light"),
        dark("dark");


        /* renamed from: e, reason: collision with root package name */
        public String f7405e;

        c(String str) {
            this.f7405e = str;
        }
    }

    public t(C0313a c0313a) {
        this.f7390a = new C0503a(c0313a, "flutter/settings", C0506d.f7497a);
    }

    public static DisplayMetrics b(int i3) {
        a.b c3 = f7389b.c(i3);
        if (c3 == null) {
            return null;
        }
        return c3.f7398b;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public b d() {
        return new b(this.f7390a);
    }
}

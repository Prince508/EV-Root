package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import d.h;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0513c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f7930f;

    /* renamed from: a, reason: collision with root package name */
    public int f7931a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f7932b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f7933c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f7934d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f7935e;

    /* renamed from: j.c$a */
    public static class a {
        public static Context a(C0513c c0513c, Configuration configuration) {
            return c0513c.createConfigurationContext(configuration);
        }
    }

    public C0513c(Context context, int i3) {
        super(context);
        this.f7931a = i3;
    }

    public static boolean d(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f7930f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f7930f = configuration2;
        }
        return configuration.equals(f7930f);
    }

    public final Resources a() {
        if (this.f7935e == null) {
            Configuration configuration = this.f7934d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && d(configuration))) {
                this.f7935e = super.getResources();
            } else {
                this.f7935e = a.a(this, this.f7934d).getResources();
            }
        }
        return this.f7935e;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int b() {
        return this.f7931a;
    }

    public final void c() {
        boolean z3 = this.f7932b == null;
        if (z3) {
            this.f7932b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f7932b.setTo(theme);
            }
        }
        e(this.f7932b, this.f7931a, z3);
    }

    public void e(Resources.Theme theme, int i3, boolean z3) {
        theme.applyStyle(i3, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return a();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f7933c == null) {
            this.f7933c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f7933c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f7932b;
        if (theme != null) {
            return theme;
        }
        if (this.f7931a == 0) {
            this.f7931a = h.f6155b;
        }
        c();
        return this.f7932b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i3) {
        if (this.f7931a != i3) {
            this.f7931a = i3;
            c();
        }
    }
}

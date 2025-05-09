package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: l.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0549O extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f8285c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static ArrayList f8286d;

    /* renamed from: a, reason: collision with root package name */
    public final Resources f8287a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f8288b;

    public C0549O(Context context) {
        super(context);
        if (!b0.c()) {
            this.f8287a = new C0551Q(this, context.getResources());
            this.f8288b = null;
            return;
        }
        b0 b0Var = new b0(this, context.getResources());
        this.f8287a = b0Var;
        Resources.Theme newTheme = b0Var.newTheme();
        this.f8288b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    public static boolean a(Context context) {
        return ((context instanceof C0549O) || (context.getResources() instanceof C0551Q) || (context.getResources() instanceof b0) || !b0.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f8285c) {
            try {
                ArrayList arrayList = f8286d;
                if (arrayList == null) {
                    f8286d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f8286d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f8286d.remove(size);
                        }
                    }
                    for (int size2 = f8286d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f8286d.get(size2);
                        C0549O c0549o = weakReference2 != null ? (C0549O) weakReference2.get() : null;
                        if (c0549o != null && c0549o.getBaseContext() == context) {
                            return c0549o;
                        }
                    }
                }
                C0549O c0549o2 = new C0549O(context);
                f8286d.add(new WeakReference(c0549o2));
                return c0549o2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f8287a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f8287a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f8288b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i3) {
        Resources.Theme theme = this.f8288b;
        if (theme == null) {
            super.setTheme(i3);
        } else {
            theme.applyStyle(i3, true);
        }
    }
}

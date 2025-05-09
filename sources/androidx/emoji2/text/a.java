package androidx.emoji2.text;

import J.g;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.emoji2.text.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.emoji2.text.a$a, reason: collision with other inner class name */
    public static class C0084a {

        /* renamed from: a, reason: collision with root package name */
        public final b f3877a;

        public C0084a(b bVar) {
            this.f3877a = bVar == null ? e() : bVar;
        }

        public static b e() {
            return Build.VERSION.SDK_INT >= 28 ? new d() : new c();
        }

        public final c.AbstractC0086c a(Context context, H.e eVar) {
            if (eVar == null) {
                return null;
            }
            return new e(context, eVar);
        }

        public final List b(Signature[] signatureArr) {
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            return Collections.singletonList(arrayList);
        }

        public c.AbstractC0086c c(Context context) {
            return a(context, h(context));
        }

        public final H.e d(ProviderInfo providerInfo, PackageManager packageManager) {
            String str = providerInfo.authority;
            String str2 = providerInfo.packageName;
            return new H.e(str, str2, "emojicompat-emoji-font", b(this.f3877a.b(packageManager, str2)));
        }

        public final boolean f(ProviderInfo providerInfo) {
            ApplicationInfo applicationInfo;
            return (providerInfo == null || (applicationInfo = providerInfo.applicationInfo) == null || (applicationInfo.flags & 1) != 1) ? false : true;
        }

        public final ProviderInfo g(PackageManager packageManager) {
            Iterator it = this.f3877a.c(packageManager, new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
            while (it.hasNext()) {
                ProviderInfo a3 = this.f3877a.a((ResolveInfo) it.next());
                if (f(a3)) {
                    return a3;
                }
            }
            return null;
        }

        public H.e h(Context context) {
            PackageManager packageManager = context.getPackageManager();
            g.h(packageManager, "Package manager required to locate emoji font provider");
            ProviderInfo g3 = g(packageManager);
            if (g3 == null) {
                return null;
            }
            try {
                return d(g3, packageManager);
            } catch (PackageManager.NameNotFoundException e3) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e3);
                return null;
            }
        }
    }

    public static class b {
        public abstract ProviderInfo a(ResolveInfo resolveInfo);

        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public abstract List c(PackageManager packageManager, Intent intent, int i3);
    }

    public static class c extends b {
        @Override // androidx.emoji2.text.a.b
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        @Override // androidx.emoji2.text.a.b
        public List c(PackageManager packageManager, Intent intent, int i3) {
            return packageManager.queryIntentContentProviders(intent, i3);
        }
    }

    public static class d extends c {
        @Override // androidx.emoji2.text.a.b
        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static e a(Context context) {
        return (e) new C0084a(null).c(context);
    }
}

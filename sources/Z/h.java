package z;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f10251c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static Set f10252d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f10253e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f10254a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f10255b;

    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        public static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    public h(Context context) {
        this.f10254a = context;
        this.f10255b = (NotificationManager) context.getSystemService("notification");
    }

    public static h b(Context context) {
        return new h(context);
    }

    public boolean a() {
        return a.a(this.f10255b);
    }
}

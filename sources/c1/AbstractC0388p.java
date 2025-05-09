package c1;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.util.Pair;
import onetap.game.tictactoe.R;
import z.C0783e;

/* renamed from: c1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0388p {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4755a = U2.a.a(-26276285214958L);

    /* renamed from: b, reason: collision with root package name */
    public static final String f4756b = U2.a.a(-26418019135726L);

    public static Notification a(Context context) {
        C0783e c0783e = new C0783e(context, U2.a.a(-26057241882862L));
        c0783e.k(R.mipmap.ic_launcher);
        c0783e.f(context.getString(R.string.APP_NAME));
        c0783e.e(U2.a.a(-26198975803630L));
        c0783e.h(true);
        c0783e.d(U2.a.a(-26241925476590L));
        c0783e.i(-1);
        c0783e.j(true);
        return c0783e.a();
    }

    public static void b(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0387o.a();
            NotificationChannel a3 = AbstractC0386n.a(U2.a.a(-25717939466478L), U2.a.a(-25859673387246L), 2);
            a3.setLockscreenVisibility(0);
            ((NotificationManager) context.getSystemService(U2.a.a(-26001407308014L))).createNotificationChannel(a3);
        }
    }

    public static Pair c(Context context) {
        b(context);
        Notification a3 = a(context);
        ((NotificationManager) context.getSystemService(U2.a.a(-25662104891630L))).notify(1337, a3);
        return new Pair(1337, a3);
    }
}

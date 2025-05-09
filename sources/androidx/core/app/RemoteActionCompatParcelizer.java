package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import u0.AbstractC0735a;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0735a abstractC0735a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3490a = (IconCompat) abstractC0735a.v(remoteActionCompat.f3490a, 1);
        remoteActionCompat.f3491b = abstractC0735a.l(remoteActionCompat.f3491b, 2);
        remoteActionCompat.f3492c = abstractC0735a.l(remoteActionCompat.f3492c, 3);
        remoteActionCompat.f3493d = (PendingIntent) abstractC0735a.r(remoteActionCompat.f3493d, 4);
        remoteActionCompat.f3494e = abstractC0735a.h(remoteActionCompat.f3494e, 5);
        remoteActionCompat.f3495f = abstractC0735a.h(remoteActionCompat.f3495f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0735a abstractC0735a) {
        abstractC0735a.x(false, false);
        abstractC0735a.M(remoteActionCompat.f3490a, 1);
        abstractC0735a.D(remoteActionCompat.f3491b, 2);
        abstractC0735a.D(remoteActionCompat.f3492c, 3);
        abstractC0735a.H(remoteActionCompat.f3493d, 4);
        abstractC0735a.z(remoteActionCompat.f3494e, 5);
        abstractC0735a.z(remoteActionCompat.f3495f, 6);
    }
}

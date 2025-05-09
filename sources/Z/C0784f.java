package z;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import j.AbstractC0515e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0784f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10240a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f10241b;

    /* renamed from: c, reason: collision with root package name */
    public final C0783e f10242c;

    /* renamed from: d, reason: collision with root package name */
    public RemoteViews f10243d;

    /* renamed from: e, reason: collision with root package name */
    public RemoteViews f10244e;

    /* renamed from: f, reason: collision with root package name */
    public final List f10245f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f10246g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public int f10247h;

    /* renamed from: i, reason: collision with root package name */
    public RemoteViews f10248i;

    /* renamed from: z.f$a */
    public static class a {
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        public static Notification.Action.Builder e(int i3, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i3, charSequence, pendingIntent);
        }

        public static String f(Notification notification) {
            return notification.getGroup();
        }

        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        public static Notification.Builder h(Notification.Builder builder, boolean z3) {
            return builder.setGroupSummary(z3);
        }

        public static Notification.Builder i(Notification.Builder builder, boolean z3) {
            return builder.setLocalOnly(z3);
        }

        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* renamed from: z.f$b */
    public static class b {
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        public static Notification.Builder c(Notification.Builder builder, int i3) {
            return builder.setColor(i3);
        }

        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        public static Notification.Builder f(Notification.Builder builder, int i3) {
            return builder.setVisibility(i3);
        }
    }

    /* renamed from: z.f$c */
    public static class c {
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* renamed from: z.f$d */
    public static class d {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z3) {
            return builder.setAllowGeneratedReplies(z3);
        }

        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* renamed from: z.f$e */
    public static class e {
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        public static Notification.Builder b(Notification.Builder builder, int i3) {
            return builder.setBadgeIconType(i3);
        }

        public static Notification.Builder c(Notification.Builder builder, boolean z3) {
            return builder.setColorized(z3);
        }

        public static Notification.Builder d(Notification.Builder builder, int i3) {
            return builder.setGroupAlertBehavior(i3);
        }

        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        public static Notification.Builder g(Notification.Builder builder, long j3) {
            return builder.setTimeoutAfter(j3);
        }
    }

    /* renamed from: z.f$f, reason: collision with other inner class name */
    public static class C0168f {
        public static Notification.Builder a(Notification.Builder builder, boolean z3) {
            return builder.setAllowSystemGeneratedContextualActions(z3);
        }

        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z3) {
            return builder.setContextual(z3);
        }

        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* renamed from: z.f$g */
    public static class g {
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z3) {
            return builder.setAuthenticationRequired(z3);
        }

        public static Notification.Builder b(Notification.Builder builder, int i3) {
            return builder.setForegroundServiceBehavior(i3);
        }
    }

    public C0784f(C0783e c0783e) {
        int i3;
        this.f10242c = c0783e;
        Context context = c0783e.f10214a;
        this.f10240a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f10241b = e.a(context, c0783e.f10203J);
        } else {
            this.f10241b = new Notification.Builder(c0783e.f10214a);
        }
        Notification notification = c0783e.f10210Q;
        this.f10241b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, c0783e.f10222i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c0783e.f10218e).setContentText(c0783e.f10219f).setContentInfo(c0783e.f10224k).setContentIntent(c0783e.f10220g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(c0783e.f10221h, (notification.flags & 128) != 0).setNumber(c0783e.f10225l).setProgress(c0783e.f10232s, c0783e.f10233t, c0783e.f10234u);
        Notification.Builder builder = this.f10241b;
        IconCompat iconCompat = c0783e.f10223j;
        c.b(builder, iconCompat == null ? null : iconCompat.h(context));
        this.f10241b.setSubText(c0783e.f10229p).setUsesChronometer(c0783e.f10228o).setPriority(c0783e.f10226m);
        Iterator it = c0783e.f10215b.iterator();
        while (it.hasNext()) {
            AbstractC0515e.a(it.next());
            a(null);
        }
        Bundle bundle = c0783e.f10196C;
        if (bundle != null) {
            this.f10246g.putAll(bundle);
        }
        int i4 = Build.VERSION.SDK_INT;
        this.f10243d = c0783e.f10200G;
        this.f10244e = c0783e.f10201H;
        this.f10241b.setShowWhen(c0783e.f10227n);
        a.i(this.f10241b, c0783e.f10238y);
        a.g(this.f10241b, c0783e.f10235v);
        a.j(this.f10241b, c0783e.f10237x);
        a.h(this.f10241b, c0783e.f10236w);
        this.f10247h = c0783e.f10207N;
        b.b(this.f10241b, c0783e.f10195B);
        b.c(this.f10241b, c0783e.f10197D);
        b.f(this.f10241b, c0783e.f10198E);
        b.d(this.f10241b, c0783e.f10199F);
        b.e(this.f10241b, notification.sound, notification.audioAttributes);
        List d3 = i4 < 28 ? d(e(c0783e.f10216c), c0783e.f10213T) : c0783e.f10213T;
        if (d3 != null && !d3.isEmpty()) {
            Iterator it2 = d3.iterator();
            while (it2.hasNext()) {
                b.a(this.f10241b, (String) it2.next());
            }
        }
        this.f10248i = c0783e.f10202I;
        if (c0783e.f10217d.size() > 0) {
            Bundle bundle2 = c0783e.b().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i5 = 0; i5 < c0783e.f10217d.size(); i5++) {
                String num = Integer.toString(i5);
                AbstractC0515e.a(c0783e.f10217d.get(i5));
                bundle4.putBundle(num, z.g.a(null));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            c0783e.b().putBundle("android.car.EXTENSIONS", bundle2);
            this.f10246g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i6 = Build.VERSION.SDK_INT;
        Object obj = c0783e.f10212S;
        if (obj != null) {
            c.c(this.f10241b, obj);
        }
        this.f10241b.setExtras(c0783e.f10196C);
        d.e(this.f10241b, c0783e.f10231r);
        RemoteViews remoteViews = c0783e.f10200G;
        if (remoteViews != null) {
            d.c(this.f10241b, remoteViews);
        }
        RemoteViews remoteViews2 = c0783e.f10201H;
        if (remoteViews2 != null) {
            d.b(this.f10241b, remoteViews2);
        }
        RemoteViews remoteViews3 = c0783e.f10202I;
        if (remoteViews3 != null) {
            d.d(this.f10241b, remoteViews3);
        }
        if (i6 >= 26) {
            e.b(this.f10241b, c0783e.f10204K);
            e.e(this.f10241b, c0783e.f10230q);
            e.f(this.f10241b, c0783e.f10205L);
            e.g(this.f10241b, c0783e.f10206M);
            e.d(this.f10241b, c0783e.f10207N);
            if (c0783e.f10194A) {
                e.c(this.f10241b, c0783e.f10239z);
            }
            if (!TextUtils.isEmpty(c0783e.f10203J)) {
                this.f10241b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i6 >= 28) {
            Iterator it3 = c0783e.f10216c.iterator();
            if (it3.hasNext()) {
                AbstractC0515e.a(it3.next());
                throw null;
            }
        }
        if (i6 >= 29) {
            C0168f.a(this.f10241b, c0783e.f10209P);
            C0168f.b(this.f10241b, AbstractC0782d.a(null));
        }
        if (i6 >= 31 && (i3 = c0783e.f10208O) != 0) {
            g.b(this.f10241b, i3);
        }
        if (c0783e.f10211R) {
            if (this.f10242c.f10236w) {
                this.f10247h = 2;
            } else {
                this.f10247h = 1;
            }
            this.f10241b.setVibrate(null);
            this.f10241b.setSound(null);
            int i7 = notification.defaults & (-4);
            notification.defaults = i7;
            this.f10241b.setDefaults(i7);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.f10242c.f10235v)) {
                    a.g(this.f10241b, "silent");
                }
                e.d(this.f10241b, this.f10247h);
            }
        }
    }

    public static List d(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        o.b bVar = new o.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    public static List e(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        AbstractC0515e.a(it.next());
        throw null;
    }

    public final void a(AbstractC0781c abstractC0781c) {
        throw null;
    }

    public Notification b() {
        this.f10242c.getClass();
        Notification c3 = c();
        RemoteViews remoteViews = this.f10242c.f10200G;
        if (remoteViews != null) {
            c3.contentView = remoteViews;
        }
        return c3;
    }

    public Notification c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f10241b.build();
        }
        Notification build = this.f10241b.build();
        if (this.f10247h != 0) {
            if (a.f(build) != null && (build.flags & 512) != 0 && this.f10247h == 2) {
                f(build);
            }
            if (a.f(build) != null && (build.flags & 512) == 0 && this.f10247h == 1) {
                f(build);
            }
        }
        return build;
    }

    public final void f(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}

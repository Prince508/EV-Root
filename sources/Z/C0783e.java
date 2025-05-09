package z;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* renamed from: z.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0783e {

    /* renamed from: A, reason: collision with root package name */
    public boolean f10194A;

    /* renamed from: B, reason: collision with root package name */
    public String f10195B;

    /* renamed from: C, reason: collision with root package name */
    public Bundle f10196C;

    /* renamed from: F, reason: collision with root package name */
    public Notification f10199F;

    /* renamed from: G, reason: collision with root package name */
    public RemoteViews f10200G;

    /* renamed from: H, reason: collision with root package name */
    public RemoteViews f10201H;

    /* renamed from: I, reason: collision with root package name */
    public RemoteViews f10202I;

    /* renamed from: J, reason: collision with root package name */
    public String f10203J;

    /* renamed from: L, reason: collision with root package name */
    public String f10205L;

    /* renamed from: M, reason: collision with root package name */
    public long f10206M;

    /* renamed from: P, reason: collision with root package name */
    public boolean f10209P;

    /* renamed from: Q, reason: collision with root package name */
    public Notification f10210Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f10211R;

    /* renamed from: S, reason: collision with root package name */
    public Object f10212S;

    /* renamed from: T, reason: collision with root package name */
    public ArrayList f10213T;

    /* renamed from: a, reason: collision with root package name */
    public Context f10214a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f10218e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f10219f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f10220g;

    /* renamed from: h, reason: collision with root package name */
    public PendingIntent f10221h;

    /* renamed from: i, reason: collision with root package name */
    public RemoteViews f10222i;

    /* renamed from: j, reason: collision with root package name */
    public IconCompat f10223j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f10224k;

    /* renamed from: l, reason: collision with root package name */
    public int f10225l;

    /* renamed from: m, reason: collision with root package name */
    public int f10226m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10228o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f10229p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f10230q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence[] f10231r;

    /* renamed from: s, reason: collision with root package name */
    public int f10232s;

    /* renamed from: t, reason: collision with root package name */
    public int f10233t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10234u;

    /* renamed from: v, reason: collision with root package name */
    public String f10235v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10236w;

    /* renamed from: x, reason: collision with root package name */
    public String f10237x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10239z;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f10215b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f10216c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f10217d = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public boolean f10227n = true;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10238y = false;

    /* renamed from: D, reason: collision with root package name */
    public int f10197D = 0;

    /* renamed from: E, reason: collision with root package name */
    public int f10198E = 0;

    /* renamed from: K, reason: collision with root package name */
    public int f10204K = 0;

    /* renamed from: N, reason: collision with root package name */
    public int f10207N = 0;

    /* renamed from: O, reason: collision with root package name */
    public int f10208O = 0;

    public C0783e(Context context, String str) {
        Notification notification = new Notification();
        this.f10210Q = notification;
        this.f10214a = context;
        this.f10203J = str;
        notification.when = System.currentTimeMillis();
        this.f10210Q.audioStreamType = -1;
        this.f10226m = 0;
        this.f10213T = new ArrayList();
        this.f10209P = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public Notification a() {
        return new C0784f(this).b();
    }

    public Bundle b() {
        if (this.f10196C == null) {
            this.f10196C = new Bundle();
        }
        return this.f10196C;
    }

    public C0783e d(String str) {
        this.f10195B = str;
        return this;
    }

    public C0783e e(CharSequence charSequence) {
        this.f10219f = c(charSequence);
        return this;
    }

    public C0783e f(CharSequence charSequence) {
        this.f10218e = c(charSequence);
        return this;
    }

    public final void g(int i3, boolean z3) {
        if (z3) {
            Notification notification = this.f10210Q;
            notification.flags = i3 | notification.flags;
        } else {
            Notification notification2 = this.f10210Q;
            notification2.flags = (~i3) & notification2.flags;
        }
    }

    public C0783e h(boolean z3) {
        g(2, z3);
        return this;
    }

    public C0783e i(int i3) {
        this.f10226m = i3;
        return this;
    }

    public C0783e j(boolean z3) {
        this.f10227n = z3;
        return this;
    }

    public C0783e k(int i3) {
        this.f10210Q.icon = i3;
        return this;
    }
}

package U1;

import android.os.IBinder;

/* renamed from: U1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0290b implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f2115a;

    public AbstractC0290b(IBinder iBinder) {
        this.f2115a = iBinder;
        iBinder.linkToDeath(this, 0);
    }

    public abstract void a();

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f2115a.unlinkToDeath(this, 0);
        E.a(new Runnable() { // from class: U1.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0290b.this.a();
            }
        });
    }
}

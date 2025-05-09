package c1;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: c1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0382j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4746a = U2.a.a(-25271262867694L);

    /* renamed from: b, reason: collision with root package name */
    public static final String f4747b = U2.a.a(-25297032671470L);

    /* renamed from: c, reason: collision with root package name */
    public static final String f4748c = U2.a.a(-25305622606062L);

    /* renamed from: d, reason: collision with root package name */
    public static final String f4749d = U2.a.a(-25357162213614L);

    /* renamed from: e, reason: collision with root package name */
    public static final String f4750e = U2.a.a(-25455946461422L);

    /* renamed from: f, reason: collision with root package name */
    public static final String f4751f = U2.a.a(-25554730709230L);

    public static void a(String str) {
        Log.d(U2.a.a(-24584068100334L), str);
    }

    public static void b(RemoteException remoteException) {
        Log.e(U2.a.a(-24979205091566L), Log.getStackTraceString(remoteException));
    }

    public static void c(Exception exc) {
        Log.e(U2.a.a(-24880420843758L), Log.getStackTraceString(exc));
    }

    public static void d(String str) {
        Log.e(U2.a.a(-24682852348142L), str);
    }

    public static void e(String str, Throwable th) {
        d(str);
        f(th);
    }

    public static void f(Throwable th) {
        Log.e(U2.a.a(-24781636595950L), Log.getStackTraceString(th));
    }
}

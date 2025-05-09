package b1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Point;
import android.os.IBinder;
import c1.AbstractC0382j;
import c1.AbstractC0393u;
import com.easyvictory.cheto.services.RootServiceImpl;
import com.easyvictory.cheto.services.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: b1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0368a {

    /* renamed from: b, reason: collision with root package name */
    public ServiceConnection f4710b;

    /* renamed from: e, reason: collision with root package name */
    public static final String f4705e = U2.a.a(-18639833362670L);

    /* renamed from: f, reason: collision with root package name */
    public static final String f4706f = U2.a.a(-18717142773998L);

    /* renamed from: g, reason: collision with root package name */
    public static final String f4707g = U2.a.a(-18798747152622L);

    /* renamed from: h, reason: collision with root package name */
    public static final String f4708h = U2.a.a(-18927596171502L);

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0368a f4704d = null;

    /* renamed from: a, reason: collision with root package name */
    public final List f4709a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.easyvictory.cheto.services.a f4711c = null;

    /* renamed from: b1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0102a {
        void a();

        void b();
    }

    /* renamed from: b1.a$b */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0368a.this.f4711c = a.AbstractBinderC0104a.x(iBinder);
            AbstractC0382j.a(U2.a.a(-17587566375150L) + C0368a.this.f4709a.size());
            Iterator it = C0368a.this.f4709a.iterator();
            while (it.hasNext()) {
                ((InterfaceC0102a) it.next()).b();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C0368a.this.f4711c = null;
            Iterator it = C0368a.this.f4709a.iterator();
            while (it.hasNext()) {
                ((InterfaceC0102a) it.next()).a();
            }
        }
    }

    public C0368a() {
        this.f4710b = null;
        this.f4710b = new b();
    }

    public static C0368a d() {
        if (f4704d == null) {
            synchronized (C0368a.class) {
                try {
                    if (f4704d == null) {
                        f4704d = new C0368a();
                    }
                } finally {
                }
            }
        }
        return f4704d;
    }

    public void b(InterfaceC0102a interfaceC0102a) {
        this.f4709a.add(interfaceC0102a);
    }

    public void c(Context context) {
        Intent intent = new Intent(context, (Class<?>) RootServiceImpl.class);
        intent.addCategory(U2.a.a(-17935458726126L));
        Point b3 = AbstractC0393u.b(context);
        Point f3 = AbstractC0393u.f(context);
        intent.putExtra(U2.a.a(-18090077548782L), b3.x);
        intent.putExtra(U2.a.a(-18167386960110L), b3.y);
        intent.putExtra(U2.a.a(-18248991338734L), f3.x);
        intent.putExtra(U2.a.a(-18377840357614L), f3.y);
        V1.b.bind(intent, this.f4710b);
    }

    public com.easyvictory.cheto.services.a e() {
        if (f()) {
            return this.f4711c;
        }
        throw new RuntimeException(U2.a.a(-18510984343790L));
    }

    public boolean f() {
        return this.f4711c != null;
    }
}

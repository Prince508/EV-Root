package U1;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: U1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0293e extends IInterface {

    /* renamed from: U1.e$b */
    public static class b {
        public static Object c(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void d(Parcel parcel, Parcelable parcelable, int i3) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i3);
            }
        }
    }

    void a(ComponentName componentName);

    void c(int i3);

    void f(ComponentName componentName, int i3);

    void n(IBinder iBinder);

    IBinder t(Intent intent);

    /* renamed from: U1.e$a */
    public static abstract class a extends Binder implements InterfaceC0293e {

        /* renamed from: U1.e$a$a, reason: collision with other inner class name */
        public static class C0060a implements InterfaceC0293e {

            /* renamed from: e, reason: collision with root package name */
            public IBinder f2124e;

            public C0060a(IBinder iBinder) {
                this.f2124e = iBinder;
            }

            @Override // U1.InterfaceC0293e
            public void a(ComponentName componentName) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IRootServiceManager");
                    b.d(obtain, componentName, 0);
                    this.f2124e.transact(5, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2124e;
            }

            @Override // U1.InterfaceC0293e
            public void f(ComponentName componentName, int i3) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IRootServiceManager");
                    b.d(obtain, componentName, 0);
                    obtain.writeInt(i3);
                    this.f2124e.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // U1.InterfaceC0293e
            public void n(IBinder iBinder) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IRootServiceManager");
                    obtain.writeStrongBinder(iBinder);
                    this.f2124e.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // U1.InterfaceC0293e
            public IBinder t(Intent intent) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IRootServiceManager");
                    b.d(obtain, intent, 0);
                    this.f2124e.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readStrongBinder();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.topjohnwu.superuser.internal.IRootServiceManager");
        }

        public static InterfaceC0293e x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.topjohnwu.superuser.internal.IRootServiceManager");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0293e)) ? new C0060a(iBinder) : (InterfaceC0293e) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
            if (i3 >= 1 && i3 <= 16777215) {
                parcel.enforceInterface("com.topjohnwu.superuser.internal.IRootServiceManager");
            }
            if (i3 == 1598968902) {
                parcel2.writeString("com.topjohnwu.superuser.internal.IRootServiceManager");
                return true;
            }
            if (i3 == 1) {
                c(parcel.readInt());
            } else if (i3 == 2) {
                f((ComponentName) b.c(parcel, ComponentName.CREATOR), parcel.readInt());
            } else if (i3 == 3) {
                n(parcel.readStrongBinder());
                parcel2.writeNoException();
            } else if (i3 == 4) {
                IBinder t3 = t((Intent) b.c(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(t3);
            } else {
                if (i3 != 5) {
                    return super.onTransact(i3, parcel, parcel2, i4);
                }
                a((ComponentName) b.c(parcel, ComponentName.CREATOR));
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}

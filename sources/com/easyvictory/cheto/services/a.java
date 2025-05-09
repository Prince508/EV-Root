package com.easyvictory.cheto.services;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.easyvictory.cheto.api_client.ApiResponse;
import com.easyvictory.cheto.utils.package_settings.IPackageSettings;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: com.easyvictory.cheto.services.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0104a extends Binder implements a {

        /* renamed from: com.easyvictory.cheto.services.a$a$a, reason: collision with other inner class name */
        public static class C0105a implements a {

            /* renamed from: e, reason: collision with root package name */
            public IBinder f4972e;

            public C0105a(IBinder iBinder) {
                this.f4972e = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f4972e;
            }

            @Override // com.easyvictory.cheto.services.a
            public void e(String str, int i3, int i4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.easyvictory.cheto.services.IRootServiceImpl");
                    obtain.writeString(str);
                    obtain.writeInt(i3);
                    obtain.writeInt(i4);
                    this.f4972e.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.easyvictory.cheto.services.a
            public ApiResponse g(String str, String str2, int i3, IPackageSettings iPackageSettings) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.easyvictory.cheto.services.IRootServiceImpl");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i3);
                    b.d(obtain, iPackageSettings, 0);
                    this.f4972e.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return (ApiResponse) b.c(obtain2, ApiResponse.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.easyvictory.cheto.services.a
            public byte[] h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.easyvictory.cheto.services.IRootServiceImpl");
                    this.f4972e.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createByteArray();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.easyvictory.cheto.services.a
            public void i(String str, boolean z3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.easyvictory.cheto.services.IRootServiceImpl");
                    obtain.writeString(str);
                    obtain.writeInt(z3 ? 1 : 0);
                    this.f4972e.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.easyvictory.cheto.services.a
            public void j(int i3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.easyvictory.cheto.services.IRootServiceImpl");
                    obtain.writeInt(i3);
                    this.f4972e.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.easyvictory.cheto.services.a
            public void k() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.easyvictory.cheto.services.IRootServiceImpl");
                    this.f4972e.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.easyvictory.cheto.services.a
            public boolean o(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.easyvictory.cheto.services.IRootServiceImpl");
                    obtain.writeString(str);
                    this.f4972e.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.easyvictory.cheto.services.a
            public void p(String str, int i3, boolean z3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.easyvictory.cheto.services.IRootServiceImpl");
                    obtain.writeString(str);
                    obtain.writeInt(i3);
                    obtain.writeInt(z3 ? 1 : 0);
                    this.f4972e.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.easyvictory.cheto.services.a
            public void q(String str, int i3, float f3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.easyvictory.cheto.services.IRootServiceImpl");
                    obtain.writeString(str);
                    obtain.writeInt(i3);
                    obtain.writeFloat(f3);
                    this.f4972e.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.easyvictory.cheto.services.a
            public void s(String str, IPackageSettings iPackageSettings) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.easyvictory.cheto.services.IRootServiceImpl");
                    obtain.writeString(str);
                    b.d(obtain, iPackageSettings, 0);
                    this.f4972e.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.easyvictory.cheto.services.a
            public void u(String str, int i3, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.easyvictory.cheto.services.IRootServiceImpl");
                    obtain.writeString(str);
                    obtain.writeInt(i3);
                    obtain.writeString(str2);
                    this.f4972e.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.easyvictory.cheto.services.a
            public void v(String str, int i3, long j3) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.easyvictory.cheto.services.IRootServiceImpl");
                    obtain.writeString(str);
                    obtain.writeInt(i3);
                    obtain.writeLong(j3);
                    this.f4972e.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0104a() {
            attachInterface(this, "com.easyvictory.cheto.services.IRootServiceImpl");
        }

        public static a x(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.easyvictory.cheto.services.IRootServiceImpl");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0105a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
            if (i3 >= 1 && i3 <= 16777215) {
                parcel.enforceInterface("com.easyvictory.cheto.services.IRootServiceImpl");
            }
            if (i3 == 1598968902) {
                parcel2.writeString("com.easyvictory.cheto.services.IRootServiceImpl");
                return true;
            }
            switch (i3) {
                case 1:
                    k();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    byte[] h3 = h();
                    parcel2.writeNoException();
                    parcel2.writeByteArray(h3);
                    return true;
                case 3:
                    byte[] d3 = d();
                    parcel2.writeNoException();
                    parcel2.writeByteArray(d3);
                    return true;
                case 4:
                    ApiResponse g3 = g(parcel.readString(), parcel.readString(), parcel.readInt(), (IPackageSettings) b.c(parcel, IPackageSettings.CREATOR));
                    parcel2.writeNoException();
                    b.d(parcel2, g3, 1);
                    return true;
                case 5:
                    s(parcel.readString(), (IPackageSettings) b.c(parcel, IPackageSettings.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    v(parcel.readString(), parcel.readInt(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    e(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 8:
                    p(parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    q(parcel.readString(), parcel.readInt(), parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    u(parcel.readString(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    i(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    boolean o3 = o(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(o3 ? 1 : 0);
                    return true;
                case 13:
                    String w3 = w();
                    parcel2.writeNoException();
                    parcel2.writeString(w3);
                    return true;
                case 14:
                    j(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 15:
                    boolean b3 = b();
                    parcel2.writeNoException();
                    parcel2.writeInt(b3 ? 1 : 0);
                    return true;
                case 16:
                    boolean r3 = r(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(r3 ? 1 : 0);
                    return true;
                case 17:
                    boolean m3 = m(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(m3 ? 1 : 0);
                    return true;
                case 18:
                    boolean l3 = l(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(l3 ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(i3, parcel, parcel2, i4);
            }
        }
    }

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

    boolean b();

    byte[] d();

    void e(String str, int i3, int i4);

    ApiResponse g(String str, String str2, int i3, IPackageSettings iPackageSettings);

    byte[] h();

    void i(String str, boolean z3);

    void j(int i3);

    void k();

    boolean l(int i3, int i4, int i5, int i6, int i7);

    boolean m(int i3, int i4);

    boolean o(String str);

    void p(String str, int i3, boolean z3);

    void q(String str, int i3, float f3);

    boolean r(boolean z3);

    void s(String str, IPackageSettings iPackageSettings);

    void u(String str, int i3, String str2);

    void v(String str, int i3, long j3);

    String w();
}

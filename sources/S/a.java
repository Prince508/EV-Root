package S;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: e, reason: collision with root package name */
    public final Parcelable f1963e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f1962f = new C0050a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: S.a$a, reason: collision with other inner class name */
    public class C0050a extends a {
        public C0050a() {
            super((C0050a) null);
        }
    }

    public class b implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f1962f;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i3) {
            return new a[i3];
        }
    }

    public /* synthetic */ a(C0050a c0050a) {
        this();
    }

    public final Parcelable a() {
        return this.f1963e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f1963e, i3);
    }

    public a() {
        this.f1963e = null;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f1963e = parcelable == f1962f ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1963e = readParcelable == null ? f1962f : readParcelable;
    }
}

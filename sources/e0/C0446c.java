package e0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: e0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0446c implements Parcelable {
    public static final Parcelable.Creator<C0446c> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    public final List f6596e;

    /* renamed from: f, reason: collision with root package name */
    public final List f6597f;

    /* renamed from: e0.c$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0446c createFromParcel(Parcel parcel) {
            return new C0446c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0446c[] newArray(int i3) {
            return new C0446c[i3];
        }
    }

    public C0446c(Parcel parcel) {
        this.f6596e = parcel.createStringArrayList();
        this.f6597f = parcel.createTypedArrayList(C0445b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f6596e);
        parcel.writeTypedList(this.f6597f);
    }
}

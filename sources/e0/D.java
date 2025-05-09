package e0;

import android.os.Parcel;
import android.os.Parcelable;
import e0.B;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class D implements Parcelable {
    public static final Parcelable.Creator<D> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f6438e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f6439f;

    /* renamed from: g, reason: collision with root package name */
    public C0445b[] f6440g;

    /* renamed from: h, reason: collision with root package name */
    public int f6441h;

    /* renamed from: i, reason: collision with root package name */
    public String f6442i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f6443j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f6444k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f6445l;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public D createFromParcel(Parcel parcel) {
            return new D(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public D[] newArray(int i3) {
            return new D[i3];
        }
    }

    public D() {
        this.f6442i = null;
        this.f6443j = new ArrayList();
        this.f6444k = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f6438e);
        parcel.writeStringList(this.f6439f);
        parcel.writeTypedArray(this.f6440g, i3);
        parcel.writeInt(this.f6441h);
        parcel.writeString(this.f6442i);
        parcel.writeStringList(this.f6443j);
        parcel.writeTypedList(this.f6444k);
        parcel.writeTypedList(this.f6445l);
    }

    public D(Parcel parcel) {
        this.f6442i = null;
        this.f6443j = new ArrayList();
        this.f6444k = new ArrayList();
        this.f6438e = parcel.createStringArrayList();
        this.f6439f = parcel.createStringArrayList();
        this.f6440g = (C0445b[]) parcel.createTypedArray(C0445b.CREATOR);
        this.f6441h = parcel.readInt();
        this.f6442i = parcel.readString();
        this.f6443j = parcel.createStringArrayList();
        this.f6444k = parcel.createTypedArrayList(C0446c.CREATOR);
        this.f6445l = parcel.createTypedArrayList(B.g.CREATOR);
    }
}

package e0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class G implements Parcelable {
    public static final Parcelable.Creator<G> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    public final String f6454e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6455f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6456g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6457h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6458i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6459j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6460k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6461l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f6462m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f6463n;

    /* renamed from: o, reason: collision with root package name */
    public final int f6464o;

    /* renamed from: p, reason: collision with root package name */
    public final String f6465p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6466q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f6467r;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public G createFromParcel(Parcel parcel) {
            return new G(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public G[] newArray(int i3) {
            return new G[i3];
        }
    }

    public G(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        this.f6454e = abstractComponentCallbacksC0459p.getClass().getName();
        this.f6455f = abstractComponentCallbacksC0459p.f6721i;
        this.f6456g = abstractComponentCallbacksC0459p.f6731s;
        this.f6457h = abstractComponentCallbacksC0459p.f6687A;
        this.f6458i = abstractComponentCallbacksC0459p.f6688B;
        this.f6459j = abstractComponentCallbacksC0459p.f6689C;
        this.f6460k = abstractComponentCallbacksC0459p.f6692F;
        this.f6461l = abstractComponentCallbacksC0459p.f6728p;
        this.f6462m = abstractComponentCallbacksC0459p.f6691E;
        this.f6463n = abstractComponentCallbacksC0459p.f6690D;
        this.f6464o = abstractComponentCallbacksC0459p.f6707U.ordinal();
        this.f6465p = abstractComponentCallbacksC0459p.f6724l;
        this.f6466q = abstractComponentCallbacksC0459p.f6725m;
        this.f6467r = abstractComponentCallbacksC0459p.f6700N;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f6454e);
        sb.append(" (");
        sb.append(this.f6455f);
        sb.append(")}:");
        if (this.f6456g) {
            sb.append(" fromLayout");
        }
        if (this.f6458i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f6458i));
        }
        String str = this.f6459j;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f6459j);
        }
        if (this.f6460k) {
            sb.append(" retainInstance");
        }
        if (this.f6461l) {
            sb.append(" removing");
        }
        if (this.f6462m) {
            sb.append(" detached");
        }
        if (this.f6463n) {
            sb.append(" hidden");
        }
        if (this.f6465p != null) {
            sb.append(" targetWho=");
            sb.append(this.f6465p);
            sb.append(" targetRequestCode=");
            sb.append(this.f6466q);
        }
        if (this.f6467r) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f6454e);
        parcel.writeString(this.f6455f);
        parcel.writeInt(this.f6456g ? 1 : 0);
        parcel.writeInt(this.f6457h);
        parcel.writeInt(this.f6458i);
        parcel.writeString(this.f6459j);
        parcel.writeInt(this.f6460k ? 1 : 0);
        parcel.writeInt(this.f6461l ? 1 : 0);
        parcel.writeInt(this.f6462m ? 1 : 0);
        parcel.writeInt(this.f6463n ? 1 : 0);
        parcel.writeInt(this.f6464o);
        parcel.writeString(this.f6465p);
        parcel.writeInt(this.f6466q);
        parcel.writeInt(this.f6467r ? 1 : 0);
    }

    public G(Parcel parcel) {
        this.f6454e = parcel.readString();
        this.f6455f = parcel.readString();
        this.f6456g = parcel.readInt() != 0;
        this.f6457h = parcel.readInt();
        this.f6458i = parcel.readInt();
        this.f6459j = parcel.readString();
        this.f6460k = parcel.readInt() != 0;
        this.f6461l = parcel.readInt() != 0;
        this.f6462m = parcel.readInt() != 0;
        this.f6463n = parcel.readInt() != 0;
        this.f6464o = parcel.readInt();
        this.f6465p = parcel.readString();
        this.f6466q = parcel.readInt();
        this.f6467r = parcel.readInt() != 0;
    }
}

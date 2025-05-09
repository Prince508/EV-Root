package u0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import o.C0639a;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0736b extends AbstractC0735a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f9606d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f9607e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9608f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9609g;

    /* renamed from: h, reason: collision with root package name */
    public final String f9610h;

    /* renamed from: i, reason: collision with root package name */
    public int f9611i;

    /* renamed from: j, reason: collision with root package name */
    public int f9612j;

    /* renamed from: k, reason: collision with root package name */
    public int f9613k;

    public C0736b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0639a(), new C0639a(), new C0639a());
    }

    @Override // u0.AbstractC0735a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f9607e.writeInt(-1);
        } else {
            this.f9607e.writeInt(bArr.length);
            this.f9607e.writeByteArray(bArr);
        }
    }

    @Override // u0.AbstractC0735a
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f9607e, 0);
    }

    @Override // u0.AbstractC0735a
    public void E(int i3) {
        this.f9607e.writeInt(i3);
    }

    @Override // u0.AbstractC0735a
    public void G(Parcelable parcelable) {
        this.f9607e.writeParcelable(parcelable, 0);
    }

    @Override // u0.AbstractC0735a
    public void I(String str) {
        this.f9607e.writeString(str);
    }

    @Override // u0.AbstractC0735a
    public void a() {
        int i3 = this.f9611i;
        if (i3 >= 0) {
            int i4 = this.f9606d.get(i3);
            int dataPosition = this.f9607e.dataPosition();
            this.f9607e.setDataPosition(i4);
            this.f9607e.writeInt(dataPosition - i4);
            this.f9607e.setDataPosition(dataPosition);
        }
    }

    @Override // u0.AbstractC0735a
    public AbstractC0735a b() {
        Parcel parcel = this.f9607e;
        int dataPosition = parcel.dataPosition();
        int i3 = this.f9612j;
        if (i3 == this.f9608f) {
            i3 = this.f9609g;
        }
        return new C0736b(parcel, dataPosition, i3, this.f9610h + "  ", this.f9603a, this.f9604b, this.f9605c);
    }

    @Override // u0.AbstractC0735a
    public boolean g() {
        return this.f9607e.readInt() != 0;
    }

    @Override // u0.AbstractC0735a
    public byte[] i() {
        int readInt = this.f9607e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f9607e.readByteArray(bArr);
        return bArr;
    }

    @Override // u0.AbstractC0735a
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f9607e);
    }

    @Override // u0.AbstractC0735a
    public boolean m(int i3) {
        while (this.f9612j < this.f9609g) {
            int i4 = this.f9613k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            this.f9607e.setDataPosition(this.f9612j);
            int readInt = this.f9607e.readInt();
            this.f9613k = this.f9607e.readInt();
            this.f9612j += readInt;
        }
        return this.f9613k == i3;
    }

    @Override // u0.AbstractC0735a
    public int o() {
        return this.f9607e.readInt();
    }

    @Override // u0.AbstractC0735a
    public Parcelable q() {
        return this.f9607e.readParcelable(getClass().getClassLoader());
    }

    @Override // u0.AbstractC0735a
    public String s() {
        return this.f9607e.readString();
    }

    @Override // u0.AbstractC0735a
    public void w(int i3) {
        a();
        this.f9611i = i3;
        this.f9606d.put(i3, this.f9607e.dataPosition());
        E(0);
        E(i3);
    }

    @Override // u0.AbstractC0735a
    public void y(boolean z3) {
        this.f9607e.writeInt(z3 ? 1 : 0);
    }

    public C0736b(Parcel parcel, int i3, int i4, String str, C0639a c0639a, C0639a c0639a2, C0639a c0639a3) {
        super(c0639a, c0639a2, c0639a3);
        this.f9606d = new SparseIntArray();
        this.f9611i = -1;
        this.f9613k = -1;
        this.f9607e = parcel;
        this.f9608f = i3;
        this.f9609g = i4;
        this.f9612j = i3;
        this.f9610h = str;
    }
}

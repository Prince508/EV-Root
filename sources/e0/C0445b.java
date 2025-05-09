package e0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC0347h;
import e0.J;
import java.util.ArrayList;

/* renamed from: e0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0445b implements Parcelable {
    public static final Parcelable.Creator<C0445b> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    public final int[] f6582e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6583f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f6584g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f6585h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6586i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6587j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6588k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6589l;

    /* renamed from: m, reason: collision with root package name */
    public final CharSequence f6590m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6591n;

    /* renamed from: o, reason: collision with root package name */
    public final CharSequence f6592o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f6593p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f6594q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f6595r;

    /* renamed from: e0.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0445b createFromParcel(Parcel parcel) {
            return new C0445b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0445b[] newArray(int i3) {
            return new C0445b[i3];
        }
    }

    public C0445b(C0444a c0444a) {
        int size = c0444a.f6482c.size();
        this.f6582e = new int[size * 6];
        if (!c0444a.f6488i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f6583f = new ArrayList(size);
        this.f6584g = new int[size];
        this.f6585h = new int[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            J.a aVar = (J.a) c0444a.f6482c.get(i4);
            int i5 = i3 + 1;
            this.f6582e[i3] = aVar.f6499a;
            ArrayList arrayList = this.f6583f;
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = aVar.f6500b;
            arrayList.add(abstractComponentCallbacksC0459p != null ? abstractComponentCallbacksC0459p.f6721i : null);
            int[] iArr = this.f6582e;
            iArr[i5] = aVar.f6501c ? 1 : 0;
            iArr[i3 + 2] = aVar.f6502d;
            iArr[i3 + 3] = aVar.f6503e;
            int i6 = i3 + 5;
            iArr[i3 + 4] = aVar.f6504f;
            i3 += 6;
            iArr[i6] = aVar.f6505g;
            this.f6584g[i4] = aVar.f6506h.ordinal();
            this.f6585h[i4] = aVar.f6507i.ordinal();
        }
        this.f6586i = c0444a.f6487h;
        this.f6587j = c0444a.f6490k;
        this.f6588k = c0444a.f6580v;
        this.f6589l = c0444a.f6491l;
        this.f6590m = c0444a.f6492m;
        this.f6591n = c0444a.f6493n;
        this.f6592o = c0444a.f6494o;
        this.f6593p = c0444a.f6495p;
        this.f6594q = c0444a.f6496q;
        this.f6595r = c0444a.f6497r;
    }

    public final void a(C0444a c0444a) {
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 >= this.f6582e.length) {
                c0444a.f6487h = this.f6586i;
                c0444a.f6490k = this.f6587j;
                c0444a.f6488i = true;
                c0444a.f6491l = this.f6589l;
                c0444a.f6492m = this.f6590m;
                c0444a.f6493n = this.f6591n;
                c0444a.f6494o = this.f6592o;
                c0444a.f6495p = this.f6593p;
                c0444a.f6496q = this.f6594q;
                c0444a.f6497r = this.f6595r;
                return;
            }
            J.a aVar = new J.a();
            int i5 = i3 + 1;
            aVar.f6499a = this.f6582e[i3];
            if (B.v0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0444a + " op #" + i4 + " base fragment #" + this.f6582e[i5]);
            }
            aVar.f6506h = AbstractC0347h.b.values()[this.f6584g[i4]];
            aVar.f6507i = AbstractC0347h.b.values()[this.f6585h[i4]];
            int[] iArr = this.f6582e;
            int i6 = i3 + 2;
            if (iArr[i5] == 0) {
                z3 = false;
            }
            aVar.f6501c = z3;
            int i7 = iArr[i6];
            aVar.f6502d = i7;
            int i8 = iArr[i3 + 3];
            aVar.f6503e = i8;
            int i9 = i3 + 5;
            int i10 = iArr[i3 + 4];
            aVar.f6504f = i10;
            i3 += 6;
            int i11 = iArr[i9];
            aVar.f6505g = i11;
            c0444a.f6483d = i7;
            c0444a.f6484e = i8;
            c0444a.f6485f = i10;
            c0444a.f6486g = i11;
            c0444a.d(aVar);
            i4++;
        }
    }

    public C0444a b(B b3) {
        C0444a c0444a = new C0444a(b3);
        a(c0444a);
        c0444a.f6580v = this.f6588k;
        for (int i3 = 0; i3 < this.f6583f.size(); i3++) {
            String str = (String) this.f6583f.get(i3);
            if (str != null) {
                ((J.a) c0444a.f6482c.get(i3)).f6500b = b3.V(str);
            }
        }
        c0444a.o(1);
        return c0444a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeIntArray(this.f6582e);
        parcel.writeStringList(this.f6583f);
        parcel.writeIntArray(this.f6584g);
        parcel.writeIntArray(this.f6585h);
        parcel.writeInt(this.f6586i);
        parcel.writeString(this.f6587j);
        parcel.writeInt(this.f6588k);
        parcel.writeInt(this.f6589l);
        TextUtils.writeToParcel(this.f6590m, parcel, 0);
        parcel.writeInt(this.f6591n);
        TextUtils.writeToParcel(this.f6592o, parcel, 0);
        parcel.writeStringList(this.f6593p);
        parcel.writeStringList(this.f6594q);
        parcel.writeInt(this.f6595r ? 1 : 0);
    }

    public C0445b(Parcel parcel) {
        this.f6582e = parcel.createIntArray();
        this.f6583f = parcel.createStringArrayList();
        this.f6584g = parcel.createIntArray();
        this.f6585h = parcel.createIntArray();
        this.f6586i = parcel.readInt();
        this.f6587j = parcel.readString();
        this.f6588k = parcel.readInt();
        this.f6589l = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f6590m = (CharSequence) creator.createFromParcel(parcel);
        this.f6591n = parcel.readInt();
        this.f6592o = (CharSequence) creator.createFromParcel(parcel);
        this.f6593p = parcel.createStringArrayList();
        this.f6594q = parcel.createStringArrayList();
        this.f6595r = parcel.readInt() != 0;
    }
}

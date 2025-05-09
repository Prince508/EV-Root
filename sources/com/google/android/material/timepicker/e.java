package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    public final b f5697e;

    /* renamed from: f, reason: collision with root package name */
    public final b f5698f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5699g;

    /* renamed from: h, reason: collision with root package name */
    public int f5700h;

    /* renamed from: i, reason: collision with root package name */
    public int f5701i;

    /* renamed from: j, reason: collision with root package name */
    public int f5702j;

    /* renamed from: k, reason: collision with root package name */
    public int f5703k;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i3) {
            return new e[i3];
        }
    }

    public e(int i3, int i4, int i5, int i6) {
        this.f5700h = i3;
        this.f5701i = i4;
        this.f5702j = i5;
        this.f5699g = i6;
        this.f5703k = d(i3);
        this.f5697e = new b(59);
        this.f5698f = new b(i6 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int d(int i3) {
        return i3 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f5700h == eVar.f5700h && this.f5701i == eVar.f5701i && this.f5699g == eVar.f5699g && this.f5702j == eVar.f5702j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5699g), Integer.valueOf(this.f5700h), Integer.valueOf(this.f5701i), Integer.valueOf(this.f5702j)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f5700h);
        parcel.writeInt(this.f5701i);
        parcel.writeInt(this.f5702j);
        parcel.writeInt(this.f5699g);
    }

    public e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}

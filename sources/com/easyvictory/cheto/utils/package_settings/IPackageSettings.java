package com.easyvictory.cheto.utils.package_settings;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* loaded from: classes.dex */
public class IPackageSettings implements Parcelable {
    public static final Parcelable.Creator<IPackageSettings> CREATOR = new a();
    public int autoRestart;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IPackageSettings createFromParcel(Parcel parcel) {
            return new IPackageSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public IPackageSettings[] newArray(int i3) {
            return new IPackageSettings[i3];
        }
    }

    public IPackageSettings(Map<String, Object> map) {
        this.autoRestart = ((Integer) map.get("auto_restart")).intValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.autoRestart);
    }

    public IPackageSettings(Parcel parcel) {
        this.autoRestart = parcel.readInt();
    }
}

package com.easyvictory.cheto.api_client;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ApiResponse implements Parcelable {
    public static final Parcelable.Creator<ApiResponse> CREATOR = new a();
    private final byte[] bodyBytes;
    private final long statusCode;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApiResponse createFromParcel(Parcel parcel) {
            return new ApiResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ApiResponse[] newArray(int i3) {
            return new ApiResponse[i3];
        }
    }

    public ApiResponse(byte[] bArr, long j3) {
        this.bodyBytes = bArr;
        this.statusCode = j3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getBytes() {
        return this.bodyBytes;
    }

    public long getStatusCode() {
        return this.statusCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.statusCode);
        parcel.writeByteArray(this.bodyBytes);
    }

    public ApiResponse(Parcel parcel) {
        this.statusCode = parcel.readLong();
        this.bodyBytes = parcel.createByteArray();
    }
}

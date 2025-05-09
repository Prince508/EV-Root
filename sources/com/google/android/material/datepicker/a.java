package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0108a();

    /* renamed from: e, reason: collision with root package name */
    public final m f5293e;

    /* renamed from: f, reason: collision with root package name */
    public final m f5294f;

    /* renamed from: g, reason: collision with root package name */
    public final c f5295g;

    /* renamed from: h, reason: collision with root package name */
    public m f5296h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5297i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5298j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5299k;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    public class C0108a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((m) parcel.readParcelable(m.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i3) {
            return new a[i3];
        }
    }

    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        public static final long f5300f = t.a(m.h(1900, 0).f5408j);

        /* renamed from: g, reason: collision with root package name */
        public static final long f5301g = t.a(m.h(2100, 11).f5408j);

        /* renamed from: a, reason: collision with root package name */
        public long f5302a;

        /* renamed from: b, reason: collision with root package name */
        public long f5303b;

        /* renamed from: c, reason: collision with root package name */
        public Long f5304c;

        /* renamed from: d, reason: collision with root package name */
        public int f5305d;

        /* renamed from: e, reason: collision with root package name */
        public c f5306e;

        public b(a aVar) {
            this.f5302a = f5300f;
            this.f5303b = f5301g;
            this.f5306e = f.a(Long.MIN_VALUE);
            this.f5302a = aVar.f5293e.f5408j;
            this.f5303b = aVar.f5294f.f5408j;
            this.f5304c = Long.valueOf(aVar.f5296h.f5408j);
            this.f5305d = aVar.f5297i;
            this.f5306e = aVar.f5295g;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f5306e);
            m i3 = m.i(this.f5302a);
            m i4 = m.i(this.f5303b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l3 = this.f5304c;
            return new a(i3, i4, cVar, l3 == null ? null : m.i(l3.longValue()), this.f5305d, null);
        }

        public b b(long j3) {
            this.f5304c = Long.valueOf(j3);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean c(long j3);
    }

    public /* synthetic */ a(m mVar, m mVar2, c cVar, m mVar3, int i3, C0108a c0108a) {
        this(mVar, mVar2, cVar, mVar3, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5293e.equals(aVar.f5293e) && this.f5294f.equals(aVar.f5294f) && J.c.a(this.f5296h, aVar.f5296h) && this.f5297i == aVar.f5297i && this.f5295g.equals(aVar.f5295g);
    }

    public c h() {
        return this.f5295g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5293e, this.f5294f, this.f5296h, Integer.valueOf(this.f5297i), this.f5295g});
    }

    public m i() {
        return this.f5294f;
    }

    public int j() {
        return this.f5297i;
    }

    public int k() {
        return this.f5299k;
    }

    public m l() {
        return this.f5296h;
    }

    public m m() {
        return this.f5293e;
    }

    public int n() {
        return this.f5298j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f5293e, 0);
        parcel.writeParcelable(this.f5294f, 0);
        parcel.writeParcelable(this.f5296h, 0);
        parcel.writeParcelable(this.f5295g, 0);
        parcel.writeInt(this.f5297i);
    }

    public a(m mVar, m mVar2, c cVar, m mVar3, int i3) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f5293e = mVar;
        this.f5294f = mVar2;
        this.f5296h = mVar3;
        this.f5297i = i3;
        this.f5295g = cVar;
        if (mVar3 != null && mVar.compareTo(mVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.compareTo(mVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i3 < 0 || i3 > t.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f5299k = mVar.q(mVar2) + 1;
        this.f5298j = (mVar2.f5405g - mVar.f5405g) + 1;
    }
}

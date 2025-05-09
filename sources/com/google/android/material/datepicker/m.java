package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes.dex */
public final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: e, reason: collision with root package name */
    public final Calendar f5403e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5404f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5405g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5406h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5407i;

    /* renamed from: j, reason: collision with root package name */
    public final long f5408j;

    /* renamed from: k, reason: collision with root package name */
    public String f5409k;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return m.h(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i3) {
            return new m[i3];
        }
    }

    public m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c3 = t.c(calendar);
        this.f5403e = c3;
        this.f5404f = c3.get(2);
        this.f5405g = c3.get(1);
        this.f5406h = c3.getMaximum(7);
        this.f5407i = c3.getActualMaximum(5);
        this.f5408j = c3.getTimeInMillis();
    }

    public static m h(int i3, int i4) {
        Calendar i5 = t.i();
        i5.set(1, i3);
        i5.set(2, i4);
        return new m(i5);
    }

    public static m i(long j3) {
        Calendar i3 = t.i();
        i3.setTimeInMillis(j3);
        return new m(i3);
    }

    public static m j() {
        return new m(t.g());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f5404f == mVar.f5404f && this.f5405g == mVar.f5405g;
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(m mVar) {
        return this.f5403e.compareTo(mVar.f5403e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5404f), Integer.valueOf(this.f5405g)});
    }

    public int k(int i3) {
        int i4 = this.f5403e.get(7);
        if (i3 <= 0) {
            i3 = this.f5403e.getFirstDayOfWeek();
        }
        int i5 = i4 - i3;
        return i5 < 0 ? i5 + this.f5406h : i5;
    }

    public long l(int i3) {
        Calendar c3 = t.c(this.f5403e);
        c3.set(5, i3);
        return c3.getTimeInMillis();
    }

    public int m(long j3) {
        Calendar c3 = t.c(this.f5403e);
        c3.setTimeInMillis(j3);
        return c3.get(5);
    }

    public String n() {
        if (this.f5409k == null) {
            this.f5409k = e.f(this.f5403e.getTimeInMillis());
        }
        return this.f5409k;
    }

    public long o() {
        return this.f5403e.getTimeInMillis();
    }

    public m p(int i3) {
        Calendar c3 = t.c(this.f5403e);
        c3.add(2, i3);
        return new m(c3);
    }

    public int q(m mVar) {
        if (this.f5403e instanceof GregorianCalendar) {
            return ((mVar.f5405g - this.f5405g) * 12) + (mVar.f5404f - this.f5404f);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f5405g);
        parcel.writeInt(this.f5404f);
    }
}

package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f5425c = new s(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final Long f5426a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeZone f5427b;

    public s(Long l3, TimeZone timeZone) {
        this.f5426a = l3;
        this.f5427b = timeZone;
    }

    public static s c() {
        return f5425c;
    }

    public Calendar a() {
        return b(this.f5427b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l3 = this.f5426a;
        if (l3 != null) {
            calendar.setTimeInMillis(l3.longValue());
        }
        return calendar;
    }
}

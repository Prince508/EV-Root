package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static AtomicReference f5428a = new AtomicReference();

    public static long a(long j3) {
        Calendar i3 = i();
        i3.setTimeInMillis(j3);
        return c(i3).getTimeInMillis();
    }

    public static DateFormat b(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(h());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    public static Calendar c(Calendar calendar) {
        Calendar j3 = j(calendar);
        Calendar i3 = i();
        i3.set(j3.get(1), j3.get(2), j3.get(5));
        return i3;
    }

    public static DateFormat d(Locale locale) {
        return b("MMMMEEEEd", locale);
    }

    public static s e() {
        s sVar = (s) f5428a.get();
        return sVar == null ? s.c() : sVar;
    }

    public static TimeZone f() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar g() {
        Calendar a3 = e().a();
        a3.set(11, 0);
        a3.set(12, 0);
        a3.set(13, 0);
        a3.set(14, 0);
        a3.setTimeZone(f());
        return a3;
    }

    public static android.icu.util.TimeZone h() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar i() {
        return j(null);
    }

    public static Calendar j(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(f());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }

    public static DateFormat k(Locale locale) {
        return b("yMMMM", locale);
    }

    public static DateFormat l(Locale locale) {
        return b("yMMMMEEEEd", locale);
    }
}

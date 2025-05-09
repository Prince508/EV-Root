package com.google.android.material.datepicker;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class e {
    public static String a(Context context, long j3, boolean z3, boolean z4, boolean z5) {
        String d3 = d(j3);
        if (z3) {
            d3 = String.format(context.getString(e1.h.f6942n), d3);
        }
        return z4 ? String.format(context.getString(e1.h.f6941m), d3) : z5 ? String.format(context.getString(e1.h.f6938j), d3) : d3;
    }

    public static String b(long j3) {
        return c(j3, Locale.getDefault());
    }

    public static String c(long j3, Locale locale) {
        return t.d(locale).format(new Date(j3));
    }

    public static String d(long j3) {
        return i(j3) ? b(j3) : g(j3);
    }

    public static String e(Context context, int i3) {
        return t.g().get(1) == i3 ? String.format(context.getString(e1.h.f6939k), Integer.valueOf(i3)) : String.format(context.getString(e1.h.f6940l), Integer.valueOf(i3));
    }

    public static String f(long j3) {
        return t.k(Locale.getDefault()).format(new Date(j3));
    }

    public static String g(long j3) {
        return h(j3, Locale.getDefault());
    }

    public static String h(long j3, Locale locale) {
        return t.l(locale).format(new Date(j3));
    }

    public static boolean i(long j3) {
        Calendar g3 = t.g();
        Calendar i3 = t.i();
        i3.setTimeInMillis(j3);
        return g3.get(1) == i3.get(1);
    }
}

package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public class h extends BaseAdapter {

    /* renamed from: h, reason: collision with root package name */
    public static final int f5322h;

    /* renamed from: e, reason: collision with root package name */
    public final Calendar f5323e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5324f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5325g;

    static {
        f5322h = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public h() {
        Calendar i3 = t.i();
        this.f5323e = i3;
        this.f5324f = i3.getMaximum(7);
        this.f5325g = i3.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i3) {
        if (i3 >= this.f5324f) {
            return null;
        }
        return Integer.valueOf(b(i3));
    }

    public final int b(int i3) {
        int i4 = i3 + this.f5325g;
        int i5 = this.f5324f;
        return i4 > i5 ? i4 - i5 : i4;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5324f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i3) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(e1.g.f6922k, viewGroup, false);
        }
        this.f5323e.set(7, b(i3));
        textView.setText(this.f5323e.getDisplayName(7, f5322h, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(e1.h.f6937i), this.f5323e.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public h(int i3) {
        Calendar i4 = t.i();
        this.f5323e = i4;
        this.f5324f = i4.getMaximum(7);
        this.f5325g = i3;
    }
}

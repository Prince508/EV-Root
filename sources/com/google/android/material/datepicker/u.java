package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* loaded from: classes.dex */
public class u extends RecyclerView.g {

    /* renamed from: c, reason: collision with root package name */
    public final i f5429c;

    public static class a extends RecyclerView.C {

        /* renamed from: t, reason: collision with root package name */
        public final TextView f5430t;

        public a(TextView textView) {
            super(textView);
            this.f5430t = textView;
        }
    }

    public u(i iVar) {
        this.f5429c = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f5429c.j1().n();
    }

    public int t(int i3) {
        return i3 - this.f5429c.j1().m().f5405g;
    }

    public int u(int i3) {
        return this.f5429c.j1().m().f5405g + i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void i(a aVar, int i3) {
        int u3 = u(i3);
        aVar.f5430t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(u3)));
        TextView textView = aVar.f5430t;
        textView.setContentDescription(e.e(textView.getContext(), u3));
        c k12 = this.f5429c.k1();
        if (t.g().get(1) == u3) {
            b bVar = k12.f5318f;
        } else {
            b bVar2 = k12.f5316d;
        }
        this.f5429c.m1();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public a k(ViewGroup viewGroup, int i3) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(e1.g.f6926o, viewGroup, false));
    }
}

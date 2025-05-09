package com.google.android.material.timepicker;

import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import e1.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x1.g;
import x1.i;

/* loaded from: classes.dex */
public abstract class d extends ConstraintLayout {

    /* renamed from: B, reason: collision with root package name */
    public final Runnable f5694B;

    /* renamed from: C, reason: collision with root package name */
    public int f5695C;

    /* renamed from: D, reason: collision with root package name */
    public g f5696D;

    public d(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        LayoutInflater.from(context).inflate(e1.g.f6917f, this);
        O.n0(this, u());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.z3, i3, 0);
        this.f5695C = obtainStyledAttributes.getDimensionPixelSize(j.A3, 0);
        this.f5694B = new Runnable() { // from class: com.google.android.material.timepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                d.this.z();
            }
        };
        obtainStyledAttributes.recycle();
    }

    public static boolean y(View view) {
        return "skip".equals(view.getTag());
    }

    public final void A() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f5694B);
            handler.post(this.f5694B);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        if (view.getId() == -1) {
            view.setId(O.h());
        }
        A();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        z();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        A();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        this.f5696D.T(ColorStateList.valueOf(i3));
    }

    public final void t(List list, androidx.constraintlayout.widget.d dVar, int i3) {
        Iterator it = list.iterator();
        float f3 = 0.0f;
        while (it.hasNext()) {
            dVar.g(((View) it.next()).getId(), e1.e.f6886b, i3, f3);
            f3 += 360.0f / list.size();
        }
    }

    public final Drawable u() {
        g gVar = new g();
        this.f5696D = gVar;
        gVar.R(new i(0.5f));
        this.f5696D.T(ColorStateList.valueOf(-1));
        return this.f5696D;
    }

    public int v(int i3) {
        return i3 == 2 ? Math.round(this.f5695C * 0.66f) : this.f5695C;
    }

    public int w() {
        return this.f5695C;
    }

    public void x(int i3) {
        this.f5695C = i3;
        z();
    }

    public void z() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this);
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != e1.e.f6886b && !y(childAt)) {
                int i4 = (Integer) childAt.getTag(e1.e.f6893i);
                if (i4 == null) {
                    i4 = 1;
                }
                if (!hashMap.containsKey(i4)) {
                    hashMap.put(i4, new ArrayList());
                }
                ((List) hashMap.get(i4)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            t((List) entry.getValue(), dVar, v(((Integer) entry.getKey()).intValue()));
        }
        dVar.c(this);
    }
}

package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import e1.AbstractC0464a;
import u1.AbstractC0739b;
import u1.AbstractC0740c;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f5313a;

    /* renamed from: b, reason: collision with root package name */
    public final b f5314b;

    /* renamed from: c, reason: collision with root package name */
    public final b f5315c;

    /* renamed from: d, reason: collision with root package name */
    public final b f5316d;

    /* renamed from: e, reason: collision with root package name */
    public final b f5317e;

    /* renamed from: f, reason: collision with root package name */
    public final b f5318f;

    /* renamed from: g, reason: collision with root package name */
    public final b f5319g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f5320h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0739b.d(context, AbstractC0464a.f6798p, i.class.getCanonicalName()), e1.j.f7139t2);
        this.f5313a = b.a(context, obtainStyledAttributes.getResourceId(e1.j.f7155x2, 0));
        this.f5319g = b.a(context, obtainStyledAttributes.getResourceId(e1.j.f7147v2, 0));
        this.f5314b = b.a(context, obtainStyledAttributes.getResourceId(e1.j.f7151w2, 0));
        this.f5315c = b.a(context, obtainStyledAttributes.getResourceId(e1.j.f7159y2, 0));
        ColorStateList a3 = AbstractC0740c.a(context, obtainStyledAttributes, e1.j.f7163z2);
        this.f5316d = b.a(context, obtainStyledAttributes.getResourceId(e1.j.f6968B2, 0));
        this.f5317e = b.a(context, obtainStyledAttributes.getResourceId(e1.j.f6964A2, 0));
        this.f5318f = b.a(context, obtainStyledAttributes.getResourceId(e1.j.f6972C2, 0));
        Paint paint = new Paint();
        this.f5320h = paint;
        paint.setColor(a3.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}

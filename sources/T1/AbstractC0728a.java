package t1;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import e1.AbstractC0464a;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0728a {

    /* renamed from: a, reason: collision with root package name */
    public final TimeInterpolator f9507a;

    /* renamed from: b, reason: collision with root package name */
    public final View f9508b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9509c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9510d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9511e;

    public AbstractC0728a(View view) {
        this.f9508b = view;
        Context context = view.getContext();
        this.f9507a = d.g(context, AbstractC0464a.f6777B, M.a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f9509c = d.f(context, AbstractC0464a.f6802t, 300);
        this.f9510d = d.f(context, AbstractC0464a.f6805w, 150);
        this.f9511e = d.f(context, AbstractC0464a.f6804v, 100);
    }
}

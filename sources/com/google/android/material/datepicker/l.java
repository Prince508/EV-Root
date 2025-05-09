package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import j.AbstractC0515e;

/* loaded from: classes.dex */
public final class l<S> extends q {

    /* renamed from: g0, reason: collision with root package name */
    public int f5400g0;

    /* renamed from: h0, reason: collision with root package name */
    public com.google.android.material.datepicker.a f5401h0;

    public class a extends p {
        public a() {
        }
    }

    public static l c1(d dVar, int i3, com.google.android.material.datepicker.a aVar) {
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i3);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        lVar.T0(bundle);
        return lVar;
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public void X(Bundle bundle) {
        super.X(bundle);
        if (bundle == null) {
            bundle = j();
        }
        this.f5400g0 = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC0515e.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f5401h0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public View b0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(n(), this.f5400g0));
        new a();
        throw null;
    }

    @Override // e0.AbstractComponentCallbacksC0459p
    public void n0(Bundle bundle) {
        super.n0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f5400g0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f5401h0);
    }
}

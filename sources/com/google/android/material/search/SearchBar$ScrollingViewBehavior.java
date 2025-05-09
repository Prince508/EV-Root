package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* renamed from: h, reason: collision with root package name */
    public boolean f5457h;

    public SearchBar$ScrollingViewBehavior() {
        this.f5457h = false;
    }

    @Override // g1.AbstractC0482b
    public boolean N() {
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return super.h(coordinatorLayout, view, view2);
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5457h = false;
    }
}

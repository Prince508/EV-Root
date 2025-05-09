package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import t.l;

/* renamed from: v.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0755e extends androidx.constraintlayout.widget.c {

    /* renamed from: m, reason: collision with root package name */
    public boolean f9870m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9871n;

    public AbstractC0755e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.c
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0754d.f9768a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0754d.f9796h1) {
                    this.f9870m = true;
                } else if (index == AbstractC0754d.f9824o1) {
                    this.f9871n = true;
                }
            }
        }
    }

    public abstract void n(l lVar, int i3, int i4);

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f9870m || this.f9871n) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i3 = 0; i3 < this.f3335f; i3++) {
                View h3 = constraintLayout.h(this.f3334e[i3]);
                if (h3 != null) {
                    if (this.f9870m) {
                        h3.setVisibility(visibility);
                    }
                    if (this.f9871n && elevation > 0.0f) {
                        h3.setTranslationZ(h3.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        c();
    }
}

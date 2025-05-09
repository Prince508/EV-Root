package com.google.android.material.internal;

import K.C0184a;
import K.O;
import L.x;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import d.AbstractC0435a;
import l.C0572m;

/* loaded from: classes.dex */
public class CheckableImageButton extends C0572m implements Checkable {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f5435k = {R.attr.state_checked};

    /* renamed from: h, reason: collision with root package name */
    public boolean f5436h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5437i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5438j;

    public class a extends C0184a {
        public a() {
        }

        @Override // K.C0184a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // K.C0184a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.h0(CheckableImageButton.this.a());
            xVar.i0(CheckableImageButton.this.isChecked());
        }
    }

    public static class b extends S.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public boolean f5440g;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i3) {
                return new b[i3];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f5440g = parcel.readInt() == 1;
        }

        @Override // S.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeInt(this.f5440g ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0435a.f6028o);
    }

    public boolean a() {
        return this.f5437i;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f5436h;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i3) {
        if (!this.f5436h) {
            return super.onCreateDrawableState(i3);
        }
        int[] iArr = f5435k;
        return View.mergeDrawableStates(super.onCreateDrawableState(i3 + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f5440g);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f5440g = this.f5436h;
        return bVar;
    }

    public void setCheckable(boolean z3) {
        if (this.f5437i != z3) {
            this.f5437i = z3;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (!this.f5437i || this.f5436h == z3) {
            return;
        }
        this.f5436h = z3;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z3) {
        this.f5438j = z3;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        if (this.f5438j) {
            super.setPressed(z3);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f5436h);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f5437i = true;
        this.f5438j = true;
        O.j0(this, new a());
    }
}

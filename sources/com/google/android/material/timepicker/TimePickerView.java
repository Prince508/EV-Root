package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import e1.g;

/* loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: B, reason: collision with root package name */
    public final Chip f5681B;

    /* renamed from: C, reason: collision with root package name */
    public final Chip f5682C;

    /* renamed from: D, reason: collision with root package name */
    public final ClockHandView f5683D;

    /* renamed from: E, reason: collision with root package name */
    public final ClockFaceView f5684E;

    /* renamed from: F, reason: collision with root package name */
    public final MaterialButtonToggleGroup f5685F;

    /* renamed from: G, reason: collision with root package name */
    public final View.OnClickListener f5686G;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.u(TimePickerView.this);
        }
    }

    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.v(TimePickerView.this);
            return false;
        }
    }

    public class c implements View.OnTouchListener {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ GestureDetector f5689e;

        public c(GestureDetector gestureDetector) {
            this.f5689e = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f5689e.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public interface d {
    }

    public interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ e u(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public static /* synthetic */ d v(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i3) {
        super.onVisibilityChanged(view, i3);
        if (view == this && i3 == 0) {
            this.f5682C.sendAccessibilityEvent(8);
        }
    }

    public final void w() {
        Chip chip = this.f5681B;
        int i3 = e1.e.f6874C;
        chip.setTag(i3, 12);
        this.f5682C.setTag(i3, 10);
        this.f5681B.setOnClickListener(this.f5686G);
        this.f5682C.setOnClickListener(this.f5686G);
        this.f5681B.setAccessibilityClassName("android.view.View");
        this.f5682C.setAccessibilityClassName("android.view.View");
    }

    public final void x() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f5681B.setOnTouchListener(cVar);
        this.f5682C.setOnTouchListener(cVar);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f5686G = new a();
        LayoutInflater.from(context).inflate(g.f6920i, this);
        this.f5684E = (ClockFaceView) findViewById(e1.e.f6891g);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(e1.e.f6894j);
        this.f5685F = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i4, boolean z3) {
                TimePickerView.this.getClass();
            }
        });
        this.f5681B = (Chip) findViewById(e1.e.f6897m);
        this.f5682C = (Chip) findViewById(e1.e.f6895k);
        this.f5683D = (ClockHandView) findViewById(e1.e.f6892h);
        x();
        w();
    }
}

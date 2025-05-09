package n1;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnTouchListenerC0609a implements View.OnTouchListener {

    /* renamed from: e, reason: collision with root package name */
    public final Dialog f8552e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8553f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8554g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8555h;

    public ViewOnTouchListenerC0609a(Dialog dialog, Rect rect) {
        this.f8552e = dialog;
        this.f8553f = rect.left;
        this.f8554g = rect.top;
        this.f8555h = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = this.f8553f + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        if (new RectF(left, this.f8554g + findViewById.getTop(), width, findViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i3 = this.f8555h;
            obtain.setLocation((-i3) - 1, (-i3) - 1);
        }
        view.performClick();
        return this.f8552e.onTouchEvent(obtain);
    }
}

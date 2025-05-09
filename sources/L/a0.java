package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8323a;

    /* renamed from: b, reason: collision with root package name */
    public final View f8324b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f8325c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f8326d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f8327e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f8328f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f8329g;

    public a0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f8326d = layoutParams;
        this.f8327e = new Rect();
        this.f8328f = new int[2];
        this.f8329g = new int[2];
        this.f8323a = context;
        View inflate = LayoutInflater.from(context).inflate(d.f.f6139m, (ViewGroup) null);
        this.f8324b = inflate;
        this.f8325c = (TextView) inflate.findViewById(d.e.f6113m);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = d.h.f6154a;
        layoutParams.flags = 24;
    }

    public static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams).type != 2) {
            for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return ((Activity) context).getWindow().getDecorView();
                }
            }
        }
        return rootView;
    }

    public final void a(View view, int i3, int i4, boolean z3, WindowManager.LayoutParams layoutParams) {
        int height;
        int i5;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f8323a.getResources().getDimensionPixelOffset(d.c.f6051k);
        if (view.getWidth() < dimensionPixelOffset) {
            i3 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f8323a.getResources().getDimensionPixelOffset(d.c.f6050j);
            height = i4 + dimensionPixelOffset2;
            i5 = i4 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i5 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f8323a.getResources().getDimensionPixelOffset(z3 ? d.c.f6053m : d.c.f6052l);
        View b3 = b(view);
        if (b3 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b3.getWindowVisibleDisplayFrame(this.f8327e);
        Rect rect = this.f8327e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f8323a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f8327e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b3.getLocationOnScreen(this.f8329g);
        view.getLocationOnScreen(this.f8328f);
        int[] iArr = this.f8328f;
        int i6 = iArr[0];
        int[] iArr2 = this.f8329g;
        int i7 = i6 - iArr2[0];
        iArr[0] = i7;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i7 + i3) - (b3.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f8324b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f8324b.getMeasuredHeight();
        int i8 = this.f8328f[1];
        int i9 = ((i5 + i8) - dimensionPixelOffset3) - measuredHeight;
        int i10 = i8 + height + dimensionPixelOffset3;
        if (z3) {
            if (i9 >= 0) {
                layoutParams.y = i9;
                return;
            } else {
                layoutParams.y = i10;
                return;
            }
        }
        if (measuredHeight + i10 <= this.f8327e.height()) {
            layoutParams.y = i10;
        } else {
            layoutParams.y = i9;
        }
    }

    public void c() {
        if (d()) {
            ((WindowManager) this.f8323a.getSystemService("window")).removeView(this.f8324b);
        }
    }

    public boolean d() {
        return this.f8324b.getParent() != null;
    }

    public void e(View view, int i3, int i4, boolean z3, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f8325c.setText(charSequence);
        a(view, i3, i4, z3, this.f8326d);
        ((WindowManager) this.f8323a.getSystemService("window")).addView(this.f8324b, this.f8326d);
    }
}

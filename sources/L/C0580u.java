package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0580u {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f8423l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static ConcurrentHashMap f8424m = new ConcurrentHashMap();

    /* renamed from: n, reason: collision with root package name */
    public static ConcurrentHashMap f8425n = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f8426a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8427b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f8428c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f8429d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f8430e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f8431f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f8432g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f8433h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f8434i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f8435j;

    /* renamed from: k, reason: collision with root package name */
    public final f f8436k;

    /* renamed from: l.u$a */
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i3, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i3, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* renamed from: l.u$b */
    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    /* renamed from: l.u$c */
    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i3, int i4, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i3);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i4 == -1) {
                i4 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i4);
            try {
                fVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* renamed from: l.u$d */
    public static class d extends f {
        @Override // l.C0580u.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0580u.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: l.u$e */
    public static class e extends d {
        @Override // l.C0580u.d, l.C0580u.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // l.C0580u.f
        public boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* renamed from: l.u$f */
    public static class f {
        public abstract void a(StaticLayout.Builder builder, TextView textView);

        public boolean b(TextView textView) {
            return ((Boolean) C0580u.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C0580u(TextView textView) {
        this.f8434i = textView;
        this.f8435j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f8436k = new e();
        } else {
            this.f8436k = new d();
        }
    }

    public static Method k(String str) {
        try {
            Method method = (Method) f8424m.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return method;
            }
            method.setAccessible(true);
            f8424m.put(str, method);
            return method;
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e3);
            return null;
        }
    }

    public static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, new Object[0]);
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
            return obj2;
        }
    }

    public void a() {
        if (n()) {
            if (this.f8427b) {
                if (this.f8434i.getMeasuredHeight() <= 0 || this.f8434i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f8436k.b(this.f8434i) ? 1048576 : (this.f8434i.getMeasuredWidth() - this.f8434i.getTotalPaddingLeft()) - this.f8434i.getTotalPaddingRight();
                int height = (this.f8434i.getHeight() - this.f8434i.getCompoundPaddingBottom()) - this.f8434i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f8423l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float e3 = e(rectF);
                        if (e3 != this.f8434i.getTextSize()) {
                            t(0, e3);
                        }
                    } finally {
                    }
                }
            }
            this.f8427b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i3 : iArr) {
                if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i4 = 0; i4 < size; i4++) {
                    iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final void c() {
        this.f8426a = 0;
        this.f8429d = -1.0f;
        this.f8430e = -1.0f;
        this.f8428c = -1.0f;
        this.f8431f = new int[0];
        this.f8427b = false;
    }

    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i3, int i4) {
        return c.a(charSequence, alignment, i3, i4, this.f8434i, this.f8433h, this.f8436k);
    }

    public final int e(RectF rectF) {
        int length = this.f8431f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i3 = 1;
        int i4 = length - 1;
        int i5 = 0;
        while (i3 <= i4) {
            int i6 = (i3 + i4) / 2;
            if (x(this.f8431f[i6], rectF)) {
                int i7 = i6 + 1;
                i5 = i3;
                i3 = i7;
            } else {
                i5 = i6 - 1;
                i4 = i5;
            }
        }
        return this.f8431f[i5];
    }

    public int f() {
        return Math.round(this.f8430e);
    }

    public int g() {
        return Math.round(this.f8429d);
    }

    public int h() {
        return Math.round(this.f8428c);
    }

    public int[] i() {
        return this.f8431f;
    }

    public int j() {
        return this.f8426a;
    }

    public void l(int i3) {
        TextPaint textPaint = this.f8433h;
        if (textPaint == null) {
            this.f8433h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f8433h.set(this.f8434i.getPaint());
        this.f8433h.setTextSize(i3);
    }

    public boolean n() {
        return y() && this.f8426a != 0;
    }

    public void o(AttributeSet attributeSet, int i3) {
        int resourceId;
        Context context = this.f8435j;
        int[] iArr = d.i.f6228S;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        TextView textView = this.f8434i;
        K.O.h0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i3, 0);
        int i4 = d.i.f6246X;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.f8426a = obtainStyledAttributes.getInt(i4, 0);
        }
        int i5 = d.i.f6243W;
        float dimension = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = d.i.f6236U;
        float dimension2 = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getDimension(i6, -1.0f) : -1.0f;
        int i7 = d.i.f6232T;
        float dimension3 = obtainStyledAttributes.hasValue(i7) ? obtainStyledAttributes.getDimension(i7, -1.0f) : -1.0f;
        int i8 = d.i.f6240V;
        if (obtainStyledAttributes.hasValue(i8) && (resourceId = obtainStyledAttributes.getResourceId(i8, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!y()) {
            this.f8426a = 0;
            return;
        }
        if (this.f8426a == 1) {
            if (!this.f8432g) {
                DisplayMetrics displayMetrics = this.f8435j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    public void p(int i3, int i4, int i5, int i6) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f8435j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i6, i3, displayMetrics), TypedValue.applyDimension(i6, i4, displayMetrics), TypedValue.applyDimension(i6, i5, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    public void q(int[] iArr, int i3) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i3 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f8435j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArr2[i4] = Math.round(TypedValue.applyDimension(i3, iArr[i4], displayMetrics));
                    }
                }
                this.f8431f = b(iArr2);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f8432g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    public void r(int i3) {
        if (y()) {
            if (i3 == 0) {
                c();
                return;
            }
            if (i3 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i3);
            }
            DisplayMetrics displayMetrics = this.f8435j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    public final void s(float f3) {
        if (f3 != this.f8434i.getPaint().getTextSize()) {
            this.f8434i.getPaint().setTextSize(f3);
            boolean a3 = b.a(this.f8434i);
            if (this.f8434i.getLayout() != null) {
                this.f8427b = false;
                try {
                    Method k3 = k("nullLayouts");
                    if (k3 != null) {
                        k3.invoke(this.f8434i, new Object[0]);
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
                }
                if (a3) {
                    this.f8434i.forceLayout();
                } else {
                    this.f8434i.requestLayout();
                }
                this.f8434i.invalidate();
            }
        }
    }

    public void t(int i3, float f3) {
        Context context = this.f8435j;
        s(TypedValue.applyDimension(i3, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean u() {
        if (y() && this.f8426a == 1) {
            if (!this.f8432g || this.f8431f.length == 0) {
                int floor = ((int) Math.floor((this.f8430e - this.f8429d) / this.f8428c)) + 1;
                int[] iArr = new int[floor];
                for (int i3 = 0; i3 < floor; i3++) {
                    iArr[i3] = Math.round(this.f8429d + (i3 * this.f8428c));
                }
                this.f8431f = b(iArr);
            }
            this.f8427b = true;
        } else {
            this.f8427b = false;
        }
        return this.f8427b;
    }

    public final void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = typedArray.getDimensionPixelSize(i3, -1);
            }
            this.f8431f = b(iArr);
            w();
        }
    }

    public final boolean w() {
        boolean z3 = this.f8431f.length > 0;
        this.f8432g = z3;
        if (z3) {
            this.f8426a = 1;
            this.f8429d = r0[0];
            this.f8430e = r0[r1 - 1];
            this.f8428c = -1.0f;
        }
        return z3;
    }

    public final boolean x(int i3, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f8434i.getText();
        TransformationMethod transformationMethod = this.f8434i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f8434i)) != null) {
            text = transformation;
        }
        int b3 = a.b(this.f8434i);
        l(i3);
        StaticLayout d3 = d(text, (Layout.Alignment) m(this.f8434i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b3);
        return (b3 == -1 || (d3.getLineCount() <= b3 && d3.getLineEnd(d3.getLineCount() - 1) == text.length())) && ((float) d3.getHeight()) <= rectF.bottom;
    }

    public final boolean y() {
        return !(this.f8434i instanceof AbstractC0568i);
    }

    public final void z(float f3, float f4, float f5) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
        }
        if (f4 <= f3) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f4 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        if (f5 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f5 + "px) is less or equal to (0px)");
        }
        this.f8426a = 1;
        this.f8429d = f3;
        this.f8430e = f4;
        this.f8428c = f5;
        this.f8432g = false;
    }
}

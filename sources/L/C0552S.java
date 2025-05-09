package l;

import B.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import f.AbstractC0467a;

/* renamed from: l.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0552S {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8294a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f8295b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f8296c;

    public C0552S(Context context, TypedArray typedArray) {
        this.f8294a = context;
        this.f8295b = typedArray;
    }

    public static C0552S r(Context context, int i3, int[] iArr) {
        return new C0552S(context, context.obtainStyledAttributes(i3, iArr));
    }

    public static C0552S s(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0552S(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static C0552S t(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i4) {
        return new C0552S(context, context.obtainStyledAttributes(attributeSet, iArr, i3, i4));
    }

    public boolean a(int i3, boolean z3) {
        return this.f8295b.getBoolean(i3, z3);
    }

    public int b(int i3, int i4) {
        return this.f8295b.getColor(i3, i4);
    }

    public ColorStateList c(int i3) {
        int resourceId;
        ColorStateList a3;
        return (!this.f8295b.hasValue(i3) || (resourceId = this.f8295b.getResourceId(i3, 0)) == 0 || (a3 = AbstractC0467a.a(this.f8294a, resourceId)) == null) ? this.f8295b.getColorStateList(i3) : a3;
    }

    public float d(int i3, float f3) {
        return this.f8295b.getDimension(i3, f3);
    }

    public int e(int i3, int i4) {
        return this.f8295b.getDimensionPixelOffset(i3, i4);
    }

    public int f(int i3, int i4) {
        return this.f8295b.getDimensionPixelSize(i3, i4);
    }

    public Drawable g(int i3) {
        int resourceId;
        return (!this.f8295b.hasValue(i3) || (resourceId = this.f8295b.getResourceId(i3, 0)) == 0) ? this.f8295b.getDrawable(i3) : AbstractC0467a.b(this.f8294a, resourceId);
    }

    public float h(int i3, float f3) {
        return this.f8295b.getFloat(i3, f3);
    }

    public Typeface i(int i3, int i4, f.e eVar) {
        int resourceId = this.f8295b.getResourceId(i3, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f8296c == null) {
            this.f8296c = new TypedValue();
        }
        return B.f.h(this.f8294a, resourceId, this.f8296c, i4, eVar);
    }

    public int j(int i3, int i4) {
        return this.f8295b.getInt(i3, i4);
    }

    public int k(int i3, int i4) {
        return this.f8295b.getInteger(i3, i4);
    }

    public int l(int i3, int i4) {
        return this.f8295b.getLayoutDimension(i3, i4);
    }

    public int m(int i3, int i4) {
        return this.f8295b.getResourceId(i3, i4);
    }

    public String n(int i3) {
        return this.f8295b.getString(i3);
    }

    public CharSequence o(int i3) {
        return this.f8295b.getText(i3);
    }

    public TypedArray p() {
        return this.f8295b;
    }

    public boolean q(int i3) {
        return this.f8295b.hasValue(i3);
    }

    public void u() {
        this.f8295b.recycle();
    }
}

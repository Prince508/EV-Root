package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import u0.AbstractC0735a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0735a abstractC0735a) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3497a = abstractC0735a.p(iconCompat.f3497a, 1);
        iconCompat.f3499c = abstractC0735a.j(iconCompat.f3499c, 2);
        iconCompat.f3500d = abstractC0735a.r(iconCompat.f3500d, 3);
        iconCompat.f3501e = abstractC0735a.p(iconCompat.f3501e, 4);
        iconCompat.f3502f = abstractC0735a.p(iconCompat.f3502f, 5);
        iconCompat.f3503g = (ColorStateList) abstractC0735a.r(iconCompat.f3503g, 6);
        iconCompat.f3505i = abstractC0735a.t(iconCompat.f3505i, 7);
        iconCompat.f3506j = abstractC0735a.t(iconCompat.f3506j, 8);
        iconCompat.f();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0735a abstractC0735a) {
        abstractC0735a.x(true, true);
        iconCompat.g(abstractC0735a.f());
        int i3 = iconCompat.f3497a;
        if (-1 != i3) {
            abstractC0735a.F(i3, 1);
        }
        byte[] bArr = iconCompat.f3499c;
        if (bArr != null) {
            abstractC0735a.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3500d;
        if (parcelable != null) {
            abstractC0735a.H(parcelable, 3);
        }
        int i4 = iconCompat.f3501e;
        if (i4 != 0) {
            abstractC0735a.F(i4, 4);
        }
        int i5 = iconCompat.f3502f;
        if (i5 != 0) {
            abstractC0735a.F(i5, 5);
        }
        ColorStateList colorStateList = iconCompat.f3503g;
        if (colorStateList != null) {
            abstractC0735a.H(colorStateList, 6);
        }
        String str = iconCompat.f3505i;
        if (str != null) {
            abstractC0735a.J(str, 7);
        }
        String str2 = iconCompat.f3506j;
        if (str2 != null) {
            abstractC0735a.J(str2, 8);
        }
    }
}

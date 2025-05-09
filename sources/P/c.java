package P;

import J.g;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f1649a = new String[0];

    public static class a {
        public static void a(EditorInfo editorInfo, CharSequence charSequence, int i3) {
            editorInfo.setInitialSurroundingSubText(charSequence, i3);
        }
    }

    public static String[] a(EditorInfo editorInfo) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 25) {
            strArr = editorInfo.contentMimeTypes;
            return strArr != null ? strArr : f1649a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f1649a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        return stringArray != null ? stringArray : f1649a;
    }

    public static boolean b(CharSequence charSequence, int i3, int i4) {
        if (i4 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i3));
        }
        if (i4 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i3));
    }

    public static boolean c(int i3) {
        int i4 = i3 & 4095;
        return i4 == 129 || i4 == 225 || i4 == 18;
    }

    public static void d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static void e(EditorInfo editorInfo, CharSequence charSequence, int i3) {
        g.g(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, i3);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        int i6 = i4 > i5 ? i5 - i3 : i4 - i3;
        int i7 = i4 > i5 ? i4 - i3 : i5 - i3;
        int length = charSequence.length();
        if (i3 < 0 || i6 < 0 || i7 > length) {
            g(editorInfo, null, 0, 0);
            return;
        }
        if (c(editorInfo.inputType)) {
            g(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            g(editorInfo, charSequence, i6, i7);
        } else {
            h(editorInfo, charSequence, i6, i7);
        }
    }

    public static void f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(editorInfo, charSequence, 0);
        } else {
            e(editorInfo, charSequence, 0);
        }
    }

    public static void g(EditorInfo editorInfo, CharSequence charSequence, int i3, int i4) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i3);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i4);
    }

    public static void h(EditorInfo editorInfo, CharSequence charSequence, int i3, int i4) {
        int i5 = i4 - i3;
        int i6 = i5 > 1024 ? 0 : i5;
        int i7 = 2048 - i6;
        int min = Math.min(charSequence.length() - i4, i7 - Math.min(i3, (int) (i7 * 0.8d)));
        int min2 = Math.min(i3, i7 - min);
        int i8 = i3 - min2;
        if (b(charSequence, i8, 0)) {
            i8++;
            min2--;
        }
        if (b(charSequence, (i4 + min) - 1, 1)) {
            min--;
        }
        g(editorInfo, i6 != i5 ? TextUtils.concat(charSequence.subSequence(i8, i8 + min2), charSequence.subSequence(i4, min + i4)) : charSequence.subSequence(i8, min2 + i6 + min + i8), min2, i6 + min2);
    }
}

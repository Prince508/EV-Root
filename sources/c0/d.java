package c0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f4723a;

    /* renamed from: b, reason: collision with root package name */
    public c.e f4724b;

    public static class a extends c.e {

        /* renamed from: a, reason: collision with root package name */
        public final Reference f4725a;

        /* renamed from: b, reason: collision with root package name */
        public final Reference f4726b;

        public a(TextView textView, d dVar) {
            this.f4725a = new WeakReference(textView);
            this.f4726b = new WeakReference(dVar);
        }

        @Override // androidx.emoji2.text.c.e
        public void b() {
            CharSequence text;
            CharSequence o3;
            super.b();
            TextView textView = (TextView) this.f4725a.get();
            if (c(textView, (InputFilter) this.f4726b.get()) && textView.isAttachedToWindow() && text != (o3 = androidx.emoji2.text.c.b().o((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(o3);
                int selectionEnd = Selection.getSelectionEnd(o3);
                textView.setText(o3);
                if (o3 instanceof Spannable) {
                    d.b((Spannable) o3, selectionStart, selectionEnd);
                }
            }
        }

        public final boolean c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public d(TextView textView) {
        this.f4723a = textView;
    }

    public static void b(Spannable spannable, int i3, int i4) {
        if (i3 >= 0 && i4 >= 0) {
            Selection.setSelection(spannable, i3, i4);
        } else if (i3 >= 0) {
            Selection.setSelection(spannable, i3);
        } else if (i4 >= 0) {
            Selection.setSelection(spannable, i4);
        }
    }

    public final c.e a() {
        if (this.f4724b == null) {
            this.f4724b = new a(this.f4723a, this);
        }
        return this.f4724b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
        if (this.f4723a.isInEditMode()) {
            return charSequence;
        }
        int d3 = androidx.emoji2.text.c.b().d();
        if (d3 != 0) {
            if (d3 == 1) {
                if (i6 == 0 && i5 == 0 && spanned.length() == 0 && charSequence == this.f4723a.getText()) {
                    return charSequence;
                }
                if (charSequence == null) {
                    return charSequence;
                }
                if (i3 != 0 || i4 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i3, i4);
                }
                return androidx.emoji2.text.c.b().p(charSequence, 0, charSequence.length());
            }
            if (d3 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.c.b().s(a());
        return charSequence;
    }
}

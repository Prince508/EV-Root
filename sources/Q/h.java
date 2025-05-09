package Q;

import K.C0190d;
import K.D;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class h implements D {
    public static CharSequence b(Context context, ClipData.Item item, int i3) {
        if ((i3 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence coerceToText = item.coerceToText(context);
        return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
    }

    public static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // K.D
    public C0190d a(View view, C0190d c0190d) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0190d);
        }
        if (c0190d.d() == 2) {
            return c0190d;
        }
        ClipData b3 = c0190d.b();
        int c3 = c0190d.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z3 = false;
        for (int i3 = 0; i3 < b3.getItemCount(); i3++) {
            CharSequence b4 = b(context, b3.getItemAt(i3), c3);
            if (b4 != null) {
                if (z3) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b4);
                } else {
                    c(editable, b4);
                    z3 = true;
                }
            }
        }
        return null;
    }
}

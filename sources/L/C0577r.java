package l;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: l.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0577r {

    /* renamed from: a, reason: collision with root package name */
    public TextView f8391a;

    /* renamed from: b, reason: collision with root package name */
    public TextClassifier f8392b;

    /* renamed from: l.r$a */
    public static final class a {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public C0577r(TextView textView) {
        this.f8391a = (TextView) J.g.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f8392b;
        return textClassifier == null ? a.a(this.f8391a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f8392b = textClassifier;
    }
}

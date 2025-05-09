package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: l.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0551Q extends AbstractC0545K {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f8293b;

    public C0551Q(Context context, Resources resources) {
        super(resources);
        this.f8293b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i3) {
        Drawable a3 = a(i3);
        Context context = (Context) this.f8293b.get();
        if (a3 != null && context != null) {
            C0544J.g().v(context, i3, a3);
        }
        return a3;
    }
}

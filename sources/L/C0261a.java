package L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: L.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f1246a;

    /* renamed from: b, reason: collision with root package name */
    public final x f1247b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1248c;

    public C0261a(int i3, x xVar, int i4) {
        this.f1246a = i3;
        this.f1247b = xVar;
        this.f1248c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1246a);
        this.f1247b.a0(this.f1248c, bundle);
    }
}

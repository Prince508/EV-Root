package h1;

import K.C0205k0;
import K.X;
import android.view.View;
import f1.AbstractC0474a;
import java.util.Iterator;
import java.util.List;

/* renamed from: h1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0489c extends X.b {

    /* renamed from: c, reason: collision with root package name */
    public final View f7238c;

    /* renamed from: d, reason: collision with root package name */
    public int f7239d;

    /* renamed from: e, reason: collision with root package name */
    public int f7240e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f7241f;

    public C0489c(View view) {
        super(0);
        this.f7241f = new int[2];
        this.f7238c = view;
    }

    @Override // K.X.b
    public void b(X x3) {
        this.f7238c.setTranslationY(0.0f);
    }

    @Override // K.X.b
    public void c(X x3) {
        this.f7238c.getLocationOnScreen(this.f7241f);
        this.f7239d = this.f7241f[1];
    }

    @Override // K.X.b
    public C0205k0 d(C0205k0 c0205k0, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((X) it.next()).c() & C0205k0.m.c()) != 0) {
                this.f7238c.setTranslationY(AbstractC0474a.c(this.f7240e, 0, r0.b()));
                break;
            }
        }
        return c0205k0;
    }

    @Override // K.X.b
    public X.a e(X x3, X.a aVar) {
        this.f7238c.getLocationOnScreen(this.f7241f);
        int i3 = this.f7239d - this.f7241f[1];
        this.f7240e = i3;
        this.f7238c.setTranslationY(i3);
        return aVar;
    }
}

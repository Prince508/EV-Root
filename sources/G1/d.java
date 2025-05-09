package g1;

import K.O;
import android.view.View;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final View f7229a;

    /* renamed from: b, reason: collision with root package name */
    public int f7230b;

    /* renamed from: c, reason: collision with root package name */
    public int f7231c;

    /* renamed from: d, reason: collision with root package name */
    public int f7232d;

    /* renamed from: e, reason: collision with root package name */
    public int f7233e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7234f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7235g = true;

    public d(View view) {
        this.f7229a = view;
    }

    public void a() {
        View view = this.f7229a;
        O.U(view, this.f7232d - (view.getTop() - this.f7230b));
        View view2 = this.f7229a;
        O.T(view2, this.f7233e - (view2.getLeft() - this.f7231c));
    }

    public int b() {
        return this.f7232d;
    }

    public void c() {
        this.f7230b = this.f7229a.getTop();
        this.f7231c = this.f7229a.getLeft();
    }

    public boolean d(int i3) {
        if (!this.f7235g || this.f7233e == i3) {
            return false;
        }
        this.f7233e = i3;
        a();
        return true;
    }

    public boolean e(int i3) {
        if (!this.f7234f || this.f7232d == i3) {
            return false;
        }
        this.f7232d = i3;
        a();
        return true;
    }
}

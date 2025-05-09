package H0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f673a;

    /* renamed from: b, reason: collision with root package name */
    public long f674b;

    /* renamed from: c, reason: collision with root package name */
    public List f675c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public List f676d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final List f677e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final List f678f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final List f679g = new ArrayList();

    public void a(int i3, Object... objArr) {
        this.f677e.add(new F0.b(i3, objArr));
    }

    public void b(int i3, Object... objArr) {
        this.f678f.add(new F0.b(i3, objArr));
    }

    public boolean c() {
        return !this.f679g.isEmpty();
    }

    public boolean d() {
        return !this.f678f.isEmpty();
    }

    public List e() {
        return this.f679g;
    }

    public List f() {
        return this.f677e;
    }

    public List g() {
        return this.f678f;
    }
}

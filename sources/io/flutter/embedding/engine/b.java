package io.flutter.embedding.engine;

import a2.C0313a;
import android.content.Context;
import c2.C0400d;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.r;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f7541a = new ArrayList();

    public class a implements a.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.flutter.embedding.engine.a f7542a;

        public a(io.flutter.embedding.engine.a aVar) {
            this.f7542a = aVar;
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
            b.this.f7541a.remove(this.f7542a);
        }
    }

    /* renamed from: io.flutter.embedding.engine.b$b, reason: collision with other inner class name */
    public static class C0129b {

        /* renamed from: a, reason: collision with root package name */
        public Context f7544a;

        /* renamed from: b, reason: collision with root package name */
        public C0313a.b f7545b;

        /* renamed from: c, reason: collision with root package name */
        public String f7546c;

        /* renamed from: d, reason: collision with root package name */
        public List f7547d;

        /* renamed from: e, reason: collision with root package name */
        public r f7548e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f7549f = true;

        /* renamed from: g, reason: collision with root package name */
        public boolean f7550g = false;

        public C0129b(Context context) {
            this.f7544a = context;
        }

        public boolean a() {
            return this.f7549f;
        }

        public Context b() {
            return this.f7544a;
        }

        public C0313a.b c() {
            return this.f7545b;
        }

        public List d() {
            return this.f7547d;
        }

        public String e() {
            return this.f7546c;
        }

        public r f() {
            return this.f7548e;
        }

        public boolean g() {
            return this.f7550g;
        }

        public C0129b h(boolean z3) {
            this.f7549f = z3;
            return this;
        }

        public C0129b i(C0313a.b bVar) {
            this.f7545b = bVar;
            return this;
        }

        public C0129b j(List list) {
            this.f7547d = list;
            return this;
        }

        public C0129b k(String str) {
            this.f7546c = str;
            return this;
        }

        public C0129b l(boolean z3) {
            this.f7550g = z3;
            return this;
        }
    }

    public b(Context context, String[] strArr) {
        C0400d c3 = W1.a.e().c();
        if (c3.k()) {
            return;
        }
        c3.m(context.getApplicationContext());
        c3.f(context.getApplicationContext(), strArr);
    }

    public io.flutter.embedding.engine.a a(C0129b c0129b) {
        io.flutter.embedding.engine.a A3;
        Context b3 = c0129b.b();
        C0313a.b c3 = c0129b.c();
        String e3 = c0129b.e();
        List d3 = c0129b.d();
        r f3 = c0129b.f();
        if (f3 == null) {
            f3 = new r();
        }
        r rVar = f3;
        boolean a3 = c0129b.a();
        boolean g3 = c0129b.g();
        if (c3 == null) {
            c3 = C0313a.b.a();
        }
        C0313a.b bVar = c3;
        if (this.f7541a.size() == 0) {
            A3 = b(b3, rVar, a3, g3);
            if (e3 != null) {
                A3.o().c(e3);
            }
            A3.k().h(bVar, d3);
        } else {
            A3 = ((io.flutter.embedding.engine.a) this.f7541a.get(0)).A(b3, bVar, e3, d3, rVar, a3, g3);
        }
        this.f7541a.add(A3);
        A3.e(new a(A3));
        return A3;
    }

    public io.flutter.embedding.engine.a b(Context context, r rVar, boolean z3, boolean z4) {
        return new io.flutter.embedding.engine.a(context, null, null, rVar, null, z3, z4, this);
    }
}

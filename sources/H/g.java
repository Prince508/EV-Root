package H;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class g {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f625a;

        /* renamed from: b, reason: collision with root package name */
        public final b[] f626b;

        public a(int i3, b[] bVarArr) {
            this.f625a = i3;
            this.f626b = bVarArr;
        }

        public static a a(int i3, b[] bVarArr) {
            return new a(i3, bVarArr);
        }

        public b[] b() {
            return this.f626b;
        }

        public int c() {
            return this.f625a;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f627a;

        /* renamed from: b, reason: collision with root package name */
        public final int f628b;

        /* renamed from: c, reason: collision with root package name */
        public final int f629c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f630d;

        /* renamed from: e, reason: collision with root package name */
        public final int f631e;

        public b(Uri uri, int i3, int i4, boolean z3, int i5) {
            this.f627a = (Uri) J.g.g(uri);
            this.f628b = i3;
            this.f629c = i4;
            this.f630d = z3;
            this.f631e = i5;
        }

        public static b a(Uri uri, int i3, int i4, boolean z3, int i5) {
            return new b(uri, i3, i4, z3, i5);
        }

        public int b() {
            return this.f631e;
        }

        public int c() {
            return this.f628b;
        }

        public Uri d() {
            return this.f627a;
        }

        public int e() {
            return this.f629c;
        }

        public boolean f() {
            return this.f630d;
        }
    }

    public static class c {
        public abstract void a(int i3);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return C.e.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i3, boolean z3, int i4, Handler handler, c cVar) {
        H.a aVar = new H.a(cVar, handler);
        return z3 ? f.e(context, eVar, aVar, i3, i4) : f.d(context, eVar, i3, null, aVar);
    }
}

package P;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final c f1653a;

    public interface c {
        void a();

        Uri b();

        ClipDescription c();

        Object d();

        Uri e();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f1653a = new a(uri, clipDescription, uri2);
        } else {
            this.f1653a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f1653a.e();
    }

    public ClipDescription b() {
        return this.f1653a.c();
    }

    public Uri c() {
        return this.f1653a.b();
    }

    public void d() {
        this.f1653a.a();
    }

    public Object e() {
        return this.f1653a.d();
    }

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final InputContentInfo f1654a;

        public a(Object obj) {
            this.f1654a = (InputContentInfo) obj;
        }

        @Override // P.f.c
        public void a() {
            this.f1654a.requestPermission();
        }

        @Override // P.f.c
        public Uri b() {
            return this.f1654a.getLinkUri();
        }

        @Override // P.f.c
        public ClipDescription c() {
            return this.f1654a.getDescription();
        }

        @Override // P.f.c
        public Object d() {
            return this.f1654a;
        }

        @Override // P.f.c
        public Uri e() {
            return this.f1654a.getContentUri();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f1654a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public f(c cVar) {
        this.f1653a = cVar;
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f1655a;

        /* renamed from: b, reason: collision with root package name */
        public final ClipDescription f1656b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f1657c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f1655a = uri;
            this.f1656b = clipDescription;
            this.f1657c = uri2;
        }

        @Override // P.f.c
        public Uri b() {
            return this.f1657c;
        }

        @Override // P.f.c
        public ClipDescription c() {
            return this.f1656b;
        }

        @Override // P.f.c
        public Object d() {
            return null;
        }

        @Override // P.f.c
        public Uri e() {
            return this.f1655a;
        }

        @Override // P.f.c
        public void a() {
        }
    }
}

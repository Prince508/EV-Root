package K;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* renamed from: K.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190d {

    /* renamed from: a, reason: collision with root package name */
    public final f f1005a;

    /* renamed from: K.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final c f1006a;

        public a(ClipData clipData, int i3) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f1006a = new b(clipData, i3);
            } else {
                this.f1006a = new C0030d(clipData, i3);
            }
        }

        public C0190d a() {
            return this.f1006a.a();
        }

        public a b(Bundle bundle) {
            this.f1006a.b(bundle);
            return this;
        }

        public a c(int i3) {
            this.f1006a.d(i3);
            return this;
        }

        public a d(Uri uri) {
            this.f1006a.c(uri);
            return this;
        }
    }

    /* renamed from: K.d$b */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f1007a;

        public b(ClipData clipData, int i3) {
            this.f1007a = AbstractC0200i.a(clipData, i3);
        }

        @Override // K.C0190d.c
        public C0190d a() {
            ContentInfo build;
            build = this.f1007a.build();
            return new C0190d(new e(build));
        }

        @Override // K.C0190d.c
        public void b(Bundle bundle) {
            this.f1007a.setExtras(bundle);
        }

        @Override // K.C0190d.c
        public void c(Uri uri) {
            this.f1007a.setLinkUri(uri);
        }

        @Override // K.C0190d.c
        public void d(int i3) {
            this.f1007a.setFlags(i3);
        }
    }

    /* renamed from: K.d$c */
    public interface c {
        C0190d a();

        void b(Bundle bundle);

        void c(Uri uri);

        void d(int i3);
    }

    /* renamed from: K.d$d, reason: collision with other inner class name */
    public static final class C0030d implements c {

        /* renamed from: a, reason: collision with root package name */
        public ClipData f1008a;

        /* renamed from: b, reason: collision with root package name */
        public int f1009b;

        /* renamed from: c, reason: collision with root package name */
        public int f1010c;

        /* renamed from: d, reason: collision with root package name */
        public Uri f1011d;

        /* renamed from: e, reason: collision with root package name */
        public Bundle f1012e;

        public C0030d(ClipData clipData, int i3) {
            this.f1008a = clipData;
            this.f1009b = i3;
        }

        @Override // K.C0190d.c
        public C0190d a() {
            return new C0190d(new g(this));
        }

        @Override // K.C0190d.c
        public void b(Bundle bundle) {
            this.f1012e = bundle;
        }

        @Override // K.C0190d.c
        public void c(Uri uri) {
            this.f1011d = uri;
        }

        @Override // K.C0190d.c
        public void d(int i3) {
            this.f1010c = i3;
        }
    }

    /* renamed from: K.d$e */
    public static final class e implements f {

        /* renamed from: a, reason: collision with root package name */
        public final ContentInfo f1013a;

        public e(ContentInfo contentInfo) {
            this.f1013a = AbstractC0188c.a(J.g.g(contentInfo));
        }

        @Override // K.C0190d.f
        public ClipData a() {
            ClipData clip;
            clip = this.f1013a.getClip();
            return clip;
        }

        @Override // K.C0190d.f
        public int b() {
            int flags;
            flags = this.f1013a.getFlags();
            return flags;
        }

        @Override // K.C0190d.f
        public ContentInfo c() {
            return this.f1013a;
        }

        @Override // K.C0190d.f
        public int d() {
            int source;
            source = this.f1013a.getSource();
            return source;
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f1013a + "}";
        }
    }

    /* renamed from: K.d$f */
    public interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* renamed from: K.d$g */
    public static final class g implements f {

        /* renamed from: a, reason: collision with root package name */
        public final ClipData f1014a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1015b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1016c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri f1017d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f1018e;

        public g(C0030d c0030d) {
            this.f1014a = (ClipData) J.g.g(c0030d.f1008a);
            this.f1015b = J.g.c(c0030d.f1009b, 0, 5, "source");
            this.f1016c = J.g.f(c0030d.f1010c, 1);
            this.f1017d = c0030d.f1011d;
            this.f1018e = c0030d.f1012e;
        }

        @Override // K.C0190d.f
        public ClipData a() {
            return this.f1014a;
        }

        @Override // K.C0190d.f
        public int b() {
            return this.f1016c;
        }

        @Override // K.C0190d.f
        public ContentInfo c() {
            return null;
        }

        @Override // K.C0190d.f
        public int d() {
            return this.f1015b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f1014a.getDescription());
            sb.append(", source=");
            sb.append(C0190d.e(this.f1015b));
            sb.append(", flags=");
            sb.append(C0190d.a(this.f1016c));
            if (this.f1017d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f1017d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f1018e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    public C0190d(f fVar) {
        this.f1005a = fVar;
    }

    public static String a(int i3) {
        return (i3 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i3);
    }

    public static String e(int i3) {
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? String.valueOf(i3) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static C0190d g(ContentInfo contentInfo) {
        return new C0190d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f1005a.a();
    }

    public int c() {
        return this.f1005a.b();
    }

    public int d() {
        return this.f1005a.d();
    }

    public ContentInfo f() {
        ContentInfo c3 = this.f1005a.c();
        Objects.requireNonNull(c3);
        return AbstractC0188c.a(c3);
    }

    public String toString() {
        return this.f1005a.toString();
    }
}

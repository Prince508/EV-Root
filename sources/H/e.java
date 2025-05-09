package H;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f603a;

    /* renamed from: b, reason: collision with root package name */
    public final String f604b;

    /* renamed from: c, reason: collision with root package name */
    public final String f605c;

    /* renamed from: d, reason: collision with root package name */
    public final List f606d;

    /* renamed from: e, reason: collision with root package name */
    public final int f607e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final String f608f;

    public e(String str, String str2, String str3, List list) {
        this.f603a = (String) J.g.g(str);
        this.f604b = (String) J.g.g(str2);
        this.f605c = (String) J.g.g(str3);
        this.f606d = (List) J.g.g(list);
        this.f608f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f606d;
    }

    public int c() {
        return this.f607e;
    }

    public String d() {
        return this.f608f;
    }

    public String e() {
        return this.f603a;
    }

    public String f() {
        return this.f604b;
    }

    public String g() {
        return this.f605c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f603a + ", mProviderPackage: " + this.f604b + ", mQuery: " + this.f605c + ", mCertificates:");
        for (int i3 = 0; i3 < this.f606d.size(); i3++) {
            sb.append(" [");
            List list = (List) this.f606d.get(i3);
            for (int i4 = 0; i4 < list.size(); i4++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i4), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f607e);
        return sb.toString();
    }
}

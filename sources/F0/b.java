package F0;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f345a;

    /* renamed from: b, reason: collision with root package name */
    public final String f346b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f347c;

    public b(String str, Object... objArr) {
        this.f345a = -1;
        this.f346b = str;
        this.f347c = objArr;
    }

    public int a() {
        return this.f345a;
    }

    public Object[] b() {
        return this.f347c;
    }

    public String toString() {
        String str = this.f346b;
        if (str != null) {
            return String.format(str, this.f347c);
        }
        StringBuilder sb = new StringBuilder("mIssueId: ");
        sb.append(this.f345a);
        for (Object obj : this.f347c) {
            sb.append(", ");
            sb.append(obj.toString());
        }
        return sb.toString();
    }

    public b(int i3, Object... objArr) {
        this.f345a = i3;
        this.f346b = null;
        this.f347c = objArr;
    }
}

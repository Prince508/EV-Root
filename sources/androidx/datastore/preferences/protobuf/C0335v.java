package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0335v extends IOException {

    /* renamed from: e, reason: collision with root package name */
    public J f3852e;

    /* renamed from: androidx.datastore.preferences.protobuf.v$a */
    public static class a extends C0335v {
        public a(String str) {
            super(str);
        }
    }

    public C0335v(String str) {
        super(str);
        this.f3852e = null;
    }

    public static C0335v a() {
        return new C0335v("Protocol message end-group tag did not match expected tag.");
    }

    public static C0335v b() {
        return new C0335v("Protocol message contained an invalid tag (zero).");
    }

    public static C0335v c() {
        return new C0335v("Protocol message had invalid UTF-8.");
    }

    public static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static C0335v e() {
        return new C0335v("CodedInputStream encountered a malformed varint.");
    }

    public static C0335v f() {
        return new C0335v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0335v g() {
        return new C0335v("Failed to parse the message.");
    }

    public static C0335v h() {
        return new C0335v("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static C0335v j() {
        return new C0335v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static C0335v k() {
        return new C0335v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public C0335v i(J j3) {
        this.f3852e = j3;
        return this;
    }
}

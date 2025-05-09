package androidx.datastore.preferences.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class e0 extends RuntimeException {

    /* renamed from: e, reason: collision with root package name */
    public final List f3625e;

    public e0(J j3) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f3625e = null;
    }

    public C0335v a() {
        return new C0335v(getMessage());
    }
}

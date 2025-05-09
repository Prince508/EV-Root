package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class j0 extends RuntimeException {

    /* renamed from: e, reason: collision with root package name */
    public final List f5833e;

    public j0(O o3) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f5833e = null;
    }

    public A a() {
        return new A(getMessage());
    }
}

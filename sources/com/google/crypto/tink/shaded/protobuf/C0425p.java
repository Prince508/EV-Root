package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC0432x;
import j.AbstractC0515e;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0425p {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f5881b = true;

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0425p f5882c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0425p f5883d = new C0425p(true);

    /* renamed from: a, reason: collision with root package name */
    public final Map f5884a = Collections.EMPTY_MAP;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.p$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f5885a;

        /* renamed from: b, reason: collision with root package name */
        public final int f5886b;

        public a(Object obj, int i3) {
            this.f5885a = obj;
            this.f5886b = i3;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5885a == aVar.f5885a && this.f5886b == aVar.f5886b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f5885a) * 65535) + this.f5886b;
        }
    }

    public C0425p(boolean z3) {
    }

    public static C0425p b() {
        C0425p c0425p;
        C0425p c0425p2 = f5882c;
        if (c0425p2 != null) {
            return c0425p2;
        }
        synchronized (C0425p.class) {
            try {
                c0425p = f5882c;
                if (c0425p == null) {
                    c0425p = f5881b ? AbstractC0424o.a() : f5883d;
                    f5882c = c0425p;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0425p;
    }

    public AbstractC0432x.c a(O o3, int i3) {
        AbstractC0515e.a(this.f5884a.get(new a(o3, i3)));
        return null;
    }
}

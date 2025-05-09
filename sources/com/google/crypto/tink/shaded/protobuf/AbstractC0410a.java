package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.O;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0410a implements O {
    protected int memoizedHashCode = 0;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0112a implements O.a {
        public static j0 i(O o3) {
            return new j0(o3);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public byte[] e() {
        try {
            byte[] bArr = new byte[a()];
            AbstractC0420k U3 = AbstractC0420k.U(bArr);
            f(U3);
            U3.c();
            return bArr;
        } catch (IOException e3) {
            throw new RuntimeException(i("byte array"), e3);
        }
    }

    public abstract int g(e0 e0Var);

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public AbstractC0417h h() {
        try {
            AbstractC0417h.C0113h t3 = AbstractC0417h.t(a());
            f(t3.b());
            return t3.a();
        } catch (IOException e3) {
            throw new RuntimeException(i("ByteString"), e3);
        }
    }

    public final String i(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public j0 j() {
        return new j0(this);
    }
}

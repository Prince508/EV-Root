package S1;

import android.content.Context;

/* loaded from: classes.dex */
public enum d {
    RSA_ECB_PKCS1Padding(new e() { // from class: S1.b
        @Override // S1.e
        public final a a(Context context) {
            return new f(context);
        }
    }, 1),
    RSA_ECB_OAEPwithSHA_256andMGF1Padding(new e() { // from class: S1.c
        @Override // S1.e
        public final a a(Context context) {
            return new g(context);
        }
    }, 23);


    /* renamed from: e, reason: collision with root package name */
    public final e f1967e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1968f;

    d(e eVar, int i3) {
        this.f1967e = eVar;
        this.f1968f = i3;
    }
}

package S1;

import android.content.Context;

/* loaded from: classes.dex */
public enum l {
    AES_CBC_PKCS7Padding(new n() { // from class: S1.j
        @Override // S1.n
        public final i a(Context context, a aVar) {
            return new h(context, aVar);
        }
    }, 1),
    AES_GCM_NoPadding(new n() { // from class: S1.k
        @Override // S1.n
        public final i a(Context context, a aVar) {
            return new o(context, aVar);
        }
    }, 23);


    /* renamed from: e, reason: collision with root package name */
    public final n f1977e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1978f;

    l(n nVar, int i3) {
        this.f1977e = nVar;
        this.f1978f = i3;
    }
}

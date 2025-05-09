package J1;

import O1.I;
import O1.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final String f900a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.a f901b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0417h f902c;

    /* renamed from: d, reason: collision with root package name */
    public final y.c f903d;

    /* renamed from: e, reason: collision with root package name */
    public final I f904e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f905f;

    public o(String str, AbstractC0417h abstractC0417h, y.c cVar, I i3, Integer num) {
        this.f900a = str;
        this.f901b = t.e(str);
        this.f902c = abstractC0417h;
        this.f903d = cVar;
        this.f904e = i3;
        this.f905f = num;
    }

    public static o b(String str, AbstractC0417h abstractC0417h, y.c cVar, I i3, Integer num) {
        if (i3 == I.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new o(str, abstractC0417h, cVar, i3, num);
    }

    @Override // J1.q
    public Q1.a a() {
        return this.f901b;
    }

    public Integer c() {
        return this.f905f;
    }

    public y.c d() {
        return this.f903d;
    }

    public I e() {
        return this.f904e;
    }

    public String f() {
        return this.f900a;
    }

    public AbstractC0417h g() {
        return this.f902c;
    }
}

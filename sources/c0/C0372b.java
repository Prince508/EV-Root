package c0;

import a0.i;
import android.text.Editable;

/* renamed from: c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4718a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static volatile Editable.Factory f4719b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f4720c;

    public C0372b() {
        try {
            f4720c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0372b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f4719b == null) {
            synchronized (f4718a) {
                try {
                    if (f4719b == null) {
                        f4719b = new C0372b();
                    }
                } finally {
                }
            }
        }
        return f4719b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f4720c;
        return cls != null ? i.c(cls, charSequence) : super.newEditable(charSequence);
    }
}

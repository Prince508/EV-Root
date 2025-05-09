package androidx.preference;

import B.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import o.g;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: H, reason: collision with root package name */
    public final g f4095H;

    /* renamed from: I, reason: collision with root package name */
    public final Handler f4096I;

    /* renamed from: J, reason: collision with root package name */
    public final List f4097J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f4098K;

    /* renamed from: L, reason: collision with root package name */
    public int f4099L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f4100M;

    /* renamed from: N, reason: collision with root package name */
    public int f4101N;

    /* renamed from: O, reason: collision with root package name */
    public final Runnable f4102O;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f4095H.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f4095H = new g();
        this.f4096I = new Handler(Looper.getMainLooper());
        this.f4098K = true;
        this.f4099L = 0;
        this.f4100M = false;
        this.f4101N = Integer.MAX_VALUE;
        this.f4102O = new a();
        this.f4097J = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k0.g.f8119v0, i3, i4);
        int i5 = k0.g.f8123x0;
        this.f4098K = i.b(obtainStyledAttributes, i5, i5, true);
        int i6 = k0.g.f8121w0;
        if (obtainStyledAttributes.hasValue(i6)) {
            L(i.d(obtainStyledAttributes, i6, i6, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    public Preference J(int i3) {
        return (Preference) this.f4097J.get(i3);
    }

    public int K() {
        return this.f4097J.size();
    }

    public void L(int i3) {
        if (i3 != Integer.MAX_VALUE && !s()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f4101N = i3;
    }

    @Override // androidx.preference.Preference
    public void w(boolean z3) {
        super.w(z3);
        int K3 = K();
        for (int i3 = 0; i3 < K3; i3++) {
            J(i3).A(this, z3);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

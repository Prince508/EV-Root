package r1;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import u1.AbstractC0743f;
import u1.C0741d;

/* loaded from: classes.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public float f8977c;

    /* renamed from: d, reason: collision with root package name */
    public float f8978d;

    /* renamed from: g, reason: collision with root package name */
    public C0741d f8981g;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f8975a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0743f f8976b = new a();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8979e = true;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f8980f = new WeakReference(null);

    public class a extends AbstractC0743f {
        public a() {
        }

        @Override // u1.AbstractC0743f
        public void a(int i3) {
            i.this.f8979e = true;
            b bVar = (b) i.this.f8980f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // u1.AbstractC0743f
        public void b(Typeface typeface, boolean z3) {
            if (z3) {
                return;
            }
            i.this.f8979e = true;
            b bVar = (b) i.this.f8980f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public i(b bVar) {
        i(bVar);
    }

    public final float c(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.f8975a.getFontMetrics().ascent);
    }

    public final float d(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f8975a.measureText(charSequence, 0, charSequence.length());
    }

    public C0741d e() {
        return this.f8981g;
    }

    public TextPaint f() {
        return this.f8975a;
    }

    public float g(String str) {
        if (!this.f8979e) {
            return this.f8977c;
        }
        h(str);
        return this.f8977c;
    }

    public final void h(String str) {
        this.f8977c = d(str);
        this.f8978d = c(str);
        this.f8979e = false;
    }

    public void i(b bVar) {
        this.f8980f = new WeakReference(bVar);
    }

    public void j(C0741d c0741d, Context context) {
        if (this.f8981g != c0741d) {
            this.f8981g = c0741d;
            if (c0741d != null) {
                c0741d.o(context, this.f8975a, this.f8976b);
                b bVar = (b) this.f8980f.get();
                if (bVar != null) {
                    this.f8975a.drawableState = bVar.getState();
                }
                c0741d.n(context, this.f8975a, this.f8976b);
                this.f8979e = true;
            }
            b bVar2 = (b) this.f8980f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void k(boolean z3) {
        this.f8979e = z3;
    }

    public void l(Context context) {
        this.f8981g.n(context, this.f8975a, this.f8976b);
    }
}

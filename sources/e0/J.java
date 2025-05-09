package e0;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0347h;
import f0.C0470c;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0462t f6480a;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f6481b;

    /* renamed from: d, reason: collision with root package name */
    public int f6483d;

    /* renamed from: e, reason: collision with root package name */
    public int f6484e;

    /* renamed from: f, reason: collision with root package name */
    public int f6485f;

    /* renamed from: g, reason: collision with root package name */
    public int f6486g;

    /* renamed from: h, reason: collision with root package name */
    public int f6487h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6488i;

    /* renamed from: k, reason: collision with root package name */
    public String f6490k;

    /* renamed from: l, reason: collision with root package name */
    public int f6491l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f6492m;

    /* renamed from: n, reason: collision with root package name */
    public int f6493n;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f6494o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f6495p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f6496q;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f6498s;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f6482c = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public boolean f6489j = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6497r = false;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f6499a;

        /* renamed from: b, reason: collision with root package name */
        public AbstractComponentCallbacksC0459p f6500b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f6501c;

        /* renamed from: d, reason: collision with root package name */
        public int f6502d;

        /* renamed from: e, reason: collision with root package name */
        public int f6503e;

        /* renamed from: f, reason: collision with root package name */
        public int f6504f;

        /* renamed from: g, reason: collision with root package name */
        public int f6505g;

        /* renamed from: h, reason: collision with root package name */
        public AbstractC0347h.b f6506h;

        /* renamed from: i, reason: collision with root package name */
        public AbstractC0347h.b f6507i;

        public a() {
        }

        public a(int i3, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
            this.f6499a = i3;
            this.f6500b = abstractComponentCallbacksC0459p;
            this.f6501c = false;
            AbstractC0347h.b bVar = AbstractC0347h.b.RESUMED;
            this.f6506h = bVar;
            this.f6507i = bVar;
        }

        public a(int i3, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, boolean z3) {
            this.f6499a = i3;
            this.f6500b = abstractComponentCallbacksC0459p;
            this.f6501c = z3;
            AbstractC0347h.b bVar = AbstractC0347h.b.RESUMED;
            this.f6506h = bVar;
            this.f6507i = bVar;
        }
    }

    public J(AbstractC0462t abstractC0462t, ClassLoader classLoader) {
        this.f6480a = abstractC0462t;
        this.f6481b = classLoader;
    }

    public J b(int i3, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, String str) {
        j(i3, abstractComponentCallbacksC0459p, str, 1);
        return this;
    }

    public J c(ViewGroup viewGroup, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, String str) {
        abstractComponentCallbacksC0459p.f6697K = viewGroup;
        return b(viewGroup.getId(), abstractComponentCallbacksC0459p, str);
    }

    public void d(a aVar) {
        this.f6482c.add(aVar);
        aVar.f6502d = this.f6483d;
        aVar.f6503e = this.f6484e;
        aVar.f6504f = this.f6485f;
        aVar.f6505g = this.f6486g;
    }

    public abstract int e();

    public abstract int f();

    public abstract void g();

    public abstract void h();

    public J i() {
        if (this.f6488i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f6489j = false;
        return this;
    }

    public void j(int i3, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, String str, int i4) {
        String str2 = abstractComponentCallbacksC0459p.f6706T;
        if (str2 != null) {
            C0470c.f(abstractComponentCallbacksC0459p, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0459p.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0459p.f6689C;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0459p + ": was " + abstractComponentCallbacksC0459p.f6689C + " now " + str);
            }
            abstractComponentCallbacksC0459p.f6689C = str;
        }
        if (i3 != 0) {
            if (i3 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0459p + " with tag " + str + " to container view with no id");
            }
            int i5 = abstractComponentCallbacksC0459p.f6687A;
            if (i5 != 0 && i5 != i3) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0459p + ": was " + abstractComponentCallbacksC0459p.f6687A + " now " + i3);
            }
            abstractComponentCallbacksC0459p.f6687A = i3;
            abstractComponentCallbacksC0459p.f6688B = i3;
        }
        d(new a(i4, abstractComponentCallbacksC0459p));
    }

    public J k(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        d(new a(3, abstractComponentCallbacksC0459p));
        return this;
    }

    public J l(int i3, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        return m(i3, abstractComponentCallbacksC0459p, null);
    }

    public J m(int i3, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, String str) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        j(i3, abstractComponentCallbacksC0459p, str, 2);
        return this;
    }

    public J n(boolean z3) {
        this.f6497r = z3;
        return this;
    }
}

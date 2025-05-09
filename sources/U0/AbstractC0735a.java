package u0;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.C0639a;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0735a {

    /* renamed from: a, reason: collision with root package name */
    public final C0639a f9603a;

    /* renamed from: b, reason: collision with root package name */
    public final C0639a f9604b;

    /* renamed from: c, reason: collision with root package name */
    public final C0639a f9605c;

    public AbstractC0735a(C0639a c0639a, C0639a c0639a2, C0639a c0639a3) {
        this.f9603a = c0639a;
        this.f9604b = c0639a2;
        this.f9605c = c0639a3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i3) {
        w(i3);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i3) {
        w(i3);
        C(charSequence);
    }

    public abstract void E(int i3);

    public void F(int i3, int i4) {
        w(i4);
        E(i3);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i3) {
        w(i3);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i3) {
        w(i3);
        I(str);
    }

    public void K(InterfaceC0737c interfaceC0737c, AbstractC0735a abstractC0735a) {
        try {
            e(interfaceC0737c.getClass()).invoke(null, interfaceC0737c, abstractC0735a);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
        } catch (InvocationTargetException e6) {
            if (!(e6.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
            }
            throw ((RuntimeException) e6.getCause());
        }
    }

    public void L(InterfaceC0737c interfaceC0737c) {
        if (interfaceC0737c == null) {
            I(null);
            return;
        }
        N(interfaceC0737c);
        AbstractC0735a b3 = b();
        K(interfaceC0737c, b3);
        b3.a();
    }

    public void M(InterfaceC0737c interfaceC0737c, int i3) {
        w(i3);
        L(interfaceC0737c);
    }

    public final void N(InterfaceC0737c interfaceC0737c) {
        try {
            I(c(interfaceC0737c.getClass()).getName());
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException(interfaceC0737c.getClass().getSimpleName() + " does not have a Parcelizer", e3);
        }
    }

    public abstract void a();

    public abstract AbstractC0735a b();

    public final Class c(Class cls) {
        Class cls2 = (Class) this.f9605c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f9605c.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method d(String str) {
        Method method = (Method) this.f9603a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC0735a.class.getClassLoader()).getDeclaredMethod("read", AbstractC0735a.class);
        this.f9603a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method e(Class cls) {
        Method method = (Method) this.f9604b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c3 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c3.getDeclaredMethod("write", cls, AbstractC0735a.class);
        this.f9604b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z3, int i3) {
        return !m(i3) ? z3 : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i3) {
        return !m(i3) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i3) {
        return !m(i3) ? charSequence : k();
    }

    public abstract boolean m(int i3);

    public InterfaceC0737c n(String str, AbstractC0735a abstractC0735a) {
        try {
            return (InterfaceC0737c) d(str).invoke(null, abstractC0735a);
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
        } catch (InvocationTargetException e6) {
            if (e6.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e6.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
        }
    }

    public abstract int o();

    public int p(int i3, int i4) {
        return !m(i4) ? i3 : o();
    }

    public abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i3) {
        return !m(i3) ? parcelable : q();
    }

    public abstract String s();

    public String t(String str, int i3) {
        return !m(i3) ? str : s();
    }

    public InterfaceC0737c u() {
        String s3 = s();
        if (s3 == null) {
            return null;
        }
        return n(s3, b());
    }

    public InterfaceC0737c v(InterfaceC0737c interfaceC0737c, int i3) {
        return !m(i3) ? interfaceC0737c : u();
    }

    public abstract void w(int i3);

    public abstract void y(boolean z3);

    public void z(boolean z3, int i3) {
        w(i3);
        y(z3);
    }

    public void x(boolean z3, boolean z4) {
    }
}

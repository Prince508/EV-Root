package E0;

import C2.k;
import H2.b;
import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f339a = new a();

    public static final boolean e(String str, B2.a aVar) {
        k.e(aVar, "block");
        try {
            boolean booleanValue = ((Boolean) aVar.b()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ClassNotFound: ");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            Log.e("ReflectionGuard", sb.toString());
            return false;
        } catch (NoSuchMethodException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NoSuchMethod: ");
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            Log.e("ReflectionGuard", sb2.toString());
            return false;
        }
    }

    public final boolean a(B2.a aVar) {
        k.e(aVar, "classLoader");
        try {
            aVar.b();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean b(Method method, b bVar) {
        k.e(method, "<this>");
        k.e(bVar, "clazz");
        return c(method, A2.a.a(bVar));
    }

    public final boolean c(Method method, Class cls) {
        k.e(method, "<this>");
        k.e(cls, "clazz");
        return method.getReturnType().equals(cls);
    }

    public final boolean d(Method method) {
        k.e(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }
}

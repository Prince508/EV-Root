package a1;

import android.content.Context;
import android.graphics.Point;
import c1.AbstractC0374b;
import c1.AbstractC0382j;
import com.easyvictory.cheto.plugins.auto_queue.InternalAPI;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Method;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0312a {

    /* renamed from: a, reason: collision with root package name */
    public Class f2662a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2663b;

    public C0312a(Context context, File file) {
        File file2 = new File(file, U2.a.a(-11282554384622L));
        if (file2.exists()) {
            String absolutePath = file2.getAbsolutePath();
            if (!file2.exists()) {
                throw new Throwable(U2.a.a(-11321209090286L));
            }
            File file3 = new File(file, U2.a.a(-11493007782126L));
            if (!file3.exists()) {
                file3.mkdir();
            }
            File file4 = new File(file, U2.a.a(-11510187651310L));
            if (!file4.exists()) {
                file4.mkdir();
            }
            String absolutePath2 = file3.getAbsolutePath();
            AbstractC0374b.c(file2, file4);
            AbstractC0374b.d(file2, file3);
            Class<?> loadClass = new PathClassLoader(absolutePath, absolutePath2, context.getClassLoader()).loadClass(U2.a.a(-11540252422382L));
            this.f2662a = loadClass;
            this.f2663b = loadClass.newInstance();
            Method declaredMethod = this.f2662a.getDeclaredMethod(U2.a.a(-11707756146926L), Context.class, String.class, Class.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f2663b, context, file4.getAbsolutePath(), InternalAPI.class);
        }
    }

    public void a(Point point) {
        try {
            Method declaredMethod = this.f2662a.getDeclaredMethod(U2.a.a(-11785065558254L), Point.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f2663b, point);
        } catch (Throwable th) {
            AbstractC0382j.f(th);
        }
    }
}

package s0;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* renamed from: s0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0710f {

    /* renamed from: s0.f$a */
    public static class a {
        public static <T, V> ObjectAnimator a(T t3, Property<T, V> property, Path path) {
            return ObjectAnimator.ofObject(t3, property, (TypeConverter) null, path);
        }
    }

    public static ObjectAnimator a(Object obj, Property property, Path path) {
        return a.a(obj, property, path);
    }
}

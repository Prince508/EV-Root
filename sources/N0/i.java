package N0;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface i {
    k cls() default k.AUTOMATIC;

    m elementType() default m.ANY;

    int index() default 0;

    boolean optional() default false;

    int tagNumber() default -1;

    l tagging() default l.NORMAL;

    m type();
}

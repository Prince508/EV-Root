package e0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentContainerView;
import d0.AbstractC0439c;

/* loaded from: classes.dex */
public class v implements LayoutInflater.Factory2 {

    /* renamed from: e, reason: collision with root package name */
    public final B f6770e;

    public v(B b3) {
        this.f6770e = b3;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f6770e);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0439c.f6368a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(AbstractC0439c.f6369b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(AbstractC0439c.f6370c, -1);
        String string = obtainStyledAttributes.getString(AbstractC0439c.f6371d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !AbstractC0462t.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        AbstractComponentCallbacksC0459p X2 = resourceId != -1 ? this.f6770e.X(resourceId) : null;
        if (X2 == null && string != null) {
            X2 = this.f6770e.Y(string);
        }
        if (X2 == null && id != -1) {
            X2 = this.f6770e.X(id);
        }
        if (X2 == null) {
            AbstractComponentCallbacksC0459p a3 = this.f6770e.i0().a(context.getClassLoader(), attributeValue);
            a3.f6731s = true;
            if (resourceId == 0) {
                resourceId = id;
            }
            a3.f6687A = resourceId;
            a3.f6688B = id;
            a3.f6689C = string;
            a3.f6732t = true;
            B b3 = this.f6770e;
            a3.f6736x = b3;
            b3.j0();
            this.f6770e.j0();
            throw null;
        }
        if (!X2.f6732t) {
            X2.f6732t = true;
            B b4 = this.f6770e;
            X2.f6736x = b4;
            b4.j0();
            this.f6770e.j0();
            throw null;
        }
        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
    }
}

package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0561b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f8330a;

    /* renamed from: l.b$a */
    public static class a {
        public static void a(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C0561b(ActionBarContainer actionBarContainer) {
        this.f8330a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f8330a;
        if (actionBarContainer.f2896l) {
            Drawable drawable = actionBarContainer.f2895k;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f2893i;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f8330a;
        Drawable drawable3 = actionBarContainer2.f2894j;
        if (drawable3 == null || !actionBarContainer2.f2897m) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f8330a;
        if (actionBarContainer.f2896l) {
            if (actionBarContainer.f2895k != null) {
                a.a(actionBarContainer.f2893i, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f2893i;
            if (drawable != null) {
                a.a(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}

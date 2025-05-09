package s0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public class O extends N {
    @Override // s0.F
    public float b(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // s0.L, s0.F
    public void d(View view, int i3, int i4, int i5, int i6) {
        view.setLeftTopRightBottom(i3, i4, i5, i6);
    }

    @Override // s0.F
    public void e(View view, float f3) {
        view.setTransitionAlpha(f3);
    }

    @Override // s0.N, s0.F
    public void f(View view, int i3) {
        view.setTransitionVisibility(i3);
    }

    @Override // s0.J, s0.F
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // s0.J, s0.F
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}

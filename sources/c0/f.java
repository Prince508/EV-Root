package c0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f4729a;

    public static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f4730a;

        /* renamed from: b, reason: collision with root package name */
        public final d f4731b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4732c = true;

        public a(TextView textView) {
            this.f4730a = textView;
            this.f4731b = new d(textView);
        }

        @Override // c0.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return !this.f4732c ? h(inputFilterArr) : f(inputFilterArr);
        }

        @Override // c0.f.b
        public boolean b() {
            return this.f4732c;
        }

        @Override // c0.f.b
        public void c(boolean z3) {
            if (z3) {
                l();
            }
        }

        @Override // c0.f.b
        public void d(boolean z3) {
            this.f4732c = z3;
            l();
            k();
        }

        @Override // c0.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return this.f4732c ? m(transformationMethod) : j(transformationMethod);
        }

        public final InputFilter[] f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f4731b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f4731b;
            return inputFilterArr2;
        }

        public final SparseArray g(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i3 = 0; i3 < inputFilterArr.length; i3++) {
                InputFilter inputFilter = inputFilterArr[i3];
                if (inputFilter instanceof d) {
                    sparseArray.put(i3, inputFilter);
                }
            }
            return sparseArray;
        }

        public final InputFilter[] h(InputFilter[] inputFilterArr) {
            SparseArray g3 = g(inputFilterArr);
            if (g3.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - g3.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (g3.indexOfKey(i4) < 0) {
                    inputFilterArr2[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr2;
        }

        public void i(boolean z3) {
            this.f4732c = z3;
        }

        public final TransformationMethod j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? ((h) transformationMethod).a() : transformationMethod;
        }

        public final void k() {
            this.f4730a.setFilters(a(this.f4730a.getFilters()));
        }

        public void l() {
            this.f4730a.setTransformationMethod(e(this.f4730a.getTransformationMethod()));
        }

        public final TransformationMethod m(TransformationMethod transformationMethod) {
            return transformationMethod instanceof h ? transformationMethod : transformationMethod instanceof PasswordTransformationMethod ? transformationMethod : new h(transformationMethod);
        }
    }

    public static class b {
        public abstract InputFilter[] a(InputFilter[] inputFilterArr);

        public abstract boolean b();

        public abstract void c(boolean z3);

        public abstract void d(boolean z3);

        public abstract TransformationMethod e(TransformationMethod transformationMethod);
    }

    public static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final a f4733a;

        public c(TextView textView) {
            this.f4733a = new a(textView);
        }

        @Override // c0.f.b
        public InputFilter[] a(InputFilter[] inputFilterArr) {
            return f() ? inputFilterArr : this.f4733a.a(inputFilterArr);
        }

        @Override // c0.f.b
        public boolean b() {
            return this.f4733a.b();
        }

        @Override // c0.f.b
        public void c(boolean z3) {
            if (f()) {
                return;
            }
            this.f4733a.c(z3);
        }

        @Override // c0.f.b
        public void d(boolean z3) {
            if (f()) {
                this.f4733a.i(z3);
            } else {
                this.f4733a.d(z3);
            }
        }

        @Override // c0.f.b
        public TransformationMethod e(TransformationMethod transformationMethod) {
            return f() ? transformationMethod : this.f4733a.e(transformationMethod);
        }

        public final boolean f() {
            return !androidx.emoji2.text.c.h();
        }
    }

    public f(TextView textView, boolean z3) {
        J.g.h(textView, "textView cannot be null");
        if (z3) {
            this.f4729a = new a(textView);
        } else {
            this.f4729a = new c(textView);
        }
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f4729a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f4729a.b();
    }

    public void c(boolean z3) {
        this.f4729a.c(z3);
    }

    public void d(boolean z3) {
        this.f4729a.d(z3);
    }

    public TransformationMethod e(TransformationMethod transformationMethod) {
        return this.f4729a.e(transformationMethod);
    }
}

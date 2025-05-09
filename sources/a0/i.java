package a0;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class i extends SpannableStringBuilder {

    /* renamed from: e, reason: collision with root package name */
    public final Class f2655e;

    /* renamed from: f, reason: collision with root package name */
    public final List f2656f;

    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: e, reason: collision with root package name */
        public final Object f2657e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicInteger f2658f = new AtomicInteger(0);

        public a(Object obj) {
            this.f2657e = obj;
        }

        public final void a() {
            this.f2658f.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f2657e).afterTextChanged(editable);
        }

        public final boolean b(Object obj) {
            return obj instanceof f;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            ((TextWatcher) this.f2657e).beforeTextChanged(charSequence, i3, i4, i5);
        }

        public final void c() {
            this.f2658f.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i3, int i4) {
            if (this.f2658f.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f2657e).onSpanAdded(spannable, obj, i3, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i3, int i4, int i5, int i6) {
            int i7;
            int i8;
            if (this.f2658f.get() <= 0 || !b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i3 > i4) {
                        i3 = 0;
                    }
                    if (i5 > i6) {
                        i7 = i3;
                        i8 = 0;
                        ((SpanWatcher) this.f2657e).onSpanChanged(spannable, obj, i7, i4, i8, i6);
                    }
                }
                i7 = i3;
                i8 = i5;
                ((SpanWatcher) this.f2657e).onSpanChanged(spannable, obj, i7, i4, i8, i6);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i3, int i4) {
            if (this.f2658f.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f2657e).onSpanRemoved(spannable, obj, i3, i4);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            ((TextWatcher) this.f2657e).onTextChanged(charSequence, i3, i4, i5);
        }
    }

    public i(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f2656f = new ArrayList();
        J.g.h(cls, "watcherClass cannot be null");
        this.f2655e = cls;
    }

    public static i c(Class cls, CharSequence charSequence) {
        return new i(cls, charSequence);
    }

    public void a() {
        b();
    }

    public final void b() {
        for (int i3 = 0; i3 < this.f2656f.size(); i3++) {
            ((a) this.f2656f.get(i3)).a();
        }
    }

    public void d() {
        i();
        e();
    }

    public final void e() {
        for (int i3 = 0; i3 < this.f2656f.size(); i3++) {
            ((a) this.f2656f.get(i3)).onTextChanged(this, 0, length(), length());
        }
    }

    public final a f(Object obj) {
        for (int i3 = 0; i3 < this.f2656f.size(); i3++) {
            a aVar = (a) this.f2656f.get(i3);
            if (aVar.f2657e == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean g(Class cls) {
        return this.f2655e == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a f3;
        if (h(obj) && (f3 = f(obj)) != null) {
            obj = f3;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a f3;
        if (h(obj) && (f3 = f(obj)) != null) {
            obj = f3;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a f3;
        if (h(obj) && (f3 = f(obj)) != null) {
            obj = f3;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i3, int i4, Class cls) {
        if (!g(cls)) {
            return super.getSpans(i3, i4, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i3, i4, a.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, aVarArr.length);
        for (int i5 = 0; i5 < aVarArr.length; i5++) {
            objArr[i5] = aVarArr[i5].f2657e;
        }
        return objArr;
    }

    public final boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    public final void i() {
        for (int i3 = 0; i3 < this.f2656f.size(); i3++) {
            ((a) this.f2656f.get(i3)).c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i3, int i4, Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i3, i4, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVar;
        if (h(obj)) {
            aVar = f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f2656f.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i3, int i4, int i5) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f2656f.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i3, i4, i5);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i3, int i4) {
        return new i(this.f2655e, this, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i3, int i4) {
        super.delete(i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i3, CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence) {
        b();
        super.replace(i3, i4, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i3, CharSequence charSequence, int i4, int i5) {
        super.insert(i3, charSequence, i4, i5);
        return this;
    }

    public i(Class cls, CharSequence charSequence, int i3, int i4) {
        super(charSequence, i3, i4);
        this.f2656f = new ArrayList();
        J.g.h(cls, "watcherClass cannot be null");
        this.f2655e = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        b();
        super.replace(i3, i4, charSequence, i5, i6);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i3, int i4) {
        super.append(charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i3) {
        super.append(charSequence, obj, i3);
        return this;
    }
}

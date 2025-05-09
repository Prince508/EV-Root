package androidx.appcompat.widget;

import K.O;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import d.AbstractC0435a;
import j.InterfaceC0512b;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import l.AbstractC0556W;
import l.AbstractC0562c;
import l.C0552S;
import l.ViewOnClickListenerC0547M;
import l.c0;

/* loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.b implements InterfaceC0512b {

    /* renamed from: r0, reason: collision with root package name */
    public static final o f2974r0;

    /* renamed from: A, reason: collision with root package name */
    public final ImageView f2975A;

    /* renamed from: B, reason: collision with root package name */
    public final View f2976B;

    /* renamed from: C, reason: collision with root package name */
    public q f2977C;

    /* renamed from: D, reason: collision with root package name */
    public Rect f2978D;

    /* renamed from: E, reason: collision with root package name */
    public Rect f2979E;

    /* renamed from: F, reason: collision with root package name */
    public int[] f2980F;

    /* renamed from: G, reason: collision with root package name */
    public int[] f2981G;

    /* renamed from: H, reason: collision with root package name */
    public final ImageView f2982H;

    /* renamed from: I, reason: collision with root package name */
    public final Drawable f2983I;

    /* renamed from: J, reason: collision with root package name */
    public final int f2984J;

    /* renamed from: K, reason: collision with root package name */
    public final int f2985K;

    /* renamed from: L, reason: collision with root package name */
    public final Intent f2986L;

    /* renamed from: M, reason: collision with root package name */
    public final Intent f2987M;

    /* renamed from: N, reason: collision with root package name */
    public final CharSequence f2988N;

    /* renamed from: O, reason: collision with root package name */
    public View.OnFocusChangeListener f2989O;

    /* renamed from: P, reason: collision with root package name */
    public View.OnClickListener f2990P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f2991Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f2992R;

    /* renamed from: S, reason: collision with root package name */
    public R.a f2993S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f2994T;

    /* renamed from: U, reason: collision with root package name */
    public CharSequence f2995U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f2996V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2997W;

    /* renamed from: a0, reason: collision with root package name */
    public int f2998a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f2999b0;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f3000c0;

    /* renamed from: d0, reason: collision with root package name */
    public CharSequence f3001d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3002e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f3003f0;

    /* renamed from: g0, reason: collision with root package name */
    public SearchableInfo f3004g0;

    /* renamed from: h0, reason: collision with root package name */
    public Bundle f3005h0;

    /* renamed from: i0, reason: collision with root package name */
    public final Runnable f3006i0;

    /* renamed from: j0, reason: collision with root package name */
    public Runnable f3007j0;

    /* renamed from: k0, reason: collision with root package name */
    public final WeakHashMap f3008k0;

    /* renamed from: l0, reason: collision with root package name */
    public final View.OnClickListener f3009l0;

    /* renamed from: m0, reason: collision with root package name */
    public View.OnKeyListener f3010m0;

    /* renamed from: n0, reason: collision with root package name */
    public final TextView.OnEditorActionListener f3011n0;

    /* renamed from: o0, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f3012o0;

    /* renamed from: p0, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f3013p0;

    /* renamed from: q0, reason: collision with root package name */
    public TextWatcher f3014q0;

    /* renamed from: t, reason: collision with root package name */
    public final SearchAutoComplete f3015t;

    /* renamed from: u, reason: collision with root package name */
    public final View f3016u;

    /* renamed from: v, reason: collision with root package name */
    public final View f3017v;

    /* renamed from: w, reason: collision with root package name */
    public final View f3018w;

    /* renamed from: x, reason: collision with root package name */
    public final ImageView f3019x;

    /* renamed from: y, reason: collision with root package name */
    public final ImageView f3020y;

    /* renamed from: z, reason: collision with root package name */
    public final ImageView f3021z;

    public static class SearchAutoComplete extends AbstractC0562c {

        /* renamed from: i, reason: collision with root package name */
        public int f3022i;

        /* renamed from: j, reason: collision with root package name */
        public SearchView f3023j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f3024k;

        /* renamed from: l, reason: collision with root package name */
        public final Runnable f3025l;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC0435a.f6020g);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i3 = configuration.screenWidthDp;
            int i4 = configuration.screenHeightDp;
            if (i3 >= 960 && i4 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i3 < 600) {
                return (i3 < 640 || i4 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f2974r0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void d() {
            if (this.f3024k) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f3024k = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f3022i <= 0 || super.enoughToFilter();
        }

        @Override // l.AbstractC0562c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f3024k) {
                removeCallbacks(this.f3025l);
                post(this.f3025l);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z3, int i3, Rect rect) {
            super.onFocusChanged(z3, i3, rect);
            this.f3023j.Y();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
            if (i3 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f3023j.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i3, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z3) {
            super.onWindowFocusChanged(z3);
            if (z3 && this.f3023j.hasFocus() && getVisibility() == 0) {
                this.f3024k = true;
                if (SearchView.L(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z3) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z3) {
                this.f3024k = false;
                removeCallbacks(this.f3025l);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f3024k = true;
                    return;
                }
                this.f3024k = false;
                removeCallbacks(this.f3025l);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f3023j = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i3) {
            super.setThreshold(i3);
            this.f3022i = i3;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i3) {
            super(context, attributeSet, i3);
            this.f3025l = new a();
            this.f3022i = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            SearchView.this.X(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.e0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            R.a aVar = SearchView.this.f2993S;
            if (aVar instanceof ViewOnClickListenerC0547M) {
                aVar.b(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z3) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f2989O;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z3);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            SearchView.this.A();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f3019x) {
                searchView.U();
                return;
            }
            if (view == searchView.f3021z) {
                searchView.Q();
                return;
            }
            if (view == searchView.f3020y) {
                searchView.V();
            } else if (view == searchView.f2975A) {
                searchView.Z();
            } else if (view == searchView.f3015t) {
                searchView.G();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i3, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f3004g0 == null) {
                return false;
            }
            if (searchView.f3015t.isPopupShowing() && SearchView.this.f3015t.getListSelection() != -1) {
                return SearchView.this.W(view, i3, keyEvent);
            }
            if (SearchView.this.f3015t.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i3 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.O(0, null, searchView2.f3015t.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
            SearchView.this.V();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
            SearchView.this.R(i3, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
            SearchView.this.S(i3);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i3) {
            searchAutoComplete.setInputMethodMode(i3);
        }
    }

    public interface l {
    }

    public interface m {
    }

    public interface n {
    }

    public static class o {

        /* renamed from: a, reason: collision with root package name */
        public Method f3037a;

        /* renamed from: b, reason: collision with root package name */
        public Method f3038b;

        /* renamed from: c, reason: collision with root package name */
        public Method f3039c;

        public o() {
            this.f3037a = null;
            this.f3038b = null;
            this.f3039c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f3037a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f3038b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f3039c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f3038b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f3037a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f3039c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class p extends S.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public boolean f3040g;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i3) {
                return new p[i3];
            }
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f3040g + "}";
        }

        @Override // S.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeValue(Boolean.valueOf(this.f3040g));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3040g = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    public static class q extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final View f3041a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f3042b;

        /* renamed from: c, reason: collision with root package name */
        public final Rect f3043c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f3044d;

        /* renamed from: e, reason: collision with root package name */
        public final int f3045e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f3046f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f3045e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f3042b = new Rect();
            this.f3044d = new Rect();
            this.f3043c = new Rect();
            a(rect, rect2);
            this.f3041a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f3042b.set(rect);
            this.f3044d.set(rect);
            Rect rect3 = this.f3044d;
            int i3 = this.f3045e;
            rect3.inset(-i3, -i3);
            this.f3043c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z3;
            boolean z4;
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z5 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z4 = this.f3046f;
                    if (z4 && !this.f3044d.contains(x3, y3)) {
                        z5 = z4;
                        z3 = false;
                    }
                } else {
                    if (action == 3) {
                        z4 = this.f3046f;
                        this.f3046f = false;
                    }
                    z3 = true;
                    z5 = false;
                }
                z5 = z4;
                z3 = true;
            } else {
                if (this.f3042b.contains(x3, y3)) {
                    this.f3046f = true;
                    z3 = true;
                }
                z3 = true;
                z5 = false;
            }
            if (!z5) {
                return false;
            }
            if (!z3 || this.f3043c.contains(x3, y3)) {
                Rect rect = this.f3043c;
                motionEvent.setLocation(x3 - rect.left, y3 - rect.top);
            } else {
                motionEvent.setLocation(this.f3041a.getWidth() / 2, this.f3041a.getHeight() / 2);
            }
            return this.f3041a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f2974r0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public static boolean L(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(d.c.f6045e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(d.c.f6046f);
    }

    private void setQuery(CharSequence charSequence) {
        this.f3015t.setText(charSequence);
        this.f3015t.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void A() {
        if (this.f2976B.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f3017v.getPaddingLeft();
            Rect rect = new Rect();
            boolean a3 = c0.a(this);
            int dimensionPixelSize = this.f2991Q ? resources.getDimensionPixelSize(d.c.f6043c) + resources.getDimensionPixelSize(d.c.f6044d) : 0;
            this.f3015t.getDropDownBackground().getPadding(rect);
            this.f3015t.setDropDownHorizontalOffset(a3 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f3015t.setDropDownWidth((((this.f2976B.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent B(String str, Uri uri, String str2, String str3, int i3, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f3001d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f3005h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i3 != 0) {
            intent.putExtra("action_key", i3);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f3004g0.getSearchActivity());
        return intent;
    }

    public final Intent C(Cursor cursor, int i3, String str) {
        int i4;
        String o3;
        try {
            String o4 = ViewOnClickListenerC0547M.o(cursor, "suggest_intent_action");
            if (o4 == null) {
                o4 = this.f3004g0.getSuggestIntentAction();
            }
            if (o4 == null) {
                o4 = "android.intent.action.SEARCH";
            }
            String str2 = o4;
            String o5 = ViewOnClickListenerC0547M.o(cursor, "suggest_intent_data");
            if (o5 == null) {
                o5 = this.f3004g0.getSuggestIntentData();
            }
            if (o5 != null && (o3 = ViewOnClickListenerC0547M.o(cursor, "suggest_intent_data_id")) != null) {
                o5 = o5 + "/" + Uri.encode(o3);
            }
            return B(str2, o5 == null ? null : Uri.parse(o5), ViewOnClickListenerC0547M.o(cursor, "suggest_intent_extra_data"), ViewOnClickListenerC0547M.o(cursor, "suggest_intent_query"), i3, str);
        } catch (RuntimeException e3) {
            try {
                i4 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i4 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i4 + " returned exception.", e3);
            return null;
        }
    }

    public final Intent D(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3005h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent E(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void F() {
        this.f3015t.dismissDropDown();
    }

    public void G() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f3015t);
            return;
        }
        o oVar = f2974r0;
        oVar.b(this.f3015t);
        oVar.a(this.f3015t);
    }

    public final void H(View view, Rect rect) {
        view.getLocationInWindow(this.f2980F);
        getLocationInWindow(this.f2981G);
        int[] iArr = this.f2980F;
        int i3 = iArr[1];
        int[] iArr2 = this.f2981G;
        int i4 = i3 - iArr2[1];
        int i5 = iArr[0] - iArr2[0];
        rect.set(i5, i4, view.getWidth() + i5, view.getHeight() + i4);
    }

    public final CharSequence I(CharSequence charSequence) {
        if (!this.f2991Q || this.f2983I == null) {
            return charSequence;
        }
        int textSize = (int) (this.f3015t.getTextSize() * 1.25d);
        this.f2983I.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f2983I), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean J() {
        SearchableInfo searchableInfo = this.f3004g0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            Intent intent = this.f3004g0.getVoiceSearchLaunchWebSearch() ? this.f2986L : this.f3004g0.getVoiceSearchLaunchRecognizer() ? this.f2987M : null;
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean K() {
        return this.f2992R;
    }

    public final boolean M() {
        return (this.f2994T || this.f2999b0) && !K();
    }

    public final void N(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e3) {
            Log.e("SearchView", "Failed launch activity: " + intent, e3);
        }
    }

    public void O(int i3, String str, String str2) {
        getContext().startActivity(B("android.intent.action.SEARCH", null, null, str2, i3, str));
    }

    public final boolean P(int i3, int i4, String str) {
        Cursor c3 = this.f2993S.c();
        if (c3 == null || !c3.moveToPosition(i3)) {
            return false;
        }
        N(C(c3, i4, str));
        return true;
    }

    public void Q() {
        if (!TextUtils.isEmpty(this.f3015t.getText())) {
            this.f3015t.setText("");
            this.f3015t.requestFocus();
            this.f3015t.setImeVisibility(true);
        } else if (this.f2991Q) {
            clearFocus();
            j0(true);
        }
    }

    public boolean R(int i3, int i4, String str) {
        P(i3, 0, null);
        this.f3015t.setImeVisibility(false);
        F();
        return true;
    }

    public boolean S(int i3) {
        b0(i3);
        return true;
    }

    public void T(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void U() {
        j0(false);
        this.f3015t.requestFocus();
        this.f3015t.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f2990P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void V() {
        Editable text = this.f3015t.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f3004g0 != null) {
            O(0, null, text.toString());
        }
        this.f3015t.setImeVisibility(false);
        F();
    }

    public boolean W(View view, int i3, KeyEvent keyEvent) {
        if (this.f3004g0 != null && this.f2993S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i3 == 66 || i3 == 84 || i3 == 61) {
                return R(this.f3015t.getListSelection(), 0, null);
            }
            if (i3 == 21 || i3 == 22) {
                this.f3015t.setSelection(i3 == 21 ? 0 : this.f3015t.length());
                this.f3015t.setListSelection(0);
                this.f3015t.clearListSelection();
                this.f3015t.b();
                return true;
            }
            if (i3 == 19) {
                this.f3015t.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void X(CharSequence charSequence) {
        Editable text = this.f3015t.getText();
        this.f3001d0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        i0(!isEmpty);
        k0(isEmpty);
        d0();
        h0();
        this.f3000c0 = charSequence.toString();
    }

    public void Y() {
        j0(K());
        a0();
        if (this.f3015t.hasFocus()) {
            G();
        }
    }

    public void Z() {
        SearchableInfo searchableInfo = this.f3004g0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(E(this.f2986L, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(D(this.f2987M, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    public final void a0() {
        post(this.f3006i0);
    }

    @Override // j.InterfaceC0512b
    public void b() {
        if (this.f3002e0) {
            return;
        }
        this.f3002e0 = true;
        int imeOptions = this.f3015t.getImeOptions();
        this.f3003f0 = imeOptions;
        this.f3015t.setImeOptions(imeOptions | 33554432);
        this.f3015t.setText("");
        setIconified(false);
    }

    public final void b0(int i3) {
        Editable text = this.f3015t.getText();
        Cursor c3 = this.f2993S.c();
        if (c3 == null) {
            return;
        }
        if (!c3.moveToPosition(i3)) {
            setQuery(text);
            return;
        }
        CharSequence a3 = this.f2993S.a(c3);
        if (a3 != null) {
            setQuery(a3);
        } else {
            setQuery(text);
        }
    }

    public void c0(CharSequence charSequence, boolean z3) {
        this.f3015t.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f3015t;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f3001d0 = charSequence;
        }
        if (!z3 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        V();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f2997W = true;
        super.clearFocus();
        this.f3015t.clearFocus();
        this.f3015t.setImeVisibility(false);
        this.f2997W = false;
    }

    public final void d0() {
        boolean isEmpty = TextUtils.isEmpty(this.f3015t.getText());
        this.f3021z.setVisibility(!isEmpty || (this.f2991Q && !this.f3002e0) ? 0 : 8);
        Drawable drawable = this.f3021z.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // j.InterfaceC0512b
    public void e() {
        c0("", false);
        clearFocus();
        j0(true);
        this.f3015t.setImeOptions(this.f3003f0);
        this.f3002e0 = false;
    }

    public void e0() {
        int[] iArr = this.f3015t.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f3017v.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f3018w.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void f0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f3015t;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(I(queryHint));
    }

    public final void g0() {
        this.f3015t.setThreshold(this.f3004g0.getSuggestThreshold());
        this.f3015t.setImeOptions(this.f3004g0.getImeOptions());
        int inputType = this.f3004g0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f3004g0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f3015t.setInputType(inputType);
        R.a aVar = this.f2993S;
        if (aVar != null) {
            aVar.b(null);
        }
        if (this.f3004g0.getSuggestAuthority() != null) {
            ViewOnClickListenerC0547M viewOnClickListenerC0547M = new ViewOnClickListenerC0547M(getContext(), this, this.f3004g0, this.f3008k0);
            this.f2993S = viewOnClickListenerC0547M;
            this.f3015t.setAdapter(viewOnClickListenerC0547M);
            ((ViewOnClickListenerC0547M) this.f2993S).x(this.f2996V ? 2 : 1);
        }
    }

    public int getImeOptions() {
        return this.f3015t.getImeOptions();
    }

    public int getInputType() {
        return this.f3015t.getInputType();
    }

    public int getMaxWidth() {
        return this.f2998a0;
    }

    public CharSequence getQuery() {
        return this.f3015t.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f2995U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f3004g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f2988N : getContext().getText(this.f3004g0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f2985K;
    }

    public int getSuggestionRowLayout() {
        return this.f2984J;
    }

    public R.a getSuggestionsAdapter() {
        return this.f2993S;
    }

    public final void h0() {
        this.f3018w.setVisibility((M() && (this.f3020y.getVisibility() == 0 || this.f2975A.getVisibility() == 0)) ? 0 : 8);
    }

    public final void i0(boolean z3) {
        this.f3020y.setVisibility((this.f2994T && M() && hasFocus() && (z3 || !this.f2999b0)) ? 0 : 8);
    }

    public final void j0(boolean z3) {
        this.f2992R = z3;
        int i3 = 8;
        int i4 = z3 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f3015t.getText());
        this.f3019x.setVisibility(i4);
        i0(!isEmpty);
        this.f3016u.setVisibility(z3 ? 8 : 0);
        if (this.f2982H.getDrawable() != null && !this.f2991Q) {
            i3 = 0;
        }
        this.f2982H.setVisibility(i3);
        d0();
        k0(isEmpty);
        h0();
    }

    public final void k0(boolean z3) {
        int i3 = 8;
        if (this.f2999b0 && !K() && z3) {
            this.f3020y.setVisibility(8);
            i3 = 0;
        }
        this.f2975A.setVisibility(i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3006i0);
        post(this.f3007j0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        if (z3) {
            H(this.f3015t, this.f2978D);
            Rect rect = this.f2979E;
            Rect rect2 = this.f2978D;
            rect.set(rect2.left, 0, rect2.right, i6 - i4);
            q qVar = this.f2977C;
            if (qVar != null) {
                qVar.a(this.f2979E, this.f2978D);
                return;
            }
            q qVar2 = new q(this.f2979E, this.f2978D, this.f3015t);
            this.f2977C = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i3, int i4) {
        int i5;
        if (K()) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode == Integer.MIN_VALUE) {
            int i6 = this.f2998a0;
            size = i6 > 0 ? Math.min(i6, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f2998a0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i5 = this.f2998a0) > 0) {
            size = Math.min(i5, size);
        }
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        j0(pVar.f3040g);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f3040g = K();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        a0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i3, Rect rect) {
        if (this.f2997W || !isFocusable()) {
            return false;
        }
        if (K()) {
            return super.requestFocus(i3, rect);
        }
        boolean requestFocus = this.f3015t.requestFocus(i3, rect);
        if (requestFocus) {
            j0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f3005h0 = bundle;
    }

    public void setIconified(boolean z3) {
        if (z3) {
            Q();
        } else {
            U();
        }
    }

    public void setIconifiedByDefault(boolean z3) {
        if (this.f2991Q == z3) {
            return;
        }
        this.f2991Q = z3;
        j0(z3);
        f0();
    }

    public void setImeOptions(int i3) {
        this.f3015t.setImeOptions(i3);
    }

    public void setInputType(int i3) {
        this.f3015t.setInputType(i3);
    }

    public void setMaxWidth(int i3) {
        this.f2998a0 = i3;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f2989O = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2990P = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f2995U = charSequence;
        f0();
    }

    public void setQueryRefinementEnabled(boolean z3) {
        this.f2996V = z3;
        R.a aVar = this.f2993S;
        if (aVar instanceof ViewOnClickListenerC0547M) {
            ((ViewOnClickListenerC0547M) aVar).x(z3 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f3004g0 = searchableInfo;
        if (searchableInfo != null) {
            g0();
            f0();
        }
        boolean J3 = J();
        this.f2999b0 = J3;
        if (J3) {
            this.f3015t.setPrivateImeOptions("nm");
        }
        j0(K());
    }

    public void setSubmitButtonEnabled(boolean z3) {
        this.f2994T = z3;
        j0(K());
    }

    public void setSuggestionsAdapter(R.a aVar) {
        this.f2993S = aVar;
        this.f3015t.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0435a.f6030q);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f2978D = new Rect();
        this.f2979E = new Rect();
        this.f2980F = new int[2];
        this.f2981G = new int[2];
        this.f3006i0 = new b();
        this.f3007j0 = new c();
        this.f3008k0 = new WeakHashMap();
        f fVar = new f();
        this.f3009l0 = fVar;
        this.f3010m0 = new g();
        h hVar = new h();
        this.f3011n0 = hVar;
        i iVar = new i();
        this.f3012o0 = iVar;
        j jVar = new j();
        this.f3013p0 = jVar;
        this.f3014q0 = new a();
        int[] iArr = d.i.f6158A1;
        C0552S t3 = C0552S.t(context, attributeSet, iArr, i3, 0);
        O.h0(this, context, iArr, attributeSet, t3.p(), i3, 0);
        LayoutInflater.from(context).inflate(t3.m(d.i.f6198K1, d.f.f6138l), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(d.e.f6120t);
        this.f3015t = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f3016u = findViewById(d.e.f6116p);
        View findViewById = findViewById(d.e.f6119s);
        this.f3017v = findViewById;
        View findViewById2 = findViewById(d.e.f6126z);
        this.f3018w = findViewById2;
        ImageView imageView = (ImageView) findViewById(d.e.f6114n);
        this.f3019x = imageView;
        ImageView imageView2 = (ImageView) findViewById(d.e.f6117q);
        this.f3020y = imageView2;
        ImageView imageView3 = (ImageView) findViewById(d.e.f6115o);
        this.f3021z = imageView3;
        ImageView imageView4 = (ImageView) findViewById(d.e.f6121u);
        this.f2975A = imageView4;
        ImageView imageView5 = (ImageView) findViewById(d.e.f6118r);
        this.f2982H = imageView5;
        O.n0(findViewById, t3.g(d.i.f6202L1));
        O.n0(findViewById2, t3.g(d.i.f6218P1));
        int i4 = d.i.f6214O1;
        imageView.setImageDrawable(t3.g(i4));
        imageView2.setImageDrawable(t3.g(d.i.f6190I1));
        imageView3.setImageDrawable(t3.g(d.i.f6178F1));
        imageView4.setImageDrawable(t3.g(d.i.f6226R1));
        imageView5.setImageDrawable(t3.g(i4));
        this.f2983I = t3.g(d.i.f6210N1);
        AbstractC0556W.a(imageView, getResources().getString(d.g.f6153n));
        this.f2984J = t3.m(d.i.f6222Q1, d.f.f6137k);
        this.f2985K = t3.m(d.i.f6182G1, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f3014q0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f3010m0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(t3.a(d.i.f6194J1, true));
        int f3 = t3.f(d.i.f6166C1, -1);
        if (f3 != -1) {
            setMaxWidth(f3);
        }
        this.f2988N = t3.o(d.i.f6186H1);
        this.f2995U = t3.o(d.i.f6206M1);
        int j3 = t3.j(d.i.f6174E1, -1);
        if (j3 != -1) {
            setImeOptions(j3);
        }
        int j4 = t3.j(d.i.f6170D1, -1);
        if (j4 != -1) {
            setInputType(j4);
        }
        setFocusable(t3.a(d.i.f6162B1, true));
        t3.u();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f2986L = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2987M = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f2976B = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        j0(this.f2991Q);
        f0();
    }
}

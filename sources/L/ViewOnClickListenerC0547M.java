package l;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import d.AbstractC0435a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: l.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnClickListenerC0547M extends R.c implements View.OnClickListener {

    /* renamed from: A, reason: collision with root package name */
    public int f8256A;

    /* renamed from: B, reason: collision with root package name */
    public int f8257B;

    /* renamed from: C, reason: collision with root package name */
    public int f8258C;

    /* renamed from: p, reason: collision with root package name */
    public final SearchView f8259p;

    /* renamed from: q, reason: collision with root package name */
    public final SearchableInfo f8260q;

    /* renamed from: r, reason: collision with root package name */
    public final Context f8261r;

    /* renamed from: s, reason: collision with root package name */
    public final WeakHashMap f8262s;

    /* renamed from: t, reason: collision with root package name */
    public final int f8263t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8264u;

    /* renamed from: v, reason: collision with root package name */
    public int f8265v;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f8266w;

    /* renamed from: x, reason: collision with root package name */
    public int f8267x;

    /* renamed from: y, reason: collision with root package name */
    public int f8268y;

    /* renamed from: z, reason: collision with root package name */
    public int f8269z;

    /* renamed from: l.M$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f8270a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f8271b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f8272c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f8273d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f8274e;

        public a(View view) {
            this.f8270a = (TextView) view.findViewById(R.id.text1);
            this.f8271b = (TextView) view.findViewById(R.id.text2);
            this.f8272c = (ImageView) view.findViewById(R.id.icon1);
            this.f8273d = (ImageView) view.findViewById(R.id.icon2);
            this.f8274e = (ImageView) view.findViewById(d.e.f6111k);
        }
    }

    public ViewOnClickListenerC0547M(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f8264u = false;
        this.f8265v = 1;
        this.f8267x = -1;
        this.f8268y = -1;
        this.f8269z = -1;
        this.f8256A = -1;
        this.f8257B = -1;
        this.f8258C = -1;
        this.f8259p = searchView;
        this.f8260q = searchableInfo;
        this.f8263t = searchView.getSuggestionCommitIconResId();
        this.f8261r = context;
        this.f8262s = weakHashMap;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    public static String w(Cursor cursor, int i3) {
        if (i3 == -1) {
            return null;
        }
        try {
            return cursor.getString(i3);
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e3);
            return null;
        }
    }

    public final void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f8262s.put(str, drawable.getConstantState());
        }
    }

    public final void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // R.a, R.b.a
    public CharSequence a(Cursor cursor) {
        String o3;
        String o4;
        if (cursor == null) {
            return null;
        }
        String o5 = o(cursor, "suggest_intent_query");
        if (o5 != null) {
            return o5;
        }
        if (this.f8260q.shouldRewriteQueryFromData() && (o4 = o(cursor, "suggest_intent_data")) != null) {
            return o4;
        }
        if (!this.f8260q.shouldRewriteQueryFromText() || (o3 = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o3;
    }

    @Override // R.a, R.b.a
    public void b(Cursor cursor) {
        if (this.f8264u) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f8267x = cursor.getColumnIndex("suggest_text_1");
                this.f8268y = cursor.getColumnIndex("suggest_text_2");
                this.f8269z = cursor.getColumnIndex("suggest_text_2_url");
                this.f8256A = cursor.getColumnIndex("suggest_icon_1");
                this.f8257B = cursor.getColumnIndex("suggest_icon_2");
                this.f8258C = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e3) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e3);
        }
    }

    @Override // R.b.a
    public Cursor d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f8259p.getVisibility() == 0 && this.f8259p.getWindowVisibility() == 0) {
            try {
                Cursor v3 = v(this.f8260q, charSequence2, 50);
                if (v3 != null) {
                    v3.getCount();
                    return v3;
                }
            } catch (RuntimeException e3) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e3);
            }
        }
        return null;
    }

    @Override // R.a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i3 = this.f8258C;
        int i4 = i3 != -1 ? cursor.getInt(i3) : 0;
        if (aVar.f8270a != null) {
            z(aVar.f8270a, w(cursor, this.f8267x));
        }
        if (aVar.f8271b != null) {
            String w3 = w(cursor, this.f8269z);
            CharSequence l3 = w3 != null ? l(w3) : w(cursor, this.f8268y);
            if (TextUtils.isEmpty(l3)) {
                TextView textView = aVar.f8270a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f8270a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f8270a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f8270a.setMaxLines(1);
                }
            }
            z(aVar.f8271b, l3);
        }
        ImageView imageView = aVar.f8272c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f8273d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i5 = this.f8265v;
        if (i5 != 2 && (i5 != 1 || (i4 & 1) == 0)) {
            aVar.f8274e.setVisibility(8);
            return;
        }
        aVar.f8274e.setVisibility(0);
        aVar.f8274e.setTag(aVar.f8270a.getText());
        aVar.f8274e.setOnClickListener(this);
    }

    @Override // R.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View g3 = g(this.f8261r, c(), viewGroup);
            if (g3 != null) {
                ((a) g3.getTag()).f8270a.setText(e3.toString());
            }
            return g3;
        }
    }

    @Override // R.a, android.widget.Adapter
    public View getView(int i3, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i3, view, viewGroup);
        } catch (RuntimeException e3) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e3);
            View h3 = h(this.f8261r, c(), viewGroup);
            if (h3 != null) {
                ((a) h3.getTag()).f8270a.setText(e3.toString());
            }
            return h3;
        }
    }

    @Override // R.c, R.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h3 = super.h(context, cursor, viewGroup);
        h3.setTag(new a(h3));
        ((ImageView) h3.findViewById(d.e.f6111k)).setImageResource(this.f8263t);
        return h3;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public final Drawable k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f8262s.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public final CharSequence l(CharSequence charSequence) {
        if (this.f8266w == null) {
            TypedValue typedValue = new TypedValue();
            this.f8261r.getTheme().resolveAttribute(AbstractC0435a.f6032s, typedValue, true);
            this.f8266w = this.f8261r.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f8266w, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable m(ComponentName componentName) {
        PackageManager packageManager = this.f8261r.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e3) {
            Log.w("SuggestionsAdapter", e3.toString());
            return null;
        }
    }

    public final Drawable n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f8262s.containsKey(flattenToShortString)) {
            Drawable m3 = m(componentName);
            this.f8262s.put(flattenToShortString, m3 != null ? m3.getConstantState() : null);
            return m3;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f8262s.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f8261r.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f8259p.T((CharSequence) tag);
        }
    }

    public final Drawable p() {
        Drawable n3 = n(this.f8260q.getSearchActivity());
        return n3 != null ? n3 : this.f8261r.getPackageManager().getDefaultActivityIcon();
    }

    public final Drawable q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f8261r.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                try {
                    return createFromStream;
                } catch (IOException e3) {
                    return createFromStream;
                }
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e32) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e32);
                }
            }
        } catch (FileNotFoundException e4) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e4.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e4.getMessage());
        return null;
    }

    public Drawable r(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f8261r.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f8261r.getPackageName() + "/" + parseInt;
            Drawable k3 = k(str2);
            if (k3 != null) {
                return k3;
            }
            Drawable d3 = A.a.d(this.f8261r, parseInt);
            A(str2, d3);
            return d3;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable k4 = k(str);
            if (k4 != null) {
                return k4;
            }
            Drawable q3 = q(Uri.parse(str));
            A(str, q3);
            return q3;
        }
    }

    public final Drawable t(Cursor cursor) {
        int i3 = this.f8256A;
        if (i3 == -1) {
            return null;
        }
        Drawable s3 = s(cursor.getString(i3));
        return s3 != null ? s3 : p();
    }

    public final Drawable u(Cursor cursor) {
        int i3 = this.f8257B;
        if (i3 == -1) {
            return null;
        }
        return s(cursor.getString(i3));
    }

    public Cursor v(SearchableInfo searchableInfo, String str, int i3) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i3 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i3));
        }
        return this.f8261r.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i3) {
        this.f8265v = i3;
    }

    public final void y(ImageView imageView, Drawable drawable, int i3) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i3);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }
}

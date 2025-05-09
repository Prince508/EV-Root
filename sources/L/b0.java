package l;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class b0 extends AbstractC0545K {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f8331c = false;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f8332b;

    public b0(Context context, Resources resources) {
        super(resources);
        this.f8332b = new WeakReference(context);
    }

    public static boolean b() {
        return f8331c;
    }

    public static boolean c() {
        b();
        return false;
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i3) {
        return super.getAnimation(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i3) {
        return super.getBoolean(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i3) {
        return super.getColor(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i3) {
        return super.getColorStateList(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i3) {
        return super.getDimension(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i3) {
        return super.getDimensionPixelOffset(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i3) {
        return super.getDimensionPixelSize(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i3, Resources.Theme theme) {
        return super.getDrawable(i3, theme);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i3, int i4) {
        return super.getDrawableForDensity(i3, i4);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i3, int i4, int i5) {
        return super.getFraction(i3, i4, i5);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i3) {
        return super.getIntArray(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i3) {
        return super.getInteger(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i3) {
        return super.getLayout(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i3) {
        return super.getMovie(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i3, int i4) {
        return super.getQuantityString(i3, i4);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i3, int i4) {
        return super.getQuantityText(i3, i4);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i3) {
        return super.getResourceEntryName(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i3) {
        return super.getResourceName(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i3) {
        return super.getResourcePackageName(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i3) {
        return super.getResourceTypeName(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i3) {
        return super.getString(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i3) {
        return super.getStringArray(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i3) {
        return super.getText(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i3) {
        return super.getTextArray(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i3, TypedValue typedValue, boolean z3) {
        super.getValue(i3, typedValue, z3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i3, int i4, TypedValue typedValue, boolean z3) {
        super.getValueForDensity(i3, i4, typedValue, z3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i3) {
        return super.getXml(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i3) {
        return super.obtainTypedArray(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i3) {
        return super.openRawResource(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i3) {
        return super.openRawResourceFd(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i3) {
        Context context = (Context) this.f8332b.get();
        return context != null ? C0544J.g().r(context, this, i3) : a(i3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i3, int i4, Resources.Theme theme) {
        return super.getDrawableForDensity(i3, i4, theme);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i3, int i4, Object[] objArr) {
        return super.getQuantityString(i3, i4, objArr);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i3, Object[] objArr) {
        return super.getString(i3, objArr);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i3, CharSequence charSequence) {
        return super.getText(i3, charSequence);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z3) {
        super.getValue(str, typedValue, z3);
    }

    @Override // l.AbstractC0545K, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i3, TypedValue typedValue) {
        return super.openRawResource(i3, typedValue);
    }
}

package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f3496k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public Object f3498b;

    /* renamed from: j, reason: collision with root package name */
    public String f3506j;

    /* renamed from: a, reason: collision with root package name */
    public int f3497a = -1;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f3499c = null;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f3500d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f3501e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f3502f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f3503g = null;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f3504h = f3496k;

    /* renamed from: i, reason: collision with root package name */
    public String f3505i = null;

    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon resource", e5);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon package", e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon package", e5);
                return null;
            }
        }

        public static Uri c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.e("IconCompat", "Unable to get icon uri", e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.e("IconCompat", "Unable to get icon uri", e5);
                return null;
            }
        }

        public static Drawable d(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        public static Icon e(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f3497a) {
                case -1:
                    return (Icon) iconCompat.f3498b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f3498b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.c(), iconCompat.f3501e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f3498b, iconCompat.f3501e, iconCompat.f3502f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f3498b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f3498b, false));
                        break;
                    } else {
                        createWithBitmap = b.b((Bitmap) iconCompat.f3498b);
                        break;
                    }
                case 6:
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 30) {
                        createWithBitmap = d.a(iconCompat.d());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.d());
                        }
                        InputStream e3 = iconCompat.e(context);
                        if (e3 == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.d());
                        }
                        if (i3 < 26) {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(e3), false));
                            break;
                        } else {
                            createWithBitmap = b.b(BitmapFactory.decodeStream(e3));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f3503g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f3504h;
            if (mode != IconCompat.f3496k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public static Bitmap a(Bitmap bitmap, boolean z3) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f3 = min;
        float f4 = 0.5f * f3;
        float f5 = 0.9166667f * f4;
        if (z3) {
            float f6 = 0.010416667f * f3;
            paint.setColor(0);
            paint.setShadowLayer(f6, 0.0f, f3 * 0.020833334f, 1023410176);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.setShadowLayer(f6, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f4, f4, f5, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static String i(int i3) {
        switch (i3) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int b() {
        int i3 = this.f3497a;
        if (i3 == -1) {
            return a.a(this.f3498b);
        }
        if (i3 == 2) {
            return this.f3501e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String c() {
        int i3 = this.f3497a;
        if (i3 == -1) {
            return a.b(this.f3498b);
        }
        if (i3 == 2) {
            String str = this.f3506j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f3498b).split(":", -1)[0] : this.f3506j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public Uri d() {
        int i3 = this.f3497a;
        if (i3 == -1) {
            return a.c(this.f3498b);
        }
        if (i3 == 4 || i3 == 6) {
            return Uri.parse((String) this.f3498b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream e(Context context) {
        Uri d3 = d();
        String scheme = d3.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(d3);
            } catch (Exception e3) {
                Log.w("IconCompat", "Unable to load image from URI: " + d3, e3);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f3498b));
        } catch (FileNotFoundException e4) {
            Log.w("IconCompat", "Unable to load image from path: " + d3, e4);
            return null;
        }
    }

    public void f() {
        this.f3504h = PorterDuff.Mode.valueOf(this.f3505i);
        switch (this.f3497a) {
            case -1:
                Parcelable parcelable = this.f3500d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f3498b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f3500d;
                if (parcelable2 != null) {
                    this.f3498b = parcelable2;
                    return;
                }
                byte[] bArr = this.f3499c;
                this.f3498b = bArr;
                this.f3497a = 3;
                this.f3501e = 0;
                this.f3502f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f3499c, Charset.forName("UTF-16"));
                this.f3498b = str;
                if (this.f3497a == 2 && this.f3506j == null) {
                    this.f3506j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f3498b = this.f3499c;
                return;
        }
    }

    public void g(boolean z3) {
        this.f3505i = this.f3504h.name();
        switch (this.f3497a) {
            case -1:
                if (z3) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f3500d = (Parcelable) this.f3498b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z3) {
                    this.f3500d = (Parcelable) this.f3498b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f3498b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f3499c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f3499c = ((String) this.f3498b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f3499c = (byte[]) this.f3498b;
                return;
            case 4:
            case 6:
                this.f3499c = this.f3498b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Icon h(Context context) {
        return a.e(this, context);
    }

    public String toString() {
        if (this.f3497a == -1) {
            return String.valueOf(this.f3498b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(i(this.f3497a));
        switch (this.f3497a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f3498b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f3498b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f3506j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f3501e);
                if (this.f3502f != 0) {
                    sb.append(" off=");
                    sb.append(this.f3502f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f3498b);
                break;
        }
        if (this.f3503g != null) {
            sb.append(" tint=");
            sb.append(this.f3503g);
        }
        if (this.f3504h != f3496k) {
            sb.append(" mode=");
            sb.append(this.f3504h);
        }
        sb.append(")");
        return sb.toString();
    }
}

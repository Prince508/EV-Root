package p2;

import C2.k;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toast$Callback;
import i2.i;
import io.flutter.view.j;

/* renamed from: p2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0665e implements i.c {

    /* renamed from: b, reason: collision with root package name */
    public Context f8851b;

    /* renamed from: c, reason: collision with root package name */
    public Toast f8852c;

    /* renamed from: p2.e$a */
    public static final class a extends Toast$Callback {
        public a() {
        }

        public void onToastHidden() {
            super.onToastHidden();
            C0665e.this.f8852c = null;
        }
    }

    public C0665e(Context context) {
        k.e(context, "context");
        this.f8851b = context;
    }

    public static final void d(C0665e c0665e) {
        Toast toast = c0665e.f8852c;
        if (toast != null) {
            toast.show();
        }
    }

    @Override // i2.i.c
    public void a(i2.h hVar, i.d dVar) {
        Toast toast;
        k.e(hVar, "call");
        k.e(dVar, "result");
        String str = hVar.f7499a;
        if (!k.a(str, "showToast")) {
            if (!k.a(str, "cancel")) {
                dVar.c();
                return;
            }
            Toast toast2 = this.f8852c;
            if (toast2 != null) {
                if (toast2 != null) {
                    toast2.cancel();
                }
                this.f8852c = null;
            }
            dVar.b(Boolean.TRUE);
            return;
        }
        String valueOf = String.valueOf(hVar.a("msg"));
        String valueOf2 = String.valueOf(hVar.a("length"));
        String valueOf3 = String.valueOf(hVar.a("gravity"));
        Number number = (Number) hVar.a("bgcolor");
        Number number2 = (Number) hVar.a("textcolor");
        Number number3 = (Number) hVar.a("fontSize");
        String str2 = (String) hVar.a("fontAsset");
        int i3 = k.a(valueOf3, "top") ? 48 : k.a(valueOf3, "center") ? 17 : 80;
        boolean a3 = k.a(valueOf2, "long");
        if (number != null) {
            Object systemService = this.f8851b.getSystemService("layout_inflater");
            k.c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View inflate = ((LayoutInflater) systemService).inflate(AbstractC0668h.f8856a, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(AbstractC0667g.f8855a);
            textView.setText(valueOf);
            Drawable drawable = this.f8851b.getDrawable(AbstractC0666f.f8854a);
            k.b(drawable);
            k.b(drawable);
            drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
            textView.setBackground(drawable);
            if (number3 != null) {
                textView.setTextSize(number3.floatValue());
            }
            if (number2 != null) {
                textView.setTextColor(number2.intValue());
            }
            Toast toast3 = new Toast(this.f8851b);
            this.f8852c = toast3;
            toast3.setDuration(a3 ? 1 : 0);
            if (str2 != null) {
                AssetManager assets = this.f8851b.getAssets();
                k.d(assets, "getAssets(...)");
                String a4 = j.a(str2);
                k.d(a4, "getLookupKeyForAsset(...)");
                textView.setTypeface(Typeface.createFromAsset(assets, a4));
            }
            Toast toast4 = this.f8852c;
            if (toast4 != null) {
                toast4.setView(inflate);
            }
        } else {
            Toast makeText = Toast.makeText(this.f8851b, valueOf, a3 ? 1 : 0);
            this.f8852c = makeText;
            if (Build.VERSION.SDK_INT < 30) {
                View view = makeText != null ? makeText.getView() : null;
                k.b(view);
                View findViewById = view.findViewById(R.id.message);
                k.d(findViewById, "findViewById(...)");
                TextView textView2 = (TextView) findViewById;
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                if (str2 != null) {
                    AssetManager assets2 = this.f8851b.getAssets();
                    k.d(assets2, "getAssets(...)");
                    String a5 = j.a(str2);
                    k.d(a5, "getLookupKeyForAsset(...)");
                    textView2.setTypeface(Typeface.createFromAsset(assets2, a5));
                }
            }
        }
        try {
            if (i3 == 17) {
                Toast toast5 = this.f8852c;
                if (toast5 != null) {
                    toast5.setGravity(i3, 0, 0);
                }
            } else if (i3 != 48) {
                Toast toast6 = this.f8852c;
                if (toast6 != null) {
                    toast6.setGravity(i3, 0, 100);
                }
            } else {
                Toast toast7 = this.f8852c;
                if (toast7 != null) {
                    toast7.setGravity(i3, 0, 100);
                }
            }
        } catch (Exception unused) {
        }
        Context context = this.f8851b;
        if (context instanceof Activity) {
            k.c(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).runOnUiThread(new Runnable() { // from class: p2.d
                @Override // java.lang.Runnable
                public final void run() {
                    C0665e.d(C0665e.this);
                }
            });
        } else {
            Toast toast8 = this.f8852c;
            if (toast8 != null) {
                toast8.show();
            }
        }
        if (Build.VERSION.SDK_INT >= 30 && (toast = this.f8852c) != null) {
            toast.addCallback(AbstractC0662b.a(new a()));
        }
        dVar.b(Boolean.TRUE);
    }
}

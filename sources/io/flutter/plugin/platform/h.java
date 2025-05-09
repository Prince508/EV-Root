package io.flutter.plugin.platform;

import K.J0;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.Window;
import h2.o;
import io.flutter.plugin.platform.h;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f7690a;

    /* renamed from: b, reason: collision with root package name */
    public final h2.o f7691b;

    /* renamed from: c, reason: collision with root package name */
    public final d f7692c;

    /* renamed from: d, reason: collision with root package name */
    public o.j f7693d;

    /* renamed from: e, reason: collision with root package name */
    public int f7694e;

    /* renamed from: f, reason: collision with root package name */
    public final o.h f7695f;

    public class a implements o.h {
        public a() {
        }

        @Override // h2.o.h
        public void a() {
            h.this.t();
        }

        @Override // h2.o.h
        public void g(boolean z3) {
            h.this.w(z3);
        }

        @Override // h2.o.h
        public void h() {
            h.this.y();
        }

        @Override // h2.o.h
        public CharSequence i(o.e eVar) {
            return h.this.r(eVar);
        }

        @Override // h2.o.h
        public void j() {
            h.this.u();
        }

        @Override // h2.o.h
        public void k(String str) {
            h.this.v(str);
        }

        @Override // h2.o.h
        public void l(o.g gVar) {
            h.this.F(gVar);
        }

        @Override // h2.o.h
        public void m(o.i iVar) {
            h.this.s(iVar);
        }

        @Override // h2.o.h
        public void n(o.k kVar) {
            h.this.z(kVar);
        }

        @Override // h2.o.h
        public void o(int i3) {
            h.this.B(i3);
        }

        @Override // h2.o.h
        public void p(List list) {
            h.this.A(list);
        }

        @Override // h2.o.h
        public void q(String str) {
            h.this.D(str);
        }

        @Override // h2.o.h
        public boolean r() {
            return h.this.p();
        }

        @Override // h2.o.h
        public void s(o.c cVar) {
            h.this.x(cVar);
        }

        @Override // h2.o.h
        public void t(o.j jVar) {
            h.this.C(jVar);
        }
    }

    public class b implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7697a;

        public b(View view) {
            this.f7697a = view;
        }

        public static /* synthetic */ void a(b bVar, int i3) {
            if ((i3 & 4) == 0) {
                h.this.f7691b.m(true);
            } else {
                h.this.f7691b.m(false);
            }
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i3) {
            this.f7697a.post(new Runnable() { // from class: io.flutter.plugin.platform.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.b.a(h.b.this, i3);
                }
            });
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7699a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7700b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f7701c;

        static {
            int[] iArr = new int[o.d.values().length];
            f7701c = iArr;
            try {
                iArr[o.d.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7701c[o.d.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[o.l.values().length];
            f7700b = iArr2;
            try {
                iArr2[o.l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7700b[o.l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[o.g.values().length];
            f7699a = iArr3;
            try {
                iArr3[o.g.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7699a[o.g.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7699a[o.g.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7699a[o.g.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7699a[o.g.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public interface d {
        boolean a();

        void g(boolean z3);
    }

    public h(Activity activity, h2.o oVar, d dVar) {
        a aVar = new a();
        this.f7695f = aVar;
        this.f7690a = activity;
        this.f7691b = oVar;
        oVar.l(aVar);
        this.f7692c = dVar;
        this.f7694e = 1280;
    }

    public final void A(List list) {
        int i3 = list.size() == 0 ? 5894 : 1798;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int i5 = c.f7700b[((o.l) list.get(i4)).ordinal()];
            if (i5 == 1) {
                i3 &= -5;
            } else if (i5 == 2) {
                i3 &= -515;
            }
        }
        this.f7694e = i3;
        E();
    }

    public final void B(int i3) {
        this.f7690a.setRequestedOrientation(i3);
    }

    public final void C(o.j jVar) {
        Window window = this.f7690a.getWindow();
        J0 j02 = new J0(window, window.getDecorView());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        o.d dVar = jVar.f7319b;
        if (dVar != null) {
            int i4 = c.f7701c[dVar.ordinal()];
            if (i4 == 1) {
                j02.b(true);
            } else if (i4 == 2) {
                j02.b(false);
            }
        }
        Integer num = jVar.f7318a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = jVar.f7320c;
        if (bool != null && i3 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i3 >= 26) {
            o.d dVar2 = jVar.f7322e;
            if (dVar2 != null) {
                int i5 = c.f7701c[dVar2.ordinal()];
                if (i5 == 1) {
                    j02.a(true);
                } else if (i5 == 2) {
                    j02.a(false);
                }
            }
            Integer num2 = jVar.f7321d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = jVar.f7323f;
        if (num3 != null && i3 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f7324g;
        if (bool2 != null && i3 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f7693d = jVar;
    }

    public final void D(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        this.f7690a.startActivity(Intent.createChooser(intent, null));
    }

    public void E() {
        this.f7690a.getWindow().getDecorView().setSystemUiVisibility(this.f7694e);
        o.j jVar = this.f7693d;
        if (jVar != null) {
            C(jVar);
        }
    }

    public void F(o.g gVar) {
        View decorView = this.f7690a.getWindow().getDecorView();
        int i3 = c.f7699a[gVar.ordinal()];
        if (i3 == 1) {
            decorView.performHapticFeedback(0);
            return;
        }
        if (i3 == 2) {
            decorView.performHapticFeedback(1);
            return;
        }
        if (i3 == 3) {
            decorView.performHapticFeedback(3);
        } else if (i3 == 4) {
            decorView.performHapticFeedback(6);
        } else {
            if (i3 != 5) {
                return;
            }
            decorView.performHapticFeedback(4);
        }
    }

    public final boolean p() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f7690a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public void q() {
        this.f7691b.l(null);
    }

    public final CharSequence r(o.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f7690a.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (eVar != null && eVar != o.e.PLAIN_TEXT) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                CharSequence text = itemAt.getText();
                if (text != null) {
                    return text;
                }
                try {
                    Uri uri = itemAt.getUri();
                    if (uri == null) {
                        W1.b.g("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                        return null;
                    }
                    String scheme = uri.getScheme();
                    if (!scheme.equals("content")) {
                        W1.b.g("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        return null;
                    }
                    AssetFileDescriptor openTypedAssetFileDescriptor = this.f7690a.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                    CharSequence coerceToText = itemAt.coerceToText(this.f7690a);
                    if (openTypedAssetFileDescriptor == null) {
                        return coerceToText;
                    }
                    try {
                        openTypedAssetFileDescriptor.close();
                        return coerceToText;
                    } catch (IOException e3) {
                        charSequence = coerceToText;
                        e = e3;
                        W1.b.h("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                        return charSequence;
                    }
                } catch (IOException e4) {
                    e = e4;
                    charSequence = text;
                }
            } catch (FileNotFoundException unused) {
                W1.b.g("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                return null;
            } catch (SecurityException e5) {
                W1.b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
                return null;
            }
        } catch (IOException e6) {
            e = e6;
        }
    }

    public final void s(o.i iVar) {
        if (iVar == o.i.CLICK) {
            this.f7690a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t() {
        d dVar = this.f7692c;
        if (dVar == null || !dVar.a()) {
            Activity activity = this.f7690a;
            if (activity instanceof b.k) {
                ((b.k) activity).l().e();
            } else {
                activity.finish();
            }
        }
    }

    public final void u() {
        E();
    }

    public final void v(String str) {
        ((ClipboardManager) this.f7690a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    public final void w(boolean z3) {
        d dVar = this.f7692c;
        if (dVar != null) {
            dVar.g(z3);
        }
    }

    public final void x(o.c cVar) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f7690a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f7293b, (Bitmap) null, cVar.f7292a));
            return;
        }
        g.a();
        this.f7690a.setTaskDescription(f.a(cVar.f7293b, 0, cVar.f7292a));
    }

    public final void y() {
        View decorView = this.f7690a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new b(decorView));
    }

    public final void z(o.k kVar) {
        int i3;
        if (kVar == o.k.LEAN_BACK) {
            i3 = 1798;
        } else if (kVar == o.k.IMMERSIVE) {
            i3 = 3846;
        } else if (kVar == o.k.IMMERSIVE_STICKY) {
            i3 = 5894;
        } else if (kVar != o.k.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i3 = 1792;
        }
        this.f7694e = i3;
        E();
    }
}

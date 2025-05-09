package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import l0.AbstractC0588c;
import l0.C0587b;
import l0.k;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f4135a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f4136b;

    /* renamed from: c, reason: collision with root package name */
    public final c.InterfaceC0094c f4137c;

    /* renamed from: e, reason: collision with root package name */
    public final File f4139e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4140f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4141g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4142h;

    /* renamed from: j, reason: collision with root package name */
    public C0587b[] f4144j;

    /* renamed from: k, reason: collision with root package name */
    public byte[] f4145k;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4143i = false;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4138d = d();

    public b(AssetManager assetManager, Executor executor, c.InterfaceC0094c interfaceC0094c, String str, String str2, String str3, File file) {
        this.f4135a = assetManager;
        this.f4136b = executor;
        this.f4137c = interfaceC0094c;
        this.f4140f = str;
        this.f4141g = str2;
        this.f4142h = str3;
        this.f4139e = file;
    }

    public static byte[] d() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 > 34) {
            return null;
        }
        switch (i3) {
        }
        return null;
    }

    public static boolean j() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 > 34) {
            return false;
        }
        if (i3 != 24 && i3 != 25) {
            switch (i3) {
            }
            return false;
        }
        return true;
    }

    public final b b(C0587b[] c0587bArr, byte[] bArr) {
        InputStream g3;
        try {
            g3 = g(this.f4135a, this.f4142h);
        } catch (FileNotFoundException e3) {
            this.f4137c.b(9, e3);
        } catch (IOException e4) {
            this.f4137c.b(7, e4);
        } catch (IllegalStateException e5) {
            this.f4144j = null;
            this.f4137c.b(8, e5);
        }
        if (g3 == null) {
            if (g3 != null) {
                g3.close();
            }
            return null;
        }
        try {
            this.f4144j = k.q(g3, k.o(g3, k.f8465b), bArr, c0587bArr);
            g3.close();
            return this;
        } catch (Throwable th) {
            try {
                g3.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        if (!this.f4143i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean e() {
        if (this.f4138d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f4139e.exists()) {
            try {
                this.f4139e.createNewFile();
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f4139e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f4143i = true;
        return true;
    }

    public final InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f4141g);
        } catch (FileNotFoundException e3) {
            this.f4137c.b(6, e3);
            return null;
        } catch (IOException e4) {
            this.f4137c.b(7, e4);
            return null;
        }
    }

    public final InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f4137c.a(5, null);
            }
            return null;
        }
    }

    public b h() {
        b b3;
        c();
        if (this.f4138d != null) {
            InputStream f3 = f(this.f4135a);
            if (f3 != null) {
                this.f4144j = i(f3);
            }
            C0587b[] c0587bArr = this.f4144j;
            if (c0587bArr != null && j() && (b3 = b(c0587bArr, this.f4138d)) != null) {
                return b3;
            }
        }
        return this;
    }

    public final C0587b[] i(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        C0587b[] w3 = k.w(inputStream, k.o(inputStream, k.f8464a), this.f4140f);
                        try {
                            inputStream.close();
                            return w3;
                        } catch (IOException e3) {
                            this.f4137c.b(7, e3);
                            return w3;
                        }
                    } catch (IOException e4) {
                        this.f4137c.b(7, e4);
                        inputStream.close();
                        return null;
                    }
                } catch (IllegalStateException e5) {
                    this.f4137c.b(8, e5);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e6) {
                this.f4137c.b(7, e6);
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e7) {
                this.f4137c.b(7, e7);
            }
            throw th;
        }
    }

    public final void k(final int i3, final Object obj) {
        this.f4136b.execute(new Runnable() { // from class: l0.a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.b.this.f4137c.b(i3, obj);
            }
        });
    }

    public b l() {
        ByteArrayOutputStream byteArrayOutputStream;
        C0587b[] c0587bArr = this.f4144j;
        byte[] bArr = this.f4138d;
        if (c0587bArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e3) {
                this.f4137c.b(7, e3);
            } catch (IllegalStateException e4) {
                this.f4137c.b(8, e4);
            }
            try {
                k.E(byteArrayOutputStream, bArr);
                if (!k.B(byteArrayOutputStream, bArr, c0587bArr)) {
                    this.f4137c.b(5, null);
                    this.f4144j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f4145k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f4144j = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    public boolean m() {
        byte[] bArr = this.f4145k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f4139e);
                    try {
                        AbstractC0588c.l(byteArrayInputStream, fileOutputStream);
                        k(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e3) {
                k(6, e3);
                return false;
            } catch (IOException e4) {
                k(7, e4);
                return false;
            }
        } finally {
            this.f4145k = null;
            this.f4144j = null;
        }
    }
}

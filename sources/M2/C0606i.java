package m2;

import android.content.Context;
import android.util.Log;
import e2.InterfaceC0465a;
import i2.InterfaceC0504b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import m2.AbstractC0605h;
import o2.AbstractC0651b;

/* renamed from: m2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0606i implements InterfaceC0465a, AbstractC0605h.a {

    /* renamed from: b, reason: collision with root package name */
    public Context f8536b;

    /* renamed from: m2.i$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8537a;

        static {
            int[] iArr = new int[AbstractC0605h.c.values().length];
            f8537a = iArr;
            try {
                iArr[AbstractC0605h.c.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8537a[AbstractC0605h.c.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8537a[AbstractC0605h.c.PODCASTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8537a[AbstractC0605h.c.RINGTONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8537a[AbstractC0605h.c.ALARMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8537a[AbstractC0605h.c.NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8537a[AbstractC0605h.c.PICTURES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8537a[AbstractC0605h.c.MOVIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8537a[AbstractC0605h.c.DOWNLOADS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8537a[AbstractC0605h.c.DCIM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8537a[AbstractC0605h.c.DOCUMENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void u(InterfaceC0504b interfaceC0504b, Context context) {
        try {
            AbstractC0605h.a.i(interfaceC0504b, this);
        } catch (Exception e3) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e3);
        }
        this.f8536b = context;
    }

    @Override // e2.InterfaceC0465a
    public void b(InterfaceC0465a.b bVar) {
        u(bVar.b(), bVar.a());
    }

    @Override // m2.AbstractC0605h.a
    public String c() {
        return this.f8536b.getCacheDir().getPath();
    }

    @Override // m2.AbstractC0605h.a
    public String d() {
        return this.f8536b.getCacheDir().getPath();
    }

    @Override // m2.AbstractC0605h.a
    public String e() {
        return AbstractC0651b.c(this.f8536b);
    }

    @Override // m2.AbstractC0605h.a
    public List h(AbstractC0605h.c cVar) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f8536b.getExternalFilesDirs(t(cVar))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // m2.AbstractC0605h.a
    public List j() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f8536b.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // m2.AbstractC0605h.a
    public String m() {
        File externalFilesDir = this.f8536b.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    @Override // e2.InterfaceC0465a
    public void p(InterfaceC0465a.b bVar) {
        AbstractC0605h.a.i(bVar.b(), null);
    }

    @Override // m2.AbstractC0605h.a
    public String q() {
        return AbstractC0651b.d(this.f8536b);
    }

    public String t(AbstractC0605h.c cVar) {
        switch (a.f8537a[cVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
    }
}

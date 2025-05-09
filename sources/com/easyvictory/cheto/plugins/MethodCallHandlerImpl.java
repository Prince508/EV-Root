package com.easyvictory.cheto.plugins;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.RemoteException;
import b1.C0368a;
import c1.AbstractC0373a;
import c1.AbstractC0378f;
import c1.AbstractC0381i;
import c1.AbstractC0382j;
import c1.AbstractC0389q;
import c1.AbstractC0391s;
import c1.AbstractC0394v;
import com.easyvictory.cheto.App;
import com.easyvictory.cheto.api_client.ApiClient;
import com.easyvictory.cheto.api_client.ApiResponse;
import com.easyvictory.cheto.overlays.FloatLogo;
import com.easyvictory.cheto.services.UIServices;
import d1.C0440a;
import i2.h;
import i2.i;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
class MethodCallHandlerImpl implements i.c {

    /* renamed from: b, reason: collision with root package name */
    public final Activity f4951b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f4952c = Executors.newSingleThreadExecutor();

    public class a implements C0368a.InterfaceC0102a {
        public a() {
        }

        @Override // b1.C0368a.InterfaceC0102a
        public void a() {
        }

        @Override // b1.C0368a.InterfaceC0102a
        public void b() {
            MethodCallHandlerImpl.this.g();
        }
    }

    public MethodCallHandlerImpl(Activity activity) {
        this.f4951b = activity;
    }

    private static native void saveAppIconNoBackground(String str);

    @Override // i2.i.c
    public void a(final h hVar, final i.d dVar) {
        this.f4952c.submit(new Runnable() { // from class: com.easyvictory.cheto.plugins.a
            @Override // java.lang.Runnable
            public final void run() {
                MethodCallHandlerImpl.this.f(hVar, dVar);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void f(h hVar, i.d dVar) {
        char c3;
        List a3;
        List a4;
        while (App.f4793g == null) {
            AbstractC0394v.a(500);
        }
        String str = hVar.f7499a;
        boolean z3 = true;
        boolean z4 = false;
        switch (str.hashCode()) {
            case -2127887046:
                if (str.equals(U2.a.a(-13168045027566L))) {
                    c3 = 18;
                    break;
                }
                c3 = 65535;
                break;
            case -2034115015:
                if (str.equals(U2.a.a(-12583929475310L))) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case -1875150091:
                if (str.equals(U2.a.a(-11866669936878L))) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case -1602577584:
                if (str.equals(U2.a.a(-12970476531950L))) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case -1531462807:
                if (str.equals(U2.a.a(-12674123788526L))) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case -1423191611:
                if (str.equals(U2.a.a(-12493735162094L))) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case -1354327642:
                if (str.equals(U2.a.a(-12231742157038L))) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case -525117557:
                if (str.equals(U2.a.a(-12167317647598L))) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case -301205540:
                if (str.equals(U2.a.a(-12124367974638L))) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 36223570:
                if (str.equals(U2.a.a(-11978339086574L))) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 134762710:
                if (str.equals(U2.a.a(-12768613069038L))) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 545720044:
                if (str.equals(U2.a.a(-12880282218734L))) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case 546768611:
                if (str.equals(U2.a.a(-13043490975982L))) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            case 849037793:
                if (str.equals(U2.a.a(-13090735616238L))) {
                    c3 = 17;
                    break;
                }
                c3 = 65535;
                break;
            case 945068986:
                if (str.equals(U2.a.a(-12815857709294L))) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case 1302624721:
                if (str.equals(U2.a.a(-12047058563310L))) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 1739954982:
                if (str.equals(U2.a.a(-12399245881582L))) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 1854581940:
                if (str.equals(U2.a.a(-12330526404846L))) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 2088263773:
                if (str.equals(U2.a.a(-11943979348206L))) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
                ApiResponse authenticateUserJNI = ApiClient.authenticateUserJNI((String) hVar.a(U2.a.a(-13288304111854L)), (String) hVar.a(U2.a.a(-13326958817518L)), AbstractC0378f.a());
                HashMap hashMap = new HashMap();
                hashMap.put(U2.a.a(-13365613523182L), authenticateUserJNI.getBytes());
                hashMap.put(U2.a.a(-13408563196142L), Long.valueOf(authenticateUserJNI.getStatusCode()));
                dVar.b(hashMap);
                return;
            case 1:
                ApiResponse signupWithQuestionsJNI = ApiClient.signupWithQuestionsJNI((String) hVar.a(U2.a.a(-13455807836398L)), (String) hVar.a(U2.a.a(-13494462542062L)), (String) hVar.a(U2.a.a(-13533117247726L)), (String) hVar.a(U2.a.a(-13571771953390L)), (String) hVar.a(U2.a.a(-13601836724462L)), AbstractC0378f.a());
                HashMap hashMap2 = new HashMap();
                hashMap2.put(U2.a.a(-13619016593646L), signupWithQuestionsJNI.getBytes());
                hashMap2.put(U2.a.a(-13661966266606L), Long.valueOf(signupWithQuestionsJNI.getStatusCode()));
                dVar.b(hashMap2);
                return;
            case 2:
                ApiResponse recoverAccountWithQuestionsJNI = ApiClient.recoverAccountWithQuestionsJNI((String) hVar.a(U2.a.a(-13709210906862L)), (String) hVar.a(U2.a.a(-13747865612526L)), (String) hVar.a(U2.a.a(-13786520318190L)), (String) hVar.a(U2.a.a(-13825175023854L)));
                HashMap hashMap3 = new HashMap();
                hashMap3.put(U2.a.a(-13855239794926L), recoverAccountWithQuestionsJNI.getBytes());
                hashMap3.put(U2.a.a(-13898189467886L), Long.valueOf(recoverAccountWithQuestionsJNI.getStatusCode()));
                dVar.b(hashMap3);
                return;
            case 3:
                ApiResponse subTimeLeftJNI = ApiClient.getSubTimeLeftJNI((String) hVar.a(U2.a.a(-13945434108142L)));
                HashMap hashMap4 = new HashMap();
                hashMap4.put(U2.a.a(-13971203911918L), subTimeLeftJNI.getBytes());
                hashMap4.put(U2.a.a(-14014153584878L), Long.valueOf(subTimeLeftJNI.getStatusCode()));
                dVar.b(hashMap4);
                return;
            case 4:
                ApiResponse claimKeyJNI = ApiClient.claimKeyJNI((String) hVar.a(U2.a.a(-14061398225134L)), (String) hVar.a(U2.a.a(-14087168028910L)));
                HashMap hashMap5 = new HashMap();
                hashMap5.put(U2.a.a(-14104347898094L), claimKeyJNI.getBytes());
                hashMap5.put(U2.a.a(-14147297571054L), Long.valueOf(claimKeyJNI.getStatusCode()));
                dVar.b(hashMap5);
                return;
            case 5:
                ApiResponse resetPasswordJNI = ApiClient.resetPasswordJNI((String) hVar.a(U2.a.a(-14194542211310L)), (String) hVar.a(U2.a.a(-14220312015086L)));
                HashMap hashMap6 = new HashMap();
                hashMap6.put(U2.a.a(-14258966720750L), resetPasswordJNI.getBytes());
                hashMap6.put(U2.a.a(-14301916393710L), Long.valueOf(resetPasswordJNI.getStatusCode()));
                dVar.b(hashMap6);
                return;
            case 6:
                ApiResponse compatibilityInfo = ApiClient.getCompatibilityInfo((String) hVar.a(U2.a.a(-14349161033966L)));
                HashMap hashMap7 = new HashMap();
                hashMap7.put(U2.a.a(-14374930837742L), compatibilityInfo.getBytes());
                hashMap7.put(U2.a.a(-14417880510702L), Long.valueOf(compatibilityInfo.getStatusCode()));
                dVar.b(hashMap7);
                return;
            case 7:
                ApiResponse resetDeviceIdJNI = ApiClient.resetDeviceIdJNI((String) hVar.a(U2.a.a(-14465125150958L)));
                HashMap hashMap8 = new HashMap();
                hashMap8.put(U2.a.a(-14490894954734L), resetDeviceIdJNI.getBytes());
                hashMap8.put(U2.a.a(-14533844627694L), Long.valueOf(resetDeviceIdJNI.getStatusCode()));
                dVar.b(hashMap8);
                return;
            case '\b':
                HashMap hashMap9 = new HashMap();
                if (C0368a.d().f()) {
                    String str2 = (String) hVar.a(U2.a.a(-14581089267950L));
                    C0440a c0440a = new C0440a(this.f4951b, str2);
                    PackageInfo a5 = AbstractC0389q.a(this.f4951b, str2);
                    if (a5 != null) {
                        try {
                            ApiResponse g3 = C0368a.d().e().g((String) hVar.a(U2.a.a(-14636923842798L)), str2, a5.versionCode, c0440a.b());
                            hashMap9.put(U2.a.a(-14662693646574L), g3.getBytes());
                            hashMap9.put(U2.a.a(-14705643319534L), Long.valueOf(g3.getStatusCode()));
                        } catch (RemoteException unused) {
                        }
                    }
                    if (!hashMap9.containsKey(U2.a.a(-14752887959790L))) {
                        hashMap9.put(U2.a.a(-14800132600046L), -1);
                        hashMap9.put(U2.a.a(-14847377240302L), U2.a.a(-14890326913262L).getBytes());
                    }
                } else {
                    hashMap9.put(U2.a.a(-14903211815150L), -1);
                    hashMap9.put(U2.a.a(-14950456455406L), U2.a.a(-14993406128366L).getBytes());
                }
                dVar.b(hashMap9);
                return;
            case '\t':
                dVar.b(new C0440a(this.f4951b, (String) hVar.a(U2.a.a(-15427197825262L))).a());
                return;
            case '\n':
                String str3 = (String) hVar.a(U2.a.a(-15483032400110L));
                C0440a c0440a2 = new C0440a(this.f4951b, str3);
                if (hVar.b() != null) {
                    c0440a2.c((Map) hVar.b());
                    if (C0368a.d().f()) {
                        try {
                            C0368a.d().e().s(str3, c0440a2.b());
                        } catch (RemoteException e3) {
                            AbstractC0382j.b(e3);
                            throw new RuntimeException(e3);
                        }
                    }
                }
                dVar.b(null);
                return;
            case 11:
                String str4 = (String) hVar.a(U2.a.a(-15538866974958L));
                if (C0368a.d().f()) {
                    try {
                        z4 = C0368a.d().e().o(str4);
                    } catch (RemoteException e4) {
                        AbstractC0382j.b(e4);
                        throw new RuntimeException(e4);
                    }
                }
                dVar.b(Boolean.valueOf(z4));
                return;
            case '\f':
                try {
                    Thread.sleep(2000L);
                    if (C0368a.d().f()) {
                        try {
                            C0368a.d().e().k();
                        } catch (RemoteException e5) {
                            throw new RuntimeException(e5);
                        }
                    }
                    AbstractC0391s.b(AbstractC0391s.a(AbstractC0373a.b(this.f4951b)));
                    Intent intent = new Intent(this.f4951b, (Class<?>) UIServices.class);
                    intent.setAction(U2.a.a(-15594701549806L));
                    this.f4951b.startService(intent);
                    try {
                        Thread.sleep(1000L);
                        try {
                            a3 = Z0.b.a(new Object[]{AbstractC0391s.f4766h, AbstractC0391s.f4767i});
                            AbstractC0391s.c(a3);
                            return;
                        } catch (RuntimeException unused2) {
                            System.exit(-1);
                            return;
                        }
                    } catch (InterruptedException e6) {
                        throw new RuntimeException(e6);
                    }
                } catch (InterruptedException e7) {
                    throw new RuntimeException(e7);
                }
            case '\r':
                dVar.b(Boolean.valueOf(AbstractC0389q.d(this.f4951b, (String) hVar.a(U2.a.a(-15641946190062L)))));
                return;
            case 14:
                dVar.b(Boolean.valueOf(AbstractC0389q.c(this.f4951b, (String) hVar.a(U2.a.a(-15697780764910L)))));
                return;
            case 15:
                AbstractC0389q.a b3 = AbstractC0389q.b(this.f4951b, (String) hVar.a(U2.a.a(-15753615339758L)));
                if (b3 == null) {
                    dVar.a(U2.a.a(-15951183835374L), U2.a.a(-16028493246702L), null);
                    return;
                }
                PackageInfo packageInfo = b3.f4757a;
                String str5 = packageInfo.versionName;
                int i3 = packageInfo.versionCode;
                HashMap hashMap10 = new HashMap();
                hashMap10.put(U2.a.a(-15809449914606L), str5);
                hashMap10.put(U2.a.a(-15860989522158L), Integer.valueOf(i3));
                hashMap10.put(U2.a.a(-15912529129710L), b3.f4758b);
                dVar.b(hashMap10);
                return;
            case 16:
                dVar.b(Boolean.valueOf(AbstractC0381i.a(this.f4951b, (String) hVar.a(U2.a.a(-16144457363694L)))));
                return;
            case 17:
                if (AbstractC0391s.f()) {
                    ArrayList arrayList = new ArrayList(Z0.b.a(new String[]{AbstractC0391s.f4764f, AbstractC0391s.a(AbstractC0373a.b(this.f4951b)), AbstractC0391s.a(AbstractC0373a.a(this.f4951b)), AbstractC0391s.a(AbstractC0373a.b(this.f4951b)), AbstractC0391s.a(AbstractC0373a.a(this.f4951b)), AbstractC0391s.e(U2.a.a(-16161637232878L)), AbstractC0391s.f4761c, AbstractC0391s.f4763e, AbstractC0391s.e(U2.a.a(-16342025859310L)), AbstractC0391s.f4762d, AbstractC0391s.f4765g}));
                    if (Build.VERSION.SDK_INT >= 33) {
                        try {
                            a4 = Z0.b.a(new Object[]{AbstractC0391s.e(U2.a.a(-16509529583854L)), AbstractC0391s.e(U2.a.a(-16668443373806L)), AbstractC0391s.e(U2.a.a(-16823062196462L))});
                            arrayList.addAll(a4);
                        } catch (Throwable th) {
                            AbstractC0382j.e(U2.a.a(-16977681019118L), th);
                        }
                    }
                    try {
                        AbstractC0391s.c(arrayList);
                        this.f4951b.runOnUiThread(new Runnable() { // from class: com.easyvictory.cheto.plugins.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                MethodCallHandlerImpl.this.e();
                            }
                        });
                    } catch (Throwable th2) {
                        AbstractC0382j.f(th2);
                    }
                } else {
                    z3 = false;
                }
                dVar.b(Boolean.valueOf(z3));
                return;
            case 18:
                File file = new File(this.f4951b.getFilesDir(), U2.a.a(-17016335724782L));
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, U2.a.a(-17046400495854L));
                if (!file2.exists()) {
                    saveAppIconNoBackground(file2.getAbsolutePath());
                }
                dVar.b(file2.getAbsolutePath());
                return;
            default:
                dVar.c();
                return;
        }
    }

    public final /* synthetic */ void e() {
        C0368a.d().c(this.f4951b.getApplicationContext());
        C0368a.d().b(FloatLogo.getInstance().f4867c);
        C0368a.d().b(new a());
    }

    public void g() {
        this.f4951b.startActivityForResult(((MediaProjectionManager) this.f4951b.getSystemService(U2.a.a(-17179544482030L))).createScreenCaptureIntent(), 1);
    }
}

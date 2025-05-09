package l2;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import e2.InterfaceC0465a;
import f2.InterfaceC0475a;
import h2.r;
import i2.i;
import i2.k;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: l2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0593c implements InterfaceC0465a, InterfaceC0475a, k, r.b {

    /* renamed from: b, reason: collision with root package name */
    public final r f8478b;

    /* renamed from: c, reason: collision with root package name */
    public final PackageManager f8479c;

    /* renamed from: d, reason: collision with root package name */
    public f2.c f8480d;

    /* renamed from: e, reason: collision with root package name */
    public Map f8481e;

    /* renamed from: f, reason: collision with root package name */
    public Map f8482f = new HashMap();

    public C0593c(r rVar) {
        this.f8478b = rVar;
        this.f8479c = rVar.f7375b;
        rVar.b(this);
    }

    @Override // i2.k
    public boolean a(int i3, int i4, Intent intent) {
        if (!this.f8482f.containsKey(Integer.valueOf(i3))) {
            return false;
        }
        ((i.d) this.f8482f.remove(Integer.valueOf(i3))).b(i4 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // h2.r.b
    public Map c() {
        if (this.f8481e == null) {
            i();
        }
        HashMap hashMap = new HashMap();
        for (String str : this.f8481e.keySet()) {
            hashMap.put(str, ((ResolveInfo) this.f8481e.get(str)).loadLabel(this.f8479c).toString());
        }
        return hashMap;
    }

    @Override // h2.r.b
    public void d(String str, String str2, boolean z3, i.d dVar) {
        if (this.f8480d == null) {
            dVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        Map map = this.f8481e;
        if (map == null) {
            dVar.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            dVar.a("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = dVar.hashCode();
        this.f8482f.put(Integer.valueOf(hashCode), dVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z3);
        this.f8480d.d().startActivityForResult(intent, hashCode);
    }

    @Override // f2.InterfaceC0475a
    public void e(f2.c cVar) {
        this.f8480d = cVar;
        cVar.b(this);
    }

    @Override // f2.InterfaceC0475a
    public void f() {
        this.f8480d.a(this);
        this.f8480d = null;
    }

    @Override // f2.InterfaceC0475a
    public void g(f2.c cVar) {
        this.f8480d = cVar;
        cVar.b(this);
    }

    @Override // f2.InterfaceC0475a
    public void h() {
        this.f8480d.a(this);
        this.f8480d = null;
    }

    public final void i() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        this.f8481e = new HashMap();
        int i3 = Build.VERSION.SDK_INT;
        Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        if (i3 >= 33) {
            PackageManager packageManager = this.f8479c;
            of = PackageManager.ResolveInfoFlags.of(0L);
            queryIntentActivities = packageManager.queryIntentActivities(type, of);
        } else {
            queryIntentActivities = this.f8479c.queryIntentActivities(type, 0);
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str = resolveInfo.activityInfo.name;
            resolveInfo.loadLabel(this.f8479c).toString();
            this.f8481e.put(str, resolveInfo);
        }
    }

    @Override // e2.InterfaceC0465a
    public void b(InterfaceC0465a.b bVar) {
    }

    @Override // e2.InterfaceC0465a
    public void p(InterfaceC0465a.b bVar) {
    }
}

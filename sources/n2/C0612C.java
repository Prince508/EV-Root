package n2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import i2.InterfaceC0504b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: n2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612C implements InterfaceC0611B {

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0504b f8560b;

    /* renamed from: c, reason: collision with root package name */
    public Context f8561c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0613D f8562d;

    public C0612C(InterfaceC0504b interfaceC0504b, Context context, InterfaceC0613D interfaceC0613D) {
        C2.k.e(interfaceC0504b, "messenger");
        C2.k.e(context, "context");
        C2.k.e(interfaceC0613D, "listEncoder");
        this.f8560b = interfaceC0504b;
        this.f8561c = context;
        this.f8562d = interfaceC0613D;
        try {
            InterfaceC0611B.f8557a.q(interfaceC0504b, this, "shared_preferences");
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesBackend", e3);
        }
    }

    @Override // n2.InterfaceC0611B
    public Boolean a(String str, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        SharedPreferences b3 = b(c0614e);
        if (b3.contains(str)) {
            return Boolean.valueOf(b3.getBoolean(str, true));
        }
        return null;
    }

    public final SharedPreferences b(C0614E c0614e) {
        if (c0614e.a() == null) {
            SharedPreferences a3 = k0.b.a(this.f8561c);
            C2.k.b(a3);
            return a3;
        }
        SharedPreferences sharedPreferences = this.f8561c.getSharedPreferences(c0614e.a(), 0);
        C2.k.b(sharedPreferences);
        return sharedPreferences;
    }

    @Override // n2.InterfaceC0611B
    public String c(String str, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        SharedPreferences b3 = b(c0614e);
        if (b3.contains(str)) {
            return b3.getString(str, "");
        }
        return null;
    }

    @Override // n2.InterfaceC0611B
    public void d(String str, double d3, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        b(c0614e).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).apply();
    }

    @Override // n2.InterfaceC0611B
    public void e(String str, List list, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(list, "value");
        C2.k.e(c0614e, "options");
        b(c0614e).edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f8562d.a(list)).apply();
    }

    @Override // n2.InterfaceC0611B
    public void f(List list, C0614E c0614e) {
        C2.k.e(c0614e, "options");
        SharedPreferences b3 = b(c0614e);
        SharedPreferences.Editor edit = b3.edit();
        C2.k.d(edit, "edit(...)");
        Map<String, ?> all = b3.getAll();
        C2.k.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : all.keySet()) {
            if (AbstractC0616G.c(str, all.get(str), list != null ? r2.u.A(list) : null)) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        C2.k.d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            C2.k.d(next, "next(...)");
            edit.remove((String) next);
        }
        edit.apply();
    }

    @Override // n2.InterfaceC0611B
    public Map g(List list, C0614E c0614e) {
        Object value;
        C2.k.e(c0614e, "options");
        Map<String, ?> all = b(c0614e).getAll();
        C2.k.d(all, "getAll(...)");
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            if (AbstractC0616G.c(entry.getKey(), entry.getValue(), list != null ? r2.u.A(list) : null) && (value = entry.getValue()) != null) {
                String key = entry.getKey();
                Object d3 = AbstractC0616G.d(value, this.f8562d);
                C2.k.c(d3, "null cannot be cast to non-null type kotlin.Any");
                hashMap.put(key, d3);
            }
        }
        return hashMap;
    }

    @Override // n2.InterfaceC0611B
    public void h(String str, long j3, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        b(c0614e).edit().putLong(str, j3).apply();
    }

    @Override // n2.InterfaceC0611B
    public Double i(String str, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        SharedPreferences b3 = b(c0614e);
        if (!b3.contains(str)) {
            return null;
        }
        Object d3 = AbstractC0616G.d(b3.getString(str, ""), this.f8562d);
        C2.k.c(d3, "null cannot be cast to non-null type kotlin.Double");
        return (Double) d3;
    }

    @Override // n2.InterfaceC0611B
    public List j(String str, C0614E c0614e) {
        List list;
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        SharedPreferences b3 = b(c0614e);
        if (!b3.contains(str) || (list = (List) AbstractC0616G.d(b3.getString(str, ""), this.f8562d)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // n2.InterfaceC0611B
    public Long k(String str, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        SharedPreferences b3 = b(c0614e);
        if (b3.contains(str)) {
            return Long.valueOf(b3.getLong(str, 0L));
        }
        return null;
    }

    @Override // n2.InterfaceC0611B
    public void l(String str, boolean z3, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        b(c0614e).edit().putBoolean(str, z3).apply();
    }

    @Override // n2.InterfaceC0611B
    public List m(List list, C0614E c0614e) {
        C2.k.e(c0614e, "options");
        Map<String, ?> all = b(c0614e).getAll();
        C2.k.d(all, "getAll(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            C2.k.d(key, "<get-key>(...)");
            if (AbstractC0616G.c(key, entry.getValue(), list != null ? r2.u.A(list) : null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return r2.u.x(linkedHashMap.keySet());
    }

    @Override // n2.InterfaceC0611B
    public void n(String str, String str2, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(str2, "value");
        C2.k.e(c0614e, "options");
        b(c0614e).edit().putString(str, str2).apply();
    }

    public final void o() {
        InterfaceC0611B.f8557a.q(this.f8560b, null, "shared_preferences");
    }
}

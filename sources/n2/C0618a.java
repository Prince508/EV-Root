package n2;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import e2.InterfaceC0465a;
import i2.InterfaceC0504b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import n2.AbstractC0628k;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0618a implements InterfaceC0465a, AbstractC0628k.a {

    /* renamed from: b, reason: collision with root package name */
    public SharedPreferences f8689b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0613D f8690c;

    /* renamed from: n2.a$a, reason: collision with other inner class name */
    public static class C0146a implements InterfaceC0613D {
        @Override // n2.InterfaceC0613D
        public String a(List list) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(list);
                objectOutputStream.flush();
                return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        }

        @Override // n2.InterfaceC0613D
        public List b(String str) {
            try {
                return (List) new C0617H(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
            } catch (IOException | ClassNotFoundException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public C0618a() {
        this(new C0146a());
    }

    private void u(InterfaceC0504b interfaceC0504b, Context context) {
        this.f8689b = context.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            AbstractC0628k.a.m(interfaceC0504b, this);
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e3);
        }
    }

    @Override // e2.InterfaceC0465a
    public void b(InterfaceC0465a.b bVar) {
        u(bVar.b(), bVar.a());
    }

    @Override // n2.AbstractC0628k.a
    public Boolean c(String str, Boolean bool) {
        return Boolean.valueOf(this.f8689b.edit().putBoolean(str, bool.booleanValue()).commit());
    }

    @Override // n2.AbstractC0628k.a
    public Boolean e(String str, Double d3) {
        String d4 = Double.toString(d3.doubleValue());
        return Boolean.valueOf(this.f8689b.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d4).commit());
    }

    @Override // n2.AbstractC0628k.a
    public Boolean h(String str, Long l3) {
        return Boolean.valueOf(this.f8689b.edit().putLong(str, l3.longValue()).commit());
    }

    @Override // n2.AbstractC0628k.a
    public Map i(String str, List list) {
        return t(str, list == null ? null : new HashSet(list));
    }

    @Override // n2.AbstractC0628k.a
    public Boolean l(String str, String str2) {
        if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
        }
        return Boolean.valueOf(this.f8689b.edit().putString(str, str2).commit());
    }

    @Override // e2.InterfaceC0465a
    public void p(InterfaceC0465a.b bVar) {
        AbstractC0628k.a.m(bVar.b(), null);
    }

    @Override // n2.AbstractC0628k.a
    public Boolean r(String str, List list) {
        SharedPreferences.Editor edit = this.f8689b.edit();
        Map<String, ?> all = this.f8689b.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    @Override // n2.AbstractC0628k.a
    public Boolean remove(String str) {
        return Boolean.valueOf(this.f8689b.edit().remove(str).commit());
    }

    @Override // n2.AbstractC0628k.a
    public Boolean s(String str, List list) {
        return Boolean.valueOf(this.f8689b.edit().putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f8690c.a(list)).commit());
    }

    public final Map t(String str, Set set) {
        Map<String, ?> all = this.f8689b.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (set == null || set.contains(str2))) {
                hashMap.put(str2, v(str2, all.get(str2)));
            }
        }
        return hashMap;
    }

    public final Object v(String str, Object obj) {
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                return this.f8690c.b(str2.substring(40));
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                return new BigInteger(str2.substring(44), 36);
            }
            if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                return Double.valueOf(str2.substring(40));
            }
        } else if (obj instanceof Set) {
            ArrayList arrayList = new ArrayList((Set) obj);
            this.f8689b.edit().remove(str).putString(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f8690c.a(arrayList)).apply();
            return arrayList;
        }
        return obj;
    }

    public C0618a(InterfaceC0613D interfaceC0613D) {
        this.f8690c = interfaceC0613D;
    }
}

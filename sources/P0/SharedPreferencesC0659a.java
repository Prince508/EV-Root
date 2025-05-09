package p0;

import B1.l;
import B1.m;
import B1.n;
import C1.AbstractC0173a;
import I1.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesC0659a implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8805a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f8806b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final String f8807c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8808d;

    /* renamed from: e, reason: collision with root package name */
    public final B1.a f8809e;

    /* renamed from: f, reason: collision with root package name */
    public final B1.e f8810f;

    /* renamed from: p0.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0149a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8811a;

        static {
            int[] iArr = new int[c.values().length];
            f8811a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8811a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8811a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8811a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8811a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8811a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: p0.a$b */
    public static final class b implements SharedPreferences.Editor {

        /* renamed from: a, reason: collision with root package name */
        public final SharedPreferencesC0659a f8812a;

        /* renamed from: b, reason: collision with root package name */
        public final SharedPreferences.Editor f8813b;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f8815d = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        public final List f8814c = new CopyOnWriteArrayList();

        public b(SharedPreferencesC0659a sharedPreferencesC0659a, SharedPreferences.Editor editor) {
            this.f8812a = sharedPreferencesC0659a;
            this.f8813b = editor;
        }

        public final void a() {
            if (this.f8815d.getAndSet(false)) {
                for (String str : this.f8812a.getAll().keySet()) {
                    if (!this.f8814c.contains(str) && !this.f8812a.g(str)) {
                        this.f8813b.remove(this.f8812a.d(str));
                    }
                }
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f8813b.apply();
            b();
            this.f8814c.clear();
        }

        public final void b() {
            Iterator it = this.f8812a.f8806b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) it.next();
                Iterator it2 = this.f8814c.iterator();
                while (it2.hasNext()) {
                    onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f8812a, (String) it2.next());
                }
            }
        }

        public final void c(String str, byte[] bArr) {
            if (this.f8812a.g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f8814c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair e3 = this.f8812a.e(str, bArr);
                this.f8813b.putString((String) e3.first, (String) e3.second);
            } catch (GeneralSecurityException e4) {
                throw new SecurityException("Could not encrypt data: " + e4.getMessage(), e4);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f8815d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f8813b.commit();
            } finally {
                b();
                this.f8814c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z3) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.g());
            allocate.put(z3 ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f3) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.g());
            allocate.putFloat(f3);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i3) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.g());
            allocate.putInt(i3);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j3) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.g());
            allocate.putLong(j3);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.g());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            if (set == null) {
                set = new o.b();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((String) it.next()).getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(c.STRING_SET.g());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f8812a.g(str)) {
                this.f8813b.remove(this.f8812a.d(str));
                this.f8814c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* renamed from: p0.a$c */
    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);


        /* renamed from: e, reason: collision with root package name */
        public final int f8823e;

        c(int i3) {
            this.f8823e = i3;
        }

        public static c f(int i3) {
            if (i3 == 0) {
                return STRING;
            }
            if (i3 == 1) {
                return STRING_SET;
            }
            if (i3 == 2) {
                return INT;
            }
            if (i3 == 3) {
                return LONG;
            }
            if (i3 == 4) {
                return FLOAT;
            }
            if (i3 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int g() {
            return this.f8823e;
        }
    }

    /* renamed from: p0.a$d */
    public enum d {
        AES256_SIV("AES256_SIV");


        /* renamed from: e, reason: collision with root package name */
        public final String f8826e;

        d(String str) {
            this.f8826e = str;
        }

        public l f() {
            return m.a(this.f8826e);
        }
    }

    /* renamed from: p0.a$e */
    public enum e {
        AES256_GCM("AES256_GCM");


        /* renamed from: e, reason: collision with root package name */
        public final String f8829e;

        e(String str) {
            this.f8829e = str;
        }

        public l f() {
            return m.a(this.f8829e);
        }
    }

    public SharedPreferencesC0659a(String str, String str2, SharedPreferences sharedPreferences, B1.a aVar, B1.e eVar) {
        this.f8807c = str;
        this.f8805a = sharedPreferences;
        this.f8808d = str2;
        this.f8809e = aVar;
        this.f8810f = eVar;
    }

    public static SharedPreferences a(Context context, String str, p0.c cVar, d dVar, e eVar) {
        return b(str, cVar.a(), context, dVar, eVar);
    }

    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) {
        H1.b.a();
        AbstractC0173a.b();
        Context applicationContext = context.getApplicationContext();
        n d3 = new a.b().l(dVar.f()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m("android-keystore://" + str2).f().d();
        n d4 = new a.b().l(eVar.f()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m("android-keystore://" + str2).f().d();
        return new SharedPreferencesC0659a(str, str2, applicationContext.getSharedPreferences(str, 0), (B1.a) d4.k(B1.a.class), (B1.e) d3.k(B1.e.class));
    }

    public String c(String str) {
        try {
            String str2 = new String(this.f8810f.b(P1.e.a(str, 0), this.f8807c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e3) {
            throw new SecurityException("Could not decrypt key. " + e3.getMessage(), e3);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.f8805a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    public String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return P1.e.d(this.f8810f.a(str.getBytes(StandardCharsets.UTF_8), this.f8807c.getBytes()));
        } catch (GeneralSecurityException e3) {
            throw new SecurityException("Could not encrypt key. " + e3.getMessage(), e3);
        }
    }

    public Pair e(String str, byte[] bArr) {
        String d3 = d(str);
        return new Pair(d3, P1.e.d(this.f8809e.a(bArr, d3.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.f8805a.edit());
    }

    public final Object f(String str) {
        if (g(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String d3 = d(str);
            String string = this.f8805a.getString(d3, null);
            if (string == null) {
                return null;
            }
            byte[] a3 = P1.e.a(string, 0);
            B1.a aVar = this.f8809e;
            Charset charset = StandardCharsets.UTF_8;
            ByteBuffer wrap = ByteBuffer.wrap(aVar.b(a3, d3.getBytes(charset)));
            wrap.position(0);
            int i3 = wrap.getInt();
            c f3 = c.f(i3);
            if (f3 == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i3);
            }
            switch (C0149a.f8811a[f3.ordinal()]) {
                case 1:
                    int i4 = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i4);
                    String charBuffer = charset.decode(slice).toString();
                    if (charBuffer.equals("__NULL__")) {
                        return null;
                    }
                    return charBuffer;
                case 2:
                    return Integer.valueOf(wrap.getInt());
                case 3:
                    return Long.valueOf(wrap.getLong());
                case 4:
                    return Float.valueOf(wrap.getFloat());
                case 5:
                    return Boolean.valueOf(wrap.get() != 0);
                case 6:
                    o.b bVar = new o.b();
                    while (wrap.hasRemaining()) {
                        int i5 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i5);
                        wrap.position(wrap.position() + i5);
                        bVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (bVar.size() == 1 && "__NULL__".equals(bVar.p(0))) {
                        return null;
                    }
                    return bVar;
                default:
                    throw new SecurityException("Unhandled type for encrypted pref value: " + f3);
            }
        } catch (GeneralSecurityException e3) {
            throw new SecurityException("Could not decrypt value. " + e3.getMessage(), e3);
        }
    }

    public boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f8805a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String c3 = c(entry.getKey());
                hashMap.put(c3, f(c3));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z3) {
        Object f3 = f(str);
        return f3 instanceof Boolean ? ((Boolean) f3).booleanValue() : z3;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f3) {
        Object f4 = f(str);
        return f4 instanceof Float ? ((Float) f4).floatValue() : f3;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i3) {
        Object f3 = f(str);
        return f3 instanceof Integer ? ((Integer) f3).intValue() : i3;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j3) {
        Object f3 = f(str);
        return f3 instanceof Long ? ((Long) f3).longValue() : j3;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object f3 = f(str);
        return f3 instanceof String ? (String) f3 : str2;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        Object f3 = f(str);
        Set bVar = f3 instanceof Set ? (Set) f3 : new o.b();
        return bVar.size() > 0 ? bVar : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f8806b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f8806b.remove(onSharedPreferenceChangeListener);
    }
}

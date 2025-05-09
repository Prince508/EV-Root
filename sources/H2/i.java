package h2;

import android.view.KeyEvent;
import h2.i;
import i2.C0503a;
import i2.C0506d;
import i2.InterfaceC0504b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final C0503a f7255a;

    public interface a {
        void a(boolean z3);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final KeyEvent f7256a;

        /* renamed from: b, reason: collision with root package name */
        public final Character f7257b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f7256a = keyEvent;
            this.f7257b = ch;
        }
    }

    public i(InterfaceC0504b interfaceC0504b) {
        this.f7255a = new C0503a(interfaceC0504b, "flutter/keyevent", C0506d.f7497a);
    }

    public static /* synthetic */ void a(a aVar, Object obj) {
        boolean z3 = false;
        if (obj != null) {
            try {
                z3 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e3) {
                W1.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e3);
            }
        }
        aVar.a(z3);
    }

    public static C0503a.e b(final a aVar) {
        return new C0503a.e() { // from class: h2.h
            @Override // i2.C0503a.e
            public final void a(Object obj) {
                i.a(i.a.this, obj);
            }
        };
    }

    public final Map c(b bVar, boolean z3) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z3 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f7256a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f7256a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f7256a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f7256a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f7256a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f7256a.getMetaState()));
        Character ch = bVar.f7257b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f7256a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f7256a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f7256a.getRepeatCount()));
        return hashMap;
    }

    public void d(b bVar, boolean z3, a aVar) {
        this.f7255a.d(c(bVar, z3), b(aVar));
    }
}

package h2;

import a2.C0313a;
import i2.C0503a;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.f;
import java.util.HashMap;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0490a {

    /* renamed from: a, reason: collision with root package name */
    public final C0503a f7242a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f7243b;

    /* renamed from: c, reason: collision with root package name */
    public b f7244c;

    /* renamed from: d, reason: collision with root package name */
    public final C0503a.d f7245d;

    /* renamed from: h2.a$a, reason: collision with other inner class name */
    public class C0121a implements C0503a.d {
        public C0121a() {
        }

        @Override // i2.C0503a.d
        public void a(Object obj, C0503a.e eVar) {
            HashMap hashMap;
            HashMap hashMap2;
            if (C0490a.this.f7244c == null) {
                eVar.a(null);
                return;
            }
            hashMap = (HashMap) obj;
            String str = (String) hashMap.get("type");
            hashMap2 = (HashMap) hashMap.get("data");
            W1.b.f("AccessibilityChannel", "Received " + str + " message.");
            str.getClass();
            switch (str) {
                case "tooltip":
                    String str2 = (String) hashMap2.get("message");
                    if (str2 != null) {
                        C0490a.this.f7244c.c(str2);
                        break;
                    }
                    break;
                case "announce":
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        C0490a.this.f7244c.f(str3);
                        break;
                    }
                    break;
                case "tap":
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        C0490a.this.f7244c.g(num.intValue());
                        break;
                    }
                    break;
                case "focus":
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        C0490a.this.f7244c.d(num2.intValue());
                        break;
                    }
                    break;
                case "longPress":
                    Integer num3 = (Integer) hashMap.get("nodeId");
                    if (num3 != null) {
                        C0490a.this.f7244c.e(num3.intValue());
                        break;
                    }
                    break;
            }
            eVar.a(null);
        }
    }

    /* renamed from: h2.a$b */
    public interface b extends FlutterJNI.a {
        void c(String str);

        void d(int i3);

        void e(int i3);

        void f(String str);

        void g(int i3);
    }

    public C0490a(C0313a c0313a, FlutterJNI flutterJNI) {
        C0121a c0121a = new C0121a();
        this.f7245d = c0121a;
        C0503a c0503a = new C0503a(c0313a, "flutter/accessibility", i2.l.f7511a);
        this.f7242a = c0503a;
        c0503a.e(c0121a);
        this.f7243b = flutterJNI;
    }

    public void b(int i3, f.g gVar) {
        this.f7243b.dispatchSemanticsAction(i3, gVar);
    }

    public void c(int i3, f.g gVar, Object obj) {
        this.f7243b.dispatchSemanticsAction(i3, gVar, obj);
    }

    public void d() {
        this.f7243b.setSemanticsEnabled(false);
    }

    public void e() {
        this.f7243b.setSemanticsEnabled(true);
    }

    public void f(int i3) {
        this.f7243b.setAccessibilityFeatures(i3);
    }

    public void g(b bVar) {
        this.f7244c = bVar;
        this.f7243b.setAccessibilityDelegate(bVar);
    }
}

package g2;

import W1.b;
import io.flutter.plugins.GeneratedPluginRegistrant;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0483a {
    public static void a(io.flutter.embedding.engine.a aVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", io.flutter.embedding.engine.a.class).invoke(null, aVar);
        } catch (Exception e3) {
            b.b("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + aVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            b.c("GeneratedPluginsRegister", "Received exception while registering", e3);
        }
    }
}

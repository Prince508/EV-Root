package io.flutter.plugins;

import R1.e;
import W1.b;
import c.InterfaceC0370a;
import io.flutter.embedding.engine.a;
import m2.C0606i;
import n2.C0615F;
import p2.C0661a;

@InterfaceC0370a
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(a aVar) {
        try {
            aVar.r().d(new e());
        } catch (Exception e3) {
            b.c(TAG, "Error registering plugin flutter_secure_storage, com.it_nomads.fluttersecurestorage.FlutterSecureStoragePlugin", e3);
        }
        try {
            aVar.r().d(new C0661a());
        } catch (Exception e4) {
            b.c(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e4);
        }
        try {
            aVar.r().d(new C0606i());
        } catch (Exception e5) {
            b.c(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e5);
        }
        try {
            aVar.r().d(new C0615F());
        } catch (Exception e6) {
            b.c(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e6);
        }
    }
}

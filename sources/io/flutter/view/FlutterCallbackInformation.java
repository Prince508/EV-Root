package io.flutter.view;

import c.InterfaceC0370a;
import io.flutter.embedding.engine.FlutterJNI;

@InterfaceC0370a
/* loaded from: classes.dex */
public final class FlutterCallbackInformation {
    public final String callbackClassName;
    public final String callbackLibraryPath;
    public final String callbackName;

    private FlutterCallbackInformation(String str, String str2, String str3) {
        this.callbackName = str;
        this.callbackClassName = str2;
        this.callbackLibraryPath = str3;
    }

    public static FlutterCallbackInformation lookupCallbackInformation(long j3) {
        return FlutterJNI.nativeLookupCallbackInformation(j3);
    }
}

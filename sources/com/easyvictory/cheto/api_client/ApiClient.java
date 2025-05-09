package com.easyvictory.cheto.api_client;

/* loaded from: classes.dex */
public abstract class ApiClient {
    public static native ApiResponse authenticateUserJNI(String str, String str2, String str3);

    public static native ApiResponse claimKeyJNI(String str, String str2);

    public static native ApiResponse getCompatibilityInfo(String str);

    public static native ApiResponse getSubTimeLeftJNI(String str);

    public static native ApiResponse recoverAccountWithQuestionsJNI(String str, String str2, String str3, String str4);

    public static native ApiResponse resetDeviceIdJNI(String str);

    public static native ApiResponse resetPasswordJNI(String str, String str2);

    public static native ApiResponse signupWithQuestionsJNI(String str, String str2, String str3, String str4, String str5, String str6);
}

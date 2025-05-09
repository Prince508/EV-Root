package io.flutter.plugin.editing;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f7674a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f7675b;

    /* renamed from: c, reason: collision with root package name */
    public int f7676c;

    /* renamed from: d, reason: collision with root package name */
    public int f7677d;

    /* renamed from: e, reason: collision with root package name */
    public int f7678e;

    /* renamed from: f, reason: collision with root package name */
    public int f7679f;

    /* renamed from: g, reason: collision with root package name */
    public int f7680g;

    /* renamed from: h, reason: collision with root package name */
    public int f7681h;

    public k(CharSequence charSequence, int i3, int i4, CharSequence charSequence2, int i5, int i6, int i7, int i8) {
        this.f7678e = i5;
        this.f7679f = i6;
        this.f7680g = i7;
        this.f7681h = i8;
        a(charSequence, charSequence2.toString(), i3, i4);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i3, int i4) {
        this.f7674a = charSequence;
        this.f7675b = charSequence2;
        this.f7676c = i3;
        this.f7677d = i4;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f7674a.toString());
            jSONObject.put("deltaText", this.f7675b.toString());
            jSONObject.put("deltaStart", this.f7676c);
            jSONObject.put("deltaEnd", this.f7677d);
            jSONObject.put("selectionBase", this.f7678e);
            jSONObject.put("selectionExtent", this.f7679f);
            jSONObject.put("composingBase", this.f7680g);
            jSONObject.put("composingExtent", this.f7681h);
            return jSONObject;
        } catch (JSONException e3) {
            W1.b.b("TextEditingDelta", "unable to create JSONObject: " + e3);
            return jSONObject;
        }
    }

    public k(CharSequence charSequence, int i3, int i4, int i5, int i6) {
        this.f7678e = i3;
        this.f7679f = i4;
        this.f7680g = i5;
        this.f7681h = i6;
        a(charSequence, "", -1, -1);
    }
}

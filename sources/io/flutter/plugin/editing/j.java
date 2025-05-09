package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import h2.u;
import i2.i;
import j2.C0522d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class j implements u.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a, reason: collision with root package name */
    public final h2.u f7670a;

    /* renamed from: b, reason: collision with root package name */
    public final TextServicesManager f7671b;

    /* renamed from: c, reason: collision with root package name */
    public SpellCheckerSession f7672c;

    /* renamed from: d, reason: collision with root package name */
    public i.d f7673d;

    public j(TextServicesManager textServicesManager, h2.u uVar) {
        this.f7671b = textServicesManager;
        this.f7670a = uVar;
        uVar.b(this);
    }

    @Override // h2.u.b
    public void a(String str, String str2, i.d dVar) {
        if (this.f7673d != null) {
            dVar.a("error", "Previous spell check request still pending.", null);
        } else {
            this.f7673d = dVar;
            c(str, str2);
        }
    }

    public void b() {
        this.f7670a.b(null);
        SpellCheckerSession spellCheckerSession = this.f7672c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        Locale b3 = C0522d.b(str);
        if (this.f7672c == null) {
            this.f7672c = this.f7671b.newSpellCheckerSession(null, b3, this, true);
        }
        this.f7672c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f7673d.b(new ArrayList());
            this.f7673d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f7673d.b(new ArrayList());
            this.f7673d = null;
            return;
        }
        for (int i3 = 0; i3 < sentenceSuggestionsInfo.getSuggestionsCount(); i3++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i3);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i3);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i3) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z3 = false;
                for (int i4 = 0; i4 < suggestionsCount; i4++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i4);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z3 = true;
                    }
                }
                if (z3) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f7673d.b(arrayList);
        this.f7673d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}

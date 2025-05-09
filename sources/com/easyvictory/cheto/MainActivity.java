package com.easyvictory.cheto;

import Y1.AbstractActivityC0304i;
import android.content.Intent;
import android.os.Bundle;
import c1.AbstractC0382j;
import com.easyvictory.cheto.plugins.c;
import com.easyvictory.cheto.services.UIServices;
import io.flutter.embedding.engine.a;

/* loaded from: classes.dex */
public class MainActivity extends AbstractActivityC0304i {
    @Override // Y1.AbstractActivityC0304i, Y1.C0305j.c
    public void F(a aVar) {
        super.F(aVar);
        aVar.r().d(new c(this));
    }

    @Override // Y1.AbstractActivityC0304i, android.app.Activity
    public void onActivityResult(int i3, int i4, Intent intent) {
        super.onActivityResult(i3, i4, intent);
        if (i3 == 1) {
            Intent intent2 = new Intent(this, (Class<?>) UIServices.class);
            intent2.setAction(U2.a.a(-338977714414L));
            intent2.putExtra(UIServices.f4963j, i4);
            intent2.putExtra(UIServices.f4964k, intent);
            startService(intent2);
        }
    }

    @Override // Y1.AbstractActivityC0304i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC0382j.a(U2.a.a(-227308564718L));
    }
}

package n2;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619b implements InterfaceC0613D {
    @Override // n2.InterfaceC0613D
    public String a(List list) {
        C2.k.e(list, "list");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.flush();
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        C2.k.d(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    @Override // n2.InterfaceC0613D
    public List b(String str) {
        C2.k.e(str, "listString");
        Object readObject = new C0617H(new ByteArrayInputStream(Base64.decode(str, 0))).readObject();
        C2.k.c(readObject, "null cannot be cast to non-null type kotlin.collections.List<*>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) readObject) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}

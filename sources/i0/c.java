package I0;

import H0.g;
import H0.i;
import R0.j;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c {

    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(j jVar, j jVar2) {
            return ((Integer) jVar.a()).intValue() - ((Integer) jVar2.a()).intValue();
        }
    }

    public static List a(Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(j.c(Integer.valueOf(((i) entry.getKey()).g()), (byte[]) entry.getValue()));
        }
        Collections.sort(arrayList, new a());
        return arrayList;
    }

    public static Map b(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((Integer) entry.getKey(), g.e(a((Map) entry.getValue())));
        }
        return hashMap;
    }

    public static H0.b c(U0.c cVar, V0.b bVar, byte[] bArr, Map map, int i3, int i4) {
        H0.b bVar2 = new H0.b(0);
        d(g.g(cVar, bVar, 1845461005).f752a, bArr, map, i3, i4, bVar2);
        return bVar2;
    }

    public static void d(ByteBuffer byteBuffer, byte[] bArr, Map map, int i3, int i4, H0.b bVar) {
        H0.c cVar = new H0.c();
        bVar.f670c.add(cVar);
        try {
            b.e(g.i(byteBuffer), CertificateFactory.getInstance("X.509"), cVar, b(map), bArr, i3, i4);
            bVar.f669b = (bVar.a() || bVar.b()) ? false : true;
        } catch (G0.a | BufferUnderflowException unused) {
            cVar.b(20, new Object[0]);
        } catch (CertificateException e3) {
            throw new IllegalStateException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}

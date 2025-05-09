package c1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* renamed from: c1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0391s {

    /* renamed from: a, reason: collision with root package name */
    public static String f4759a = U2.a.a(-27766638866670L);

    /* renamed from: b, reason: collision with root package name */
    public static String f4760b = U2.a.a(-27955617427694L);

    /* renamed from: c, reason: collision with root package name */
    public static String f4761c = U2.a.a(-28144595988718L);

    /* renamed from: d, reason: collision with root package name */
    public static String f4762d = U2.a.a(-28372229255406L);

    /* renamed from: e, reason: collision with root package name */
    public static String f4763e = U2.a.a(-28642812195054L);

    /* renamed from: f, reason: collision with root package name */
    public static String f4764f = U2.a.a(-28896215265518L);

    /* renamed from: g, reason: collision with root package name */
    public static String f4765g = U2.a.a(-29179683107054L);

    /* renamed from: h, reason: collision with root package name */
    public static String f4766h = U2.a.a(-29403021406446L);

    /* renamed from: i, reason: collision with root package name */
    public static String f4767i = U2.a.a(-29579115065582L);

    public static String a(String str) {
        if (str.isEmpty()) {
            str = U2.a.a(-27238357889262L);
        }
        return U2.a.a(-27251242791150L) + str;
    }

    public static boolean b(String str) {
        try {
            Process exec = Runtime.getRuntime().exec(U2.a.a(-26997839720686L));
            DataOutputStream dataOutputStream = new DataOutputStream(exec.getOutputStream());
            dataOutputStream.writeBytes(str + U2.a.a(-27010724622574L));
            dataOutputStream.flush();
            dataOutputStream.writeBytes(U2.a.a(-27019314557166L));
            dataOutputStream.flush();
            boolean z3 = exec.waitFor() == 0;
            dataOutputStream.close();
            return z3;
        } catch (IOException | InterruptedException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static boolean c(List list) {
        try {
            Process exec = Runtime.getRuntime().exec(U2.a.a(-27045084360942L));
            DataOutputStream dataOutputStream = new DataOutputStream(exec.getOutputStream());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dataOutputStream.writeBytes(((String) it.next()) + U2.a.a(-27057969262830L));
                dataOutputStream.flush();
            }
            dataOutputStream.writeBytes(U2.a.a(-27066559197422L));
            dataOutputStream.flush();
            boolean z3 = exec.waitFor() == 0;
            dataOutputStream.close();
            return z3;
        } catch (IOException | InterruptedException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static void d() {
        b(U2.a.a(-27612020044014L));
    }

    public static String e(String str) {
        return U2.a.a(-27474581090542L) + str;
    }

    public static boolean f() {
        try {
            try {
                return Runtime.getRuntime().exec(U2.a.a(-26950595080430L)).waitFor() == 0;
            } catch (InterruptedException e3) {
                e3.printStackTrace();
                return false;
            }
        } catch (IOException e4) {
            AbstractC0382j.c(e4);
        }
    }
}

package c1;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: c1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0393u {
    public static int a(Context context) {
        return b(context).y;
    }

    public static Point b(Context context) {
        Point point = new Point(0, 0);
        try {
            ((WindowManager) context.getSystemService(U2.a.a(-29763798659310L))).getDefaultDisplay().getRealSize(point);
            return point;
        } catch (Throwable th) {
            AbstractC0382j.f(th);
            return point;
        }
    }

    public static Point c() {
        String readLine;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(U2.a.a(-29823928201454L)).getInputStream()));
            while (true) {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    readLine = null;
                    break;
                }
                if (readLine.contains(U2.a.a(-29858287939822L))) {
                    break;
                }
            }
            bufferedReader.close();
            if (readLine != null) {
                Matcher matcher = Pattern.compile(U2.a.a(-29918417481966L)).matcher(readLine);
                if (matcher.find()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null && group2 != null) {
                        return new Point(Integer.parseInt(group), Integer.parseInt(group2));
                    }
                }
            }
        } catch (Exception e3) {
            AbstractC0382j.c(e3);
        }
        return new Point(0, 0);
    }

    public static int d(Context context) {
        return b(context).x;
    }

    public static Point e(Context context) {
        Point point = new Point(0, 0);
        try {
            ((WindowManager) context.getSystemService(U2.a.a(-29733733888238L))).getDefaultDisplay().getSize(point);
            return point;
        } catch (Throwable th) {
            AbstractC0382j.f(th);
            return point;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        r5 = r5.getCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point f(android.content.Context r5) {
        /*
            android.graphics.Point r0 = new android.graphics.Point
            r1 = 0
            r0.<init>(r1, r1)
            r1 = -29793863430382(0xffffe4e7135a8f12, double:NaN)
            java.lang.String r1 = U2.a.a(r1)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r5.getSystemService(r1)     // Catch: java.lang.Throwable -> L46
            android.view.WindowManager r5 = (android.view.WindowManager) r5     // Catch: java.lang.Throwable -> L46
            android.view.Display r5 = r5.getDefaultDisplay()     // Catch: java.lang.Throwable -> L46
            android.graphics.Point r1 = new android.graphics.Point     // Catch: java.lang.Throwable -> L46
            r1.<init>()     // Catch: java.lang.Throwable -> L46
            r5.getRealSize(r1)     // Catch: java.lang.Throwable -> L46
            int r2 = r1.x     // Catch: java.lang.Throwable -> L46
            int r1 = r1.y     // Catch: java.lang.Throwable -> L46
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L46
            r4 = 29
            if (r3 < r4) goto L48
            android.view.DisplayCutout r5 = c1.AbstractC0392t.a(r5)     // Catch: java.lang.Throwable -> L46
            if (r5 == 0) goto L48
            int r3 = D0.i.a(r5)     // Catch: java.lang.Throwable -> L46
            int r4 = D0.k.a(r5)     // Catch: java.lang.Throwable -> L46
            int r3 = r3 + r4
            int r1 = r1 - r3
            int r3 = D0.j.a(r5)     // Catch: java.lang.Throwable -> L46
            int r5 = D0.l.a(r5)     // Catch: java.lang.Throwable -> L46
            int r3 = r3 + r5
            int r2 = r2 - r3
            goto L48
        L46:
            r5 = move-exception
            goto L4d
        L48:
            r0.x = r2     // Catch: java.lang.Throwable -> L46
            r0.y = r1     // Catch: java.lang.Throwable -> L46
            return r0
        L4d:
            c1.AbstractC0382j.f(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.AbstractC0393u.f(android.content.Context):android.graphics.Point");
    }
}

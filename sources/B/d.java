package B;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import y.AbstractC0770c;

/* loaded from: classes.dex */
public abstract class d {

    public static class a {
        public static int a(TypedArray typedArray, int i3) {
            return typedArray.getType(i3);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final C0001d[] f17a;

        public c(C0001d[] c0001dArr) {
            this.f17a = c0001dArr;
        }

        public C0001d[] a() {
            return this.f17a;
        }
    }

    /* renamed from: B.d$d, reason: collision with other inner class name */
    public static final class C0001d {

        /* renamed from: a, reason: collision with root package name */
        public final String f18a;

        /* renamed from: b, reason: collision with root package name */
        public final int f19b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f20c;

        /* renamed from: d, reason: collision with root package name */
        public final String f21d;

        /* renamed from: e, reason: collision with root package name */
        public final int f22e;

        /* renamed from: f, reason: collision with root package name */
        public final int f23f;

        public C0001d(String str, int i3, boolean z3, String str2, int i4, int i5) {
            this.f18a = str;
            this.f19b = i3;
            this.f20c = z3;
            this.f21d = str2;
            this.f22e = i4;
            this.f23f = i5;
        }

        public String a() {
            return this.f18a;
        }

        public int b() {
            return this.f23f;
        }

        public int c() {
            return this.f22e;
        }

        public String d() {
            return this.f21d;
        }

        public int e() {
            return this.f19b;
        }

        public boolean f() {
            return this.f20c;
        }
    }

    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final H.e f24a;

        /* renamed from: b, reason: collision with root package name */
        public final int f25b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26c;

        /* renamed from: d, reason: collision with root package name */
        public final String f27d;

        public e(H.e eVar, int i3, int i4, String str) {
            this.f24a = eVar;
            this.f26c = i3;
            this.f25b = i4;
            this.f27d = str;
        }

        public int a() {
            return this.f26c;
        }

        public H.e b() {
            return this.f24a;
        }

        public String c() {
            return this.f27d;
        }

        public int d() {
            return this.f25b;
        }
    }

    public static int a(TypedArray typedArray, int i3) {
        return a.a(typedArray, i3);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i3) {
        if (i3 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i3);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                    int resourceId = obtainTypedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i3)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0770c.f10164h);
        String string = obtainAttributes.getString(AbstractC0770c.f10165i);
        String string2 = obtainAttributes.getString(AbstractC0770c.f10169m);
        String string3 = obtainAttributes.getString(AbstractC0770c.f10170n);
        int resourceId = obtainAttributes.getResourceId(AbstractC0770c.f10166j, 0);
        int integer = obtainAttributes.getInteger(AbstractC0770c.f10167k, 1);
        int integer2 = obtainAttributes.getInteger(AbstractC0770c.f10168l, 500);
        String string4 = obtainAttributes.getString(AbstractC0770c.f10171o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new e(new H.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((C0001d[]) arrayList.toArray(new C0001d[0]));
    }

    public static C0001d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0770c.f10172p);
        int i3 = AbstractC0770c.f10181y;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = AbstractC0770c.f10174r;
        }
        int i4 = obtainAttributes.getInt(i3, 400);
        int i5 = AbstractC0770c.f10179w;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = AbstractC0770c.f10175s;
        }
        boolean z3 = 1 == obtainAttributes.getInt(i5, 0);
        int i6 = AbstractC0770c.f10182z;
        if (!obtainAttributes.hasValue(i6)) {
            i6 = AbstractC0770c.f10176t;
        }
        int i7 = AbstractC0770c.f10180x;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = AbstractC0770c.f10177u;
        }
        String string = obtainAttributes.getString(i7);
        int i8 = obtainAttributes.getInt(i6, 0);
        int i9 = AbstractC0770c.f10178v;
        if (!obtainAttributes.hasValue(i9)) {
            i9 = AbstractC0770c.f10173q;
        }
        int resourceId = obtainAttributes.getResourceId(i9, 0);
        String string2 = obtainAttributes.getString(i9);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0001d(string2, i4, z3, string, i8, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) {
        int i3 = 1;
        while (i3 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i3++;
            } else if (next == 3) {
                i3--;
            }
        }
    }

    public static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}

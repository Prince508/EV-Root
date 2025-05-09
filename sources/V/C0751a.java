package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0751a {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f9652a;

    /* renamed from: b, reason: collision with root package name */
    public int f9653b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f9654c = -1;

    /* renamed from: d, reason: collision with root package name */
    public SparseArray f9655d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public SparseArray f9656e = new SparseArray();

    /* renamed from: v.a$a, reason: collision with other inner class name */
    public static class C0160a {

        /* renamed from: a, reason: collision with root package name */
        public int f9657a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f9658b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public int f9659c;

        /* renamed from: d, reason: collision with root package name */
        public androidx.constraintlayout.widget.d f9660d;

        public C0160a(Context context, XmlPullParser xmlPullParser) {
            this.f9659c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0754d.R4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0754d.S4) {
                    this.f9657a = obtainStyledAttributes.getResourceId(index, this.f9657a);
                } else if (index == AbstractC0754d.T4) {
                    this.f9659c = obtainStyledAttributes.getResourceId(index, this.f9659c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f9659c);
                    context.getResources().getResourceName(this.f9659c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        this.f9660d = dVar;
                        dVar.e(context, this.f9659c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f9658b.add(bVar);
        }
    }

    /* renamed from: v.a$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public float f9661a;

        /* renamed from: b, reason: collision with root package name */
        public float f9662b;

        /* renamed from: c, reason: collision with root package name */
        public float f9663c;

        /* renamed from: d, reason: collision with root package name */
        public float f9664d;

        /* renamed from: e, reason: collision with root package name */
        public int f9665e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.constraintlayout.widget.d f9666f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f9661a = Float.NaN;
            this.f9662b = Float.NaN;
            this.f9663c = Float.NaN;
            this.f9664d = Float.NaN;
            this.f9665e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0754d.n5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0754d.o5) {
                    this.f9665e = obtainStyledAttributes.getResourceId(index, this.f9665e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f9665e);
                    context.getResources().getResourceName(this.f9665e);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        this.f9666f = dVar;
                        dVar.e(context, this.f9665e);
                    }
                } else if (index == AbstractC0754d.p5) {
                    this.f9664d = obtainStyledAttributes.getDimension(index, this.f9664d);
                } else if (index == AbstractC0754d.q5) {
                    this.f9662b = obtainStyledAttributes.getDimension(index, this.f9662b);
                } else if (index == AbstractC0754d.r5) {
                    this.f9663c = obtainStyledAttributes.getDimension(index, this.f9663c);
                } else if (index == AbstractC0754d.s5) {
                    this.f9661a = obtainStyledAttributes.getDimension(index, this.f9661a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public C0751a(Context context, ConstraintLayout constraintLayout, int i3) {
        this.f9652a = constraintLayout;
        a(context, i3);
    }

    public final void a(Context context, int i3) {
        char c3;
        XmlResourceParser xml = context.getResources().getXml(i3);
        try {
            C0160a c0160a = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c3 = 4;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c3 = 2;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c3 = 1;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c3 = 0;
                                break;
                            }
                            c3 = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c3 = 3;
                                break;
                            }
                            c3 = 65535;
                            break;
                        default:
                            c3 = 65535;
                            break;
                    }
                    if (c3 != 0 && c3 != 1) {
                        if (c3 == 2) {
                            c0160a = new C0160a(context, xml);
                            this.f9655d.put(c0160a.f9657a, c0160a);
                        } else if (c3 == 3) {
                            b bVar = new b(context, xml);
                            if (c0160a != null) {
                                c0160a.a(bVar);
                            }
                        } else if (c3 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            b(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }

    public final void b(Context context, XmlPullParser xmlPullParser) {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i3 = 0; i3 < attributeCount; i3++) {
            if ("id".equals(xmlPullParser.getAttributeName(i3))) {
                String attributeValue = xmlPullParser.getAttributeValue(i3);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.l(context, xmlPullParser);
                this.f9656e.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(AbstractC0752b abstractC0752b) {
    }
}

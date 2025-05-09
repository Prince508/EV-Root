package j;

import K.AbstractC0216v;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d.i;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.AbstractC0537C;
import l.C0552S;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0514d extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f7936e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f7937f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f7938a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f7939b;

    /* renamed from: c, reason: collision with root package name */
    public Context f7940c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7941d;

    /* renamed from: j.d$a */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public static final Class[] f7942c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        public Object f7943a;

        /* renamed from: b, reason: collision with root package name */
        public Method f7944b;

        public a(Object obj, String str) {
            this.f7943a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f7944b = cls.getMethod(str, f7942c);
            } catch (Exception e3) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e3);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f7944b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f7944b.invoke(this.f7943a, menuItem)).booleanValue();
                }
                this.f7944b.invoke(this.f7943a, menuItem);
                return true;
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    /* renamed from: j.d$b */
    public class b {

        /* renamed from: A, reason: collision with root package name */
        public CharSequence f7945A;

        /* renamed from: B, reason: collision with root package name */
        public CharSequence f7946B;

        /* renamed from: C, reason: collision with root package name */
        public ColorStateList f7947C = null;

        /* renamed from: D, reason: collision with root package name */
        public PorterDuff.Mode f7948D = null;

        /* renamed from: a, reason: collision with root package name */
        public Menu f7950a;

        /* renamed from: b, reason: collision with root package name */
        public int f7951b;

        /* renamed from: c, reason: collision with root package name */
        public int f7952c;

        /* renamed from: d, reason: collision with root package name */
        public int f7953d;

        /* renamed from: e, reason: collision with root package name */
        public int f7954e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f7955f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f7956g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f7957h;

        /* renamed from: i, reason: collision with root package name */
        public int f7958i;

        /* renamed from: j, reason: collision with root package name */
        public int f7959j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f7960k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f7961l;

        /* renamed from: m, reason: collision with root package name */
        public int f7962m;

        /* renamed from: n, reason: collision with root package name */
        public char f7963n;

        /* renamed from: o, reason: collision with root package name */
        public int f7964o;

        /* renamed from: p, reason: collision with root package name */
        public char f7965p;

        /* renamed from: q, reason: collision with root package name */
        public int f7966q;

        /* renamed from: r, reason: collision with root package name */
        public int f7967r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f7968s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f7969t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f7970u;

        /* renamed from: v, reason: collision with root package name */
        public int f7971v;

        /* renamed from: w, reason: collision with root package name */
        public int f7972w;

        /* renamed from: x, reason: collision with root package name */
        public String f7973x;

        /* renamed from: y, reason: collision with root package name */
        public String f7974y;

        /* renamed from: z, reason: collision with root package name */
        public String f7975z;

        public b(Menu menu) {
            this.f7950a = menu;
            h();
        }

        public void a() {
            this.f7957h = true;
            i(this.f7950a.add(this.f7951b, this.f7958i, this.f7959j, this.f7960k));
        }

        public SubMenu b() {
            this.f7957h = true;
            SubMenu addSubMenu = this.f7950a.addSubMenu(this.f7951b, this.f7958i, this.f7959j, this.f7960k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f7957h;
        }

        public final Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0514d.this.f7940c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e3) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e3);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0514d.this.f7940c.obtainStyledAttributes(attributeSet, i.f6193J0);
            this.f7951b = obtainStyledAttributes.getResourceId(i.f6201L0, 0);
            this.f7952c = obtainStyledAttributes.getInt(i.f6209N0, 0);
            this.f7953d = obtainStyledAttributes.getInt(i.f6213O0, 0);
            this.f7954e = obtainStyledAttributes.getInt(i.f6217P0, 0);
            this.f7955f = obtainStyledAttributes.getBoolean(i.f6205M0, true);
            this.f7956g = obtainStyledAttributes.getBoolean(i.f6197K0, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            C0552S s3 = C0552S.s(C0514d.this.f7940c, attributeSet, i.f6221Q0);
            this.f7958i = s3.m(i.f6233T0, 0);
            this.f7959j = (s3.j(i.f6244W0, this.f7952c) & (-65536)) | (s3.j(i.f6247X0, this.f7953d) & 65535);
            this.f7960k = s3.o(i.f6250Y0);
            this.f7961l = s3.o(i.f6253Z0);
            this.f7962m = s3.m(i.f6225R0, 0);
            this.f7963n = c(s3.n(i.f6257a1));
            this.f7964o = s3.j(i.f6285h1, 4096);
            this.f7965p = c(s3.n(i.f6261b1));
            this.f7966q = s3.j(i.f6301l1, 4096);
            int i3 = i.f6265c1;
            if (s3.q(i3)) {
                this.f7967r = s3.a(i3, false) ? 1 : 0;
            } else {
                this.f7967r = this.f7954e;
            }
            this.f7968s = s3.a(i.f6237U0, false);
            this.f7969t = s3.a(i.f6241V0, this.f7955f);
            this.f7970u = s3.a(i.f6229S0, this.f7956g);
            this.f7971v = s3.j(i.f6305m1, -1);
            this.f7975z = s3.n(i.f6269d1);
            this.f7972w = s3.m(i.f6273e1, 0);
            this.f7973x = s3.n(i.f6281g1);
            String n3 = s3.n(i.f6277f1);
            this.f7974y = n3;
            boolean z3 = n3 != null;
            if (z3 && this.f7972w == 0 && this.f7973x == null) {
                AbstractC0515e.a(e(n3, C0514d.f7937f, C0514d.this.f7939b));
            } else if (z3) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
            }
            this.f7945A = s3.o(i.f6289i1);
            this.f7946B = s3.o(i.f6309n1);
            int i4 = i.f6297k1;
            if (s3.q(i4)) {
                this.f7948D = AbstractC0537C.e(s3.j(i4, -1), this.f7948D);
            } else {
                this.f7948D = null;
            }
            int i5 = i.f6293j1;
            if (s3.q(i5)) {
                this.f7947C = s3.c(i5);
            } else {
                this.f7947C = null;
            }
            s3.u();
            this.f7957h = false;
        }

        public void h() {
            this.f7951b = 0;
            this.f7952c = 0;
            this.f7953d = 0;
            this.f7954e = 0;
            this.f7955f = true;
            this.f7956g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z3 = false;
            menuItem.setChecked(this.f7968s).setVisible(this.f7969t).setEnabled(this.f7970u).setCheckable(this.f7967r >= 1).setTitleCondensed(this.f7961l).setIcon(this.f7962m);
            int i3 = this.f7971v;
            if (i3 >= 0) {
                menuItem.setShowAsAction(i3);
            }
            if (this.f7975z != null) {
                if (C0514d.this.f7940c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(C0514d.this.b(), this.f7975z));
            }
            if (this.f7967r >= 2 && (menuItem instanceof androidx.appcompat.view.menu.e)) {
                ((androidx.appcompat.view.menu.e) menuItem).s(true);
            }
            String str = this.f7973x;
            if (str != null) {
                menuItem.setActionView((View) e(str, C0514d.f7936e, C0514d.this.f7938a));
                z3 = true;
            }
            int i4 = this.f7972w;
            if (i4 > 0) {
                if (z3) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i4);
                }
            }
            AbstractC0216v.b(menuItem, this.f7945A);
            AbstractC0216v.f(menuItem, this.f7946B);
            AbstractC0216v.a(menuItem, this.f7963n, this.f7964o);
            AbstractC0216v.e(menuItem, this.f7965p, this.f7966q);
            PorterDuff.Mode mode = this.f7948D;
            if (mode != null) {
                AbstractC0216v.d(menuItem, mode);
            }
            ColorStateList colorStateList = this.f7947C;
            if (colorStateList != null) {
                AbstractC0216v.c(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f7936e = clsArr;
        f7937f = clsArr;
    }

    public C0514d(Context context) {
        super(context);
        this.f7940c = context;
        Object[] objArr = {context};
        this.f7938a = objArr;
        this.f7939b = objArr;
    }

    public final Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f7941d == null) {
            this.f7941d = a(this.f7940c);
        }
        return this.f7941d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (r15 == 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r15 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r15.equals(r8) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r15.equals("group") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r15.equals("item") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
    
        if (r0.d() != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r15.equals("menu") == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007e, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        if (r7 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        if (r15.equals("group") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
    
        if (r15.equals("item") == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
    
        if (r15.equals("menu") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:
    
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003b, code lost:
    
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r6 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0042, code lost:
    
        if (r15 == 1) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            j.d$b r0 = new j.d$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L40:
            if (r6 != 0) goto Lb8
            if (r15 == r3) goto Lb0
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L80
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lab
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r7 = r4
            r8 = r5
            goto Lab
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lab
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L78
            boolean r15 = r0.d()
            if (r15 != 0) goto Lab
            r0.a()
            goto Lab
        L78:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lab
            r6 = r3
            goto Lab
        L80:
            if (r7 == 0) goto L83
            goto Lab
        L83:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L91
            r0.f(r14)
            goto Lab
        L91:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L9b
            r0.g(r14)
            goto Lab
        L9b:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto La9
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lab
        La9:
            r8 = r15
            r7 = r3
        Lab:
            int r15 = r13.next()
            goto L40
        Lb0:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0514d.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    @Override // android.view.MenuInflater
    public void inflate(int i3, Menu menu) {
        if (!(menu instanceof E.a)) {
            super.inflate(i3, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f7940c.getResources().getLayout(i3);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (XmlPullParserException e3) {
                    throw new InflateException("Error inflating menu XML", e3);
                }
            } catch (IOException e4) {
                throw new InflateException("Error inflating menu XML", e4);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}

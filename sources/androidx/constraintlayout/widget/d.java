package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import q.C0669a;
import r.AbstractC0674a;
import v.AbstractC0753c;
import v.AbstractC0754d;

/* loaded from: classes.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3342d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static SparseIntArray f3343e;

    /* renamed from: a, reason: collision with root package name */
    public HashMap f3344a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public boolean f3345b = true;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f3346c = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f3347a;

        /* renamed from: b, reason: collision with root package name */
        public final C0080d f3348b = new C0080d();

        /* renamed from: c, reason: collision with root package name */
        public final c f3349c = new c();

        /* renamed from: d, reason: collision with root package name */
        public final b f3350d = new b();

        /* renamed from: e, reason: collision with root package name */
        public final e f3351e = new e();

        /* renamed from: f, reason: collision with root package name */
        public HashMap f3352f = new HashMap();

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f3350d;
            bVar.f3271d = bVar2.f3394h;
            bVar.f3273e = bVar2.f3396i;
            bVar.f3275f = bVar2.f3398j;
            bVar.f3277g = bVar2.f3400k;
            bVar.f3279h = bVar2.f3401l;
            bVar.f3281i = bVar2.f3402m;
            bVar.f3283j = bVar2.f3403n;
            bVar.f3285k = bVar2.f3404o;
            bVar.f3287l = bVar2.f3405p;
            bVar.f3295p = bVar2.f3406q;
            bVar.f3296q = bVar2.f3407r;
            bVar.f3297r = bVar2.f3408s;
            bVar.f3298s = bVar2.f3409t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f3357D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f3358E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f3359F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f3360G;
            bVar.f3303x = bVar2.f3368O;
            bVar.f3304y = bVar2.f3367N;
            bVar.f3300u = bVar2.f3364K;
            bVar.f3302w = bVar2.f3366M;
            bVar.f3305z = bVar2.f3410u;
            bVar.f3239A = bVar2.f3411v;
            bVar.f3289m = bVar2.f3413x;
            bVar.f3291n = bVar2.f3414y;
            bVar.f3293o = bVar2.f3415z;
            bVar.f3240B = bVar2.f3412w;
            bVar.f3255Q = bVar2.f3354A;
            bVar.f3256R = bVar2.f3355B;
            bVar.f3244F = bVar2.f3369P;
            bVar.f3243E = bVar2.f3370Q;
            bVar.f3246H = bVar2.f3372S;
            bVar.f3245G = bVar2.f3371R;
            bVar.f3258T = bVar2.f3395h0;
            bVar.f3259U = bVar2.f3397i0;
            bVar.f3247I = bVar2.f3373T;
            bVar.f3248J = bVar2.f3374U;
            bVar.f3251M = bVar2.f3375V;
            bVar.f3252N = bVar2.f3376W;
            bVar.f3249K = bVar2.f3377X;
            bVar.f3250L = bVar2.f3378Y;
            bVar.f3253O = bVar2.f3379Z;
            bVar.f3254P = bVar2.f3381a0;
            bVar.f3257S = bVar2.f3356C;
            bVar.f3269c = bVar2.f3392g;
            bVar.f3265a = bVar2.f3388e;
            bVar.f3267b = bVar2.f3390f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f3384c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f3386d;
            String str = bVar2.f3393g0;
            if (str != null) {
                bVar.f3260V = str;
            }
            bVar.setMarginStart(bVar2.f3362I);
            bVar.setMarginEnd(this.f3350d.f3361H);
            bVar.a();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f3350d.a(this.f3350d);
            aVar.f3349c.a(this.f3349c);
            aVar.f3348b.a(this.f3348b);
            aVar.f3351e.a(this.f3351e);
            aVar.f3347a = this.f3347a;
            return aVar;
        }

        public final void d(int i3, ConstraintLayout.b bVar) {
            this.f3347a = i3;
            b bVar2 = this.f3350d;
            bVar2.f3394h = bVar.f3271d;
            bVar2.f3396i = bVar.f3273e;
            bVar2.f3398j = bVar.f3275f;
            bVar2.f3400k = bVar.f3277g;
            bVar2.f3401l = bVar.f3279h;
            bVar2.f3402m = bVar.f3281i;
            bVar2.f3403n = bVar.f3283j;
            bVar2.f3404o = bVar.f3285k;
            bVar2.f3405p = bVar.f3287l;
            bVar2.f3406q = bVar.f3295p;
            bVar2.f3407r = bVar.f3296q;
            bVar2.f3408s = bVar.f3297r;
            bVar2.f3409t = bVar.f3298s;
            bVar2.f3410u = bVar.f3305z;
            bVar2.f3411v = bVar.f3239A;
            bVar2.f3412w = bVar.f3240B;
            bVar2.f3413x = bVar.f3289m;
            bVar2.f3414y = bVar.f3291n;
            bVar2.f3415z = bVar.f3293o;
            bVar2.f3354A = bVar.f3255Q;
            bVar2.f3355B = bVar.f3256R;
            bVar2.f3356C = bVar.f3257S;
            bVar2.f3392g = bVar.f3269c;
            bVar2.f3388e = bVar.f3265a;
            bVar2.f3390f = bVar.f3267b;
            bVar2.f3384c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f3386d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f3357D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f3358E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f3359F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f3360G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f3369P = bVar.f3244F;
            bVar2.f3370Q = bVar.f3243E;
            bVar2.f3372S = bVar.f3246H;
            bVar2.f3371R = bVar.f3245G;
            bVar2.f3395h0 = bVar.f3258T;
            bVar2.f3397i0 = bVar.f3259U;
            bVar2.f3373T = bVar.f3247I;
            bVar2.f3374U = bVar.f3248J;
            bVar2.f3375V = bVar.f3251M;
            bVar2.f3376W = bVar.f3252N;
            bVar2.f3377X = bVar.f3249K;
            bVar2.f3378Y = bVar.f3250L;
            bVar2.f3379Z = bVar.f3253O;
            bVar2.f3381a0 = bVar.f3254P;
            bVar2.f3393g0 = bVar.f3260V;
            bVar2.f3364K = bVar.f3300u;
            bVar2.f3366M = bVar.f3302w;
            bVar2.f3363J = bVar.f3299t;
            bVar2.f3365L = bVar.f3301v;
            bVar2.f3368O = bVar.f3303x;
            bVar2.f3367N = bVar.f3304y;
            bVar2.f3361H = bVar.getMarginEnd();
            this.f3350d.f3362I = bVar.getMarginStart();
        }
    }

    public static class b {

        /* renamed from: k0, reason: collision with root package name */
        public static SparseIntArray f3353k0;

        /* renamed from: c, reason: collision with root package name */
        public int f3384c;

        /* renamed from: d, reason: collision with root package name */
        public int f3386d;

        /* renamed from: e0, reason: collision with root package name */
        public int[] f3389e0;

        /* renamed from: f0, reason: collision with root package name */
        public String f3391f0;

        /* renamed from: g0, reason: collision with root package name */
        public String f3393g0;

        /* renamed from: a, reason: collision with root package name */
        public boolean f3380a = false;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3382b = false;

        /* renamed from: e, reason: collision with root package name */
        public int f3388e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f3390f = -1;

        /* renamed from: g, reason: collision with root package name */
        public float f3392g = -1.0f;

        /* renamed from: h, reason: collision with root package name */
        public int f3394h = -1;

        /* renamed from: i, reason: collision with root package name */
        public int f3396i = -1;

        /* renamed from: j, reason: collision with root package name */
        public int f3398j = -1;

        /* renamed from: k, reason: collision with root package name */
        public int f3400k = -1;

        /* renamed from: l, reason: collision with root package name */
        public int f3401l = -1;

        /* renamed from: m, reason: collision with root package name */
        public int f3402m = -1;

        /* renamed from: n, reason: collision with root package name */
        public int f3403n = -1;

        /* renamed from: o, reason: collision with root package name */
        public int f3404o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f3405p = -1;

        /* renamed from: q, reason: collision with root package name */
        public int f3406q = -1;

        /* renamed from: r, reason: collision with root package name */
        public int f3407r = -1;

        /* renamed from: s, reason: collision with root package name */
        public int f3408s = -1;

        /* renamed from: t, reason: collision with root package name */
        public int f3409t = -1;

        /* renamed from: u, reason: collision with root package name */
        public float f3410u = 0.5f;

        /* renamed from: v, reason: collision with root package name */
        public float f3411v = 0.5f;

        /* renamed from: w, reason: collision with root package name */
        public String f3412w = null;

        /* renamed from: x, reason: collision with root package name */
        public int f3413x = -1;

        /* renamed from: y, reason: collision with root package name */
        public int f3414y = 0;

        /* renamed from: z, reason: collision with root package name */
        public float f3415z = 0.0f;

        /* renamed from: A, reason: collision with root package name */
        public int f3354A = -1;

        /* renamed from: B, reason: collision with root package name */
        public int f3355B = -1;

        /* renamed from: C, reason: collision with root package name */
        public int f3356C = -1;

        /* renamed from: D, reason: collision with root package name */
        public int f3357D = -1;

        /* renamed from: E, reason: collision with root package name */
        public int f3358E = -1;

        /* renamed from: F, reason: collision with root package name */
        public int f3359F = -1;

        /* renamed from: G, reason: collision with root package name */
        public int f3360G = -1;

        /* renamed from: H, reason: collision with root package name */
        public int f3361H = -1;

        /* renamed from: I, reason: collision with root package name */
        public int f3362I = -1;

        /* renamed from: J, reason: collision with root package name */
        public int f3363J = -1;

        /* renamed from: K, reason: collision with root package name */
        public int f3364K = -1;

        /* renamed from: L, reason: collision with root package name */
        public int f3365L = -1;

        /* renamed from: M, reason: collision with root package name */
        public int f3366M = -1;

        /* renamed from: N, reason: collision with root package name */
        public int f3367N = -1;

        /* renamed from: O, reason: collision with root package name */
        public int f3368O = -1;

        /* renamed from: P, reason: collision with root package name */
        public float f3369P = -1.0f;

        /* renamed from: Q, reason: collision with root package name */
        public float f3370Q = -1.0f;

        /* renamed from: R, reason: collision with root package name */
        public int f3371R = 0;

        /* renamed from: S, reason: collision with root package name */
        public int f3372S = 0;

        /* renamed from: T, reason: collision with root package name */
        public int f3373T = 0;

        /* renamed from: U, reason: collision with root package name */
        public int f3374U = 0;

        /* renamed from: V, reason: collision with root package name */
        public int f3375V = -1;

        /* renamed from: W, reason: collision with root package name */
        public int f3376W = -1;

        /* renamed from: X, reason: collision with root package name */
        public int f3377X = -1;

        /* renamed from: Y, reason: collision with root package name */
        public int f3378Y = -1;

        /* renamed from: Z, reason: collision with root package name */
        public float f3379Z = 1.0f;

        /* renamed from: a0, reason: collision with root package name */
        public float f3381a0 = 1.0f;

        /* renamed from: b0, reason: collision with root package name */
        public int f3383b0 = -1;

        /* renamed from: c0, reason: collision with root package name */
        public int f3385c0 = 0;

        /* renamed from: d0, reason: collision with root package name */
        public int f3387d0 = -1;

        /* renamed from: h0, reason: collision with root package name */
        public boolean f3395h0 = false;

        /* renamed from: i0, reason: collision with root package name */
        public boolean f3397i0 = false;

        /* renamed from: j0, reason: collision with root package name */
        public boolean f3399j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3353k0 = sparseIntArray;
            sparseIntArray.append(AbstractC0754d.R3, 24);
            f3353k0.append(AbstractC0754d.S3, 25);
            f3353k0.append(AbstractC0754d.U3, 28);
            f3353k0.append(AbstractC0754d.V3, 29);
            f3353k0.append(AbstractC0754d.a4, 35);
            f3353k0.append(AbstractC0754d.Z3, 34);
            f3353k0.append(AbstractC0754d.C3, 4);
            f3353k0.append(AbstractC0754d.B3, 3);
            f3353k0.append(AbstractC0754d.z3, 1);
            f3353k0.append(AbstractC0754d.f4, 6);
            f3353k0.append(AbstractC0754d.g4, 7);
            f3353k0.append(AbstractC0754d.J3, 17);
            f3353k0.append(AbstractC0754d.K3, 18);
            f3353k0.append(AbstractC0754d.L3, 19);
            f3353k0.append(AbstractC0754d.k3, 26);
            f3353k0.append(AbstractC0754d.W3, 31);
            f3353k0.append(AbstractC0754d.X3, 32);
            f3353k0.append(AbstractC0754d.I3, 10);
            f3353k0.append(AbstractC0754d.H3, 9);
            f3353k0.append(AbstractC0754d.j4, 13);
            f3353k0.append(AbstractC0754d.m4, 16);
            f3353k0.append(AbstractC0754d.k4, 14);
            f3353k0.append(AbstractC0754d.h4, 11);
            f3353k0.append(AbstractC0754d.l4, 15);
            f3353k0.append(AbstractC0754d.i4, 12);
            f3353k0.append(AbstractC0754d.d4, 38);
            f3353k0.append(AbstractC0754d.P3, 37);
            f3353k0.append(AbstractC0754d.O3, 39);
            f3353k0.append(AbstractC0754d.c4, 40);
            f3353k0.append(AbstractC0754d.N3, 20);
            f3353k0.append(AbstractC0754d.b4, 36);
            f3353k0.append(AbstractC0754d.G3, 5);
            f3353k0.append(AbstractC0754d.Q3, 76);
            f3353k0.append(AbstractC0754d.Y3, 76);
            f3353k0.append(AbstractC0754d.T3, 76);
            f3353k0.append(AbstractC0754d.A3, 76);
            f3353k0.append(AbstractC0754d.y3, 76);
            f3353k0.append(AbstractC0754d.n3, 23);
            f3353k0.append(AbstractC0754d.p3, 27);
            f3353k0.append(AbstractC0754d.r3, 30);
            f3353k0.append(AbstractC0754d.s3, 8);
            f3353k0.append(AbstractC0754d.o3, 33);
            f3353k0.append(AbstractC0754d.q3, 2);
            f3353k0.append(AbstractC0754d.l3, 22);
            f3353k0.append(AbstractC0754d.m3, 21);
            f3353k0.append(AbstractC0754d.D3, 61);
            f3353k0.append(AbstractC0754d.F3, 62);
            f3353k0.append(AbstractC0754d.E3, 63);
            f3353k0.append(AbstractC0754d.e4, 69);
            f3353k0.append(AbstractC0754d.M3, 70);
            f3353k0.append(AbstractC0754d.w3, 71);
            f3353k0.append(AbstractC0754d.u3, 72);
            f3353k0.append(AbstractC0754d.v3, 73);
            f3353k0.append(AbstractC0754d.x3, 74);
            f3353k0.append(AbstractC0754d.t3, 75);
        }

        public void a(b bVar) {
            this.f3380a = bVar.f3380a;
            this.f3384c = bVar.f3384c;
            this.f3382b = bVar.f3382b;
            this.f3386d = bVar.f3386d;
            this.f3388e = bVar.f3388e;
            this.f3390f = bVar.f3390f;
            this.f3392g = bVar.f3392g;
            this.f3394h = bVar.f3394h;
            this.f3396i = bVar.f3396i;
            this.f3398j = bVar.f3398j;
            this.f3400k = bVar.f3400k;
            this.f3401l = bVar.f3401l;
            this.f3402m = bVar.f3402m;
            this.f3403n = bVar.f3403n;
            this.f3404o = bVar.f3404o;
            this.f3405p = bVar.f3405p;
            this.f3406q = bVar.f3406q;
            this.f3407r = bVar.f3407r;
            this.f3408s = bVar.f3408s;
            this.f3409t = bVar.f3409t;
            this.f3410u = bVar.f3410u;
            this.f3411v = bVar.f3411v;
            this.f3412w = bVar.f3412w;
            this.f3413x = bVar.f3413x;
            this.f3414y = bVar.f3414y;
            this.f3415z = bVar.f3415z;
            this.f3354A = bVar.f3354A;
            this.f3355B = bVar.f3355B;
            this.f3356C = bVar.f3356C;
            this.f3357D = bVar.f3357D;
            this.f3358E = bVar.f3358E;
            this.f3359F = bVar.f3359F;
            this.f3360G = bVar.f3360G;
            this.f3361H = bVar.f3361H;
            this.f3362I = bVar.f3362I;
            this.f3363J = bVar.f3363J;
            this.f3364K = bVar.f3364K;
            this.f3365L = bVar.f3365L;
            this.f3366M = bVar.f3366M;
            this.f3367N = bVar.f3367N;
            this.f3368O = bVar.f3368O;
            this.f3369P = bVar.f3369P;
            this.f3370Q = bVar.f3370Q;
            this.f3371R = bVar.f3371R;
            this.f3372S = bVar.f3372S;
            this.f3373T = bVar.f3373T;
            this.f3374U = bVar.f3374U;
            this.f3375V = bVar.f3375V;
            this.f3376W = bVar.f3376W;
            this.f3377X = bVar.f3377X;
            this.f3378Y = bVar.f3378Y;
            this.f3379Z = bVar.f3379Z;
            this.f3381a0 = bVar.f3381a0;
            this.f3383b0 = bVar.f3383b0;
            this.f3385c0 = bVar.f3385c0;
            this.f3387d0 = bVar.f3387d0;
            this.f3393g0 = bVar.f3393g0;
            int[] iArr = bVar.f3389e0;
            if (iArr != null) {
                this.f3389e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f3389e0 = null;
            }
            this.f3391f0 = bVar.f3391f0;
            this.f3395h0 = bVar.f3395h0;
            this.f3397i0 = bVar.f3397i0;
            this.f3399j0 = bVar.f3399j0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0754d.j3);
            this.f3382b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = f3353k0.get(index);
                if (i4 == 80) {
                    this.f3395h0 = obtainStyledAttributes.getBoolean(index, this.f3395h0);
                } else if (i4 != 81) {
                    switch (i4) {
                        case 1:
                            this.f3405p = d.m(obtainStyledAttributes, index, this.f3405p);
                            break;
                        case 2:
                            this.f3360G = obtainStyledAttributes.getDimensionPixelSize(index, this.f3360G);
                            break;
                        case 3:
                            this.f3404o = d.m(obtainStyledAttributes, index, this.f3404o);
                            break;
                        case 4:
                            this.f3403n = d.m(obtainStyledAttributes, index, this.f3403n);
                            break;
                        case 5:
                            this.f3412w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f3354A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3354A);
                            break;
                        case 7:
                            this.f3355B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3355B);
                            break;
                        case 8:
                            this.f3361H = obtainStyledAttributes.getDimensionPixelSize(index, this.f3361H);
                            break;
                        case 9:
                            this.f3409t = d.m(obtainStyledAttributes, index, this.f3409t);
                            break;
                        case 10:
                            this.f3408s = d.m(obtainStyledAttributes, index, this.f3408s);
                            break;
                        case 11:
                            this.f3366M = obtainStyledAttributes.getDimensionPixelSize(index, this.f3366M);
                            break;
                        case 12:
                            this.f3367N = obtainStyledAttributes.getDimensionPixelSize(index, this.f3367N);
                            break;
                        case 13:
                            this.f3363J = obtainStyledAttributes.getDimensionPixelSize(index, this.f3363J);
                            break;
                        case 14:
                            this.f3365L = obtainStyledAttributes.getDimensionPixelSize(index, this.f3365L);
                            break;
                        case 15:
                            this.f3368O = obtainStyledAttributes.getDimensionPixelSize(index, this.f3368O);
                            break;
                        case 16:
                            this.f3364K = obtainStyledAttributes.getDimensionPixelSize(index, this.f3364K);
                            break;
                        case 17:
                            this.f3388e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3388e);
                            break;
                        case 18:
                            this.f3390f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3390f);
                            break;
                        case 19:
                            this.f3392g = obtainStyledAttributes.getFloat(index, this.f3392g);
                            break;
                        case 20:
                            this.f3410u = obtainStyledAttributes.getFloat(index, this.f3410u);
                            break;
                        case 21:
                            this.f3386d = obtainStyledAttributes.getLayoutDimension(index, this.f3386d);
                            break;
                        case 22:
                            this.f3384c = obtainStyledAttributes.getLayoutDimension(index, this.f3384c);
                            break;
                        case 23:
                            this.f3357D = obtainStyledAttributes.getDimensionPixelSize(index, this.f3357D);
                            break;
                        case 24:
                            this.f3394h = d.m(obtainStyledAttributes, index, this.f3394h);
                            break;
                        case 25:
                            this.f3396i = d.m(obtainStyledAttributes, index, this.f3396i);
                            break;
                        case 26:
                            this.f3356C = obtainStyledAttributes.getInt(index, this.f3356C);
                            break;
                        case 27:
                            this.f3358E = obtainStyledAttributes.getDimensionPixelSize(index, this.f3358E);
                            break;
                        case 28:
                            this.f3398j = d.m(obtainStyledAttributes, index, this.f3398j);
                            break;
                        case 29:
                            this.f3400k = d.m(obtainStyledAttributes, index, this.f3400k);
                            break;
                        case 30:
                            this.f3362I = obtainStyledAttributes.getDimensionPixelSize(index, this.f3362I);
                            break;
                        case 31:
                            this.f3406q = d.m(obtainStyledAttributes, index, this.f3406q);
                            break;
                        case 32:
                            this.f3407r = d.m(obtainStyledAttributes, index, this.f3407r);
                            break;
                        case 33:
                            this.f3359F = obtainStyledAttributes.getDimensionPixelSize(index, this.f3359F);
                            break;
                        case 34:
                            this.f3402m = d.m(obtainStyledAttributes, index, this.f3402m);
                            break;
                        case 35:
                            this.f3401l = d.m(obtainStyledAttributes, index, this.f3401l);
                            break;
                        case 36:
                            this.f3411v = obtainStyledAttributes.getFloat(index, this.f3411v);
                            break;
                        case 37:
                            this.f3370Q = obtainStyledAttributes.getFloat(index, this.f3370Q);
                            break;
                        case 38:
                            this.f3369P = obtainStyledAttributes.getFloat(index, this.f3369P);
                            break;
                        case 39:
                            this.f3371R = obtainStyledAttributes.getInt(index, this.f3371R);
                            break;
                        case 40:
                            this.f3372S = obtainStyledAttributes.getInt(index, this.f3372S);
                            break;
                        default:
                            switch (i4) {
                                case 54:
                                    this.f3373T = obtainStyledAttributes.getInt(index, this.f3373T);
                                    break;
                                case 55:
                                    this.f3374U = obtainStyledAttributes.getInt(index, this.f3374U);
                                    break;
                                case 56:
                                    this.f3375V = obtainStyledAttributes.getDimensionPixelSize(index, this.f3375V);
                                    break;
                                case 57:
                                    this.f3376W = obtainStyledAttributes.getDimensionPixelSize(index, this.f3376W);
                                    break;
                                case 58:
                                    this.f3377X = obtainStyledAttributes.getDimensionPixelSize(index, this.f3377X);
                                    break;
                                case 59:
                                    this.f3378Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3378Y);
                                    break;
                                default:
                                    switch (i4) {
                                        case 61:
                                            this.f3413x = d.m(obtainStyledAttributes, index, this.f3413x);
                                            break;
                                        case 62:
                                            this.f3414y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3414y);
                                            break;
                                        case 63:
                                            this.f3415z = obtainStyledAttributes.getFloat(index, this.f3415z);
                                            break;
                                        default:
                                            switch (i4) {
                                                case 69:
                                                    this.f3379Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f3381a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f3383b0 = obtainStyledAttributes.getInt(index, this.f3383b0);
                                                    break;
                                                case 73:
                                                    this.f3385c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3385c0);
                                                    break;
                                                case 74:
                                                    this.f3391f0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f3399j0 = obtainStyledAttributes.getBoolean(index, this.f3399j0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f3353k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f3393g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f3353k0.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f3397i0 = obtainStyledAttributes.getBoolean(index, this.f3397i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* renamed from: h, reason: collision with root package name */
        public static SparseIntArray f3416h;

        /* renamed from: a, reason: collision with root package name */
        public boolean f3417a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f3418b = -1;

        /* renamed from: c, reason: collision with root package name */
        public String f3419c = null;

        /* renamed from: d, reason: collision with root package name */
        public int f3420d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f3421e = 0;

        /* renamed from: f, reason: collision with root package name */
        public float f3422f = Float.NaN;

        /* renamed from: g, reason: collision with root package name */
        public float f3423g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3416h = sparseIntArray;
            sparseIntArray.append(AbstractC0754d.x4, 1);
            f3416h.append(AbstractC0754d.z4, 2);
            f3416h.append(AbstractC0754d.A4, 3);
            f3416h.append(AbstractC0754d.w4, 4);
            f3416h.append(AbstractC0754d.v4, 5);
            f3416h.append(AbstractC0754d.y4, 6);
        }

        public void a(c cVar) {
            this.f3417a = cVar.f3417a;
            this.f3418b = cVar.f3418b;
            this.f3419c = cVar.f3419c;
            this.f3420d = cVar.f3420d;
            this.f3421e = cVar.f3421e;
            this.f3423g = cVar.f3423g;
            this.f3422f = cVar.f3422f;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0754d.u4);
            this.f3417a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                switch (f3416h.get(index)) {
                    case 1:
                        this.f3423g = obtainStyledAttributes.getFloat(index, this.f3423g);
                        break;
                    case 2:
                        this.f3420d = obtainStyledAttributes.getInt(index, this.f3420d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.f3419c = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.f3419c = C0669a.f8858c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f3421e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f3418b = d.m(obtainStyledAttributes, index, this.f3418b);
                        break;
                    case 6:
                        this.f3422f = obtainStyledAttributes.getFloat(index, this.f3422f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0080d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3424a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f3425b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f3426c = 0;

        /* renamed from: d, reason: collision with root package name */
        public float f3427d = 1.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f3428e = Float.NaN;

        public void a(C0080d c0080d) {
            this.f3424a = c0080d.f3424a;
            this.f3425b = c0080d.f3425b;
            this.f3427d = c0080d.f3427d;
            this.f3428e = c0080d.f3428e;
            this.f3426c = c0080d.f3426c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0754d.J4);
            this.f3424a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0754d.L4) {
                    this.f3427d = obtainStyledAttributes.getFloat(index, this.f3427d);
                } else if (index == AbstractC0754d.K4) {
                    this.f3425b = obtainStyledAttributes.getInt(index, this.f3425b);
                    this.f3425b = d.f3342d[this.f3425b];
                } else if (index == AbstractC0754d.N4) {
                    this.f3426c = obtainStyledAttributes.getInt(index, this.f3426c);
                } else if (index == AbstractC0754d.M4) {
                    this.f3428e = obtainStyledAttributes.getFloat(index, this.f3428e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: n, reason: collision with root package name */
        public static SparseIntArray f3429n;

        /* renamed from: a, reason: collision with root package name */
        public boolean f3430a = false;

        /* renamed from: b, reason: collision with root package name */
        public float f3431b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        public float f3432c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        public float f3433d = 0.0f;

        /* renamed from: e, reason: collision with root package name */
        public float f3434e = 1.0f;

        /* renamed from: f, reason: collision with root package name */
        public float f3435f = 1.0f;

        /* renamed from: g, reason: collision with root package name */
        public float f3436g = Float.NaN;

        /* renamed from: h, reason: collision with root package name */
        public float f3437h = Float.NaN;

        /* renamed from: i, reason: collision with root package name */
        public float f3438i = 0.0f;

        /* renamed from: j, reason: collision with root package name */
        public float f3439j = 0.0f;

        /* renamed from: k, reason: collision with root package name */
        public float f3440k = 0.0f;

        /* renamed from: l, reason: collision with root package name */
        public boolean f3441l = false;

        /* renamed from: m, reason: collision with root package name */
        public float f3442m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3429n = sparseIntArray;
            sparseIntArray.append(AbstractC0754d.h5, 1);
            f3429n.append(AbstractC0754d.i5, 2);
            f3429n.append(AbstractC0754d.j5, 3);
            f3429n.append(AbstractC0754d.f5, 4);
            f3429n.append(AbstractC0754d.g5, 5);
            f3429n.append(AbstractC0754d.b5, 6);
            f3429n.append(AbstractC0754d.c5, 7);
            f3429n.append(AbstractC0754d.d5, 8);
            f3429n.append(AbstractC0754d.e5, 9);
            f3429n.append(AbstractC0754d.k5, 10);
            f3429n.append(AbstractC0754d.l5, 11);
        }

        public void a(e eVar) {
            this.f3430a = eVar.f3430a;
            this.f3431b = eVar.f3431b;
            this.f3432c = eVar.f3432c;
            this.f3433d = eVar.f3433d;
            this.f3434e = eVar.f3434e;
            this.f3435f = eVar.f3435f;
            this.f3436g = eVar.f3436g;
            this.f3437h = eVar.f3437h;
            this.f3438i = eVar.f3438i;
            this.f3439j = eVar.f3439j;
            this.f3440k = eVar.f3440k;
            this.f3441l = eVar.f3441l;
            this.f3442m = eVar.f3442m;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0754d.a5);
            this.f3430a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                switch (f3429n.get(index)) {
                    case 1:
                        this.f3431b = obtainStyledAttributes.getFloat(index, this.f3431b);
                        break;
                    case 2:
                        this.f3432c = obtainStyledAttributes.getFloat(index, this.f3432c);
                        break;
                    case 3:
                        this.f3433d = obtainStyledAttributes.getFloat(index, this.f3433d);
                        break;
                    case 4:
                        this.f3434e = obtainStyledAttributes.getFloat(index, this.f3434e);
                        break;
                    case 5:
                        this.f3435f = obtainStyledAttributes.getFloat(index, this.f3435f);
                        break;
                    case 6:
                        this.f3436g = obtainStyledAttributes.getDimension(index, this.f3436g);
                        break;
                    case 7:
                        this.f3437h = obtainStyledAttributes.getDimension(index, this.f3437h);
                        break;
                    case 8:
                        this.f3438i = obtainStyledAttributes.getDimension(index, this.f3438i);
                        break;
                    case 9:
                        this.f3439j = obtainStyledAttributes.getDimension(index, this.f3439j);
                        break;
                    case 10:
                        this.f3440k = obtainStyledAttributes.getDimension(index, this.f3440k);
                        break;
                    case 11:
                        this.f3441l = true;
                        this.f3442m = obtainStyledAttributes.getDimension(index, this.f3442m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3343e = sparseIntArray;
        sparseIntArray.append(AbstractC0754d.f9847u0, 25);
        f3343e.append(AbstractC0754d.f9851v0, 26);
        f3343e.append(AbstractC0754d.f9859x0, 29);
        f3343e.append(AbstractC0754d.f9863y0, 30);
        f3343e.append(AbstractC0754d.f9684E0, 36);
        f3343e.append(AbstractC0754d.f9680D0, 35);
        f3343e.append(AbstractC0754d.f9775c0, 4);
        f3343e.append(AbstractC0754d.f9771b0, 3);
        f3343e.append(AbstractC0754d.f9763Z, 1);
        f3343e.append(AbstractC0754d.f9716M0, 6);
        f3343e.append(AbstractC0754d.f9720N0, 7);
        f3343e.append(AbstractC0754d.f9803j0, 17);
        f3343e.append(AbstractC0754d.f9807k0, 18);
        f3343e.append(AbstractC0754d.f9811l0, 19);
        f3343e.append(AbstractC0754d.f9838s, 27);
        f3343e.append(AbstractC0754d.f9867z0, 32);
        f3343e.append(AbstractC0754d.f9668A0, 33);
        f3343e.append(AbstractC0754d.f9799i0, 10);
        f3343e.append(AbstractC0754d.f9795h0, 9);
        f3343e.append(AbstractC0754d.f9732Q0, 13);
        f3343e.append(AbstractC0754d.f9744T0, 16);
        f3343e.append(AbstractC0754d.f9736R0, 14);
        f3343e.append(AbstractC0754d.f9724O0, 11);
        f3343e.append(AbstractC0754d.f9740S0, 15);
        f3343e.append(AbstractC0754d.f9728P0, 12);
        f3343e.append(AbstractC0754d.f9696H0, 40);
        f3343e.append(AbstractC0754d.f9839s0, 39);
        f3343e.append(AbstractC0754d.f9835r0, 41);
        f3343e.append(AbstractC0754d.f9692G0, 42);
        f3343e.append(AbstractC0754d.f9831q0, 20);
        f3343e.append(AbstractC0754d.f9688F0, 37);
        f3343e.append(AbstractC0754d.f9791g0, 5);
        f3343e.append(AbstractC0754d.f9843t0, 82);
        f3343e.append(AbstractC0754d.f9676C0, 82);
        f3343e.append(AbstractC0754d.f9855w0, 82);
        f3343e.append(AbstractC0754d.f9767a0, 82);
        f3343e.append(AbstractC0754d.f9760Y, 82);
        f3343e.append(AbstractC0754d.f9858x, 24);
        f3343e.append(AbstractC0754d.f9866z, 28);
        f3343e.append(AbstractC0754d.f9711L, 31);
        f3343e.append(AbstractC0754d.f9715M, 8);
        f3343e.append(AbstractC0754d.f9862y, 34);
        f3343e.append(AbstractC0754d.f9667A, 2);
        f3343e.append(AbstractC0754d.f9850v, 23);
        f3343e.append(AbstractC0754d.f9854w, 21);
        f3343e.append(AbstractC0754d.f9846u, 22);
        f3343e.append(AbstractC0754d.f9671B, 43);
        f3343e.append(AbstractC0754d.f9723O, 44);
        f3343e.append(AbstractC0754d.f9703J, 45);
        f3343e.append(AbstractC0754d.f9707K, 46);
        f3343e.append(AbstractC0754d.f9699I, 60);
        f3343e.append(AbstractC0754d.f9691G, 47);
        f3343e.append(AbstractC0754d.f9695H, 48);
        f3343e.append(AbstractC0754d.f9675C, 49);
        f3343e.append(AbstractC0754d.f9679D, 50);
        f3343e.append(AbstractC0754d.f9683E, 51);
        f3343e.append(AbstractC0754d.f9687F, 52);
        f3343e.append(AbstractC0754d.f9719N, 53);
        f3343e.append(AbstractC0754d.f9700I0, 54);
        f3343e.append(AbstractC0754d.f9815m0, 55);
        f3343e.append(AbstractC0754d.f9704J0, 56);
        f3343e.append(AbstractC0754d.f9819n0, 57);
        f3343e.append(AbstractC0754d.f9708K0, 58);
        f3343e.append(AbstractC0754d.f9823o0, 59);
        f3343e.append(AbstractC0754d.f9779d0, 61);
        f3343e.append(AbstractC0754d.f9787f0, 62);
        f3343e.append(AbstractC0754d.f9783e0, 63);
        f3343e.append(AbstractC0754d.f9727P, 64);
        f3343e.append(AbstractC0754d.f9758X0, 65);
        f3343e.append(AbstractC0754d.f9751V, 66);
        f3343e.append(AbstractC0754d.f9761Y0, 67);
        f3343e.append(AbstractC0754d.f9752V0, 79);
        f3343e.append(AbstractC0754d.f9842t, 38);
        f3343e.append(AbstractC0754d.f9748U0, 68);
        f3343e.append(AbstractC0754d.f9712L0, 69);
        f3343e.append(AbstractC0754d.f9827p0, 70);
        f3343e.append(AbstractC0754d.f9743T, 71);
        f3343e.append(AbstractC0754d.f9735R, 72);
        f3343e.append(AbstractC0754d.f9739S, 73);
        f3343e.append(AbstractC0754d.f9747U, 74);
        f3343e.append(AbstractC0754d.f9731Q, 75);
        f3343e.append(AbstractC0754d.f9755W0, 76);
        f3343e.append(AbstractC0754d.f9672B0, 77);
        f3343e.append(AbstractC0754d.f9764Z0, 78);
        f3343e.append(AbstractC0754d.f9757X, 80);
        f3343e.append(AbstractC0754d.f9754W, 81);
    }

    public static int m(TypedArray typedArray, int i3, int i4) {
        int resourceId = typedArray.getResourceId(i3, i4);
        return resourceId == -1 ? typedArray.getInt(i3, -1) : resourceId;
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintLayout constraintLayout, boolean z3) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f3346c.keySet());
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!this.f3346c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + AbstractC0674a.a(childAt));
            } else {
                if (this.f3345b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f3346c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f3346c.get(Integer.valueOf(id));
                        if (childAt instanceof androidx.constraintlayout.widget.a) {
                            aVar.f3350d.f3387d0 = 1;
                        }
                        int i4 = aVar.f3350d.f3387d0;
                        if (i4 != -1 && i4 == 1) {
                            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                            aVar2.setId(id);
                            aVar2.setType(aVar.f3350d.f3383b0);
                            aVar2.setMargin(aVar.f3350d.f3385c0);
                            aVar2.setAllowsGoneWidget(aVar.f3350d.f3399j0);
                            b bVar = aVar.f3350d;
                            int[] iArr = bVar.f3389e0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f3391f0;
                                if (str != null) {
                                    bVar.f3389e0 = h(aVar2, str);
                                    aVar2.setReferencedIds(aVar.f3350d.f3389e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.b(bVar2);
                        if (z3) {
                            androidx.constraintlayout.widget.b.c(childAt, aVar.f3352f);
                        }
                        childAt.setLayoutParams(bVar2);
                        C0080d c0080d = aVar.f3348b;
                        if (c0080d.f3426c == 0) {
                            childAt.setVisibility(c0080d.f3425b);
                        }
                        childAt.setAlpha(aVar.f3348b.f3427d);
                        childAt.setRotation(aVar.f3351e.f3431b);
                        childAt.setRotationX(aVar.f3351e.f3432c);
                        childAt.setRotationY(aVar.f3351e.f3433d);
                        childAt.setScaleX(aVar.f3351e.f3434e);
                        childAt.setScaleY(aVar.f3351e.f3435f);
                        if (!Float.isNaN(aVar.f3351e.f3436g)) {
                            childAt.setPivotX(aVar.f3351e.f3436g);
                        }
                        if (!Float.isNaN(aVar.f3351e.f3437h)) {
                            childAt.setPivotY(aVar.f3351e.f3437h);
                        }
                        childAt.setTranslationX(aVar.f3351e.f3438i);
                        childAt.setTranslationY(aVar.f3351e.f3439j);
                        childAt.setTranslationZ(aVar.f3351e.f3440k);
                        e eVar = aVar.f3351e;
                        if (eVar.f3441l) {
                            childAt.setElevation(eVar.f3442m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = (a) this.f3346c.get(num);
            int i5 = aVar3.f3350d.f3387d0;
            if (i5 != -1 && i5 == 1) {
                androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                aVar4.setId(num.intValue());
                b bVar3 = aVar3.f3350d;
                int[] iArr2 = bVar3.f3389e0;
                if (iArr2 != null) {
                    aVar4.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f3391f0;
                    if (str2 != null) {
                        bVar3.f3389e0 = h(aVar4, str2);
                        aVar4.setReferencedIds(aVar3.f3350d.f3389e0);
                    }
                }
                aVar4.setType(aVar3.f3350d.f3383b0);
                aVar4.setMargin(aVar3.f3350d.f3385c0);
                ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                aVar4.m();
                aVar3.b(generateDefaultLayoutParams);
                constraintLayout.addView(aVar4, generateDefaultLayoutParams);
            }
            if (aVar3.f3350d.f3380a) {
                View eVar2 = new androidx.constraintlayout.widget.e(constraintLayout.getContext());
                eVar2.setId(num.intValue());
                ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar3.b(generateDefaultLayoutParams2);
                constraintLayout.addView(eVar2, generateDefaultLayoutParams2);
            }
        }
    }

    public void e(Context context, int i3) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i3, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f3346c.clear();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = constraintLayout.getChildAt(i3);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f3345b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f3346c.containsKey(Integer.valueOf(id))) {
                this.f3346c.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f3346c.get(Integer.valueOf(id));
            aVar.f3352f = androidx.constraintlayout.widget.b.a(this.f3344a, childAt);
            aVar.d(id, bVar);
            aVar.f3348b.f3425b = childAt.getVisibility();
            aVar.f3348b.f3427d = childAt.getAlpha();
            aVar.f3351e.f3431b = childAt.getRotation();
            aVar.f3351e.f3432c = childAt.getRotationX();
            aVar.f3351e.f3433d = childAt.getRotationY();
            aVar.f3351e.f3434e = childAt.getScaleX();
            aVar.f3351e.f3435f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f3351e;
                eVar.f3436g = pivotX;
                eVar.f3437h = pivotY;
            }
            aVar.f3351e.f3438i = childAt.getTranslationX();
            aVar.f3351e.f3439j = childAt.getTranslationY();
            aVar.f3351e.f3440k = childAt.getTranslationZ();
            e eVar2 = aVar.f3351e;
            if (eVar2.f3441l) {
                eVar2.f3442m = childAt.getElevation();
            }
            if (childAt instanceof androidx.constraintlayout.widget.a) {
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                aVar.f3350d.f3399j0 = aVar2.n();
                aVar.f3350d.f3389e0 = aVar2.getReferencedIds();
                aVar.f3350d.f3383b0 = aVar2.getType();
                aVar.f3350d.f3385c0 = aVar2.getMargin();
            }
        }
    }

    public void g(int i3, int i4, int i5, float f3) {
        b bVar = j(i3).f3350d;
        bVar.f3413x = i4;
        bVar.f3414y = i5;
        bVar.f3415z = f3;
    }

    public final int[] h(View view, String str) {
        int i3;
        Object f3;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i4 = 0;
        int i5 = 0;
        while (i4 < split.length) {
            String trim = split[i4].trim();
            try {
                i3 = AbstractC0753c.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i3 = 0;
            }
            if (i3 == 0) {
                i3 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i3 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (f3 = ((ConstraintLayout) view.getParent()).f(0, trim)) != null && (f3 instanceof Integer)) {
                i3 = ((Integer) f3).intValue();
            }
            iArr[i5] = i3;
            i4++;
            i5++;
        }
        return i5 != split.length ? Arrays.copyOf(iArr, i5) : iArr;
    }

    public final a i(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0754d.f9834r);
        n(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public final a j(int i3) {
        if (!this.f3346c.containsKey(Integer.valueOf(i3))) {
            this.f3346c.put(Integer.valueOf(i3), new a());
        }
        return (a) this.f3346c.get(Integer.valueOf(i3));
    }

    public void k(Context context, int i3) {
        XmlResourceParser xml = context.getResources().getXml(i3);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a i4 = i(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        i4.f3350d.f3380a = true;
                    }
                    this.f3346c.put(Integer.valueOf(i4.f3347a), i4);
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e4) {
            e4.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x017e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.l(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void n(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArray.getIndex(i3);
            if (index != AbstractC0754d.f9842t && AbstractC0754d.f9711L != index && AbstractC0754d.f9715M != index) {
                aVar.f3349c.f3417a = true;
                aVar.f3350d.f3382b = true;
                aVar.f3348b.f3424a = true;
                aVar.f3351e.f3430a = true;
            }
            switch (f3343e.get(index)) {
                case 1:
                    b bVar = aVar.f3350d;
                    bVar.f3405p = m(typedArray, index, bVar.f3405p);
                    break;
                case 2:
                    b bVar2 = aVar.f3350d;
                    bVar2.f3360G = typedArray.getDimensionPixelSize(index, bVar2.f3360G);
                    break;
                case 3:
                    b bVar3 = aVar.f3350d;
                    bVar3.f3404o = m(typedArray, index, bVar3.f3404o);
                    break;
                case 4:
                    b bVar4 = aVar.f3350d;
                    bVar4.f3403n = m(typedArray, index, bVar4.f3403n);
                    break;
                case 5:
                    aVar.f3350d.f3412w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f3350d;
                    bVar5.f3354A = typedArray.getDimensionPixelOffset(index, bVar5.f3354A);
                    break;
                case 7:
                    b bVar6 = aVar.f3350d;
                    bVar6.f3355B = typedArray.getDimensionPixelOffset(index, bVar6.f3355B);
                    break;
                case 8:
                    b bVar7 = aVar.f3350d;
                    bVar7.f3361H = typedArray.getDimensionPixelSize(index, bVar7.f3361H);
                    break;
                case 9:
                    b bVar8 = aVar.f3350d;
                    bVar8.f3409t = m(typedArray, index, bVar8.f3409t);
                    break;
                case 10:
                    b bVar9 = aVar.f3350d;
                    bVar9.f3408s = m(typedArray, index, bVar9.f3408s);
                    break;
                case 11:
                    b bVar10 = aVar.f3350d;
                    bVar10.f3366M = typedArray.getDimensionPixelSize(index, bVar10.f3366M);
                    break;
                case 12:
                    b bVar11 = aVar.f3350d;
                    bVar11.f3367N = typedArray.getDimensionPixelSize(index, bVar11.f3367N);
                    break;
                case 13:
                    b bVar12 = aVar.f3350d;
                    bVar12.f3363J = typedArray.getDimensionPixelSize(index, bVar12.f3363J);
                    break;
                case 14:
                    b bVar13 = aVar.f3350d;
                    bVar13.f3365L = typedArray.getDimensionPixelSize(index, bVar13.f3365L);
                    break;
                case 15:
                    b bVar14 = aVar.f3350d;
                    bVar14.f3368O = typedArray.getDimensionPixelSize(index, bVar14.f3368O);
                    break;
                case 16:
                    b bVar15 = aVar.f3350d;
                    bVar15.f3364K = typedArray.getDimensionPixelSize(index, bVar15.f3364K);
                    break;
                case 17:
                    b bVar16 = aVar.f3350d;
                    bVar16.f3388e = typedArray.getDimensionPixelOffset(index, bVar16.f3388e);
                    break;
                case 18:
                    b bVar17 = aVar.f3350d;
                    bVar17.f3390f = typedArray.getDimensionPixelOffset(index, bVar17.f3390f);
                    break;
                case 19:
                    b bVar18 = aVar.f3350d;
                    bVar18.f3392g = typedArray.getFloat(index, bVar18.f3392g);
                    break;
                case 20:
                    b bVar19 = aVar.f3350d;
                    bVar19.f3410u = typedArray.getFloat(index, bVar19.f3410u);
                    break;
                case 21:
                    b bVar20 = aVar.f3350d;
                    bVar20.f3386d = typedArray.getLayoutDimension(index, bVar20.f3386d);
                    break;
                case 22:
                    C0080d c0080d = aVar.f3348b;
                    c0080d.f3425b = typedArray.getInt(index, c0080d.f3425b);
                    C0080d c0080d2 = aVar.f3348b;
                    c0080d2.f3425b = f3342d[c0080d2.f3425b];
                    break;
                case 23:
                    b bVar21 = aVar.f3350d;
                    bVar21.f3384c = typedArray.getLayoutDimension(index, bVar21.f3384c);
                    break;
                case 24:
                    b bVar22 = aVar.f3350d;
                    bVar22.f3357D = typedArray.getDimensionPixelSize(index, bVar22.f3357D);
                    break;
                case 25:
                    b bVar23 = aVar.f3350d;
                    bVar23.f3394h = m(typedArray, index, bVar23.f3394h);
                    break;
                case 26:
                    b bVar24 = aVar.f3350d;
                    bVar24.f3396i = m(typedArray, index, bVar24.f3396i);
                    break;
                case 27:
                    b bVar25 = aVar.f3350d;
                    bVar25.f3356C = typedArray.getInt(index, bVar25.f3356C);
                    break;
                case 28:
                    b bVar26 = aVar.f3350d;
                    bVar26.f3358E = typedArray.getDimensionPixelSize(index, bVar26.f3358E);
                    break;
                case 29:
                    b bVar27 = aVar.f3350d;
                    bVar27.f3398j = m(typedArray, index, bVar27.f3398j);
                    break;
                case 30:
                    b bVar28 = aVar.f3350d;
                    bVar28.f3400k = m(typedArray, index, bVar28.f3400k);
                    break;
                case 31:
                    b bVar29 = aVar.f3350d;
                    bVar29.f3362I = typedArray.getDimensionPixelSize(index, bVar29.f3362I);
                    break;
                case 32:
                    b bVar30 = aVar.f3350d;
                    bVar30.f3406q = m(typedArray, index, bVar30.f3406q);
                    break;
                case 33:
                    b bVar31 = aVar.f3350d;
                    bVar31.f3407r = m(typedArray, index, bVar31.f3407r);
                    break;
                case 34:
                    b bVar32 = aVar.f3350d;
                    bVar32.f3359F = typedArray.getDimensionPixelSize(index, bVar32.f3359F);
                    break;
                case 35:
                    b bVar33 = aVar.f3350d;
                    bVar33.f3402m = m(typedArray, index, bVar33.f3402m);
                    break;
                case 36:
                    b bVar34 = aVar.f3350d;
                    bVar34.f3401l = m(typedArray, index, bVar34.f3401l);
                    break;
                case 37:
                    b bVar35 = aVar.f3350d;
                    bVar35.f3411v = typedArray.getFloat(index, bVar35.f3411v);
                    break;
                case 38:
                    aVar.f3347a = typedArray.getResourceId(index, aVar.f3347a);
                    break;
                case 39:
                    b bVar36 = aVar.f3350d;
                    bVar36.f3370Q = typedArray.getFloat(index, bVar36.f3370Q);
                    break;
                case 40:
                    b bVar37 = aVar.f3350d;
                    bVar37.f3369P = typedArray.getFloat(index, bVar37.f3369P);
                    break;
                case 41:
                    b bVar38 = aVar.f3350d;
                    bVar38.f3371R = typedArray.getInt(index, bVar38.f3371R);
                    break;
                case 42:
                    b bVar39 = aVar.f3350d;
                    bVar39.f3372S = typedArray.getInt(index, bVar39.f3372S);
                    break;
                case 43:
                    C0080d c0080d3 = aVar.f3348b;
                    c0080d3.f3427d = typedArray.getFloat(index, c0080d3.f3427d);
                    break;
                case 44:
                    e eVar = aVar.f3351e;
                    eVar.f3441l = true;
                    eVar.f3442m = typedArray.getDimension(index, eVar.f3442m);
                    break;
                case 45:
                    e eVar2 = aVar.f3351e;
                    eVar2.f3432c = typedArray.getFloat(index, eVar2.f3432c);
                    break;
                case 46:
                    e eVar3 = aVar.f3351e;
                    eVar3.f3433d = typedArray.getFloat(index, eVar3.f3433d);
                    break;
                case 47:
                    e eVar4 = aVar.f3351e;
                    eVar4.f3434e = typedArray.getFloat(index, eVar4.f3434e);
                    break;
                case 48:
                    e eVar5 = aVar.f3351e;
                    eVar5.f3435f = typedArray.getFloat(index, eVar5.f3435f);
                    break;
                case 49:
                    e eVar6 = aVar.f3351e;
                    eVar6.f3436g = typedArray.getDimension(index, eVar6.f3436g);
                    break;
                case 50:
                    e eVar7 = aVar.f3351e;
                    eVar7.f3437h = typedArray.getDimension(index, eVar7.f3437h);
                    break;
                case 51:
                    e eVar8 = aVar.f3351e;
                    eVar8.f3438i = typedArray.getDimension(index, eVar8.f3438i);
                    break;
                case 52:
                    e eVar9 = aVar.f3351e;
                    eVar9.f3439j = typedArray.getDimension(index, eVar9.f3439j);
                    break;
                case 53:
                    e eVar10 = aVar.f3351e;
                    eVar10.f3440k = typedArray.getDimension(index, eVar10.f3440k);
                    break;
                case 54:
                    b bVar40 = aVar.f3350d;
                    bVar40.f3373T = typedArray.getInt(index, bVar40.f3373T);
                    break;
                case 55:
                    b bVar41 = aVar.f3350d;
                    bVar41.f3374U = typedArray.getInt(index, bVar41.f3374U);
                    break;
                case 56:
                    b bVar42 = aVar.f3350d;
                    bVar42.f3375V = typedArray.getDimensionPixelSize(index, bVar42.f3375V);
                    break;
                case 57:
                    b bVar43 = aVar.f3350d;
                    bVar43.f3376W = typedArray.getDimensionPixelSize(index, bVar43.f3376W);
                    break;
                case 58:
                    b bVar44 = aVar.f3350d;
                    bVar44.f3377X = typedArray.getDimensionPixelSize(index, bVar44.f3377X);
                    break;
                case 59:
                    b bVar45 = aVar.f3350d;
                    bVar45.f3378Y = typedArray.getDimensionPixelSize(index, bVar45.f3378Y);
                    break;
                case 60:
                    e eVar11 = aVar.f3351e;
                    eVar11.f3431b = typedArray.getFloat(index, eVar11.f3431b);
                    break;
                case 61:
                    b bVar46 = aVar.f3350d;
                    bVar46.f3413x = m(typedArray, index, bVar46.f3413x);
                    break;
                case 62:
                    b bVar47 = aVar.f3350d;
                    bVar47.f3414y = typedArray.getDimensionPixelSize(index, bVar47.f3414y);
                    break;
                case 63:
                    b bVar48 = aVar.f3350d;
                    bVar48.f3415z = typedArray.getFloat(index, bVar48.f3415z);
                    break;
                case 64:
                    c cVar = aVar.f3349c;
                    cVar.f3418b = m(typedArray, index, cVar.f3418b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f3349c.f3419c = typedArray.getString(index);
                        break;
                    } else {
                        aVar.f3349c.f3419c = C0669a.f8858c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.f3349c.f3421e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f3349c;
                    cVar2.f3423g = typedArray.getFloat(index, cVar2.f3423g);
                    break;
                case 68:
                    C0080d c0080d4 = aVar.f3348b;
                    c0080d4.f3428e = typedArray.getFloat(index, c0080d4.f3428e);
                    break;
                case 69:
                    aVar.f3350d.f3379Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f3350d.f3381a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f3350d;
                    bVar49.f3383b0 = typedArray.getInt(index, bVar49.f3383b0);
                    break;
                case 73:
                    b bVar50 = aVar.f3350d;
                    bVar50.f3385c0 = typedArray.getDimensionPixelSize(index, bVar50.f3385c0);
                    break;
                case 74:
                    aVar.f3350d.f3391f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f3350d;
                    bVar51.f3399j0 = typedArray.getBoolean(index, bVar51.f3399j0);
                    break;
                case 76:
                    c cVar3 = aVar.f3349c;
                    cVar3.f3420d = typedArray.getInt(index, cVar3.f3420d);
                    break;
                case 77:
                    aVar.f3350d.f3393g0 = typedArray.getString(index);
                    break;
                case 78:
                    C0080d c0080d5 = aVar.f3348b;
                    c0080d5.f3426c = typedArray.getInt(index, c0080d5.f3426c);
                    break;
                case 79:
                    c cVar4 = aVar.f3349c;
                    cVar4.f3422f = typedArray.getFloat(index, cVar4.f3422f);
                    break;
                case 80:
                    b bVar52 = aVar.f3350d;
                    bVar52.f3395h0 = typedArray.getBoolean(index, bVar52.f3395h0);
                    break;
                case 81:
                    b bVar53 = aVar.f3350d;
                    bVar53.f3397i0 = typedArray.getBoolean(index, bVar53.f3397i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f3343e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f3343e.get(index));
                    break;
            }
        }
    }
}

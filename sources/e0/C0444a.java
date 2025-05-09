package e0;

import android.util.Log;
import e0.B;
import e0.J;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444a extends J implements B.h {

    /* renamed from: t, reason: collision with root package name */
    public final B f6578t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6579u;

    /* renamed from: v, reason: collision with root package name */
    public int f6580v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f6581w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0444a(e0.B r3) {
        /*
            r2 = this;
            e0.t r0 = r3.i0()
            r3.j0()
            r1 = 0
            r2.<init>(r0, r1)
            r0 = -1
            r2.f6580v = r0
            r0 = 0
            r2.f6581w = r0
            r2.f6578t = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C0444a.<init>(e0.B):void");
    }

    @Override // e0.B.h
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (B.v0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f6488i) {
            return true;
        }
        this.f6578t.f(this);
        return true;
    }

    @Override // e0.J
    public int e() {
        return p(false);
    }

    @Override // e0.J
    public int f() {
        return p(true);
    }

    @Override // e0.J
    public void g() {
        i();
        this.f6578t.R(this, false);
    }

    @Override // e0.J
    public void h() {
        i();
        this.f6578t.R(this, true);
    }

    @Override // e0.J
    public void j(int i3, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, String str, int i4) {
        super.j(i3, abstractComponentCallbacksC0459p, str, i4);
        abstractComponentCallbacksC0459p.f6736x = this.f6578t;
    }

    @Override // e0.J
    public J k(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        B b3 = abstractComponentCallbacksC0459p.f6736x;
        if (b3 == null || b3 == this.f6578t) {
            return super.k(abstractComponentCallbacksC0459p);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0459p.toString() + " is already attached to a FragmentManager.");
    }

    public void o(int i3) {
        if (this.f6488i) {
            if (B.v0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i3);
            }
            int size = this.f6482c.size();
            for (int i4 = 0; i4 < size; i4++) {
                J.a aVar = (J.a) this.f6482c.get(i4);
                AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = aVar.f6500b;
                if (abstractComponentCallbacksC0459p != null) {
                    abstractComponentCallbacksC0459p.f6735w += i3;
                    if (B.v0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f6500b + " to " + aVar.f6500b.f6735w);
                    }
                }
            }
        }
    }

    public int p(boolean z3) {
        if (this.f6579u) {
            throw new IllegalStateException("commit already called");
        }
        if (B.v0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new O("FragmentManager"));
            q("  ", printWriter);
            printWriter.close();
        }
        this.f6579u = true;
        if (this.f6488i) {
            this.f6580v = this.f6578t.i();
        } else {
            this.f6580v = -1;
        }
        this.f6578t.O(this, z3);
        return this.f6580v;
    }

    public void q(String str, PrintWriter printWriter) {
        r(str, printWriter, true);
    }

    public void r(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f6490k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f6580v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f6579u);
            if (this.f6487h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f6487h));
            }
            if (this.f6483d != 0 || this.f6484e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6483d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6484e));
            }
            if (this.f6485f != 0 || this.f6486g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f6485f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f6486g));
            }
            if (this.f6491l != 0 || this.f6492m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6491l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f6492m);
            }
            if (this.f6493n != 0 || this.f6494o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f6493n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f6494o);
            }
        }
        if (this.f6482c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f6482c.size();
        for (int i3 = 0; i3 < size; i3++) {
            J.a aVar = (J.a) this.f6482c.get(i3);
            switch (aVar.f6499a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f6499a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i3);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f6500b);
            if (z3) {
                if (aVar.f6502d != 0 || aVar.f6503e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f6502d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f6503e));
                }
                if (aVar.f6504f != 0 || aVar.f6505g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f6504f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f6505g));
                }
            }
        }
    }

    public void s() {
        int size = this.f6482c.size();
        for (int i3 = 0; i3 < size; i3++) {
            J.a aVar = (J.a) this.f6482c.get(i3);
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = aVar.f6500b;
            if (abstractComponentCallbacksC0459p != null) {
                abstractComponentCallbacksC0459p.f6730r = this.f6581w;
                abstractComponentCallbacksC0459p.W0(false);
                abstractComponentCallbacksC0459p.V0(this.f6487h);
                abstractComponentCallbacksC0459p.Y0(this.f6495p, this.f6496q);
            }
            switch (aVar.f6499a) {
                case 1:
                    abstractComponentCallbacksC0459p.S0(aVar.f6502d, aVar.f6503e, aVar.f6504f, aVar.f6505g);
                    this.f6578t.U0(abstractComponentCallbacksC0459p, false);
                    this.f6578t.g(abstractComponentCallbacksC0459p);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f6499a);
                case 3:
                    abstractComponentCallbacksC0459p.S0(aVar.f6502d, aVar.f6503e, aVar.f6504f, aVar.f6505g);
                    this.f6578t.O0(abstractComponentCallbacksC0459p);
                    break;
                case 4:
                    abstractComponentCallbacksC0459p.S0(aVar.f6502d, aVar.f6503e, aVar.f6504f, aVar.f6505g);
                    this.f6578t.s0(abstractComponentCallbacksC0459p);
                    break;
                case 5:
                    abstractComponentCallbacksC0459p.S0(aVar.f6502d, aVar.f6503e, aVar.f6504f, aVar.f6505g);
                    this.f6578t.U0(abstractComponentCallbacksC0459p, false);
                    this.f6578t.Y0(abstractComponentCallbacksC0459p);
                    break;
                case 6:
                    abstractComponentCallbacksC0459p.S0(aVar.f6502d, aVar.f6503e, aVar.f6504f, aVar.f6505g);
                    this.f6578t.t(abstractComponentCallbacksC0459p);
                    break;
                case 7:
                    abstractComponentCallbacksC0459p.S0(aVar.f6502d, aVar.f6503e, aVar.f6504f, aVar.f6505g);
                    this.f6578t.U0(abstractComponentCallbacksC0459p, false);
                    this.f6578t.k(abstractComponentCallbacksC0459p);
                    break;
                case 8:
                    this.f6578t.W0(abstractComponentCallbacksC0459p);
                    break;
                case 9:
                    this.f6578t.W0(null);
                    break;
                case 10:
                    this.f6578t.V0(abstractComponentCallbacksC0459p, aVar.f6507i);
                    break;
            }
        }
    }

    public void t() {
        for (int size = this.f6482c.size() - 1; size >= 0; size--) {
            J.a aVar = (J.a) this.f6482c.get(size);
            AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p = aVar.f6500b;
            if (abstractComponentCallbacksC0459p != null) {
                abstractComponentCallbacksC0459p.f6730r = this.f6581w;
                abstractComponentCallbacksC0459p.W0(true);
                abstractComponentCallbacksC0459p.V0(B.S0(this.f6487h));
                abstractComponentCallbacksC0459p.Y0(this.f6496q, this.f6495p);
            }
            switch (aVar.f6499a) {
                case 1:
                    abstractComponentCallbacksC0459p.S0(aVar.f6502d, aVar.f6503e, aVar.f6504f, aVar.f6505g);
                    this.f6578t.U0(abstractComponentCallbacksC0459p, true);
                    this.f6578t.O0(abstractComponentCallbacksC0459p);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f6499a);
                case 3:
                    abstractComponentCallbacksC0459p.S0(aVar.f6502d, aVar.f6503e, aVar.f6504f, aVar.f6505g);
                    this.f6578t.g(abstractComponentCallbacksC0459p);
                    break;
                case 4:
                    abstractComponentCallbacksC0459p.S0(aVar.f6502d, aVar.f6503e, aVar.f6504f, aVar.f6505g);
                    this.f6578t.Y0(abstractComponentCallbacksC0459p);
                    break;
                case 5:
                    abstractComponentCallbacksC0459p.S0(aVar.f6502d, aVar.f6503e, aVar.f6504f, aVar.f6505g);
                    this.f6578t.U0(abstractComponentCallbacksC0459p, true);
                    this.f6578t.s0(abstractComponentCallbacksC0459p);
                    break;
                case 6:
                    abstractComponentCallbacksC0459p.S0(aVar.f6502d, aVar.f6503e, aVar.f6504f, aVar.f6505g);
                    this.f6578t.k(abstractComponentCallbacksC0459p);
                    break;
                case 7:
                    abstractComponentCallbacksC0459p.S0(aVar.f6502d, aVar.f6503e, aVar.f6504f, aVar.f6505g);
                    this.f6578t.U0(abstractComponentCallbacksC0459p, true);
                    this.f6578t.t(abstractComponentCallbacksC0459p);
                    break;
                case 8:
                    this.f6578t.W0(null);
                    break;
                case 9:
                    this.f6578t.W0(abstractComponentCallbacksC0459p);
                    break;
                case 10:
                    this.f6578t.V0(abstractComponentCallbacksC0459p, aVar.f6506h);
                    break;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f6580v >= 0) {
            sb.append(" #");
            sb.append(this.f6580v);
        }
        if (this.f6490k != null) {
            sb.append(" ");
            sb.append(this.f6490k);
        }
        sb.append("}");
        return sb.toString();
    }

    public AbstractComponentCallbacksC0459p u(ArrayList arrayList, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p2 = abstractComponentCallbacksC0459p;
        int i3 = 0;
        while (i3 < this.f6482c.size()) {
            J.a aVar = (J.a) this.f6482c.get(i3);
            int i4 = aVar.f6499a;
            if (i4 != 1) {
                if (i4 == 2) {
                    AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p3 = aVar.f6500b;
                    int i5 = abstractComponentCallbacksC0459p3.f6688B;
                    boolean z3 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p4 = (AbstractComponentCallbacksC0459p) arrayList.get(size);
                        if (abstractComponentCallbacksC0459p4.f6688B == i5) {
                            if (abstractComponentCallbacksC0459p4 == abstractComponentCallbacksC0459p3) {
                                z3 = true;
                            } else {
                                if (abstractComponentCallbacksC0459p4 == abstractComponentCallbacksC0459p2) {
                                    this.f6482c.add(i3, new J.a(9, abstractComponentCallbacksC0459p4, true));
                                    i3++;
                                    abstractComponentCallbacksC0459p2 = null;
                                }
                                J.a aVar2 = new J.a(3, abstractComponentCallbacksC0459p4, true);
                                aVar2.f6502d = aVar.f6502d;
                                aVar2.f6504f = aVar.f6504f;
                                aVar2.f6503e = aVar.f6503e;
                                aVar2.f6505g = aVar.f6505g;
                                this.f6482c.add(i3, aVar2);
                                arrayList.remove(abstractComponentCallbacksC0459p4);
                                i3++;
                            }
                        }
                    }
                    if (z3) {
                        this.f6482c.remove(i3);
                        i3--;
                    } else {
                        aVar.f6499a = 1;
                        aVar.f6501c = true;
                        arrayList.add(abstractComponentCallbacksC0459p3);
                    }
                } else if (i4 == 3 || i4 == 6) {
                    arrayList.remove(aVar.f6500b);
                    AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p5 = aVar.f6500b;
                    if (abstractComponentCallbacksC0459p5 == abstractComponentCallbacksC0459p2) {
                        this.f6482c.add(i3, new J.a(9, abstractComponentCallbacksC0459p5));
                        i3++;
                        abstractComponentCallbacksC0459p2 = null;
                    }
                } else if (i4 != 7) {
                    if (i4 == 8) {
                        this.f6482c.add(i3, new J.a(9, abstractComponentCallbacksC0459p2, true));
                        aVar.f6501c = true;
                        i3++;
                        abstractComponentCallbacksC0459p2 = aVar.f6500b;
                    }
                }
                i3++;
            }
            arrayList.add(aVar.f6500b);
            i3++;
        }
        return abstractComponentCallbacksC0459p2;
    }

    public String v() {
        return this.f6490k;
    }

    public void w() {
        if (this.f6498s != null) {
            for (int i3 = 0; i3 < this.f6498s.size(); i3++) {
                ((Runnable) this.f6498s.get(i3)).run();
            }
            this.f6498s = null;
        }
    }

    public AbstractComponentCallbacksC0459p x(ArrayList arrayList, AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p) {
        for (int size = this.f6482c.size() - 1; size >= 0; size--) {
            J.a aVar = (J.a) this.f6482c.get(size);
            int i3 = aVar.f6499a;
            if (i3 != 1) {
                if (i3 != 3) {
                    switch (i3) {
                        case 8:
                            abstractComponentCallbacksC0459p = null;
                            break;
                        case 9:
                            abstractComponentCallbacksC0459p = aVar.f6500b;
                            break;
                        case 10:
                            aVar.f6507i = aVar.f6506h;
                            break;
                    }
                }
                arrayList.add(aVar.f6500b);
            }
            arrayList.remove(aVar.f6500b);
        }
        return abstractComponentCallbacksC0459p;
    }
}

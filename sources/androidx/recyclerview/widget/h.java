package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final a f4606a;

    public interface a {
        void a(a.b bVar);

        a.b b(int i3, int i4, int i5, Object obj);
    }

    public h(a aVar) {
        this.f4606a = aVar;
    }

    public final int a(List list) {
        boolean z3 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f4478a != 8) {
                z3 = true;
            } else if (z3) {
                return size;
            }
        }
        return -1;
    }

    public void b(List list) {
        while (true) {
            int a3 = a(list);
            if (a3 == -1) {
                return;
            } else {
                d(list, a3, a3 + 1);
            }
        }
    }

    public final void c(List list, int i3, a.b bVar, int i4, a.b bVar2) {
        int i5 = bVar.f4481d;
        int i6 = bVar2.f4479b;
        int i7 = i5 < i6 ? -1 : 0;
        int i8 = bVar.f4479b;
        if (i8 < i6) {
            i7++;
        }
        if (i6 <= i8) {
            bVar.f4479b = i8 + bVar2.f4481d;
        }
        int i9 = bVar2.f4479b;
        if (i9 <= i5) {
            bVar.f4481d = i5 + bVar2.f4481d;
        }
        bVar2.f4479b = i9 + i7;
        list.set(i3, bVar2);
        list.set(i4, bVar);
    }

    public final void d(List list, int i3, int i4) {
        a.b bVar = (a.b) list.get(i3);
        a.b bVar2 = (a.b) list.get(i4);
        int i5 = bVar2.f4478a;
        if (i5 == 1) {
            c(list, i3, bVar, i4, bVar2);
        } else if (i5 == 2) {
            e(list, i3, bVar, i4, bVar2);
        } else {
            if (i5 != 4) {
                return;
            }
            f(list, i3, bVar, i4, bVar2);
        }
    }

    public void e(List list, int i3, a.b bVar, int i4, a.b bVar2) {
        boolean z3;
        int i5 = bVar.f4479b;
        int i6 = bVar.f4481d;
        boolean z4 = false;
        if (i5 < i6) {
            if (bVar2.f4479b == i5 && bVar2.f4481d == i6 - i5) {
                z3 = false;
                z4 = true;
            } else {
                z3 = false;
            }
        } else if (bVar2.f4479b == i6 + 1 && bVar2.f4481d == i5 - i6) {
            z3 = true;
            z4 = true;
        } else {
            z3 = true;
        }
        int i7 = bVar2.f4479b;
        if (i6 < i7) {
            bVar2.f4479b = i7 - 1;
        } else {
            int i8 = bVar2.f4481d;
            if (i6 < i7 + i8) {
                bVar2.f4481d = i8 - 1;
                bVar.f4478a = 2;
                bVar.f4481d = 1;
                if (bVar2.f4481d == 0) {
                    list.remove(i4);
                    this.f4606a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i9 = bVar.f4479b;
        int i10 = bVar2.f4479b;
        a.b bVar3 = null;
        if (i9 <= i10) {
            bVar2.f4479b = i10 + 1;
        } else {
            int i11 = bVar2.f4481d;
            if (i9 < i10 + i11) {
                bVar3 = this.f4606a.b(2, i9 + 1, (i10 + i11) - i9, null);
                bVar2.f4481d = bVar.f4479b - bVar2.f4479b;
            }
        }
        if (z4) {
            list.set(i3, bVar2);
            list.remove(i4);
            this.f4606a.a(bVar);
            return;
        }
        if (z3) {
            if (bVar3 != null) {
                int i12 = bVar.f4479b;
                if (i12 > bVar3.f4479b) {
                    bVar.f4479b = i12 - bVar3.f4481d;
                }
                int i13 = bVar.f4481d;
                if (i13 > bVar3.f4479b) {
                    bVar.f4481d = i13 - bVar3.f4481d;
                }
            }
            int i14 = bVar.f4479b;
            if (i14 > bVar2.f4479b) {
                bVar.f4479b = i14 - bVar2.f4481d;
            }
            int i15 = bVar.f4481d;
            if (i15 > bVar2.f4479b) {
                bVar.f4481d = i15 - bVar2.f4481d;
            }
        } else {
            if (bVar3 != null) {
                int i16 = bVar.f4479b;
                if (i16 >= bVar3.f4479b) {
                    bVar.f4479b = i16 - bVar3.f4481d;
                }
                int i17 = bVar.f4481d;
                if (i17 >= bVar3.f4479b) {
                    bVar.f4481d = i17 - bVar3.f4481d;
                }
            }
            int i18 = bVar.f4479b;
            if (i18 >= bVar2.f4479b) {
                bVar.f4479b = i18 - bVar2.f4481d;
            }
            int i19 = bVar.f4481d;
            if (i19 >= bVar2.f4479b) {
                bVar.f4481d = i19 - bVar2.f4481d;
            }
        }
        list.set(i3, bVar2);
        if (bVar.f4479b != bVar.f4481d) {
            list.set(i4, bVar);
        } else {
            list.remove(i4);
        }
        if (bVar3 != null) {
            list.add(i3, bVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(java.util.List r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f4481d
            int r1 = r13.f4479b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto Ld
            int r1 = r1 - r3
            r13.f4479b = r1
            goto L20
        Ld:
            int r5 = r13.f4481d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r3
            r13.f4481d = r5
            androidx.recyclerview.widget.h$a r0 = r8.f4606a
            int r1 = r11.f4479b
            java.lang.Object r5 = r13.f4480c
            androidx.recyclerview.widget.a$b r0 = r0.b(r2, r1, r3, r5)
            goto L21
        L20:
            r0 = r4
        L21:
            int r1 = r11.f4479b
            int r5 = r13.f4479b
            if (r1 > r5) goto L2b
            int r5 = r5 + r3
            r13.f4479b = r5
            goto L41
        L2b:
            int r6 = r13.f4481d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.h$a r4 = r8.f4606a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f4480c
            androidx.recyclerview.widget.a$b r4 = r4.b(r2, r1, r5, r3)
            int r1 = r13.f4481d
            int r1 = r1 - r5
            r13.f4481d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f4481d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.h$a r11 = r8.f4606a
            r11.a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r4 == 0) goto L5e
            r9.add(r10, r4)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}

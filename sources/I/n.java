package I;

import java.util.Locale;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final m f792a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final m f793b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final m f794c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f795d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f796e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f797f;

    public static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f798b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f799a;

        public a(boolean z3) {
            this.f799a = z3;
        }

        @Override // I.n.c
        public int a(CharSequence charSequence, int i3, int i4) {
            int i5 = i4 + i3;
            boolean z3 = false;
            while (i3 < i5) {
                int a3 = n.a(Character.getDirectionality(charSequence.charAt(i3)));
                if (a3 != 0) {
                    if (a3 != 1) {
                        continue;
                        i3++;
                        z3 = z3;
                    } else if (!this.f799a) {
                        return 1;
                    }
                } else if (this.f799a) {
                    return 0;
                }
                z3 = true;
                i3++;
                z3 = z3;
            }
            if (z3) {
                return this.f799a ? 1 : 0;
            }
            return 2;
        }
    }

    public static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f800a = new b();

        @Override // I.n.c
        public int a(CharSequence charSequence, int i3, int i4) {
            int i5 = i4 + i3;
            int i6 = 2;
            while (i3 < i5 && i6 == 2) {
                i6 = n.b(Character.getDirectionality(charSequence.charAt(i3)));
                i3++;
            }
            return i6;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i3, int i4);
    }

    public static abstract class d implements m {

        /* renamed from: a, reason: collision with root package name */
        public final c f801a;

        public d(c cVar) {
            this.f801a = cVar;
        }

        @Override // I.m
        public boolean a(CharSequence charSequence, int i3, int i4) {
            if (charSequence == null || i3 < 0 || i4 < 0 || charSequence.length() - i4 < i3) {
                throw new IllegalArgumentException();
            }
            return this.f801a == null ? b() : c(charSequence, i3, i4);
        }

        public abstract boolean b();

        public final boolean c(CharSequence charSequence, int i3, int i4) {
            int a3 = this.f801a.a(charSequence, i3, i4);
            if (a3 == 0) {
                return true;
            }
            if (a3 != 1) {
                return b();
            }
            return false;
        }
    }

    public static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f802b;

        public e(c cVar, boolean z3) {
            super(cVar);
            this.f802b = z3;
        }

        @Override // I.n.d
        public boolean b() {
            return this.f802b;
        }
    }

    public static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        public static final f f803b = new f();

        public f() {
            super(null);
        }

        @Override // I.n.d
        public boolean b() {
            return o.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f800a;
        f794c = new e(bVar, false);
        f795d = new e(bVar, true);
        f796e = new e(a.f798b, false);
        f797f = f.f803b;
    }

    public static int a(int i3) {
        if (i3 != 0) {
            return (i3 == 1 || i3 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i3) {
        if (i3 != 0) {
            if (i3 == 1 || i3 == 2) {
                return 0;
            }
            switch (i3) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}

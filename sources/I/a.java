package I;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final m f766d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f767e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f768f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f769g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f770h;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f771a;

    /* renamed from: b, reason: collision with root package name */
    public final int f772b;

    /* renamed from: c, reason: collision with root package name */
    public final m f773c;

    /* renamed from: I.a$a, reason: collision with other inner class name */
    public static final class C0020a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f774a;

        /* renamed from: b, reason: collision with root package name */
        public int f775b;

        /* renamed from: c, reason: collision with root package name */
        public m f776c;

        public C0020a() {
            c(a.e(Locale.getDefault()));
        }

        public static a b(boolean z3) {
            return z3 ? a.f770h : a.f769g;
        }

        public a a() {
            return (this.f775b == 2 && this.f776c == a.f766d) ? b(this.f774a) : new a(this.f774a, this.f775b, this.f776c);
        }

        public final void c(boolean z3) {
            this.f774a = z3;
            this.f776c = a.f766d;
            this.f775b = 2;
        }
    }

    public static class b {

        /* renamed from: f, reason: collision with root package name */
        public static final byte[] f777f = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f778a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f779b;

        /* renamed from: c, reason: collision with root package name */
        public final int f780c;

        /* renamed from: d, reason: collision with root package name */
        public int f781d;

        /* renamed from: e, reason: collision with root package name */
        public char f782e;

        static {
            for (int i3 = 0; i3 < 1792; i3++) {
                f777f[i3] = Character.getDirectionality(i3);
            }
        }

        public b(CharSequence charSequence, boolean z3) {
            this.f778a = charSequence;
            this.f779b = z3;
            this.f780c = charSequence.length();
        }

        public static byte c(char c3) {
            return c3 < 1792 ? f777f[c3] : Character.getDirectionality(c3);
        }

        public byte a() {
            char charAt = this.f778a.charAt(this.f781d - 1);
            this.f782e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f778a, this.f781d);
                this.f781d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f781d--;
            byte c3 = c(this.f782e);
            if (!this.f779b) {
                return c3;
            }
            char c4 = this.f782e;
            return c4 == '>' ? h() : c4 == ';' ? f() : c3;
        }

        public byte b() {
            char charAt = this.f778a.charAt(this.f781d);
            this.f782e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f778a, this.f781d);
                this.f781d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f781d++;
            byte c3 = c(this.f782e);
            if (!this.f779b) {
                return c3;
            }
            char c4 = this.f782e;
            return c4 == '<' ? i() : c4 == '&' ? g() : c3;
        }

        public int d() {
            this.f781d = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (this.f781d < this.f780c && i3 == 0) {
                byte b3 = b();
                if (b3 != 0) {
                    if (b3 == 1 || b3 == 2) {
                        if (i5 == 0) {
                            return 1;
                        }
                    } else if (b3 != 9) {
                        switch (b3) {
                            case 14:
                            case 15:
                                i5++;
                                i4 = -1;
                                continue;
                            case 16:
                            case 17:
                                i5++;
                                i4 = 1;
                                continue;
                            case 18:
                                i5--;
                                i4 = 0;
                                continue;
                        }
                    }
                } else if (i5 == 0) {
                    return -1;
                }
                i3 = i5;
            }
            if (i3 == 0) {
                return 0;
            }
            if (i4 != 0) {
                return i4;
            }
            while (this.f781d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i3 == i5) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i3 == i5) {
                            return 1;
                        }
                        break;
                    case 18:
                        i5++;
                        continue;
                }
                i5--;
            }
            return 0;
        }

        public int e() {
            this.f781d = this.f780c;
            int i3 = 0;
            while (true) {
                int i4 = i3;
                while (this.f781d > 0) {
                    byte a3 = a();
                    if (a3 != 0) {
                        if (a3 == 1 || a3 == 2) {
                            if (i3 == 0) {
                                return 1;
                            }
                            if (i4 == 0) {
                                break;
                            }
                        } else if (a3 != 9) {
                            switch (a3) {
                                case 14:
                                case 15:
                                    if (i4 == i3) {
                                        return -1;
                                    }
                                    i3--;
                                    break;
                                case 16:
                                case 17:
                                    if (i4 == i3) {
                                        return 1;
                                    }
                                    i3--;
                                    break;
                                case 18:
                                    i3++;
                                    break;
                                default:
                                    if (i4 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i3 == 0) {
                            return -1;
                        }
                        if (i4 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }

        public final byte f() {
            char charAt;
            int i3 = this.f781d;
            do {
                int i4 = this.f781d;
                if (i4 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f778a;
                int i5 = i4 - 1;
                this.f781d = i5;
                charAt = charSequence.charAt(i5);
                this.f782e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.f781d = i3;
            this.f782e = ';';
            return (byte) 13;
        }

        public final byte g() {
            char charAt;
            do {
                int i3 = this.f781d;
                if (i3 >= this.f780c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f778a;
                this.f781d = i3 + 1;
                charAt = charSequence.charAt(i3);
                this.f782e = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        public final byte h() {
            char charAt;
            int i3 = this.f781d;
            while (true) {
                int i4 = this.f781d;
                if (i4 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f778a;
                int i5 = i4 - 1;
                this.f781d = i5;
                char charAt2 = charSequence.charAt(i5);
                this.f782e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i6 = this.f781d;
                        if (i6 > 0) {
                            CharSequence charSequence2 = this.f778a;
                            int i7 = i6 - 1;
                            this.f781d = i7;
                            charAt = charSequence2.charAt(i7);
                            this.f782e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.f781d = i3;
            this.f782e = '>';
            return (byte) 13;
        }

        public final byte i() {
            char charAt;
            int i3 = this.f781d;
            while (true) {
                int i4 = this.f781d;
                if (i4 >= this.f780c) {
                    this.f781d = i3;
                    this.f782e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f778a;
                this.f781d = i4 + 1;
                char charAt2 = charSequence.charAt(i4);
                this.f782e = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i5 = this.f781d;
                        if (i5 < this.f780c) {
                            CharSequence charSequence2 = this.f778a;
                            this.f781d = i5 + 1;
                            charAt = charSequence2.charAt(i5);
                            this.f782e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }
    }

    static {
        m mVar = n.f794c;
        f766d = mVar;
        f767e = Character.toString((char) 8206);
        f768f = Character.toString((char) 8207);
        f769g = new a(false, 2, mVar);
        f770h = new a(true, 2, mVar);
    }

    public a(boolean z3, int i3, m mVar) {
        this.f771a = z3;
        this.f772b = i3;
        this.f773c = mVar;
    }

    public static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    public static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0020a().a();
    }

    public static boolean e(Locale locale) {
        return o.a(locale) == 1;
    }

    public boolean d() {
        return (this.f772b & 2) != 0;
    }

    public final String f(CharSequence charSequence, m mVar) {
        boolean a3 = mVar.a(charSequence, 0, charSequence.length());
        return (this.f771a || !(a3 || b(charSequence) == 1)) ? this.f771a ? (!a3 || b(charSequence) == -1) ? f768f : "" : "" : f767e;
    }

    public final String g(CharSequence charSequence, m mVar) {
        boolean a3 = mVar.a(charSequence, 0, charSequence.length());
        return (this.f771a || !(a3 || a(charSequence) == 1)) ? this.f771a ? (!a3 || a(charSequence) == -1) ? f768f : "" : "" : f767e;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.f773c, true);
    }

    public CharSequence i(CharSequence charSequence, m mVar, boolean z3) {
        if (charSequence == null) {
            return null;
        }
        boolean a3 = mVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z3) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a3 ? n.f793b : n.f792a));
        }
        if (a3 != this.f771a) {
            spannableStringBuilder.append(a3 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z3) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a3 ? n.f793b : n.f792a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.f773c, true);
    }

    public String k(String str, m mVar, boolean z3) {
        if (str == null) {
            return null;
        }
        return i(str, mVar, z3).toString();
    }
}

package O0;

import N0.k;
import N0.m;

/* loaded from: classes.dex */
public abstract class d {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1531a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1532b;

        static {
            int[] iArr = new int[k.values().length];
            f1532b = iArr;
            try {
                iArr[k.APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1532b[k.CONTEXT_SPECIFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1532b[k.PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1532b[k.UNIVERSAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[m.values().length];
            f1531a = iArr2;
            try {
                iArr2[m.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1531a[m.OBJECT_IDENTIFIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1531a[m.OCTET_STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1531a[m.BIT_STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1531a[m.SET_OF.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1531a[m.SEQUENCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1531a[m.SEQUENCE_OF.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1531a[m.UTC_TIME.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1531a[m.GENERALIZED_TIME.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1531a[m.BOOLEAN.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public static int a(byte b3) {
        return (b3 & 255) >> 6;
    }

    public static int b(k kVar) {
        int i3 = a.f1532b[kVar.ordinal()];
        int i4 = 1;
        if (i3 != 1) {
            i4 = 2;
            if (i3 != 2) {
                i4 = 3;
                if (i3 != 3) {
                    if (i3 == 4) {
                        return 0;
                    }
                    throw new IllegalArgumentException("Unsupported tag class: " + kVar);
                }
            }
        }
        return i4;
    }

    public static int c(byte b3) {
        return b3 & 31;
    }

    public static int d(m mVar) {
        switch (a.f1531a[mVar.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 6;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 17;
            case 6:
            case 7:
                return 16;
            case 8:
                return 23;
            case 9:
                return 24;
            case 10:
                return 1;
            default:
                throw new IllegalArgumentException("Unsupported data type: " + mVar);
        }
    }

    public static boolean e(byte b3) {
        return (b3 & 32) != 0;
    }

    public static byte f(byte b3, int i3) {
        return (byte) ((b3 & 63) | (i3 << 6));
    }

    public static byte g(byte b3, int i3) {
        return (byte) ((b3 & (-32)) | i3);
    }

    public static String h(int i3, int i4) {
        String i5 = i(i3);
        String j3 = j(i4);
        if (i5.isEmpty()) {
            return j3;
        }
        return i5 + " " + j3;
    }

    public static String i(int i3) {
        if (i3 == 0) {
            return "UNIVERSAL";
        }
        if (i3 == 1) {
            return "APPLICATION";
        }
        if (i3 == 2) {
            return "";
        }
        if (i3 == 3) {
            return "PRIVATE";
        }
        throw new IllegalArgumentException("Unsupported type class: " + i3);
    }

    public static String j(int i3) {
        if (i3 == 16) {
            return "SEQUENCE";
        }
        if (i3 == 17) {
            return "SET";
        }
        if (i3 == 23) {
            return "UTC TIME";
        }
        if (i3 == 24) {
            return "GENERALIZED TIME";
        }
        switch (i3) {
            case 1:
                return "BOOLEAN";
            case 2:
                return "INTEGER";
            case 3:
                return "BIT STRING";
            case 4:
                return "OCTET STRING";
            case 5:
                return "NULL";
            case 6:
                return "OBJECT IDENTIFIER";
            default:
                return "0x" + Integer.toHexString(i3);
        }
    }
}

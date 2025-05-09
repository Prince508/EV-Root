package C;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;
import v.AbstractC0754d;

/* loaded from: classes.dex */
public abstract class d {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f133a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f134b;
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public char f135a;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f136b;

        public b(char c3, float[] fArr) {
            this.f135a = c3;
            this.f136b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void d(Path path, float[] fArr, char c3, char c4, float[] fArr2) {
            int i3;
            int i4;
            boolean z3;
            boolean z4;
            char c5;
            char c6;
            int i5;
            float f3;
            boolean z5;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            boolean z6;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            Path path2 = path;
            boolean z7 = false;
            float f19 = fArr[0];
            boolean z8 = true;
            float f20 = fArr[1];
            char c7 = 2;
            float f21 = fArr[2];
            char c8 = 3;
            float f22 = fArr[3];
            float f23 = fArr[4];
            float f24 = fArr[5];
            switch (c4) {
                case 'A':
                case AbstractC0754d.f9728P0 /* 97 */:
                    i3 = 7;
                    i4 = i3;
                    break;
                case 'C':
                case AbstractC0754d.f9736R0 /* 99 */:
                    i3 = 6;
                    i4 = i3;
                    break;
                case 'H':
                case 'V':
                case AbstractC0754d.f9755W0 /* 104 */:
                case 'v':
                    i4 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case AbstractC0754d.f9764Z0 /* 108 */:
                case 'm':
                case 't':
                default:
                    i4 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i4 = 4;
                    break;
                case AbstractC0754d.f9700I0 /* 90 */:
                case 'z':
                    path2.close();
                    path2.moveTo(f23, f24);
                    f19 = f23;
                    f21 = f19;
                    f20 = f24;
                    f22 = f20;
                    i4 = 2;
                    break;
            }
            float f25 = f19;
            float f26 = f20;
            float f27 = f23;
            float f28 = f24;
            int i6 = 0;
            char c9 = c3;
            while (i6 < fArr2.length) {
                if (c4 == 'A') {
                    float f29 = f25;
                    float f30 = f26;
                    z3 = z7;
                    z4 = z8;
                    c5 = c7;
                    c6 = c8;
                    i5 = i6;
                    int i7 = i5 + 5;
                    float f31 = fArr2[i7];
                    int i8 = i5 + 6;
                    float f32 = fArr2[i8];
                    float f33 = fArr2[i5];
                    float f34 = fArr2[i5 + 1];
                    float f35 = fArr2[i5 + 2];
                    if (fArr2[i5 + 3] != 0.0f) {
                        f3 = 0.0f;
                        z5 = z4;
                    } else {
                        f3 = 0.0f;
                        z5 = z3;
                    }
                    f(path, f29, f30, f31, f32, f33, f34, f35, z5, fArr2[i5 + 4] != f3 ? z4 : z3);
                    f21 = fArr2[i7];
                    f25 = f21;
                    f22 = fArr2[i8];
                    f26 = f22;
                } else if (c4 == 'C') {
                    z3 = z7;
                    z4 = z8;
                    c5 = c7;
                    c6 = c8;
                    i5 = i6;
                    int i9 = i5 + 2;
                    int i10 = i5 + 3;
                    int i11 = i5 + 4;
                    int i12 = i5 + 5;
                    path2.cubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i9], fArr2[i10], fArr2[i11], fArr2[i12]);
                    float f36 = fArr2[i11];
                    float f37 = fArr2[i12];
                    float f38 = fArr2[i9];
                    float f39 = fArr2[i10];
                    f25 = f36;
                    f26 = f37;
                    f22 = f39;
                    f21 = f38;
                } else if (c4 != 'H') {
                    if (c4 != 'Q') {
                        z3 = z7;
                        if (c4 == 'V') {
                            z4 = z8;
                            c5 = c7;
                            c6 = c8;
                            i5 = i6;
                            path2.lineTo(f25, fArr2[i5]);
                            f6 = fArr2[i5];
                        } else if (c4 != 'a') {
                            if (c4 != 'c') {
                                z4 = z8;
                                if (c4 != 'h') {
                                    if (c4 != 'q') {
                                        c5 = c7;
                                        if (c4 != 'v') {
                                            if (c4 != 'L') {
                                                if (c4 != 'M') {
                                                    c6 = c8;
                                                    if (c4 == 'S') {
                                                        if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                                            f25 = (f25 * 2.0f) - f21;
                                                            f26 = (f26 * 2.0f) - f22;
                                                        }
                                                        float f40 = f25;
                                                        float f41 = f26;
                                                        int i13 = i6 + 1;
                                                        int i14 = i6 + 2;
                                                        int i15 = i6 + 3;
                                                        path2.cubicTo(f40, f41, fArr2[i6], fArr2[i13], fArr2[i14], fArr2[i15]);
                                                        f4 = fArr2[i6];
                                                        f5 = fArr2[i13];
                                                        f25 = fArr2[i14];
                                                        f26 = fArr2[i15];
                                                        i5 = i6;
                                                    } else if (c4 == 'T') {
                                                        if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                            f25 = (f25 * 2.0f) - f21;
                                                            f26 = (f26 * 2.0f) - f22;
                                                        }
                                                        int i16 = i6 + 1;
                                                        path2.quadTo(f25, f26, fArr2[i6], fArr2[i16]);
                                                        float f42 = fArr2[i6];
                                                        f6 = fArr2[i16];
                                                        f21 = f25;
                                                        f22 = f26;
                                                        i5 = i6;
                                                        f25 = f42;
                                                    } else if (c4 == 'l') {
                                                        int i17 = i6 + 1;
                                                        path2.rLineTo(fArr2[i6], fArr2[i17]);
                                                        f25 += fArr2[i6];
                                                        f12 = fArr2[i17];
                                                    } else if (c4 == 'm') {
                                                        float f43 = fArr2[i6];
                                                        f25 += f43;
                                                        float f44 = fArr2[i6 + 1];
                                                        f26 += f44;
                                                        if (i6 > 0) {
                                                            path2.rLineTo(f43, f44);
                                                        } else {
                                                            path2.rMoveTo(f43, f44);
                                                            f27 = f25;
                                                        }
                                                    } else if (c4 == 's') {
                                                        if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                                            f15 = f26 - f22;
                                                            f16 = f25 - f21;
                                                        } else {
                                                            f16 = 0.0f;
                                                            f15 = 0.0f;
                                                        }
                                                        int i18 = i6 + 1;
                                                        int i19 = i6 + 2;
                                                        int i20 = i6 + 3;
                                                        path2.rCubicTo(f16, f15, fArr2[i6], fArr2[i18], fArr2[i19], fArr2[i20]);
                                                        f9 = fArr2[i6] + f25;
                                                        f10 = fArr2[i18] + f26;
                                                        f25 += fArr2[i19];
                                                        f11 = fArr2[i20];
                                                    } else if (c4 == 't') {
                                                        if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                                            f17 = f25 - f21;
                                                            f18 = f26 - f22;
                                                        } else {
                                                            f18 = 0.0f;
                                                            f17 = 0.0f;
                                                        }
                                                        int i21 = i6 + 1;
                                                        path2.rQuadTo(f17, f18, fArr2[i6], fArr2[i21]);
                                                        float f45 = f17 + f25;
                                                        float f46 = f18 + f26;
                                                        f25 += fArr2[i6];
                                                        f26 += fArr2[i21];
                                                        f22 = f46;
                                                        f21 = f45;
                                                    }
                                                } else {
                                                    c6 = c8;
                                                    f13 = fArr2[i6];
                                                    f14 = fArr2[i6 + 1];
                                                    if (i6 > 0) {
                                                        path2.lineTo(f13, f14);
                                                    } else {
                                                        path2.moveTo(f13, f14);
                                                        f25 = f13;
                                                        f27 = f25;
                                                        f26 = f14;
                                                    }
                                                }
                                                f28 = f26;
                                            } else {
                                                c6 = c8;
                                                int i22 = i6 + 1;
                                                path2.lineTo(fArr2[i6], fArr2[i22]);
                                                f13 = fArr2[i6];
                                                f14 = fArr2[i22];
                                            }
                                            f25 = f13;
                                            f26 = f14;
                                        } else {
                                            c6 = c8;
                                            path2.rLineTo(0.0f, fArr2[i6]);
                                            f12 = fArr2[i6];
                                        }
                                        f26 += f12;
                                    } else {
                                        c5 = c7;
                                        c6 = c8;
                                        int i23 = i6 + 1;
                                        int i24 = i6 + 2;
                                        int i25 = i6 + 3;
                                        path2.rQuadTo(fArr2[i6], fArr2[i23], fArr2[i24], fArr2[i25]);
                                        f9 = fArr2[i6] + f25;
                                        f10 = fArr2[i23] + f26;
                                        f25 += fArr2[i24];
                                        f11 = fArr2[i25];
                                    }
                                    f26 += f11;
                                    f21 = f9;
                                    f22 = f10;
                                } else {
                                    c5 = c7;
                                    c6 = c8;
                                    path2.rLineTo(fArr2[i6], 0.0f);
                                    f25 += fArr2[i6];
                                }
                            } else {
                                z4 = z8;
                                c5 = c7;
                                c6 = c8;
                                int i26 = i6 + 2;
                                int i27 = i6 + 3;
                                int i28 = i6 + 4;
                                int i29 = i6 + 5;
                                path2.rCubicTo(fArr2[i6], fArr2[i6 + 1], fArr2[i26], fArr2[i27], fArr2[i28], fArr2[i29]);
                                float f47 = fArr2[i26] + f25;
                                float f48 = fArr2[i27] + f26;
                                f25 += fArr2[i28];
                                f26 += fArr2[i29];
                                f21 = f47;
                                f22 = f48;
                            }
                            i5 = i6;
                        } else {
                            z4 = z8;
                            c5 = c7;
                            c6 = c8;
                            int i30 = i6 + 5;
                            float f49 = fArr2[i30] + f25;
                            int i31 = i6 + 6;
                            float f50 = fArr2[i31] + f26;
                            float f51 = fArr2[i6];
                            float f52 = fArr2[i6 + 1];
                            float f53 = fArr2[i6 + 2];
                            if (fArr2[i6 + 3] != 0.0f) {
                                f7 = 0.0f;
                                f8 = f26;
                                z6 = z4;
                            } else {
                                f7 = 0.0f;
                                f8 = f26;
                                z6 = z3;
                            }
                            i5 = i6;
                            boolean z9 = fArr2[i6 + 4] != f7 ? z4 : z3;
                            float f54 = f25;
                            f(path, f54, f8, f49, f50, f51, f52, f53, z6, z9);
                            f25 = f54 + fArr2[i30];
                            f26 = f8 + fArr2[i31];
                            f21 = f25;
                            f22 = f26;
                        }
                        f26 = f6;
                    } else {
                        z3 = z7;
                        z4 = z8;
                        c5 = c7;
                        c6 = c8;
                        i5 = i6;
                        int i32 = i5 + 1;
                        int i33 = i5 + 2;
                        int i34 = i5 + 3;
                        path2.quadTo(fArr2[i5], fArr2[i32], fArr2[i33], fArr2[i34]);
                        f4 = fArr2[i5];
                        f5 = fArr2[i32];
                        f25 = fArr2[i33];
                        f26 = fArr2[i34];
                    }
                    f21 = f4;
                    f22 = f5;
                } else {
                    z3 = z7;
                    z4 = z8;
                    c5 = c7;
                    c6 = c8;
                    i5 = i6;
                    path2.lineTo(fArr2[i5], f26);
                    f25 = fArr2[i5];
                }
                i6 = i5 + i4;
                path2 = path;
                c9 = c4;
                z7 = z3;
                z8 = z4;
                c7 = c5;
                c8 = c6;
            }
            fArr[z7 ? 1 : 0] = f25;
            fArr[z8 ? 1 : 0] = f26;
            fArr[c7] = f21;
            fArr[c8] = f22;
            fArr[4] = f27;
            fArr[5] = f28;
        }

        public static void e(Path path, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
            double d12 = d5;
            int ceil = (int) Math.ceil(Math.abs((d11 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d9);
            double sin = Math.sin(d9);
            double cos2 = Math.cos(d10);
            double sin2 = Math.sin(d10);
            double d13 = -d12;
            double d14 = d13 * cos;
            double d15 = d6 * sin;
            double d16 = (d14 * sin2) - (d15 * cos2);
            double d17 = d13 * sin;
            double d18 = d6 * cos;
            double d19 = (sin2 * d17) + (cos2 * d18);
            double d20 = d11 / ceil;
            double d21 = d19;
            double d22 = d16;
            int i3 = 0;
            double d23 = d7;
            double d24 = d8;
            double d25 = d10;
            while (i3 < ceil) {
                double d26 = d25 + d20;
                double sin3 = Math.sin(d26);
                double cos3 = Math.cos(d26);
                double d27 = (d3 + ((d12 * cos) * cos3)) - (d15 * sin3);
                int i4 = i3;
                double d28 = d4 + (d5 * sin * cos3) + (d18 * sin3);
                double d29 = (d14 * sin3) - (d15 * cos3);
                double d30 = (sin3 * d17) + (cos3 * d18);
                double d31 = d26 - d25;
                double tan = Math.tan(d31 / 2.0d);
                double sin4 = (Math.sin(d31) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d32 = d23 + (d22 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d32, (float) (d24 + (d21 * sin4)), (float) (d27 - (sin4 * d29)), (float) (d28 - (sin4 * d30)), (float) d27, (float) d28);
                sin = sin;
                d20 = d20;
                d23 = d27;
                d17 = d17;
                d25 = d26;
                d21 = d30;
                cos = cos;
                d12 = d5;
                d24 = d28;
                i3 = i4 + 1;
                ceil = ceil;
                d22 = d29;
            }
        }

        public static void f(Path path, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z3, boolean z4) {
            double d3;
            double d4;
            double radians = Math.toRadians(f9);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d5 = f3;
            double d6 = f4;
            double d7 = f7;
            double d8 = ((d5 * cos) + (d6 * sin)) / d7;
            double d9 = f8;
            double d10 = (((-f3) * sin) + (d6 * cos)) / d9;
            double d11 = f6;
            double d12 = ((f5 * cos) + (d11 * sin)) / d7;
            double d13 = (((-f5) * sin) + (d11 * cos)) / d9;
            double d14 = d8 - d12;
            double d15 = d10 - d13;
            double d16 = (d8 + d12) / 2.0d;
            double d17 = (d10 + d13) / 2.0d;
            double d18 = (d14 * d14) + (d15 * d15);
            if (d18 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d19 = (1.0d / d18) - 0.25d;
            if (d19 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d18);
                float sqrt = (float) (Math.sqrt(d18) / 1.99999d);
                f(path, f3, f4, f5, f6, f7 * sqrt, sqrt * f8, f9, z3, z4);
                return;
            }
            double sqrt2 = Math.sqrt(d19);
            double d20 = d14 * sqrt2;
            double d21 = sqrt2 * d15;
            if (z3 == z4) {
                d3 = d16 - d21;
                d4 = d17 + d20;
            } else {
                d3 = d16 + d21;
                d4 = d17 - d20;
            }
            double atan2 = Math.atan2(d10 - d4, d8 - d3);
            double atan22 = Math.atan2(d13 - d4, d12 - d3) - atan2;
            if (z4 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d22 = d3 * d7;
            double d23 = d4 * d9;
            e(path, (d22 * cos) - (d23 * sin), (d22 * sin) + (d23 * cos), d7, d9, d5, d6, radians, atan2, atan22);
        }

        public static void g(b[] bVarArr, Path path) {
            d.h(bVarArr, path);
        }
    }

    public static void a(ArrayList arrayList, char c3, float[] fArr) {
        arrayList.add(new b(c3, fArr));
    }

    public static float[] b(float[] fArr, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i3 < 0 || i3 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i5 = i4 - i3;
        int min = Math.min(i5, length - i3);
        float[] fArr2 = new float[i5];
        System.arraycopy(fArr, i3, fArr2, 0, min);
        return fArr2;
    }

    public static b[] c(String str) {
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            int g3 = g(str, i4);
            String trim = str.substring(i3, g3).trim();
            if (!trim.isEmpty()) {
                a(arrayList, trim.charAt(0), f(trim));
            }
            i3 = g3;
            i4 = g3 + 1;
        }
        if (i4 - i3 == 1 && i3 < str.length()) {
            a(arrayList, str.charAt(i3), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    public static Path d(String str) {
        Path path = new Path();
        try {
            b.g(c(str), path);
            return path;
        } catch (RuntimeException e3) {
            throw new RuntimeException("Error in parsing " + str, e3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039 A[LOOP:0: B:2:0x0007->B:14:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.lang.String r8, int r9, C.d.a r10) {
        /*
            r0 = 0
            r10.f134b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L36
        L27:
            r10.f134b = r7
        L29:
            r2 = r0
            r4 = r7
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.f134b = r7
            goto L29
        L33:
            r2 = r0
            goto L36
        L35:
            r2 = r7
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.f133a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C.d.e(java.lang.String, int, C.d$a):void");
    }

    public static float[] f(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i3 = 1;
            int i4 = 0;
            while (i3 < length) {
                e(str, i3, aVar);
                int i5 = aVar.f133a;
                if (i3 < i5) {
                    fArr[i4] = Float.parseFloat(str.substring(i3, i5));
                    i4++;
                }
                i3 = aVar.f134b ? i5 : i5 + 1;
            }
            return b(fArr, 0, i4);
        } catch (NumberFormatException e3) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e3);
        }
    }

    public static int g(String str, int i3) {
        while (i3 < str.length()) {
            char charAt = str.charAt(i3);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                break;
            }
            i3++;
        }
        return i3;
    }

    public static void h(b[] bVarArr, Path path) {
        float[] fArr = new float[6];
        char c3 = 'm';
        for (b bVar : bVarArr) {
            b.d(path, fArr, c3, bVar.f135a, bVar.f136b);
            c3 = bVar.f135a;
        }
    }
}

package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* renamed from: io.flutter.plugin.editing.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0510a {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f7641a;

    public C0510a(FlutterJNI flutterJNI) {
        this.f7641a = flutterJNI;
    }

    public int a(CharSequence charSequence, int i3) {
        int charCount;
        int length = charSequence.length();
        int i4 = length - 1;
        if (i3 >= i4) {
            return length;
        }
        int codePointAt = Character.codePointAt(charSequence, i3);
        int charCount2 = Character.charCount(codePointAt);
        int i5 = i3 + charCount2;
        int i6 = 0;
        if (i5 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (Character.codePointAt(charSequence, i5) == 13) {
                charCount2++;
            }
            return i3 + charCount2;
        }
        if (g(codePointAt)) {
            if (i5 >= i4 || !g(Character.codePointAt(charSequence, i5))) {
                return i5;
            }
            int i7 = i3;
            while (i7 > 0 && g(Character.codePointBefore(charSequence, i3))) {
                i7 -= Character.charCount(Character.codePointBefore(charSequence, i3));
                i6++;
            }
            if (i6 % 2 == 0) {
                charCount2 += 2;
            }
            return i3 + charCount2;
        }
        if (f(codePointAt)) {
            charCount2 += Character.charCount(codePointAt);
        }
        if (codePointAt == 8419) {
            int codePointBefore = Character.codePointBefore(charSequence, i5);
            int charCount3 = i5 + Character.charCount(codePointBefore);
            if (charCount3 < length && i(codePointBefore)) {
                int codePointAt2 = Character.codePointAt(charSequence, charCount3);
                if (f(codePointAt2)) {
                    charCount2 += Character.charCount(codePointBefore) + Character.charCount(codePointAt2);
                }
            } else if (f(codePointBefore)) {
                charCount2 += Character.charCount(codePointBefore);
            }
            return i3 + charCount2;
        }
        if (c(codePointAt)) {
            boolean z3 = false;
            int i8 = 0;
            do {
                if (z3) {
                    charCount2 += Character.charCount(codePointAt) + i8 + 1;
                    z3 = false;
                }
                if (d(codePointAt)) {
                    break;
                }
                if (i5 < length) {
                    codePointAt = Character.codePointAt(charSequence, i5);
                    i5 += Character.charCount(codePointAt);
                    if (codePointAt != 8419) {
                        if (!d(codePointAt)) {
                            if (!i(codePointAt)) {
                                if (codePointAt == 8205) {
                                    codePointAt = Character.codePointAt(charSequence, i5);
                                    i5 += Character.charCount(codePointAt);
                                    if (i5 >= length || !i(codePointAt)) {
                                        i8 = 0;
                                    } else {
                                        codePointAt = Character.codePointAt(charSequence, i5);
                                        int charCount4 = Character.charCount(codePointAt);
                                        i5 += Character.charCount(codePointAt);
                                        i8 = charCount4;
                                    }
                                    z3 = true;
                                    if (i5 < length || !z3) {
                                        break;
                                        break;
                                    }
                                }
                            } else {
                                charCount = Character.charCount(codePointAt);
                            }
                        } else {
                            charCount = Character.charCount(codePointAt);
                        }
                        charCount2 += charCount;
                        break;
                    }
                    int codePointBefore2 = Character.codePointBefore(charSequence, i5);
                    int charCount5 = i5 + Character.charCount(codePointBefore2);
                    if (charCount5 < length && i(codePointBefore2)) {
                        int codePointAt3 = Character.codePointAt(charSequence, charCount5);
                        if (f(codePointAt3)) {
                            charCount2 += Character.charCount(codePointBefore2) + Character.charCount(codePointAt3);
                        }
                    } else if (f(codePointBefore2)) {
                        charCount2 += Character.charCount(codePointBefore2);
                    }
                    return i3 + charCount2;
                }
                i8 = 0;
                if (i5 < length) {
                    break;
                }
            } while (c(codePointAt));
        }
        return i3 + charCount2;
    }

    public int b(CharSequence charSequence, int i3) {
        int codePointBefore;
        int charCount;
        int charCount2;
        int i4 = 0;
        int i5 = 1;
        if (i3 <= 1 || (charCount2 = i3 - (charCount = Character.charCount((codePointBefore = Character.codePointBefore(charSequence, i3))))) == 0) {
            return 0;
        }
        if (codePointBefore == 10) {
            if (Character.codePointBefore(charSequence, charCount2) == 13) {
                charCount++;
            }
            return i3 - charCount;
        }
        if (g(codePointBefore)) {
            int codePointBefore2 = Character.codePointBefore(charSequence, charCount2);
            int charCount3 = charCount2 - Character.charCount(codePointBefore2);
            while (charCount3 > 0 && g(codePointBefore2)) {
                codePointBefore2 = Character.codePointBefore(charSequence, charCount3);
                charCount3 -= Character.charCount(codePointBefore2);
                i5++;
            }
            if (i5 % 2 == 0) {
                charCount += 2;
            }
            return i3 - charCount;
        }
        if (codePointBefore == 8419) {
            int codePointBefore3 = Character.codePointBefore(charSequence, charCount2);
            int charCount4 = charCount2 - Character.charCount(codePointBefore3);
            if (charCount4 > 0 && i(codePointBefore3)) {
                int codePointBefore4 = Character.codePointBefore(charSequence, charCount4);
                if (f(codePointBefore4)) {
                    charCount += Character.charCount(codePointBefore3) + Character.charCount(codePointBefore4);
                }
            } else if (f(codePointBefore3)) {
                charCount += Character.charCount(codePointBefore3);
            }
            return i3 - charCount;
        }
        if (codePointBefore == 917631) {
            codePointBefore = Character.codePointBefore(charSequence, charCount2);
            int charCount5 = Character.charCount(codePointBefore);
            while (true) {
                charCount2 -= charCount5;
                if (charCount2 <= 0 || !h(codePointBefore)) {
                    break;
                }
                charCount += Character.charCount(codePointBefore);
                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                charCount5 = Character.charCount(codePointBefore);
            }
            if (!c(codePointBefore)) {
                return i3 - 2;
            }
            charCount += Character.charCount(codePointBefore);
        }
        if (i(codePointBefore)) {
            codePointBefore = Character.codePointBefore(charSequence, charCount2);
            if (!c(codePointBefore)) {
                return i3 - charCount;
            }
            charCount += Character.charCount(codePointBefore);
            charCount2 -= charCount;
        }
        if (c(codePointBefore)) {
            boolean z3 = false;
            int i6 = 0;
            while (true) {
                if (z3) {
                    charCount += Character.charCount(codePointBefore) + i6 + 1;
                    z3 = false;
                }
                if (d(codePointBefore)) {
                    int codePointBefore5 = Character.codePointBefore(charSequence, charCount2);
                    int charCount6 = charCount2 - Character.charCount(codePointBefore5);
                    if (charCount6 > 0 && i(codePointBefore5)) {
                        codePointBefore5 = Character.codePointBefore(charSequence, charCount6);
                        if (!c(codePointBefore5)) {
                            return i3 - charCount;
                        }
                        i4 = Character.charCount(codePointBefore5);
                        Character.charCount(codePointBefore5);
                    }
                    if (e(codePointBefore5)) {
                        charCount += i4 + Character.charCount(codePointBefore5);
                    }
                } else {
                    if (charCount2 > 0) {
                        codePointBefore = Character.codePointBefore(charSequence, charCount2);
                        charCount2 -= Character.charCount(codePointBefore);
                        if (codePointBefore == 8205) {
                            codePointBefore = Character.codePointBefore(charSequence, charCount2);
                            charCount2 -= Character.charCount(codePointBefore);
                            if (charCount2 <= 0 || !i(codePointBefore)) {
                                i6 = 0;
                            } else {
                                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                                int charCount7 = Character.charCount(codePointBefore);
                                charCount2 -= Character.charCount(codePointBefore);
                                i6 = charCount7;
                            }
                            z3 = true;
                            if (charCount2 != 0 || !z3 || !c(codePointBefore)) {
                                break;
                                break;
                            }
                        }
                    }
                    i6 = 0;
                    if (charCount2 != 0) {
                        break;
                    }
                }
            }
        }
        return i3 - charCount;
    }

    public boolean c(int i3) {
        return this.f7641a.isCodePointEmoji(i3);
    }

    public boolean d(int i3) {
        return this.f7641a.isCodePointEmojiModifier(i3);
    }

    public boolean e(int i3) {
        return this.f7641a.isCodePointEmojiModifierBase(i3);
    }

    public boolean f(int i3) {
        return (48 <= i3 && i3 <= 57) || i3 == 35 || i3 == 42;
    }

    public boolean g(int i3) {
        return this.f7641a.isCodePointRegionalIndicator(i3);
    }

    public boolean h(int i3) {
        return 917536 <= i3 && i3 <= 917630;
    }

    public boolean i(int i3) {
        return this.f7641a.isCodePointVariantSelector(i3);
    }
}

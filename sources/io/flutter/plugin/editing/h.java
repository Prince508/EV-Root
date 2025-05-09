package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.i;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public class h extends BaseInputConnection implements i.b {

    /* renamed from: a, reason: collision with root package name */
    public final View f7642a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7643b;

    /* renamed from: c, reason: collision with root package name */
    public final h2.w f7644c;

    /* renamed from: d, reason: collision with root package name */
    public final i f7645d;

    /* renamed from: e, reason: collision with root package name */
    public final EditorInfo f7646e;

    /* renamed from: f, reason: collision with root package name */
    public ExtractedTextRequest f7647f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7648g;

    /* renamed from: h, reason: collision with root package name */
    public CursorAnchorInfo.Builder f7649h;

    /* renamed from: i, reason: collision with root package name */
    public ExtractedText f7650i;

    /* renamed from: j, reason: collision with root package name */
    public InputMethodManager f7651j;

    /* renamed from: k, reason: collision with root package name */
    public final Layout f7652k;

    /* renamed from: l, reason: collision with root package name */
    public C0510a f7653l;

    /* renamed from: m, reason: collision with root package name */
    public final a f7654m;

    /* renamed from: n, reason: collision with root package name */
    public int f7655n;

    public interface a {
        boolean b(KeyEvent keyEvent);
    }

    public h(View view, int i3, h2.w wVar, a aVar, i iVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f7648g = false;
        this.f7650i = new ExtractedText();
        this.f7655n = 0;
        this.f7642a = view;
        this.f7643b = i3;
        this.f7644c = wVar;
        this.f7645d = iVar;
        iVar.a(this);
        this.f7646e = editorInfo;
        this.f7654m = aVar;
        this.f7653l = new C0510a(flutterJNI);
        this.f7652k = new DynamicLayout(iVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f7651j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    @Override // io.flutter.plugin.editing.i.b
    public void a(boolean z3, boolean z4, boolean z5) {
        this.f7651j.updateSelection(this.f7642a, this.f7645d.i(), this.f7645d.h(), this.f7645d.g(), this.f7645d.f());
        ExtractedTextRequest extractedTextRequest = this.f7647f;
        if (extractedTextRequest != null) {
            this.f7651j.updateExtractedText(this.f7642a, extractedTextRequest.token, d(extractedTextRequest));
        }
        if (this.f7648g) {
            this.f7651j.updateCursorAnchorInfo(this.f7642a, c());
        }
    }

    public final boolean b(int i3) {
        if (i3 == 16908319) {
            setSelection(0, this.f7645d.length());
            return true;
        }
        if (i3 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f7645d);
            int selectionEnd = Selection.getSelectionEnd(this.f7645d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f7642a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f7645d.subSequence(min, max)));
                this.f7645d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        }
        if (i3 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f7645d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f7645d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f7642a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f7645d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        }
        if (i3 != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.f7642a.getContext().getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip != null) {
            CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f7642a.getContext());
            int max2 = Math.max(0, Selection.getSelectionStart(this.f7645d));
            int max3 = Math.max(0, Selection.getSelectionEnd(this.f7645d));
            int min2 = Math.min(max2, max3);
            int max4 = Math.max(max2, max3);
            if (min2 != max4) {
                this.f7645d.delete(min2, max4);
            }
            this.f7645d.insert(min2, coerceToText);
            int length = min2 + coerceToText.length();
            setSelection(length, length);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f7645d.b();
        this.f7655n++;
        return super.beginBatchEdit();
    }

    public final CursorAnchorInfo c() {
        CursorAnchorInfo.Builder builder = this.f7649h;
        if (builder == null) {
            this.f7649h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f7649h.setSelectionRange(this.f7645d.i(), this.f7645d.h());
        int g3 = this.f7645d.g();
        int f3 = this.f7645d.f();
        if (g3 < 0 || f3 <= g3) {
            this.f7649h.setComposingText(-1, "");
        } else {
            this.f7649h.setComposingText(g3, this.f7645d.toString().subSequence(g3, f3));
        }
        return this.f7649h.build();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i3) {
        return super.clearMetaKeyStates(i3);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f7645d.l(this);
        while (this.f7655n > 0) {
            endBatchEdit();
            this.f7655n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        ClipDescription description;
        Uri contentUri;
        ClipDescription description2;
        if (Build.VERSION.SDK_INT >= 25 && (i3 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                description = inputContentInfo.getDescription();
                if (description.getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    contentUri = inputContentInfo.getContentUri();
                    description2 = inputContentInfo.getDescription();
                    String mimeType = description2.getMimeType(0);
                    Context context = this.f7642a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] h3 = h(openInputStream, 65536);
                                HashMap hashMap = new HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put("data", h3);
                                hashMap.put("uri", contentUri.toString());
                                this.f7644c.b(this.f7643b, hashMap);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i3) {
        return super.commitText(charSequence, i3);
    }

    public final ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f7650i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f7645d.i();
        this.f7650i.selectionEnd = this.f7645d.h();
        this.f7650i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f7645d.toString() : this.f7645d;
        return this.f7650i;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i3, int i4) {
        if (this.f7645d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i3, i4);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i3, int i4) {
        return super.deleteSurroundingTextInCodePoints(i3, i4);
    }

    public final boolean e(boolean z3, boolean z4) {
        int selectionStart = Selection.getSelectionStart(this.f7645d);
        int selectionEnd = Selection.getSelectionEnd(this.f7645d);
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z3 ? Math.max(this.f7653l.b(this.f7645d, selectionEnd), 0) : Math.min(this.f7653l.a(this.f7645d, selectionEnd), this.f7645d.length());
        if (selectionStart != selectionEnd || z4) {
            setSelection(selectionStart, max);
            return true;
        }
        setSelection(max, max);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f7655n--;
        this.f7645d.d();
        return endBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f7646e;
                if ((editorInfo.inputType & 131072) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f7645d);
            int selectionEnd = Selection.getSelectionEnd(this.f7645d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart >= 0 && selectionEnd >= 0 && unicodeChar != 0) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                beginBatchEdit();
                if (min != max) {
                    this.f7645d.delete(min, max);
                }
                this.f7645d.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
                int i3 = min + 1;
                setSelection(i3, i3);
                endBatchEdit();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    public final boolean g(boolean z3, boolean z4) {
        int selectionStart = Selection.getSelectionStart(this.f7645d);
        int selectionEnd = Selection.getSelectionEnd(this.f7645d);
        boolean z5 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z4) {
            z5 = true;
        }
        beginBatchEdit();
        if (z5) {
            if (z3) {
                Selection.moveUp(this.f7645d, this.f7652k);
            } else {
                Selection.moveDown(this.f7645d, this.f7652k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f7645d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z3) {
                Selection.extendUp(this.f7645d, this.f7652k);
            } else {
                Selection.extendDown(this.f7645d, this.f7652k);
            }
            setSelection(Selection.getSelectionStart(this.f7645d), Selection.getSelectionEnd(this.f7645d));
        }
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f7645d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i3) {
        boolean z3 = (i3 & 1) != 0;
        if (z3 == (this.f7647f == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z3 ? "on" : "off");
            W1.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f7647f = z3 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    public final byte[] h(InputStream inputStream, int i3) {
        int i4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i3];
        while (true) {
            try {
                i4 = inputStream.read(bArr);
            } catch (IOException unused) {
                i4 = -1;
            }
            if (i4 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i4);
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i3) {
        beginBatchEdit();
        boolean b3 = b(i3);
        endBatchEdit();
        return b3;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i3) {
        if (i3 == 0) {
            this.f7644c.o(this.f7643b);
        } else if (i3 == 1) {
            this.f7644c.g(this.f7643b);
        } else if (i3 == 2) {
            this.f7644c.f(this.f7643b);
        } else if (i3 == 3) {
            this.f7644c.l(this.f7643b);
        } else if (i3 == 4) {
            this.f7644c.m(this.f7643b);
        } else if (i3 == 5) {
            this.f7644c.h(this.f7643b);
        } else if (i3 != 7) {
            this.f7644c.e(this.f7643b);
        } else {
            this.f7644c.j(this.f7643b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f7644c.i(this.f7643b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i3) {
        if ((i3 & 1) != 0) {
            this.f7651j.updateCursorAnchorInfo(this.f7642a, c());
        }
        boolean z3 = (i3 & 2) != 0;
        if (z3 != this.f7648g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z3 ? "on" : "off");
            W1.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f7648g = z3;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f7654m.b(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i3, int i4) {
        return super.setComposingRegion(i3, i4);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i3) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i3) : super.setComposingText(charSequence, i3);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i3, int i4) {
        beginBatchEdit();
        boolean selection = super.setSelection(i3, i4);
        endBatchEdit();
        return selection;
    }

    public h(View view, int i3, h2.w wVar, a aVar, i iVar, EditorInfo editorInfo) {
        this(view, i3, wVar, aVar, iVar, editorInfo, new FlutterJNI());
    }
}

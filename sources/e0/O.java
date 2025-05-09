package e0;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
public final class O extends Writer {

    /* renamed from: e, reason: collision with root package name */
    public final String f6538e;

    /* renamed from: f, reason: collision with root package name */
    public StringBuilder f6539f = new StringBuilder(128);

    public O(String str) {
        this.f6538e = str;
    }

    public final void a() {
        if (this.f6539f.length() > 0) {
            Log.d(this.f6538e, this.f6539f.toString());
            StringBuilder sb = this.f6539f;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c3 = cArr[i3 + i5];
            if (c3 == '\n') {
                a();
            } else {
                this.f6539f.append(c3);
            }
        }
    }
}

package Y1;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class D {

    /* renamed from: a, reason: collision with root package name */
    public long f2431a;

    /* renamed from: b, reason: collision with root package name */
    public b f2432b;

    /* renamed from: c, reason: collision with root package name */
    public long f2433c;

    /* renamed from: d, reason: collision with root package name */
    public long f2434d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2435e;

    /* renamed from: f, reason: collision with root package name */
    public a f2436f;

    /* renamed from: g, reason: collision with root package name */
    public String f2437g;

    public enum a {
        kKeyboard(0),
        kDirectionalPad(1),
        kGamepad(2),
        kJoystick(3),
        kHdmi(4);


        /* renamed from: e, reason: collision with root package name */
        public final long f2444e;

        a(long j3) {
            this.f2444e = j3;
        }

        public long f() {
            return this.f2444e;
        }
    }

    public enum b {
        kDown(0),
        kUp(1),
        kRepeat(2);


        /* renamed from: e, reason: collision with root package name */
        public long f2449e;

        b(long j3) {
            this.f2449e = j3;
        }

        public long f() {
            return this.f2449e;
        }
    }

    public ByteBuffer a() {
        try {
            String str = this.f2437g;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(this.f2431a);
            allocateDirect.putLong(this.f2432b.f());
            allocateDirect.putLong(this.f2433c);
            allocateDirect.putLong(this.f2434d);
            allocateDirect.putLong(this.f2435e ? 1L : 0L);
            allocateDirect.putLong(this.f2436f.f());
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}

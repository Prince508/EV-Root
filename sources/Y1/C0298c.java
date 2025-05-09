package Y1;

import android.R;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0298c {

    /* renamed from: f, reason: collision with root package name */
    public static final Matrix f2497f = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterRenderer f2498a;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2500c;

    /* renamed from: e, reason: collision with root package name */
    public int f2502e;

    /* renamed from: d, reason: collision with root package name */
    public final Map f2501d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final K f2499b = K.a();

    public C0298c(FlutterRenderer flutterRenderer, boolean z3) {
        this.f2498a = flutterRenderer;
        this.f2500c = z3;
    }

    public final void a(MotionEvent motionEvent, int i3, int i4, int i5, Matrix matrix, ByteBuffer byteBuffer) {
        b(motionEvent, i3, i4, i5, matrix, byteBuffer, null);
    }

    public final void b(MotionEvent motionEvent, int i3, int i4, int i5, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i6;
        int i7;
        long j3;
        int i8;
        int i9;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        InputDevice.MotionRange motionRange;
        if (i4 == -1) {
            return;
        }
        int pointerId = motionEvent.getPointerId(i3);
        int f3 = f(motionEvent.getToolType(i3));
        float[] fArr = {motionEvent.getX(i3), motionEvent.getY(i3)};
        matrix.mapPoints(fArr);
        if (f3 == 1) {
            i7 = 0;
            i6 = 1;
            j3 = motionEvent.getButtonState() & 31;
            if (j3 == 0 && motionEvent.getSource() == 8194 && i4 == 4) {
                this.f2501d.put(Integer.valueOf(pointerId), fArr);
            }
        } else {
            i6 = 1;
            i7 = 0;
            j3 = f3 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = this.f2501d.containsKey(Integer.valueOf(pointerId));
        if (containsKey) {
            i8 = e(i4);
            if (i8 == -1) {
                return;
            }
        } else {
            i8 = -1;
        }
        long d9 = this.f2500c ? this.f2499b.c(motionEvent).d() : 0L;
        int i10 = motionEvent.getActionMasked() == 8 ? i6 : i7;
        int i11 = i8;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(d9);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            i9 = i11;
            byteBuffer.putLong(i9);
            byteBuffer.putLong(4L);
        } else {
            i9 = i11;
            byteBuffer.putLong(i4);
            byteBuffer.putLong(f3);
        }
        byteBuffer.putLong(i10);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr2 = (float[]) this.f2501d.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr2[i7]);
            byteBuffer.putDouble(fArr2[i6]);
        } else {
            byteBuffer.putDouble(fArr[i7]);
            byteBuffer.putDouble(fArr[i6]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j3);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i3));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d3 = 0.0d;
            d4 = 1.0d;
        } else {
            d3 = motionRange.getMin();
            d4 = motionRange.getMax();
        }
        byteBuffer.putDouble(d3);
        byteBuffer.putDouble(d4);
        if (f3 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i3));
            d5 = 0.0d;
            byteBuffer.putDouble(0.0d);
        } else {
            d5 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i3));
        byteBuffer.putDouble(motionEvent.getToolMajor(i3));
        byteBuffer.putDouble(motionEvent.getToolMinor(i3));
        byteBuffer.putDouble(d5);
        byteBuffer.putDouble(d5);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i3));
        if (f3 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i3));
        } else {
            byteBuffer.putDouble(d5);
        }
        byteBuffer.putLong(i5);
        if (i10 == i6) {
            if (context != null) {
                d7 = c(context);
                d8 = g(context);
            } else {
                d7 = 48.0d;
                d8 = 48.0d;
            }
            byteBuffer.putDouble(d7 * (-motionEvent.getAxisValue(10, i3)));
            byteBuffer.putDouble(d8 * (-motionEvent.getAxisValue(9, i3)));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr3 = (float[]) this.f2501d.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[i7] - fArr3[i7]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d6 = 0.0d;
        } else {
            d6 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d6);
        byteBuffer.putDouble(d6);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d6);
        byteBuffer.putLong(0L);
        if (containsKey && i9 == 9) {
            this.f2501d.remove(Integer.valueOf(pointerId));
        }
    }

    public final float c(Context context) {
        float scaledHorizontalScrollFactor;
        if (Build.VERSION.SDK_INT < 26) {
            return i(context);
        }
        scaledHorizontalScrollFactor = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
        return scaledHorizontalScrollFactor;
    }

    public final int d(int i3) {
        if (i3 == 0) {
            return 4;
        }
        if (i3 == 1) {
            return 6;
        }
        if (i3 == 5) {
            return 4;
        }
        if (i3 == 6) {
            return 6;
        }
        if (i3 == 2) {
            return 5;
        }
        if (i3 == 7) {
            return 3;
        }
        if (i3 == 3) {
            return 0;
        }
        return i3 == 8 ? 3 : -1;
    }

    public final int e(int i3) {
        if (i3 == 4) {
            return 7;
        }
        if (i3 == 5) {
            return 8;
        }
        return (i3 == 6 || i3 == 0) ? 9 : -1;
    }

    public final int f(int i3) {
        if (i3 == 1) {
            return 0;
        }
        if (i3 == 2) {
            return 2;
        }
        if (i3 != 3) {
            return i3 != 4 ? 5 : 3;
        }
        return 1;
    }

    public final float g(Context context) {
        return Build.VERSION.SDK_INT >= 26 ? h(context) : i(context);
    }

    public final float h(Context context) {
        float scaledVerticalScrollFactor;
        scaledVerticalScrollFactor = ViewConfiguration.get(context).getScaledVerticalScrollFactor();
        return scaledVerticalScrollFactor;
    }

    public final int i(Context context) {
        if (this.f2502e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.f2502e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2502e;
    }

    public boolean j(MotionEvent motionEvent, Context context) {
        boolean isFromSource = motionEvent.isFromSource(2);
        boolean z3 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!isFromSource || !z3) {
            return false;
        }
        int d3 = d(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        b(motionEvent, motionEvent.getActionIndex(), d3, 0, f2497f, allocateDirect, context);
        if (allocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.f2498a.h(allocateDirect, allocateDirect.position());
        return true;
    }

    public boolean k(MotionEvent motionEvent) {
        return l(motionEvent, f2497f);
    }

    public boolean l(MotionEvent motionEvent, Matrix matrix) {
        C0298c c0298c;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pointerCount * 288);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int d3 = d(motionEvent.getActionMasked());
        boolean z3 = actionMasked == 0 || actionMasked == 5;
        boolean z4 = !z3 && (actionMasked == 1 || actionMasked == 6);
        if (z3) {
            c0298c = this;
            c0298c.a(motionEvent, motionEvent.getActionIndex(), d3, 0, matrix, allocateDirect);
        } else if (z4) {
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (i3 != motionEvent.getActionIndex() && motionEvent.getToolType(i3) == 1) {
                    a(motionEvent, i3, 5, 1, matrix, allocateDirect);
                }
            }
            c0298c = this;
            c0298c.a(motionEvent, motionEvent.getActionIndex(), d3, 0, matrix, allocateDirect);
        } else {
            for (int i4 = 0; i4 < pointerCount; i4++) {
                a(motionEvent, i4, d3, 0, matrix, allocateDirect);
            }
            c0298c = this;
        }
        if (allocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        c0298c.f2498a.h(allocateDirect, allocateDirect.position());
        return true;
    }
}

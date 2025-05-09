package com.easyvictory.cheto.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Process;
import android.view.View;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public abstract class ESPView extends View implements Runnable {
    Paint filledPaint;
    int fps;
    long sleepTime;
    Paint strokePaint;
    Paint textPaint;
    Thread thread;

    public ESPView(Context context) {
        super(context, null, 0);
        this.fps = 60;
        InitializePaints();
        setFocusableInTouchMode(false);
        setBackgroundColor(0);
        this.sleepTime = 1000 / this.fps;
        Thread thread = new Thread(this);
        this.thread = thread;
        thread.start();
    }

    public void InitializePaints() {
        Paint paint = new Paint();
        this.strokePaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.strokePaint.setAntiAlias(true);
        this.strokePaint.setColor(Color.rgb(0, 0, 0));
        Paint paint2 = new Paint();
        this.filledPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.filledPaint.setAntiAlias(true);
        this.filledPaint.setColor(Color.rgb(0, 0, 0));
        Paint paint3 = new Paint();
        this.textPaint = paint3;
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        this.textPaint.setAntiAlias(true);
        this.textPaint.setColor(Color.rgb(0, 0, 0));
        this.textPaint.setTextAlign(Paint.Align.CENTER);
        this.textPaint.setStrokeWidth(1.1f);
    }

    public void changeFps(int i3) {
        this.sleepTime = 1000 / (i3 + 20);
    }

    public void clearCanvas(Canvas canvas) {
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
    }

    public void drawCircle(Canvas canvas, int i3, int i4, int i5, int i6, float f3, float f4, float f5) {
        this.strokePaint.setColor(Color.rgb(i4, i5, i6));
        this.strokePaint.setAlpha(i3);
        this.strokePaint.setStyle(Paint.Style.STROKE);
        this.strokePaint.setStrokeWidth(8.0f);
        canvas.drawCircle(f3, f4, f5, this.strokePaint);
    }

    public void drawFilledCircle(Canvas canvas, int i3, int i4, int i5, int i6, float f3, float f4, float f5) {
        this.filledPaint.setColor(Color.rgb(i4, i5, i6));
        this.filledPaint.setAlpha(i3);
        this.filledPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(f3, f4, f5, this.filledPaint);
    }

    public void drawFilledRect(Canvas canvas, int i3, int i4, int i5, int i6, float f3, float f4, float f5, float f6) {
        this.filledPaint.setColor(Color.rgb(i4, i5, i6));
        this.filledPaint.setAlpha(i3);
        canvas.drawRect(f3, f4, f5, f6, this.filledPaint);
    }

    public void drawLine(Canvas canvas, int i3, int i4, int i5, int i6, float f3, float f4, float f5, float f6, float f7) {
        this.strokePaint.setColor(Color.rgb(i4, i5, i6));
        this.strokePaint.setAlpha(i3);
        this.strokePaint.setStrokeWidth(f3);
        canvas.drawLine(f4, f5, f6, f7, this.strokePaint);
    }

    public void drawRect(Canvas canvas, int i3, int i4, int i5, int i6, float f3, float f4, float f5, float f6, float f7) {
        this.strokePaint.setStrokeWidth(f3);
        this.strokePaint.setColor(Color.rgb(i4, i5, i6));
        this.strokePaint.setAlpha(i3);
        canvas.drawRect(f4, f5, f6, f7, this.strokePaint);
    }

    public void drawText(Canvas canvas, int i3, int i4, int i5, int i6, String str, float f3, float f4, float f5) {
        this.textPaint.setARGB(i3, i4, i5, i6);
        this.textPaint.setTextSize(f5);
        canvas.drawText(str, f3, f4, this.textPaint);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getVisibility() == 0) {
            clearCanvas(canvas);
            onDrawImpl(canvas);
        }
    }

    public abstract void onDrawImpl(Canvas canvas);

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (this.thread.isAlive() && !this.thread.isInterrupted()) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                postInvalidate();
                Thread.sleep(Math.max(Math.min(0L, this.sleepTime - (System.currentTimeMillis() - currentTimeMillis)), this.sleepTime));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

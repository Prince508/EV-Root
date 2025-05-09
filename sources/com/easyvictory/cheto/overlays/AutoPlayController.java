package com.easyvictory.cheto.overlays;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import b1.C0368a;
import c.InterfaceC0370a;
import c1.AbstractC0382j;
import c1.AbstractC0393u;
import com.easyvictory.cheto.overlays.AutoPlayController;
import onetap.game.tictactoe.R;

/* loaded from: classes.dex */
public class AutoPlayController {

    /* renamed from: i, reason: collision with root package name */
    public static volatile AutoPlayController f4795i;

    /* renamed from: a, reason: collision with root package name */
    public View f4796a;

    /* renamed from: b, reason: collision with root package name */
    public View f4797b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f4798c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4799d;

    /* renamed from: g, reason: collision with root package name */
    public WindowManager f4802g;

    /* renamed from: e, reason: collision with root package name */
    public GestureDetector f4800e = null;

    /* renamed from: f, reason: collision with root package name */
    public Context f4801f = null;

    /* renamed from: h, reason: collision with root package name */
    public WindowManager.LayoutParams f4803h = null;

    public class a implements View.OnTouchListener {

        /* renamed from: e, reason: collision with root package name */
        public int f4804e;

        /* renamed from: f, reason: collision with root package name */
        public int f4805f;

        /* renamed from: g, reason: collision with root package name */
        public float f4806g;

        /* renamed from: h, reason: collision with root package name */
        public float f4807h;

        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (AutoPlayController.this.f4800e.onTouchEvent(motionEvent)) {
                try {
                    if (AutoPlayController.this.f4799d) {
                        AutoPlayController.this.r(false);
                        AutoPlayController.this.f4798c.setImageResource(R.drawable.start_auto);
                    } else {
                        AutoPlayController.this.r(true);
                        AutoPlayController.this.f4798c.setImageResource(R.drawable.stop_auto);
                    }
                    AutoPlayController.this.f4799d = !r6.f4799d;
                } catch (Throwable th) {
                    AbstractC0382j.f(th);
                }
                return true;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f4804e = AutoPlayController.this.f4803h.x;
                this.f4805f = AutoPlayController.this.f4803h.y;
                this.f4806g = motionEvent.getRawX();
                this.f4807h = motionEvent.getRawY();
                return true;
            }
            if (action == 1) {
                Point b3 = AbstractC0393u.b(AutoPlayController.this.f4801f);
                int i3 = (int) (b3.x / 2.0f);
                int i4 = (int) (b3.y / 2.0f);
                if (AutoPlayController.this.f4803h.y < i4 - view.getHeight() && AutoPlayController.this.f4803h.y > (-(i4 - view.getHeight()))) {
                    if (AutoPlayController.this.f4803h.x > 0) {
                        AutoPlayController.this.f4803h.x = i3;
                    } else {
                        AutoPlayController.this.f4803h.x = -i3;
                    }
                    AutoPlayController.this.f4802g.updateViewLayout(AutoPlayController.this.f4796a, AutoPlayController.this.f4803h);
                    return true;
                }
            } else if (action == 2) {
                AutoPlayController.this.f4803h.x = this.f4804e + ((int) (motionEvent.getRawX() - this.f4806g));
                AutoPlayController.this.f4803h.y = this.f4805f + ((int) (motionEvent.getRawY() - this.f4807h));
                AutoPlayController.this.f4802g.updateViewLayout(AutoPlayController.this.f4796a, AutoPlayController.this.f4803h);
                return true;
            }
            return false;
        }
    }

    public class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f4810f;

        public b(int i3) {
            this.f4810f = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            AutoPlayController.this.f4798c.setImageResource(this.f4810f);
        }
    }

    public static /* synthetic */ void a(boolean z3) {
        if (C0368a.d().f()) {
            try {
                C0368a.d().e().i(U2.a.a(-442056929518L), z3);
            } catch (RemoteException e3) {
                AbstractC0382j.b(e3);
            }
        }
    }

    @InterfaceC0370a
    public static void enableAutoPlay(boolean z3) {
        AutoPlayController autoPlayController = getInstance();
        int i3 = z3 ? R.drawable.stop_auto : R.drawable.start_auto;
        autoPlayController.r(z3);
        new Handler(Looper.getMainLooper()).post(autoPlayController.new b(i3));
        autoPlayController.f4799d = z3;
    }

    @InterfaceC0370a
    public static AutoPlayController getInstance() {
        if (f4795i == null) {
            synchronized (AutoPlayController.class) {
                try {
                    if (f4795i == null) {
                        f4795i = new AutoPlayController();
                    }
                } finally {
                }
            }
        }
        return f4795i;
    }

    public void k() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, (int) (AbstractC0393u.d(this.f4801f) / 2.0f), AbstractC0393u.a(this.f4801f), 2032, 1288, 1);
        this.f4803h = layoutParams;
        try {
            this.f4802g.addView(this.f4796a, layoutParams);
        } catch (Throwable th) {
            AbstractC0382j.f(th);
        }
    }

    public void l(Context context) {
        this.f4801f = context;
        this.f4799d = true;
        this.f4796a = LayoutInflater.from(context).inflate(R.layout.auto_play_controller, (ViewGroup) null);
        this.f4802g = (WindowManager) context.getSystemService(U2.a.a(-411992158446L));
        k();
        n();
        m();
        if (FloatLogo.getInstance().E()) {
            return;
        }
        this.f4796a.setVisibility(8);
    }

    public void m() {
        this.f4800e = new GestureDetector(this.f4801f, new Y0.a());
        this.f4797b.setOnTouchListener(new a());
    }

    public void n() {
        this.f4797b = this.f4796a.findViewById(R.id.FLOAT_LOGO_VIEW);
        this.f4798c = (ImageView) this.f4796a.findViewById(R.id.AUTO_PLAY_CONTROLLER_LOGO);
    }

    public final /* synthetic */ void o(int i3) {
        this.f4796a.setVisibility(i3);
    }

    public void p() {
        WindowManager windowManager;
        View view = this.f4796a;
        if (view == null || (windowManager = this.f4802g) == null) {
            return;
        }
        try {
            windowManager.removeView(view);
        } catch (Throwable unused) {
        }
        this.f4796a = null;
        this.f4802g = null;
    }

    public void q(final int i3) {
        View view = this.f4796a;
        if (view == null || view.getVisibility() == i3) {
            return;
        }
        this.f4796a.post(new Runnable() { // from class: X0.b
            @Override // java.lang.Runnable
            public final void run() {
                AutoPlayController.this.o(i3);
            }
        });
    }

    public void r(final boolean z3) {
        new Thread(new Runnable() { // from class: X0.a
            @Override // java.lang.Runnable
            public final void run() {
                AutoPlayController.a(z3);
            }
        }).start();
    }

    public void s(int i3) {
        WindowManager.LayoutParams layoutParams;
        WindowManager windowManager;
        View view = this.f4796a;
        if (view == null || (layoutParams = this.f4803h) == null || (windowManager = this.f4802g) == null) {
            return;
        }
        layoutParams.x = i3;
        try {
            windowManager.updateViewLayout(view, layoutParams);
        } catch (Throwable unused) {
        }
    }
}

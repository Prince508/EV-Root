package com.easyvictory.cheto.overlays;

import U2.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import b1.C0368a;
import c.InterfaceC0370a;
import c1.AbstractC0382j;
import c1.AbstractC0393u;
import c1.C0376d;
import com.easyvictory.cheto.overlays.FloatLogo;
import java.util.HashMap;
import java.util.Map;
import onetap.game.tictactoe.R;

@SuppressLint({"UseSwitchCompatOrMaterialCode"})
/* loaded from: classes.dex */
public class FloatLogo {

    /* renamed from: c0, reason: collision with root package name */
    public static final String f4814c0 = a.a(-9611812106478L);

    /* renamed from: d0, reason: collision with root package name */
    public static final String f4815d0 = a.a(-9654761779438L);

    /* renamed from: e0, reason: collision with root package name */
    public static final String f4816e0 = a.a(-9757840994542L);

    /* renamed from: f0, reason: collision with root package name */
    public static final String f4817f0 = a.a(-9830855438574L);

    /* renamed from: g0, reason: collision with root package name */
    public static final String f4818g0 = a.a(-9895279948014L);

    /* renamed from: h0, reason: collision with root package name */
    public static final String f4819h0 = a.a(-9963999424750L);

    /* renamed from: i0, reason: collision with root package name */
    public static final String f4820i0 = a.a(-10032718901486L);

    /* renamed from: j0, reason: collision with root package name */
    public static final String f4821j0 = a.a(-10088553476334L);

    /* renamed from: k0, reason: collision with root package name */
    public static final String f4822k0 = a.a(-10183042756846L);

    /* renamed from: l0, reason: collision with root package name */
    public static final String f4823l0 = a.a(-10247467266286L);

    /* renamed from: m0, reason: collision with root package name */
    public static final String f4824m0 = a.a(-10324776677614L);

    /* renamed from: n0, reason: collision with root package name */
    public static final String f4825n0 = a.a(-10402086088942L);

    /* renamed from: o0, reason: collision with root package name */
    public static final String f4826o0 = a.a(-10470805565678L);

    /* renamed from: p0, reason: collision with root package name */
    public static final String f4827p0 = a.a(-10552409944302L);

    /* renamed from: q0, reason: collision with root package name */
    public static final String f4828q0 = a.a(-10608244519150L);

    /* renamed from: r0, reason: collision with root package name */
    public static final String f4829r0 = a.a(-10672669028590L);

    /* renamed from: s0, reason: collision with root package name */
    public static final String f4830s0 = a.a(-10711323734254L);

    /* renamed from: t0, reason: collision with root package name */
    public static final String f4831t0 = a.a(-10758568374510L);

    /* renamed from: u0, reason: collision with root package name */
    public static final String f4832u0 = a.a(-10805813014766L);

    /* renamed from: v0, reason: collision with root package name */
    public static final String f4833v0 = a.a(-10878827458798L);

    /* renamed from: w0, reason: collision with root package name */
    public static final String f4834w0 = a.a(-10981906673902L);

    /* renamed from: x0, reason: collision with root package name */
    public static final String f4835x0 = a.a(-11054921117934L);

    /* renamed from: y0, reason: collision with root package name */
    public static final String f4836y0 = a.a(-11123640594670L);

    /* renamed from: z0, reason: collision with root package name */
    public static final String f4837z0 = a.a(-11162295300334L);

    /* renamed from: A0, reason: collision with root package name */
    public static final String f4812A0 = a.a(-11179475169518L);

    /* renamed from: b0, reason: collision with root package name */
    public static volatile FloatLogo f4813b0 = null;

    /* renamed from: a, reason: collision with root package name */
    public GestureDetector f4864a = null;

    /* renamed from: b, reason: collision with root package name */
    public Map f4866b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public C0368a.InterfaceC0102a f4867c = new y();

    /* renamed from: d, reason: collision with root package name */
    public View f4868d = null;

    /* renamed from: e, reason: collision with root package name */
    public View f4869e = null;

    /* renamed from: f, reason: collision with root package name */
    public View f4870f = null;

    /* renamed from: g, reason: collision with root package name */
    public ImageButton f4871g = null;

    /* renamed from: h, reason: collision with root package name */
    public View f4872h = null;

    /* renamed from: i, reason: collision with root package name */
    public View f4873i = null;

    /* renamed from: j, reason: collision with root package name */
    public View f4874j = null;

    /* renamed from: k, reason: collision with root package name */
    public ImageButton f4875k = null;

    /* renamed from: l, reason: collision with root package name */
    public ImageButton f4876l = null;

    /* renamed from: m, reason: collision with root package name */
    public ImageButton f4877m = null;

    /* renamed from: n, reason: collision with root package name */
    public Switch f4878n = null;

    /* renamed from: o, reason: collision with root package name */
    public Switch f4879o = null;

    /* renamed from: p, reason: collision with root package name */
    public Switch f4880p = null;

    /* renamed from: q, reason: collision with root package name */
    public Switch f4881q = null;

    /* renamed from: r, reason: collision with root package name */
    public Switch f4882r = null;

    /* renamed from: s, reason: collision with root package name */
    public Switch f4883s = null;

    /* renamed from: t, reason: collision with root package name */
    public Switch f4884t = null;

    /* renamed from: u, reason: collision with root package name */
    public SeekBar f4885u = null;

    /* renamed from: v, reason: collision with root package name */
    public SeekBar f4886v = null;

    /* renamed from: w, reason: collision with root package name */
    public SeekBar f4887w = null;

    /* renamed from: x, reason: collision with root package name */
    public Switch f4888x = null;

    /* renamed from: y, reason: collision with root package name */
    public Button f4889y = null;

    /* renamed from: z, reason: collision with root package name */
    public Button f4890z = null;

    /* renamed from: A, reason: collision with root package name */
    public Switch f4838A = null;

    /* renamed from: B, reason: collision with root package name */
    public Switch f4839B = null;

    /* renamed from: C, reason: collision with root package name */
    public Switch f4840C = null;

    /* renamed from: D, reason: collision with root package name */
    public int f4841D = 20;

    /* renamed from: E, reason: collision with root package name */
    public Button f4842E = null;

    /* renamed from: F, reason: collision with root package name */
    public Button f4843F = null;

    /* renamed from: G, reason: collision with root package name */
    public Button f4844G = null;

    /* renamed from: H, reason: collision with root package name */
    public Button f4845H = null;

    /* renamed from: I, reason: collision with root package name */
    public TextView f4846I = null;

    /* renamed from: J, reason: collision with root package name */
    public TextView f4847J = null;

    /* renamed from: K, reason: collision with root package name */
    public SeekBar f4848K = null;

    /* renamed from: L, reason: collision with root package name */
    public SeekBar f4849L = null;

    /* renamed from: M, reason: collision with root package name */
    public Switch f4850M = null;

    /* renamed from: N, reason: collision with root package name */
    public Switch f4851N = null;

    /* renamed from: O, reason: collision with root package name */
    public Switch f4852O = null;

    /* renamed from: P, reason: collision with root package name */
    public EditText f4853P = null;

    /* renamed from: Q, reason: collision with root package name */
    public Spinner f4854Q = null;

    /* renamed from: R, reason: collision with root package name */
    public Switch f4855R = null;

    /* renamed from: S, reason: collision with root package name */
    public TextView f4856S = null;

    /* renamed from: T, reason: collision with root package name */
    public TextView f4857T = null;

    /* renamed from: U, reason: collision with root package name */
    public TextView f4858U = null;

    /* renamed from: V, reason: collision with root package name */
    public TextView f4859V = null;

    /* renamed from: W, reason: collision with root package name */
    public TextView f4860W = null;

    /* renamed from: X, reason: collision with root package name */
    public Context f4861X = null;

    /* renamed from: Y, reason: collision with root package name */
    public WindowManager f4862Y = null;

    /* renamed from: Z, reason: collision with root package name */
    public WindowManager.LayoutParams f4863Z = null;

    /* renamed from: a0, reason: collision with root package name */
    public C0376d f4865a0 = null;

    public class A implements View.OnClickListener {
        public A() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FloatLogo.this.S(1);
        }
    }

    public class B implements View.OnClickListener {
        public B() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FloatLogo.this.S(2);
        }
    }

    public class C implements View.OnClickListener {
        public C() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FloatLogo.this.f4870f.setVisibility(8);
            FloatLogo.this.f4869e.setVisibility(0);
        }
    }

    public class D implements CompoundButton.OnCheckedChangeListener {
        public D() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            FloatLogo.this.U(a.a(-2344727441646L), Boolean.valueOf(z3), true);
            AutoPlayController.getInstance().q(z3 ? 0 : 8);
        }
    }

    public class E implements CompoundButton.OnCheckedChangeListener {
        public E() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            FloatLogo.this.U(a.a(-2387677114606L), Boolean.valueOf(z3), true);
        }
    }

    public class F implements CompoundButton.OnCheckedChangeListener {
        public F() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            FloatLogo.this.U(a.a(-2490756329710L), Boolean.valueOf(z3), true);
        }
    }

    public static class H {

        /* renamed from: a, reason: collision with root package name */
        public Object f4918a;

        /* renamed from: b, reason: collision with root package name */
        public int f4919b;

        public H(Object obj, int i3) {
            this.f4918a = obj;
            this.f4919b = i3;
        }
    }

    /* renamed from: com.easyvictory.cheto.overlays.FloatLogo$a, reason: case insensitive filesystem */
    public class C0402a implements CompoundButton.OnCheckedChangeListener {
        public C0402a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            FloatLogo.this.U(a.a(-734114705646L), Boolean.valueOf(z3), true);
        }
    }

    /* renamed from: com.easyvictory.cheto.overlays.FloatLogo$b, reason: case insensitive filesystem */
    public class C0403b implements CompoundButton.OnCheckedChangeListener {
        public C0403b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            FloatLogo.this.T(a.a(-798539215086L), Boolean.valueOf(z3));
        }
    }

    /* renamed from: com.easyvictory.cheto.overlays.FloatLogo$c, reason: case insensitive filesystem */
    public class C0404c implements CompoundButton.OnCheckedChangeListener {
        public C0404c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            FloatLogo.this.T(a.a(-867258691822L), Boolean.valueOf(z3));
        }
    }

    /* renamed from: com.easyvictory.cheto.overlays.FloatLogo$d, reason: case insensitive filesystem */
    public class C0405d implements CompoundButton.OnCheckedChangeListener {
        public C0405d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            FloatLogo.this.T(a.a(-935978168558L), Boolean.valueOf(z3));
        }
    }

    /* renamed from: com.easyvictory.cheto.overlays.FloatLogo$e, reason: case insensitive filesystem */
    public class C0406e implements SeekBar.OnSeekBarChangeListener {
        public C0406e() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i3, boolean z3) {
            FloatLogo.this.T(a.a(-991812743406L), Integer.valueOf(i3));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.easyvictory.cheto.overlays.FloatLogo$f, reason: case insensitive filesystem */
    public class C0407f implements SeekBar.OnSeekBarChangeListener {
        public C0407f() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i3, boolean z3) {
            FloatLogo.this.T(a.a(-1086302023918L), Integer.valueOf(i3));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.easyvictory.cheto.overlays.FloatLogo$g, reason: case insensitive filesystem */
    public class C0408g implements SeekBar.OnSeekBarChangeListener {
        public C0408g() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i3, boolean z3) {
            FloatLogo.this.T(a.a(-1150726533358L), Integer.valueOf(i3));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.easyvictory.cheto.overlays.FloatLogo$h, reason: case insensitive filesystem */
    public class C0409h implements CompoundButton.OnCheckedChangeListener {
        public C0409h() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            FloatLogo.this.U(a.a(-1228035944686L), Boolean.valueOf(z3), true);
        }
    }

    public class i implements CompoundButton.OnCheckedChangeListener {
        public i() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            FloatLogo.this.T(a.a(-1305345356014L), Boolean.valueOf(z3));
        }
    }

    public class j implements CompoundButton.OnCheckedChangeListener {
        public j() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            FloatLogo.this.U(a.a(-1374064832750L), Boolean.valueOf(z3), true);
        }
    }

    public class k implements View.OnTouchListener {

        /* renamed from: e, reason: collision with root package name */
        public int f4930e;

        /* renamed from: f, reason: collision with root package name */
        public int f4931f;

        /* renamed from: g, reason: collision with root package name */
        public float f4932g;

        /* renamed from: h, reason: collision with root package name */
        public float f4933h;

        public k() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (FloatLogo.this.f4864a.onTouchEvent(motionEvent)) {
                FloatLogo.this.f4870f.setVisibility(0);
                FloatLogo.this.f4869e.setVisibility(8);
                return true;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f4930e = FloatLogo.this.f4863Z.x;
                this.f4931f = FloatLogo.this.f4863Z.y;
                this.f4932g = motionEvent.getRawX();
                this.f4933h = motionEvent.getRawY();
                return true;
            }
            if (action == 1) {
                Point b3 = AbstractC0393u.b(FloatLogo.this.f4861X);
                int i3 = FloatLogo.this.f4861X.getResources().getConfiguration().orientation;
                Point point = new Point();
                if (i3 == 2) {
                    point.x = Math.max(b3.x, b3.y);
                    point.y = Math.min(b3.x, b3.y);
                } else {
                    point.x = b3.x;
                    point.y = b3.y;
                }
                int i4 = (int) (point.x / 2.0f);
                int i5 = (int) (point.y / 2.0f);
                AbstractC0382j.a(a.a(-588085817582L) + point.x + a.a(-652510327022L) + point.y + a.a(-665395228910L));
                StringBuilder sb = new StringBuilder();
                sb.append(a.a(-673985163502L));
                sb.append(i3);
                AbstractC0382j.a(sb.toString());
                if (FloatLogo.this.f4863Z.y < i5 - view.getHeight() && FloatLogo.this.f4863Z.y > (-(i5 - view.getHeight()))) {
                    if (FloatLogo.this.f4863Z.x > 0) {
                        FloatLogo.this.f4863Z.x = i4;
                    } else {
                        FloatLogo.this.f4863Z.x = -i4;
                    }
                    FloatLogo.this.f4862Y.updateViewLayout(FloatLogo.this.f4868d, FloatLogo.this.f4863Z);
                    return true;
                }
            } else if (action == 2) {
                FloatLogo.this.f4863Z.x = this.f4930e + ((int) (motionEvent.getRawX() - this.f4932g));
                FloatLogo.this.f4863Z.y = this.f4931f + ((int) (motionEvent.getRawY() - this.f4933h));
                FloatLogo.this.f4862Y.updateViewLayout(FloatLogo.this.f4868d, FloatLogo.this.f4863Z);
                return true;
            }
            return false;
        }
    }

    public class l implements SeekBar.OnSeekBarChangeListener {
        public l() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i3, boolean z3) {
            if (FloatLogo.this.f4851N.isChecked()) {
                i3 = 0;
                seekBar.setProgress(0);
            }
            FloatLogo.this.f4859V.setText(String.format(FloatLogo.this.f4861X.getString(R.string.LOSE_MATCH_AFTER_X_WINS), Integer.valueOf(i3)));
            FloatLogo.this.z(a.a(-1455669211374L), Float.valueOf(i3));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public class m implements SeekBar.OnSeekBarChangeListener {
        public m() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i3, boolean z3) {
            FloatLogo.this.f4860W.setText(String.format(FloatLogo.this.f4861X.getString(R.string.FAKE_BREAK_ONCE_X_BREAKS), Integer.valueOf(i3)));
            FloatLogo.this.U(a.a(-1494323917038L), Integer.valueOf(i3), true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public class n implements CompoundButton.OnCheckedChangeListener {
        public n() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            FloatLogo.this.U(a.a(-1541568557294L), Boolean.valueOf(z3), true);
        }
    }

    public class o implements CompoundButton.OnCheckedChangeListener {
        public o() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            FloatLogo.this.z(a.a(-1588813197550L), Boolean.valueOf(FloatLogo.this.f4852O.isChecked()));
        }
    }

    public class p implements CompoundButton.OnCheckedChangeListener {
        public p() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            FloatLogo.this.z(a.a(-1691892412654L), Boolean.valueOf(FloatLogo.this.f4851N.isChecked()));
            if (FloatLogo.this.f4851N.isChecked()) {
                FloatLogo.this.f4848K.setProgress(0);
                FloatLogo.this.f4859V.setText(String.format(FloatLogo.this.f4861X.getString(R.string.LOSE_MATCH_AFTER_X_WINS), 0));
                FloatLogo.this.z(a.a(-1764906856686L), Float.valueOf(0));
            }
        }
    }

    public class q implements AdapterView.OnItemSelectedListener {
        public q() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
            int i4;
            int selectedItemPosition = FloatLogo.this.f4854Q.getSelectedItemPosition();
            FloatLogo.this.z(a.a(-1803561562350L), Integer.valueOf(selectedItemPosition));
            if (selectedItemPosition == 0) {
                FloatLogo.this.f4841D = 20;
            } else {
                FloatLogo.this.f4841D = 2;
            }
            int i5 = 0;
            try {
                i4 = Integer.parseInt(FloatLogo.this.f4846I.getText().toString());
            } catch (Throwable th) {
                AbstractC0382j.d(th.getMessage());
                i4 = 0;
            }
            if (i4 > FloatLogo.this.f4841D) {
                int i6 = FloatLogo.this.f4841D;
                FloatLogo.this.f4846I.setText(String.valueOf(i6));
                FloatLogo.this.z(a.a(-1872281039086L), Integer.valueOf(i6));
            }
            try {
                i5 = Integer.parseInt(FloatLogo.this.f4847J.getText().toString());
            } catch (Throwable th2) {
                AbstractC0382j.d(th2.getMessage());
            }
            if (i5 > FloatLogo.this.f4841D) {
                int i7 = FloatLogo.this.f4841D;
                FloatLogo.this.f4847J.setText(String.valueOf(i7));
                FloatLogo.this.z(a.a(-1928115613934L), Integer.valueOf(i7));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public class r implements TextWatcher {
        public r() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            long j3;
            try {
                j3 = Long.parseLong(String.valueOf(editable));
            } catch (Throwable unused) {
                j3 = 0;
            }
            FloatLogo.this.U(a.a(-1992540123374L), Long.valueOf(j3), true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        }
    }

    public class s implements View.OnClickListener {
        public s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i3;
            try {
                i3 = Integer.parseInt(FloatLogo.this.f4846I.getText().toString());
            } catch (Throwable th) {
                AbstractC0382j.f(th);
                i3 = 0;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                FloatLogo.this.f4846I.setText(String.valueOf(i4));
                FloatLogo.this.U(a.a(-2065554567406L), Integer.valueOf(i4), true);
            }
        }
    }

    public class t implements View.OnClickListener {
        public t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i3;
            try {
                i3 = Integer.parseInt(FloatLogo.this.f4846I.getText().toString());
            } catch (Throwable th) {
                AbstractC0382j.f(th);
                i3 = 0;
            }
            if (i3 < FloatLogo.this.f4841D) {
                int i4 = i3 + 1;
                FloatLogo.this.f4846I.setText(String.valueOf(i4));
                FloatLogo.this.U(a.a(-2121389142254L), Integer.valueOf(i4), true);
            }
        }
    }

    public class u implements View.OnClickListener {
        public u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i3;
            try {
                i3 = Integer.parseInt(FloatLogo.this.f4847J.getText().toString());
            } catch (Throwable th) {
                AbstractC0382j.f(th);
                i3 = 0;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                FloatLogo.this.f4847J.setText(String.valueOf(i4));
                FloatLogo.this.U(a.a(-2177223717102L), Integer.valueOf(i4), true);
            }
        }
    }

    public class v implements CompoundButton.OnCheckedChangeListener {
        public v() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            if (z3) {
                FloatLogo.this.f4863Z.flags = 32;
            } else {
                FloatLogo.this.f4863Z.flags = 8;
            }
            try {
                FloatLogo.this.f4862Y.updateViewLayout(FloatLogo.this.f4868d, FloatLogo.this.f4863Z);
            } catch (Throwable unused) {
            }
        }
    }

    public class w implements View.OnClickListener {
        public w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i3;
            try {
                i3 = Integer.parseInt(FloatLogo.this.f4847J.getText().toString());
            } catch (Throwable th) {
                AbstractC0382j.f(th);
                i3 = 0;
            }
            if (i3 < FloatLogo.this.f4841D) {
                int i4 = i3 + 1;
                FloatLogo.this.f4847J.setText(String.valueOf(i4));
                FloatLogo.this.U(a.a(-2241648226542L), Integer.valueOf(i4), true);
            }
        }
    }

    public class x implements CompoundButton.OnCheckedChangeListener {
        public x() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            FloatLogo.this.U(a.a(-2306072735982L), Boolean.valueOf(z3), true);
        }
    }

    public class y implements C0368a.InterfaceC0102a {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                FloatLogo.this.I();
            }
        }

        public y() {
        }

        @Override // b1.C0368a.InterfaceC0102a
        public void a() {
        }

        @Override // b1.C0368a.InterfaceC0102a
        public void b() {
            FloatLogo.this.f4865a0.b(new Runnable() { // from class: X0.f
                @Override // java.lang.Runnable
                public final void run() {
                    FloatLogo.y.this.d();
                }
            });
        }

        public final /* synthetic */ void d() {
            try {
                Thread.sleep(3000L);
                new Handler(Looper.getMainLooper()).post(new a());
            } catch (InterruptedException e3) {
                throw new RuntimeException(e3);
            }
        }
    }

    public class z implements View.OnClickListener {
        public z() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FloatLogo.this.S(0);
        }
    }

    public static void A(int i3, Object obj) {
        a.a(-7949659762926L);
        if (obj instanceof Long) {
            applyConfigLongJNI(a.a(-8065623879918L), i3, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            applyConfigIntJNI(a.a(-8181587996910L), i3, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Float) {
            applyConfigFloatJNI(a.a(-8297552113902L), i3, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            applyConfigBoolJNI(a.a(-8413516230894L), i3, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            applyConfigStringJNI(a.a(-8529480347886L), i3, (String) obj);
        }
    }

    public static native void applyConfigBoolJNI(String str, int i3, boolean z3);

    public static native void applyConfigFloatJNI(String str, int i3, float f3);

    public static native void applyConfigIntJNI(String str, int i3, int i4);

    public static native void applyConfigLongJNI(String str, int i3, long j3);

    public static native void applyConfigStringJNI(String str, int i3, String str2);

    public static /* synthetic */ void b(Object obj, int i3) {
        a.a(-8916027404526L);
        if (C0368a.d().f()) {
            com.easyvictory.cheto.services.a e3 = C0368a.d().e();
            try {
                if (obj instanceof Long) {
                    e3.v(a.a(-9031991521518L), i3, ((Long) obj).longValue());
                    return;
                }
                if (obj instanceof Integer) {
                    e3.e(a.a(-9147955638510L), i3, ((Integer) obj).intValue());
                    return;
                }
                if (obj instanceof Float) {
                    e3.q(a.a(-9263919755502L), i3, ((Float) obj).floatValue());
                } else if (obj instanceof Boolean) {
                    e3.p(a.a(-9379883872494L), i3, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    e3.u(a.a(-9495847989486L), i3, (String) obj);
                }
            } catch (RemoteException e4) {
                AbstractC0382j.b(e4);
            }
        }
    }

    @InterfaceC0370a
    public static FloatLogo getInstance() {
        if (f4813b0 == null) {
            synchronized (FloatLogo.class) {
                try {
                    if (f4813b0 == null) {
                        f4813b0 = new FloatLogo();
                    }
                } finally {
                }
            }
        }
        return f4813b0;
    }

    public void B(final int i3, final Object obj) {
        this.f4865a0.b(new Runnable() { // from class: X0.d
            @Override // java.lang.Runnable
            public final void run() {
                FloatLogo.b(obj, i3);
            }
        });
    }

    public void C() {
        int d3 = AbstractC0393u.d(this.f4861X);
        int i3 = (int) (d3 / 2.0f);
        AbstractC0382j.a(a.a(-3719116976366L) + d3);
        AbstractC0382j.a(a.a(-3753476714734L) + i3);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, i3, 0, 2032, 1288, 1);
        this.f4863Z = layoutParams;
        try {
            this.f4862Y.addView(this.f4868d, layoutParams);
        } catch (Throwable th) {
            AbstractC0382j.f(th);
        }
    }

    public void D() {
        this.f4842E.setText(a.a(-3822196191470L));
        this.f4844G.setText(a.a(-3835081093358L));
        this.f4843F.setText(a.a(-3847965995246L));
        this.f4845H.setText(a.a(-3860850897134L));
    }

    public boolean E() {
        Object F3 = F(a.a(-8645444464878L));
        if (F3 instanceof Boolean) {
            return ((Boolean) F3).booleanValue();
        }
        return false;
    }

    public final Object F(String str) {
        return this.f4861X.getSharedPreferences(a.a(-7846580547822L), 0).getAll().get(str);
    }

    public void G(Context context) {
        this.f4861X = context;
        this.f4868d = LayoutInflater.from(context).inflate(R.layout.float_logo, (ViewGroup) null);
        this.f4862Y = (WindowManager) context.getSystemService(a.a(-3689052205294L));
        C0376d c0376d = new C0376d();
        this.f4865a0 = c0376d;
        c0376d.d();
        C();
        M();
        N();
        J();
        D();
        I();
        L();
        this.f4870f.setVisibility(8);
        this.f4869e.setVisibility(0);
    }

    public void H() {
        U(a.a(-6102823825646L), null, true);
        U(a.a(-6145773498606L), null, true);
        U(a.a(-6248852713710L), null, true);
        U(a.a(-6321867157742L), null, true);
    }

    public void I() {
        if (this.f4868d == null) {
            return;
        }
        H();
        O();
        K();
    }

    public void J() {
        v();
        x();
        u();
        t();
        s();
        y();
        w();
    }

    public void K() {
        U(a.a(-6815788396782L), null, true);
        U(a.a(-6893097808110L), null, true);
        U(a.a(-6948932382958L), null, true);
        U(a.a(-7013356892398L), null, true);
        U(a.a(-7060601532654L), null, true);
        U(a.a(-7107846172910L), null, true);
        U(a.a(-7189450551534L), null, true);
        Object F3 = F(a.a(-7228105257198L));
        if (F3 instanceof Boolean) {
            this.f4839B.setChecked(((Boolean) F3).booleanValue());
        }
        Object F4 = F(a.a(-7296824733934L));
        if (F4 instanceof Integer) {
            this.f4848K.setProgress(((Integer) F4).intValue());
        }
        Object F5 = F(a.a(-7335479439598L));
        if (F5 instanceof Boolean) {
            this.f4851N.setChecked(((Boolean) F5).booleanValue());
        }
        Object F6 = F(a.a(-7408493883630L));
        if (F6 instanceof Boolean) {
            this.f4852O.setChecked(((Boolean) F6).booleanValue());
        }
        Object F7 = F(a.a(-7511573098734L));
        if (F7 instanceof Long) {
            Long l3 = (Long) F7;
            try {
                U(a.a(-7584587542766L), l3, true);
                this.f4853P.setText(String.valueOf(l3));
            } catch (Throwable th) {
                AbstractC0382j.d(th.getMessage());
            }
        }
        Object F8 = F(a.a(-7657601986798L));
        if (F8 instanceof Integer) {
            Integer num = (Integer) F8;
            this.f4854Q.setSelection(num.intValue());
            if (num.intValue() == 0) {
                this.f4841D = 20;
            } else {
                this.f4841D = 2;
            }
        }
        this.f4860W.setText(String.format(this.f4861X.getString(R.string.FAKE_BREAK_ONCE_X_BREAKS), Integer.valueOf(this.f4849L.getProgress())));
        Object F9 = F(a.a(-7726321463534L));
        if (F9 instanceof Integer) {
            this.f4846I.setText(String.valueOf((Integer) F9));
        }
        Object F10 = F(a.a(-7782156038382L));
        if (F10 instanceof Integer) {
            this.f4847J.setText(String.valueOf((Integer) F10));
        }
    }

    public void L() {
        V(a.a(-5072031674606L));
        V(a.a(-5166520955118L));
        V(a.a(-5230945464558L));
    }

    public void M() {
        this.f4869e = this.f4868d.findViewById(R.id.FLOAT_LOGO_VIEW);
        this.f4870f = this.f4868d.findViewById(R.id.MENU_VIEW);
        this.f4871g = (ImageButton) this.f4868d.findViewById(R.id.CLOSE_BUTTON);
        this.f4872h = this.f4868d.findViewById(R.id.AUTO_PLAY_TAB);
        this.f4873i = this.f4868d.findViewById(R.id.VISUALS_TAB);
        this.f4874j = this.f4868d.findViewById(R.id.MISC_TAB);
        this.f4875k = (ImageButton) this.f4868d.findViewById(R.id.AUTO_PLAY_TAB_BUTTON);
        this.f4876l = (ImageButton) this.f4868d.findViewById(R.id.VISUALS_TAB_BUTTON);
        this.f4877m = (ImageButton) this.f4868d.findViewById(R.id.MISC_TAB_BUTTON);
        this.f4878n = (Switch) this.f4868d.findViewById(R.id.ENABLE_AUTO_PLAY);
        this.f4879o = (Switch) this.f4868d.findViewById(R.id.POCKET_NOMINATION_MODE);
        this.f4880p = (Switch) this.f4868d.findViewById(R.id.PLAY_GOLDEN_SHOT);
        this.f4881q = (Switch) this.f4868d.findViewById(R.id.FAST_AUTO_PLAY);
        this.f4882r = (Switch) this.f4868d.findViewById(R.id.DRAW_PREDICTION);
        this.f4883s = (Switch) this.f4868d.findViewById(R.id.DRAW_SHOT_STATE);
        this.f4884t = (Switch) this.f4868d.findViewById(R.id.FREEZE_LINES);
        this.f4885u = (SeekBar) this.f4868d.findViewById(R.id.PREDICTION_DRAW_POWER);
        this.f4886v = (SeekBar) this.f4868d.findViewById(R.id.LINE_THICKNESS);
        this.f4887w = (SeekBar) this.f4868d.findViewById(R.id.LINE_TRANSPARENCY);
        this.f4888x = (Switch) this.f4868d.findViewById(R.id.AD_BLOCK);
        this.f4889y = (Button) this.f4868d.findViewById(R.id.IMPORT_SETTINGS);
        this.f4890z = (Button) this.f4868d.findViewById(R.id.EXPORT_SETTINGS);
        this.f4838A = (Switch) this.f4868d.findViewById(R.id.ENABLE_AQ);
        this.f4839B = (Switch) this.f4868d.findViewById(R.id.FAST_AQ);
        this.f4840C = (Switch) this.f4868d.findViewById(R.id.OPEN_VICTORY_BOXES);
        this.f4842E = (Button) this.f4868d.findViewById(R.id.TABLE_MINUS_ID);
        this.f4843F = (Button) this.f4868d.findViewById(R.id.TABLE_SUM_ID);
        this.f4844G = (Button) this.f4868d.findViewById(R.id.TABLE_MINUS_ID_2);
        this.f4845H = (Button) this.f4868d.findViewById(R.id.TABLE_SUM_ID_2);
        this.f4846I = (TextView) this.f4868d.findViewById(R.id.CHOSEN_TABLE_ID);
        this.f4847J = (TextView) this.f4868d.findViewById(R.id.CHOSEN_TABLE_ID_2);
        this.f4848K = (SeekBar) this.f4868d.findViewById(R.id.MAX_WINS);
        this.f4849L = (SeekBar) this.f4868d.findViewById(R.id.MAX_BREAKS);
        this.f4850M = (Switch) this.f4868d.findViewById(R.id.RANDOM_BET_ID);
        this.f4851N = (Switch) this.f4868d.findViewById(R.id.SMART_MATCH_LOSE);
        this.f4852O = (Switch) this.f4868d.findViewById(R.id.LOSE_MATCH_SECOND_TABLE);
        this.f4853P = (EditText) this.f4868d.findViewById(R.id.AUTO_QUEUE_LIMIT);
        this.f4854Q = (Spinner) this.f4868d.findViewById(R.id.AQ_MODE);
        this.f4855R = (Switch) this.f4868d.findViewById(R.id.ENABLE_KEYBOARD);
        this.f4856S = (TextView) this.f4868d.findViewById(R.id.PREDICTION_DRAW_POWER_TEXT);
        this.f4857T = (TextView) this.f4868d.findViewById(R.id.LINE_THICKNESS_TEXT);
        this.f4858U = (TextView) this.f4868d.findViewById(R.id.LINE_TRANSPARENCY_TEXT);
        this.f4859V = (TextView) this.f4868d.findViewById(R.id.MAX_WINS_TEXT);
        this.f4860W = (TextView) this.f4868d.findViewById(R.id.MAX_BREAKS_TEXT);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.f4861X, R.layout.simple_list_item_1, new String[]{a.a(-8765703549166L), a.a(-8791473352942L), a.a(-8817243156718L), a.a(-8860192829678L)});
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.f4854Q.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f4854Q.setSelection(0);
    }

    public void N() {
        this.f4866b.put(a.a(-3873735799022L), new H(this.f4878n, G.f4898g.f()));
        this.f4866b.put(a.a(-3916685471982L), new H(this.f4879o, G.f4899h.f()));
        this.f4866b.put(a.a(-4019764687086L), new H(this.f4880p, G.f4900i.f()));
        this.f4866b.put(a.a(-4092779131118L), new H(this.f4881q, G.f4901j.f()));
        this.f4866b.put(a.a(-4157203640558L), new H(this.f4882r, G.f4902k.f()));
        this.f4866b.put(a.a(-4225923117294L), new H(this.f4883s, G.f4903l.f()));
        this.f4866b.put(a.a(-4294642594030L), new H(this.f4884t, G.f4904m.f()));
        this.f4866b.put(a.a(-4350477168878L), new H(this.f4885u, G.f4905n.f()));
        this.f4866b.put(a.a(-4444966449390L), new H(this.f4886v, G.f4906o.f()));
        this.f4866b.put(a.a(-4509390958830L), new H(this.f4887w, G.f4907p.f()));
        this.f4866b.put(a.a(-4586700370158L), new H(this.f4838A, G.f4908q.f()));
        this.f4866b.put(a.a(-4664009781486L), new H(this.f4846I, G.f4909r.f()));
        this.f4866b.put(a.a(-4719844356334L), new H(this.f4847J, G.f4910s.f()));
        this.f4866b.put(a.a(-4784268865774L), new H(this.f4849L, G.f4911t.f()));
        this.f4866b.put(a.a(-4831513506030L), new H(this.f4850M, G.f4912u.f()));
        this.f4866b.put(a.a(-4878758146286L), new H(this.f4853P, G.f4913v.f()));
        this.f4866b.put(a.a(-4951772590318L), new H(this.f4840C, G.f4914w.f()));
        this.f4866b.put(a.a(-5033376968942L), new H(this.f4888x, G.f4915x.f()));
    }

    public void O() {
        T(a.a(-6386291667182L), null);
        T(a.a(-6455011143918L), null);
        T(a.a(-6523730620654L), null);
        T(a.a(-6579565195502L), null);
        T(a.a(-6674054476014L), null);
        T(a.a(-6738478985454L), null);
    }

    public final /* synthetic */ void P(int i3) {
        this.f4868d.setVisibility(i3);
    }

    public void Q() {
        WindowManager windowManager;
        View view = this.f4868d;
        if (view != null && (windowManager = this.f4862Y) != null) {
            try {
                windowManager.removeView(view);
            } catch (Throwable unused) {
            }
            this.f4868d = null;
            this.f4862Y = null;
        }
        C0376d c0376d = this.f4865a0;
        if (c0376d != null) {
            c0376d.e();
            this.f4865a0 = null;
        }
    }

    public void R(final int i3) {
        View view = this.f4868d;
        if (view == null || view.getVisibility() == i3) {
            return;
        }
        this.f4868d.post(new Runnable() { // from class: X0.e
            @Override // java.lang.Runnable
            public final void run() {
                FloatLogo.this.P(i3);
            }
        });
    }

    public void S(int i3) {
        Drawable d3 = A.a.d(this.f4861X, R.drawable.rounded_corners_with_transparent_border);
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f4872h.setVisibility(i3 == 0 ? 0 : 8);
        this.f4875k.setBackground(i3 == 0 ? d3 : colorDrawable);
        this.f4873i.setVisibility(i3 == 1 ? 0 : 8);
        this.f4876l.setBackground(i3 == 1 ? d3 : colorDrawable);
        this.f4874j.setVisibility(i3 != 2 ? 8 : 0);
        ImageButton imageButton = this.f4877m;
        if (i3 != 2) {
            d3 = colorDrawable;
        }
        imageButton.setBackground(d3);
    }

    public void T(String str, Object obj) {
        U(str, obj, false);
    }

    public void U(String str, Object obj, boolean z3) {
        Object obj2;
        if (obj == null) {
            obj2 = F(str);
            if (obj2 == null) {
                AbstractC0382j.a(String.format(a.a(-5858010689774L), str));
                return;
            }
        } else {
            obj2 = obj;
        }
        H h3 = (H) this.f4866b.get(str);
        if (h3 == null) {
            AbstractC0382j.a(String.format(a.a(-5978269774062L), str));
            return;
        }
        if (obj != null) {
            z(str, obj2);
            if (h3.f4918a instanceof SeekBar) {
                V(str);
            }
        } else {
            Object obj3 = h3.f4918a;
            if (obj3 instanceof Switch) {
                ((Switch) obj3).setChecked(((Boolean) obj2).booleanValue());
            } else if (obj3 instanceof SeekBar) {
                ((SeekBar) obj3).setProgress(((Integer) obj2).intValue());
            }
        }
        if (z3) {
            B(h3.f4919b, obj2);
        } else {
            A(h3.f4919b, obj2);
        }
    }

    public void V(String str) {
        char c3;
        int hashCode = str.hashCode();
        if (hashCode == -1794031383) {
            if (str.equals(a.a(-5510118338798L))) {
                c3 = 1;
            }
            c3 = 65535;
        } else if (hashCode != 1269416954) {
            if (hashCode == 1381274051 && str.equals(a.a(-5574542848238L))) {
                c3 = 2;
            }
            c3 = 65535;
        } else {
            if (str.equals(a.a(-5415629058286L))) {
                c3 = 0;
            }
            c3 = 65535;
        }
        if (c3 == 0) {
            this.f4856S.setText(String.format(this.f4861X.getString(R.string.PREDICTION_DRAW_POWER), Integer.valueOf(this.f4885u.getProgress())));
        } else if (c3 == 1) {
            this.f4857T.setText(String.format(this.f4861X.getString(R.string.LINE_THICKNESS), Integer.valueOf(this.f4886v.getProgress())));
        } else {
            if (c3 != 2) {
                return;
            }
            this.f4858U.setText(String.format(this.f4861X.getString(R.string.LINE_TRANSPARENCY), Integer.valueOf(this.f4887w.getProgress())));
        }
    }

    public void W(int i3) {
        WindowManager windowManager;
        WindowManager.LayoutParams layoutParams = this.f4863Z;
        if (layoutParams == null || (windowManager = this.f4862Y) == null) {
            return;
        }
        layoutParams.x = i3;
        try {
            windowManager.updateViewLayout(this.f4868d, layoutParams);
        } catch (Throwable unused) {
        }
    }

    @InterfaceC0370a
    public int getAQMode() {
        if (this.f4868d == null) {
            return 0;
        }
        return this.f4854Q.getSelectedItemPosition();
    }

    @InterfaceC0370a
    public int getChosenTable() {
        if (this.f4868d == null) {
            return 0;
        }
        return Integer.parseInt(this.f4846I.getText().toString());
    }

    @InterfaceC0370a
    public int getChosenTable2() {
        if (this.f4868d == null) {
            return 0;
        }
        return Integer.parseInt(this.f4847J.getText().toString());
    }

    @InterfaceC0370a
    public long getCoinsLimit() {
        return 0L;
    }

    @InterfaceC0370a
    public int getMaxBreaks() {
        if (this.f4868d == null) {
            return 5;
        }
        return this.f4849L.getProgress();
    }

    @InterfaceC0370a
    public int getMaxWins() {
        if (this.f4868d == null) {
            return 5;
        }
        return this.f4848K.getProgress();
    }

    @InterfaceC0370a
    public boolean isAQFastModeEnabled() {
        if (this.f4868d == null) {
            return false;
        }
        return this.f4839B.isChecked();
    }

    @InterfaceC0370a
    public boolean loseMatchSecondTable() {
        if (this.f4868d == null) {
            return false;
        }
        return this.f4852O.isChecked();
    }

    public void s() {
        this.f4878n.setOnCheckedChangeListener(new D());
        this.f4879o.setOnCheckedChangeListener(new E());
        this.f4880p.setOnCheckedChangeListener(new F());
        this.f4881q.setOnCheckedChangeListener(new C0402a());
    }

    @InterfaceC0370a
    public boolean smartMatchLose() {
        if (this.f4868d == null) {
            return false;
        }
        return this.f4851N.isChecked();
    }

    public void t() {
        this.f4871g.setOnClickListener(new C());
    }

    public void u() {
        this.f4855R.setOnCheckedChangeListener(new v());
    }

    public void v() {
        this.f4864a = new GestureDetector(this.f4861X, new Y0.a());
        this.f4869e.setOnTouchListener(new k());
    }

    public void w() {
        this.f4838A.setOnCheckedChangeListener(new C0409h());
        this.f4839B.setOnCheckedChangeListener(new i());
        this.f4840C.setOnCheckedChangeListener(new j());
        this.f4848K.incrementProgressBy(1);
        this.f4848K.setOnSeekBarChangeListener(new l());
        this.f4849L.incrementProgressBy(1);
        this.f4849L.setOnSeekBarChangeListener(new m());
        this.f4850M.setOnCheckedChangeListener(new n());
        this.f4852O.setOnCheckedChangeListener(new o());
        this.f4851N.setOnCheckedChangeListener(new p());
        this.f4854Q.setOnItemSelectedListener(new q());
        this.f4853P.addTextChangedListener(new r());
        this.f4842E.setOnClickListener(new s());
        this.f4843F.setOnClickListener(new t());
        this.f4844G.setOnClickListener(new u());
        this.f4845H.setOnClickListener(new w());
        this.f4888x.setOnCheckedChangeListener(new x());
    }

    public void x() {
        this.f4875k.setOnClickListener(new z());
        this.f4876l.setOnClickListener(new A());
        this.f4877m.setOnClickListener(new B());
    }

    public void y() {
        this.f4882r.setOnCheckedChangeListener(new C0403b());
        this.f4883s.setOnCheckedChangeListener(new C0404c());
        this.f4884t.setOnCheckedChangeListener(new C0405d());
        this.f4885u.setOnSeekBarChangeListener(new C0406e());
        this.f4886v.incrementProgressBy(1);
        this.f4886v.setOnSeekBarChangeListener(new C0407f());
        this.f4887w.incrementProgressBy(1);
        this.f4887w.setOnSeekBarChangeListener(new C0408g());
    }

    public final void z(String str, Object obj) {
        SharedPreferences.Editor edit = this.f4861X.getSharedPreferences(a.a(-5651852259566L), 0).edit();
        if (obj instanceof Long) {
            edit.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof String) {
            edit.putString(str, (String) obj);
        }
        edit.apply();
    }

    public enum G {
        f4897f,
        f4898g,
        f4899h,
        f4900i,
        f4901j,
        f4902k(1000),
        f4903l(1001),
        f4904m(1002),
        f4905n(1003),
        f4906o(1004),
        f4907p(1005),
        f4908q(2000),
        f4909r(2001),
        f4910s(2002),
        f4911t(2003),
        f4912u(2004),
        f4913v(2005),
        f4914w(2006),
        f4915x(2007);


        /* renamed from: e, reason: collision with root package name */
        public final int f4917e;

        G(int i3) {
            this.f4917e = i3;
        }

        public int f() {
            return this.f4917e;
        }

        G() {
            this.f4917e = ordinal();
        }
    }
}

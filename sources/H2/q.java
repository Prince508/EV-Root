package h2;

import a2.C0313a;
import h2.q;
import i2.i;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final i2.i f7336a;

    /* renamed from: b, reason: collision with root package name */
    public g f7337b;

    /* renamed from: c, reason: collision with root package name */
    public final i.c f7338c;

    public class a implements i.c {
        public a() {
        }

        public static /* synthetic */ void b(i.d dVar, c cVar) {
            if (cVar == null) {
                dVar.a("error", "Failed to resize the platform view", null);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("width", Double.valueOf(cVar.f7340a));
            hashMap.put("height", Double.valueOf(cVar.f7341b));
            dVar.b(hashMap);
        }

        @Override // i2.i.c
        public void a(i2.h hVar, i.d dVar) {
            if (q.this.f7337b == null) {
            }
            W1.b.f("PlatformViewsChannel", "Received '" + hVar.f7499a + "' message.");
            String str = hVar.f7499a;
            str.getClass();
            switch (str) {
                case "create":
                    d(hVar, dVar);
                    break;
                case "offset":
                    f(hVar, dVar);
                    break;
                case "resize":
                    g(hVar, dVar);
                    break;
                case "clearFocus":
                    c(hVar, dVar);
                    break;
                case "synchronizeToNativeViewHierarchy":
                    i(hVar, dVar);
                    break;
                case "touch":
                    j(hVar, dVar);
                    break;
                case "setDirection":
                    h(hVar, dVar);
                    break;
                case "dispose":
                    e(hVar, dVar);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }

        public final void c(i2.h hVar, i.d dVar) {
            try {
                q.this.f7337b.a(((Integer) hVar.b()).intValue());
                dVar.b(null);
            } catch (IllegalStateException e3) {
                dVar.a("error", q.c(e3), null);
            }
        }

        public final void d(i2.h hVar, i.d dVar) {
            Map map = (Map) hVar.b();
            boolean z3 = false;
            boolean z4 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
            ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z4) {
                    q.this.f7337b.e(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), d.a.HYBRID_ONLY, wrap));
                    dVar.b(null);
                    return;
                }
                if (map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue()) {
                    z3 = true;
                }
                long i3 = q.this.f7337b.i(new d(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), z3 ? d.a.TEXTURE_WITH_HYBRID_FALLBACK : d.a.TEXTURE_WITH_VIRTUAL_FALLBACK, wrap));
                if (i3 != -2) {
                    dVar.b(Long.valueOf(i3));
                } else {
                    if (!z3) {
                        throw new AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                    dVar.b(null);
                }
            } catch (IllegalStateException e3) {
                dVar.a("error", q.c(e3), null);
            }
        }

        public final void e(i2.h hVar, i.d dVar) {
            try {
                q.this.f7337b.h(((Integer) ((Map) hVar.b()).get("id")).intValue());
                dVar.b(null);
            } catch (IllegalStateException e3) {
                dVar.a("error", q.c(e3), null);
            }
        }

        public final void f(i2.h hVar, i.d dVar) {
            Map map = (Map) hVar.b();
            try {
                q.this.f7337b.c(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                dVar.b(null);
            } catch (IllegalStateException e3) {
                dVar.a("error", q.c(e3), null);
            }
        }

        public final void g(i2.h hVar, final i.d dVar) {
            Map map = (Map) hVar.b();
            try {
                q.this.f7337b.f(new e(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()), new b() { // from class: h2.p
                    @Override // h2.q.b
                    public final void a(q.c cVar) {
                        q.a.b(i.d.this, cVar);
                    }
                });
            } catch (IllegalStateException e3) {
                dVar.a("error", q.c(e3), null);
            }
        }

        public final void h(i2.h hVar, i.d dVar) {
            Map map = (Map) hVar.b();
            try {
                q.this.f7337b.d(((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue());
                dVar.b(null);
            } catch (IllegalStateException e3) {
                dVar.a("error", q.c(e3), null);
            }
        }

        public final void i(i2.h hVar, i.d dVar) {
            try {
                q.this.f7337b.b(((Boolean) hVar.b()).booleanValue());
                dVar.b(null);
            } catch (IllegalStateException e3) {
                dVar.a("error", q.c(e3), null);
            }
        }

        public final void j(i2.h hVar, i.d dVar) {
            List list = (List) hVar.b();
            try {
                q.this.f7337b.g(new f(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                dVar.b(null);
            } catch (IllegalStateException e3) {
                dVar.a("error", q.c(e3), null);
            }
        }
    }

    public interface b {
        void a(c cVar);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f7340a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7341b;

        public c(int i3, int i4) {
            this.f7340a = i3;
            this.f7341b = i4;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f7342a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7343b;

        /* renamed from: c, reason: collision with root package name */
        public final double f7344c;

        /* renamed from: d, reason: collision with root package name */
        public final double f7345d;

        /* renamed from: e, reason: collision with root package name */
        public final double f7346e;

        /* renamed from: f, reason: collision with root package name */
        public final double f7347f;

        /* renamed from: g, reason: collision with root package name */
        public final int f7348g;

        /* renamed from: h, reason: collision with root package name */
        public final a f7349h;

        /* renamed from: i, reason: collision with root package name */
        public final ByteBuffer f7350i;

        public enum a {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public d(int i3, String str, double d3, double d4, double d5, double d6, int i4, a aVar, ByteBuffer byteBuffer) {
            this.f7342a = i3;
            this.f7343b = str;
            this.f7346e = d3;
            this.f7347f = d4;
            this.f7344c = d5;
            this.f7345d = d6;
            this.f7348g = i4;
            this.f7349h = aVar;
            this.f7350i = byteBuffer;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f7355a;

        /* renamed from: b, reason: collision with root package name */
        public final double f7356b;

        /* renamed from: c, reason: collision with root package name */
        public final double f7357c;

        public e(int i3, double d3, double d4) {
            this.f7355a = i3;
            this.f7356b = d3;
            this.f7357c = d4;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f7358a;

        /* renamed from: b, reason: collision with root package name */
        public final Number f7359b;

        /* renamed from: c, reason: collision with root package name */
        public final Number f7360c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7361d;

        /* renamed from: e, reason: collision with root package name */
        public final int f7362e;

        /* renamed from: f, reason: collision with root package name */
        public final Object f7363f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f7364g;

        /* renamed from: h, reason: collision with root package name */
        public final int f7365h;

        /* renamed from: i, reason: collision with root package name */
        public final int f7366i;

        /* renamed from: j, reason: collision with root package name */
        public final float f7367j;

        /* renamed from: k, reason: collision with root package name */
        public final float f7368k;

        /* renamed from: l, reason: collision with root package name */
        public final int f7369l;

        /* renamed from: m, reason: collision with root package name */
        public final int f7370m;

        /* renamed from: n, reason: collision with root package name */
        public final int f7371n;

        /* renamed from: o, reason: collision with root package name */
        public final int f7372o;

        /* renamed from: p, reason: collision with root package name */
        public final long f7373p;

        public f(int i3, Number number, Number number2, int i4, int i5, Object obj, Object obj2, int i6, int i7, float f3, float f4, int i8, int i9, int i10, int i11, long j3) {
            this.f7358a = i3;
            this.f7359b = number;
            this.f7360c = number2;
            this.f7361d = i4;
            this.f7362e = i5;
            this.f7363f = obj;
            this.f7364g = obj2;
            this.f7365h = i6;
            this.f7366i = i7;
            this.f7367j = f3;
            this.f7368k = f4;
            this.f7369l = i8;
            this.f7370m = i9;
            this.f7371n = i10;
            this.f7372o = i11;
            this.f7373p = j3;
        }
    }

    public interface g {
        void a(int i3);

        void b(boolean z3);

        void c(int i3, double d3, double d4);

        void d(int i3, int i4);

        void e(d dVar);

        void f(e eVar, b bVar);

        void g(f fVar);

        void h(int i3);

        long i(d dVar);
    }

    public q(C0313a c0313a) {
        a aVar = new a();
        this.f7338c = aVar;
        i2.i iVar = new i2.i(c0313a, "flutter/platform_views", i2.m.f7514b);
        this.f7336a = iVar;
        iVar.e(aVar);
    }

    public static String c(Exception exc) {
        return W1.b.d(exc);
    }

    public void d(g gVar) {
        this.f7337b = gVar;
    }
}

package k2;

import android.view.PointerIcon;
import h2.m;
import java.util.HashMap;

/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0534a {

    /* renamed from: c, reason: collision with root package name */
    public static HashMap f8146c;

    /* renamed from: a, reason: collision with root package name */
    public final c f8147a;

    /* renamed from: b, reason: collision with root package name */
    public final m f8148b;

    /* renamed from: k2.a$a, reason: collision with other inner class name */
    public class C0132a implements m.b {
        public C0132a() {
        }

        @Override // h2.m.b
        public void a(String str) {
            C0534a.this.f8147a.setPointerIcon(C0534a.this.d(str));
        }
    }

    /* renamed from: k2.a$b */
    public class b extends HashMap {
        public b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    /* renamed from: k2.a$c */
    public interface c {
        PointerIcon c(int i3);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public C0534a(c cVar, m mVar) {
        this.f8147a = cVar;
        this.f8148b = mVar;
        mVar.b(new C0132a());
    }

    public void c() {
        this.f8148b.b(null);
    }

    public final PointerIcon d(String str) {
        if (f8146c == null) {
            f8146c = new b();
        }
        return this.f8147a.c(((Integer) f8146c.getOrDefault(str, 1000)).intValue());
    }
}

package X;

import C2.k;
import androidx.datastore.preferences.protobuf.C0335v;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2355a = new a(null);

    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public final f a(InputStream inputStream) {
            k.e(inputStream, "input");
            try {
                f O3 = f.O(inputStream);
                k.d(O3, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return O3;
            } catch (C0335v e3) {
                throw new V.a("Unable to parse preferences proto.", e3);
            }
        }

        public a() {
        }
    }
}

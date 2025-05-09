package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class d0 {

    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0320f f3624a;

        public a(AbstractC0320f abstractC0320f) {
            this.f3624a = abstractC0320f;
        }

        @Override // androidx.datastore.preferences.protobuf.d0.b
        public byte a(int i3) {
            return this.f3624a.j(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.d0.b
        public int size() {
            return this.f3624a.size();
        }
    }

    public interface b {
        byte a(int i3);

        int size();
    }

    public static String a(AbstractC0320f abstractC0320f) {
        return b(new a(abstractC0320f));
    }

    public static String b(b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i3 = 0; i3 < bVar.size(); i3++) {
            byte a3 = bVar.a(i3);
            if (a3 == 34) {
                sb.append("\\\"");
            } else if (a3 == 39) {
                sb.append("\\'");
            } else if (a3 != 92) {
                switch (a3) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a3 < 32 || a3 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a3 >>> 6) & 3) + 48));
                            sb.append((char) (((a3 >>> 3) & 7) + 48));
                            sb.append((char) ((a3 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a3);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String c(String str) {
        return a(AbstractC0320f.o(str));
    }
}

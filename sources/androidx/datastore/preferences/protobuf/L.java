package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes.dex */
public abstract class L {
    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static boolean b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? ((Float) obj).floatValue() == 0.0f : obj instanceof Double ? ((Double) obj).doubleValue() == 0.0d : obj instanceof String ? obj.equals("") : obj instanceof AbstractC0320f ? obj.equals(AbstractC0320f.f3626f) : obj instanceof J ? obj == ((J) obj).c() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    public static final void c(StringBuilder sb, int i3, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(d0.c((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0320f) {
            sb.append(": \"");
            sb.append(d0.a((AbstractC0320f) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0333t) {
            sb.append(" {");
            d((AbstractC0333t) obj, sb, i3 + 2);
            sb.append("\n");
            while (i4 < i3) {
                sb.append(' ');
                i4++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i6 = i3 + 2;
        c(sb, i6, "key", entry.getKey());
        c(sb, i6, "value", entry.getValue());
        sb.append("\n");
        while (i4 < i3) {
            sb.append(' ');
            i4++;
        }
        sb.append("}");
    }

    public static void d(J j3, StringBuilder sb, int i3) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : j3.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String replaceFirst = str.replaceFirst("get", "");
            boolean z3 = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i3, a(str2), AbstractC0333t.w(method2, j3, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i3, a(str3), AbstractC0333t.w(method3, j3, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + replaceFirst)) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get" + replaceFirst);
                Method method5 = (Method) hashMap.get("has" + replaceFirst);
                if (method4 != null) {
                    Object w3 = AbstractC0333t.w(method4, j3, new Object[0]);
                    if (method5 != null) {
                        z3 = ((Boolean) AbstractC0333t.w(method5, j3, new Object[0])).booleanValue();
                    } else if (b(w3)) {
                        z3 = false;
                    }
                    if (z3) {
                        c(sb, i3, a(str4), w3);
                    }
                }
            }
        }
        g0 g0Var = ((AbstractC0333t) j3).unknownFields;
        if (g0Var != null) {
            g0Var.m(sb, i3);
        }
    }

    public static String e(J j3, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(j3, sb, 0);
        return sb.toString();
    }
}

package H;

import H.g;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator f601a = new Comparator() { // from class: H.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.a((byte[]) obj, (byte[]) obj2);
        }
    };

    public interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f602a;

        public b(Context context, Uri uri) {
            this.f602a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // H.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f602a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e3) {
                Log.w("FontsProvider", "Unable to query the content provider", e3);
                return null;
            }
        }

        @Override // H.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f602a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b3 = bArr[i3];
            byte b4 = bArr2[i3];
            if (b3 != b4) {
                return b3 - b4;
            }
        }
        return 0;
    }

    public static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!Arrays.equals((byte[]) list.get(i3), (byte[]) list2.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static List d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : B.d.c(resources, eVar.c());
    }

    public static g.a e(Context context, e eVar, CancellationSignal cancellationSignal) {
        ProviderInfo f3 = f(context.getPackageManager(), eVar, context.getResources());
        return f3 == null ? g.a.a(1, null) : g.a.a(0, g(context, eVar, f3.authority, cancellationSignal));
    }

    public static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        String e3 = eVar.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e3, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e3);
        }
        if (!resolveContentProvider.packageName.equals(eVar.f())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + e3 + ", but package was not " + eVar.f());
        }
        List b3 = b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
        Collections.sort(b3, f601a);
        List d3 = d(eVar, resources);
        for (int i3 = 0; i3 < d3.size(); i3++) {
            ArrayList arrayList = new ArrayList((Collection) d3.get(i3));
            Collections.sort(arrayList, f601a);
            if (c(b3, arrayList)) {
                return resolveContentProvider;
            }
        }
        return null;
    }

    public static g.b[] g(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        a aVar;
        a aVar2;
        Uri withAppendedId;
        boolean z3;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        a a3 = a.a(context, build);
        Cursor cursor = null;
        try {
            cursor = a3.b(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
            if (cursor == null || cursor.getCount() <= 0) {
                aVar2 = a3;
            } else {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i3 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i4 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        aVar = a3;
                        try {
                            withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                        } catch (Throwable th) {
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            aVar.close();
                            throw th;
                        }
                    } else {
                        aVar = a3;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i5 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 != -1) {
                        z3 = true;
                        if (cursor.getInt(columnIndex6) == 1) {
                            arrayList2.add(g.b.a(withAppendedId, i4, i5, z3, i3));
                            a3 = aVar;
                        }
                    }
                    z3 = false;
                    arrayList2.add(g.b.a(withAppendedId, i4, i5, z3, i3));
                    a3 = aVar;
                }
                aVar2 = a3;
                arrayList = arrayList2;
            }
            if (cursor != null) {
                cursor.close();
            }
            aVar2.close();
            return (g.b[]) arrayList.toArray(new g.b[0]);
        } catch (Throwable th2) {
            th = th2;
            aVar = a3;
        }
    }
}

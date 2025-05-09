package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0337x implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public Iterator f3867e;

    public C0337x(Iterator it) {
        this.f3867e = it;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f3867e.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3867e.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f3867e.remove();
    }
}
